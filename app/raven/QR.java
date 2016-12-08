package raven;

import java.io.ByteArrayOutputStream;
import net.glxn.qrgen.javase.QRCode;

public class QR {

	
	public static ByteArrayOutputStream generateQRCode (String text) {
		return QRCode.from(text).withSize(300, 300).stream();
	}

	public static ByteArrayOutputStream generateQRCode (String text, int w, int h) {
		return QRCode.from(text).withSize(w, h).stream();
	}
}
