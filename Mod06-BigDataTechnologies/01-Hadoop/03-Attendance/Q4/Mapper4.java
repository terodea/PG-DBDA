package q4;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;

public class Mapper4  extends Mapper<LongWritable, Text, Text, Text>
{
	protected void map(LongWritable key, Text value,Context context)
			throws IOException, InterruptedException {
		String school="";
		float percentage=0;
		int register=0;
		try {
			if(key.get() == 0 && value.toString().contains("DATE"))
				return;
			else {
				
				 school=value.toString().split(",")[2];
				 register=Integer.parseInt(value.toString().split(",")[3]);
				 percentage=Float.parseFloat(value.toString().split(",")[4]);
				 float numerator=register*percentage;
				 
				
				context.write(new Text(school),new Text(numerator+"->"+register));
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}