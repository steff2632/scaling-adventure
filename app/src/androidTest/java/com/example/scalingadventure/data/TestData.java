package com.example.scalingadventure.data;

/**
 * Created by stefanmay on 18/11/2016.
 */

public class TestData {

    public static final String TEST_FILMS = "{\n" +
            "    \"count\": 2,\n" +
            "    \"next\": null,\n" +
            "    \"previous\": null,\n" +
            "    \"results\": [\n" +
            "        {\n" +
            "            \"title\": \"A New Hope\",\n" +
            "            \"episode_id\": 4,\n" +
            "            \"opening_crawl\": \"It is a period of civil war.\\r\\nRebel spaceships, striking\\r\\nfrom a hidden base, have won\\r\\ntheir first victory against\\r\\nthe evil Galactic Empire.\\r\\n\\r\\nDuring the battle, Rebel\\r\\nspies managed to steal secret\\r\\nplans to the Empire's\\r\\nultimate weapon, the DEATH\\r\\nSTAR, an armored space\\r\\nstation with enough power\\r\\nto destroy an entire planet.\\r\\n\\r\\nPursued by the Empire's\\r\\nsinister agents, Princess\\r\\nLeia races home aboard her\\r\\nstarship, custodian of the\\r\\nstolen plans that can save her\\r\\npeople and restore\\r\\nfreedom to the galaxy....\",\n" +
            "            \"director\": \"George Lucas\",\n" +
            "            \"producer\": \"Gary Kurtz, Rick McCallum\",\n" +
            "            \"release_date\": \"1977-05-25\",\n" +
            "            \"characters\": [\n" +
            "                \"http://swapi.co/api/people/1/\",\n" +
            "                \"http://swapi.co/api/people/2/\",\n" +
            "                \"http://swapi.co/api/people/3/\"\n" +
            "            ],\n" +
            "            \"created\": \"2014-12-10T14:23:31.880000Z\",\n" +
            "            \"edited\": \"2015-04-11T09:46:52.774897Z\",\n" +
            "            \"url\": \"http://swapi.co/api/films/1/\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"title\": \"Attack of the Clones\",\n" +
            "            \"episode_id\": 2,\n" +
            "            \"opening_crawl\": \"There is unrest in the Galactic\\r\\nSenate. Several thousand solar\\r\\nsystems have declared their\\r\\nintentions to leave the Republic.\\r\\n\\r\\nThis separatist movement,\\r\\nunder the leadership of the\\r\\nmysterious Count Dooku, has\\r\\nmade it difficult for the limited\\r\\nnumber of Jedi Knights to maintain \\r\\npeace and order in the galaxy.\\r\\n\\r\\nSenator Amidala, the former\\r\\nQueen of Naboo, is returning\\r\\nto the Galactic Senate to vote\\r\\non the critical issue of creating\\r\\nan ARMY OF THE REPUBLIC\\r\\nto assist the overwhelmed\\r\\nJedi....\",\n" +
            "            \"director\": \"George Lucas\",\n" +
            "            \"producer\": \"Rick McCallum\",\n" +
            "            \"release_date\": \"2002-05-16\",\n" +
            "            \"characters\": [\n" +
            "                \"http://swapi.co/api/people/2/\"\n" +
            "            ],\n" +
            "            \"planets\": [\n" +
            "                \"http://swapi.co/api/planets/8/\",\n" +
            "                \"http://swapi.co/api/planets/9/\"\n" +
            "            ],\n" +
            "            \"created\": \"2014-12-20T10:57:57.886000Z\",\n" +
            "            \"edited\": \"2015-04-11T09:45:01.623982Z\",\n" +
            "            \"url\": \"http://swapi.co/api/films/5/\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public static final String[] TEST_FILM = {"{\n" +
            "    \"title\": \"A New Hope\",\n" +
            "    \"episode_id\": 4,\n" +
            "    \"opening_crawl\": \"It is a period of civil war.\\r\\nRebel spaceships, striking\\r\\nfrom a hidden base, have won\\r\\ntheir first victory against\\r\\nthe evil Galactic Empire.\\r\\n\\r\\nDuring the battle, Rebel\\r\\nspies managed to steal secret\\r\\nplans to the Empire's\\r\\nultimate weapon, the DEATH\\r\\nSTAR, an armored space\\r\\nstation with enough power\\r\\nto destroy an entire planet.\\r\\n\\r\\nPursued by the Empire's\\r\\nsinister agents, Princess\\r\\nLeia races home aboard her\\r\\nstarship, custodian of the\\r\\nstolen plans that can save her\\r\\npeople and restore\\r\\nfreedom to the galaxy....\",\n" +
            "    \"director\": \"George Lucas\",\n" +
            "    \"producer\": \"Gary Kurtz, Rick McCallum\",\n" +
            "    \"release_date\": \"1977-05-25\",\n" +
            "    \"characters\": [\n" +
            "        \"http://swapi.co/api/people/1/\",\n" +
            "        \"http://swapi.co/api/people/2/\",\n" +
            "        \"http://swapi.co/api/people/3/\"\n" +
            "    ],\n" +
            "    \"created\": \"2014-12-10T14:23:31.880000Z\",\n" +
            "    \"edited\": \"2015-04-11T09:46:52.774897Z\",\n" +
            "    \"url\": \"http://swapi.co/api/films/1/\"\n" +
            "}"};

    public static final String [] TEST_CHARACTERS = {
            "{\n" +
                    "    \"name\": \"R2-D2\",\n" +
                    "    \"height\": \"96\",\n" +
                    "    \"mass\": \"32\",\n" +
                    "    \"hair_color\": \"n/a\",\n" +
                    "    \"skin_color\": \"white, blue\",\n" +
                    "    \"eye_color\": \"red\",\n" +
                    "    \"birth_year\": \"33BBY\",\n" +
                    "    \"gender\": \"n/a\",\n" +
                    "    \"homeworld\": \"http://swapi.co/api/planets/8/\",\n" +
                    "    \"films\": [\n" +
                    "        \"http://swapi.co/api/films/5/\",\n" +
                    "        \"http://swapi.co/api/films/4/\",\n" +
                    "        \"http://swapi.co/api/films/6/\",\n" +
                    "        \"http://swapi.co/api/films/3/\",\n" +
                    "        \"http://swapi.co/api/films/2/\",\n" +
                    "        \"http://swapi.co/api/films/1/\",\n" +
                    "        \"http://swapi.co/api/films/7/\"\n" +
                    "    ],\n" +
                    "    \"species\": [\n" +
                    "        \"http://swapi.co/api/species/2/\"\n" +
                    "    ],\n" +
                    "    \"vehicles\": [],\n" +
                    "    \"starships\": [],\n" +
                    "    \"created\": \"2014-12-10T15:11:50.376000Z\",\n" +
                    "    \"edited\": \"2014-12-20T21:17:50.311000Z\",\n" +
                    "    \"url\": \"http://swapi.co/api/people/3/\"\n" +
                    "}",
            "{\n" +
                    "    \"name\": \"C-3PO\",\n" +
                    "    \"height\": \"167\",\n" +
                    "    \"mass\": \"75\",\n" +
                    "    \"hair_color\": \"n/a\",\n" +
                    "    \"skin_color\": \"gold\",\n" +
                    "    \"eye_color\": \"yellow\",\n" +
                    "    \"birth_year\": \"112BBY\",\n" +
                    "    \"gender\": \"n/a\",\n" +
                    "    \"homeworld\": \"http://swapi.co/api/planets/1/\",\n" +
                    "    \"films\": [\n" +
                    "        \"http://swapi.co/api/films/5/\",\n" +
                    "        \"http://swapi.co/api/films/4/\",\n" +
                    "        \"http://swapi.co/api/films/6/\",\n" +
                    "        \"http://swapi.co/api/films/3/\",\n" +
                    "        \"http://swapi.co/api/films/2/\",\n" +
                    "        \"http://swapi.co/api/films/1/\"\n" +
                    "    ],\n" +
                    "    \"species\": [\n" +
                    "        \"http://swapi.co/api/species/2/\"\n" +
                    "    ],\n" +
                    "    \"vehicles\": [],\n" +
                    "    \"starships\": [],\n" +
                    "    \"created\": \"2014-12-10T15:10:51.357000Z\",\n" +
                    "    \"edited\": \"2014-12-20T21:17:50.309000Z\",\n" +
                    "    \"url\": \"http://swapi.co/api/people/2/\"\n" +
                    "}",
            "{\n" +
                    "    \"name\": \"Luke Skywalker\",\n" +
                    "    \"height\": \"172\",\n" +
                    "    \"mass\": \"77\",\n" +
                    "    \"hair_color\": \"blond\",\n" +
                    "    \"skin_color\": \"fair\",\n" +
                    "    \"eye_color\": \"blue\",\n" +
                    "    \"birth_year\": \"19BBY\",\n" +
                    "    \"gender\": \"male\",\n" +
                    "    \"homeworld\": \"http://swapi.co/api/planets/1/\",\n" +
                    "    \"films\": [\n" +
                    "        \"http://swapi.co/api/films/6/\",\n" +
                    "        \"http://swapi.co/api/films/3/\",\n" +
                    "        \"http://swapi.co/api/films/2/\",\n" +
                    "        \"http://swapi.co/api/films/1/\",\n" +
                    "        \"http://swapi.co/api/films/7/\"\n" +
                    "    ],\n" +
                    "    \"species\": [\n" +
                    "        \"http://swapi.co/api/species/1/\"\n" +
                    "    ],\n" +
                    "    \"vehicles\": [\n" +
                    "        \"http://swapi.co/api/vehicles/14/\",\n" +
                    "        \"http://swapi.co/api/vehicles/30/\"\n" +
                    "    ],\n" +
                    "    \"starships\": [\n" +
                    "        \"http://swapi.co/api/starships/12/\",\n" +
                    "        \"http://swapi.co/api/starships/22/\"\n" +
                    "    ],\n" +
                    "    \"created\": \"2014-12-09T13:50:51.644000Z\",\n" +
                    "    \"edited\": \"2014-12-20T21:17:56.891000Z\",\n" +
                    "    \"url\": \"http://swapi.co/api/people/1/\"\n" +
                    "}"
    };
}
