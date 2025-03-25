package gg.rohan.dhooker.object.attachment;

import gg.rohan.dhooker.object.source.AttachmentSourceRepresent;

import java.io.File;

public class PartialAttachment {

    private final AttachmentSourceRepresent sourceRepresent;
    private final String description;
    private final byte[] fileContents;

    public PartialAttachment(AttachmentSourceRepresent sourceRepresent, String description, byte[] fileContents) {
        this.sourceRepresent = sourceRepresent;
        this.description = description;
        this.fileContents = fileContents;
    }

    public AttachmentSourceRepresent getSourceRepresent() {
        return this.sourceRepresent;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getFileContents() {
        return this.fileContents;
    }

}
