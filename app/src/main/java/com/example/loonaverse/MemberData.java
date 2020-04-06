package com.example.loonaverse;

import com.example.loonaverse.Model.Member;

import java.util.ArrayList;

public class MemberData {
    private static String[] memberStageName = {
            "HeeJin",
            "HyunJin",
            "HaSeul",
            "YeoJin",
            "ViVi",
            "Kim Lip",
            "JinSoul",
            "Choerry",
            "Yves",
            "Chuu",
            "Go Won",
            "Olivia Hye"
    };
    private static String[] memberRealName = {
            "Jeon Hee Jin (전희진; 田姬振)",
            "Kim Hyun Jin (김현진; 金賢晉)",
            "Cho Ha Seul (조하슬)",
            "Im Yeo Jin (임여진, 林汝眞)",
            "Wong Ka-Hei (黃珈熙)",
            "Kim Jung Eun (김정은; 金定恩)",
            "Jung Jin Sol (정진솔; 鄭眞率)",
            "Choi Ye Rim (최예림;)",
            "Ha Soo Young (하수영, 河秀映)",
            "Kim Ji Woo (김지우; 金智雨)",
            "Park Chae Won (박채원; 朴彩嫚)",
            "Son Hye Joo (손혜주; 孫慧舟)"
    };
    private static String[] memberBirthPlace = {
            "Bundang District, Seongnam, Gyeonggi Province, South Korea",
            "Sillim, Seoul Metropolitan City, Gwanak District, South Korea",
            "Bucheon, Gyeonggi Province, South Korea",
            "Suseong District, Daegu Metropolitan City, South Korea",
            "Hong Kong",
            "Cheongju, North Chungcheong Province, South Korea",
            "Seoul, South Korea",
            "Bucheon, Gyeonggi Province, South Korea",
            "Busan, South Korea",
            "Chungju, North Chungcheong Province, South Korea",
            "Jung District, Incheon, South Korea",
            "Uijeongbu, Gyeonggi Province, South Korea"
    };
    private static String[] memberBirthDate = {
            "October 19, 2000",
            "November 15, 2000",
            "August 18, 1997",
            "November 11, 2002",
            "December 9, 1996",
            "February 10, 1999",
            "June 13, 1997",
            "June 4, 2001",
            "May 24th, 1997",
            "October 20, 1999",
            "November 19, 2000",
            "November 13, 2001"
    };

    private static String[] memberAnimal = {
            "Rabbit (토끼)",
            "Cat (고양이)",
            "White Bird (하얀 새)",
            "Frog (개구리)",
            "Deer (사슴)",
            "Owl (부엉이)",
            "Blue Betta (블루베타)",
            "Fruit Bat (과일박쥐)",
            "Swan (백조)",
            "Penguin (펭귄)",
            "Butterfly (나비)",
            "Wolf (늑대)"
    };
    private static String[] debutDate = {
            "September 26, 2016",
            "October 28, 2016",
            "December 8, 2016",
            "January 4, 2017",
            "February 14, 2017",
            "May 15, 2017",
            "June 13, 2017",
            "July 12, 2017",
            "November 14, 2017",
            "December 14, 2017",
            "January 15, 2018",
            "March 17, 2018"
    };
    private static String[] memberBloodtype = {
            "A",
            "AB",
            "O",
            "B",
            "B",
            "B",
            "B",
            "O",
            "B",
            "A",
            "A",
            "B"
    };

    private static String[] memberHistory = {
            "HeeJin's decision to become a singer occurred in middle school. At one time, both her sisters had similar dreams to hers, but they remained unfulfilled. She has stated that one of the reasons she became a singer was to make her sisters’ unfulfilled dreams come true and has cited her sisters as being her biggest supporters.",
            "In October 2017, HyunJin, along with fellow LOONA members HeeJin and HaSeul, auditioned for survival reality show MIXNINE. Having passed the audition, she became a contestant as a representative of her agency and idol group.[1] HyunJin made it until the final episode, but was eliminated and did not make it into the final lineup.[2]",
            "During her time as a student, HaSeul studied abroad in Sydney, Australia for a month. Afterwards, she moved to Colorado, US and studied for another year. \nWhen she returned home to South Korea, she had to stay for one more year in school as she had been placed a grade below. HaSeul had planned to continue with her studies and go to college to study opera.",
            "Yeojin was a student at Five Music & Dance Academy in Daegu, South Korea in mid-2016, performing dance covers of I.O.I's 'Pick Me' and Jessie J's 'Bang Bang'.[1][2]",
            "Before becoming a member of LOONA, ViVi worked as a freelance model in Hong Kong under the English name Viian Wong. She modeled for a variety of projects between 2011–2015~16, including a video tutorial for Blush Cosmetics.[3] She also participated in a number of short YouTube videos,[4] ostensibly with friends.",
            "Kim Lip (Hangul: 김립) is the sixth revealed member of LOONA and a member of the second sub-unit, LOONA / ODD EYE CIRCLE. \nShe was born as Kim Jung Eun (Hangul: 김정은) on February 10, 1999, in Cheongju City, North Chungcheong Province, South Korea. \nShe debuted on May 15, 2017, as a member and subsequently released her solo single album 'Kim Lip' on May 23, 2017.",
            "Despite finding many opportunities through street castings, none followed through. However at some point in 2016, JinSoul was accepted as a trainee at Polaris Entertainment through Dream Vocal & Dance Academy after being scouted via Instagram.[1][2] She would later transfer to BlockBerryCreative and train to become a member of LOONA.",
            "Choerry was born as Choi Ye Rim on June 4, 2001 in Bucheon, South Korea. She is the eldest of three daughters. Her father runs a machine repair business. She attended Yeo-weol Elementary School. \nChoerry appeared on a 2009 episode[3][4] of Happy Time, Fantastic Mates (환상의 짝꿍) when she was in second grade, and performed a dance cover of Son Dam-bi's 'Saturday Night.'[5] \nAfter participating in a vocal contest, Choerry was cast.[6] She later passed her audition for BlockBerryCreative and became a trainee at the same time as fellow members HaSeul and YeoJin.[7]",
            "She was born in Busan, then at some point later moved to Yangsan, South Gyeongsang Province (Gyeongsangnam-do). \nShe joined a dance academy in Busan, 'Dance Up Academy'[2]. On October 25, 2015, she appeared for the first time on their YouTube channel, on the video titled 'Dance Up Jr : K-Pop Cover Dance'. She appeared on several videos, that can be found in this playlist. She appeared on their YT channel for the last time on a choreography video, 'Reddy - 생각해 : E:Na Choreography' published on July 15, 2016.",
            "Chuu was born and raised in Chungju, Chungcheong Province, South Korea, with her parents and two younger brothers. She attended Saet-byul Elementary school and San-nam Middle school. Growing up, Chuu had always wanted to be a singer. However, she was not given support from her mother due to her familiarity with the difficulties of becoming a singer. Despite that, Chuu continued to pursue her dream with the approval of her father.[1] In order to become a singer, Chuu applied and was accepted as a singer major at Hanlim Multi Arts High School in Seoul in 2015. Later, she became a trainee at FNC Academy in 2016.[2] Sometime after, she left FNC Academy and joined Music Works. It was also around this time that Chuu started her popular Instagram account. Wanting to further challenge herself, Chuu departed from Music Works to seek for a new agency. Although she auditioned for JYP Entertainment and YG Entertainment's 'The Black Label', she was not accepted into either one of them.",
            "Go Won was born as Park Chae Won on November 19, 2000, in Incheon, South Korea. She is the second eldest, with an older brother and one younger sister. \nAlthough unknown when, Go Won decided to become an idol after attending a concert held by Oh My Girl. To train to become an idol, she joined LP Dance & Vocal Academy, specializing in dance. While training under the academy, she participated in a few dance covers and auditioned for Source Music.[1][2][3] However, she was not accepted and continued to train under LP Dance & Vocal.",
            "She formerly attended Sungshin Girl's High School in Seoul along with Choerry. They are in the same year group. At first her classmates did not know she was also a member of LOOΠΔ because she was pre-debut and could not reveal it yet. Until her teaser images were released, she pretended not to know who Choerry is and kept her identity a secret.[3]"
    };
    private static int[] memberPhotos = {
            R.drawable.heejin,
            R.drawable.hyunjin,
            R.drawable.haseul,
            R.drawable.yeojin,
            R.drawable.vivi,
            R.drawable.kim_lip,
            R.drawable.jinsoul,
            R.drawable.choerry,
            R.drawable.yves,
            R.drawable.chuu,
            R.drawable.go_won,
            R.drawable.olivia_hye
    };

    static ArrayList<Member> getListData() {
        ArrayList<Member> list = new ArrayList<>();
        for (int i = 0; i < memberStageName.length; i++) {
            Member member = new Member();
            member.setStageName(memberStageName[i]);
            member.setRealName(memberRealName[i]);
            member.setBirthPlace(memberBirthPlace[i]);
            member.setBirthDate(memberBirthDate[i]);
            member.setAnimal(memberAnimal[i]);
            member.setBloodType(memberBloodtype[i]);
            member.setDebut(debutDate[i]);
            member.setHistory(memberHistory[i]);
            member.setPhoto(memberPhotos[i]);
            list.add(member);
        }
        return list;
    }
}
