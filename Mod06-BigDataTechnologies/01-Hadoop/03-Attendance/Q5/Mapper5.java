package q5;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mapper5 extends Mapper<LongWritable, Text, Text, IntWritable>{
	protected void map(LongWritable key,Text value,Context ctx) throws IOException, InterruptedException{
		if(!value.toString().contains("SCHOOL_YEAR")) {
			try {
                    String[] str=value.toString().split(",");
                    String year=str[0];
                    int noOfStudents=(int)(Float.parseFloat(str[4])*Integer.parseInt(str[3]));
                    String school=str[2];
                    ctx.write(new Text(school+" : "+year), new IntWritable(noOfStudents));
                    }
			catch(Exception e){
                e.printStackTrace();
                }
        }
    }
}