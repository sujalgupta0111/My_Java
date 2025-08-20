package Serealization.customize_serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Accounts implements Serializable{
	private String id;
	private transient String pass;

	public String getId() {
		return id;
	}

	public Accounts setId(String id) {
		this.id = id;
		return this;
	}

	public String getPass() {
		return pass;
	}

	public Accounts setPass(String pass) {
		this.pass = pass;
		return this;
	}

//yhea override kiya hai yaha method ObjectOutputtream ka Jisse yahan customize dala ja sake 
	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();// esi object ki by default serealization ki jati hai
		String enryptpass = "Sujal" + pass;
		os.writeObject(enryptpass);// essa manually add kiya hai encrypted to avoid trainsient data loss
		// yhea oo stream ka method yha jise humne call kiya taki hum
	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();// esa Object ki default deserialization ke liye use karte hai
		String enryptpass = (String) is.readObject();// esa encrypted pass nikala gyaa
		pass = enryptpass.substring(5);// yaha decrypted kaar diya gaya
	}
	/*
	 * Notes jis order me hum variable save karayenge outputstream me usi order me
	 * hum nikalenege inputstream me se
	 */

	@Override
	public String toString() {
		return "Accounts [id=" + id + ", pass=" + pass + "]";
	}

}
