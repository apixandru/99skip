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
<a class="file-line-num diff-line-num" data-line-number="115" href="#L115" id="L115">
115
</a>
<a class="file-line-num diff-line-num" data-line-number="116" href="#L116" id="L116">
116
</a>
<a class="file-line-num diff-line-num" data-line-number="117" href="#L117" id="L117">
117
</a>
<a class="file-line-num diff-line-num" data-line-number="118" href="#L118" id="L118">
118
</a>
<a class="file-line-num diff-line-num" data-line-number="119" href="#L119" id="L119">
119
</a>
<a class="file-line-num diff-line-num" data-line-number="120" href="#L120" id="L120">
120
</a>
<a class="file-line-num diff-line-num" data-line-number="121" href="#L121" id="L121">
121
</a>
<a class="file-line-num diff-line-num" data-line-number="122" href="#L122" id="L122">
122
</a>
<a class="file-line-num diff-line-num" data-line-number="123" href="#L123" id="L123">
123
</a>
<a class="file-line-num diff-line-num" data-line-number="124" href="#L124" id="L124">
124
</a>
<a class="file-line-num diff-line-num" data-line-number="125" href="#L125" id="L125">
125
</a>
<a class="file-line-num diff-line-num" data-line-number="126" href="#L126" id="L126">
126
</a>
<a class="file-line-num diff-line-num" data-line-number="127" href="#L127" id="L127">
127
</a>
<a class="file-line-num diff-line-num" data-line-number="128" href="#L128" id="L128">
128
</a>
<a class="file-line-num diff-line-num" data-line-number="129" href="#L129" id="L129">
129
</a>
<a class="file-line-num diff-line-num" data-line-number="130" href="#L130" id="L130">
130
</a>
<a class="file-line-num diff-line-num" data-line-number="131" href="#L131" id="L131">
131
</a>
<a class="file-line-num diff-line-num" data-line-number="132" href="#L132" id="L132">
132
</a>
<a class="file-line-num diff-line-num" data-line-number="133" href="#L133" id="L133">
133
</a>
<a class="file-line-num diff-line-num" data-line-number="134" href="#L134" id="L134">
134
</a>
<a class="file-line-num diff-line-num" data-line-number="135" href="#L135" id="L135">
135
</a>
<a class="file-line-num diff-line-num" data-line-number="136" href="#L136" id="L136">
136
</a>
<a class="file-line-num diff-line-num" data-line-number="137" href="#L137" id="L137">
137
</a>
<a class="file-line-num diff-line-num" data-line-number="138" href="#L138" id="L138">
138
</a>
<a class="file-line-num diff-line-num" data-line-number="139" href="#L139" id="L139">
139
</a>
<a class="file-line-num diff-line-num" data-line-number="140" href="#L140" id="L140">
140
</a>
<a class="file-line-num diff-line-num" data-line-number="141" href="#L141" id="L141">
141
</a>
<a class="file-line-num diff-line-num" data-line-number="142" href="#L142" id="L142">
142
</a>
<a class="file-line-num diff-line-num" data-line-number="143" href="#L143" id="L143">
143
</a>
<a class="file-line-num diff-line-num" data-line-number="144" href="#L144" id="L144">
144
</a>
<a class="file-line-num diff-line-num" data-line-number="145" href="#L145" id="L145">
145
</a>
<a class="file-line-num diff-line-num" data-line-number="146" href="#L146" id="L146">
146
</a>
<a class="file-line-num diff-line-num" data-line-number="147" href="#L147" id="L147">
147
</a>
<a class="file-line-num diff-line-num" data-line-number="148" href="#L148" id="L148">
148
</a>
<a class="file-line-num diff-line-num" data-line-number="149" href="#L149" id="L149">
149
</a>
<a class="file-line-num diff-line-num" data-line-number="150" href="#L150" id="L150">
150
</a>
<a class="file-line-num diff-line-num" data-line-number="151" href="#L151" id="L151">
151
</a>
<a class="file-line-num diff-line-num" data-line-number="152" href="#L152" id="L152">
152
</a>
<a class="file-line-num diff-line-num" data-line-number="153" href="#L153" id="L153">
153
</a>
<a class="file-line-num diff-line-num" data-line-number="154" href="#L154" id="L154">
154
</a>
<a class="file-line-num diff-line-num" data-line-number="155" href="#L155" id="L155">
155
</a>
<a class="file-line-num diff-line-num" data-line-number="156" href="#L156" id="L156">
156
</a>
<a class="file-line-num diff-line-num" data-line-number="157" href="#L157" id="L157">
157
</a>
<a class="file-line-num diff-line-num" data-line-number="158" href="#L158" id="L158">
158
</a>
<a class="file-line-num diff-line-num" data-line-number="159" href="#L159" id="L159">
159
</a>
<a class="file-line-num diff-line-num" data-line-number="160" href="#L160" id="L160">
160
</a>
<a class="file-line-num diff-line-num" data-line-number="161" href="#L161" id="L161">
161
</a>
<a class="file-line-num diff-line-num" data-line-number="162" href="#L162" id="L162">
162
</a>
<a class="file-line-num diff-line-num" data-line-number="163" href="#L163" id="L163">
163
</a>
<a class="file-line-num diff-line-num" data-line-number="164" href="#L164" id="L164">
164
</a>
<a class="file-line-num diff-line-num" data-line-number="165" href="#L165" id="L165">
165
</a>
<a class="file-line-num diff-line-num" data-line-number="166" href="#L166" id="L166">
166
</a>
<a class="file-line-num diff-line-num" data-line-number="167" href="#L167" id="L167">
167
</a>
<a class="file-line-num diff-line-num" data-line-number="168" href="#L168" id="L168">
168
</a>
<a class="file-line-num diff-line-num" data-line-number="169" href="#L169" id="L169">
169
</a>
<a class="file-line-num diff-line-num" data-line-number="170" href="#L170" id="L170">
170
</a>
<a class="file-line-num diff-line-num" data-line-number="171" href="#L171" id="L171">
171
</a>
<a class="file-line-num diff-line-num" data-line-number="172" href="#L172" id="L172">
172
</a>
<a class="file-line-num diff-line-num" data-line-number="173" href="#L173" id="L173">
173
</a>
<a class="file-line-num diff-line-num" data-line-number="174" href="#L174" id="L174">
174
</a>
<a class="file-line-num diff-line-num" data-line-number="175" href="#L175" id="L175">
175
</a>
<a class="file-line-num diff-line-num" data-line-number="176" href="#L176" id="L176">
176
</a>
<a class="file-line-num diff-line-num" data-line-number="177" href="#L177" id="L177">
177
</a>
<a class="file-line-num diff-line-num" data-line-number="178" href="#L178" id="L178">
178
</a>
<a class="file-line-num diff-line-num" data-line-number="179" href="#L179" id="L179">
179
</a>
<a class="file-line-num diff-line-num" data-line-number="180" href="#L180" id="L180">
180
</a>
<a class="file-line-num diff-line-num" data-line-number="181" href="#L181" id="L181">
181
</a>
<a class="file-line-num diff-line-num" data-line-number="182" href="#L182" id="L182">
182
</a>
<a class="file-line-num diff-line-num" data-line-number="183" href="#L183" id="L183">
183
</a>
<a class="file-line-num diff-line-num" data-line-number="184" href="#L184" id="L184">
184
</a>
<a class="file-line-num diff-line-num" data-line-number="185" href="#L185" id="L185">
185
</a>
<a class="file-line-num diff-line-num" data-line-number="186" href="#L186" id="L186">
186
</a>
<a class="file-line-num diff-line-num" data-line-number="187" href="#L187" id="L187">
187
</a>
<a class="file-line-num diff-line-num" data-line-number="188" href="#L188" id="L188">
188
</a>
<a class="file-line-num diff-line-num" data-line-number="189" href="#L189" id="L189">
189
</a>
<a class="file-line-num diff-line-num" data-line-number="190" href="#L190" id="L190">
190
</a>
<a class="file-line-num diff-line-num" data-line-number="191" href="#L191" id="L191">
191
</a>
<a class="file-line-num diff-line-num" data-line-number="192" href="#L192" id="L192">
192
</a>
<a class="file-line-num diff-line-num" data-line-number="193" href="#L193" id="L193">
193
</a>
<a class="file-line-num diff-line-num" data-line-number="194" href="#L194" id="L194">
194
</a>
<a class="file-line-num diff-line-num" data-line-number="195" href="#L195" id="L195">
195
</a>
<a class="file-line-num diff-line-num" data-line-number="196" href="#L196" id="L196">
196
</a>
<a class="file-line-num diff-line-num" data-line-number="197" href="#L197" id="L197">
197
</a>
<a class="file-line-num diff-line-num" data-line-number="198" href="#L198" id="L198">
198
</a>
<a class="file-line-num diff-line-num" data-line-number="199" href="#L199" id="L199">
199
</a>
<a class="file-line-num diff-line-num" data-line-number="200" href="#L200" id="L200">
200
</a>
<a class="file-line-num diff-line-num" data-line-number="201" href="#L201" id="L201">
201
</a>
<a class="file-line-num diff-line-num" data-line-number="202" href="#L202" id="L202">
202
</a>
<a class="file-line-num diff-line-num" data-line-number="203" href="#L203" id="L203">
203
</a>
<a class="file-line-num diff-line-num" data-line-number="204" href="#L204" id="L204">
204
</a>
<a class="file-line-num diff-line-num" data-line-number="205" href="#L205" id="L205">
205
</a>
<a class="file-line-num diff-line-num" data-line-number="206" href="#L206" id="L206">
206
</a>
<a class="file-line-num diff-line-num" data-line-number="207" href="#L207" id="L207">
207
</a>
<a class="file-line-num diff-line-num" data-line-number="208" href="#L208" id="L208">
208
</a>
<a class="file-line-num diff-line-num" data-line-number="209" href="#L209" id="L209">
209
</a>
<a class="file-line-num diff-line-num" data-line-number="210" href="#L210" id="L210">
210
</a>
<a class="file-line-num diff-line-num" data-line-number="211" href="#L211" id="L211">
211
</a>
<a class="file-line-num diff-line-num" data-line-number="212" href="#L212" id="L212">
212
</a>
<a class="file-line-num diff-line-num" data-line-number="213" href="#L213" id="L213">
213
</a>
<a class="file-line-num diff-line-num" data-line-number="214" href="#L214" id="L214">
214
</a>
<a class="file-line-num diff-line-num" data-line-number="215" href="#L215" id="L215">
215
</a>
<a class="file-line-num diff-line-num" data-line-number="216" href="#L216" id="L216">
216
</a>
<a class="file-line-num diff-line-num" data-line-number="217" href="#L217" id="L217">
217
</a>
<a class="file-line-num diff-line-num" data-line-number="218" href="#L218" id="L218">
218
</a>
<a class="file-line-num diff-line-num" data-line-number="219" href="#L219" id="L219">
219
</a>
<a class="file-line-num diff-line-num" data-line-number="220" href="#L220" id="L220">
220
</a>
<a class="file-line-num diff-line-num" data-line-number="221" href="#L221" id="L221">
221
</a>
<a class="file-line-num diff-line-num" data-line-number="222" href="#L222" id="L222">
222
</a>
<a class="file-line-num diff-line-num" data-line-number="223" href="#L223" id="L223">
223
</a>
<a class="file-line-num diff-line-num" data-line-number="224" href="#L224" id="L224">
224
</a>
<a class="file-line-num diff-line-num" data-line-number="225" href="#L225" id="L225">
225
</a>
<a class="file-line-num diff-line-num" data-line-number="226" href="#L226" id="L226">
226
</a>
<a class="file-line-num diff-line-num" data-line-number="227" href="#L227" id="L227">
227
</a>
<a class="file-line-num diff-line-num" data-line-number="228" href="#L228" id="L228">
228
</a>
<a class="file-line-num diff-line-num" data-line-number="229" href="#L229" id="L229">
229
</a>
<a class="file-line-num diff-line-num" data-line-number="230" href="#L230" id="L230">
230
</a>
<a class="file-line-num diff-line-num" data-line-number="231" href="#L231" id="L231">
231
</a>
<a class="file-line-num diff-line-num" data-line-number="232" href="#L232" id="L232">
232
</a>
<a class="file-line-num diff-line-num" data-line-number="233" href="#L233" id="L233">
233
</a>
<a class="file-line-num diff-line-num" data-line-number="234" href="#L234" id="L234">
234
</a>
<a class="file-line-num diff-line-num" data-line-number="235" href="#L235" id="L235">
235
</a>
<a class="file-line-num diff-line-num" data-line-number="236" href="#L236" id="L236">
236
</a>
<a class="file-line-num diff-line-num" data-line-number="237" href="#L237" id="L237">
237
</a>
<a class="file-line-num diff-line-num" data-line-number="238" href="#L238" id="L238">
238
</a>
<a class="file-line-num diff-line-num" data-line-number="239" href="#L239" id="L239">
239
</a>
<a class="file-line-num diff-line-num" data-line-number="240" href="#L240" id="L240">
240
</a>
<a class="file-line-num diff-line-num" data-line-number="241" href="#L241" id="L241">
241
</a>
<a class="file-line-num diff-line-num" data-line-number="242" href="#L242" id="L242">
242
</a>
<a class="file-line-num diff-line-num" data-line-number="243" href="#L243" id="L243">
243
</a>
<a class="file-line-num diff-line-num" data-line-number="244" href="#L244" id="L244">
244
</a>
<a class="file-line-num diff-line-num" data-line-number="245" href="#L245" id="L245">
245
</a>
<a class="file-line-num diff-line-num" data-line-number="246" href="#L246" id="L246">
246
</a>
<a class="file-line-num diff-line-num" data-line-number="247" href="#L247" id="L247">
247
</a>
<a class="file-line-num diff-line-num" data-line-number="248" href="#L248" id="L248">
248
</a>
<a class="file-line-num diff-line-num" data-line-number="249" href="#L249" id="L249">
249
</a>
<a class="file-line-num diff-line-num" data-line-number="250" href="#L250" id="L250">
250
</a>
<a class="file-line-num diff-line-num" data-line-number="251" href="#L251" id="L251">
251
</a>
<a class="file-line-num diff-line-num" data-line-number="252" href="#L252" id="L252">
252
</a>
<a class="file-line-num diff-line-num" data-line-number="253" href="#L253" id="L253">
253
</a>
<a class="file-line-num diff-line-num" data-line-number="254" href="#L254" id="L254">
254
</a>
<a class="file-line-num diff-line-num" data-line-number="255" href="#L255" id="L255">
255
</a>
<a class="file-line-num diff-line-num" data-line-number="256" href="#L256" id="L256">
256
</a>
<a class="file-line-num diff-line-num" data-line-number="257" href="#L257" id="L257">
257
</a>
<a class="file-line-num diff-line-num" data-line-number="258" href="#L258" id="L258">
258
</a>
<a class="file-line-num diff-line-num" data-line-number="259" href="#L259" id="L259">
259
</a>
<a class="file-line-num diff-line-num" data-line-number="260" href="#L260" id="L260">
260
</a>
<a class="file-line-num diff-line-num" data-line-number="261" href="#L261" id="L261">
261
</a>
<a class="file-line-num diff-line-num" data-line-number="262" href="#L262" id="L262">
262
</a>
<a class="file-line-num diff-line-num" data-line-number="263" href="#L263" id="L263">
263
</a>
<a class="file-line-num diff-line-num" data-line-number="264" href="#L264" id="L264">
264
</a>
<a class="file-line-num diff-line-num" data-line-number="265" href="#L265" id="L265">
265
</a>
<a class="file-line-num diff-line-num" data-line-number="266" href="#L266" id="L266">
266
</a>
<a class="file-line-num diff-line-num" data-line-number="267" href="#L267" id="L267">
267
</a>
<a class="file-line-num diff-line-num" data-line-number="268" href="#L268" id="L268">
268
</a>
<a class="file-line-num diff-line-num" data-line-number="269" href="#L269" id="L269">
269
</a>
<a class="file-line-num diff-line-num" data-line-number="270" href="#L270" id="L270">
270
</a>
<a class="file-line-num diff-line-num" data-line-number="271" href="#L271" id="L271">
271
</a>
<a class="file-line-num diff-line-num" data-line-number="272" href="#L272" id="L272">
272
</a>
<a class="file-line-num diff-line-num" data-line-number="273" href="#L273" id="L273">
273
</a>
<a class="file-line-num diff-line-num" data-line-number="274" href="#L274" id="L274">
274
</a>
<a class="file-line-num diff-line-num" data-line-number="275" href="#L275" id="L275">
275
</a>
<a class="file-line-num diff-line-num" data-line-number="276" href="#L276" id="L276">
276
</a>
<a class="file-line-num diff-line-num" data-line-number="277" href="#L277" id="L277">
277
</a>
<a class="file-line-num diff-line-num" data-line-number="278" href="#L278" id="L278">
278
</a>
<a class="file-line-num diff-line-num" data-line-number="279" href="#L279" id="L279">
279
</a>
<a class="file-line-num diff-line-num" data-line-number="280" href="#L280" id="L280">
280
</a>
<a class="file-line-num diff-line-num" data-line-number="281" href="#L281" id="L281">
281
</a>
<a class="file-line-num diff-line-num" data-line-number="282" href="#L282" id="L282">
282
</a>
<a class="file-line-num diff-line-num" data-line-number="283" href="#L283" id="L283">
283
</a>
<a class="file-line-num diff-line-num" data-line-number="284" href="#L284" id="L284">
284
</a>
<a class="file-line-num diff-line-num" data-line-number="285" href="#L285" id="L285">
285
</a>
<a class="file-line-num diff-line-num" data-line-number="286" href="#L286" id="L286">
286
</a>
<a class="file-line-num diff-line-num" data-line-number="287" href="#L287" id="L287">
287
</a>
<a class="file-line-num diff-line-num" data-line-number="288" href="#L288" id="L288">
288
</a>
<a class="file-line-num diff-line-num" data-line-number="289" href="#L289" id="L289">
289
</a>
<a class="file-line-num diff-line-num" data-line-number="290" href="#L290" id="L290">
290
</a>
<a class="file-line-num diff-line-num" data-line-number="291" href="#L291" id="L291">
291
</a>
<a class="file-line-num diff-line-num" data-line-number="292" href="#L292" id="L292">
292
</a>
<a class="file-line-num diff-line-num" data-line-number="293" href="#L293" id="L293">
293
</a>
<a class="file-line-num diff-line-num" data-line-number="294" href="#L294" id="L294">
294
</a>
<a class="file-line-num diff-line-num" data-line-number="295" href="#L295" id="L295">
295
</a>
<a class="file-line-num diff-line-num" data-line-number="296" href="#L296" id="L296">
296
</a>
<a class="file-line-num diff-line-num" data-line-number="297" href="#L297" id="L297">
297
</a>
<a class="file-line-num diff-line-num" data-line-number="298" href="#L298" id="L298">
298
</a>
<a class="file-line-num diff-line-num" data-line-number="299" href="#L299" id="L299">
299
</a>
<a class="file-line-num diff-line-num" data-line-number="300" href="#L300" id="L300">
300
</a>
<a class="file-line-num diff-line-num" data-line-number="301" href="#L301" id="L301">
301
</a>
<a class="file-line-num diff-line-num" data-line-number="302" href="#L302" id="L302">
302
</a>
<a class="file-line-num diff-line-num" data-line-number="303" href="#L303" id="L303">
303
</a>
<a class="file-line-num diff-line-num" data-line-number="304" href="#L304" id="L304">
304
</a>
<a class="file-line-num diff-line-num" data-line-number="305" href="#L305" id="L305">
305
</a>
<a class="file-line-num diff-line-num" data-line-number="306" href="#L306" id="L306">
306
</a>
<a class="file-line-num diff-line-num" data-line-number="307" href="#L307" id="L307">
307
</a>
<a class="file-line-num diff-line-num" data-line-number="308" href="#L308" id="L308">
308
</a>
<a class="file-line-num diff-line-num" data-line-number="309" href="#L309" id="L309">
309
</a>
<a class="file-line-num diff-line-num" data-line-number="310" href="#L310" id="L310">
310
</a>
<a class="file-line-num diff-line-num" data-line-number="311" href="#L311" id="L311">
311
</a>
<a class="file-line-num diff-line-num" data-line-number="312" href="#L312" id="L312">
312
</a>
<a class="file-line-num diff-line-num" data-line-number="313" href="#L313" id="L313">
313
</a>
<a class="file-line-num diff-line-num" data-line-number="314" href="#L314" id="L314">
314
</a>
<a class="file-line-num diff-line-num" data-line-number="315" href="#L315" id="L315">
315
</a>
<a class="file-line-num diff-line-num" data-line-number="316" href="#L316" id="L316">
316
</a>
<a class="file-line-num diff-line-num" data-line-number="317" href="#L317" id="L317">
317
</a>
<a class="file-line-num diff-line-num" data-line-number="318" href="#L318" id="L318">
318
</a>
<a class="file-line-num diff-line-num" data-line-number="319" href="#L319" id="L319">
319
</a>
<a class="file-line-num diff-line-num" data-line-number="320" href="#L320" id="L320">
320
</a>
<a class="file-line-num diff-line-num" data-line-number="321" href="#L321" id="L321">
321
</a>
<a class="file-line-num diff-line-num" data-line-number="322" href="#L322" id="L322">
322
</a>
<a class="file-line-num diff-line-num" data-line-number="323" href="#L323" id="L323">
323
</a>
<a class="file-line-num diff-line-num" data-line-number="324" href="#L324" id="L324">
324
</a>
<a class="file-line-num diff-line-num" data-line-number="325" href="#L325" id="L325">
325
</a>
<a class="file-line-num diff-line-num" data-line-number="326" href="#L326" id="L326">
326
</a>
<a class="file-line-num diff-line-num" data-line-number="327" href="#L327" id="L327">
327
</a>
<a class="file-line-num diff-line-num" data-line-number="328" href="#L328" id="L328">
328
</a>
<a class="file-line-num diff-line-num" data-line-number="329" href="#L329" id="L329">
329
</a>
<a class="file-line-num diff-line-num" data-line-number="330" href="#L330" id="L330">
330
</a>
<a class="file-line-num diff-line-num" data-line-number="331" href="#L331" id="L331">
331
</a>
<a class="file-line-num diff-line-num" data-line-number="332" href="#L332" id="L332">
332
</a>
<a class="file-line-num diff-line-num" data-line-number="333" href="#L333" id="L333">
333
</a>
<a class="file-line-num diff-line-num" data-line-number="334" href="#L334" id="L334">
334
</a>
<a class="file-line-num diff-line-num" data-line-number="335" href="#L335" id="L335">
335
</a>
<a class="file-line-num diff-line-num" data-line-number="336" href="#L336" id="L336">
336
</a>
<a class="file-line-num diff-line-num" data-line-number="337" href="#L337" id="L337">
337
</a>
<a class="file-line-num diff-line-num" data-line-number="338" href="#L338" id="L338">
338
</a>
<a class="file-line-num diff-line-num" data-line-number="339" href="#L339" id="L339">
339
</a>
<a class="file-line-num diff-line-num" data-line-number="340" href="#L340" id="L340">
340
</a>
<a class="file-line-num diff-line-num" data-line-number="341" href="#L341" id="L341">
341
</a>
<a class="file-line-num diff-line-num" data-line-number="342" href="#L342" id="L342">
342
</a>
<a class="file-line-num diff-line-num" data-line-number="343" href="#L343" id="L343">
343
</a>
<a class="file-line-num diff-line-num" data-line-number="344" href="#L344" id="L344">
344
</a>
<a class="file-line-num diff-line-num" data-line-number="345" href="#L345" id="L345">
345
</a>
<a class="file-line-num diff-line-num" data-line-number="346" href="#L346" id="L346">
346
</a>
<a class="file-line-num diff-line-num" data-line-number="347" href="#L347" id="L347">
347
</a>
<a class="file-line-num diff-line-num" data-line-number="348" href="#L348" id="L348">
348
</a>
<a class="file-line-num diff-line-num" data-line-number="349" href="#L349" id="L349">
349
</a>
<a class="file-line-num diff-line-num" data-line-number="350" href="#L350" id="L350">
350
</a>
<a class="file-line-num diff-line-num" data-line-number="351" href="#L351" id="L351">
351
</a>
<a class="file-line-num diff-line-num" data-line-number="352" href="#L352" id="L352">
352
</a>
<a class="file-line-num diff-line-num" data-line-number="353" href="#L353" id="L353">
353
</a>
<a class="file-line-num diff-line-num" data-line-number="354" href="#L354" id="L354">
354
</a>
<a class="file-line-num diff-line-num" data-line-number="355" href="#L355" id="L355">
355
</a>
<a class="file-line-num diff-line-num" data-line-number="356" href="#L356" id="L356">
356
</a>
<a class="file-line-num diff-line-num" data-line-number="357" href="#L357" id="L357">
357
</a>
<a class="file-line-num diff-line-num" data-line-number="358" href="#L358" id="L358">
358
</a>
<a class="file-line-num diff-line-num" data-line-number="359" href="#L359" id="L359">
359
</a>
<a class="file-line-num diff-line-num" data-line-number="360" href="#L360" id="L360">
360
</a>
<a class="file-line-num diff-line-num" data-line-number="361" href="#L361" id="L361">
361
</a>
<a class="file-line-num diff-line-num" data-line-number="362" href="#L362" id="L362">
362
</a>
<a class="file-line-num diff-line-num" data-line-number="363" href="#L363" id="L363">
363
</a>
<a class="file-line-num diff-line-num" data-line-number="364" href="#L364" id="L364">
364
</a>
<a class="file-line-num diff-line-num" data-line-number="365" href="#L365" id="L365">
365
</a>
<a class="file-line-num diff-line-num" data-line-number="366" href="#L366" id="L366">
366
</a>
<a class="file-line-num diff-line-num" data-line-number="367" href="#L367" id="L367">
367
</a>
<a class="file-line-num diff-line-num" data-line-number="368" href="#L368" id="L368">
368
</a>
<a class="file-line-num diff-line-num" data-line-number="369" href="#L369" id="L369">
369
</a>
<a class="file-line-num diff-line-num" data-line-number="370" href="#L370" id="L370">
370
</a>
<a class="file-line-num diff-line-num" data-line-number="371" href="#L371" id="L371">
371
</a>
<a class="file-line-num diff-line-num" data-line-number="372" href="#L372" id="L372">
372
</a>
<a class="file-line-num diff-line-num" data-line-number="373" href="#L373" id="L373">
373
</a>
<a class="file-line-num diff-line-num" data-line-number="374" href="#L374" id="L374">
374
</a>
<a class="file-line-num diff-line-num" data-line-number="375" href="#L375" id="L375">
375
</a>
<a class="file-line-num diff-line-num" data-line-number="376" href="#L376" id="L376">
376
</a>
<a class="file-line-num diff-line-num" data-line-number="377" href="#L377" id="L377">
377
</a>
<a class="file-line-num diff-line-num" data-line-number="378" href="#L378" id="L378">
378
</a>
<a class="file-line-num diff-line-num" data-line-number="379" href="#L379" id="L379">
379
</a>
<a class="file-line-num diff-line-num" data-line-number="380" href="#L380" id="L380">
380
</a>
<a class="file-line-num diff-line-num" data-line-number="381" href="#L381" id="L381">
381
</a>
<a class="file-line-num diff-line-num" data-line-number="382" href="#L382" id="L382">
382
</a>
<a class="file-line-num diff-line-num" data-line-number="383" href="#L383" id="L383">
383
</a>
<a class="file-line-num diff-line-num" data-line-number="384" href="#L384" id="L384">
384
</a>
<a class="file-line-num diff-line-num" data-line-number="385" href="#L385" id="L385">
385
</a>
<a class="file-line-num diff-line-num" data-line-number="386" href="#L386" id="L386">
386
</a>
<a class="file-line-num diff-line-num" data-line-number="387" href="#L387" id="L387">
387
</a>
<a class="file-line-num diff-line-num" data-line-number="388" href="#L388" id="L388">
388
</a>
<a class="file-line-num diff-line-num" data-line-number="389" href="#L389" id="L389">
389
</a>
<a class="file-line-num diff-line-num" data-line-number="390" href="#L390" id="L390">
390
</a>
<a class="file-line-num diff-line-num" data-line-number="391" href="#L391" id="L391">
391
</a>
<a class="file-line-num diff-line-num" data-line-number="392" href="#L392" id="L392">
392
</a>
<a class="file-line-num diff-line-num" data-line-number="393" href="#L393" id="L393">
393
</a>
<a class="file-line-num diff-line-num" data-line-number="394" href="#L394" id="L394">
394
</a>
<a class="file-line-num diff-line-num" data-line-number="395" href="#L395" id="L395">
395
</a>
<a class="file-line-num diff-line-num" data-line-number="396" href="#L396" id="L396">
396
</a>
<a class="file-line-num diff-line-num" data-line-number="397" href="#L397" id="L397">
397
</a>
<a class="file-line-num diff-line-num" data-line-number="398" href="#L398" id="L398">
398
</a>
<a class="file-line-num diff-line-num" data-line-number="399" href="#L399" id="L399">
399
</a>
<a class="file-line-num diff-line-num" data-line-number="400" href="#L400" id="L400">
400
</a>
<a class="file-line-num diff-line-num" data-line-number="401" href="#L401" id="L401">
401
</a>
<a class="file-line-num diff-line-num" data-line-number="402" href="#L402" id="L402">
402
</a>
<a class="file-line-num diff-line-num" data-line-number="403" href="#L403" id="L403">
403
</a>
<a class="file-line-num diff-line-num" data-line-number="404" href="#L404" id="L404">
404
</a>
<a class="file-line-num diff-line-num" data-line-number="405" href="#L405" id="L405">
405
</a>
<a class="file-line-num diff-line-num" data-line-number="406" href="#L406" id="L406">
406
</a>
<a class="file-line-num diff-line-num" data-line-number="407" href="#L407" id="L407">
407
</a>
<a class="file-line-num diff-line-num" data-line-number="408" href="#L408" id="L408">
408
</a>
<a class="file-line-num diff-line-num" data-line-number="409" href="#L409" id="L409">
409
</a>
<a class="file-line-num diff-line-num" data-line-number="410" href="#L410" id="L410">
410
</a>
<a class="file-line-num diff-line-num" data-line-number="411" href="#L411" id="L411">
411
</a>
<a class="file-line-num diff-line-num" data-line-number="412" href="#L412" id="L412">
412
</a>
<a class="file-line-num diff-line-num" data-line-number="413" href="#L413" id="L413">
413
</a>
<a class="file-line-num diff-line-num" data-line-number="414" href="#L414" id="L414">
414
</a>
<a class="file-line-num diff-line-num" data-line-number="415" href="#L415" id="L415">
415
</a>
<a class="file-line-num diff-line-num" data-line-number="416" href="#L416" id="L416">
416
</a>
<a class="file-line-num diff-line-num" data-line-number="417" href="#L417" id="L417">
417
</a>
<a class="file-line-num diff-line-num" data-line-number="418" href="#L418" id="L418">
418
</a>
<a class="file-line-num diff-line-num" data-line-number="419" href="#L419" id="L419">
419
</a>
<a class="file-line-num diff-line-num" data-line-number="420" href="#L420" id="L420">
420
</a>
<a class="file-line-num diff-line-num" data-line-number="421" href="#L421" id="L421">
421
</a>
<a class="file-line-num diff-line-num" data-line-number="422" href="#L422" id="L422">
422
</a>
<a class="file-line-num diff-line-num" data-line-number="423" href="#L423" id="L423">
423
</a>
<a class="file-line-num diff-line-num" data-line-number="424" href="#L424" id="L424">
424
</a>
<a class="file-line-num diff-line-num" data-line-number="425" href="#L425" id="L425">
425
</a>
<a class="file-line-num diff-line-num" data-line-number="426" href="#L426" id="L426">
426
</a>
<a class="file-line-num diff-line-num" data-line-number="427" href="#L427" id="L427">
427
</a>
<a class="file-line-num diff-line-num" data-line-number="428" href="#L428" id="L428">
428
</a>
<a class="file-line-num diff-line-num" data-line-number="429" href="#L429" id="L429">
429
</a>
<a class="file-line-num diff-line-num" data-line-number="430" href="#L430" id="L430">
430
</a>
<a class="file-line-num diff-line-num" data-line-number="431" href="#L431" id="L431">
431
</a>
<a class="file-line-num diff-line-num" data-line-number="432" href="#L432" id="L432">
432
</a>
<a class="file-line-num diff-line-num" data-line-number="433" href="#L433" id="L433">
433
</a>
<a class="file-line-num diff-line-num" data-line-number="434" href="#L434" id="L434">
434
</a>
<a class="file-line-num diff-line-num" data-line-number="435" href="#L435" id="L435">
435
</a>
<a class="file-line-num diff-line-num" data-line-number="436" href="#L436" id="L436">
436
</a>
<a class="file-line-num diff-line-num" data-line-number="437" href="#L437" id="L437">
437
</a>
<a class="file-line-num diff-line-num" data-line-number="438" href="#L438" id="L438">
438
</a>
<a class="file-line-num diff-line-num" data-line-number="439" href="#L439" id="L439">
439
</a>
<a class="file-line-num diff-line-num" data-line-number="440" href="#L440" id="L440">
440
</a>
<a class="file-line-num diff-line-num" data-line-number="441" href="#L441" id="L441">
441
</a>
<a class="file-line-num diff-line-num" data-line-number="442" href="#L442" id="L442">
442
</a>
<a class="file-line-num diff-line-num" data-line-number="443" href="#L443" id="L443">
443
</a>
<a class="file-line-num diff-line-num" data-line-number="444" href="#L444" id="L444">
444
</a>
<a class="file-line-num diff-line-num" data-line-number="445" href="#L445" id="L445">
445
</a>
<a class="file-line-num diff-line-num" data-line-number="446" href="#L446" id="L446">
446
</a>
<a class="file-line-num diff-line-num" data-line-number="447" href="#L447" id="L447">
447
</a>
<a class="file-line-num diff-line-num" data-line-number="448" href="#L448" id="L448">
448
</a>
<a class="file-line-num diff-line-num" data-line-number="449" href="#L449" id="L449">
449
</a>
<a class="file-line-num diff-line-num" data-line-number="450" href="#L450" id="L450">
450
</a>
<a class="file-line-num diff-line-num" data-line-number="451" href="#L451" id="L451">
451
</a>
<a class="file-line-num diff-line-num" data-line-number="452" href="#L452" id="L452">
452
</a>
<a class="file-line-num diff-line-num" data-line-number="453" href="#L453" id="L453">
453
</a>
<a class="file-line-num diff-line-num" data-line-number="454" href="#L454" id="L454">
454
</a>
<a class="file-line-num diff-line-num" data-line-number="455" href="#L455" id="L455">
455
</a>
<a class="file-line-num diff-line-num" data-line-number="456" href="#L456" id="L456">
456
</a>
<a class="file-line-num diff-line-num" data-line-number="457" href="#L457" id="L457">
457
</a>
<a class="file-line-num diff-line-num" data-line-number="458" href="#L458" id="L458">
458
</a>
<a class="file-line-num diff-line-num" data-line-number="459" href="#L459" id="L459">
459
</a>
<a class="file-line-num diff-line-num" data-line-number="460" href="#L460" id="L460">
460
</a>
<a class="file-line-num diff-line-num" data-line-number="461" href="#L461" id="L461">
461
</a>
<a class="file-line-num diff-line-num" data-line-number="462" href="#L462" id="L462">
462
</a>
<a class="file-line-num diff-line-num" data-line-number="463" href="#L463" id="L463">
463
</a>
<a class="file-line-num diff-line-num" data-line-number="464" href="#L464" id="L464">
464
</a>
<a class="file-line-num diff-line-num" data-line-number="465" href="#L465" id="L465">
465
</a>
<a class="file-line-num diff-line-num" data-line-number="466" href="#L466" id="L466">
466
</a>
<a class="file-line-num diff-line-num" data-line-number="467" href="#L467" id="L467">
467
</a>
<a class="file-line-num diff-line-num" data-line-number="468" href="#L468" id="L468">
468
</a>
<a class="file-line-num diff-line-num" data-line-number="469" href="#L469" id="L469">
469
</a>
<a class="file-line-num diff-line-num" data-line-number="470" href="#L470" id="L470">
470
</a>
<a class="file-line-num diff-line-num" data-line-number="471" href="#L471" id="L471">
471
</a>
<a class="file-line-num diff-line-num" data-line-number="472" href="#L472" id="L472">
472
</a>
<a class="file-line-num diff-line-num" data-line-number="473" href="#L473" id="L473">
473
</a>
<a class="file-line-num diff-line-num" data-line-number="474" href="#L474" id="L474">
474
</a>
<a class="file-line-num diff-line-num" data-line-number="475" href="#L475" id="L475">
475
</a>
<a class="file-line-num diff-line-num" data-line-number="476" href="#L476" id="L476">
476
</a>
<a class="file-line-num diff-line-num" data-line-number="477" href="#L477" id="L477">
477
</a>
<a class="file-line-num diff-line-num" data-line-number="478" href="#L478" id="L478">
478
</a>
<a class="file-line-num diff-line-num" data-line-number="479" href="#L479" id="L479">
479
</a>
<a class="file-line-num diff-line-num" data-line-number="480" href="#L480" id="L480">
480
</a>
<a class="file-line-num diff-line-num" data-line-number="481" href="#L481" id="L481">
481
</a>
<a class="file-line-num diff-line-num" data-line-number="482" href="#L482" id="L482">
482
</a>
<a class="file-line-num diff-line-num" data-line-number="483" href="#L483" id="L483">
483
</a>
<a class="file-line-num diff-line-num" data-line-number="484" href="#L484" id="L484">
484
</a>
<a class="file-line-num diff-line-num" data-line-number="485" href="#L485" id="L485">
485
</a>
<a class="file-line-num diff-line-num" data-line-number="486" href="#L486" id="L486">
486
</a>
<a class="file-line-num diff-line-num" data-line-number="487" href="#L487" id="L487">
487
</a>
<a class="file-line-num diff-line-num" data-line-number="488" href="#L488" id="L488">
488
</a>
<a class="file-line-num diff-line-num" data-line-number="489" href="#L489" id="L489">
489
</a>
<a class="file-line-num diff-line-num" data-line-number="490" href="#L490" id="L490">
490
</a>
<a class="file-line-num diff-line-num" data-line-number="491" href="#L491" id="L491">
491
</a>
<a class="file-line-num diff-line-num" data-line-number="492" href="#L492" id="L492">
492
</a>
<a class="file-line-num diff-line-num" data-line-number="493" href="#L493" id="L493">
493
</a>
<a class="file-line-num diff-line-num" data-line-number="494" href="#L494" id="L494">
494
</a>
<a class="file-line-num diff-line-num" data-line-number="495" href="#L495" id="L495">
495
</a>
<a class="file-line-num diff-line-num" data-line-number="496" href="#L496" id="L496">
496
</a>
<a class="file-line-num diff-line-num" data-line-number="497" href="#L497" id="L497">
497
</a>
<a class="file-line-num diff-line-num" data-line-number="498" href="#L498" id="L498">
498
</a>
<a class="file-line-num diff-line-num" data-line-number="499" href="#L499" id="L499">
499
</a>
<a class="file-line-num diff-line-num" data-line-number="500" href="#L500" id="L500">
500
</a>
<a class="file-line-num diff-line-num" data-line-number="501" href="#L501" id="L501">
501
</a>
<a class="file-line-num diff-line-num" data-line-number="502" href="#L502" id="L502">
502
</a>
<a class="file-line-num diff-line-num" data-line-number="503" href="#L503" id="L503">
503
</a>
<a class="file-line-num diff-line-num" data-line-number="504" href="#L504" id="L504">
504
</a>
<a class="file-line-num diff-line-num" data-line-number="505" href="#L505" id="L505">
505
</a>
<a class="file-line-num diff-line-num" data-line-number="506" href="#L506" id="L506">
506
</a>
<a class="file-line-num diff-line-num" data-line-number="507" href="#L507" id="L507">
507
</a>
<a class="file-line-num diff-line-num" data-line-number="508" href="#L508" id="L508">
508
</a>
<a class="file-line-num diff-line-num" data-line-number="509" href="#L509" id="L509">
509
</a>
<a class="file-line-num diff-line-num" data-line-number="510" href="#L510" id="L510">
510
</a>
<a class="file-line-num diff-line-num" data-line-number="511" href="#L511" id="L511">
511
</a>
<a class="file-line-num diff-line-num" data-line-number="512" href="#L512" id="L512">
512
</a>
<a class="file-line-num diff-line-num" data-line-number="513" href="#L513" id="L513">
513
</a>
<a class="file-line-num diff-line-num" data-line-number="514" href="#L514" id="L514">
514
</a>
<a class="file-line-num diff-line-num" data-line-number="515" href="#L515" id="L515">
515
</a>
<a class="file-line-num diff-line-num" data-line-number="516" href="#L516" id="L516">
516
</a>
<a class="file-line-num diff-line-num" data-line-number="517" href="#L517" id="L517">
517
</a>
<a class="file-line-num diff-line-num" data-line-number="518" href="#L518" id="L518">
518
</a>
<a class="file-line-num diff-line-num" data-line-number="519" href="#L519" id="L519">
519
</a>
<a class="file-line-num diff-line-num" data-line-number="520" href="#L520" id="L520">
520
</a>
<a class="file-line-num diff-line-num" data-line-number="521" href="#L521" id="L521">
521
</a>
<a class="file-line-num diff-line-num" data-line-number="522" href="#L522" id="L522">
522
</a>
<a class="file-line-num diff-line-num" data-line-number="523" href="#L523" id="L523">
523
</a>
<a class="file-line-num diff-line-num" data-line-number="524" href="#L524" id="L524">
524
</a>
<a class="file-line-num diff-line-num" data-line-number="525" href="#L525" id="L525">
525
</a>
<a class="file-line-num diff-line-num" data-line-number="526" href="#L526" id="L526">
526
</a>
<a class="file-line-num diff-line-num" data-line-number="527" href="#L527" id="L527">
527
</a>
<a class="file-line-num diff-line-num" data-line-number="528" href="#L528" id="L528">
528
</a>
<a class="file-line-num diff-line-num" data-line-number="529" href="#L529" id="L529">
529
</a>
<a class="file-line-num diff-line-num" data-line-number="530" href="#L530" id="L530">
530
</a>
<a class="file-line-num diff-line-num" data-line-number="531" href="#L531" id="L531">
531
</a>
<a class="file-line-num diff-line-num" data-line-number="532" href="#L532" id="L532">
532
</a>
<a class="file-line-num diff-line-num" data-line-number="533" href="#L533" id="L533">
533
</a>
<a class="file-line-num diff-line-num" data-line-number="534" href="#L534" id="L534">
534
</a>
<a class="file-line-num diff-line-num" data-line-number="535" href="#L535" id="L535">
535
</a>
<a class="file-line-num diff-line-num" data-line-number="536" href="#L536" id="L536">
536
</a>
<a class="file-line-num diff-line-num" data-line-number="537" href="#L537" id="L537">
537
</a>
<a class="file-line-num diff-line-num" data-line-number="538" href="#L538" id="L538">
538
</a>
<a class="file-line-num diff-line-num" data-line-number="539" href="#L539" id="L539">
539
</a>
<a class="file-line-num diff-line-num" data-line-number="540" href="#L540" id="L540">
540
</a>
<a class="file-line-num diff-line-num" data-line-number="541" href="#L541" id="L541">
541
</a>
<a class="file-line-num diff-line-num" data-line-number="542" href="#L542" id="L542">
542
</a>
<a class="file-line-num diff-line-num" data-line-number="543" href="#L543" id="L543">
543
</a>
<a class="file-line-num diff-line-num" data-line-number="544" href="#L544" id="L544">
544
</a>
<a class="file-line-num diff-line-num" data-line-number="545" href="#L545" id="L545">
545
</a>
<a class="file-line-num diff-line-num" data-line-number="546" href="#L546" id="L546">
546
</a>
<a class="file-line-num diff-line-num" data-line-number="547" href="#L547" id="L547">
547
</a>
<a class="file-line-num diff-line-num" data-line-number="548" href="#L548" id="L548">
548
</a>
<a class="file-line-num diff-line-num" data-line-number="549" href="#L549" id="L549">
549
</a>
<a class="file-line-num diff-line-num" data-line-number="550" href="#L550" id="L550">
550
</a>
<a class="file-line-num diff-line-num" data-line-number="551" href="#L551" id="L551">
551
</a>
<a class="file-line-num diff-line-num" data-line-number="552" href="#L552" id="L552">
552
</a>
<a class="file-line-num diff-line-num" data-line-number="553" href="#L553" id="L553">
553
</a>
<a class="file-line-num diff-line-num" data-line-number="554" href="#L554" id="L554">
554
</a>
<a class="file-line-num diff-line-num" data-line-number="555" href="#L555" id="L555">
555
</a>
<a class="file-line-num diff-line-num" data-line-number="556" href="#L556" id="L556">
556
</a>
<a class="file-line-num diff-line-num" data-line-number="557" href="#L557" id="L557">
557
</a>
<a class="file-line-num diff-line-num" data-line-number="558" href="#L558" id="L558">
558
</a>
<a class="file-line-num diff-line-num" data-line-number="559" href="#L559" id="L559">
559
</a>
<a class="file-line-num diff-line-num" data-line-number="560" href="#L560" id="L560">
560
</a>
<a class="file-line-num diff-line-num" data-line-number="561" href="#L561" id="L561">
561
</a>
<a class="file-line-num diff-line-num" data-line-number="562" href="#L562" id="L562">
562
</a>
<a class="file-line-num diff-line-num" data-line-number="563" href="#L563" id="L563">
563
</a>
<a class="file-line-num diff-line-num" data-line-number="564" href="#L564" id="L564">
564
</a>
<a class="file-line-num diff-line-num" data-line-number="565" href="#L565" id="L565">
565
</a>
<a class="file-line-num diff-line-num" data-line-number="566" href="#L566" id="L566">
566
</a>
<a class="file-line-num diff-line-num" data-line-number="567" href="#L567" id="L567">
567
</a>
<a class="file-line-num diff-line-num" data-line-number="568" href="#L568" id="L568">
568
</a>
<a class="file-line-num diff-line-num" data-line-number="569" href="#L569" id="L569">
569
</a>
<a class="file-line-num diff-line-num" data-line-number="570" href="#L570" id="L570">
570
</a>
<a class="file-line-num diff-line-num" data-line-number="571" href="#L571" id="L571">
571
</a>
<a class="file-line-num diff-line-num" data-line-number="572" href="#L572" id="L572">
572
</a>
<a class="file-line-num diff-line-num" data-line-number="573" href="#L573" id="L573">
573
</a>
<a class="file-line-num diff-line-num" data-line-number="574" href="#L574" id="L574">
574
</a>
<a class="file-line-num diff-line-num" data-line-number="575" href="#L575" id="L575">
575
</a>
<a class="file-line-num diff-line-num" data-line-number="576" href="#L576" id="L576">
576
</a>
<a class="file-line-num diff-line-num" data-line-number="577" href="#L577" id="L577">
577
</a>
<a class="file-line-num diff-line-num" data-line-number="578" href="#L578" id="L578">
578
</a>
<a class="file-line-num diff-line-num" data-line-number="579" href="#L579" id="L579">
579
</a>
<a class="file-line-num diff-line-num" data-line-number="580" href="#L580" id="L580">
580
</a>
<a class="file-line-num diff-line-num" data-line-number="581" href="#L581" id="L581">
581
</a>
<a class="file-line-num diff-line-num" data-line-number="582" href="#L582" id="L582">
582
</a>
<a class="file-line-num diff-line-num" data-line-number="583" href="#L583" id="L583">
583
</a>
<a class="file-line-num diff-line-num" data-line-number="584" href="#L584" id="L584">
584
</a>
<a class="file-line-num diff-line-num" data-line-number="585" href="#L585" id="L585">
585
</a>
<a class="file-line-num diff-line-num" data-line-number="586" href="#L586" id="L586">
586
</a>
<a class="file-line-num diff-line-num" data-line-number="587" href="#L587" id="L587">
587
</a>
<a class="file-line-num diff-line-num" data-line-number="588" href="#L588" id="L588">
588
</a>
<a class="file-line-num diff-line-num" data-line-number="589" href="#L589" id="L589">
589
</a>
<a class="file-line-num diff-line-num" data-line-number="590" href="#L590" id="L590">
590
</a>
<a class="file-line-num diff-line-num" data-line-number="591" href="#L591" id="L591">
591
</a>
<a class="file-line-num diff-line-num" data-line-number="592" href="#L592" id="L592">
592
</a>
<a class="file-line-num diff-line-num" data-line-number="593" href="#L593" id="L593">
593
</a>
<a class="file-line-num diff-line-num" data-line-number="594" href="#L594" id="L594">
594
</a>
<a class="file-line-num diff-line-num" data-line-number="595" href="#L595" id="L595">
595
</a>
<a class="file-line-num diff-line-num" data-line-number="596" href="#L596" id="L596">
596
</a>
<a class="file-line-num diff-line-num" data-line-number="597" href="#L597" id="L597">
597
</a>
<a class="file-line-num diff-line-num" data-line-number="598" href="#L598" id="L598">
598
</a>
<a class="file-line-num diff-line-num" data-line-number="599" href="#L599" id="L599">
599
</a>
<a class="file-line-num diff-line-num" data-line-number="600" href="#L600" id="L600">
600
</a>
<a class="file-line-num diff-line-num" data-line-number="601" href="#L601" id="L601">
601
</a>
<a class="file-line-num diff-line-num" data-line-number="602" href="#L602" id="L602">
602
</a>
<a class="file-line-num diff-line-num" data-line-number="603" href="#L603" id="L603">
603
</a>
<a class="file-line-num diff-line-num" data-line-number="604" href="#L604" id="L604">
604
</a>
<a class="file-line-num diff-line-num" data-line-number="605" href="#L605" id="L605">
605
</a>
<a class="file-line-num diff-line-num" data-line-number="606" href="#L606" id="L606">
606
</a>
<a class="file-line-num diff-line-num" data-line-number="607" href="#L607" id="L607">
607
</a>
<a class="file-line-num diff-line-num" data-line-number="608" href="#L608" id="L608">
608
</a>
<a class="file-line-num diff-line-num" data-line-number="609" href="#L609" id="L609">
609
</a>
<a class="file-line-num diff-line-num" data-line-number="610" href="#L610" id="L610">
610
</a>
<a class="file-line-num diff-line-num" data-line-number="611" href="#L611" id="L611">
611
</a>
<a class="file-line-num diff-line-num" data-line-number="612" href="#L612" id="L612">
612
</a>
<a class="file-line-num diff-line-num" data-line-number="613" href="#L613" id="L613">
613
</a>
<a class="file-line-num diff-line-num" data-line-number="614" href="#L614" id="L614">
614
</a>
<a class="file-line-num diff-line-num" data-line-number="615" href="#L615" id="L615">
615
</a>
<a class="file-line-num diff-line-num" data-line-number="616" href="#L616" id="L616">
616
</a>
<a class="file-line-num diff-line-num" data-line-number="617" href="#L617" id="L617">
617
</a>
<a class="file-line-num diff-line-num" data-line-number="618" href="#L618" id="L618">
618
</a>
<a class="file-line-num diff-line-num" data-line-number="619" href="#L619" id="L619">
619
</a>
<a class="file-line-num diff-line-num" data-line-number="620" href="#L620" id="L620">
620
</a>
<a class="file-line-num diff-line-num" data-line-number="621" href="#L621" id="L621">
621
</a>
<a class="file-line-num diff-line-num" data-line-number="622" href="#L622" id="L622">
622
</a>
<a class="file-line-num diff-line-num" data-line-number="623" href="#L623" id="L623">
623
</a>
<a class="file-line-num diff-line-num" data-line-number="624" href="#L624" id="L624">
624
</a>
<a class="file-line-num diff-line-num" data-line-number="625" href="#L625" id="L625">
625
</a>
<a class="file-line-num diff-line-num" data-line-number="626" href="#L626" id="L626">
626
</a>
<a class="file-line-num diff-line-num" data-line-number="627" href="#L627" id="L627">
627
</a>
<a class="file-line-num diff-line-num" data-line-number="628" href="#L628" id="L628">
628
</a>
<a class="file-line-num diff-line-num" data-line-number="629" href="#L629" id="L629">
629
</a>
<a class="file-line-num diff-line-num" data-line-number="630" href="#L630" id="L630">
630
</a>
<a class="file-line-num diff-line-num" data-line-number="631" href="#L631" id="L631">
631
</a>
<a class="file-line-num diff-line-num" data-line-number="632" href="#L632" id="L632">
632
</a>
<a class="file-line-num diff-line-num" data-line-number="633" href="#L633" id="L633">
633
</a>
<a class="file-line-num diff-line-num" data-line-number="634" href="#L634" id="L634">
634
</a>
<a class="file-line-num diff-line-num" data-line-number="635" href="#L635" id="L635">
635
</a>
<a class="file-line-num diff-line-num" data-line-number="636" href="#L636" id="L636">
636
</a>
<a class="file-line-num diff-line-num" data-line-number="637" href="#L637" id="L637">
637
</a>
<a class="file-line-num diff-line-num" data-line-number="638" href="#L638" id="L638">
638
</a>
<a class="file-line-num diff-line-num" data-line-number="639" href="#L639" id="L639">
639
</a>
<a class="file-line-num diff-line-num" data-line-number="640" href="#L640" id="L640">
640
</a>
<a class="file-line-num diff-line-num" data-line-number="641" href="#L641" id="L641">
641
</a>
<a class="file-line-num diff-line-num" data-line-number="642" href="#L642" id="L642">
642
</a>
<a class="file-line-num diff-line-num" data-line-number="643" href="#L643" id="L643">
643
</a>
<a class="file-line-num diff-line-num" data-line-number="644" href="#L644" id="L644">
644
</a>
<a class="file-line-num diff-line-num" data-line-number="645" href="#L645" id="L645">
645
</a>
<a class="file-line-num diff-line-num" data-line-number="646" href="#L646" id="L646">
646
</a>
<a class="file-line-num diff-line-num" data-line-number="647" href="#L647" id="L647">
647
</a>
<a class="file-line-num diff-line-num" data-line-number="648" href="#L648" id="L648">
648
</a>
<a class="file-line-num diff-line-num" data-line-number="649" href="#L649" id="L649">
649
</a>
<a class="file-line-num diff-line-num" data-line-number="650" href="#L650" id="L650">
650
</a>
<a class="file-line-num diff-line-num" data-line-number="651" href="#L651" id="L651">
651
</a>
<a class="file-line-num diff-line-num" data-line-number="652" href="#L652" id="L652">
652
</a>
<a class="file-line-num diff-line-num" data-line-number="653" href="#L653" id="L653">
653
</a>
<a class="file-line-num diff-line-num" data-line-number="654" href="#L654" id="L654">
654
</a>
<a class="file-line-num diff-line-num" data-line-number="655" href="#L655" id="L655">
655
</a>
<a class="file-line-num diff-line-num" data-line-number="656" href="#L656" id="L656">
656
</a>
<a class="file-line-num diff-line-num" data-line-number="657" href="#L657" id="L657">
657
</a>
<a class="file-line-num diff-line-num" data-line-number="658" href="#L658" id="L658">
658
</a>
<a class="file-line-num diff-line-num" data-line-number="659" href="#L659" id="L659">
659
</a>
<a class="file-line-num diff-line-num" data-line-number="660" href="#L660" id="L660">
660
</a>
<a class="file-line-num diff-line-num" data-line-number="661" href="#L661" id="L661">
661
</a>
<a class="file-line-num diff-line-num" data-line-number="662" href="#L662" id="L662">
662
</a>
<a class="file-line-num diff-line-num" data-line-number="663" href="#L663" id="L663">
663
</a>
<a class="file-line-num diff-line-num" data-line-number="664" href="#L664" id="L664">
664
</a>
<a class="file-line-num diff-line-num" data-line-number="665" href="#L665" id="L665">
665
</a>
<a class="file-line-num diff-line-num" data-line-number="666" href="#L666" id="L666">
666
</a>
<a class="file-line-num diff-line-num" data-line-number="667" href="#L667" id="L667">
667
</a>
<a class="file-line-num diff-line-num" data-line-number="668" href="#L668" id="L668">
668
</a>
<a class="file-line-num diff-line-num" data-line-number="669" href="#L669" id="L669">
669
</a>
<a class="file-line-num diff-line-num" data-line-number="670" href="#L670" id="L670">
670
</a>
<a class="file-line-num diff-line-num" data-line-number="671" href="#L671" id="L671">
671
</a>
<a class="file-line-num diff-line-num" data-line-number="672" href="#L672" id="L672">
672
</a>
<a class="file-line-num diff-line-num" data-line-number="673" href="#L673" id="L673">
673
</a>
<a class="file-line-num diff-line-num" data-line-number="674" href="#L674" id="L674">
674
</a>
<a class="file-line-num diff-line-num" data-line-number="675" href="#L675" id="L675">
675
</a>
<a class="file-line-num diff-line-num" data-line-number="676" href="#L676" id="L676">
676
</a>
<a class="file-line-num diff-line-num" data-line-number="677" href="#L677" id="L677">
677
</a>
<a class="file-line-num diff-line-num" data-line-number="678" href="#L678" id="L678">
678
</a>
<a class="file-line-num diff-line-num" data-line-number="679" href="#L679" id="L679">
679
</a>
<a class="file-line-num diff-line-num" data-line-number="680" href="#L680" id="L680">
680
</a>
<a class="file-line-num diff-line-num" data-line-number="681" href="#L681" id="L681">
681
</a>
<a class="file-line-num diff-line-num" data-line-number="682" href="#L682" id="L682">
682
</a>
<a class="file-line-num diff-line-num" data-line-number="683" href="#L683" id="L683">
683
</a>
<a class="file-line-num diff-line-num" data-line-number="684" href="#L684" id="L684">
684
</a>
<a class="file-line-num diff-line-num" data-line-number="685" href="#L685" id="L685">
685
</a>
<a class="file-line-num diff-line-num" data-line-number="686" href="#L686" id="L686">
686
</a>
<a class="file-line-num diff-line-num" data-line-number="687" href="#L687" id="L687">
687
</a>
<a class="file-line-num diff-line-num" data-line-number="688" href="#L688" id="L688">
688
</a>
<a class="file-line-num diff-line-num" data-line-number="689" href="#L689" id="L689">
689
</a>
<a class="file-line-num diff-line-num" data-line-number="690" href="#L690" id="L690">
690
</a>
<a class="file-line-num diff-line-num" data-line-number="691" href="#L691" id="L691">
691
</a>
<a class="file-line-num diff-line-num" data-line-number="692" href="#L692" id="L692">
692
</a>
<a class="file-line-num diff-line-num" data-line-number="693" href="#L693" id="L693">
693
</a>
<a class="file-line-num diff-line-num" data-line-number="694" href="#L694" id="L694">
694
</a>
<a class="file-line-num diff-line-num" data-line-number="695" href="#L695" id="L695">
695
</a>
<a class="file-line-num diff-line-num" data-line-number="696" href="#L696" id="L696">
696
</a>
<a class="file-line-num diff-line-num" data-line-number="697" href="#L697" id="L697">
697
</a>
<a class="file-line-num diff-line-num" data-line-number="698" href="#L698" id="L698">
698
</a>
<a class="file-line-num diff-line-num" data-line-number="699" href="#L699" id="L699">
699
</a>
<a class="file-line-num diff-line-num" data-line-number="700" href="#L700" id="L700">
700
</a>
<a class="file-line-num diff-line-num" data-line-number="701" href="#L701" id="L701">
701
</a>
<a class="file-line-num diff-line-num" data-line-number="702" href="#L702" id="L702">
702
</a>
<a class="file-line-num diff-line-num" data-line-number="703" href="#L703" id="L703">
703
</a>
<a class="file-line-num diff-line-num" data-line-number="704" href="#L704" id="L704">
704
</a>
<a class="file-line-num diff-line-num" data-line-number="705" href="#L705" id="L705">
705
</a>
<a class="file-line-num diff-line-num" data-line-number="706" href="#L706" id="L706">
706
</a>
<a class="file-line-num diff-line-num" data-line-number="707" href="#L707" id="L707">
707
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2001, 2004, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.</span></span>
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
<span id="LC23" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC24" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC25" class="line" lang="java"><span class="kn">package</span> <span class="nn">com.sun.corba.se.impl.encoding</span><span class="o">;</span></span>
<span id="LC26" class="line" lang="java"></span>
<span id="LC27" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.Map</span><span class="o">;</span></span>
<span id="LC28" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.HashMap</span><span class="o">;</span></span>
<span id="LC29" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.ByteBuffer</span><span class="o">;</span></span>
<span id="LC30" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.CharBuffer</span><span class="o">;</span></span>
<span id="LC31" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.Charset</span><span class="o">;</span></span>
<span id="LC32" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.CharsetEncoder</span><span class="o">;</span></span>
<span id="LC33" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.CharsetDecoder</span><span class="o">;</span></span>
<span id="LC34" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.CharacterCodingException</span><span class="o">;</span></span>
<span id="LC35" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.IllegalCharsetNameException</span><span class="o">;</span></span>
<span id="LC36" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.MalformedInputException</span><span class="o">;</span></span>
<span id="LC37" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.UnsupportedCharsetException</span><span class="o">;</span></span>
<span id="LC38" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.UnmappableCharacterException</span><span class="o">;</span></span>
<span id="LC39" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.corba.se.impl.logging.ORBUtilSystemException</span><span class="o">;</span></span>
<span id="LC40" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.corba.se.impl.logging.OMGSystemException</span><span class="o">;</span></span>
<span id="LC41" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.corba.se.spi.logging.CORBALogDomains</span><span class="o">;</span></span>
<span id="LC42" class="line" lang="java"></span>
<span id="LC43" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> * Collection of classes, interfaces, and factory methods for</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> * CORBA code set conversion.</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> * This is mainly used to shield other code from the sun.io</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> * converters which might change, as well as provide some basic</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> * translation from conversion to CORBA error exceptions.  Some</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> * extra work is required here to facilitate the way CORBA</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> * says it uses UTF-16 as of the 00-11-03 spec.</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> * REVISIT - Since the nio.Charset and nio.Charset.Encoder/Decoder</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> *           use NIO ByteBuffer and NIO CharBuffer, the interaction</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> *           and interface between this class and the CDR streams</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> *           should be looked at more closely for optimizations to</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> *           avoid unnecessary copying of data between char[] &amp;</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> *           CharBuffer and byte[] &amp; ByteBuffer, especially</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> *           DirectByteBuffers.</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC62" class="line" lang="java"><span class="kd">public</span> <span class="kd">class</span> <span class="nc">CodeSetConversion</span></span>
<span id="LC63" class="line" lang="java"><span class="o">{</span></span>
<span id="LC64" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC65" class="line" lang="java"><span class="cm">     * Abstraction for char to byte conversion.</span></span>
<span id="LC66" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC67" class="line" lang="java"><span class="cm">     * Must be used in the proper sequence:</span></span>
<span id="LC68" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC69" class="line" lang="java"><span class="cm">     * 1)  convert</span></span>
<span id="LC70" class="line" lang="java"><span class="cm">     * 2)  Optional getNumBytes and/or getAlignment (if necessary)</span></span>
<span id="LC71" class="line" lang="java"><span class="cm">     * 3)  getBytes (see warning)</span></span>
<span id="LC72" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC73" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kd">static</span> <span class="kd">class</span> <span class="nc">CTBConverter</span></span>
<span id="LC74" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC75" class="line" lang="java">        <span class="c1">// Perform the conversion of the provided char or String,</span></span>
<span id="LC76" class="line" lang="java">        <span class="c1">// allowing the caller to query for more information</span></span>
<span id="LC77" class="line" lang="java">        <span class="c1">// before writing.</span></span>
<span id="LC78" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">convert</span><span class="o">(</span><span class="kt">char</span> <span class="n">chToConvert</span><span class="o">);</span></span>
<span id="LC79" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">convert</span><span class="o">(</span><span class="nc">String</span> <span class="n">strToConvert</span><span class="o">);</span></span>
<span id="LC80" class="line" lang="java"></span>
<span id="LC81" class="line" lang="java">        <span class="c1">// How many bytes resulted from the conversion?</span></span>
<span id="LC82" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">getNumBytes</span><span class="o">();</span></span>
<span id="LC83" class="line" lang="java"></span>
<span id="LC84" class="line" lang="java">        <span class="c1">// What's the maximum number of bytes per character?</span></span>
<span id="LC85" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">float</span> <span class="nf">getMaxBytesPerChar</span><span class="o">();</span></span>
<span id="LC86" class="line" lang="java"></span>
<span id="LC87" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">boolean</span> <span class="nf">isFixedWidthEncoding</span><span class="o">();</span></span>
<span id="LC88" class="line" lang="java"></span>
<span id="LC89" class="line" lang="java">        <span class="c1">// What byte boundary should the stream align to before</span></span>
<span id="LC90" class="line" lang="java">        <span class="c1">// calling writeBytes?  For instance, a fixed width</span></span>
<span id="LC91" class="line" lang="java">        <span class="c1">// encoding with 2 bytes per char in a stream which</span></span>
<span id="LC92" class="line" lang="java">        <span class="c1">// doesn't encapsulate the char's bytes should align</span></span>
<span id="LC93" class="line" lang="java">        <span class="c1">// on a 2 byte boundary.  (Ex:  UTF16 in GIOP1.1)</span></span>
<span id="LC94" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC95" class="line" lang="java">        <span class="c1">// Note: This has no effect on the converted bytes.  It</span></span>
<span id="LC96" class="line" lang="java">        <span class="c1">// is just information available to the caller.</span></span>
<span id="LC97" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">getAlignment</span><span class="o">();</span></span>
<span id="LC98" class="line" lang="java"></span>
<span id="LC99" class="line" lang="java">        <span class="c1">// Get the resulting bytes.  Warning:  You must use getNumBytes()</span></span>
<span id="LC100" class="line" lang="java">        <span class="c1">// to determine the end of the data in the byte array instead</span></span>
<span id="LC101" class="line" lang="java">        <span class="c1">// of array.length!  The array may be used internally, so don't</span></span>
<span id="LC102" class="line" lang="java">        <span class="c1">// save references.</span></span>
<span id="LC103" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">byte</span><span class="o">[]</span> <span class="nf">getBytes</span><span class="o">();</span></span>
<span id="LC104" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC105" class="line" lang="java"></span>
<span id="LC106" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC107" class="line" lang="java"><span class="cm">     * Abstraction for byte to char conversion.</span></span>
<span id="LC108" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC109" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kd">static</span> <span class="kd">class</span> <span class="nc">BTCConverter</span></span>
<span id="LC110" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC111" class="line" lang="java">        <span class="c1">// In GIOP 1.1, interoperability can only be achieved with</span></span>
<span id="LC112" class="line" lang="java">        <span class="c1">// fixed width encodings like UTF-16.  This is because wstrings</span></span>
<span id="LC113" class="line" lang="java">        <span class="c1">// specified how many code points follow rather than specifying</span></span>
<span id="LC114" class="line" lang="java">        <span class="c1">// the length in octets.</span></span>
<span id="LC115" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">boolean</span> <span class="nf">isFixedWidthEncoding</span><span class="o">();</span></span>
<span id="LC116" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">getFixedCharWidth</span><span class="o">();</span></span>
<span id="LC117" class="line" lang="java"></span>
<span id="LC118" class="line" lang="java">        <span class="c1">// Called after getChars to determine the true size of the</span></span>
<span id="LC119" class="line" lang="java">        <span class="c1">// converted array.</span></span>
<span id="LC120" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">getNumChars</span><span class="o">();</span></span>
<span id="LC121" class="line" lang="java"></span>
<span id="LC122" class="line" lang="java">        <span class="c1">// Perform the conversion using length bytes from the given</span></span>
<span id="LC123" class="line" lang="java">        <span class="c1">// input stream.  Warning:  You must use getNumChars() to</span></span>
<span id="LC124" class="line" lang="java">        <span class="c1">// determine the correct length of the resulting array.</span></span>
<span id="LC125" class="line" lang="java">        <span class="c1">// The same array may be used internally over multiple</span></span>
<span id="LC126" class="line" lang="java">        <span class="c1">// calls.</span></span>
<span id="LC127" class="line" lang="java">        <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">char</span><span class="o">[]</span> <span class="nf">getChars</span><span class="o">(</span><span class="kt">byte</span><span class="o">[]</span> <span class="n">bytes</span><span class="o">,</span> <span class="kt">int</span> <span class="n">offset</span><span class="o">,</span> <span class="kt">int</span> <span class="n">length</span><span class="o">);</span></span>
<span id="LC128" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC129" class="line" lang="java"></span>
<span id="LC130" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC131" class="line" lang="java"><span class="cm">     * Implementation of CTBConverter which uses a nio.Charset.CharsetEncoder</span></span>
<span id="LC132" class="line" lang="java"><span class="cm">     * to do the real work.  Handles translation of exceptions to the</span></span>
<span id="LC133" class="line" lang="java"><span class="cm">     * appropriate CORBA versions.</span></span>
<span id="LC134" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC135" class="line" lang="java">    <span class="kd">private</span> <span class="kd">class</span> <span class="nc">JavaCTBConverter</span> <span class="kd">extends</span> <span class="nc">CTBConverter</span></span>
<span id="LC136" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC137" class="line" lang="java">        <span class="kd">private</span> <span class="nc">ORBUtilSystemException</span> <span class="n">wrapper</span> <span class="o">=</span> <span class="nc">ORBUtilSystemException</span><span class="o">.</span><span class="na">get</span><span class="o">(</span></span>
<span id="LC138" class="line" lang="java">            <span class="nc">CORBALogDomains</span><span class="o">.</span><span class="na">RPC_ENCODING</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC139" class="line" lang="java"></span>
<span id="LC140" class="line" lang="java">        <span class="kd">private</span> <span class="nc">OMGSystemException</span> <span class="n">omgWrapper</span> <span class="o">=</span> <span class="nc">OMGSystemException</span><span class="o">.</span><span class="na">get</span><span class="o">(</span></span>
<span id="LC141" class="line" lang="java">            <span class="nc">CORBALogDomains</span><span class="o">.</span><span class="na">RPC_ENCODING</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC142" class="line" lang="java"></span>
<span id="LC143" class="line" lang="java">        <span class="c1">// nio.Charset.CharsetEncoder actually does the work here</span></span>
<span id="LC144" class="line" lang="java">        <span class="c1">// have to use it directly rather than through String's interface</span></span>
<span id="LC145" class="line" lang="java">        <span class="c1">// because we want to know when errors occur during the conversion.</span></span>
<span id="LC146" class="line" lang="java">        <span class="kd">private</span> <span class="nc">CharsetEncoder</span> <span class="n">ctb</span><span class="o">;</span></span>
<span id="LC147" class="line" lang="java"></span>
<span id="LC148" class="line" lang="java">        <span class="c1">// Proper alignment for this type of converter.  For instance,</span></span>
<span id="LC149" class="line" lang="java">        <span class="c1">// ASCII has alignment of 1 (1 byte per char) but UTF16 has</span></span>
<span id="LC150" class="line" lang="java">        <span class="c1">// alignment of 2 (2 bytes per char)</span></span>
<span id="LC151" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="n">alignment</span><span class="o">;</span></span>
<span id="LC152" class="line" lang="java"></span>
<span id="LC153" class="line" lang="java">        <span class="c1">// Char buffer to hold the input.</span></span>
<span id="LC154" class="line" lang="java">        <span class="kd">private</span> <span class="kt">char</span><span class="o">[]</span> <span class="n">chars</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC155" class="line" lang="java"></span>
<span id="LC156" class="line" lang="java">        <span class="c1">// How many bytes are generated from the conversion?</span></span>
<span id="LC157" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="n">numBytes</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC158" class="line" lang="java"></span>
<span id="LC159" class="line" lang="java">        <span class="c1">// How many characters were converted (temporary variable</span></span>
<span id="LC160" class="line" lang="java">        <span class="c1">// for cross method communication)</span></span>
<span id="LC161" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="n">numChars</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC162" class="line" lang="java"></span>
<span id="LC163" class="line" lang="java">        <span class="c1">// ByteBuffer holding the converted input.  This is necessary</span></span>
<span id="LC164" class="line" lang="java">        <span class="c1">// since we have to do calculations that require the conversion</span></span>
<span id="LC165" class="line" lang="java">        <span class="c1">// before writing the array to the stream.</span></span>
<span id="LC166" class="line" lang="java">        <span class="kd">private</span> <span class="nc">ByteBuffer</span> <span class="n">buffer</span><span class="o">;</span></span>
<span id="LC167" class="line" lang="java"></span>
<span id="LC168" class="line" lang="java">        <span class="c1">// What code set are we using?</span></span>
<span id="LC169" class="line" lang="java">        <span class="kd">private</span> <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">codeset</span><span class="o">;</span></span>
<span id="LC170" class="line" lang="java"></span>
<span id="LC171" class="line" lang="java">        <span class="kd">public</span> <span class="nf">JavaCTBConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">codeset</span><span class="o">,</span></span>
<span id="LC172" class="line" lang="java">                                <span class="kt">int</span> <span class="n">alignmentForEncoding</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC173" class="line" lang="java"></span>
<span id="LC174" class="line" lang="java">            <span class="k">try</span> <span class="o">{</span></span>
<span id="LC175" class="line" lang="java">                <span class="n">ctb</span> <span class="o">=</span> <span class="n">cache</span><span class="o">.</span><span class="na">getCharToByteConverter</span><span class="o">(</span><span class="n">codeset</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></span>
<span id="LC176" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">ctb</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC177" class="line" lang="java">                    <span class="nc">Charset</span> <span class="n">tmpCharset</span> <span class="o">=</span> <span class="nc">Charset</span><span class="o">.</span><span class="na">forName</span><span class="o">(</span><span class="n">codeset</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></span>
<span id="LC178" class="line" lang="java">                    <span class="n">ctb</span> <span class="o">=</span> <span class="n">tmpCharset</span><span class="o">.</span><span class="na">newEncoder</span><span class="o">();</span></span>
<span id="LC179" class="line" lang="java">                    <span class="n">cache</span><span class="o">.</span><span class="na">setConverter</span><span class="o">(</span><span class="n">codeset</span><span class="o">.</span><span class="na">getName</span><span class="o">(),</span> <span class="n">ctb</span><span class="o">);</span></span>
<span id="LC180" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC181" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span><span class="o">(</span><span class="nc">IllegalCharsetNameException</span> <span class="n">icne</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC182" class="line" lang="java"></span>
<span id="LC183" class="line" lang="java">                <span class="c1">// This can only happen if one of our Entries has</span></span>
<span id="LC184" class="line" lang="java">                <span class="c1">// an invalid name.</span></span>
<span id="LC185" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">invalidCtbConverterName</span><span class="o">(</span><span class="n">icne</span><span class="o">,</span><span class="n">codeset</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></span>
<span id="LC186" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span><span class="o">(</span><span class="nc">UnsupportedCharsetException</span> <span class="n">ucne</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC187" class="line" lang="java"></span>
<span id="LC188" class="line" lang="java">                <span class="c1">// This can only happen if one of our Entries has</span></span>
<span id="LC189" class="line" lang="java">                <span class="c1">// an unsupported name.</span></span>
<span id="LC190" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">invalidCtbConverterName</span><span class="o">(</span><span class="n">ucne</span><span class="o">,</span><span class="n">codeset</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></span>
<span id="LC191" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC192" class="line" lang="java"></span>
<span id="LC193" class="line" lang="java">            <span class="k">this</span><span class="o">.</span><span class="na">codeset</span> <span class="o">=</span> <span class="n">codeset</span><span class="o">;</span></span>
<span id="LC194" class="line" lang="java">            <span class="n">alignment</span> <span class="o">=</span> <span class="n">alignmentForEncoding</span><span class="o">;</span></span>
<span id="LC195" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC196" class="line" lang="java"></span>
<span id="LC197" class="line" lang="java">        <span class="kd">public</span> <span class="kd">final</span> <span class="kt">float</span> <span class="nf">getMaxBytesPerChar</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC198" class="line" lang="java">            <span class="k">return</span> <span class="n">ctb</span><span class="o">.</span><span class="na">maxBytesPerChar</span><span class="o">();</span></span>
<span id="LC199" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC200" class="line" lang="java"></span>
<span id="LC201" class="line" lang="java">        <span class="kd">public</span> <span class="kt">void</span> <span class="nf">convert</span><span class="o">(</span><span class="kt">char</span> <span class="n">chToConvert</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC202" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">chars</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC203" class="line" lang="java">                <span class="n">chars</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">char</span><span class="o">[</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC204" class="line" lang="java"></span>
<span id="LC205" class="line" lang="java">            <span class="c1">// The CharToByteConverter only takes a char[]</span></span>
<span id="LC206" class="line" lang="java">            <span class="n">chars</span><span class="o">[</span><span class="mi">0</span><span class="o">]</span> <span class="o">=</span> <span class="n">chToConvert</span><span class="o">;</span></span>
<span id="LC207" class="line" lang="java">            <span class="n">numChars</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC208" class="line" lang="java"></span>
<span id="LC209" class="line" lang="java">            <span class="n">convertCharArray</span><span class="o">();</span></span>
<span id="LC210" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC211" class="line" lang="java"></span>
<span id="LC212" class="line" lang="java">        <span class="kd">public</span> <span class="kt">void</span> <span class="nf">convert</span><span class="o">(</span><span class="nc">String</span> <span class="n">strToConvert</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC213" class="line" lang="java">            <span class="c1">// Try to save a memory allocation if possible.  Usual</span></span>
<span id="LC214" class="line" lang="java">            <span class="c1">// space/time trade off.  If we could get the char[] out of</span></span>
<span id="LC215" class="line" lang="java">            <span class="c1">// the String without copying, that would be great, but</span></span>
<span id="LC216" class="line" lang="java">            <span class="c1">// it's forbidden since String is immutable.</span></span>
<span id="LC217" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">chars</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">chars</span><span class="o">.</span><span class="na">length</span> <span class="o">&lt;</span> <span class="n">strToConvert</span><span class="o">.</span><span class="na">length</span><span class="o">())</span></span>
<span id="LC218" class="line" lang="java">                <span class="n">chars</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">char</span><span class="o">[</span><span class="n">strToConvert</span><span class="o">.</span><span class="na">length</span><span class="o">()];</span></span>
<span id="LC219" class="line" lang="java"></span>
<span id="LC220" class="line" lang="java">            <span class="n">numChars</span> <span class="o">=</span> <span class="n">strToConvert</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC221" class="line" lang="java"></span>
<span id="LC222" class="line" lang="java">            <span class="n">strToConvert</span><span class="o">.</span><span class="na">getChars</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">numChars</span><span class="o">,</span> <span class="n">chars</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></span>
<span id="LC223" class="line" lang="java"></span>
<span id="LC224" class="line" lang="java">            <span class="n">convertCharArray</span><span class="o">();</span></span>
<span id="LC225" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC226" class="line" lang="java"></span>
<span id="LC227" class="line" lang="java">        <span class="kd">public</span> <span class="kd">final</span> <span class="kt">int</span> <span class="nf">getNumBytes</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC228" class="line" lang="java">            <span class="k">return</span> <span class="n">numBytes</span><span class="o">;</span></span>
<span id="LC229" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC230" class="line" lang="java"></span>
<span id="LC231" class="line" lang="java">        <span class="kd">public</span> <span class="kd">final</span> <span class="kt">int</span> <span class="nf">getAlignment</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC232" class="line" lang="java">            <span class="k">return</span> <span class="n">alignment</span><span class="o">;</span></span>
<span id="LC233" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC234" class="line" lang="java"></span>
<span id="LC235" class="line" lang="java">        <span class="kd">public</span> <span class="kd">final</span> <span class="kt">boolean</span> <span class="nf">isFixedWidthEncoding</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC236" class="line" lang="java">            <span class="k">return</span> <span class="n">codeset</span><span class="o">.</span><span class="na">isFixedWidth</span><span class="o">();</span></span>
<span id="LC237" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC238" class="line" lang="java"></span>
<span id="LC239" class="line" lang="java">        <span class="kd">public</span> <span class="kt">byte</span><span class="o">[]</span> <span class="nf">getBytes</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC240" class="line" lang="java">            <span class="c1">// Note that you can't use buffer.length since the buffer might</span></span>
<span id="LC241" class="line" lang="java">            <span class="c1">// be larger than the actual number of converted bytes depending</span></span>
<span id="LC242" class="line" lang="java">            <span class="c1">// on the encoding.</span></span>
<span id="LC243" class="line" lang="java">            <span class="k">return</span> <span class="n">buffer</span><span class="o">.</span><span class="na">array</span><span class="o">();</span></span>
<span id="LC244" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC245" class="line" lang="java"></span>
<span id="LC246" class="line" lang="java">        <span class="kd">private</span> <span class="kt">void</span> <span class="nf">convertCharArray</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC247" class="line" lang="java">            <span class="k">try</span> <span class="o">{</span></span>
<span id="LC248" class="line" lang="java"></span>
<span id="LC249" class="line" lang="java">                <span class="c1">// Possible optimization of directly converting into the CDR buffer.</span></span>
<span id="LC250" class="line" lang="java">                <span class="c1">// However, that means the CDR code would have to reserve</span></span>
<span id="LC251" class="line" lang="java">                <span class="c1">// a 4 byte string length ahead of time, and we'd need a</span></span>
<span id="LC252" class="line" lang="java">                <span class="c1">// confusing partial conversion scheme for when we couldn't</span></span>
<span id="LC253" class="line" lang="java">                <span class="c1">// fit everything in the buffer but needed to know the</span></span>
<span id="LC254" class="line" lang="java">                <span class="c1">// converted length before proceeding due to fragmentation.</span></span>
<span id="LC255" class="line" lang="java">                <span class="c1">// Then there's the issue of the chunking code.</span></span>
<span id="LC256" class="line" lang="java">                <span class="c1">//</span></span>
<span id="LC257" class="line" lang="java">                <span class="c1">// For right now, this is less messy and basic tests don't</span></span>
<span id="LC258" class="line" lang="java">                <span class="c1">// show more than a 1 ms penalty worst case.  Less than a</span></span>
<span id="LC259" class="line" lang="java">                <span class="c1">// factor of 2 increase.</span></span>
<span id="LC260" class="line" lang="java"></span>
<span id="LC261" class="line" lang="java">                <span class="c1">// Convert the characters</span></span>
<span id="LC262" class="line" lang="java">                <span class="n">buffer</span> <span class="o">=</span> <span class="n">ctb</span><span class="o">.</span><span class="na">encode</span><span class="o">(</span><span class="nc">CharBuffer</span><span class="o">.</span><span class="na">wrap</span><span class="o">(</span><span class="n">chars</span><span class="o">,</span><span class="mi">0</span><span class="o">,</span><span class="n">numChars</span><span class="o">));</span></span>
<span id="LC263" class="line" lang="java"></span>
<span id="LC264" class="line" lang="java">                <span class="c1">// ByteBuffer returned by the encoder will set its limit</span></span>
<span id="LC265" class="line" lang="java">                <span class="c1">// to byte immediately after the last written byte.</span></span>
<span id="LC266" class="line" lang="java">                <span class="n">numBytes</span> <span class="o">=</span> <span class="n">buffer</span><span class="o">.</span><span class="na">limit</span><span class="o">();</span></span>
<span id="LC267" class="line" lang="java"></span>
<span id="LC268" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">IllegalStateException</span> <span class="n">ise</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC269" class="line" lang="java">                <span class="c1">// an encoding operation is already in progress</span></span>
<span id="LC270" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">ctbConverterFailure</span><span class="o">(</span> <span class="n">ise</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC271" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">MalformedInputException</span> <span class="n">mie</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC272" class="line" lang="java">                <span class="c1">// There were illegal Unicode char pairs</span></span>
<span id="LC273" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">badUnicodePair</span><span class="o">(</span> <span class="n">mie</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC274" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">UnmappableCharacterException</span> <span class="n">uce</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC275" class="line" lang="java">                <span class="c1">// A character doesn't map to the desired code set</span></span>
<span id="LC276" class="line" lang="java">                <span class="c1">// CORBA formal 00-11-03.</span></span>
<span id="LC277" class="line" lang="java">                <span class="k">throw</span> <span class="n">omgWrapper</span><span class="o">.</span><span class="na">charNotInCodeset</span><span class="o">(</span> <span class="n">uce</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC278" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">CharacterCodingException</span> <span class="n">cce</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC279" class="line" lang="java">                <span class="c1">// If this happens, then some other encoding error occured</span></span>
<span id="LC280" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">ctbConverterFailure</span><span class="o">(</span> <span class="n">cce</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC281" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC282" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC283" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC284" class="line" lang="java"></span>
<span id="LC285" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC286" class="line" lang="java"><span class="cm">     * Special UTF16 converter which can either always write a BOM</span></span>
<span id="LC287" class="line" lang="java"><span class="cm">     * or use a specified byte order without one.</span></span>
<span id="LC288" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC289" class="line" lang="java">    <span class="kd">private</span> <span class="kd">class</span> <span class="nc">UTF16CTBConverter</span> <span class="kd">extends</span> <span class="nc">JavaCTBConverter</span></span>
<span id="LC290" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC291" class="line" lang="java">        <span class="c1">// Using this constructor, we will always write a BOM</span></span>
<span id="LC292" class="line" lang="java">        <span class="kd">public</span> <span class="nf">UTF16CTBConverter</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC293" class="line" lang="java">            <span class="kd">super</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16</span><span class="o">,</span> <span class="mi">2</span><span class="o">);</span></span>
<span id="LC294" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC295" class="line" lang="java"></span>
<span id="LC296" class="line" lang="java">        <span class="c1">// Using this constructor, we don't use a BOM and use the</span></span>
<span id="LC297" class="line" lang="java">        <span class="c1">// byte order specified</span></span>
<span id="LC298" class="line" lang="java">        <span class="kd">public</span> <span class="nf">UTF16CTBConverter</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">littleEndian</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC299" class="line" lang="java">            <span class="kd">super</span><span class="o">(</span><span class="n">littleEndian</span> <span class="o">?</span></span>
<span id="LC300" class="line" lang="java">                  <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16LE</span> <span class="o">:</span></span>
<span id="LC301" class="line" lang="java">                  <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16BE</span><span class="o">,</span></span>
<span id="LC302" class="line" lang="java">                  <span class="mi">2</span><span class="o">);</span></span>
<span id="LC303" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC304" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC305" class="line" lang="java"></span>
<span id="LC306" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC307" class="line" lang="java"><span class="cm">     * Implementation of BTCConverter which uses a sun.io.ByteToCharConverter</span></span>
<span id="LC308" class="line" lang="java"><span class="cm">     * for the real work.  Handles translation of exceptions to the</span></span>
<span id="LC309" class="line" lang="java"><span class="cm">     * appropriate CORBA versions.</span></span>
<span id="LC310" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC311" class="line" lang="java">    <span class="kd">private</span> <span class="kd">class</span> <span class="nc">JavaBTCConverter</span> <span class="kd">extends</span> <span class="nc">BTCConverter</span></span>
<span id="LC312" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC313" class="line" lang="java">        <span class="kd">private</span> <span class="nc">ORBUtilSystemException</span> <span class="n">wrapper</span> <span class="o">=</span> <span class="nc">ORBUtilSystemException</span><span class="o">.</span><span class="na">get</span><span class="o">(</span></span>
<span id="LC314" class="line" lang="java">            <span class="nc">CORBALogDomains</span><span class="o">.</span><span class="na">RPC_ENCODING</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC315" class="line" lang="java"></span>
<span id="LC316" class="line" lang="java">        <span class="kd">private</span> <span class="nc">OMGSystemException</span> <span class="n">omgWrapper</span> <span class="o">=</span> <span class="nc">OMGSystemException</span><span class="o">.</span><span class="na">get</span><span class="o">(</span></span>
<span id="LC317" class="line" lang="java">            <span class="nc">CORBALogDomains</span><span class="o">.</span><span class="na">RPC_ENCODING</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC318" class="line" lang="java"></span>
<span id="LC319" class="line" lang="java">        <span class="kd">protected</span> <span class="nc">CharsetDecoder</span> <span class="n">btc</span><span class="o">;</span></span>
<span id="LC320" class="line" lang="java">        <span class="kd">private</span> <span class="kt">char</span><span class="o">[]</span> <span class="n">buffer</span><span class="o">;</span></span>
<span id="LC321" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="n">resultingNumChars</span><span class="o">;</span></span>
<span id="LC322" class="line" lang="java">        <span class="kd">private</span> <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">codeset</span><span class="o">;</span></span>
<span id="LC323" class="line" lang="java"></span>
<span id="LC324" class="line" lang="java">        <span class="kd">public</span> <span class="nf">JavaBTCConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">codeset</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC325" class="line" lang="java"></span>
<span id="LC326" class="line" lang="java">            <span class="c1">// Obtain a Decoder</span></span>
<span id="LC327" class="line" lang="java">            <span class="n">btc</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">getConverter</span><span class="o">(</span><span class="n">codeset</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></span>
<span id="LC328" class="line" lang="java"></span>
<span id="LC329" class="line" lang="java">            <span class="k">this</span><span class="o">.</span><span class="na">codeset</span> <span class="o">=</span> <span class="n">codeset</span><span class="o">;</span></span>
<span id="LC330" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC331" class="line" lang="java"></span>
<span id="LC332" class="line" lang="java">        <span class="kd">public</span> <span class="kd">final</span> <span class="kt">boolean</span> <span class="nf">isFixedWidthEncoding</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC333" class="line" lang="java">            <span class="k">return</span> <span class="n">codeset</span><span class="o">.</span><span class="na">isFixedWidth</span><span class="o">();</span></span>
<span id="LC334" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC335" class="line" lang="java"></span>
<span id="LC336" class="line" lang="java">        <span class="c1">// Should only be called if isFixedWidthEncoding is true</span></span>
<span id="LC337" class="line" lang="java">        <span class="c1">// IMPORTANT: This calls OSFCodeSetRegistry.Entry, not</span></span>
<span id="LC338" class="line" lang="java">        <span class="c1">//            CharsetDecoder.maxCharsPerByte().</span></span>
<span id="LC339" class="line" lang="java">        <span class="kd">public</span> <span class="kd">final</span> <span class="kt">int</span> <span class="nf">getFixedCharWidth</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC340" class="line" lang="java">            <span class="k">return</span> <span class="n">codeset</span><span class="o">.</span><span class="na">getMaxBytesPerChar</span><span class="o">();</span></span>
<span id="LC341" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC342" class="line" lang="java"></span>
<span id="LC343" class="line" lang="java">        <span class="kd">public</span> <span class="kd">final</span> <span class="kt">int</span> <span class="nf">getNumChars</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC344" class="line" lang="java">            <span class="k">return</span> <span class="n">resultingNumChars</span><span class="o">;</span></span>
<span id="LC345" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC346" class="line" lang="java"></span>
<span id="LC347" class="line" lang="java">        <span class="kd">public</span> <span class="kt">char</span><span class="o">[]</span> <span class="nf">getChars</span><span class="o">(</span><span class="kt">byte</span><span class="o">[]</span> <span class="n">bytes</span><span class="o">,</span> <span class="kt">int</span> <span class="n">offset</span><span class="o">,</span> <span class="kt">int</span> <span class="n">numBytes</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC348" class="line" lang="java"></span>
<span id="LC349" class="line" lang="java">            <span class="c1">// Possible optimization of reading directly from the CDR</span></span>
<span id="LC350" class="line" lang="java">            <span class="c1">// byte buffer.  The sun.io converter supposedly can handle</span></span>
<span id="LC351" class="line" lang="java">            <span class="c1">// incremental conversions in which a char is broken across</span></span>
<span id="LC352" class="line" lang="java">            <span class="c1">// two convert calls.</span></span>
<span id="LC353" class="line" lang="java">            <span class="c1">//</span></span>
<span id="LC354" class="line" lang="java">            <span class="c1">// Basic tests didn't show more than a 1 ms increase</span></span>
<span id="LC355" class="line" lang="java">            <span class="c1">// worst case.  It's less than a factor of 2 increase.</span></span>
<span id="LC356" class="line" lang="java">            <span class="c1">// Also makes the interface more difficult.</span></span>
<span id="LC357" class="line" lang="java"></span>
<span id="LC358" class="line" lang="java"></span>
<span id="LC359" class="line" lang="java">            <span class="k">try</span> <span class="o">{</span></span>
<span id="LC360" class="line" lang="java"></span>
<span id="LC361" class="line" lang="java">                <span class="nc">ByteBuffer</span> <span class="n">byteBuf</span> <span class="o">=</span> <span class="nc">ByteBuffer</span><span class="o">.</span><span class="na">wrap</span><span class="o">(</span><span class="n">bytes</span><span class="o">,</span> <span class="n">offset</span><span class="o">,</span> <span class="n">numBytes</span><span class="o">);</span></span>
<span id="LC362" class="line" lang="java">                <span class="nc">CharBuffer</span> <span class="n">charBuf</span> <span class="o">=</span> <span class="n">btc</span><span class="o">.</span><span class="na">decode</span><span class="o">(</span><span class="n">byteBuf</span><span class="o">);</span></span>
<span id="LC363" class="line" lang="java"></span>
<span id="LC364" class="line" lang="java">                <span class="c1">// CharBuffer returned by the decoder will set its limit</span></span>
<span id="LC365" class="line" lang="java">                <span class="c1">// to byte immediately after the last written byte.</span></span>
<span id="LC366" class="line" lang="java">                <span class="n">resultingNumChars</span> <span class="o">=</span> <span class="n">charBuf</span><span class="o">.</span><span class="na">limit</span><span class="o">();</span></span>
<span id="LC367" class="line" lang="java"></span>
<span id="LC368" class="line" lang="java">                <span class="c1">// IMPORTANT - It's possible the underlying char[] in the</span></span>
<span id="LC369" class="line" lang="java">                <span class="c1">//             CharBuffer returned by btc.decode(byteBuf)</span></span>
<span id="LC370" class="line" lang="java">                <span class="c1">//             is longer in length than the number of characters</span></span>
<span id="LC371" class="line" lang="java">                <span class="c1">//             decoded. Hence, the check below to ensure the</span></span>
<span id="LC372" class="line" lang="java">                <span class="c1">//             char[] returned contains all the chars that have</span></span>
<span id="LC373" class="line" lang="java">                <span class="c1">//             been decoded and no more.</span></span>
<span id="LC374" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">charBuf</span><span class="o">.</span><span class="na">limit</span><span class="o">()</span> <span class="o">==</span> <span class="n">charBuf</span><span class="o">.</span><span class="na">capacity</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC375" class="line" lang="java">                    <span class="n">buffer</span> <span class="o">=</span> <span class="n">charBuf</span><span class="o">.</span><span class="na">array</span><span class="o">();</span></span>
<span id="LC376" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC377" class="line" lang="java">                    <span class="n">buffer</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">char</span><span class="o">[</span><span class="n">charBuf</span><span class="o">.</span><span class="na">limit</span><span class="o">()];</span></span>
<span id="LC378" class="line" lang="java">                    <span class="n">charBuf</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">buffer</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="n">charBuf</span><span class="o">.</span><span class="na">limit</span><span class="o">()).</span><span class="na">position</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></span>
<span id="LC379" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC380" class="line" lang="java"></span>
<span id="LC381" class="line" lang="java">                <span class="k">return</span> <span class="n">buffer</span><span class="o">;</span></span>
<span id="LC382" class="line" lang="java"></span>
<span id="LC383" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">IllegalStateException</span> <span class="n">ile</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC384" class="line" lang="java">                <span class="c1">// There were a decoding operation already in progress</span></span>
<span id="LC385" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">btcConverterFailure</span><span class="o">(</span> <span class="n">ile</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC386" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">MalformedInputException</span> <span class="n">mie</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC387" class="line" lang="java">                <span class="c1">// There were illegal Unicode char pairs</span></span>
<span id="LC388" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">badUnicodePair</span><span class="o">(</span> <span class="n">mie</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC389" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">UnmappableCharacterException</span> <span class="n">uce</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC390" class="line" lang="java">                <span class="c1">// A character doesn't map to the desired code set.</span></span>
<span id="LC391" class="line" lang="java">                <span class="c1">// CORBA formal 00-11-03.</span></span>
<span id="LC392" class="line" lang="java">                <span class="k">throw</span> <span class="n">omgWrapper</span><span class="o">.</span><span class="na">charNotInCodeset</span><span class="o">(</span> <span class="n">uce</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC393" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">CharacterCodingException</span> <span class="n">cce</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC394" class="line" lang="java">                <span class="c1">// If this happens, then a character decoding error occured.</span></span>
<span id="LC395" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">btcConverterFailure</span><span class="o">(</span> <span class="n">cce</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC396" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC397" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC398" class="line" lang="java"></span>
<span id="LC399" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC400" class="line" lang="java"><span class="cm">         * Utility method to find a CharsetDecoder in the</span></span>
<span id="LC401" class="line" lang="java"><span class="cm">         * cache or create a new one if necessary.  Throws an</span></span>
<span id="LC402" class="line" lang="java"><span class="cm">         * INTERNAL if the code set is unknown.</span></span>
<span id="LC403" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC404" class="line" lang="java">        <span class="kd">protected</span> <span class="nc">CharsetDecoder</span> <span class="nf">getConverter</span><span class="o">(</span><span class="nc">String</span> <span class="n">javaCodeSetName</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC405" class="line" lang="java"></span>
<span id="LC406" class="line" lang="java">            <span class="nc">CharsetDecoder</span> <span class="n">result</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC407" class="line" lang="java">            <span class="k">try</span> <span class="o">{</span></span>
<span id="LC408" class="line" lang="java">                <span class="n">result</span> <span class="o">=</span> <span class="n">cache</span><span class="o">.</span><span class="na">getByteToCharConverter</span><span class="o">(</span><span class="n">javaCodeSetName</span><span class="o">);</span></span>
<span id="LC409" class="line" lang="java"></span>
<span id="LC410" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">result</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC411" class="line" lang="java">                    <span class="nc">Charset</span> <span class="n">tmpCharset</span> <span class="o">=</span> <span class="nc">Charset</span><span class="o">.</span><span class="na">forName</span><span class="o">(</span><span class="n">javaCodeSetName</span><span class="o">);</span></span>
<span id="LC412" class="line" lang="java">                    <span class="n">result</span> <span class="o">=</span> <span class="n">tmpCharset</span><span class="o">.</span><span class="na">newDecoder</span><span class="o">();</span></span>
<span id="LC413" class="line" lang="java">                    <span class="n">cache</span><span class="o">.</span><span class="na">setConverter</span><span class="o">(</span><span class="n">javaCodeSetName</span><span class="o">,</span> <span class="n">result</span><span class="o">);</span></span>
<span id="LC414" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC415" class="line" lang="java"></span>
<span id="LC416" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span><span class="o">(</span><span class="nc">IllegalCharsetNameException</span> <span class="n">icne</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC417" class="line" lang="java">                <span class="c1">// This can only happen if one of our charset entries has</span></span>
<span id="LC418" class="line" lang="java">                <span class="c1">// an illegal name.</span></span>
<span id="LC419" class="line" lang="java">                <span class="k">throw</span> <span class="n">wrapper</span><span class="o">.</span><span class="na">invalidBtcConverterName</span><span class="o">(</span> <span class="n">icne</span><span class="o">,</span> <span class="n">javaCodeSetName</span> <span class="o">)</span> <span class="o">;</span></span>
<span id="LC420" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC421" class="line" lang="java"></span>
<span id="LC422" class="line" lang="java">            <span class="k">return</span> <span class="n">result</span><span class="o">;</span></span>
<span id="LC423" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC424" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC425" class="line" lang="java"></span>
<span id="LC426" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC427" class="line" lang="java"><span class="cm">     * Special converter for UTF16 since it's required to optionally</span></span>
<span id="LC428" class="line" lang="java"><span class="cm">     * support a byte order marker while the internal Java converters</span></span>
<span id="LC429" class="line" lang="java"><span class="cm">     * either require it or require that it isn't there.</span></span>
<span id="LC430" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC431" class="line" lang="java"><span class="cm">     * The solution is to check for the byte order marker, and if we</span></span>
<span id="LC432" class="line" lang="java"><span class="cm">     * need to do something differently, switch internal converters.</span></span>
<span id="LC433" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC434" class="line" lang="java">    <span class="kd">private</span> <span class="kd">class</span> <span class="nc">UTF16BTCConverter</span> <span class="kd">extends</span> <span class="nc">JavaBTCConverter</span></span>
<span id="LC435" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC436" class="line" lang="java">        <span class="kd">private</span> <span class="kt">boolean</span> <span class="n">defaultToLittleEndian</span><span class="o">;</span></span>
<span id="LC437" class="line" lang="java">        <span class="kd">private</span> <span class="kt">boolean</span> <span class="n">converterUsesBOM</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC438" class="line" lang="java"></span>
<span id="LC439" class="line" lang="java">        <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">char</span> <span class="no">UTF16_BE_MARKER</span> <span class="o">=</span> <span class="o">(</span><span class="kt">char</span><span class="o">)</span> <span class="mh">0xfeff</span><span class="o">;</span></span>
<span id="LC440" class="line" lang="java">        <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">char</span> <span class="no">UTF16_LE_MARKER</span> <span class="o">=</span> <span class="o">(</span><span class="kt">char</span><span class="o">)</span> <span class="mh">0xfffe</span><span class="o">;</span></span>
<span id="LC441" class="line" lang="java"></span>
<span id="LC442" class="line" lang="java">        <span class="c1">// When there isn't a byte order marker, used the byte</span></span>
<span id="LC443" class="line" lang="java">        <span class="c1">// order specified.</span></span>
<span id="LC444" class="line" lang="java">        <span class="kd">public</span> <span class="nf">UTF16BTCConverter</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">defaultToLittleEndian</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC445" class="line" lang="java">            <span class="kd">super</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16</span><span class="o">);</span></span>
<span id="LC446" class="line" lang="java"></span>
<span id="LC447" class="line" lang="java">            <span class="k">this</span><span class="o">.</span><span class="na">defaultToLittleEndian</span> <span class="o">=</span> <span class="n">defaultToLittleEndian</span><span class="o">;</span></span>
<span id="LC448" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC449" class="line" lang="java"></span>
<span id="LC450" class="line" lang="java">        <span class="kd">public</span> <span class="kt">char</span><span class="o">[]</span> <span class="nf">getChars</span><span class="o">(</span><span class="kt">byte</span><span class="o">[]</span> <span class="n">bytes</span><span class="o">,</span> <span class="kt">int</span> <span class="n">offset</span><span class="o">,</span> <span class="kt">int</span> <span class="n">numBytes</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC451" class="line" lang="java"></span>
<span id="LC452" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">hasUTF16ByteOrderMarker</span><span class="o">(</span><span class="n">bytes</span><span class="o">,</span> <span class="n">offset</span><span class="o">,</span> <span class="n">numBytes</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC453" class="line" lang="java">                <span class="k">if</span> <span class="o">(!</span><span class="n">converterUsesBOM</span><span class="o">)</span></span>
<span id="LC454" class="line" lang="java">                    <span class="n">switchToConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16</span><span class="o">);</span></span>
<span id="LC455" class="line" lang="java"></span>
<span id="LC456" class="line" lang="java">                <span class="n">converterUsesBOM</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC457" class="line" lang="java"></span>
<span id="LC458" class="line" lang="java">                <span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">getChars</span><span class="o">(</span><span class="n">bytes</span><span class="o">,</span> <span class="n">offset</span><span class="o">,</span> <span class="n">numBytes</span><span class="o">);</span></span>
<span id="LC459" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC460" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">converterUsesBOM</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC461" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">defaultToLittleEndian</span><span class="o">)</span></span>
<span id="LC462" class="line" lang="java">                        <span class="n">switchToConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16LE</span><span class="o">);</span></span>
<span id="LC463" class="line" lang="java">                    <span class="k">else</span></span>
<span id="LC464" class="line" lang="java">                        <span class="nf">switchToConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16BE</span><span class="o">);</span></span>
<span id="LC465" class="line" lang="java"></span>
<span id="LC466" class="line" lang="java">                    <span class="n">converterUsesBOM</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC467" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC468" class="line" lang="java"></span>
<span id="LC469" class="line" lang="java">                <span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">getChars</span><span class="o">(</span><span class="n">bytes</span><span class="o">,</span> <span class="n">offset</span><span class="o">,</span> <span class="n">numBytes</span><span class="o">);</span></span>
<span id="LC470" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC471" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC472" class="line" lang="java"></span>
<span id="LC473" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC474" class="line" lang="java"><span class="cm">         * Utility method for determining if a UTF-16 byte order marker is present.</span></span>
<span id="LC475" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC476" class="line" lang="java">        <span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">hasUTF16ByteOrderMarker</span><span class="o">(</span><span class="kt">byte</span><span class="o">[]</span> <span class="n">array</span><span class="o">,</span> <span class="kt">int</span> <span class="n">offset</span><span class="o">,</span> <span class="kt">int</span> <span class="n">length</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC477" class="line" lang="java">            <span class="c1">// If there aren't enough bytes to represent the marker and data,</span></span>
<span id="LC478" class="line" lang="java">            <span class="c1">// return false.</span></span>
<span id="LC479" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">length</span> <span class="o">&gt;=</span> <span class="mi">4</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC480" class="line" lang="java"></span>
<span id="LC481" class="line" lang="java">                <span class="kt">int</span> <span class="n">b1</span> <span class="o">=</span> <span class="n">array</span><span class="o">[</span><span class="n">offset</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0x00FF</span><span class="o">;</span></span>
<span id="LC482" class="line" lang="java">                <span class="kt">int</span> <span class="n">b2</span> <span class="o">=</span> <span class="n">array</span><span class="o">[</span><span class="n">offset</span> <span class="o">+</span> <span class="mi">1</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0x00FF</span><span class="o">;</span></span>
<span id="LC483" class="line" lang="java"></span>
<span id="LC484" class="line" lang="java">                <span class="kt">char</span> <span class="n">marker</span> <span class="o">=</span> <span class="o">(</span><span class="kt">char</span><span class="o">)((</span><span class="n">b1</span> <span class="o">&lt;&lt;</span> <span class="mi">8</span><span class="o">)</span> <span class="o">|</span> <span class="o">(</span><span class="n">b2</span> <span class="o">&lt;&lt;</span> <span class="mi">0</span><span class="o">));</span></span>
<span id="LC485" class="line" lang="java"></span>
<span id="LC486" class="line" lang="java">                <span class="k">return</span> <span class="o">(</span><span class="n">marker</span> <span class="o">==</span> <span class="no">UTF16_BE_MARKER</span> <span class="o">||</span> <span class="n">marker</span> <span class="o">==</span> <span class="no">UTF16_LE_MARKER</span><span class="o">);</span></span>
<span id="LC487" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span></span>
<span id="LC488" class="line" lang="java">                <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC489" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC490" class="line" lang="java"></span>
<span id="LC491" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC492" class="line" lang="java"><span class="cm">         * The current solution for dealing with UTF-16 in CORBA</span></span>
<span id="LC493" class="line" lang="java"><span class="cm">         * is that if our sun.io converter requires byte order markers,</span></span>
<span id="LC494" class="line" lang="java"><span class="cm">         * and then we see a CORBA wstring/wchar without them, we</span></span>
<span id="LC495" class="line" lang="java"><span class="cm">         * switch to the sun.io converter that doesn't require them.</span></span>
<span id="LC496" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC497" class="line" lang="java">        <span class="kd">private</span> <span class="kt">void</span> <span class="nf">switchToConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">newCodeSet</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC498" class="line" lang="java"></span>
<span id="LC499" class="line" lang="java">            <span class="c1">// Use the getConverter method from our superclass.</span></span>
<span id="LC500" class="line" lang="java">            <span class="n">btc</span> <span class="o">=</span> <span class="kd">super</span><span class="o">.</span><span class="na">getConverter</span><span class="o">(</span><span class="n">newCodeSet</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></span>
<span id="LC501" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC502" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC503" class="line" lang="java"></span>
<span id="LC504" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC505" class="line" lang="java"><span class="cm">     * CTB converter factory for single byte or variable length encodings.</span></span>
<span id="LC506" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC507" class="line" lang="java">    <span class="kd">public</span> <span class="nc">CTBConverter</span> <span class="nf">getCTBConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">codeset</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC508" class="line" lang="java">        <span class="kt">int</span> <span class="n">alignment</span> <span class="o">=</span> <span class="o">(!</span><span class="n">codeset</span><span class="o">.</span><span class="na">isFixedWidth</span><span class="o">()</span> <span class="o">?</span></span>
<span id="LC509" class="line" lang="java">                         <span class="mi">1</span> <span class="o">:</span></span>
<span id="LC510" class="line" lang="java">                         <span class="n">codeset</span><span class="o">.</span><span class="na">getMaxBytesPerChar</span><span class="o">());</span></span>
<span id="LC511" class="line" lang="java"></span>
<span id="LC512" class="line" lang="java">        <span class="k">return</span> <span class="k">new</span> <span class="nf">JavaCTBConverter</span><span class="o">(</span><span class="n">codeset</span><span class="o">,</span> <span class="n">alignment</span><span class="o">);</span></span>
<span id="LC513" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC514" class="line" lang="java"></span>
<span id="LC515" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC516" class="line" lang="java"><span class="cm">     * CTB converter factory for multibyte (mainly fixed) encodings.</span></span>
<span id="LC517" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC518" class="line" lang="java"><span class="cm">     * Because of the awkwardness with byte order markers and the possibility of</span></span>
<span id="LC519" class="line" lang="java"><span class="cm">     * using UCS-2, you must specify both the endianness of the stream as well as</span></span>
<span id="LC520" class="line" lang="java"><span class="cm">     * whether or not to use byte order markers if applicable.  UCS-2 has no byte</span></span>
<span id="LC521" class="line" lang="java"><span class="cm">     * order markers.  UTF-16 has optional markers.</span></span>
<span id="LC522" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC523" class="line" lang="java"><span class="cm">     * If you select useByteOrderMarkers, there is no guarantee that the encoding</span></span>
<span id="LC524" class="line" lang="java"><span class="cm">     * will use the endianness specified.</span></span>
<span id="LC525" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC526" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC527" class="line" lang="java">    <span class="kd">public</span> <span class="nc">CTBConverter</span> <span class="nf">getCTBConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">codeset</span><span class="o">,</span></span>
<span id="LC528" class="line" lang="java">                                        <span class="kt">boolean</span> <span class="n">littleEndian</span><span class="o">,</span></span>
<span id="LC529" class="line" lang="java">                                        <span class="kt">boolean</span> <span class="n">useByteOrderMarkers</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC530" class="line" lang="java"></span>
<span id="LC531" class="line" lang="java">        <span class="c1">// UCS2 doesn't have byte order markers, and we're encoding it</span></span>
<span id="LC532" class="line" lang="java">        <span class="c1">// as UTF-16 since UCS2 isn't available in all Java platforms.</span></span>
<span id="LC533" class="line" lang="java">        <span class="c1">// They should be identical with only minor differences in</span></span>
<span id="LC534" class="line" lang="java">        <span class="c1">// negative cases.</span></span>
<span id="LC535" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">codeset</span> <span class="o">==</span> <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UCS_2</span><span class="o">)</span></span>
<span id="LC536" class="line" lang="java">            <span class="k">return</span> <span class="k">new</span> <span class="nf">UTF16CTBConverter</span><span class="o">(</span><span class="n">littleEndian</span><span class="o">);</span></span>
<span id="LC537" class="line" lang="java"></span>
<span id="LC538" class="line" lang="java">        <span class="c1">// We can write UTF-16 with or without a byte order marker.</span></span>
<span id="LC539" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">codeset</span> <span class="o">==</span> <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC540" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">useByteOrderMarkers</span><span class="o">)</span></span>
<span id="LC541" class="line" lang="java">                <span class="k">return</span> <span class="k">new</span> <span class="nf">UTF16CTBConverter</span><span class="o">();</span></span>
<span id="LC542" class="line" lang="java">            <span class="k">else</span></span>
<span id="LC543" class="line" lang="java">                <span class="k">return</span> <span class="k">new</span> <span class="nf">UTF16CTBConverter</span><span class="o">(</span><span class="n">littleEndian</span><span class="o">);</span></span>
<span id="LC544" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC545" class="line" lang="java"></span>
<span id="LC546" class="line" lang="java">        <span class="c1">// Everything else uses the generic JavaCTBConverter.</span></span>
<span id="LC547" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC548" class="line" lang="java">        <span class="c1">// Variable width encodings are aligned on 1 byte boundaries.</span></span>
<span id="LC549" class="line" lang="java">        <span class="c1">// A fixed width encoding with a max. of 4 bytes/char should</span></span>
<span id="LC550" class="line" lang="java">        <span class="c1">// align on a 4 byte boundary.  Note that UTF-16 is a special</span></span>
<span id="LC551" class="line" lang="java">        <span class="c1">// case because of the optional byte order marker, so it's</span></span>
<span id="LC552" class="line" lang="java">        <span class="c1">// handled above.</span></span>
<span id="LC553" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC554" class="line" lang="java">        <span class="c1">// This doesn't matter for GIOP 1.2 wchars and wstrings</span></span>
<span id="LC555" class="line" lang="java">        <span class="c1">// since the encoded bytes are treated as an encapsulation.</span></span>
<span id="LC556" class="line" lang="java">        <span class="kt">int</span> <span class="n">alignment</span> <span class="o">=</span> <span class="o">(!</span><span class="n">codeset</span><span class="o">.</span><span class="na">isFixedWidth</span><span class="o">()</span> <span class="o">?</span></span>
<span id="LC557" class="line" lang="java">                         <span class="mi">1</span> <span class="o">:</span></span>
<span id="LC558" class="line" lang="java">                         <span class="n">codeset</span><span class="o">.</span><span class="na">getMaxBytesPerChar</span><span class="o">());</span></span>
<span id="LC559" class="line" lang="java"></span>
<span id="LC560" class="line" lang="java">        <span class="k">return</span> <span class="k">new</span> <span class="nf">JavaCTBConverter</span><span class="o">(</span><span class="n">codeset</span><span class="o">,</span> <span class="n">alignment</span><span class="o">);</span></span>
<span id="LC561" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC562" class="line" lang="java"></span>
<span id="LC563" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC564" class="line" lang="java"><span class="cm">     * BTCConverter factory for single byte or variable width encodings.</span></span>
<span id="LC565" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC566" class="line" lang="java">    <span class="kd">public</span> <span class="nc">BTCConverter</span> <span class="nf">getBTCConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">codeset</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC567" class="line" lang="java">        <span class="k">return</span> <span class="k">new</span> <span class="nf">JavaBTCConverter</span><span class="o">(</span><span class="n">codeset</span><span class="o">);</span></span>
<span id="LC568" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC569" class="line" lang="java"></span>
<span id="LC570" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC571" class="line" lang="java"><span class="cm">     * BTCConverter factory for fixed width multibyte encodings.</span></span>
<span id="LC572" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC573" class="line" lang="java">    <span class="kd">public</span> <span class="nc">BTCConverter</span> <span class="nf">getBTCConverter</span><span class="o">(</span><span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">Entry</span> <span class="n">codeset</span><span class="o">,</span></span>
<span id="LC574" class="line" lang="java">                                        <span class="kt">boolean</span> <span class="n">defaultToLittleEndian</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC575" class="line" lang="java"></span>
<span id="LC576" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">codeset</span> <span class="o">==</span> <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16</span> <span class="o">||</span></span>
<span id="LC577" class="line" lang="java">            <span class="n">codeset</span> <span class="o">==</span> <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UCS_2</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC578" class="line" lang="java"></span>
<span id="LC579" class="line" lang="java">            <span class="k">return</span> <span class="k">new</span> <span class="nf">UTF16BTCConverter</span><span class="o">(</span><span class="n">defaultToLittleEndian</span><span class="o">);</span></span>
<span id="LC580" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC581" class="line" lang="java">            <span class="k">return</span> <span class="k">new</span> <span class="nf">JavaBTCConverter</span><span class="o">(</span><span class="n">codeset</span><span class="o">);</span></span>
<span id="LC582" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC583" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC584" class="line" lang="java"></span>
<span id="LC585" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC586" class="line" lang="java"><span class="cm">     * Follows the code set negotiation algorithm in CORBA formal 99-10-07 13.7.2.</span></span>
<span id="LC587" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC588" class="line" lang="java"><span class="cm">     * Returns the proper negotiated OSF character encoding number or</span></span>
<span id="LC589" class="line" lang="java"><span class="cm">     * CodeSetConversion.FALLBACK_CODESET.</span></span>
<span id="LC590" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC591" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span> <span class="nf">selectEncoding</span><span class="o">(</span><span class="nc">CodeSetComponentInfo</span><span class="o">.</span><span class="na">CodeSetComponent</span> <span class="n">client</span><span class="o">,</span></span>
<span id="LC592" class="line" lang="java">                               <span class="nc">CodeSetComponentInfo</span><span class="o">.</span><span class="na">CodeSetComponent</span> <span class="n">server</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC593" class="line" lang="java"></span>
<span id="LC594" class="line" lang="java">        <span class="c1">// A "null" value for the server's nativeCodeSet means that</span></span>
<span id="LC595" class="line" lang="java">        <span class="c1">// the server desired not to indicate one.  We'll take that</span></span>
<span id="LC596" class="line" lang="java">        <span class="c1">// to mean that it wants the first thing in its conversion list.</span></span>
<span id="LC597" class="line" lang="java">        <span class="c1">// If it's conversion list is empty, too, then use the fallback</span></span>
<span id="LC598" class="line" lang="java">        <span class="c1">// codeset.</span></span>
<span id="LC599" class="line" lang="java">        <span class="kt">int</span> <span class="n">serverNative</span> <span class="o">=</span> <span class="n">server</span><span class="o">.</span><span class="na">nativeCodeSet</span><span class="o">;</span></span>
<span id="LC600" class="line" lang="java"></span>
<span id="LC601" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">serverNative</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC602" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">server</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">.</span><span class="na">length</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC603" class="line" lang="java">                <span class="n">serverNative</span> <span class="o">=</span> <span class="n">server</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">[</span><span class="mi">0</span><span class="o">];</span></span>
<span id="LC604" class="line" lang="java">            <span class="k">else</span></span>
<span id="LC605" class="line" lang="java">                <span class="k">return</span> <span class="nc">CodeSetConversion</span><span class="o">.</span><span class="na">FALLBACK_CODESET</span><span class="o">;</span></span>
<span id="LC606" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC607" class="line" lang="java"></span>
<span id="LC608" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">client</span><span class="o">.</span><span class="na">nativeCodeSet</span> <span class="o">==</span> <span class="n">serverNative</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC609" class="line" lang="java">            <span class="c1">// Best case -- client and server don't have to convert</span></span>
<span id="LC610" class="line" lang="java">            <span class="k">return</span> <span class="n">serverNative</span><span class="o">;</span></span>
<span id="LC611" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC612" class="line" lang="java"></span>
<span id="LC613" class="line" lang="java">        <span class="c1">// Is this client capable of converting to the server's</span></span>
<span id="LC614" class="line" lang="java">        <span class="c1">// native code set?</span></span>
<span id="LC615" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">client</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC616" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">serverNative</span> <span class="o">==</span> <span class="n">client</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">[</span><span class="n">i</span><span class="o">])</span> <span class="o">{</span></span>
<span id="LC617" class="line" lang="java">                <span class="c1">// The client will convert to the server's</span></span>
<span id="LC618" class="line" lang="java">                <span class="c1">// native code set.</span></span>
<span id="LC619" class="line" lang="java">                <span class="k">return</span> <span class="n">serverNative</span><span class="o">;</span></span>
<span id="LC620" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC621" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC622" class="line" lang="java"></span>
<span id="LC623" class="line" lang="java">        <span class="c1">// Is the server capable of converting to the client's</span></span>
<span id="LC624" class="line" lang="java">        <span class="c1">// native code set?</span></span>
<span id="LC625" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">server</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC626" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">client</span><span class="o">.</span><span class="na">nativeCodeSet</span> <span class="o">==</span> <span class="n">server</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">[</span><span class="n">i</span><span class="o">])</span> <span class="o">{</span></span>
<span id="LC627" class="line" lang="java">                <span class="c1">// The server will convert to the client's</span></span>
<span id="LC628" class="line" lang="java">                <span class="c1">// native code set.</span></span>
<span id="LC629" class="line" lang="java">                <span class="k">return</span> <span class="n">client</span><span class="o">.</span><span class="na">nativeCodeSet</span><span class="o">;</span></span>
<span id="LC630" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC631" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC632" class="line" lang="java"></span>
<span id="LC633" class="line" lang="java">        <span class="c1">// See if there are any code sets that both the server and client</span></span>
<span id="LC634" class="line" lang="java">        <span class="c1">// support (giving preference to the server).  The order</span></span>
<span id="LC635" class="line" lang="java">        <span class="c1">// of conversion sets is from most to least desired.</span></span>
<span id="LC636" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">server</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC637" class="line" lang="java">            <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">y</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">y</span> <span class="o">&lt;</span> <span class="n">client</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">y</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC638" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">server</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">==</span> <span class="n">client</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">[</span><span class="n">y</span><span class="o">])</span> <span class="o">{</span></span>
<span id="LC639" class="line" lang="java">                    <span class="k">return</span> <span class="n">server</span><span class="o">.</span><span class="na">conversionCodeSets</span><span class="o">[</span><span class="n">i</span><span class="o">];</span></span>
<span id="LC640" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC641" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC642" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC643" class="line" lang="java"></span>
<span id="LC644" class="line" lang="java">        <span class="c1">// Before using the fallback codesets, the spec calls for a</span></span>
<span id="LC645" class="line" lang="java">        <span class="c1">// compatibility check on the native code sets.  It doesn't make</span></span>
<span id="LC646" class="line" lang="java">        <span class="c1">// sense because loss free communication is always possible with</span></span>
<span id="LC647" class="line" lang="java">        <span class="c1">// UTF8 and UTF16, the fall back code sets.  It's also a lot</span></span>
<span id="LC648" class="line" lang="java">        <span class="c1">// of work to implement.  In the case of incompatibility, the</span></span>
<span id="LC649" class="line" lang="java">        <span class="c1">// spec says to throw a CODESET_INCOMPATIBLE exception.</span></span>
<span id="LC650" class="line" lang="java"></span>
<span id="LC651" class="line" lang="java">        <span class="c1">// Use the fallback</span></span>
<span id="LC652" class="line" lang="java">        <span class="k">return</span> <span class="nc">CodeSetConversion</span><span class="o">.</span><span class="na">FALLBACK_CODESET</span><span class="o">;</span></span>
<span id="LC653" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC654" class="line" lang="java"></span>
<span id="LC655" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC656" class="line" lang="java"><span class="cm">     * Perform the code set negotiation algorithm and come up with</span></span>
<span id="LC657" class="line" lang="java"><span class="cm">     * the two encodings to use.</span></span>
<span id="LC658" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC659" class="line" lang="java">    <span class="kd">public</span> <span class="nc">CodeSetComponentInfo</span><span class="o">.</span><span class="na">CodeSetContext</span> <span class="nf">negotiate</span><span class="o">(</span><span class="nc">CodeSetComponentInfo</span> <span class="n">client</span><span class="o">,</span></span>
<span id="LC660" class="line" lang="java">                                                         <span class="nc">CodeSetComponentInfo</span> <span class="n">server</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC661" class="line" lang="java">        <span class="kt">int</span> <span class="n">charData</span></span>
<span id="LC662" class="line" lang="java">            <span class="o">=</span> <span class="n">selectEncoding</span><span class="o">(</span><span class="n">client</span><span class="o">.</span><span class="na">getCharComponent</span><span class="o">(),</span></span>
<span id="LC663" class="line" lang="java">                             <span class="n">server</span><span class="o">.</span><span class="na">getCharComponent</span><span class="o">());</span></span>
<span id="LC664" class="line" lang="java"></span>
<span id="LC665" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">charData</span> <span class="o">==</span> <span class="nc">CodeSetConversion</span><span class="o">.</span><span class="na">FALLBACK_CODESET</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC666" class="line" lang="java">            <span class="n">charData</span> <span class="o">=</span> <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_8</span><span class="o">.</span><span class="na">getNumber</span><span class="o">();</span></span>
<span id="LC667" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC668" class="line" lang="java"></span>
<span id="LC669" class="line" lang="java">        <span class="kt">int</span> <span class="n">wcharData</span></span>
<span id="LC670" class="line" lang="java">            <span class="o">=</span> <span class="n">selectEncoding</span><span class="o">(</span><span class="n">client</span><span class="o">.</span><span class="na">getWCharComponent</span><span class="o">(),</span></span>
<span id="LC671" class="line" lang="java">                             <span class="n">server</span><span class="o">.</span><span class="na">getWCharComponent</span><span class="o">());</span></span>
<span id="LC672" class="line" lang="java"></span>
<span id="LC673" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">wcharData</span> <span class="o">==</span> <span class="nc">CodeSetConversion</span><span class="o">.</span><span class="na">FALLBACK_CODESET</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC674" class="line" lang="java">            <span class="n">wcharData</span> <span class="o">=</span> <span class="nc">OSFCodeSetRegistry</span><span class="o">.</span><span class="na">UTF_16</span><span class="o">.</span><span class="na">getNumber</span><span class="o">();</span></span>
<span id="LC675" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC676" class="line" lang="java"></span>
<span id="LC677" class="line" lang="java">        <span class="k">return</span> <span class="k">new</span> <span class="nc">CodeSetComponentInfo</span><span class="o">.</span><span class="na">CodeSetContext</span><span class="o">(</span><span class="n">charData</span><span class="o">,</span></span>
<span id="LC678" class="line" lang="java">                                                       <span class="n">wcharData</span><span class="o">);</span></span>
<span id="LC679" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC680" class="line" lang="java"></span>
<span id="LC681" class="line" lang="java">    <span class="c1">// No one should instantiate a CodeSetConversion but the singleton</span></span>
<span id="LC682" class="line" lang="java">    <span class="c1">// instance method</span></span>
<span id="LC683" class="line" lang="java">    <span class="kd">private</span> <span class="nf">CodeSetConversion</span><span class="o">()</span> <span class="o">{}</span></span>
<span id="LC684" class="line" lang="java"></span>
<span id="LC685" class="line" lang="java">    <span class="c1">// initialize-on-demand holder</span></span>
<span id="LC686" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">class</span> <span class="nc">CodeSetConversionHolder</span> <span class="o">{</span></span>
<span id="LC687" class="line" lang="java">        <span class="kd">static</span> <span class="kd">final</span> <span class="nc">CodeSetConversion</span> <span class="n">csc</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">CodeSetConversion</span><span class="o">()</span> <span class="o">;</span></span>
<span id="LC688" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC689" class="line" lang="java"></span>
<span id="LC690" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC691" class="line" lang="java"><span class="cm">     * CodeSetConversion is a singleton, and this is the access point.</span></span>
<span id="LC692" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC693" class="line" lang="java">    <span class="kd">public</span> <span class="kd">final</span> <span class="kd">static</span> <span class="nc">CodeSetConversion</span> <span class="nf">impl</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC694" class="line" lang="java">        <span class="k">return</span> <span class="nc">CodeSetConversionHolder</span><span class="o">.</span><span class="na">csc</span> <span class="o">;</span></span>
<span id="LC695" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC696" class="line" lang="java"></span>
<span id="LC697" class="line" lang="java">    <span class="c1">// Singleton instance</span></span>
<span id="LC698" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">CodeSetConversion</span> <span class="n">implementation</span><span class="o">;</span></span>
<span id="LC699" class="line" lang="java"></span>
<span id="LC700" class="line" lang="java">    <span class="c1">// Number used internally to indicate the fallback code</span></span>
<span id="LC701" class="line" lang="java">    <span class="c1">// set.</span></span>
<span id="LC702" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="no">FALLBACK_CODESET</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC703" class="line" lang="java"></span>
<span id="LC704" class="line" lang="java">    <span class="c1">// Provides a thread local cache for the sun.io</span></span>
<span id="LC705" class="line" lang="java">    <span class="c1">// converters.</span></span>
<span id="LC706" class="line" lang="java">    <span class="kd">private</span> <span class="nc">CodeSetCache</span> <span class="n">cache</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">CodeSetCache</span><span class="o">();</span></span>
<span id="LC707" class="line" lang="java"><span class="o">}</span></span>
