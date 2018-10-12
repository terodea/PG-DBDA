package util;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
	
	public void reduce(Text key,Iterable<IntWritable> values, Context ctx) throws IOException, InterruptedException {
		int count =0;
		for(IntWritable v : values) {
			count++;
		}
		ctx.write(key, new IntWritable(count));
	}
	
}