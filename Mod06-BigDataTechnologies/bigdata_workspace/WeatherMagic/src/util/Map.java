package util;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map extends Mapper<LongWritable, Text,Text,DoubleWritable> 
{
	public void map(LongWritable key,Text value,Context cx)throws IOException,InterruptedException
	{
		String line=value.toString();
		StringTokenizer tokens=new StringTokenizer(line, ",");
		String year=null;
		int tokenCount=0;
		Double temp=0.0;
		while(tokens.hasMoreTokens()){
			tokenCount++;
			String tokenValue=tokens.nextToken();
			if(tokenCount==3){
				String tokenValue3=tokenValue.substring(0, 4);
				year=tokenValue3;
				}
			if(tokenCount==12){
				if(tokenValue.contains("*")){
					String tokenValue1=tokenValue.substring(0, 3);
					temp=Double.parseDouble(tokenValue1);
					}
				else{
					String tokenValue2=tokenValue.substring(0, 2);
					temp=Double.parseDouble(tokenValue2);
					}
			}
		}
		cx.write(new Text(year), new DoubleWritable(temp));	
	}
}