package com.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Main {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();
        page.navigate("https://www.cpbl.com.tw");
        page.waitForSelector(".tab_container");
        String gameNo = page.locator(".IndexScheduleList.major .tag.game_no a").first().innerText();
        System.out.println(gameNo);
    }
}