import java.util.HashMap;
public class TrackListTest {
    public static void main(String[] args) {
    
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("The ABC Song", "You don’t just say your ABCs. You sing them.");
        trackList.put("Here Comes the Sun", "Here comes the sun do, do, do\nHere comes the sun\nAnd I say it's all right");
        trackList.put("Baby Beluga", "Baby beluga in the deep blue sea \nSwim so wild and you swim so free");
        trackList.put("This Land Is Your Land", "This land is your land and this land is my land \nFrom California to the New York island");
        System.out.println(trackList.get("Baby Beluga"));
        for(String track: trackList.keySet()) {
            System.out.println(track +": "+ trackList.get(track));
        }
    }
}