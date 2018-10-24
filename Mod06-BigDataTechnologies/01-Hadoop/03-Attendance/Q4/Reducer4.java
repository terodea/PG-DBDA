package q4;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class Reducer4 extends Reducer<Text,Text,Text, FloatWritable>{
	public void reduce(Text key, Iterable<Text> inputValues,Context ctx) throws IOException, InterruptedException{
		float sum=0;
		float denominator=0,num=0;
		int i=0;
		for(Text x:inputValues){
			 denominator+=Float.parseFloat(x.toString().split("->")[1]);
			 num=Float.parseFloat(x.toString().split("->")[0]);
		}
		sum=num/denominator;
		ctx.write(new Text(key),new FloatWritable(sum));
	}
}