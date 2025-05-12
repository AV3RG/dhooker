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

    public static PartialAttachment partialAttachment(File file) {
        return partialAttachment(file, file.getName(), null);
    }

    public static PartialAttachment partialAttachment(File file, String fileName) {
        return partialAttachment(file, fileName, null);
    }

    public static PartialAttachment partialAttachment(File file, String fileName, String description) {
        if (!file.exists()) {
            throw new IllegalArgumentException("File does not exist");
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException("File is not a file");
        }
        if (!file.canRead()) {
            throw new IllegalArgumentException("File is not readable");
        }
        try {
            byte[] fileContents = java.nio.file.Files.readAllBytes(file.toPath());
            return new PartialAttachment(new AttachmentSourceRepresent(fileName), description, fileContents);
        } catch (java.io.IOException e) {
            throw new RuntimeException("Failed to read file", e);
        }
    }

    public static PartialAttachment partialAttachment(byte[] fileContents, String fileName, String description) {
        return new PartialAttachment(new AttachmentSourceRepresent(fileName), description, fileContents);
    }
    
}
