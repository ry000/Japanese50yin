package com.example.japanese50yin;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;

import java.util.ArrayList;

import static android.media.MediaPlayer.*;

public class List {
    private ArrayList<String[]> AllList = new ArrayList<>();
    public ArrayList<MediaPlayer> mpList = new ArrayList<>();
    List(){
        AllList.add(new String[]{"あ", "ア", "a",
                "平假名 あ 由汉字 安 变体而来\n" +
                "片假名 ア 由汉字 阿 变体而来\n"}); //a
        AllList.add(new String[]{"い", "イ", "i",
                "平假名 い 由汉字 以 变体而来\n" +
                "片假名 イ 由汉字 伊 变体而来\n"}); //i
        AllList.add(new String[]{"う", "ウ", "u",
                "平假名 う 由汉字 宇 变体而来\n" +
                "片假名 ウ 由汉字 宇 变体而来\n"}); //u
        AllList.add(new String[]{"え", "エ", "e",
                "平假名 え 由汉字 衣 变体而来\n" +
                "片假名 エ 由汉字 江 变体而来\n"}); //e
        AllList.add(new String[]{"お", "オ", "o",
                "平假名 お 由汉字 於 变体而来\n" +
                "片假名 オ 由汉字 於 变体而来\n"}); //o

        AllList.add(new String[]{"か", "カ", "ka",
                "平假名 か 由汉字 加 变体而来\n" +
                "片假名 カ 由汉字 加 变体而来\n"}); //ka
        AllList.add(new String[]{"き", "キ", "ki",
                "平假名 き 由汉字 幾 变体而来\n" +
                "片假名 キ 由汉字 幾 变体而来\n"}); //ki
        AllList.add(new String[]{"く", "ク", "ku",
                "平假名 く 由汉字 久 变体而来\n" +
                "片假名 ク 由汉字 久 变体而来\n"}); //ku
        AllList.add(new String[]{"け", "ケ", "ke",
                "平假名 け 由汉字 计 变体而来\n" +
                "片假名 ケ 由汉字 介 变体而来\n"}); //ke
        AllList.add(new String[]{"こ", "コ", "ko",
                "平假名 こ 由汉字 己 变体而来\n" +
                "片假名 コ 由汉字 己 变体而来\n"}); //ko

        AllList.add(new String[]{"さ", "サ", "sa",
                "平假名 さ 由汉字 左 变体而来\n" +
                "片假名 サ 由汉字 散 变体而来\n"}); //sa
        AllList.add(new String[]{"し", "シ", "shi",
                "平假名 し 由汉字 之 变体而来\n" +
                "片假名 シ 由汉字 江 变体而来\n"}); //shi
        AllList.add(new String[]{"す", "ス", "su",
                "平假名 す 由汉字 寸 变体而来\n" +
                "片假名 ス 由汉字 须 变体而来\n"}); //su
        AllList.add(new String[]{"せ", "セ", "se",
                "平假名 せ 由汉字 世 变体而来\n" +
                "片假名 セ 由汉字 世 变体而来\n"}); //se
        AllList.add(new String[]{"そ", "ソ", "so",
                "平假名 そ 由汉字 曾 变体而来\n" +
                "片假名 ソ 由汉字 曾 变体而来\n"}); //so

        AllList.add(new String[]{"た", "タ", "ta",
                "平假名 た 由汉字 太 变体而来\n" +
                "片假名 タ 由汉字 多 变体而来\n"}); //ta
        AllList.add(new String[]{"ち", "チ", "chi",
                "平假名 ち 由汉字 知 变体而来\n" +
                "片假名 チ 由汉字 千 变体而来\n"}); //chi
        AllList.add(new String[]{"つ", "ツ", "tsu",
                "平假名 つ 由汉字 川 变体而来\n" +
                "片假名 ツ 由汉字 川 变体而来\n"}); //tsu
        AllList.add(new String[]{"て", "テ", "te",
                "平假名 て 由汉字 天 变体而来\n" +
                "片假名 テ 由汉字 天 变体而来\n"}); //te
        AllList.add(new String[]{"と", "ト", "to",
                "平假名 と 由汉字 止 变体而来\n" +
                "片假名 ト 由汉字 止 变体而来\n"}); //to

        AllList.add(new String[]{"な", "ナ", "na",
                "平假名 な 由汉字 奈 变体而来\n" +
                "片假名 ナ 由汉字 奈 变体而来\n"}); //na
        AllList.add(new String[]{"に", "ニ", "ni",
                "\"平假名 に 由汉字 仁 变体而来\n" +
                "片假名 ニ 由汉字 二 变体而来\"\n"}); //ni
        AllList.add(new String[]{"ぬ", "ヌ", "nu",
                "平假名 ぬ 由汉字 奴 变体而来\n" +
                "片假名 ヌ 由汉字 奴 变体而来\n"}); //nu
        AllList.add(new String[]{"ね", "ネ", "ne",
                "平假名 ね 由汉字 祢 变体而来\n" +
                "片假名 ネ 由汉字 祢 变体而来\n"}); //ne
        AllList.add(new String[]{"の", "ノ", "no",
                "平假名 の 由汉字 乃 变体而来\n" +
                "片假名 ノ 由汉字 乃 变体而来\n"}); //no

        AllList.add(new String[]{"は", "ハ", "ha",
                "平假名 は 由汉字 波 变体而来\n" +
                "片假名 ハ 由汉字 八 变体而来\n"}); //ha
        AllList.add(new String[]{"ひ", "ヒ", "hi",
                "平假名 ひ 由汉字 比 变体而来\n" +
                "片假名 ヒ 由汉字 比 变体而来\n"}); //hi
        AllList.add(new String[]{"ふ", "フ", "fu",
                "平假名 ふ 由汉字 不 变体而来\n" +
                "片假名 フ 由汉字 不 变体而来\n"}); //fu
        AllList.add(new String[]{"へ", "ヘ", "he",
                "平假名 へ 由汉字 部 变体而来\n" +
                "片假名 ヘ 由汉字 部 变体而来\n"}); //he
        AllList.add(new String[]{"ほ", "ホ", "ho",
                "平假名 ほ 由汉字 保 变体而来\n" +
                "片假名 ホ 由汉字 保 变体而来\n"}); //ho

        AllList.add(new String[]{"ま", "マ", "ma",
                "平假名 ま 由汉字 末 变体而来\n" +
                "片假名 マ 由汉字 末 变体而来\n"}); //ma
        AllList.add(new String[]{"み", "ミ", "mi",
                "平假名 み 由汉字 美 变体而来\n" +
                "片假名 ミ 由汉字 三 变体而来\n"}); //mi
        AllList.add(new String[]{"む", "ム", "mu",
                "平假名 む 由汉字 武 变体而来\n" +
                "片假名 ム 由汉字 牟 变体而来\n"}); //mu
        AllList.add(new String[]{"め", "メ", "me",
                "平假名 め 由汉字 女 变体而来\n" +
                "片假名 メ 由汉字 女 变体而来\n"}); //me
        AllList.add(new String[]{"も", "モ", "mo",
                "平假名 も 由汉字 毛 变体而来\n" +
                "片假名 モ 由汉字 毛 变体而来\n"}); //mo

        AllList.add(new String[]{"や", "ヤ", "ya",
                "平假名 や 由汉字 也 变体而来\n" +
                "片假名 ヤ 由汉字 也 变体而来\n"}); //ya
        AllList.add(new String[]{"ゆ", "ユ", "yu",
                "平假名 ゆ 由汉字 由 变体而来\n" +
                "片假名 ユ 由汉字 由 变体而来\n"}); //yu
        AllList.add(new String[]{"よ", "ヨ", "yo",
                "平假名 よ 由汉字 与 变体而来\n" +
                "片假名 ヨ 由汉字 與 变体而来\n"}); //yo

        AllList.add(new String[]{"ら", "ラ", "ra",
                "平假名 ら 由汉字 良 变体而来\n" +
                "片假名 ラ 由汉字 良 变体而来\n"}); //ra
        AllList.add(new String[]{"り", "リ", "ri",
                "平假名 り 由汉字 利 变体而来\n" +
                "片假名 リ 由汉字 利 变体而来\n"}); //ri
        AllList.add(new String[]{"る", "ル", "ru",
                "平假名 る 由汉字 留 变体而来\n" +
                "片假名 ル 由汉字 流 变体而来\n"}); //ru
        AllList.add(new String[]{"れ", "レ", "re",
                "平假名 れ 由汉字 礼 变体而来\n" +
                "片假名 レ 由汉字 礼 变体而来\n"}); //re
        AllList.add(new String[]{"ろ", "ロ", "ro",
                "平假名 ろ 由汉字 吕 变体而来\n" +
                "片假名 ロ 由汉字 吕 变体而来\n"}); //ro

        AllList.add(new String[]{"わ", "ワ", "wa",
                "平假名 わ 由汉字 和 变体而来\n" +
                "片假名 ワ 由汉字 和 变体而来\n"}); //wa
        AllList.add(new String[]{"を", "ヲ", "o",
                "平假名 を 由汉字 遠 变体而来\n" +
                "片假名 ヲ 由汉字 乎 变体而来\n"}); //wo

        AllList.add(new String[]{"ん", "ン", "n",
                "平假名 ん 由汉字 无 变体而来\n" +
                "片假名 ン 由汉字 尓 变体而来\n"}); //n

        /*mpList.add(MediaPlayer.create(base, R.raw.a));
        mpList.add(MediaPlayer.create(base, R.raw.i));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.u));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.e));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.o));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ka));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ki));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ku));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ke));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ko));


        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.sa));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.si));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.su));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.se));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.so));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ta));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ci));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.cu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.te));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.to));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.na));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ni));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.nu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ne));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.no));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ha));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.hi));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.hu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.he));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ho));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ma));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.mi));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.mu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.me));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.mo));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ya));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.yu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.yo));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ra));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ri));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ru));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.re));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ro));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.wa));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.o));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.n));*/
    }

    public int getSize(){
        return AllList.size();
    }

    public String[] getList(int i){
        return AllList.get(i);
    }

    public void initSound(Context base){
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.a));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.i));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.u));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.e));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.o));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ka));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ki));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ku));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ke));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ko));


        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.sa));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.si));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.su));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.se));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.so));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ta));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ci));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.cu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.te));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.to));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.na));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ni));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.nu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ne));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.no));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ha));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.hi));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.hu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.he));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ho));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ma));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.mi));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.mu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.me));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.mo));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ya));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.yu));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.yo));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ra));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ri));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ru));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.re));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.ro));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.wa));
        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.o));

        mpList.add(MediaPlayer.create(base.getApplicationContext(), R.raw.n));
    }

    public MediaPlayer getSound(int i){
        return mpList.get(i);
    }
}
