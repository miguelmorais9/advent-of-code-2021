import java.util.HashMap;

public class Input {

    static String day1 = "171\n173\n174\n163\n161\n157\n156\n154\n152\n156\n151\n153\n132\n135\n151\n143\n141\n149\n145\n147\n142\n143\n139\n141\n144\n147\n137\n144\n147\n153\n151\n153\n157\n185\n186\n185\n181\n161\n177\n179\n177\n178\n173\n175\n183\n181\n191\n189\n186\n189\n192\n191\n189\n199\n208\n218\n216\n210\n209\n208\n215\n207\n198\n202\n204\n205\n204\n203\n205\n207\n208\n209\n218\n234\n231\n245\n244\n243\n265\n264\n279\n282\n283\n274\n276\n279\n281\n279\n258\n256\n289\n297\n300\n304\n308\n298\n302\n317\n316\n315\n314\n296\n298\n301\n298\n293\n300\n293\n290\n286\n282\n278\n280\n283\n292\n297\n315\n323\n324\n321\n324\n332\n334\n366\n375\n382\n388\n395\n400\n410\n405\n407\n408\n405\n403\n426\n425\n423\n440\n444\n469\n471\n472\n498\n501\n498\n499\n500\n502\n514\n515\n516\n518\n517\n516\n507\n514\n521\n523\n521\n513\n518\n531\n543\n546\n540\n528\n529\n520\n530\n533\n534\n532\n535\n538\n545\n550\n548\n534\n552\n555\n570\n571\n589\n595\n594\n598\n594\n597\n585\n568\n558\n545\n549\n543\n544\n548\n528\n533\n511\n510\n511\n504\n505\n510\n511\n514\n486\n506\n508\n474\n475\n485\n501\n498\n499\n500\n504\n502\n510\n507\n512\n508\n515\n517\n521\n537\n536\n532\n533\n532\n531\n535\n547\n558\n547\n546\n573\n591\n593\n576\n577\n580\n581\n588\n595\n594\n589\n586\n600\n602\n594\n593\n598\n586\n587\n583\n571\n564\n561\n562\n559\n569\n568\n547\n551\n554\n565\n575\n574\n573\n568\n567\n570\n578\n575\n573\n555\n557\n571\n572\n579\n593\n609\n611\n612\n614\n613\n614\n616\n615\n616\n610\n621\n626\n620\n621\n620\n622\n623\n627\n625\n628\n618\n615\n606\n597\n602\n603\n601\n624\n623\n621\n633\n643\n638\n641\n642\n641\n643\n633\n632\n642\n649\n636\n642\n662\n670\n683\n702\n712\n713\n714\n720\n725\n726\n724\n723\n722\n691\n692\n693\n674\n671\n664\n665\n678\n681\n682\n680\n681\n693\n694\n691\n693\n694\n691\n692\n691\n692\n691\n692\n693\n684\n686\n706\n705\n696\n683\n688\n698\n701\n700\n708\n691\n689\n688\n693\n680\n681\n683\n701\n709\n715\n716\n706\n686\n683\n676\n680\n681\n687\n676\n691\n705\n702\n703\n704\n709\n713\n716\n717\n715\n716\n715\n703\n714\n720\n708\n692\n665\n654\n664\n663\n649\n652\n676\n666\n682\n683\n687\n679\n680\n699\n706\n730\n729\n728\n732\n733\n727\n728\n738\n741\n744\n742\n722\n725\n722\n716\n717\n713\n712\n703\n704\n705\n699\n700\n706\n709\n692\n693\n688\n689\n698\n695\n696\n700\n701\n688\n689\n696\n678\n669\n674\n675\n663\n664\n675\n662\n667\n671\n679\n683\n682\n716\n717\n720\n724\n737\n727\n737\n739\n716\n733\n728\n723\n741\n743\n732\n727\n729\n732\n724\n721\n717\n716\n730\n743\n742\n740\n743\n734\n735\n733\n734\n747\n741\n713\n721\n719\n743\n745\n768\n769\n775\n774\n773\n785\n789\n788\n784\n773\n809\n808\n807\n808\n809\n806\n790\n785\n806\n811\n809\n812\n814\n817\n821\n822\n823\n829\n826\n827\n828\n830\n832\n827\n828\n827\n828\n843\n844\n843\n842\n829\n830\n834\n841\n843\n863\n858\n867\n871\n888\n890\n873\n874\n860\n874\n871\n877\n878\n877\n885\n886\n893\n888\n887\n888\n889\n876\n871\n855\n850\n851\n853\n850\n855\n868\n870\n871\n886\n896\n878\n882\n893\n867\n862\n860\n861\n862\n859\n871\n875\n874\n870\n864\n867\n864\n867\n868\n872\n880\n866\n867\n874\n878\n864\n872\n870\n859\n852\n857\n869\n872\n876\n882\n894\n872\n873\n860\n861\n862\n858\n859\n865\n858\n834\n830\n801\n804\n799\n802\n804\n800\n776\n779\n790\n793\n796\n800\n804\n803\n799\n790\n788\n783\n785\n807\n802\n783\n796\n808\n782\n778\n779\n794\n800\n809\n821\n828\n826\n827\n835\n836\n840\n857\n855\n859\n870\n861\n838\n837\n843\n823\n821\n812\n811\n827\n828\n818\n819\n811\n813\n799\n801\n784\n788\n793\n797\n803\n785\n786\n785\n774\n776\n777\n778\n776\n774\n775\n778\n779\n772\n776\n774\n773\n777\n778\n779\n777\n781\n769\n760\n746\n752\n748\n754\n758\n768\n786\n784\n783\n769\n770\n782\n796\n785\n774\n775\n781\n779\n780\n769\n757\n758\n774\n790\n792\n795\n805\n804\n803\n802\n792\n795\n800\n801\n796\n797\n790\n791\n797\n801\n797\n807\n801\n796\n799\n794\n783\n759\n784\n809\n810\n824\n815\n812\n845\n846\n848\n849\n869\n868\n886\n888\n896\n904\n902\n905\n900\n907\n912\n890\n891\n892\n893\n911\n912\n916\n924\n926\n897\n885\n886\n881\n878\n879\n908\n907\n901\n902\n919\n915\n905\n906\n941\n939\n944\n945\n946\n939\n936\n952\n951\n963\n958\n972\n1000\n1017\n1003\n1002\n1004\n1005\n990\n989\n992\n993\n987\n1003\n1004\n1003\n1006\n1011\n989\n1000\n999\n1001\n1008\n1012\n1013\n1024\n1038\n1039\n1024\n1027\n1021\n1036\n1034\n1053\n1061\n1064\n1104\n1105\n1106\n1085\n1086\n1090\n1097\n1098\n1101\n1086\n1087\n1084\n1069\n1070\n1069\n1074\n1071\n1070\n1074\n1060\n1058\n1068\n1054\n1060\n1054\n1055\n1053\n1054\n1042\n1043\n1045\n1044\n1042\n1043\n1027\n1030\n1031\n1030\n1029\n1041\n1045\n1048\n1049\n1043\n1040\n1049\n1050\n1051\n1054\n1056\n1048\n1045\n1044\n1043\n1046\n1063\n1077\n1105\n1108\n1110\n1126\n1127\n1131\n1133\n1130\n1135\n1141\n1168\n1175\n1172\n1156\n1136\n1137\n1136\n1135\n1137\n1156\n1154\n1158\n1163\n1151\n1152\n1168\n1176\n1177\n1172\n1173\n1187\n1196\n1197\n1192\n1191\n1180\n1186\n1185\n1186\n1189\n1198\n1196\n1195\n1196\n1197\n1191\n1171\n1172\n1154\n1184\n1170\n1171\n1169\n1179\n1178\n1186\n1187\n1189\n1196\n1183\n1180\n1182\n1170\n1155\n1133\n1126\n1127\n1126\n1118\n1117\n1126\n1128\n1147\n1148\n1144\n1160\n1171\n1177\n1179\n1180\n1162\n1152\n1150\n1149\n1156\n1169\n1165\n1164\n1165\n1179\n1178\n1179\n1181\n1191\n1186\n1187\n1179\n1180\n1181\n1177\n1182\n1185\n1189\n1201\n1243\n1242\n1239\n1240\n1242\n1243\n1231\n1232\n1242\n1254\n1264\n1267\n1268\n1271\n1272\n1265\n1260\n1263\n1266\n1254\n1266\n1261\n1251\n1252\n1214\n1212\n1222\n1225\n1226\n1235\n1245\n1255\n1256\n1255\n1252\n1254\n1250\n1252\n1257\n1259\n1270\n1271\n1281\n1279\n1286\n1273\n1290\n1291\n1290\n1297\n1295\n1294\n1289\n1300\n1307\n1304\n1305\n1311\n1301\n1306\n1310\n1306\n1305\n1306\n1308\n1310\n1316\n1326\n1330\n1336\n1318\n1337\n1313\n1316\n1329\n1324\n1331\n1338\n1337\n1335\n1336\n1340\n1350\n1364\n1365\n1366\n1352\n1353\n1354\n1361\n1375\n1367\n1371\n1372\n1375\n1390\n1393\n1392\n1391\n1388\n1391\n1392\n1394\n1396\n1420\n1421\n1424\n1425\n1427\n1420\n1421\n1426\n1428\n1432\n1430\n1439\n1444\n1446\n1435\n1437\n1438\n1437\n1444\n1448\n1453\n1469\n1473\n1476\n1477\n1464\n1457\n1460\n1476\n1479\n1477\n1479\n1495\n1494\n1499\n1504\n1502\n1494\n1508\n1507\n1508\n1506\n1504\n1492\n1503\n1512\n1511\n1493\n1500\n1509\n1527\n1542\n1547\n1542\n1551\n1555\n1557\n1566\n1610\n1611\n1616\n1620\n1616\n1635\n1646\n1647\n1645\n1666\n1667\n1656\n1654\n1645\n1648\n1651\n1666\n1670\n1673\n1671\n1669\n1680\n1669\n1670\n1693\n1696\n1698\n1697\n1722\n1727\n1740\n1743\n1742\n1743\n1744\n1762\n1785\n1788\n1777\n1778\n1779\n1784\n1811\n1806\n1824\n1791\n1792\n1793\n1795\n1792\n1791\n1789\n1790\n1802\n1803\n1811\n1809\n1842\n1843\n1854\n1857\n1842\n1847\n1856\n1859\n1865\n1867\n1868\n1883\n1875\n1874\n1877\n1878\n1877\n1862\n1876\n1882\n1864\n1865\n1868\n1867\n1869\n1850\n1849\n1839\n1840\n1845\n1843\n1855\n1856\n1877\n1875\n1877\n1880\n1861\n1889\n1891\n1894\n1889\n1905\n1907\n1911\n1894\n1897\n1908\n1909\n1911\n1913\n1918\n1919\n1916\n1915\n1918\n1919\n1924\n1941\n1942\n1952\n1962\n1963\n1948\n1947\n1949\n1955\n1950\n1949\n1938\n1940\n1950\n1948\n1947\n1935\n1936\n1935\n1937\n1929\n1930\n1931\n1937\n1938\n1932\n1933\n1940\n1933\n1957\n1958\n1983\n1987\n1986\n1985\n1991\n1992\n2006\n2007\n2008\n2007\n2021\n2022\n2033\n2035\n2025\n2029\n2037\n2053\n2052\n2053\n2044\n2048\n2055\n2043\n2033\n2002\n2006\n2007\n2009\n2008\n2010\n2012\n2015\n2006\n2007\n2008\n2007\n2025\n2022\n2036\n2049\n2075\n2076\n2046\n2050\n2052\n2067\n2068\n2069\n2059\n2077\n2079\n2098\n2101\n2106\n2107\n2106\n2108\n2117\n2100\n2094\n2093\n2092\n2091\n2089\n2098\n2096\n2098\n2109\n2112\n2113\n2116\n2111\n2115\n2122\n2120\n2116\n2117\n2123\n2140\n2145\n2125\n2117\n2118\n2116\n2120\n2133\n2135\n2178\n2192\n2189\n2194\n2196\n2198\n2199\n2193\n2195\n2187\n2189\n2205\n2218\n2203\n2207\n2206\n2204\n2210\n2209\n2230\n2229\n2226\n2222\n2255\n2250\n2275\n2276\n2277\n2299\n2304\n2307\n2306\n2320\n2324\n2340\n2341\n2344\n2343\n2348\n2349\n2351\n2331\n2334\n2333\n2337\n2339\n2344\n2357\n2355\n2356\n2340\n2325\n2324\n2340\n2351\n2352\n2350\n2379\n2386\n2387\n2388\n2382\n2358\n2354\n2360\n2361\n2367\n2358\n2356\n2353\n2339\n2342\n2343\n2342\n2343\n2345\n2347\n2350\n2347\n2349\n2347\n2348\n2355\n2324\n2322\n2321\n2322\n2336\n2337\n2338\n2342\n2358\n2359\n2363\n2347\n2332\n2322\n2320\n2327\n2329\n2319\n2300\n2305\n2308\n2311\n2310\n2309\n2314\n2321\n2326\n2324\n2342\n2344\n2360\n2322\n2323\n2314\n2309\n2300\n2299\n2300\n2295\n2296\n2309\n2316\n2315\n2319\n2316\n2319\n2318\n2327\n2328\n2330\n2336\n2338\n2345\n2361\n2350\n2352\n2360\n2363\n2401\n2398\n2407\n2403\n2388\n2390\n2377\n2392\n2389\n2394\n2402\n2399\n2388\n2393\n2397\n2395\n2404\n2418\n2432\n2412\n2436\n2430\n2459\n2454\n2452\n2453\n2446\n2448\n2445\n2454\n2448\n2454\n2464\n2454\n2464\n2491\n2504\n2503\n2513\n2514\n2516\n2511\n2517\n2505\n2508\n2509\n2507\n2513\n2517\n2515\n2522\n2533\n2548\n2549\n2553\n2552\n2554\n2557\n2562\n2565\n2566\n2567\n2573\n2574\n2570\n2573\n2575\n2580\n2583\n2584\n2589\n2592\n2593\n2592\n2594\n2595\n2594\n2584\n2588\n2595\n2573\n2572\n2581\n2589\n2591\n2595\n2589\n2615\n2628\n2640\n2651\n2650\n2636\n2637\n2606\n2609\n2614\n2620\n2623\n2632\n2635\n2645\n2647\n2642\n2643\n2644\n2650\n2649\n2660\n2634\n2627\n2628\n2634\n2636\n2638\n2628\n2627\n2631\n2629\n2628\n2638\n2628\n2627\n2628\n2630\n2640\n2649\n2656\n2657\n2679\n2680\n2684\n2694\n2693\n2694\n2693\n2704\n2714\n2720\n2735\n2753\n2758\n2767\n2768\n2772\n2761\n2762\n2760\n2740\n2738\n2757\n2758\n2793\n2795\n2793\n2794\n2803\n2808\n2802\n2811\n2807\n2813\n2817\n2818\n2826\n2830\n2867\n2855\n2860\n2864\n2843\n2838\n2842\n2840\n2849\n2845\n2837\n2841\n2837\n2833\n2823\n2820\n2829\n2853\n2860\n2861\n2862\n2883\n2888\n2852\n2863\n2862\n2860\n2864\n2865\n2870\n2869\n2874\n2863\n2872\n2874\n2882\n2893\n2903\n2907\n2936\n2940\n2945\n2956\n2972\n2989\n2988\n2974\n2976\n2977\n2979\n2980\n2981\n2983\n2971\n2970\n2973\n2974\n2976\n3004\n2999\n3001\n3008\n3009\n3013\n3016\n3027\n3043\n3026\n3031\n3034\n3040\n3055\n3054\n3080\n3082\n3090\n3092\n3091\n3090\n3089\n3082\n3084\n3081\n3086\n3084\n3086\n3083\n3090\n3094\n3096\n3102\n3110\n3111\n3094\n3100\n3123\n3134\n3135\n3142\n3136\n3134\n3113\n3112\n3111\n3123\n3124\n3121\n3120\n3126\n3127\n3126\n3127\n3113\n3111\n3126\n3141\n3142\n3137\n3139\n3098\n3103\n3115\n3119\n3117\n3114\n3119\n3120\n3093\n3092\n3099\n3104\n3105\n3106\n3121\n3122\n3124\n3131\n3141\n3131\n3132\n3147\n3149\n3156\n3123\n3122\n3108\n3117\n3119\n3139\n3157\n3152\n3146\n3112\n3113\n3112\n3114\n3091\n3071\n3072\n3082\n3083\n3084\n3098\n3102\n3109\n3111\n3109\n3110\n3101\n3100\n3102\n3103\n3108\n3114\n3113\n3115\n3116\n3117\n3120\n3119\n3117\n3150\n3152\n3153\n3155\n3154\n3157\n3150\n3143\n3144\n3139\n3127\n3102\n3123\n3122\n3138\n3140\n3145\n3146\n3139\n3141\n3153\n3154\n3155\n3127\n3129\n3131\n3132\n3130\n3131\n3161\n3190\n3200\n3179\n3178\n3169\n3167\n3171\n3191\n3205\n3203\n3208\n3214\n3215\n3217\n3218\n3224\n3228\n3229\n3215\n3214\n3237\n3246\n3223\n3220\n3209\n3207\n3220\n3233\n3238\n3234\n3211\n3216\n3220\n3221\n3216\n3219\n3218\n3217\n3221\n3223\n3228\n3224\n3244\n3245\n3251\n3250\n3256\n3257\n3258\n3262\n3264\n3265\n3263\n3272\n3274\n3255\n3254\n3266\n3267\n3264\n3267\n3280\n3282".formatted();
    static String day2 = "forward 7\ndown 1\nforward 9\nforward 4\nforward 7\ndown 8\nforward 9\ndown 2\nforward 5\ndown 3\nforward 5\nup 7\nforward 3\ndown 7\ndown 8\nup 2\ndown 4\ndown 7\nforward 1\nforward 9\ndown 9\nforward 7\nforward 8\nup 9\ndown 6\ndown 7\nforward 1\nforward 5\nforward 3\ndown 3\ndown 4\nforward 1\nforward 1\nforward 7\ndown 4\nforward 6\nforward 1\nforward 9\nforward 4\nforward 6\nforward 6\ndown 5\ndown 4\ndown 8\nup 9\nup 9\ndown 6\ndown 6\nforward 4\nforward 1\ndown 1\nforward 7\ndown 1\nforward 3\nforward 7\nforward 3\nup 8\ndown 7\ndown 4\nforward 7\nforward 1\nforward 2\ndown 1\ndown 4\nup 2\nup 8\nforward 6\nforward 5\ndown 9\nup 8\nforward 1\nup 9\ndown 7\nforward 1\nforward 5\nup 1\nup 7\ndown 1\ndown 5\nforward 9\ndown 5\nup 5\nforward 8\nforward 9\ndown 8\nforward 1\ndown 1\nforward 7\ndown 8\nup 4\nforward 9\nup 1\ndown 7\nforward 4\nup 8\ndown 5\ndown 2\ndown 1\nforward 5\nforward 3\nup 5\nforward 6\nup 1\nup 6\nup 2\nup 6\nup 5\ndown 6\nforward 5\ndown 4\nforward 7\nup 5\ndown 3\nforward 9\ndown 5\ndown 2\nup 2\nforward 2\ndown 1\nup 3\ndown 8\nforward 8\ndown 8\nforward 6\nforward 4\nforward 7\nforward 6\nup 6\ndown 4\nforward 7\nforward 9\nforward 2\nforward 5\ndown 4\nforward 4\nforward 9\nforward 2\ndown 2\nforward 8\nup 8\nforward 1\ndown 6\nforward 5\ndown 4\ndown 4\ndown 7\ndown 5\nforward 7\nforward 7\ndown 9\nup 9\nforward 4\ndown 2\nforward 6\ndown 4\nforward 8\nforward 4\nup 5\nforward 8\ndown 2\nforward 8\nforward 6\nforward 9\ndown 7\nforward 1\nforward 1\nforward 1\ndown 3\nforward 2\ndown 5\nforward 3\nforward 8\nforward 4\nforward 7\nforward 8\nup 7\ndown 2\nup 7\nforward 4\nforward 7\ndown 4\ndown 7\ndown 3\ndown 8\nforward 2\ndown 2\nforward 2\ndown 6\nforward 2\ndown 8\nforward 2\nforward 5\ndown 5\nforward 4\ndown 7\nup 8\nup 7\ndown 2\ndown 1\nforward 4\ndown 2\nforward 9\ndown 2\ndown 2\nforward 7\nforward 3\nforward 6\nup 8\nup 7\nforward 1\nforward 3\ndown 9\ndown 1\nforward 8\ndown 7\nup 8\ndown 3\nup 4\nforward 9\nforward 6\nup 6\nup 4\ndown 2\ndown 4\nforward 7\ndown 2\ndown 9\nforward 1\nforward 9\ndown 6\nforward 1\ndown 8\nforward 9\ndown 9\ndown 6\nup 4\nforward 5\nup 9\ndown 2\nforward 7\ndown 1\ndown 1\ndown 7\ndown 4\ndown 1\ndown 6\nforward 4\nforward 6\nup 1\ndown 8\ndown 4\nforward 1\ndown 5\ndown 4\nup 1\ndown 9\nforward 1\ndown 1\nup 8\nforward 8\nforward 8\ndown 5\ndown 2\ndown 3\nforward 1\ndown 1\nforward 3\ndown 7\nforward 7\nforward 1\nforward 3\nforward 5\nforward 3\ndown 8\nforward 1\nup 2\nup 3\ndown 4\ndown 4\nup 4\ndown 4\nup 8\ndown 8\ndown 7\ndown 6\nforward 5\ndown 3\nforward 2\nup 9\ndown 7\nforward 2\ndown 1\ndown 3\ndown 7\ndown 1\nforward 7\ndown 2\ndown 9\ndown 7\nup 1\ndown 5\nforward 7\nforward 2\nforward 7\nforward 3\ndown 2\ndown 8\nup 3\ndown 3\nforward 3\ndown 2\nup 7\nup 1\nforward 5\ndown 6\ndown 3\nforward 6\nforward 8\nforward 2\ndown 9\ndown 1\ndown 1\ndown 4\nforward 8\ndown 3\nup 3\nup 4\nforward 3\nforward 7\ndown 3\nup 6\ndown 8\nup 4\nup 3\nforward 5\ndown 9\ndown 2\nforward 6\nforward 4\nup 6\nup 1\nforward 4\nforward 7\nforward 1\nforward 8\nforward 3\nforward 3\nforward 9\nforward 4\nforward 4\nforward 4\nforward 2\nforward 7\ndown 8\nforward 5\nup 1\nforward 3\nforward 7\ndown 3\nforward 7\nup 6\nforward 4\nup 2\ndown 7\ndown 4\nup 3\nup 7\ndown 1\nforward 5\nup 7\nup 7\ndown 7\ndown 9\ndown 7\nforward 5\nforward 7\ndown 1\ndown 5\ndown 6\nforward 6\nup 7\nforward 7\nforward 6\ndown 4\ndown 3\ndown 9\nup 5\ndown 9\ndown 3\nforward 8\nforward 1\nforward 5\ndown 6\nforward 7\ndown 7\nforward 8\ndown 9\nup 1\nup 2\nforward 2\ndown 4\nup 1\nforward 2\nforward 9\ndown 8\nforward 3\nup 3\nup 3\nforward 3\ndown 7\ndown 5\nforward 2\nup 3\nforward 3\nforward 5\nup 5\nforward 3\ndown 1\ndown 3\ndown 6\ndown 1\nforward 7\nforward 6\ndown 5\ndown 2\nforward 7\ndown 3\nforward 2\nforward 2\nforward 2\ndown 1\nforward 4\nforward 5\ndown 8\nup 8\nup 7\ndown 7\nforward 9\ndown 8\nforward 1\nforward 6\nup 3\nforward 8\nup 9\ndown 6\ndown 9\nup 4\ndown 1\nforward 1\nup 7\ndown 4\nforward 7\nforward 4\ndown 2\nforward 3\nforward 4\ndown 7\nforward 5\nup 8\ndown 9\ndown 3\nforward 3\nforward 8\ndown 7\nforward 1\nup 7\ndown 7\nforward 7\ndown 9\ndown 6\ndown 3\ndown 1\nup 5\nup 6\nforward 8\ndown 8\nup 1\nforward 6\nup 2\ndown 6\ndown 7\ndown 5\nforward 7\nup 3\nup 6\ndown 3\nup 9\nforward 9\ndown 2\ndown 4\nup 2\nforward 7\ndown 7\nup 4\nforward 2\ndown 4\nforward 7\nup 9\nforward 4\nforward 9\ndown 8\nup 2\nup 2\nforward 2\nup 8\nforward 1\nforward 8\nforward 8\ndown 9\nforward 6\nup 1\ndown 3\ndown 4\ndown 6\nforward 6\nup 6\ndown 2\ndown 1\ndown 1\nforward 9\nforward 2\ndown 7\ndown 8\ndown 6\ndown 3\nforward 1\nup 6\nup 4\nforward 3\ndown 1\nforward 6\ndown 8\nforward 6\nforward 5\ndown 3\ndown 5\nup 2\ndown 7\nforward 8\ndown 8\nup 3\ndown 4\ndown 3\ndown 4\nup 9\nup 6\nforward 5\nforward 8\ndown 8\nforward 1\nforward 8\ndown 1\ndown 3\ndown 4\ndown 6\nforward 3\ndown 8\ndown 9\ndown 3\nforward 3\nforward 2\nforward 2\ndown 1\nup 7\ndown 6\nup 2\ndown 9\ndown 4\ndown 3\ndown 5\ndown 4\nforward 4\nup 8\nforward 1\ndown 9\ndown 3\ndown 3\ndown 8\ndown 5\nup 6\nup 5\ndown 7\ndown 3\ndown 7\nforward 1\nup 5\ndown 1\nforward 1\ndown 7\ndown 9\ndown 3\nforward 1\nforward 7\ndown 8\nforward 5\nup 5\nforward 2\ndown 6\nforward 2\ndown 2\nforward 2\nup 7\ndown 2\ndown 5\ndown 2\nforward 7\nforward 2\nforward 4\ndown 2\ndown 7\ndown 6\nforward 9\ndown 8\ndown 3\ndown 6\nforward 7\ndown 3\ndown 4\ndown 7\ndown 7\ndown 1\nup 8\nup 7\nup 6\ndown 8\nup 8\nforward 8\ndown 2\ndown 4\nforward 7\nforward 4\ndown 5\ndown 4\ndown 3\nforward 6\nup 9\ndown 1\ndown 3\ndown 4\ndown 7\nup 3\nup 4\nforward 1\nup 4\ndown 9\nup 4\nup 3\ndown 1\ndown 2\nforward 5\nup 4\ndown 1\ndown 4\ndown 8\ndown 1\nup 6\ndown 6\nforward 8\nforward 7\ndown 5\ndown 6\ndown 5\ndown 6\ndown 9\nforward 6\ndown 6\ndown 7\nforward 3\ndown 2\ndown 9\nup 2\ndown 6\nforward 2\nforward 6\nforward 4\ndown 4\nforward 8\nforward 2\nforward 7\nforward 4\ndown 9\nforward 6\ndown 6\nforward 1\ndown 4\ndown 5\nforward 5\nup 5\nforward 7\nup 2\ndown 9\nforward 9\ndown 9\nforward 9\nforward 3\nforward 7\nforward 5\nforward 1\ndown 5\nforward 5\ndown 3\ndown 2\nup 9\ndown 7\ndown 2\nforward 3\ndown 8\ndown 6\ndown 7\nup 5\nup 9\ndown 6\ndown 8\ndown 5\ndown 8\nforward 4\nforward 5\ndown 2\ndown 1\nforward 6\ndown 6\nforward 9\nforward 2\nforward 1\ndown 3\nforward 8\nforward 6\nup 7\nforward 5\ndown 4\nup 7\ndown 6\ndown 3\nup 8\nforward 5\nforward 5\ndown 1\ndown 7\nforward 2\ndown 5\nforward 3\nforward 6\nforward 6\nup 5\ndown 4\ndown 2\nforward 7\nup 8\nforward 5\nup 7\nforward 6\nforward 6\nforward 6\nup 7\ndown 1\ndown 4\ndown 4\nforward 5\ndown 5\nup 7\ndown 7\nforward 8\ndown 6\ndown 2\nforward 3\ndown 8\nup 3\ndown 2\nforward 7\ndown 1\nforward 3\nup 1\nup 4\ndown 4\nup 6\ndown 1\ndown 2\nforward 9\nup 8\nforward 3\ndown 2\nforward 3\ndown 7\nup 6\nforward 9\ndown 3\ndown 9\nup 5\ndown 9\ndown 6\nforward 8\nforward 5\ndown 8\nforward 5\nforward 9\nup 1\ndown 3\nup 2\ndown 1\ndown 2\ndown 8\nforward 9\nforward 9\ndown 7\ndown 7\ndown 5\ndown 1\ndown 7\nup 1\nup 1\nforward 8\ndown 6\nup 8\ndown 7\ndown 1\nforward 1\nforward 4\ndown 9\nup 2\ndown 6\nforward 2\ndown 4\nforward 7\nup 8\ndown 3\nforward 9\ndown 7\nup 7\ndown 6\ndown 9\ndown 2\nup 7\ndown 3\ndown 9\nforward 7\ndown 7\nup 6\ndown 5\ndown 4\nup 1\ndown 1\nup 7\nup 9\ndown 1\nforward 6\nforward 3\ndown 5\ndown 1\nup 8\nforward 9\nforward 6\ndown 1\nup 3\ndown 2\nforward 3\nup 6\ndown 5\ndown 3\nup 7\ndown 8\ndown 5\ndown 3\nforward 6\nup 8\ndown 4\nforward 3\nforward 5\nforward 9\nforward 1\nup 4\nforward 8\nforward 9\nforward 1\nup 9\nup 4\nforward 4\nforward 4\nforward 8\nup 5\nup 2\ndown 7\ndown 4\nup 5\ndown 5\nforward 6\nup 8\ndown 5\ndown 7\ndown 3\nup 2\nup 2\nforward 3\nforward 5\nforward 1\nforward 9\nforward 1\ndown 2\ndown 2\nup 6\nup 6\ndown 5\ndown 3\ndown 4\nforward 4\ndown 6\nup 6\nforward 8\ndown 9\nforward 2\nforward 6\ndown 7\nforward 3\ndown 2\ndown 5\nup 3\nforward 6\nforward 7\nforward 3\nforward 4\ndown 9\nup 9\nforward 7\ndown 8\nforward 1\ndown 2\nup 5\nup 9\nforward 8\nup 5\nforward 7\nup 6\nforward 9\ndown 6\nforward 4\ndown 4\nforward 7\nup 8\ndown 8\ndown 7\ndown 9\nup 1\ndown 5\nforward 6\ndown 9\ndown 2\ndown 2\ndown 6\ndown 6\nforward 8\nforward 5\nup 7\nforward 9\nforward 3\nforward 8\nforward 8\ndown 7\nup 1\ndown 4\nforward 7\nup 5\ndown 9\ndown 7\nforward 8\ndown 3\nup 2\ndown 7\nforward 3\nup 8\nforward 4\nup 2\nforward 1\nforward 4\nforward 5\nforward 3\nforward 6\ndown 9\nup 7\nforward 7\nup 6\ndown 2\ndown 5\nforward 2\nforward 8\ndown 3\nforward 6\ndown 6\nforward 4\nup 3\nforward 3\ndown 4\nup 3\nforward 6\nforward 7\ndown 5\nforward 5\ndown 9\nforward 7\ndown 5\ndown 6\nforward 9".formatted();

}

