package util;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/*public class Reduce extends Reducer<Text , DoubleWritable, Text, DoubleWritable>
{
	
	public void reduce(Text key,Iterable<FloatWritable> value,Context ctx) throws IOException,InterruptedException
	{
		Double max=0.0;
		for(FloatWritable v:value)
		{
			max=Math.max(max, v.get());
		}
		ctx.write(key, new DoubleWritable(max));
		
			
		
	}

}
*/

	public class Reduce extends Reducer<Text,IntWritable,Text,IntWritable>
	{
		private int Max_temp = Integer.MIN_VALUE;
		private int temp = 0;
		
		protected void Reduce(Text key,Iterable<IntWritable>values,Context ctx) throws IOException,InterruptedException
		{
			Iterator<IntWritable> itr = values.iterator();
			while(itr.hasNext())
			{
				temp = itr.next().get();
				if(temp>Max_temp)
				{
					Max_temp = temp;
					
				}
			}
			ctx.write(key, new IntWritable(Max_temp));
		}
	}