package javasmmr.zoowsome.services.factories;

public class AnimalFactory {
	public SpeciesFactory getSpeciesFactory(String type) throws Exception {
		if (Constants.Species.Mammal.equals(type)) {
			return new MammalFactory();
		} else if (Constants.Species.Reptile.equals(type)) {
			return new ReptileFactory();
		} else if (Constants.Species.Bird.equals(type)) {
			return new BirdFactory();
		} else if (Constants.Species.Insect.equals(type)) {
			return new InsectFactory();
		} else if (Constants.Species.Aquatic.equals(type)) {
			return new AquaticFactory();
		} else {
			throw new Exception("Invalid species exception");
		}
	}

	public static String[] names = { "Sung", "Edison", "Eldridge", "Winfred", "Ethan", "Marcus", "Jon", "Eric", "Kory",
			"Arden", "Hobert", "Greg", "Elmo", "Michael", "Edmond", "Jarvis", "Toby", "Lawrence", "Todd", "Brenton",
			"Cyrus", "Derrick", "Duane", "Jonas", "Porter", "Virgil", "Alfred", "Del", "Anthony", "Dillon", "Carroll",
			"Dante", "Arturo", "Kirk", "Fredric", "Walton", "Mark", "Abdul", "Truman", "Noe", "Morgan", "Elmer", "Ira",
			"Sol", "Andrea", "Julio", "Craig", "William", "Delmar", "Demetrius", "Natashia", "Cyndi", "Wei", "Evita",
			"Annabel", "Maryanne", "Nelle", "Deja", "Amelia", "Juana", "Elke", "Haydee", "Candida", "Sherise",
			"Anastacia", "Maranda", "Holly", "Sachiko", "Nelly", "Maryln", "Verlene", "Kimberely", "Tiffiny", "Stefany",
			"Kori", "Floria", "Alpha", "Lilia", "Lauri", "Katelyn", "Veda", "Minda", "Karry", "Dannette", "Virgen",
			"Heike", "Arlette", "Hilaria", "Hassie", "Goldie", "Ocie", "Noriko", "Martina", "Chana", "Gertude",
			"Jesica", "Marchelle", "Kiara", "Monserrate", "Beatris"

	};
}
