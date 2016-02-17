package ch1;
import java.io.IOException;

public class ex16 extends Exception{
	public static String DataSetName;
	public static String ExceptionName;
	
	public static void main(String[] args) {
		ex16 BadDataSetException = new ex16();
		try {
			BadDataSetException.getDataSet("TestDataSet");
		} catch (ex16 e) {
			System.out.println("��O��: " + ExceptionName);
			System.out.println("��O���N�����f�[�^�Z�b�g��: " + DataSetName);
		}
	}
	
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