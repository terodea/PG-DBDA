package util;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AttendReduce extends Reducer<Text, FloatWritable, Text, FloatWritable> {

	@Override
	protected void reduce(Text key, Iterable<FloatWritable> inputValues,
			Reducer<Text, FloatWritable, Text, FloatWritable>.Context ctx) throws IOException, InterruptedException {
		float max = 0;
		for(FloatWritable value : inputValues) {
			if(value.get()>max) {
				max=value.get();
			}
		}
		ctx.write(new Text(key), new FloatWritable(max));
	}
}