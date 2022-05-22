package website_homework.functional_programming;
/*
listę wszystkich epizodów
listę wszystkich filmów
listę wszystkich nazw sezonów
listę wszystkich numerów sezonów
listę wszystkich nazw epizodów
listę wszystkich numerów epizodów
listę wszystkich nazw video
listę wszystkich adresów url dla każdego video
tylko epizody z parzystych sezonów
tylko video z parzystych sezonów
tylko video z parzystych epizodów i sezonów
tylko video typu Clip z parzystych epizodów i nieparzystych sezonów
tylko video typu Preview z nieparzystych epizodów i parzystych sezonów
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class VideoTestMain {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {

        Video video1 = new Video("Seinfeld1", "www.seinfeld1.com", VideoType.CLIP);
        Video video2 = new Video("Seinfeld2", "www.seinfeld2.com", VideoType.EPISODE);
        Video video3 = new Video("Seinfeld3", "www.seinfeld3.com", VideoType.PREVIEW);
        Video video4 = new Video("Seinfeld4", "www.seinfeld4.com", VideoType.EPISODE);
        Video video5 = new Video("Seinfeld5", "www.seinfeld5.com", VideoType.PREVIEW);
        Video video6 = new Video("Seinfeld6", "www.seinfeld6.com", VideoType.EPISODE);
        Video video7 = new Video("Seinfeld7", "www.seinfeld7.com", VideoType.CLIP);
        Video video8 = new Video("Seinfeld8", "www.seinfeld8.com", VideoType.CLIP);
        Video video9 = new Video("Seinfeld9", "www.seinfeld9.com", VideoType.EPISODE);

        Episode episode1 = new Episode("episode1", 1, Arrays.asList(video1, video2));
        Episode episode2 = new Episode("episode2", 2, Arrays.asList(video3, video4, video5));
        Episode episode3 = new Episode("episode3", 3, Arrays.asList(video6, video7));
        Episode episode4 = new Episode("episode4", 4, Arrays.asList(video8, video9));

        Season season1 = new Season("season1", 1, Arrays.asList(episode1, episode2));
        Season season2 = new Season("season2", 2, Arrays.asList(episode3));
        Season season3 = new Season("season3", 3, Arrays.asList(episode4));

       // List<Episode> episodeList = Arrays.asList(episode1, episode2, episode3, episode4);
        List<Season> seasonList = Arrays.asList(season1, season2, season3);
        System.out.println("EPISODES");
        seasonList.stream()
                .flatMap(season -> season.episodes.stream())
                .forEach(episode -> System.out.println(episode.toString()));
        System.out.println("VIDEOS");
        seasonList.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .forEach(video -> System.out.println(video.toString()));






    }
}
