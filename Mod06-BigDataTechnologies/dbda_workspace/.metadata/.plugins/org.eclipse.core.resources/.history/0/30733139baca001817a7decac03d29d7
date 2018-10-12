import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HadoopConfig {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		FileSystem hdfs=FileSystem.get(conf);
		Path hdfsPath = hdfs.getWorkingDirectory();
		//Path rootPath=new Path("/output");
		hdfs.mkdirs(new Path("/testfold"));
		System.out.println(hdfsPath.toString());
	}
}