package util;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class WordMapper extends Mapper <Text, Text, Text, IntWritable>{
	public void map(Text key,Text value,Context ctx) throws IOException,IOException, InterruptedException{
		StringTokenizer tokens=new StringTokenizer(value.toString());
		while(tokens.hasMoreTokens()){
			ctx.write(new Text(tokens.nextToken()),new IntWritable(1));
		}
	}
}