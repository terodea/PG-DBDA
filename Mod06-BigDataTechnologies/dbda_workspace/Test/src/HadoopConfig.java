import org.apache.hadoop.fs.FileSystem;

public class HadoopConfig {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		FileSystem hdfs=FileSystem.get(conf);
		Path hdfsPath = hdfs.getWorkingDirectory();
		hdfs.delete(new Path(hdfsPath,new path("output")),true);

	}

}
