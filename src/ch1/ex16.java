package ch1;
import java.io.IOException;

/**
 * 問題を通知しているデータの集まりとI/O例外を保持する
 * @author Yuuki
 *
 */
public class ex16 extends Exception{
	public static String DataSetName;
	public static String ExceptionName;
	
	/**
	 * 例外名と、例外が発生したデータセット名を表示
	 * @param args
	 */
	public static void main(String[] args) {
		ex16 BadDataSetException = new ex16();
		try {
			BadDataSetException.getDataSet("TestDataSet");
		} catch (ex16 e) {
			System.out.println("例外名: " + ExceptionName);
			System.out.println("例外が起きたデータセット名: " + DataSetName);
		}
	}
	
	/**
	 * データセットの取得
	 * @param setName
	 * @return
	 * @throws ex16
	 */
	public double [] getDataSet(String setName) throws ex16 {
		ex16 BadDataSetException = new ex16();
		String file = setName + ".dset";
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			return readDataSet(in);
		} catch (IOException e) {
			BadDataSetException.DataSetName = file;
			BadDataSetException.ExceptionName = e.toString();
			throw BadDataSetException;
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				;
			}
		}
	}

	/**
	 * 今回は、IOExceptionを発生させる部分のみ実装
	 * @param in
	 * @return
	 * @throws IOException
	 */
	private double[] readDataSet(FileInputStream in) throws IOException {
		throw new IOException();
	}
}

class FileInputStream {
	public FileInputStream(String file) {
	}
	public void close() throws IOException {
	}	
}