package telegramBot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Location;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyBot extends TelegramLongPollingBot{


    @Override
    public String getBotUsername() {
        return "fumCE99bot";
    }

    @Override
    public String getBotToken() {
        return "1771941370:AAGgEz41s6t5JSIo2vAOA4VOYzBzoGmFAA4";
    }

    @Override
    public void onUpdateReceived(Update update) {
        long chatId = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        Location location = update.getMessage().getLocation();
        SendMessage sm = new SendMessage().setChatId(chatId).setText("hi,"+chatId);
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
