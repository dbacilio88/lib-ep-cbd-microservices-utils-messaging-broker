package ep.mil.microservices.components.helpers;

import lombok.extern.log4j.Log4j2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@Log4j2
public class Serializer {

    public static byte[] objectToBytes(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        byte[] bytes = {48};
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            bytes = byteArrayOutputStream.toByteArray();
            return bytes;
        } catch (IOException e) {
            log.error("error in process objectToBytes, IOException error: {}", e.getMessage());
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException ex) {
                log.error("error in process objectToBytes, IOException error: {}", ex.getMessage());
            }
        }
        return bytes;
    }
}
