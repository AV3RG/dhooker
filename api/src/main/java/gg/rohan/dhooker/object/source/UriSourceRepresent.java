package gg.rohan.dhooker.object.source;

public class UriSourceRepresent implements SourceRepresent {

    private final String uri;

    public UriSourceRepresent(final String uri) {
        this.uri = uri;
    }

    @Override
    public String representedValue() {
        return this.uri;
    }

}
