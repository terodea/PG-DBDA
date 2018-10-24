package apps;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map extends Mapper<LongWritable, Text, Text, LongWritable> {
	public void map(LongWritable key , Text values, Context ctx) throws IOException, InterruptedException{
		try{
			if(key.get()==0 && values.toString().contains("header")){
				return;
		}else{
			String[] t = values.toString().split(",");
			int stat = t.length-3;
			int job = t.length-8;
			int sal = t.length-6;
			int salary=0;
			String state = t[stat].trim();
			String job_title = t[job].trim();
			String concat = state+"<--------->"+job_title;
			if(t[sal]=="NA"){
				salary=0;
			}
			else {
				salary =Integer.parseInt(t[sal]);
			}
			ctx.write(new Text(concat), new LongWritable(salary));
			}
		}catch(Exception e){
			e.printStackTrace();
			}
		}
}