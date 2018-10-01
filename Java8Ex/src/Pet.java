import java.util.Date;

public class Pet {
    public static class Builder {

        private String petName;
        private String ownerName;
        private String address;


        public Builder withPetName(final String petName) {
            this.petName = petName;
            return this;
        }

        public Builder withOwnName(final String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder withAddress(final String address) {
            this.address = address;
            return this;
        }

        public Pet build() {
            if(petName==null || ownerName==null || address==null ) {
                throw new IllegalStateException("Cannot crate pet");
            }
            return new Pet(petName,ownerName,address);
        }
    }

    private final String petName;
    private final String ownerName;
    private final String address;
    private Pet(final String petName,final String ownerName, final String address) {
        this.petName=petName;
        this.ownerName=ownerName;
        this.address=address;
    }

    public static void main(String[] args) {
        Pet.Builder builder = new Builder();
        Pet pet = builder.withPetName("didi").withAddress("seoul").withOwnName("dd").build();
        System.out.println(pet.address);
    }

}
