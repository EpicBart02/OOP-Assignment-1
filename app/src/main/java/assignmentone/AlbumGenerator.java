package assignmentone;

public class AlbumGenerator {
     
   public Album[] generateAlbums(){
    Album[] items = new Album[4];
    Album first = new Album("Dark side of the moon", 1973, "Pink floyd");
    Album second = new Album("Wish you were here", 1975, "Pink floyd");
    Album third = new Album("Animals", 1977, "Pink floyd");
    Album fourth = new Album("The wall", 1979, "Pink floyd");

    items[0] = first;
    items[1] = second;
    items[2] = third;
    items[3] = fourth;

    return items;
   } 

}
