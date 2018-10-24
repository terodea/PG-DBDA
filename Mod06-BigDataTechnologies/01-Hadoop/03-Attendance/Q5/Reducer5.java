package q5;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Reducer5 extends Reducer<Text, IntWritable, Text, IntWritable>{	
	protected void reduce(Text key,Iterable <IntWritable> value,Context ctx) throws IOException, InterruptedException{
		int sum=0;
		for(IntWritable x:value){
			 sum+=x.get();
		}
		ctx.write(key,new IntWritable(sum));
	}
}