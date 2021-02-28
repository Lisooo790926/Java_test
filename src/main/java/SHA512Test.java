import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA512Test {

    public static String getSHA512(String input, String salt) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        // Digest 意思就是"消化", "削減", 將原本的 plain text 轉化為 cipher text
        // 此處選擇 SHA-512
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        // 使用 getByte 將原文字 轉成 UTF_16
        byte[] inputBytes = input.getBytes(StandardCharsets.UTF_16LE);
        // 此處邏輯將 parseHex (鹽 + 轉16進位的inputByte)  --> 最後SHA-512
        byte[] bytes = DatatypeConverter.parseHexBinary(salt + DatatypeConverter.printHexBinary(inputBytes));
        byte[] digest = md.digest(bytes);

        // 回傳 salt + SHA-512結果
        return salt + String.format("%0128x", new BigInteger(1, digest));
    }

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        System.out.println(getSHA512("hello world", "AAAA"));
    }
}
