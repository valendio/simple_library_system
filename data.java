package library;
import java.util.List;

public class data {
    public void libinfo(){
        Iterable<String> libdisplayinfo = List.of("===Personal info===", "Name : mike wazowski",
                "Addres : Pluto", "Phone : 08888888888");
        for (var libdisplay : libdisplayinfo) {
            System.out.println(libdisplay);
        }   }
    public void stdinfo(){
        Iterable<String> stddisplayinfo = List.of("\n===Personal info===\n", "Name : Oryza Valendio",
                "Addres : kediri", "Phone : 082131891268");
        for (var stddisplay : stddisplayinfo) {
            System.out.println(stddisplay);
        }   }   }
