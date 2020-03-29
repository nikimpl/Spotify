import java.io.Serializable;
import java.security.NoSuchAlgorithmException;

public interface Publisher extends Node, Serializable {

    public abstract Broker hashTopic(ArtistName artist) throws NoSuchAlgorithmException;

    public abstract void push(ArtistName artist,Value val);

    public abstract void notifyFailure(Broker broker);
}