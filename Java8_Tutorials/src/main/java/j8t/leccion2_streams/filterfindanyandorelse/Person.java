package j8t.leccion2_streams.filterfindanyandorelse;


/**
 * The Class Person.
 */
public class Person {

	/** The name. */
    public String name;

	/** The age. */
    public int age;

    /**
     * Instantiates a new person.
     */
    public Person() {}

    /**
     * Instantiates a new person.
     *
     * @param name the name
     */
    public Person(String name) {
        this.name = name;
    }
    
    /**
     * Instantiates a new person.
     *
     * @param name the name
     * @param age the age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
    /**
     * Gets the age.
     *
     * @return the age
     */
    public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Person[name=%s, age=%s]",
                name, age);
    }

}