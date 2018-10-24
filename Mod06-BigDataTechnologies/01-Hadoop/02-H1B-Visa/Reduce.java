package apps;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Reduce extends Reducer<Text, LongWritable, Text, FloatWritable> {
	public void reduce(Text key, Iterable<LongWritable> value, Context ctx) throws IOException, InterruptedException{
		int count=0;
		float sum= 0.0f;
		for(LongWritable v: value){
			sum=Math.addExact((long) sum, v.get());
			count+=1;
		}
		sum=sum/count;
		ctx.write(new Text(key),new FloatWritable(sum));
		}
}