public class Number5 {
    public int numberOfGloves(int peopleOfPlanetU101InARoom) {

        if (peopleOfPlanetU101InARoom <= 0) {
            return 0;

        } else {
            return 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);

        }
    }

}