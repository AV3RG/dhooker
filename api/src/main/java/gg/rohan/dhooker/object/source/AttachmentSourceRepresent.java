package gg.rohan.dhooker.object.source;

public class AttachmentSourceRepresent implements SourceRepresent {

    private static final String ATTACHMENT_STRING_FORMAT = "attachment://%1$s";

    private final String fileName;

    public AttachmentSourceRepresent(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String representedValue() {
        return String.format(ATTACHMENT_STRING_FORMAT, this.fileName);
    }

    public String getFileName() {
        return this.fileName;
    }

}