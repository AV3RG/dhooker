package gg.rohan.dhooker.object.poll;

import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public class Poll {

    private final PollMedia question;
    private final List<PollAnswer> pollAnswers;
    private final Integer hoursOpen;
    private final TriState allowMultiSelect;
    private final PollLayoutType layoutType;

    public Poll(PollMedia question, List<PollAnswer> pollAnswers, int hoursOpen, TriState allowMultiSelect, PollLayoutType layoutType) {
        this.question = question;
        this.pollAnswers = pollAnswers;
        this.hoursOpen = hoursOpen;
        this.allowMultiSelect = allowMultiSelect;
        this.layoutType = layoutType;
    }

    public PollMedia getQuestion() {
        return this.question;
    }

    public List<PollAnswer> getPollAnswers() {
        return this.pollAnswers;
    }

    public Integer getHoursOpen() {
        return this.hoursOpen;
    }

    public TriState getAllowMultiSelect() {
        return this.allowMultiSelect;
    }

    public PollLayoutType getLayoutType() {
        return this.layoutType;
    }

}
