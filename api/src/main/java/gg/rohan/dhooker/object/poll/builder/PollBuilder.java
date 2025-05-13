package gg.rohan.dhooker.object.poll.builder;

import gg.rohan.dhooker.object.builder.AbstractBuilder;
import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.poll.Poll;
import gg.rohan.dhooker.object.poll.PollAnswer;
import gg.rohan.dhooker.object.poll.PollLayoutType;
import gg.rohan.dhooker.object.poll.PollMedia;
import gg.rohan.dhooker.object.util.TriState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PollBuilder implements AbstractBuilder<PollBuilder, Poll> {

    private PollMedia question;
    private List<PollAnswer> pollAnswers;
    private Integer hoursOpen;
    private TriState allowMultiSelect;
    private PollLayoutType layoutType;

    public PollBuilder() {}

    public PollBuilder setQuestion(PollMedia question) {
        this.question = question;
        return this;
    }

    public PollBuilder setQuestion(String question) {
        this.question = PollMedia.pollMedia(question);
        return this;
    }

    public PollBuilder setQuestion(String question, PartialEmoji emoji) {
        this.question = PollMedia.pollMedia(question, emoji);
        return this;
    }

    public PollBuilder addPollAnswers(List<PollAnswer> pollAnswers) {
        if (this.pollAnswers == null) {
            this.pollAnswers = new ArrayList<>(pollAnswers);
        } else {
            this.pollAnswers.addAll(pollAnswers);
        }
        return this;
    }

    public PollBuilder addPollAnswers(PollAnswer... pollAnswers) {
        return this.addPollAnswers(Arrays.asList(pollAnswers));
    }

    public PollBuilder addPollAnswersMedia(List<PollMedia> pollAnswers) {
        if (this.pollAnswers == null) {
            this.pollAnswers = new ArrayList<>();
        }
        for (PollMedia pollAnswer : pollAnswers) {
            this.pollAnswers.add(new PollAnswer(pollAnswer));
        }
        return this;
    }

    public PollBuilder addPollAnswersMedia(PollMedia... pollAnswers) {
        return this.addPollAnswersMedia(Arrays.asList(pollAnswers));
    }

    public PollBuilder setPollAnswers(List<PollAnswer> pollAnswers) {
        this.pollAnswers = new ArrayList<>(pollAnswers);
        return this;
    }

    public PollBuilder setPollAnswers(PollAnswer... pollAnswers) {
        return this.setPollAnswers(Arrays.asList(pollAnswers));
    }

    public PollBuilder setPollAnswerMedia(List<PollMedia> pollAnswers) {
        this.pollAnswers = new ArrayList<>(pollAnswers.size());
        for (PollMedia pollAnswer : pollAnswers) {
            this.pollAnswers.add(new PollAnswer(pollAnswer));
        }
        return this;
    }

    public PollBuilder setPollAnswerMedia(PollMedia... pollAnswers) {
        return this.setPollAnswerMedia(Arrays.asList(pollAnswers));
    }

    public PollBuilder setHoursOpen(Integer hoursOpen) {
        this.hoursOpen = hoursOpen;
        return this;
    }

    public PollBuilder setAllowMultiSelect(TriState allowMultiSelect) {
        this.allowMultiSelect = allowMultiSelect;
        return this;
    }

    public PollBuilder setLayoutType(PollLayoutType layoutType) {
        this.layoutType = layoutType;
        return this;
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

    @Override
    public Poll build() {
        return new Poll(
                this.question,
                this.pollAnswers,
                this.hoursOpen,
                this.allowMultiSelect,
                this.layoutType
        );
    }

    @Override
    public PollBuilder reset() {
        this.question = null;
        this.pollAnswers = null;
        this.hoursOpen = null;
        this.allowMultiSelect = null;
        this.layoutType = null;
        return this;
    }

    @Override
    public PollBuilder from(Poll object) {
        this.question = object.getQuestion();
        this.pollAnswers = object.getPollAnswers();
        this.hoursOpen = object.getHoursOpen();
        this.allowMultiSelect = object.getAllowMultiSelect();
        this.layoutType = object.getLayoutType();
        return this;
    }
}
