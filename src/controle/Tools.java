/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author MARCOANTONIO
 */
public class Tools {

    SecretKey chave;

    public Tools() {

    }

    private static SecretKey skey;
    private static KeySpec ks;
    private static PBEParameterSpec ps;
    private static final String algorithm = "PBEWithMD5AndDES";
    private static final BASE64Encoder enc = new BASE64Encoder();
    private static final BASE64Decoder dec = new BASE64Decoder();

    static {
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance(algorithm);
            ps = new PBEParameterSpec(new byte[]{3, 1, 4, 1, 5, 9, 2, 6}, 20);
            ks = new PBEKeySpec("EAlGeEen3/m8/YkO".toCharArray());   
            skey = skf.generateSecret(ks);
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException ex) {
            ex.printStackTrace();
        }
    }

    public String encripta(final String text)
            throws
            BadPaddingException,
            NoSuchPaddingException,
            IllegalBlockSizeException,
            InvalidKeyException,
            NoSuchAlgorithmException,
            InvalidAlgorithmParameterException {

        final Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, skey, ps);
        return enc.encode(cipher.doFinal(text.getBytes()));
    }

    public String decripta(final String text)
            throws
            BadPaddingException,
            NoSuchPaddingException,
            IllegalBlockSizeException,
            InvalidKeyException,
            NoSuchAlgorithmException,
            InvalidAlgorithmParameterException {

        final Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, skey, ps);
        String ret = null;
        try {
            ret = new String(cipher.doFinal(dec.decodeBuffer(text)));
        } catch (IOException | BadPaddingException | IllegalBlockSizeException ex) {
        }
        return ret;
    }

    public String retiraMascara(String s) {
        return s.replaceAll("[)(./-]", "").trim();
    }

}
