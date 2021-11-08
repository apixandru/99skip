<div class="blob-viewer" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-type="simple" data-url="/redhat/centos-stream/src/apache-commons-lang3/-/blob/c8s-stream-3.6/src/main/java/org/apache/commons/lang3/StringUtils.java?format=json&amp;viewer=simple" data-loaded="true"><div class="blob-viewer" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-type="simple">
<div class="file-content code js-syntax-highlight white" id="blob-content">
<div class="line-numbers">
<a class="file-line-num diff-line-num" data-line-number="1" href="#L1" id="L1">
1
</a>
<a class="file-line-num diff-line-num" data-line-number="2" href="#L2" id="L2">
2
</a>
<a class="file-line-num diff-line-num" data-line-number="3" href="#L3" id="L3">
3
</a>
<a class="file-line-num diff-line-num" data-line-number="4" href="#L4" id="L4">
4
</a>
<a class="file-line-num diff-line-num" data-line-number="5" href="#L5" id="L5">
5
</a>
<a class="file-line-num diff-line-num" data-line-number="6" href="#L6" id="L6">
6
</a>
<a class="file-line-num diff-line-num" data-line-number="7" href="#L7" id="L7">
7
</a>
<a class="file-line-num diff-line-num" data-line-number="8" href="#L8" id="L8">
8
</a>
<a class="file-line-num diff-line-num" data-line-number="9" href="#L9" id="L9">
9
</a>
<a class="file-line-num diff-line-num" data-line-number="10" href="#L10" id="L10">
10
</a>
<a class="file-line-num diff-line-num" data-line-number="11" href="#L11" id="L11">
11
</a>
<a class="file-line-num diff-line-num" data-line-number="12" href="#L12" id="L12">
12
</a>
<a class="file-line-num diff-line-num" data-line-number="13" href="#L13" id="L13">
13
</a>
<a class="file-line-num diff-line-num" data-line-number="14" href="#L14" id="L14">
14
</a>
<a class="file-line-num diff-line-num" data-line-number="15" href="#L15" id="L15">
15
</a>
<a class="file-line-num diff-line-num" data-line-number="16" href="#L16" id="L16">
16
</a>
<a class="file-line-num diff-line-num" data-line-number="17" href="#L17" id="L17">
17
</a>
<a class="file-line-num diff-line-num" data-line-number="18" href="#L18" id="L18">
18
</a>
<a class="file-line-num diff-line-num" data-line-number="19" href="#L19" id="L19">
19
</a>
<a class="file-line-num diff-line-num" data-line-number="20" href="#L20" id="L20">
20
</a>
<a class="file-line-num diff-line-num" data-line-number="21" href="#L21" id="L21">
21
</a>
<a class="file-line-num diff-line-num" data-line-number="22" href="#L22" id="L22">
22
</a>
<a class="file-line-num diff-line-num" data-line-number="23" href="#L23" id="L23">
23
</a>
<a class="file-line-num diff-line-num" data-line-number="24" href="#L24" id="L24">
24
</a>
<a class="file-line-num diff-line-num" data-line-number="25" href="#L25" id="L25">
25
</a>
<a class="file-line-num diff-line-num" data-line-number="26" href="#L26" id="L26">
26
</a>
<a class="file-line-num diff-line-num" data-line-number="27" href="#L27" id="L27">
27
</a>
<a class="file-line-num diff-line-num" data-line-number="28" href="#L28" id="L28">
28
</a>
<a class="file-line-num diff-line-num" data-line-number="29" href="#L29" id="L29">
29
</a>
<a class="file-line-num diff-line-num" data-line-number="30" href="#L30" id="L30">
30
</a>
<a class="file-line-num diff-line-num" data-line-number="31" href="#L31" id="L31">
31
</a>
<a class="file-line-num diff-line-num" data-line-number="32" href="#L32" id="L32">
32
</a>
<a class="file-line-num diff-line-num" data-line-number="33" href="#L33" id="L33">
33
</a>
<a class="file-line-num diff-line-num" data-line-number="34" href="#L34" id="L34">
34
</a>
<a class="file-line-num diff-line-num" data-line-number="35" href="#L35" id="L35">
35
</a>
<a class="file-line-num diff-line-num" data-line-number="36" href="#L36" id="L36">
36
</a>
<a class="file-line-num diff-line-num" data-line-number="37" href="#L37" id="L37">
37
</a>
<a class="file-line-num diff-line-num" data-line-number="38" href="#L38" id="L38">
38
</a>
<a class="file-line-num diff-line-num" data-line-number="39" href="#L39" id="L39">
39
</a>
<a class="file-line-num diff-line-num" data-line-number="40" href="#L40" id="L40">
40
</a>
<a class="file-line-num diff-line-num" data-line-number="41" href="#L41" id="L41">
41
</a>
<a class="file-line-num diff-line-num" data-line-number="42" href="#L42" id="L42">
42
</a>
<a class="file-line-num diff-line-num" data-line-number="43" href="#L43" id="L43">
43
</a>
<a class="file-line-num diff-line-num" data-line-number="44" href="#L44" id="L44">
44
</a>
<a class="file-line-num diff-line-num" data-line-number="45" href="#L45" id="L45">
45
</a>
<a class="file-line-num diff-line-num" data-line-number="46" href="#L46" id="L46">
46
</a>
<a class="file-line-num diff-line-num" data-line-number="47" href="#L47" id="L47">
47
</a>
<a class="file-line-num diff-line-num" data-line-number="48" href="#L48" id="L48">
48
</a>
<a class="file-line-num diff-line-num" data-line-number="49" href="#L49" id="L49">
49
</a>
<a class="file-line-num diff-line-num" data-line-number="50" href="#L50" id="L50">
50
</a>
<a class="file-line-num diff-line-num" data-line-number="51" href="#L51" id="L51">
51
</a>
<a class="file-line-num diff-line-num" data-line-number="52" href="#L52" id="L52">
52
</a>
<a class="file-line-num diff-line-num" data-line-number="53" href="#L53" id="L53">
53
</a>
<a class="file-line-num diff-line-num" data-line-number="54" href="#L54" id="L54">
54
</a>
<a class="file-line-num diff-line-num" data-line-number="55" href="#L55" id="L55">
55
</a>
<a class="file-line-num diff-line-num" data-line-number="56" href="#L56" id="L56">
56
</a>
<a class="file-line-num diff-line-num" data-line-number="57" href="#L57" id="L57">
57
</a>
<a class="file-line-num diff-line-num" data-line-number="58" href="#L58" id="L58">
58
</a>
<a class="file-line-num diff-line-num" data-line-number="59" href="#L59" id="L59">
59
</a>
<a class="file-line-num diff-line-num" data-line-number="60" href="#L60" id="L60">
60
</a>
<a class="file-line-num diff-line-num" data-line-number="61" href="#L61" id="L61">
61
</a>
<a class="file-line-num diff-line-num" data-line-number="62" href="#L62" id="L62">
62
</a>
<a class="file-line-num diff-line-num" data-line-number="63" href="#L63" id="L63">
63
</a>
<a class="file-line-num diff-line-num" data-line-number="64" href="#L64" id="L64">
64
</a>
<a class="file-line-num diff-line-num" data-line-number="65" href="#L65" id="L65">
65
</a>
<a class="file-line-num diff-line-num" data-line-number="66" href="#L66" id="L66">
66
</a>
<a class="file-line-num diff-line-num" data-line-number="67" href="#L67" id="L67">
67
</a>
<a class="file-line-num diff-line-num" data-line-number="68" href="#L68" id="L68">
68
</a>
<a class="file-line-num diff-line-num" data-line-number="69" href="#L69" id="L69">
69
</a>
<a class="file-line-num diff-line-num" data-line-number="70" href="#L70" id="L70">
70
</a>
<a class="file-line-num diff-line-num" data-line-number="71" href="#L71" id="L71">
71
</a>
<a class="file-line-num diff-line-num" data-line-number="72" href="#L72" id="L72">
72
</a>
<a class="file-line-num diff-line-num" data-line-number="73" href="#L73" id="L73">
73
</a>
<a class="file-line-num diff-line-num" data-line-number="74" href="#L74" id="L74">
74
</a>
<a class="file-line-num diff-line-num" data-line-number="75" href="#L75" id="L75">
75
</a>
<a class="file-line-num diff-line-num" data-line-number="76" href="#L76" id="L76">
76
</a>
<a class="file-line-num diff-line-num" data-line-number="77" href="#L77" id="L77">
77
</a>
<a class="file-line-num diff-line-num" data-line-number="78" href="#L78" id="L78">
78
</a>
<a class="file-line-num diff-line-num" data-line-number="79" href="#L79" id="L79">
79
</a>
<a class="file-line-num diff-line-num" data-line-number="80" href="#L80" id="L80">
80
</a>
<a class="file-line-num diff-line-num" data-line-number="81" href="#L81" id="L81">
81
</a>
<a class="file-line-num diff-line-num" data-line-number="82" href="#L82" id="L82">
82
</a>
<a class="file-line-num diff-line-num" data-line-number="83" href="#L83" id="L83">
83
</a>
<a class="file-line-num diff-line-num" data-line-number="84" href="#L84" id="L84">
84
</a>
<a class="file-line-num diff-line-num" data-line-number="85" href="#L85" id="L85">
85
</a>
<a class="file-line-num diff-line-num" data-line-number="86" href="#L86" id="L86">
86
</a>
<a class="file-line-num diff-line-num" data-line-number="87" href="#L87" id="L87">
87
</a>
<a class="file-line-num diff-line-num" data-line-number="88" href="#L88" id="L88">
88
</a>
<a class="file-line-num diff-line-num" data-line-number="89" href="#L89" id="L89">
89
</a>
<a class="file-line-num diff-line-num" data-line-number="90" href="#L90" id="L90">
90
</a>
<a class="file-line-num diff-line-num" data-line-number="91" href="#L91" id="L91">
91
</a>
<a class="file-line-num diff-line-num" data-line-number="92" href="#L92" id="L92">
92
</a>
<a class="file-line-num diff-line-num" data-line-number="93" href="#L93" id="L93">
93
</a>
<a class="file-line-num diff-line-num" data-line-number="94" href="#L94" id="L94">
94
</a>
<a class="file-line-num diff-line-num" data-line-number="95" href="#L95" id="L95">
95
</a>
<a class="file-line-num diff-line-num" data-line-number="96" href="#L96" id="L96">
96
</a>
<a class="file-line-num diff-line-num" data-line-number="97" href="#L97" id="L97">
97
</a>
<a class="file-line-num diff-line-num" data-line-number="98" href="#L98" id="L98">
98
</a>
<a class="file-line-num diff-line-num" data-line-number="99" href="#L99" id="L99">
99
</a>
<a class="file-line-num diff-line-num" data-line-number="100" href="#L100" id="L100">
100
</a>
<a class="file-line-num diff-line-num" data-line-number="101" href="#L101" id="L101">
101
</a>
<a class="file-line-num diff-line-num" data-line-number="102" href="#L102" id="L102">
102
</a>
<a class="file-line-num diff-line-num" data-line-number="103" href="#L103" id="L103">
103
</a>
<a class="file-line-num diff-line-num" data-line-number="104" href="#L104" id="L104">
104
</a>
<a class="file-line-num diff-line-num" data-line-number="105" href="#L105" id="L105">
105
</a>
<a class="file-line-num diff-line-num" data-line-number="106" href="#L106" id="L106">
106
</a>
<a class="file-line-num diff-line-num" data-line-number="107" href="#L107" id="L107">
107
</a>
<a class="file-line-num diff-line-num" data-line-number="108" href="#L108" id="L108">
108
</a>
<a class="file-line-num diff-line-num" data-line-number="109" href="#L109" id="L109">
109
</a>
<a class="file-line-num diff-line-num" data-line-number="110" href="#L110" id="L110">
110
</a>
<a class="file-line-num diff-line-num" data-line-number="111" href="#L111" id="L111">
111
</a>
<a class="file-line-num diff-line-num" data-line-number="112" href="#L112" id="L112">
112
</a>
<a class="file-line-num diff-line-num" data-line-number="113" href="#L113" id="L113">
113
</a>
<a class="file-line-num diff-line-num" data-line-number="114" href="#L114" id="L114">
114
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC4" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC5" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC6" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC7" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC8" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC9" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC10" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC11" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC12" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC13" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC14" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC15" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC16" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC17" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC18" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC19" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC20" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC21" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC22" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC23" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC24" class="line" lang="java"></span>
<span id="LC25" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC26" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC27" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC28" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC30" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC31" class="line" lang="java"><span class="cm"> * Copyright (c) 2000 World Wide Web Consortium,</span></span>
<span id="LC32" class="line" lang="java"><span class="cm"> * (Massachusetts Institute of Technology, Institut National de</span></span>
<span id="LC33" class="line" lang="java"><span class="cm"> * Recherche en Informatique et en Automatique, Keio University). All</span></span>
<span id="LC34" class="line" lang="java"><span class="cm"> * Rights Reserved. This program is distributed under the W3C's Software</span></span>
<span id="LC35" class="line" lang="java"><span class="cm"> * Intellectual Property License. This program is distributed in the</span></span>
<span id="LC36" class="line" lang="java"><span class="cm"> * hope that it will be useful, but WITHOUT ANY WARRANTY; without even</span></span>
<span id="LC37" class="line" lang="java"><span class="cm"> * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> * PURPOSE.</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> * See W3C License http://www.w3.org/Consortium/Legal/ for more details.</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC41" class="line" lang="java"></span>
<span id="LC42" class="line" lang="java"><span class="kn">package</span> <span class="nn">org.w3c.dom.css</span><span class="o">;</span></span>
<span id="LC43" class="line" lang="java"></span>
<span id="LC44" class="line" lang="java"><span class="kn">import</span> <span class="nn">org.w3c.dom.DOMException</span><span class="o">;</span></span>
<span id="LC45" class="line" lang="java"><span class="kn">import</span> <span class="nn">org.w3c.dom.stylesheets.StyleSheet</span><span class="o">;</span></span>
<span id="LC46" class="line" lang="java"></span>
<span id="LC47" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> *  The &lt;code&gt;CSSStyleSheet&lt;/code&gt; interface is a concrete interface used to</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> * represent a CSS style sheet i.e., a style sheet whose content type is</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> * "text/css".</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> * &lt;p&gt;See also the &lt;a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'&gt;Document Object Model (DOM) Level 2 Style Specification&lt;/a&gt;.</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> * @since DOM Level 2</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC54" class="line" lang="java"><span class="kd">public</span> <span class="kd">interface</span> <span class="nc">CSSStyleSheet</span> <span class="kd">extends</span> <span class="nc">StyleSheet</span> <span class="o">{</span></span>
<span id="LC55" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC56" class="line" lang="java"><span class="cm">     *  If this style sheet comes from an &lt;code&gt;@import&lt;/code&gt; rule, the</span></span>
<span id="LC57" class="line" lang="java"><span class="cm">     * &lt;code&gt;ownerRule&lt;/code&gt; attribute will contain the</span></span>
<span id="LC58" class="line" lang="java"><span class="cm">     * &lt;code&gt;CSSImportRule&lt;/code&gt;. In that case, the &lt;code&gt;ownerNode&lt;/code&gt;</span></span>
<span id="LC59" class="line" lang="java"><span class="cm">     * attribute in the &lt;code&gt;StyleSheet&lt;/code&gt; interface will be</span></span>
<span id="LC60" class="line" lang="java"><span class="cm">     * &lt;code&gt;null&lt;/code&gt;. If the style sheet comes from an element or a</span></span>
<span id="LC61" class="line" lang="java"><span class="cm">     * processing instruction, the &lt;code&gt;ownerRule&lt;/code&gt; attribute will be</span></span>
<span id="LC62" class="line" lang="java"><span class="cm">     * &lt;code&gt;null&lt;/code&gt; and the &lt;code&gt;ownerNode&lt;/code&gt; attribute will</span></span>
<span id="LC63" class="line" lang="java"><span class="cm">     * contain the &lt;code&gt;Node&lt;/code&gt;.</span></span>
<span id="LC64" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC65" class="line" lang="java">    <span class="kd">public</span> <span class="nc">CSSRule</span> <span class="nf">getOwnerRule</span><span class="o">();</span></span>
<span id="LC66" class="line" lang="java"></span>
<span id="LC67" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC68" class="line" lang="java"><span class="cm">     *  The list of all CSS rules contained within the style sheet. This</span></span>
<span id="LC69" class="line" lang="java"><span class="cm">     * includes both rule sets and at-rules.</span></span>
<span id="LC70" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC71" class="line" lang="java">    <span class="kd">public</span> <span class="nc">CSSRuleList</span> <span class="nf">getCssRules</span><span class="o">();</span></span>
<span id="LC72" class="line" lang="java"></span>
<span id="LC73" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC74" class="line" lang="java"><span class="cm">     *  Used to insert a new rule into the style sheet. The new rule now</span></span>
<span id="LC75" class="line" lang="java"><span class="cm">     * becomes part of the cascade.</span></span>
<span id="LC76" class="line" lang="java"><span class="cm">     * @param rule  The parsable text representing the rule. For rule sets</span></span>
<span id="LC77" class="line" lang="java"><span class="cm">     *   this contains both the selector and the style declaration. For</span></span>
<span id="LC78" class="line" lang="java"><span class="cm">     *   at-rules, this specifies both the at-identifier and the rule</span></span>
<span id="LC79" class="line" lang="java"><span class="cm">     *   content.</span></span>
<span id="LC80" class="line" lang="java"><span class="cm">     * @param index  The index within the style sheet's rule list of the rule</span></span>
<span id="LC81" class="line" lang="java"><span class="cm">     *   before which to insert the specified rule. If the specified index</span></span>
<span id="LC82" class="line" lang="java"><span class="cm">     *   is equal to the length of the style sheet's rule collection, the</span></span>
<span id="LC83" class="line" lang="java"><span class="cm">     *   rule will be added to the end of the style sheet.</span></span>
<span id="LC84" class="line" lang="java"><span class="cm">     * @return  The index within the style sheet's rule collection of the</span></span>
<span id="LC85" class="line" lang="java"><span class="cm">     *   newly inserted rule.</span></span>
<span id="LC86" class="line" lang="java"><span class="cm">     * @exception DOMException</span></span>
<span id="LC87" class="line" lang="java"><span class="cm">     *   HIERARCHY_REQUEST_ERR: Raised if the rule cannot be inserted at the</span></span>
<span id="LC88" class="line" lang="java"><span class="cm">     *   specified index e.g. if an &lt;code&gt;@import&lt;/code&gt; rule is inserted</span></span>
<span id="LC89" class="line" lang="java"><span class="cm">     *   after a standard rule set or other at-rule.</span></span>
<span id="LC90" class="line" lang="java"><span class="cm">     *   &lt;br&gt;INDEX_SIZE_ERR: Raised if the specified index is not a valid</span></span>
<span id="LC91" class="line" lang="java"><span class="cm">     *   insertion point.</span></span>
<span id="LC92" class="line" lang="java"><span class="cm">     *   &lt;br&gt;NO_MODIFICATION_ALLOWED_ERR: Raised if this style sheet is</span></span>
<span id="LC93" class="line" lang="java"><span class="cm">     *   readonly.</span></span>
<span id="LC94" class="line" lang="java"><span class="cm">     *   &lt;br&gt;SYNTAX_ERR: Raised if the specified rule has a syntax error and</span></span>
<span id="LC95" class="line" lang="java"><span class="cm">     *   is unparsable.</span></span>
<span id="LC96" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC97" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">insertRule</span><span class="o">(</span><span class="nc">String</span> <span class="n">rule</span><span class="o">,</span></span>
<span id="LC98" class="line" lang="java">                          <span class="kt">int</span> <span class="n">index</span><span class="o">)</span></span>
<span id="LC99" class="line" lang="java">                          <span class="kd">throws</span> <span class="nc">DOMException</span><span class="o">;</span></span>
<span id="LC100" class="line" lang="java"></span>
<span id="LC101" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC102" class="line" lang="java"><span class="cm">     *  Used to delete a rule from the style sheet.</span></span>
<span id="LC103" class="line" lang="java"><span class="cm">     * @param index  The index within the style sheet's rule list of the rule</span></span>
<span id="LC104" class="line" lang="java"><span class="cm">     *   to remove.</span></span>
<span id="LC105" class="line" lang="java"><span class="cm">     * @exception DOMException</span></span>
<span id="LC106" class="line" lang="java"><span class="cm">     *   INDEX_SIZE_ERR: Raised if the specified index does not correspond to</span></span>
<span id="LC107" class="line" lang="java"><span class="cm">     *   a rule in the style sheet's rule list.</span></span>
<span id="LC108" class="line" lang="java"><span class="cm">     *   &lt;br&gt;NO_MODIFICATION_ALLOWED_ERR: Raised if this style sheet is</span></span>
<span id="LC109" class="line" lang="java"><span class="cm">     *   readonly.</span></span>
<span id="LC110" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC111" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">deleteRule</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span></span>
<span id="LC112" class="line" lang="java">                           <span class="kd">throws</span> <span class="nc">DOMException</span><span class="o">;</span></span>
<span id="LC113" class="line" lang="java"></span>
<span id="LC114" class="line" lang="java"><span class="o">}</span></span>