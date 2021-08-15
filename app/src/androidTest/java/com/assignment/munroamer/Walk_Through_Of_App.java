package com.assignment.munroamer;


import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import com.assignment.munroamer.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

/**
 * An Instrumented test of the UI
 * Checking features such as button changes of text and visibility, presence of ListView once Munros added to bag
 *  * @author Kirsty Carmichael
 *  * @version 0.1 (13.08.21)
 *
 */

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Walk_Through_Of_App {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void walk_Through_Of_App() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.emailLogin),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("kc@gmail.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.loginPasswordText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText(""), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.loginPasswordText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText3.perform(pressImeActionButton());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.loginPasswordText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText4.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.loginPasswordText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("1234"), closeSoftKeyboard());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.loginButton), withText("Roam"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction materialTextView = onView(
                allOf(withId(R.id.signUpText), withText("Sign up here"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        materialTextView.perform(click());

        ViewInteraction editText = onView(
                allOf(withId(R.id.newFirstName),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0),
                        isDisplayed()));
        editText.perform(replaceText("k"), closeSoftKeyboard());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.newLastName),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        editText2.perform(replaceText("c"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.newEmail),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                2),
                        isDisplayed()));
        editText3.perform(replaceText("k"), closeSoftKeyboard());

        ViewInteraction editText4 = onView(
                allOf(withId(R.id.newPassword1),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        editText4.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction editText5 = onView(
                allOf(withId(R.id.newPassword2),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                4),
                        isDisplayed()));
        editText5.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(R.id.signMeUpBtn), withText("Sign Me Up!"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                5),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.signUpCancBtn), withText("Go to Log In"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                6),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.emailLogin),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("k"), closeSoftKeyboard());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.loginPasswordText),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.loginButton), withText("Roam"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton2.perform(click());
        //Espresso warned it was unlikely to be able to interact with the map so this part was deleted by KC

        ViewInteraction imageView = onView(
                allOf(withId(R.id.menu_icon),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0),
                        isDisplayed()));
        imageView.perform(click());

        ViewInteraction textView = onView(
                allOf(withText("MunroMap"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView.check(matches(isDisplayed()));

        ViewInteraction textView2 = onView(
                allOf(withText("About"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView2.check(matches(isDisplayed()));

        ViewInteraction textView3 = onView(
                allOf(withText("Before You Roam"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView3.check(matches(isDisplayed()));

        ViewInteraction textView4 = onView(
                allOf(withText("Before You Roam"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView4.check(matches(isDisplayed()));

        ViewInteraction textView5 = onView(
                allOf(withText("My Bag"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView5.check(matches(withText("My Bag")));

        ViewInteraction imageView2 = onView(
                allOf(withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView2.check(matches(isDisplayed()));

        ViewInteraction imageView3 = onView(
                allOf(withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView3.check(matches(isDisplayed()));

        ViewInteraction textView6 = onView(
                allOf(withText("Log Out"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView6.check(matches(withText("Log Out")));

        ViewInteraction imageView4 = onView(
                allOf(withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView4.check(matches(isDisplayed()));

        ViewInteraction linearLayout2 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        4),
                        isDisplayed()));
        linearLayout2.perform(click());

        ViewInteraction imageView5 = onView(
                allOf(withId(R.id.menu_icon),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView5.check(matches(isDisplayed()));

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.help_messageWindow), withText("The Munros are the mountains in Scotland over 3000 feet high.\n •A Munro is a mountain in Scotland over 3000ft(914m)\n \n •There are 282 Munros\n \n •People like to hill hike up to the top of them. When you hit the summit, you have bagged a Munro.\n \n •The beauty of wanting to bag all 282 of them is that in committing to do so, you open up the opportunity to see an incredible breadth of Scotlands outstanding and dramatic landscape.\n \n •When you’ve bagged all 282 Munros, you’re considered a Munroist. And that is when you start getting a lot of knowing nods, kudos and respect.\n \n \n How To Use MunRoamer\n \n \n - Navigate through the app using the hamburger menu with the 3 lines at the top of the screen\n \n -Use the MunRoam map to find Munros nearby your location and search for Munros by name for example Ben Nevis.\n \n -Have a scroll through MunRoamers Munro List, if you see one you like, why not check it out on the map to see where it is?.\n \n - Get some handy hiking advice by clicking on the Before You Roam option in the menu\n \n - Add a diary entry of your ascents once you have bagged a Munro in the My Bag option"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView7.check(matches(isDisplayed()));

        ViewInteraction textView8 = onView(
                allOf(withId(R.id.toolbarTitle), withText("About"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView8.check(matches(withText("About")));

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.menu_icon),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction linearLayout3 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        5),
                        isDisplayed()));
        linearLayout3.perform(click());

        ViewInteraction textView9 = onView(
                allOf(withId(R.id.toolbarTitle), withText("Before You Roam"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView9.check(matches(withText("Before You Roam")));

        ViewInteraction imageView6 = onView(
                allOf(withId(R.id.menu_icon),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView6.check(matches(isDisplayed()));

        ViewInteraction textView10 = onView(
                allOf(withId(R.id.messageWindow), withText("Essential equipment\n \n Warm and waterproof clothing, a map, compass and good navigation skills are essential, and in addition to the standard equipment for country walks, you should also carry:\n \n - A survival bag - a heavy-duty bag that keeps your body insulated from the cold in an emergency.\n \n - A torch and spare batteries\n \n - A whistle (six blasts of a whistle or six flashes of a torch is the international distress signal)\n - Additional warm clothing (including hat and gloves)\n - High-energy rations (such as mint cake, chocolate, or dried fruit)\n \n - Water purification tablets\n \n - A first aid kit\n \n - An ice axe and crampons when there is snow or ice on the hills\n \n If you are likely to encounter heavy snow or ice, wear a pair of heavy-duty winter walking boots that can be fitted with crampons (metal spike attachments that give a better grip on icy terrain) and carry an ice axe. It’s worth learning how to use them before setting out on your walk as they can cause, rather than prevent, accidents if not used properly."),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView10.check(matches(isDisplayed()));

        ViewInteraction appCompatImageView2 = onView(
                allOf(withId(R.id.menu_icon),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView2.perform(click());

        ViewInteraction linearLayout4 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        8),
                        isDisplayed()));
        linearLayout4.perform(click());

        ViewInteraction imageView7 = onView(
                allOf(withId(R.id.menu_icon),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView7.check(matches(isDisplayed()));

        ViewInteraction textView11 = onView(
                allOf(withId(R.id.toolbarTitle), withText("Munro List"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView11.check(matches(withText("Munro List")));

        ViewInteraction textView12 = onView(
                allOf(withId(R.id.messageWindow), withText(" List of Munros by Height\n \n1- Ben Nevis 1345m\n 2- Ben Macdui 1309m\n 3- Braeriach 1296m\n 4- Cairn Toul 1291m\n 5- Sgor an Lochain Uaine 1258m\n 6- Cairn Gorm 1245m\n 7- Aonach Beag (Nevis Range) 1234m\n 8- Aonach Mor 1221m\n 9- Carn Mor Dearg 1220m\n 10- Ben Lawers 1214m\n 11 -Beinn a Bhuird 1197m\n 12 -Carn Eige 1183m\n 13- Beinn Mheadhoin 1182m\n 14- Mam Sodhail 1181m\n 15- Stob Choire Claurigh 1177m\n 16- Ben More 1174m\n 17- Ben Avon 1171m\n 18- Stob Binnein 1165m\n 19- Beinn Bhrotain 1157m\n 20- Derry Cairngorm 1155m\n 21- Lochnagar 1155m\n 22- Sgurr nan Ceathreamhnan 1151m\n 23- Bidean nam Bian 1150m\n 24- Sgurr na Lapaich 1150m\n 25- Ben Alder 1148m\n 26- Geal-charn (Alder) 1132m\n 27- Ben Lui 1130m\n 28- Binnein Mor 1130m\n 29- Creag Meagaidh 1130m\n 30- An Riabhachan 1129m\n 31- Ben Cruachan 1126m\n 32- Carn nan Gabhar 1121m\n 33- A Chralaig 1120m\n 34- An Stuc 1118m\n 35- Carn a Choire Bhoidheach 1118m\n 36- Meall Garbh (Ben Lawers) 1118m\n 37- Sgor Gaoith 1118m\n 38- Aonach Beag (Alder) 1116m\n 39- Stob Coire an Laoigh 1116m\n 40- Stob Coire Easain 1115m\n 41- Monadh Mor 1113m\n 42- Tom a Choinich 1112m\n 43- Sgurr Mor 1110m\n 44- Sgurr nan Conbhairean 1109m\n 45- Meall a Bhuiridh 1108m\n 46- Stob a Choire Mheadhoin 1106m\n 47- Beinn Ghlas 1103m\n 48- Beinn eibhinn 1102m\n 49- Mullach Fraoch-choire 1102m\n 50- Creise 1100m\n 51- Sgurr a Mhaim 1099m\n 52- Sgurr Choinnich Mor 1094m\n 53- Sgurr nan Clach Geala 1093m\n 54- Bynack More 1090m\n 55- Stob Ghabhar 1090m\n 56- Beinn a Chlachair 1087m\n 57- Beinn Dearg (Ullapool) 1084m\n 58- Schiehallion 1083m\n 59- Sgurr a Choire Ghlais 1083m\n 60- Beinn a Chaorainn (Cairngorms) 1082m\n 61- Beinn a Chreachain 1081m\n 62- Beinn Heasgarnich 1078m\n 63- Ben Starav 1078m\n 64- Beinn Dorain 1076m\n 65- Stob Coire Sgreamhach 1072m\n 66- Braigh Coire Chruinn-bhalgain 1070m\n 67- An Socach (Mullardoch) 1069m\n 68- Meall Corranaich 1069m\n 69- Glas Maol 1068m\n 70- Sgurr Fhuaran 1067m\n 71- Cairn of Claise 1064m\n 72- Bidein a Ghlas Thuill (An Teallach) 1062m\n 73- Sgurr Fiona (An Teallach) 1060m\n 74- Na Gruagaichean 1056m\n 75- Spidean a Choire Leith (Liathach) 1055m\n 76- Stob Poite Coire ardair 1054m\n 77- Toll Creagach 1054m\n 78- Sgurr a Chaorachain 1053m\n 79- Glas Tulaichean 1051m\n 80- Beinn a Chaorainn (Glen Spean) 1050m\n 81- Geal charn (Laggan) 1049m\n 82- Sgurr Fhuar-thuill 1049m\n 83- Carn an t-Sagairt Mor 1047m\n 84- Creag Mhor (Glen Lochay) 1047m\n 85- Ben Wyvis 1046m\n 86- Chno Dearg 1046m\n 87- Cruach ardrain 1046m\n 88- Beinn Iutharn Mhor 1045m\n 89- Meall nan Tarmachan 1044m\n 90- Stob Coir an Albannaich 1044m\n 91- Carn Mairg 1042m\n 92- Sgurr na Ciche 1040m\n 93- Meall Ghaordaidh 1039m\n 94- Beinn Achaladair 1038m\n 95- Carn a Mhaim 1037m\n 96- Sgurr a Bhealaich Dheirg 1036m\n 97- Gleouraich 1035m\n 98- Carn Dearg (Loch Pattack) 1034m\n 99- Am Bodach 1032m\n 100- Beinn Fhada 1032m\n 101- Ben Oss 1029m\n 102- Carn an Righ 1029m\n 103- Carn Gorm 1029m\n 104- Sgurr a Mhaoraich 1027m\n 105- Sgurr na Ciste Duibhe 1027m\n 106- Ben Challum 1025m\n 107- Sgorr Dhearg (Beinn a Bheithir) 1024m\n 108- Mullach an Rathain (Liathach) 1023m\n 109- Aonach Air Chrith 1021m\n 110- Stob Dearg (Buachaille Etive Mor) 1021m\n 111- Ladhar Bheinn 1020m\n 112- Beinn Bheoil 1019m\n 113- Carn an Tuirc 1019m\n 114- Mullach Clach a Bhlair 1019m\n 115- Mullach Coire Mhic Fhearchair 1019m\n 116- Garbh Chioch Mhor 1013m\n 117- Cairn Bannoch 1012m\n 118- Beinn ime 1011m\n 119- Beinn Udlamain 1010m\n 120- Ruadh-stac Mor (Beinn Eighe) 1010m\n 121- Sgurr an Doire Leathain 1010m\n 122- Sgurr eilde Mor 1010m\n 123- The Saddle 1010m\n 124- Beinn Dearg (Blair Atholl) 1008m\n 125- Maoile Lunndaidh 1007m\n 126- An Sgarsoch 1006m\n 127- Carn Liath (Creag Meagaidh) 1006m\n 128- Beinn Fhionnlaidh (Carn Eige) 1005m\n 129- Beinn an Dothaidh 1004m\n 130- Sgurr an Lochain 1004m\n 131- The Devils Point 1004m\n 132- Sgurr Mor (Loch Quoich) 1003m\n 133- Sail Chaorainn 1002m\n 134- Sgurr na Carnach 1002m\n 135- Aonach Meadhoin 1001m\n 136- Meall Greigh 1001m\n 137- Sgorr Dhonuill (Beinn a Bheithir) 1001m\n 138- Sgurr Breac 999m\n 139- Sgurr Choinnich 999m\n 140- Stob Ban (Mamores) 999m\n 141- Ben More Assynt 998m\n 142- Broad Cairn 998m\n 143- Stob Daimh 998m\n 144- A Chailleach (Fannichs) 997m\n 145- Glas Bheinn Mhor 997m\n 146- Spidean Mialach 996m\n 147- An Caisteal 995m\n 148- Carn an Fhidhleir (Carn Ealar) 994m\n 149- Sgor na h-Ulaidh 994m\n 150- Sgurr na Ruaidhe 993m\n 151- Spidean Coire nan Clach (Beinn Eighe) 993m\n 152- Carn nan Gobhar (Loch Mullardoch) 992m\n 153- Carn nan Gobhar (Strathfarrar) 992m\n 154- Sgurr Alasdair 992m\n 155- Sgairneach Mhor 991m\n 156- Beinn Eunaich 989m\n 157- Sgurr Ban 989m\n 158- Conival 987m\n 159- Creag Leacach 987m\n 160- Druim Shionnach 987m\n 161- Gulvain 987m\n 162- Inaccessible Pinnacle 986m\n 163- Lurg Mhor 986m\n 164- Sgurr Mor (Beinn Alligin) 986m\n 165- Ben Vorlich (Loch Earn) 985m\n 166- An Gearanach 982m\n 167- Mullach na Dheiragain 982m\n 168- Creag Mhor (Meall na Aighean) 981m\n 169- Maol chinn-dearg 981m\n 170- Slioch 981m\n 171- Stob Coire a Chairn 981m\n 172- Beinn a Chochuill 980m\n 173- Ciste Dhubh 979m\n 174- Stob Coire Sgriodain 979m\n 175- Beinn Dubhchraig 978m\n 176- Cona Mheall 978m\n 177- Meall nan Ceapraichean 977m\n 178- Stob Ban (Grey Corries) 977m\n 179- A Mharconaich 975m\n 180- Carn a Gheoidh 975m\n 181- Carn Liath (Beinn a Ghlo) 975m\n 182- Stuc a Chroin 975m\n 183- Beinn Sgritheall 974m\n 184- Ben Lomond 974m\n 185- Sgurr a Ghreadaidh 973m\n 186- Meall Garbh (Carn Mairg) 968m\n 187- A Mhaighdean 967m\n 188- Sgorr nam Fiannaidh (Aonach Eagach) 967m\n 189- Ben More (Mull) 966m\n 190- Sgurr na Banachdich 965m\n 191- Sgurr nan Gillean 964m\n 192- Carn a Chlamain 963m\n 193- Sgurr Thuilm 963m\n 194- Sgorr Ruadh 962m\n 195- Ben Klibreck 961m\n 196- Beinn nan Aighenan 960m\n 197- Stuchd an Lochain 960m\n 198- Beinn Fhionnlaidh 959m\n 199- Meall Glas 959m\n 200- Bruach na Frithe 958m\n 201- Tolmount 958m\n 202- Carn Ghluasaid 957m\n 203- Tom Buidhe 957m\n 204- Saileag 956m\n 205- Sgurr nan Coireachan (Glenfinnan) 956m\n 206- Stob Dubh (Buachaille Etive Beag) 956m\n 207- Stob na Broige (Buachaille Etive Mor) 956m\n 208- Sgor Gaibhre 955m\n 209- Am Faochagach 954m\n 210- Beinn Liath Mhor Fannaich 954m\n 211- Beinn Mhanach 953m\n 212- Meall Dearg (Aonach Eagach) 953m\n 213- Sgurr nan Coireachan (Glen Dessary) 953m\n 214- Meall Chuaich 951m\n 215- Meall Gorm 949m\n 216- Beinn Bhuidhe 948m\n 217- Sgurr Mhic Choinnich 948m\n 218- Creag aMhaim 947m\n 219- Driesh 947m\n 220- Beinn Tulaichean 946m\n 221- Carn Bhac 946m\n 222- Meall Buidhe (Knoydart) 946m\n 223- Bidein a Choire Sheasgaich 945m\n 224- Carn Dearg (Monadhliath) 945m\n 225- Sgurr na Sgìne 945m\n 226- Stob a Choire Odhair 945m\n 227- An Socach (Braemar) 944m\n 228- Sgurr Dubh Mor 944m\n 229- Ben Vorlich (Loch Lomond) 943m\n 230- Binnein Beag 943m\n 231- Beinn a Chroin 942m\n 232- Carn Dearg (Corrour) 941m\n 233- Carn na Caim 941m\n 234- Luinne Bheinn 939m\n 235- Mount Keen 939m\n 236- Mullach nan Coirean 939m\n 237- Beinn na Lap 937m\n 238- Beinn Sgulaird 937m\n 239- Beinn Tarsuinn 937m\n 240- Sron a Choire Ghairbh 937m\n 241- A Bhuidheanach Bheag 936m\n 242- Am Basteir 934m\n 243- Meall a Chrasgaidh 934m\n 244- Beinn Chabhair 933m\n 245- Fionn Bheinn 933m\n 246- Maol Chean-dearg 933m\n 247- The Cairnwell 933m\n 248- Meall Buidhe (Glen Lyon) 932m\n 249- Beinn Bhreac 931m\n 250- Ben Chonzie 931m\n 251- A Chailleach (Monadhliath) 930m\n 252- Bla Bheinn 928m\n 253- Mayar 928m\n 254- Meall nan Eun 928m\n 255- Moruisg 928m\n 256- Ben Hope 927m\n 257- Eididh nan Clach Geala 927m\n 258- Beinn Liath Mhor 926m\n 259- Beinn Narnain 926m\n 260- Geal Charn (Monadhliath) 926m\n 261- Meall a Choire Leith 926m\n 262- Seana Bhraigh 926m\n 263- Stob Coire Raineach 925m\n 264- Creag Pitridh 924m\n 265- Sgurr nan Eag 924m\n 266- An Coileachan 923m\n 267- Sgurr nan Each 923m\n 268- Tom na Gruagaich (Beinn Alligin) 922m\n 269- An Socach (Affric) 921m\n 270- Sgiath Chuil 921m\n 271- Carn Sgulain 920m\n 272- Gairich 919m\n 273- A Ghlas-bheinn 918m\n 274- Creag nan Damh 918m\n 275- Meall na Teanga 918m\n 276- Ruadh Stac Mor 918m\n 277- Sgurr a Mhadaidh 918m\n 278- Carn Aosda 917m\n 279- Geal-charn (Drumochter) 917m\n 280- Beinn a Chleibh 916m\n 281- Beinn Teallach 915m\n 282- Ben Vane 915m\n "),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView12.check(matches(isDisplayed()));

        ViewInteraction appCompatImageView3 = onView(
                allOf(withId(R.id.menu_icon),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView3.perform(click());

        ViewInteraction linearLayout5 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        6),
                        isDisplayed()));
        linearLayout5.perform(click());

        ViewInteraction textView13 = onView(
                allOf(withId(R.id.toolbarTitle), withText("My Bag"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView13.check(matches(withText("My Bag")));

        ViewInteraction imageView8 = onView(
                allOf(withId(R.id.menu_icon),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView8.check(matches(isDisplayed()));

        ViewInteraction button3 = onView(
                allOf(withId(R.id.bagMunrosBtn), withText("BAG MUNROS"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button3.check(matches(isDisplayed()));

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.bagMunrosBtn), withText("Bag Munros"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction button4 = onView(
                allOf(withId(R.id.addToBag), withText("ADD TO MY BAG"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button4.check(matches(isDisplayed()));

        ViewInteraction button5 = onView(
                allOf(withId(R.id.cancelBag), withText("CANCEL"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button5.check(matches(isDisplayed()));

        ViewInteraction imageView9 = onView(
                allOf(withId(R.id.menu_icon),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView9.check(matches(isDisplayed()));

        ViewInteraction textView14 = onView(
                allOf(withId(R.id.toolbarTitle), withText("Add to My Bag"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView14.check(matches(withText("Add to My Bag")));

        ViewInteraction editText6 = onView(
                allOf(withId(R.id.bagDate), withText("Date of Ascent DD/MM/YYYY"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        editText6.check(matches(isDisplayed()));

        ViewInteraction editText7 = onView(
                allOf(withId(R.id.bagMunroName), withText("Name of Munro"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        editText7.check(matches(isDisplayed()));

        ViewInteraction editText8 = onView(
                allOf(withId(R.id.bagDiaryEntry), withText("Diary Entry"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        editText8.check(matches(withText("Diary Entry")));

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.bagDate),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0),
                        isDisplayed()));
        appCompatEditText8.perform(replaceText("12/08/20"), closeSoftKeyboard());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.bagMunroName),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText9.perform(replaceText("b"), closeSoftKeyboard());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.bagDate), withText("12/08/20"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0),
                        isDisplayed()));
        appCompatEditText10.perform(replaceText("12/08/2021"));

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.bagDate), withText("12/08/2021"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0),
                        isDisplayed()));
        appCompatEditText11.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.bagMunroName), withText("b"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText12.perform(replaceText("Ben nevis"));

        ViewInteraction appCompatEditText13 = onView(
                allOf(withId(R.id.bagMunroName), withText("Ben nevis"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText13.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText14 = onView(
                allOf(withId(R.id.bagDiaryEntry),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                2),
                        isDisplayed()));
        appCompatEditText14.perform(replaceText("it was fun"), closeSoftKeyboard());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.addToBag), withText("Add To My Bag"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                3),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction button6 = onView(
                allOf(withId(R.id.goToBag), withText("GO TO BAG"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button6.check(matches(isDisplayed()));

        ViewInteraction button7 = onView(
                allOf(withId(R.id.addAnother), withText("ADD ANOTHER"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button7.check(matches(isDisplayed()));

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.addAnother), withText("Add Another"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                6),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction button8 = onView(
                allOf(withId(R.id.addToBag), withText("ADD TO MY BAG"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button8.check(matches(isDisplayed()));

        ViewInteraction button9 = onView(
                allOf(withId(R.id.cancelBag), withText("CANCEL"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button9.check(matches(isDisplayed()));

        ViewInteraction button10 = onView(
                allOf(withId(R.id.cancelBag), withText("CANCEL"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button10.check(matches(isDisplayed()));

        ViewInteraction appCompatEditText15 = onView(
                allOf(withId(R.id.bagDate),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0),
                        isDisplayed()));
        appCompatEditText15.perform(replaceText("13/08/2021"), closeSoftKeyboard());

        ViewInteraction appCompatEditText16 = onView(
                allOf(withId(R.id.bagMunroName),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText16.perform(replaceText("Ben Cruachan"), closeSoftKeyboard());

        ViewInteraction appCompatEditText17 = onView(
                allOf(withId(R.id.bagDiaryEntry),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                2),
                        isDisplayed()));
        appCompatEditText17.perform(replaceText("weather good"), closeSoftKeyboard());

        ViewInteraction button11 = onView(
                allOf(withId(R.id.addToBag), withText("ADD TO MY BAG"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button11.check(matches(isDisplayed()));

        ViewInteraction button12 = onView(
                allOf(withId(R.id.cancelBag), withText("CANCEL"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button12.check(matches(isDisplayed()));

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.addToBag), withText("Add To My Bag"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                3),
                        isDisplayed()));
        materialButton6.perform(click());

        ViewInteraction button13 = onView(
                allOf(withId(R.id.goToBag), withText("GO TO BAG"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button13.check(matches(isDisplayed()));

        ViewInteraction button14 = onView(
                allOf(withId(R.id.addAnother), withText("ADD ANOTHER"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button14.check(matches(isDisplayed()));

        ViewInteraction button15 = onView(
                allOf(withId(R.id.addAnother), withText("ADD ANOTHER"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button15.check(matches(isDisplayed()));

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.goToBag), withText("Go to Bag"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                5),
                        isDisplayed()));
        materialButton7.perform(click());

        ViewInteraction textView15 = onView(
                allOf(withId(android.R.id.text1), withText("12/08/2021"),
                        withParent(allOf(withId(R.id.myBagList),
                                withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                        isDisplayed()));
        textView15.check(matches(isDisplayed()));

        ViewInteraction linearLayout6 = onView(
                allOf(withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        linearLayout6.check(matches(isDisplayed()));

        ViewInteraction appCompatImageView4 = onView(
                allOf(withId(R.id.menu_icon),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView4.perform(click());

        ViewInteraction linearLayout7 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        8),
                        isDisplayed()));
        linearLayout7.perform(click());

        ViewInteraction imageView10 = onView(
                allOf(withId(R.id.menu_icon),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageView10.check(matches(isDisplayed()));

        ViewInteraction textView16 = onView(
                allOf(withId(R.id.toolbarTitle), withText("Munro List"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView16.check(matches(withText("Munro List")));

        ViewInteraction textView17 = onView(
                allOf(withId(R.id.messageWindow), withText(" List of Munros by Height\n \n1- Ben Nevis 1345m\n 2- Ben Macdui 1309m\n 3- Braeriach 1296m\n 4- Cairn Toul 1291m\n 5- Sgor an Lochain Uaine 1258m\n 6- Cairn Gorm 1245m\n 7- Aonach Beag (Nevis Range) 1234m\n 8- Aonach Mor 1221m\n 9- Carn Mor Dearg 1220m\n 10- Ben Lawers 1214m\n 11 -Beinn a Bhuird 1197m\n 12 -Carn Eige 1183m\n 13- Beinn Mheadhoin 1182m\n 14- Mam Sodhail 1181m\n 15- Stob Choire Claurigh 1177m\n 16- Ben More 1174m\n 17- Ben Avon 1171m\n 18- Stob Binnein 1165m\n 19- Beinn Bhrotain 1157m\n 20- Derry Cairngorm 1155m\n 21- Lochnagar 1155m\n 22- Sgurr nan Ceathreamhnan 1151m\n 23- Bidean nam Bian 1150m\n 24- Sgurr na Lapaich 1150m\n 25- Ben Alder 1148m\n 26- Geal-charn (Alder) 1132m\n 27- Ben Lui 1130m\n 28- Binnein Mor 1130m\n 29- Creag Meagaidh 1130m\n 30- An Riabhachan 1129m\n 31- Ben Cruachan 1126m\n 32- Carn nan Gabhar 1121m\n 33- A Chralaig 1120m\n 34- An Stuc 1118m\n 35- Carn a Choire Bhoidheach 1118m\n 36- Meall Garbh (Ben Lawers) 1118m\n 37- Sgor Gaoith 1118m\n 38- Aonach Beag (Alder) 1116m\n 39- Stob Coire an Laoigh 1116m\n 40- Stob Coire Easain 1115m\n 41- Monadh Mor 1113m\n 42- Tom a Choinich 1112m\n 43- Sgurr Mor 1110m\n 44- Sgurr nan Conbhairean 1109m\n 45- Meall a Bhuiridh 1108m\n 46- Stob a Choire Mheadhoin 1106m\n 47- Beinn Ghlas 1103m\n 48- Beinn eibhinn 1102m\n 49- Mullach Fraoch-choire 1102m\n 50- Creise 1100m\n 51- Sgurr a Mhaim 1099m\n 52- Sgurr Choinnich Mor 1094m\n 53- Sgurr nan Clach Geala 1093m\n 54- Bynack More 1090m\n 55- Stob Ghabhar 1090m\n 56- Beinn a Chlachair 1087m\n 57- Beinn Dearg (Ullapool) 1084m\n 58- Schiehallion 1083m\n 59- Sgurr a Choire Ghlais 1083m\n 60- Beinn a Chaorainn (Cairngorms) 1082m\n 61- Beinn a Chreachain 1081m\n 62- Beinn Heasgarnich 1078m\n 63- Ben Starav 1078m\n 64- Beinn Dorain 1076m\n 65- Stob Coire Sgreamhach 1072m\n 66- Braigh Coire Chruinn-bhalgain 1070m\n 67- An Socach (Mullardoch) 1069m\n 68- Meall Corranaich 1069m\n 69- Glas Maol 1068m\n 70- Sgurr Fhuaran 1067m\n 71- Cairn of Claise 1064m\n 72- Bidein a Ghlas Thuill (An Teallach) 1062m\n 73- Sgurr Fiona (An Teallach) 1060m\n 74- Na Gruagaichean 1056m\n 75- Spidean a Choire Leith (Liathach) 1055m\n 76- Stob Poite Coire ardair 1054m\n 77- Toll Creagach 1054m\n 78- Sgurr a Chaorachain 1053m\n 79- Glas Tulaichean 1051m\n 80- Beinn a Chaorainn (Glen Spean) 1050m\n 81- Geal charn (Laggan) 1049m\n 82- Sgurr Fhuar-thuill 1049m\n 83- Carn an t-Sagairt Mor 1047m\n 84- Creag Mhor (Glen Lochay) 1047m\n 85- Ben Wyvis 1046m\n 86- Chno Dearg 1046m\n 87- Cruach ardrain 1046m\n 88- Beinn Iutharn Mhor 1045m\n 89- Meall nan Tarmachan 1044m\n 90- Stob Coir an Albannaich 1044m\n 91- Carn Mairg 1042m\n 92- Sgurr na Ciche 1040m\n 93- Meall Ghaordaidh 1039m\n 94- Beinn Achaladair 1038m\n 95- Carn a Mhaim 1037m\n 96- Sgurr a Bhealaich Dheirg 1036m\n 97- Gleouraich 1035m\n 98- Carn Dearg (Loch Pattack) 1034m\n 99- Am Bodach 1032m\n 100- Beinn Fhada 1032m\n 101- Ben Oss 1029m\n 102- Carn an Righ 1029m\n 103- Carn Gorm 1029m\n 104- Sgurr a Mhaoraich 1027m\n 105- Sgurr na Ciste Duibhe 1027m\n 106- Ben Challum 1025m\n 107- Sgorr Dhearg (Beinn a Bheithir) 1024m\n 108- Mullach an Rathain (Liathach) 1023m\n 109- Aonach Air Chrith 1021m\n 110- Stob Dearg (Buachaille Etive Mor) 1021m\n 111- Ladhar Bheinn 1020m\n 112- Beinn Bheoil 1019m\n 113- Carn an Tuirc 1019m\n 114- Mullach Clach a Bhlair 1019m\n 115- Mullach Coire Mhic Fhearchair 1019m\n 116- Garbh Chioch Mhor 1013m\n 117- Cairn Bannoch 1012m\n 118- Beinn ime 1011m\n 119- Beinn Udlamain 1010m\n 120- Ruadh-stac Mor (Beinn Eighe) 1010m\n 121- Sgurr an Doire Leathain 1010m\n 122- Sgurr eilde Mor 1010m\n 123- The Saddle 1010m\n 124- Beinn Dearg (Blair Atholl) 1008m\n 125- Maoile Lunndaidh 1007m\n 126- An Sgarsoch 1006m\n 127- Carn Liath (Creag Meagaidh) 1006m\n 128- Beinn Fhionnlaidh (Carn Eige) 1005m\n 129- Beinn an Dothaidh 1004m\n 130- Sgurr an Lochain 1004m\n 131- The Devils Point 1004m\n 132- Sgurr Mor (Loch Quoich) 1003m\n 133- Sail Chaorainn 1002m\n 134- Sgurr na Carnach 1002m\n 135- Aonach Meadhoin 1001m\n 136- Meall Greigh 1001m\n 137- Sgorr Dhonuill (Beinn a Bheithir) 1001m\n 138- Sgurr Breac 999m\n 139- Sgurr Choinnich 999m\n 140- Stob Ban (Mamores) 999m\n 141- Ben More Assynt 998m\n 142- Broad Cairn 998m\n 143- Stob Daimh 998m\n 144- A Chailleach (Fannichs) 997m\n 145- Glas Bheinn Mhor 997m\n 146- Spidean Mialach 996m\n 147- An Caisteal 995m\n 148- Carn an Fhidhleir (Carn Ealar) 994m\n 149- Sgor na h-Ulaidh 994m\n 150- Sgurr na Ruaidhe 993m\n 151- Spidean Coire nan Clach (Beinn Eighe) 993m\n 152- Carn nan Gobhar (Loch Mullardoch) 992m\n 153- Carn nan Gobhar (Strathfarrar) 992m\n 154- Sgurr Alasdair 992m\n 155- Sgairneach Mhor 991m\n 156- Beinn Eunaich 989m\n 157- Sgurr Ban 989m\n 158- Conival 987m\n 159- Creag Leacach 987m\n 160- Druim Shionnach 987m\n 161- Gulvain 987m\n 162- Inaccessible Pinnacle 986m\n 163- Lurg Mhor 986m\n 164- Sgurr Mor (Beinn Alligin) 986m\n 165- Ben Vorlich (Loch Earn) 985m\n 166- An Gearanach 982m\n 167- Mullach na Dheiragain 982m\n 168- Creag Mhor (Meall na Aighean) 981m\n 169- Maol chinn-dearg 981m\n 170- Slioch 981m\n 171- Stob Coire a Chairn 981m\n 172- Beinn a Chochuill 980m\n 173- Ciste Dhubh 979m\n 174- Stob Coire Sgriodain 979m\n 175- Beinn Dubhchraig 978m\n 176- Cona Mheall 978m\n 177- Meall nan Ceapraichean 977m\n 178- Stob Ban (Grey Corries) 977m\n 179- A Mharconaich 975m\n 180- Carn a Gheoidh 975m\n 181- Carn Liath (Beinn a Ghlo) 975m\n 182- Stuc a Chroin 975m\n 183- Beinn Sgritheall 974m\n 184- Ben Lomond 974m\n 185- Sgurr a Ghreadaidh 973m\n 186- Meall Garbh (Carn Mairg) 968m\n 187- A Mhaighdean 967m\n 188- Sgorr nam Fiannaidh (Aonach Eagach) 967m\n 189- Ben More (Mull) 966m\n 190- Sgurr na Banachdich 965m\n 191- Sgurr nan Gillean 964m\n 192- Carn a Chlamain 963m\n 193- Sgurr Thuilm 963m\n 194- Sgorr Ruadh 962m\n 195- Ben Klibreck 961m\n 196- Beinn nan Aighenan 960m\n 197- Stuchd an Lochain 960m\n 198- Beinn Fhionnlaidh 959m\n 199- Meall Glas 959m\n 200- Bruach na Frithe 958m\n 201- Tolmount 958m\n 202- Carn Ghluasaid 957m\n 203- Tom Buidhe 957m\n 204- Saileag 956m\n 205- Sgurr nan Coireachan (Glenfinnan) 956m\n 206- Stob Dubh (Buachaille Etive Beag) 956m\n 207- Stob na Broige (Buachaille Etive Mor) 956m\n 208- Sgor Gaibhre 955m\n 209- Am Faochagach 954m\n 210- Beinn Liath Mhor Fannaich 954m\n 211- Beinn Mhanach 953m\n 212- Meall Dearg (Aonach Eagach) 953m\n 213- Sgurr nan Coireachan (Glen Dessary) 953m\n 214- Meall Chuaich 951m\n 215- Meall Gorm 949m\n 216- Beinn Bhuidhe 948m\n 217- Sgurr Mhic Choinnich 948m\n 218- Creag aMhaim 947m\n 219- Driesh 947m\n 220- Beinn Tulaichean 946m\n 221- Carn Bhac 946m\n 222- Meall Buidhe (Knoydart) 946m\n 223- Bidein a Choire Sheasgaich 945m\n 224- Carn Dearg (Monadhliath) 945m\n 225- Sgurr na Sgìne 945m\n 226- Stob a Choire Odhair 945m\n 227- An Socach (Braemar) 944m\n 228- Sgurr Dubh Mor 944m\n 229- Ben Vorlich (Loch Lomond) 943m\n 230- Binnein Beag 943m\n 231- Beinn a Chroin 942m\n 232- Carn Dearg (Corrour) 941m\n 233- Carn na Caim 941m\n 234- Luinne Bheinn 939m\n 235- Mount Keen 939m\n 236- Mullach nan Coirean 939m\n 237- Beinn na Lap 937m\n 238- Beinn Sgulaird 937m\n 239- Beinn Tarsuinn 937m\n 240- Sron a Choire Ghairbh 937m\n 241- A Bhuidheanach Bheag 936m\n 242- Am Basteir 934m\n 243- Meall a Chrasgaidh 934m\n 244- Beinn Chabhair 933m\n 245- Fionn Bheinn 933m\n 246- Maol Chean-dearg 933m\n 247- The Cairnwell 933m\n 248- Meall Buidhe (Glen Lyon) 932m\n 249- Beinn Bhreac 931m\n 250- Ben Chonzie 931m\n 251- A Chailleach (Monadhliath) 930m\n 252- Bla Bheinn 928m\n 253- Mayar 928m\n 254- Meall nan Eun 928m\n 255- Moruisg 928m\n 256- Ben Hope 927m\n 257- Eididh nan Clach Geala 927m\n 258- Beinn Liath Mhor 926m\n 259- Beinn Narnain 926m\n 260- Geal Charn (Monadhliath) 926m\n 261- Meall a Choire Leith 926m\n 262- Seana Bhraigh 926m\n 263- Stob Coire Raineach 925m\n 264- Creag Pitridh 924m\n 265- Sgurr nan Eag 924m\n 266- An Coileachan 923m\n 267- Sgurr nan Each 923m\n 268- Tom na Gruagaich (Beinn Alligin) 922m\n 269- An Socach (Affric) 921m\n 270- Sgiath Chuil 921m\n 271- Carn Sgulain 920m\n 272- Gairich 919m\n 273- A Ghlas-bheinn 918m\n 274- Creag nan Damh 918m\n 275- Meall na Teanga 918m\n 276- Ruadh Stac Mor 918m\n 277- Sgurr a Mhadaidh 918m\n 278- Carn Aosda 917m\n 279- Geal-charn (Drumochter) 917m\n 280- Beinn a Chleibh 916m\n 281- Beinn Teallach 915m\n 282- Ben Vane 915m\n "),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        textView17.check(matches(isDisplayed()));

        ViewInteraction appCompatImageView5 = onView(
                allOf(withId(R.id.menu_icon),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView5.perform(click());

        ViewInteraction linearLayout8 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(android.R.id.content),
                                0),
                        9),
                        isDisplayed()));
        linearLayout8.perform(click());

        ViewInteraction button16 = onView(
                allOf(withText("ROAM AGAIN"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button16.check(matches(isDisplayed()));

        ViewInteraction textView18 = onView(
                allOf(withId(R.id.loggedOutText), withText("You have successfully logged out"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView18.check(matches(withText("You have successfully logged out")));

        ViewInteraction materialButton8 = onView(
                allOf(withText("Roam Again"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        materialButton8.perform(click());

        ViewInteraction button17 = onView(
                allOf(withId(R.id.loginButton), withText("ROAM"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button17.check(matches(isDisplayed()));

        ViewInteraction editText9 = onView(
                allOf(withId(R.id.emailLogin), withText("E-Mail"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        editText9.check(matches(withText("E-Mail")));

        ViewInteraction editText10 = onView(
                allOf(withId(R.id.loginPasswordText), withText("Password"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        editText10.check(matches(withText("Password")));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
