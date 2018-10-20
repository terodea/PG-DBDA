package util;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class TestUDF extends UDF{
	public Text evaluate (Text data,Text data1) {
		String v1 = data.toString();
		String v2 = data1.toString();
		return new Text(v1+v2);
	}
}
