package util2;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class TestUDF extends UDF{
	public Text evaluate (Text data,String param) {
		if(data.find(param) != 0) {
			return new Text("Exists");
		}
	return new Text("Doesn't Exists");
	}
}