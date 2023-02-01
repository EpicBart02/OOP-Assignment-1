package assignmentone;

/**
* This is the solution for the Album Generator task.
*/

public class AlbumGenerator {

  /**
  * I create a new array with 4 slots, and then hard code the four albums in.
  * After that, i fill the array with the newly declared Albums.
  */

  public Album[] generateAlbums() {
    Album[] items = new Album[4];
    Album first = new Album("Dark side of the moon", 1973, "Pink floyd");
    items[0] = first;
    Album second = new Album("Wish you were here", 1975, "Pink floyd");
    items[1] = second;
    Album third = new Album("Animals", 1977, "Pink floyd");
    items[2] = third;
    Album fourth = new Album("The wall", 1979, "Pink floyd");
    items[3] = fourth;
  
    return items;
  } 

}
