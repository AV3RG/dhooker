package gg.rohan.dhooker.client;

public interface HttpClientCreator<T extends HttpClient> {

    T createForWebhook(Webhook webhook);

}
