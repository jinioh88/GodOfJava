public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkGenericDTO();
    }

    public void checkGenericDTO() {
        CastingDTO<String> dto1 = new CastingDTO<>();
        dto1.setObject(new String());
        CastingDTO<StringBuffer> dto2 = new CastingDTO<>();
        dto2.setObject(new StringBuffer());
    }
}
