package util;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AttendReduce extends Reducer<Text, FloatWritable, Text, DoubleWritable> {

	/*@Override
	protected void reduce(Text key, Iterable<FloatWritable> inputValues,
			Reducer<Text, FloatWritable, Text, FloatWritable>.Context context) throws IOException, InterruptedException {
		float max = 0;
		for(FloatWritable value : inputValues) {
			if(value.get()>max) {
				max=value.get();
			}
		}
		context.write(new Text(key), new FloatWritable(max));
	}*/
	private double Max_attend = Integer.MIN_VALUE;
	private double attend = 0;
	protected void reduce(Text key,Iterable<FloatWritable>values,Context ctx) throws IOException,InterruptedException
	{
		Iterator<FloatWritable> itr = values.iterator();
		while(itr.hasNext())
		{
			attend = itr.next().get();
			if(attend>Max_attend)
			{
				Max_attend = attend;
				
			}
		}
		ctx.write(new Text(key), new DoubleWritable(Max_attend));
	}
}