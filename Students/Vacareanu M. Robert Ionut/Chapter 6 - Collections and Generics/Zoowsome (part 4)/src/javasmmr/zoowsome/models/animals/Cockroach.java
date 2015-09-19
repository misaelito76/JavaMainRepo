package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect {
	private static long counter;
	private final long id = counter++;

	public Cockroach() {
		super(0.2, 0.01);
		setName("Cockroach" + id);
		setNrOfLegs(6);
		setCanFly(false);
		setIsDangerous(false);
	}

	public Cockroach(String name) {
		super(0.2, 0.01);
		setName(name);
		setNrOfLegs(6);
		setCanFly(false);
		setIsDangerous(false);
	}

	public Cockroach(int legs, Boolean fly, Boolean dangerous) {
		super(0.2, 0.01);
		setName("Cockroach" + id);
		setNrOfLegs(legs);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}
}
