package util;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AttendReduce extends Reducer<Text, FloatWritable, Text, FloatWritable> {
	@Override
	protected void reduce(Text key, Iterable<FloatWritable> arg1,
			Reducer<Text, FloatWritable, Text, FloatWritable>.Context arg2) throws IOException, InterruptedException {
		float max=0;
		for(FloatWritable value : arg1 ) {
			if(value.get()>max) {
				max=value.get();
			}
		}
		arg2.write(key, new FloatWritable(max));
	}	
}