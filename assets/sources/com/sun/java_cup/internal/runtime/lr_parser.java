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
<a class="file-line-num diff-line-num" data-line-number="708" href="#L708" id="L708">
708
</a>
<a class="file-line-num diff-line-num" data-line-number="709" href="#L709" id="L709">
709
</a>
<a class="file-line-num diff-line-num" data-line-number="710" href="#L710" id="L710">
710
</a>
<a class="file-line-num diff-line-num" data-line-number="711" href="#L711" id="L711">
711
</a>
<a class="file-line-num diff-line-num" data-line-number="712" href="#L712" id="L712">
712
</a>
<a class="file-line-num diff-line-num" data-line-number="713" href="#L713" id="L713">
713
</a>
<a class="file-line-num diff-line-num" data-line-number="714" href="#L714" id="L714">
714
</a>
<a class="file-line-num diff-line-num" data-line-number="715" href="#L715" id="L715">
715
</a>
<a class="file-line-num diff-line-num" data-line-number="716" href="#L716" id="L716">
716
</a>
<a class="file-line-num diff-line-num" data-line-number="717" href="#L717" id="L717">
717
</a>
<a class="file-line-num diff-line-num" data-line-number="718" href="#L718" id="L718">
718
</a>
<a class="file-line-num diff-line-num" data-line-number="719" href="#L719" id="L719">
719
</a>
<a class="file-line-num diff-line-num" data-line-number="720" href="#L720" id="L720">
720
</a>
<a class="file-line-num diff-line-num" data-line-number="721" href="#L721" id="L721">
721
</a>
<a class="file-line-num diff-line-num" data-line-number="722" href="#L722" id="L722">
722
</a>
<a class="file-line-num diff-line-num" data-line-number="723" href="#L723" id="L723">
723
</a>
<a class="file-line-num diff-line-num" data-line-number="724" href="#L724" id="L724">
724
</a>
<a class="file-line-num diff-line-num" data-line-number="725" href="#L725" id="L725">
725
</a>
<a class="file-line-num diff-line-num" data-line-number="726" href="#L726" id="L726">
726
</a>
<a class="file-line-num diff-line-num" data-line-number="727" href="#L727" id="L727">
727
</a>
<a class="file-line-num diff-line-num" data-line-number="728" href="#L728" id="L728">
728
</a>
<a class="file-line-num diff-line-num" data-line-number="729" href="#L729" id="L729">
729
</a>
<a class="file-line-num diff-line-num" data-line-number="730" href="#L730" id="L730">
730
</a>
<a class="file-line-num diff-line-num" data-line-number="731" href="#L731" id="L731">
731
</a>
<a class="file-line-num diff-line-num" data-line-number="732" href="#L732" id="L732">
732
</a>
<a class="file-line-num diff-line-num" data-line-number="733" href="#L733" id="L733">
733
</a>
<a class="file-line-num diff-line-num" data-line-number="734" href="#L734" id="L734">
734
</a>
<a class="file-line-num diff-line-num" data-line-number="735" href="#L735" id="L735">
735
</a>
<a class="file-line-num diff-line-num" data-line-number="736" href="#L736" id="L736">
736
</a>
<a class="file-line-num diff-line-num" data-line-number="737" href="#L737" id="L737">
737
</a>
<a class="file-line-num diff-line-num" data-line-number="738" href="#L738" id="L738">
738
</a>
<a class="file-line-num diff-line-num" data-line-number="739" href="#L739" id="L739">
739
</a>
<a class="file-line-num diff-line-num" data-line-number="740" href="#L740" id="L740">
740
</a>
<a class="file-line-num diff-line-num" data-line-number="741" href="#L741" id="L741">
741
</a>
<a class="file-line-num diff-line-num" data-line-number="742" href="#L742" id="L742">
742
</a>
<a class="file-line-num diff-line-num" data-line-number="743" href="#L743" id="L743">
743
</a>
<a class="file-line-num diff-line-num" data-line-number="744" href="#L744" id="L744">
744
</a>
<a class="file-line-num diff-line-num" data-line-number="745" href="#L745" id="L745">
745
</a>
<a class="file-line-num diff-line-num" data-line-number="746" href="#L746" id="L746">
746
</a>
<a class="file-line-num diff-line-num" data-line-number="747" href="#L747" id="L747">
747
</a>
<a class="file-line-num diff-line-num" data-line-number="748" href="#L748" id="L748">
748
</a>
<a class="file-line-num diff-line-num" data-line-number="749" href="#L749" id="L749">
749
</a>
<a class="file-line-num diff-line-num" data-line-number="750" href="#L750" id="L750">
750
</a>
<a class="file-line-num diff-line-num" data-line-number="751" href="#L751" id="L751">
751
</a>
<a class="file-line-num diff-line-num" data-line-number="752" href="#L752" id="L752">
752
</a>
<a class="file-line-num diff-line-num" data-line-number="753" href="#L753" id="L753">
753
</a>
<a class="file-line-num diff-line-num" data-line-number="754" href="#L754" id="L754">
754
</a>
<a class="file-line-num diff-line-num" data-line-number="755" href="#L755" id="L755">
755
</a>
<a class="file-line-num diff-line-num" data-line-number="756" href="#L756" id="L756">
756
</a>
<a class="file-line-num diff-line-num" data-line-number="757" href="#L757" id="L757">
757
</a>
<a class="file-line-num diff-line-num" data-line-number="758" href="#L758" id="L758">
758
</a>
<a class="file-line-num diff-line-num" data-line-number="759" href="#L759" id="L759">
759
</a>
<a class="file-line-num diff-line-num" data-line-number="760" href="#L760" id="L760">
760
</a>
<a class="file-line-num diff-line-num" data-line-number="761" href="#L761" id="L761">
761
</a>
<a class="file-line-num diff-line-num" data-line-number="762" href="#L762" id="L762">
762
</a>
<a class="file-line-num diff-line-num" data-line-number="763" href="#L763" id="L763">
763
</a>
<a class="file-line-num diff-line-num" data-line-number="764" href="#L764" id="L764">
764
</a>
<a class="file-line-num diff-line-num" data-line-number="765" href="#L765" id="L765">
765
</a>
<a class="file-line-num diff-line-num" data-line-number="766" href="#L766" id="L766">
766
</a>
<a class="file-line-num diff-line-num" data-line-number="767" href="#L767" id="L767">
767
</a>
<a class="file-line-num diff-line-num" data-line-number="768" href="#L768" id="L768">
768
</a>
<a class="file-line-num diff-line-num" data-line-number="769" href="#L769" id="L769">
769
</a>
<a class="file-line-num diff-line-num" data-line-number="770" href="#L770" id="L770">
770
</a>
<a class="file-line-num diff-line-num" data-line-number="771" href="#L771" id="L771">
771
</a>
<a class="file-line-num diff-line-num" data-line-number="772" href="#L772" id="L772">
772
</a>
<a class="file-line-num diff-line-num" data-line-number="773" href="#L773" id="L773">
773
</a>
<a class="file-line-num diff-line-num" data-line-number="774" href="#L774" id="L774">
774
</a>
<a class="file-line-num diff-line-num" data-line-number="775" href="#L775" id="L775">
775
</a>
<a class="file-line-num diff-line-num" data-line-number="776" href="#L776" id="L776">
776
</a>
<a class="file-line-num diff-line-num" data-line-number="777" href="#L777" id="L777">
777
</a>
<a class="file-line-num diff-line-num" data-line-number="778" href="#L778" id="L778">
778
</a>
<a class="file-line-num diff-line-num" data-line-number="779" href="#L779" id="L779">
779
</a>
<a class="file-line-num diff-line-num" data-line-number="780" href="#L780" id="L780">
780
</a>
<a class="file-line-num diff-line-num" data-line-number="781" href="#L781" id="L781">
781
</a>
<a class="file-line-num diff-line-num" data-line-number="782" href="#L782" id="L782">
782
</a>
<a class="file-line-num diff-line-num" data-line-number="783" href="#L783" id="L783">
783
</a>
<a class="file-line-num diff-line-num" data-line-number="784" href="#L784" id="L784">
784
</a>
<a class="file-line-num diff-line-num" data-line-number="785" href="#L785" id="L785">
785
</a>
<a class="file-line-num diff-line-num" data-line-number="786" href="#L786" id="L786">
786
</a>
<a class="file-line-num diff-line-num" data-line-number="787" href="#L787" id="L787">
787
</a>
<a class="file-line-num diff-line-num" data-line-number="788" href="#L788" id="L788">
788
</a>
<a class="file-line-num diff-line-num" data-line-number="789" href="#L789" id="L789">
789
</a>
<a class="file-line-num diff-line-num" data-line-number="790" href="#L790" id="L790">
790
</a>
<a class="file-line-num diff-line-num" data-line-number="791" href="#L791" id="L791">
791
</a>
<a class="file-line-num diff-line-num" data-line-number="792" href="#L792" id="L792">
792
</a>
<a class="file-line-num diff-line-num" data-line-number="793" href="#L793" id="L793">
793
</a>
<a class="file-line-num diff-line-num" data-line-number="794" href="#L794" id="L794">
794
</a>
<a class="file-line-num diff-line-num" data-line-number="795" href="#L795" id="L795">
795
</a>
<a class="file-line-num diff-line-num" data-line-number="796" href="#L796" id="L796">
796
</a>
<a class="file-line-num diff-line-num" data-line-number="797" href="#L797" id="L797">
797
</a>
<a class="file-line-num diff-line-num" data-line-number="798" href="#L798" id="L798">
798
</a>
<a class="file-line-num diff-line-num" data-line-number="799" href="#L799" id="L799">
799
</a>
<a class="file-line-num diff-line-num" data-line-number="800" href="#L800" id="L800">
800
</a>
<a class="file-line-num diff-line-num" data-line-number="801" href="#L801" id="L801">
801
</a>
<a class="file-line-num diff-line-num" data-line-number="802" href="#L802" id="L802">
802
</a>
<a class="file-line-num diff-line-num" data-line-number="803" href="#L803" id="L803">
803
</a>
<a class="file-line-num diff-line-num" data-line-number="804" href="#L804" id="L804">
804
</a>
<a class="file-line-num diff-line-num" data-line-number="805" href="#L805" id="L805">
805
</a>
<a class="file-line-num diff-line-num" data-line-number="806" href="#L806" id="L806">
806
</a>
<a class="file-line-num diff-line-num" data-line-number="807" href="#L807" id="L807">
807
</a>
<a class="file-line-num diff-line-num" data-line-number="808" href="#L808" id="L808">
808
</a>
<a class="file-line-num diff-line-num" data-line-number="809" href="#L809" id="L809">
809
</a>
<a class="file-line-num diff-line-num" data-line-number="810" href="#L810" id="L810">
810
</a>
<a class="file-line-num diff-line-num" data-line-number="811" href="#L811" id="L811">
811
</a>
<a class="file-line-num diff-line-num" data-line-number="812" href="#L812" id="L812">
812
</a>
<a class="file-line-num diff-line-num" data-line-number="813" href="#L813" id="L813">
813
</a>
<a class="file-line-num diff-line-num" data-line-number="814" href="#L814" id="L814">
814
</a>
<a class="file-line-num diff-line-num" data-line-number="815" href="#L815" id="L815">
815
</a>
<a class="file-line-num diff-line-num" data-line-number="816" href="#L816" id="L816">
816
</a>
<a class="file-line-num diff-line-num" data-line-number="817" href="#L817" id="L817">
817
</a>
<a class="file-line-num diff-line-num" data-line-number="818" href="#L818" id="L818">
818
</a>
<a class="file-line-num diff-line-num" data-line-number="819" href="#L819" id="L819">
819
</a>
<a class="file-line-num diff-line-num" data-line-number="820" href="#L820" id="L820">
820
</a>
<a class="file-line-num diff-line-num" data-line-number="821" href="#L821" id="L821">
821
</a>
<a class="file-line-num diff-line-num" data-line-number="822" href="#L822" id="L822">
822
</a>
<a class="file-line-num diff-line-num" data-line-number="823" href="#L823" id="L823">
823
</a>
<a class="file-line-num diff-line-num" data-line-number="824" href="#L824" id="L824">
824
</a>
<a class="file-line-num diff-line-num" data-line-number="825" href="#L825" id="L825">
825
</a>
<a class="file-line-num diff-line-num" data-line-number="826" href="#L826" id="L826">
826
</a>
<a class="file-line-num diff-line-num" data-line-number="827" href="#L827" id="L827">
827
</a>
<a class="file-line-num diff-line-num" data-line-number="828" href="#L828" id="L828">
828
</a>
<a class="file-line-num diff-line-num" data-line-number="829" href="#L829" id="L829">
829
</a>
<a class="file-line-num diff-line-num" data-line-number="830" href="#L830" id="L830">
830
</a>
<a class="file-line-num diff-line-num" data-line-number="831" href="#L831" id="L831">
831
</a>
<a class="file-line-num diff-line-num" data-line-number="832" href="#L832" id="L832">
832
</a>
<a class="file-line-num diff-line-num" data-line-number="833" href="#L833" id="L833">
833
</a>
<a class="file-line-num diff-line-num" data-line-number="834" href="#L834" id="L834">
834
</a>
<a class="file-line-num diff-line-num" data-line-number="835" href="#L835" id="L835">
835
</a>
<a class="file-line-num diff-line-num" data-line-number="836" href="#L836" id="L836">
836
</a>
<a class="file-line-num diff-line-num" data-line-number="837" href="#L837" id="L837">
837
</a>
<a class="file-line-num diff-line-num" data-line-number="838" href="#L838" id="L838">
838
</a>
<a class="file-line-num diff-line-num" data-line-number="839" href="#L839" id="L839">
839
</a>
<a class="file-line-num diff-line-num" data-line-number="840" href="#L840" id="L840">
840
</a>
<a class="file-line-num diff-line-num" data-line-number="841" href="#L841" id="L841">
841
</a>
<a class="file-line-num diff-line-num" data-line-number="842" href="#L842" id="L842">
842
</a>
<a class="file-line-num diff-line-num" data-line-number="843" href="#L843" id="L843">
843
</a>
<a class="file-line-num diff-line-num" data-line-number="844" href="#L844" id="L844">
844
</a>
<a class="file-line-num diff-line-num" data-line-number="845" href="#L845" id="L845">
845
</a>
<a class="file-line-num diff-line-num" data-line-number="846" href="#L846" id="L846">
846
</a>
<a class="file-line-num diff-line-num" data-line-number="847" href="#L847" id="L847">
847
</a>
<a class="file-line-num diff-line-num" data-line-number="848" href="#L848" id="L848">
848
</a>
<a class="file-line-num diff-line-num" data-line-number="849" href="#L849" id="L849">
849
</a>
<a class="file-line-num diff-line-num" data-line-number="850" href="#L850" id="L850">
850
</a>
<a class="file-line-num diff-line-num" data-line-number="851" href="#L851" id="L851">
851
</a>
<a class="file-line-num diff-line-num" data-line-number="852" href="#L852" id="L852">
852
</a>
<a class="file-line-num diff-line-num" data-line-number="853" href="#L853" id="L853">
853
</a>
<a class="file-line-num diff-line-num" data-line-number="854" href="#L854" id="L854">
854
</a>
<a class="file-line-num diff-line-num" data-line-number="855" href="#L855" id="L855">
855
</a>
<a class="file-line-num diff-line-num" data-line-number="856" href="#L856" id="L856">
856
</a>
<a class="file-line-num diff-line-num" data-line-number="857" href="#L857" id="L857">
857
</a>
<a class="file-line-num diff-line-num" data-line-number="858" href="#L858" id="L858">
858
</a>
<a class="file-line-num diff-line-num" data-line-number="859" href="#L859" id="L859">
859
</a>
<a class="file-line-num diff-line-num" data-line-number="860" href="#L860" id="L860">
860
</a>
<a class="file-line-num diff-line-num" data-line-number="861" href="#L861" id="L861">
861
</a>
<a class="file-line-num diff-line-num" data-line-number="862" href="#L862" id="L862">
862
</a>
<a class="file-line-num diff-line-num" data-line-number="863" href="#L863" id="L863">
863
</a>
<a class="file-line-num diff-line-num" data-line-number="864" href="#L864" id="L864">
864
</a>
<a class="file-line-num diff-line-num" data-line-number="865" href="#L865" id="L865">
865
</a>
<a class="file-line-num diff-line-num" data-line-number="866" href="#L866" id="L866">
866
</a>
<a class="file-line-num diff-line-num" data-line-number="867" href="#L867" id="L867">
867
</a>
<a class="file-line-num diff-line-num" data-line-number="868" href="#L868" id="L868">
868
</a>
<a class="file-line-num diff-line-num" data-line-number="869" href="#L869" id="L869">
869
</a>
<a class="file-line-num diff-line-num" data-line-number="870" href="#L870" id="L870">
870
</a>
<a class="file-line-num diff-line-num" data-line-number="871" href="#L871" id="L871">
871
</a>
<a class="file-line-num diff-line-num" data-line-number="872" href="#L872" id="L872">
872
</a>
<a class="file-line-num diff-line-num" data-line-number="873" href="#L873" id="L873">
873
</a>
<a class="file-line-num diff-line-num" data-line-number="874" href="#L874" id="L874">
874
</a>
<a class="file-line-num diff-line-num" data-line-number="875" href="#L875" id="L875">
875
</a>
<a class="file-line-num diff-line-num" data-line-number="876" href="#L876" id="L876">
876
</a>
<a class="file-line-num diff-line-num" data-line-number="877" href="#L877" id="L877">
877
</a>
<a class="file-line-num diff-line-num" data-line-number="878" href="#L878" id="L878">
878
</a>
<a class="file-line-num diff-line-num" data-line-number="879" href="#L879" id="L879">
879
</a>
<a class="file-line-num diff-line-num" data-line-number="880" href="#L880" id="L880">
880
</a>
<a class="file-line-num diff-line-num" data-line-number="881" href="#L881" id="L881">
881
</a>
<a class="file-line-num diff-line-num" data-line-number="882" href="#L882" id="L882">
882
</a>
<a class="file-line-num diff-line-num" data-line-number="883" href="#L883" id="L883">
883
</a>
<a class="file-line-num diff-line-num" data-line-number="884" href="#L884" id="L884">
884
</a>
<a class="file-line-num diff-line-num" data-line-number="885" href="#L885" id="L885">
885
</a>
<a class="file-line-num diff-line-num" data-line-number="886" href="#L886" id="L886">
886
</a>
<a class="file-line-num diff-line-num" data-line-number="887" href="#L887" id="L887">
887
</a>
<a class="file-line-num diff-line-num" data-line-number="888" href="#L888" id="L888">
888
</a>
<a class="file-line-num diff-line-num" data-line-number="889" href="#L889" id="L889">
889
</a>
<a class="file-line-num diff-line-num" data-line-number="890" href="#L890" id="L890">
890
</a>
<a class="file-line-num diff-line-num" data-line-number="891" href="#L891" id="L891">
891
</a>
<a class="file-line-num diff-line-num" data-line-number="892" href="#L892" id="L892">
892
</a>
<a class="file-line-num diff-line-num" data-line-number="893" href="#L893" id="L893">
893
</a>
<a class="file-line-num diff-line-num" data-line-number="894" href="#L894" id="L894">
894
</a>
<a class="file-line-num diff-line-num" data-line-number="895" href="#L895" id="L895">
895
</a>
<a class="file-line-num diff-line-num" data-line-number="896" href="#L896" id="L896">
896
</a>
<a class="file-line-num diff-line-num" data-line-number="897" href="#L897" id="L897">
897
</a>
<a class="file-line-num diff-line-num" data-line-number="898" href="#L898" id="L898">
898
</a>
<a class="file-line-num diff-line-num" data-line-number="899" href="#L899" id="L899">
899
</a>
<a class="file-line-num diff-line-num" data-line-number="900" href="#L900" id="L900">
900
</a>
<a class="file-line-num diff-line-num" data-line-number="901" href="#L901" id="L901">
901
</a>
<a class="file-line-num diff-line-num" data-line-number="902" href="#L902" id="L902">
902
</a>
<a class="file-line-num diff-line-num" data-line-number="903" href="#L903" id="L903">
903
</a>
<a class="file-line-num diff-line-num" data-line-number="904" href="#L904" id="L904">
904
</a>
<a class="file-line-num diff-line-num" data-line-number="905" href="#L905" id="L905">
905
</a>
<a class="file-line-num diff-line-num" data-line-number="906" href="#L906" id="L906">
906
</a>
<a class="file-line-num diff-line-num" data-line-number="907" href="#L907" id="L907">
907
</a>
<a class="file-line-num diff-line-num" data-line-number="908" href="#L908" id="L908">
908
</a>
<a class="file-line-num diff-line-num" data-line-number="909" href="#L909" id="L909">
909
</a>
<a class="file-line-num diff-line-num" data-line-number="910" href="#L910" id="L910">
910
</a>
<a class="file-line-num diff-line-num" data-line-number="911" href="#L911" id="L911">
911
</a>
<a class="file-line-num diff-line-num" data-line-number="912" href="#L912" id="L912">
912
</a>
<a class="file-line-num diff-line-num" data-line-number="913" href="#L913" id="L913">
913
</a>
<a class="file-line-num diff-line-num" data-line-number="914" href="#L914" id="L914">
914
</a>
<a class="file-line-num diff-line-num" data-line-number="915" href="#L915" id="L915">
915
</a>
<a class="file-line-num diff-line-num" data-line-number="916" href="#L916" id="L916">
916
</a>
<a class="file-line-num diff-line-num" data-line-number="917" href="#L917" id="L917">
917
</a>
<a class="file-line-num diff-line-num" data-line-number="918" href="#L918" id="L918">
918
</a>
<a class="file-line-num diff-line-num" data-line-number="919" href="#L919" id="L919">
919
</a>
<a class="file-line-num diff-line-num" data-line-number="920" href="#L920" id="L920">
920
</a>
<a class="file-line-num diff-line-num" data-line-number="921" href="#L921" id="L921">
921
</a>
<a class="file-line-num diff-line-num" data-line-number="922" href="#L922" id="L922">
922
</a>
<a class="file-line-num diff-line-num" data-line-number="923" href="#L923" id="L923">
923
</a>
<a class="file-line-num diff-line-num" data-line-number="924" href="#L924" id="L924">
924
</a>
<a class="file-line-num diff-line-num" data-line-number="925" href="#L925" id="L925">
925
</a>
<a class="file-line-num diff-line-num" data-line-number="926" href="#L926" id="L926">
926
</a>
<a class="file-line-num diff-line-num" data-line-number="927" href="#L927" id="L927">
927
</a>
<a class="file-line-num diff-line-num" data-line-number="928" href="#L928" id="L928">
928
</a>
<a class="file-line-num diff-line-num" data-line-number="929" href="#L929" id="L929">
929
</a>
<a class="file-line-num diff-line-num" data-line-number="930" href="#L930" id="L930">
930
</a>
<a class="file-line-num diff-line-num" data-line-number="931" href="#L931" id="L931">
931
</a>
<a class="file-line-num diff-line-num" data-line-number="932" href="#L932" id="L932">
932
</a>
<a class="file-line-num diff-line-num" data-line-number="933" href="#L933" id="L933">
933
</a>
<a class="file-line-num diff-line-num" data-line-number="934" href="#L934" id="L934">
934
</a>
<a class="file-line-num diff-line-num" data-line-number="935" href="#L935" id="L935">
935
</a>
<a class="file-line-num diff-line-num" data-line-number="936" href="#L936" id="L936">
936
</a>
<a class="file-line-num diff-line-num" data-line-number="937" href="#L937" id="L937">
937
</a>
<a class="file-line-num diff-line-num" data-line-number="938" href="#L938" id="L938">
938
</a>
<a class="file-line-num diff-line-num" data-line-number="939" href="#L939" id="L939">
939
</a>
<a class="file-line-num diff-line-num" data-line-number="940" href="#L940" id="L940">
940
</a>
<a class="file-line-num diff-line-num" data-line-number="941" href="#L941" id="L941">
941
</a>
<a class="file-line-num diff-line-num" data-line-number="942" href="#L942" id="L942">
942
</a>
<a class="file-line-num diff-line-num" data-line-number="943" href="#L943" id="L943">
943
</a>
<a class="file-line-num diff-line-num" data-line-number="944" href="#L944" id="L944">
944
</a>
<a class="file-line-num diff-line-num" data-line-number="945" href="#L945" id="L945">
945
</a>
<a class="file-line-num diff-line-num" data-line-number="946" href="#L946" id="L946">
946
</a>
<a class="file-line-num diff-line-num" data-line-number="947" href="#L947" id="L947">
947
</a>
<a class="file-line-num diff-line-num" data-line-number="948" href="#L948" id="L948">
948
</a>
<a class="file-line-num diff-line-num" data-line-number="949" href="#L949" id="L949">
949
</a>
<a class="file-line-num diff-line-num" data-line-number="950" href="#L950" id="L950">
950
</a>
<a class="file-line-num diff-line-num" data-line-number="951" href="#L951" id="L951">
951
</a>
<a class="file-line-num diff-line-num" data-line-number="952" href="#L952" id="L952">
952
</a>
<a class="file-line-num diff-line-num" data-line-number="953" href="#L953" id="L953">
953
</a>
<a class="file-line-num diff-line-num" data-line-number="954" href="#L954" id="L954">
954
</a>
<a class="file-line-num diff-line-num" data-line-number="955" href="#L955" id="L955">
955
</a>
<a class="file-line-num diff-line-num" data-line-number="956" href="#L956" id="L956">
956
</a>
<a class="file-line-num diff-line-num" data-line-number="957" href="#L957" id="L957">
957
</a>
<a class="file-line-num diff-line-num" data-line-number="958" href="#L958" id="L958">
958
</a>
<a class="file-line-num diff-line-num" data-line-number="959" href="#L959" id="L959">
959
</a>
<a class="file-line-num diff-line-num" data-line-number="960" href="#L960" id="L960">
960
</a>
<a class="file-line-num diff-line-num" data-line-number="961" href="#L961" id="L961">
961
</a>
<a class="file-line-num diff-line-num" data-line-number="962" href="#L962" id="L962">
962
</a>
<a class="file-line-num diff-line-num" data-line-number="963" href="#L963" id="L963">
963
</a>
<a class="file-line-num diff-line-num" data-line-number="964" href="#L964" id="L964">
964
</a>
<a class="file-line-num diff-line-num" data-line-number="965" href="#L965" id="L965">
965
</a>
<a class="file-line-num diff-line-num" data-line-number="966" href="#L966" id="L966">
966
</a>
<a class="file-line-num diff-line-num" data-line-number="967" href="#L967" id="L967">
967
</a>
<a class="file-line-num diff-line-num" data-line-number="968" href="#L968" id="L968">
968
</a>
<a class="file-line-num diff-line-num" data-line-number="969" href="#L969" id="L969">
969
</a>
<a class="file-line-num diff-line-num" data-line-number="970" href="#L970" id="L970">
970
</a>
<a class="file-line-num diff-line-num" data-line-number="971" href="#L971" id="L971">
971
</a>
<a class="file-line-num diff-line-num" data-line-number="972" href="#L972" id="L972">
972
</a>
<a class="file-line-num diff-line-num" data-line-number="973" href="#L973" id="L973">
973
</a>
<a class="file-line-num diff-line-num" data-line-number="974" href="#L974" id="L974">
974
</a>
<a class="file-line-num diff-line-num" data-line-number="975" href="#L975" id="L975">
975
</a>
<a class="file-line-num diff-line-num" data-line-number="976" href="#L976" id="L976">
976
</a>
<a class="file-line-num diff-line-num" data-line-number="977" href="#L977" id="L977">
977
</a>
<a class="file-line-num diff-line-num" data-line-number="978" href="#L978" id="L978">
978
</a>
<a class="file-line-num diff-line-num" data-line-number="979" href="#L979" id="L979">
979
</a>
<a class="file-line-num diff-line-num" data-line-number="980" href="#L980" id="L980">
980
</a>
<a class="file-line-num diff-line-num" data-line-number="981" href="#L981" id="L981">
981
</a>
<a class="file-line-num diff-line-num" data-line-number="982" href="#L982" id="L982">
982
</a>
<a class="file-line-num diff-line-num" data-line-number="983" href="#L983" id="L983">
983
</a>
<a class="file-line-num diff-line-num" data-line-number="984" href="#L984" id="L984">
984
</a>
<a class="file-line-num diff-line-num" data-line-number="985" href="#L985" id="L985">
985
</a>
<a class="file-line-num diff-line-num" data-line-number="986" href="#L986" id="L986">
986
</a>
<a class="file-line-num diff-line-num" data-line-number="987" href="#L987" id="L987">
987
</a>
<a class="file-line-num diff-line-num" data-line-number="988" href="#L988" id="L988">
988
</a>
<a class="file-line-num diff-line-num" data-line-number="989" href="#L989" id="L989">
989
</a>
<a class="file-line-num diff-line-num" data-line-number="990" href="#L990" id="L990">
990
</a>
<a class="file-line-num diff-line-num" data-line-number="991" href="#L991" id="L991">
991
</a>
<a class="file-line-num diff-line-num" data-line-number="992" href="#L992" id="L992">
992
</a>
<a class="file-line-num diff-line-num" data-line-number="993" href="#L993" id="L993">
993
</a>
<a class="file-line-num diff-line-num" data-line-number="994" href="#L994" id="L994">
994
</a>
<a class="file-line-num diff-line-num" data-line-number="995" href="#L995" id="L995">
995
</a>
<a class="file-line-num diff-line-num" data-line-number="996" href="#L996" id="L996">
996
</a>
<a class="file-line-num diff-line-num" data-line-number="997" href="#L997" id="L997">
997
</a>
<a class="file-line-num diff-line-num" data-line-number="998" href="#L998" id="L998">
998
</a>
<a class="file-line-num diff-line-num" data-line-number="999" href="#L999" id="L999">
999
</a>
<a class="file-line-num diff-line-num" data-line-number="1000" href="#L1000" id="L1000">
1000
</a>
<a class="file-line-num diff-line-num" data-line-number="1001" href="#L1001" id="L1001">
1001
</a>
<a class="file-line-num diff-line-num" data-line-number="1002" href="#L1002" id="L1002">
1002
</a>
<a class="file-line-num diff-line-num" data-line-number="1003" href="#L1003" id="L1003">
1003
</a>
<a class="file-line-num diff-line-num" data-line-number="1004" href="#L1004" id="L1004">
1004
</a>
<a class="file-line-num diff-line-num" data-line-number="1005" href="#L1005" id="L1005">
1005
</a>
<a class="file-line-num diff-line-num" data-line-number="1006" href="#L1006" id="L1006">
1006
</a>
<a class="file-line-num diff-line-num" data-line-number="1007" href="#L1007" id="L1007">
1007
</a>
<a class="file-line-num diff-line-num" data-line-number="1008" href="#L1008" id="L1008">
1008
</a>
<a class="file-line-num diff-line-num" data-line-number="1009" href="#L1009" id="L1009">
1009
</a>
<a class="file-line-num diff-line-num" data-line-number="1010" href="#L1010" id="L1010">
1010
</a>
<a class="file-line-num diff-line-num" data-line-number="1011" href="#L1011" id="L1011">
1011
</a>
<a class="file-line-num diff-line-num" data-line-number="1012" href="#L1012" id="L1012">
1012
</a>
<a class="file-line-num diff-line-num" data-line-number="1013" href="#L1013" id="L1013">
1013
</a>
<a class="file-line-num diff-line-num" data-line-number="1014" href="#L1014" id="L1014">
1014
</a>
<a class="file-line-num diff-line-num" data-line-number="1015" href="#L1015" id="L1015">
1015
</a>
<a class="file-line-num diff-line-num" data-line-number="1016" href="#L1016" id="L1016">
1016
</a>
<a class="file-line-num diff-line-num" data-line-number="1017" href="#L1017" id="L1017">
1017
</a>
<a class="file-line-num diff-line-num" data-line-number="1018" href="#L1018" id="L1018">
1018
</a>
<a class="file-line-num diff-line-num" data-line-number="1019" href="#L1019" id="L1019">
1019
</a>
<a class="file-line-num diff-line-num" data-line-number="1020" href="#L1020" id="L1020">
1020
</a>
<a class="file-line-num diff-line-num" data-line-number="1021" href="#L1021" id="L1021">
1021
</a>
<a class="file-line-num diff-line-num" data-line-number="1022" href="#L1022" id="L1022">
1022
</a>
<a class="file-line-num diff-line-num" data-line-number="1023" href="#L1023" id="L1023">
1023
</a>
<a class="file-line-num diff-line-num" data-line-number="1024" href="#L1024" id="L1024">
1024
</a>
<a class="file-line-num diff-line-num" data-line-number="1025" href="#L1025" id="L1025">
1025
</a>
<a class="file-line-num diff-line-num" data-line-number="1026" href="#L1026" id="L1026">
1026
</a>
<a class="file-line-num diff-line-num" data-line-number="1027" href="#L1027" id="L1027">
1027
</a>
<a class="file-line-num diff-line-num" data-line-number="1028" href="#L1028" id="L1028">
1028
</a>
<a class="file-line-num diff-line-num" data-line-number="1029" href="#L1029" id="L1029">
1029
</a>
<a class="file-line-num diff-line-num" data-line-number="1030" href="#L1030" id="L1030">
1030
</a>
<a class="file-line-num diff-line-num" data-line-number="1031" href="#L1031" id="L1031">
1031
</a>
<a class="file-line-num diff-line-num" data-line-number="1032" href="#L1032" id="L1032">
1032
</a>
<a class="file-line-num diff-line-num" data-line-number="1033" href="#L1033" id="L1033">
1033
</a>
<a class="file-line-num diff-line-num" data-line-number="1034" href="#L1034" id="L1034">
1034
</a>
<a class="file-line-num diff-line-num" data-line-number="1035" href="#L1035" id="L1035">
1035
</a>
<a class="file-line-num diff-line-num" data-line-number="1036" href="#L1036" id="L1036">
1036
</a>
<a class="file-line-num diff-line-num" data-line-number="1037" href="#L1037" id="L1037">
1037
</a>
<a class="file-line-num diff-line-num" data-line-number="1038" href="#L1038" id="L1038">
1038
</a>
<a class="file-line-num diff-line-num" data-line-number="1039" href="#L1039" id="L1039">
1039
</a>
<a class="file-line-num diff-line-num" data-line-number="1040" href="#L1040" id="L1040">
1040
</a>
<a class="file-line-num diff-line-num" data-line-number="1041" href="#L1041" id="L1041">
1041
</a>
<a class="file-line-num diff-line-num" data-line-number="1042" href="#L1042" id="L1042">
1042
</a>
<a class="file-line-num diff-line-num" data-line-number="1043" href="#L1043" id="L1043">
1043
</a>
<a class="file-line-num diff-line-num" data-line-number="1044" href="#L1044" id="L1044">
1044
</a>
<a class="file-line-num diff-line-num" data-line-number="1045" href="#L1045" id="L1045">
1045
</a>
<a class="file-line-num diff-line-num" data-line-number="1046" href="#L1046" id="L1046">
1046
</a>
<a class="file-line-num diff-line-num" data-line-number="1047" href="#L1047" id="L1047">
1047
</a>
<a class="file-line-num diff-line-num" data-line-number="1048" href="#L1048" id="L1048">
1048
</a>
<a class="file-line-num diff-line-num" data-line-number="1049" href="#L1049" id="L1049">
1049
</a>
<a class="file-line-num diff-line-num" data-line-number="1050" href="#L1050" id="L1050">
1050
</a>
<a class="file-line-num diff-line-num" data-line-number="1051" href="#L1051" id="L1051">
1051
</a>
<a class="file-line-num diff-line-num" data-line-number="1052" href="#L1052" id="L1052">
1052
</a>
<a class="file-line-num diff-line-num" data-line-number="1053" href="#L1053" id="L1053">
1053
</a>
<a class="file-line-num diff-line-num" data-line-number="1054" href="#L1054" id="L1054">
1054
</a>
<a class="file-line-num diff-line-num" data-line-number="1055" href="#L1055" id="L1055">
1055
</a>
<a class="file-line-num diff-line-num" data-line-number="1056" href="#L1056" id="L1056">
1056
</a>
<a class="file-line-num diff-line-num" data-line-number="1057" href="#L1057" id="L1057">
1057
</a>
<a class="file-line-num diff-line-num" data-line-number="1058" href="#L1058" id="L1058">
1058
</a>
<a class="file-line-num diff-line-num" data-line-number="1059" href="#L1059" id="L1059">
1059
</a>
<a class="file-line-num diff-line-num" data-line-number="1060" href="#L1060" id="L1060">
1060
</a>
<a class="file-line-num diff-line-num" data-line-number="1061" href="#L1061" id="L1061">
1061
</a>
<a class="file-line-num diff-line-num" data-line-number="1062" href="#L1062" id="L1062">
1062
</a>
<a class="file-line-num diff-line-num" data-line-number="1063" href="#L1063" id="L1063">
1063
</a>
<a class="file-line-num diff-line-num" data-line-number="1064" href="#L1064" id="L1064">
1064
</a>
<a class="file-line-num diff-line-num" data-line-number="1065" href="#L1065" id="L1065">
1065
</a>
<a class="file-line-num diff-line-num" data-line-number="1066" href="#L1066" id="L1066">
1066
</a>
<a class="file-line-num diff-line-num" data-line-number="1067" href="#L1067" id="L1067">
1067
</a>
<a class="file-line-num diff-line-num" data-line-number="1068" href="#L1068" id="L1068">
1068
</a>
<a class="file-line-num diff-line-num" data-line-number="1069" href="#L1069" id="L1069">
1069
</a>
<a class="file-line-num diff-line-num" data-line-number="1070" href="#L1070" id="L1070">
1070
</a>
<a class="file-line-num diff-line-num" data-line-number="1071" href="#L1071" id="L1071">
1071
</a>
<a class="file-line-num diff-line-num" data-line-number="1072" href="#L1072" id="L1072">
1072
</a>
<a class="file-line-num diff-line-num" data-line-number="1073" href="#L1073" id="L1073">
1073
</a>
<a class="file-line-num diff-line-num" data-line-number="1074" href="#L1074" id="L1074">
1074
</a>
<a class="file-line-num diff-line-num" data-line-number="1075" href="#L1075" id="L1075">
1075
</a>
<a class="file-line-num diff-line-num" data-line-number="1076" href="#L1076" id="L1076">
1076
</a>
<a class="file-line-num diff-line-num" data-line-number="1077" href="#L1077" id="L1077">
1077
</a>
<a class="file-line-num diff-line-num" data-line-number="1078" href="#L1078" id="L1078">
1078
</a>
<a class="file-line-num diff-line-num" data-line-number="1079" href="#L1079" id="L1079">
1079
</a>
<a class="file-line-num diff-line-num" data-line-number="1080" href="#L1080" id="L1080">
1080
</a>
<a class="file-line-num diff-line-num" data-line-number="1081" href="#L1081" id="L1081">
1081
</a>
<a class="file-line-num diff-line-num" data-line-number="1082" href="#L1082" id="L1082">
1082
</a>
<a class="file-line-num diff-line-num" data-line-number="1083" href="#L1083" id="L1083">
1083
</a>
<a class="file-line-num diff-line-num" data-line-number="1084" href="#L1084" id="L1084">
1084
</a>
<a class="file-line-num diff-line-num" data-line-number="1085" href="#L1085" id="L1085">
1085
</a>
<a class="file-line-num diff-line-num" data-line-number="1086" href="#L1086" id="L1086">
1086
</a>
<a class="file-line-num diff-line-num" data-line-number="1087" href="#L1087" id="L1087">
1087
</a>
<a class="file-line-num diff-line-num" data-line-number="1088" href="#L1088" id="L1088">
1088
</a>
<a class="file-line-num diff-line-num" data-line-number="1089" href="#L1089" id="L1089">
1089
</a>
<a class="file-line-num diff-line-num" data-line-number="1090" href="#L1090" id="L1090">
1090
</a>
<a class="file-line-num diff-line-num" data-line-number="1091" href="#L1091" id="L1091">
1091
</a>
<a class="file-line-num diff-line-num" data-line-number="1092" href="#L1092" id="L1092">
1092
</a>
<a class="file-line-num diff-line-num" data-line-number="1093" href="#L1093" id="L1093">
1093
</a>
<a class="file-line-num diff-line-num" data-line-number="1094" href="#L1094" id="L1094">
1094
</a>
<a class="file-line-num diff-line-num" data-line-number="1095" href="#L1095" id="L1095">
1095
</a>
<a class="file-line-num diff-line-num" data-line-number="1096" href="#L1096" id="L1096">
1096
</a>
<a class="file-line-num diff-line-num" data-line-number="1097" href="#L1097" id="L1097">
1097
</a>
<a class="file-line-num diff-line-num" data-line-number="1098" href="#L1098" id="L1098">
1098
</a>
<a class="file-line-num diff-line-num" data-line-number="1099" href="#L1099" id="L1099">
1099
</a>
<a class="file-line-num diff-line-num" data-line-number="1100" href="#L1100" id="L1100">
1100
</a>
<a class="file-line-num diff-line-num" data-line-number="1101" href="#L1101" id="L1101">
1101
</a>
<a class="file-line-num diff-line-num" data-line-number="1102" href="#L1102" id="L1102">
1102
</a>
<a class="file-line-num diff-line-num" data-line-number="1103" href="#L1103" id="L1103">
1103
</a>
<a class="file-line-num diff-line-num" data-line-number="1104" href="#L1104" id="L1104">
1104
</a>
<a class="file-line-num diff-line-num" data-line-number="1105" href="#L1105" id="L1105">
1105
</a>
<a class="file-line-num diff-line-num" data-line-number="1106" href="#L1106" id="L1106">
1106
</a>
<a class="file-line-num diff-line-num" data-line-number="1107" href="#L1107" id="L1107">
1107
</a>
<a class="file-line-num diff-line-num" data-line-number="1108" href="#L1108" id="L1108">
1108
</a>
<a class="file-line-num diff-line-num" data-line-number="1109" href="#L1109" id="L1109">
1109
</a>
<a class="file-line-num diff-line-num" data-line-number="1110" href="#L1110" id="L1110">
1110
</a>
<a class="file-line-num diff-line-num" data-line-number="1111" href="#L1111" id="L1111">
1111
</a>
<a class="file-line-num diff-line-num" data-line-number="1112" href="#L1112" id="L1112">
1112
</a>
<a class="file-line-num diff-line-num" data-line-number="1113" href="#L1113" id="L1113">
1113
</a>
<a class="file-line-num diff-line-num" data-line-number="1114" href="#L1114" id="L1114">
1114
</a>
<a class="file-line-num diff-line-num" data-line-number="1115" href="#L1115" id="L1115">
1115
</a>
<a class="file-line-num diff-line-num" data-line-number="1116" href="#L1116" id="L1116">
1116
</a>
<a class="file-line-num diff-line-num" data-line-number="1117" href="#L1117" id="L1117">
1117
</a>
<a class="file-line-num diff-line-num" data-line-number="1118" href="#L1118" id="L1118">
1118
</a>
<a class="file-line-num diff-line-num" data-line-number="1119" href="#L1119" id="L1119">
1119
</a>
<a class="file-line-num diff-line-num" data-line-number="1120" href="#L1120" id="L1120">
1120
</a>
<a class="file-line-num diff-line-num" data-line-number="1121" href="#L1121" id="L1121">
1121
</a>
<a class="file-line-num diff-line-num" data-line-number="1122" href="#L1122" id="L1122">
1122
</a>
<a class="file-line-num diff-line-num" data-line-number="1123" href="#L1123" id="L1123">
1123
</a>
<a class="file-line-num diff-line-num" data-line-number="1124" href="#L1124" id="L1124">
1124
</a>
<a class="file-line-num diff-line-num" data-line-number="1125" href="#L1125" id="L1125">
1125
</a>
<a class="file-line-num diff-line-num" data-line-number="1126" href="#L1126" id="L1126">
1126
</a>
<a class="file-line-num diff-line-num" data-line-number="1127" href="#L1127" id="L1127">
1127
</a>
<a class="file-line-num diff-line-num" data-line-number="1128" href="#L1128" id="L1128">
1128
</a>
<a class="file-line-num diff-line-num" data-line-number="1129" href="#L1129" id="L1129">
1129
</a>
<a class="file-line-num diff-line-num" data-line-number="1130" href="#L1130" id="L1130">
1130
</a>
<a class="file-line-num diff-line-num" data-line-number="1131" href="#L1131" id="L1131">
1131
</a>
<a class="file-line-num diff-line-num" data-line-number="1132" href="#L1132" id="L1132">
1132
</a>
<a class="file-line-num diff-line-num" data-line-number="1133" href="#L1133" id="L1133">
1133
</a>
<a class="file-line-num diff-line-num" data-line-number="1134" href="#L1134" id="L1134">
1134
</a>
<a class="file-line-num diff-line-num" data-line-number="1135" href="#L1135" id="L1135">
1135
</a>
<a class="file-line-num diff-line-num" data-line-number="1136" href="#L1136" id="L1136">
1136
</a>
<a class="file-line-num diff-line-num" data-line-number="1137" href="#L1137" id="L1137">
1137
</a>
<a class="file-line-num diff-line-num" data-line-number="1138" href="#L1138" id="L1138">
1138
</a>
<a class="file-line-num diff-line-num" data-line-number="1139" href="#L1139" id="L1139">
1139
</a>
<a class="file-line-num diff-line-num" data-line-number="1140" href="#L1140" id="L1140">
1140
</a>
<a class="file-line-num diff-line-num" data-line-number="1141" href="#L1141" id="L1141">
1141
</a>
<a class="file-line-num diff-line-num" data-line-number="1142" href="#L1142" id="L1142">
1142
</a>
<a class="file-line-num diff-line-num" data-line-number="1143" href="#L1143" id="L1143">
1143
</a>
<a class="file-line-num diff-line-num" data-line-number="1144" href="#L1144" id="L1144">
1144
</a>
<a class="file-line-num diff-line-num" data-line-number="1145" href="#L1145" id="L1145">
1145
</a>
<a class="file-line-num diff-line-num" data-line-number="1146" href="#L1146" id="L1146">
1146
</a>
<a class="file-line-num diff-line-num" data-line-number="1147" href="#L1147" id="L1147">
1147
</a>
<a class="file-line-num diff-line-num" data-line-number="1148" href="#L1148" id="L1148">
1148
</a>
<a class="file-line-num diff-line-num" data-line-number="1149" href="#L1149" id="L1149">
1149
</a>
<a class="file-line-num diff-line-num" data-line-number="1150" href="#L1150" id="L1150">
1150
</a>
<a class="file-line-num diff-line-num" data-line-number="1151" href="#L1151" id="L1151">
1151
</a>
<a class="file-line-num diff-line-num" data-line-number="1152" href="#L1152" id="L1152">
1152
</a>
<a class="file-line-num diff-line-num" data-line-number="1153" href="#L1153" id="L1153">
1153
</a>
<a class="file-line-num diff-line-num" data-line-number="1154" href="#L1154" id="L1154">
1154
</a>
<a class="file-line-num diff-line-num" data-line-number="1155" href="#L1155" id="L1155">
1155
</a>
<a class="file-line-num diff-line-num" data-line-number="1156" href="#L1156" id="L1156">
1156
</a>
<a class="file-line-num diff-line-num" data-line-number="1157" href="#L1157" id="L1157">
1157
</a>
<a class="file-line-num diff-line-num" data-line-number="1158" href="#L1158" id="L1158">
1158
</a>
<a class="file-line-num diff-line-num" data-line-number="1159" href="#L1159" id="L1159">
1159
</a>
<a class="file-line-num diff-line-num" data-line-number="1160" href="#L1160" id="L1160">
1160
</a>
<a class="file-line-num diff-line-num" data-line-number="1161" href="#L1161" id="L1161">
1161
</a>
<a class="file-line-num diff-line-num" data-line-number="1162" href="#L1162" id="L1162">
1162
</a>
<a class="file-line-num diff-line-num" data-line-number="1163" href="#L1163" id="L1163">
1163
</a>
<a class="file-line-num diff-line-num" data-line-number="1164" href="#L1164" id="L1164">
1164
</a>
<a class="file-line-num diff-line-num" data-line-number="1165" href="#L1165" id="L1165">
1165
</a>
<a class="file-line-num diff-line-num" data-line-number="1166" href="#L1166" id="L1166">
1166
</a>
<a class="file-line-num diff-line-num" data-line-number="1167" href="#L1167" id="L1167">
1167
</a>
<a class="file-line-num diff-line-num" data-line-number="1168" href="#L1168" id="L1168">
1168
</a>
<a class="file-line-num diff-line-num" data-line-number="1169" href="#L1169" id="L1169">
1169
</a>
<a class="file-line-num diff-line-num" data-line-number="1170" href="#L1170" id="L1170">
1170
</a>
<a class="file-line-num diff-line-num" data-line-number="1171" href="#L1171" id="L1171">
1171
</a>
<a class="file-line-num diff-line-num" data-line-number="1172" href="#L1172" id="L1172">
1172
</a>
<a class="file-line-num diff-line-num" data-line-number="1173" href="#L1173" id="L1173">
1173
</a>
<a class="file-line-num diff-line-num" data-line-number="1174" href="#L1174" id="L1174">
1174
</a>
<a class="file-line-num diff-line-num" data-line-number="1175" href="#L1175" id="L1175">
1175
</a>
<a class="file-line-num diff-line-num" data-line-number="1176" href="#L1176" id="L1176">
1176
</a>
<a class="file-line-num diff-line-num" data-line-number="1177" href="#L1177" id="L1177">
1177
</a>
<a class="file-line-num diff-line-num" data-line-number="1178" href="#L1178" id="L1178">
1178
</a>
<a class="file-line-num diff-line-num" data-line-number="1179" href="#L1179" id="L1179">
1179
</a>
<a class="file-line-num diff-line-num" data-line-number="1180" href="#L1180" id="L1180">
1180
</a>
<a class="file-line-num diff-line-num" data-line-number="1181" href="#L1181" id="L1181">
1181
</a>
<a class="file-line-num diff-line-num" data-line-number="1182" href="#L1182" id="L1182">
1182
</a>
<a class="file-line-num diff-line-num" data-line-number="1183" href="#L1183" id="L1183">
1183
</a>
<a class="file-line-num diff-line-num" data-line-number="1184" href="#L1184" id="L1184">
1184
</a>
<a class="file-line-num diff-line-num" data-line-number="1185" href="#L1185" id="L1185">
1185
</a>
<a class="file-line-num diff-line-num" data-line-number="1186" href="#L1186" id="L1186">
1186
</a>
<a class="file-line-num diff-line-num" data-line-number="1187" href="#L1187" id="L1187">
1187
</a>
<a class="file-line-num diff-line-num" data-line-number="1188" href="#L1188" id="L1188">
1188
</a>
<a class="file-line-num diff-line-num" data-line-number="1189" href="#L1189" id="L1189">
1189
</a>
<a class="file-line-num diff-line-num" data-line-number="1190" href="#L1190" id="L1190">
1190
</a>
<a class="file-line-num diff-line-num" data-line-number="1191" href="#L1191" id="L1191">
1191
</a>
<a class="file-line-num diff-line-num" data-line-number="1192" href="#L1192" id="L1192">
1192
</a>
<a class="file-line-num diff-line-num" data-line-number="1193" href="#L1193" id="L1193">
1193
</a>
<a class="file-line-num diff-line-num" data-line-number="1194" href="#L1194" id="L1194">
1194
</a>
<a class="file-line-num diff-line-num" data-line-number="1195" href="#L1195" id="L1195">
1195
</a>
<a class="file-line-num diff-line-num" data-line-number="1196" href="#L1196" id="L1196">
1196
</a>
<a class="file-line-num diff-line-num" data-line-number="1197" href="#L1197" id="L1197">
1197
</a>
<a class="file-line-num diff-line-num" data-line-number="1198" href="#L1198" id="L1198">
1198
</a>
<a class="file-line-num diff-line-num" data-line-number="1199" href="#L1199" id="L1199">
1199
</a>
<a class="file-line-num diff-line-num" data-line-number="1200" href="#L1200" id="L1200">
1200
</a>
<a class="file-line-num diff-line-num" data-line-number="1201" href="#L1201" id="L1201">
1201
</a>
<a class="file-line-num diff-line-num" data-line-number="1202" href="#L1202" id="L1202">
1202
</a>
<a class="file-line-num diff-line-num" data-line-number="1203" href="#L1203" id="L1203">
1203
</a>
<a class="file-line-num diff-line-num" data-line-number="1204" href="#L1204" id="L1204">
1204
</a>
<a class="file-line-num diff-line-num" data-line-number="1205" href="#L1205" id="L1205">
1205
</a>
<a class="file-line-num diff-line-num" data-line-number="1206" href="#L1206" id="L1206">
1206
</a>
<a class="file-line-num diff-line-num" data-line-number="1207" href="#L1207" id="L1207">
1207
</a>
<a class="file-line-num diff-line-num" data-line-number="1208" href="#L1208" id="L1208">
1208
</a>
<a class="file-line-num diff-line-num" data-line-number="1209" href="#L1209" id="L1209">
1209
</a>
<a class="file-line-num diff-line-num" data-line-number="1210" href="#L1210" id="L1210">
1210
</a>
<a class="file-line-num diff-line-num" data-line-number="1211" href="#L1211" id="L1211">
1211
</a>
<a class="file-line-num diff-line-num" data-line-number="1212" href="#L1212" id="L1212">
1212
</a>
<a class="file-line-num diff-line-num" data-line-number="1213" href="#L1213" id="L1213">
1213
</a>
<a class="file-line-num diff-line-num" data-line-number="1214" href="#L1214" id="L1214">
1214
</a>
<a class="file-line-num diff-line-num" data-line-number="1215" href="#L1215" id="L1215">
1215
</a>
<a class="file-line-num diff-line-num" data-line-number="1216" href="#L1216" id="L1216">
1216
</a>
<a class="file-line-num diff-line-num" data-line-number="1217" href="#L1217" id="L1217">
1217
</a>
<a class="file-line-num diff-line-num" data-line-number="1218" href="#L1218" id="L1218">
1218
</a>
<a class="file-line-num diff-line-num" data-line-number="1219" href="#L1219" id="L1219">
1219
</a>
<a class="file-line-num diff-line-num" data-line-number="1220" href="#L1220" id="L1220">
1220
</a>
<a class="file-line-num diff-line-num" data-line-number="1221" href="#L1221" id="L1221">
1221
</a>
<a class="file-line-num diff-line-num" data-line-number="1222" href="#L1222" id="L1222">
1222
</a>
<a class="file-line-num diff-line-num" data-line-number="1223" href="#L1223" id="L1223">
1223
</a>
<a class="file-line-num diff-line-num" data-line-number="1224" href="#L1224" id="L1224">
1224
</a>
<a class="file-line-num diff-line-num" data-line-number="1225" href="#L1225" id="L1225">
1225
</a>
<a class="file-line-num diff-line-num" data-line-number="1226" href="#L1226" id="L1226">
1226
</a>
<a class="file-line-num diff-line-num" data-line-number="1227" href="#L1227" id="L1227">
1227
</a>
<a class="file-line-num diff-line-num" data-line-number="1228" href="#L1228" id="L1228">
1228
</a>
<a class="file-line-num diff-line-num" data-line-number="1229" href="#L1229" id="L1229">
1229
</a>
<a class="file-line-num diff-line-num" data-line-number="1230" href="#L1230" id="L1230">
1230
</a>
<a class="file-line-num diff-line-num" data-line-number="1231" href="#L1231" id="L1231">
1231
</a>
<a class="file-line-num diff-line-num" data-line-number="1232" href="#L1232" id="L1232">
1232
</a>
<a class="file-line-num diff-line-num" data-line-number="1233" href="#L1233" id="L1233">
1233
</a>
<a class="file-line-num diff-line-num" data-line-number="1234" href="#L1234" id="L1234">
1234
</a>
<a class="file-line-num diff-line-num" data-line-number="1235" href="#L1235" id="L1235">
1235
</a>
<a class="file-line-num diff-line-num" data-line-number="1236" href="#L1236" id="L1236">
1236
</a>
<a class="file-line-num diff-line-num" data-line-number="1237" href="#L1237" id="L1237">
1237
</a>
<a class="file-line-num diff-line-num" data-line-number="1238" href="#L1238" id="L1238">
1238
</a>
<a class="file-line-num diff-line-num" data-line-number="1239" href="#L1239" id="L1239">
1239
</a>
<a class="file-line-num diff-line-num" data-line-number="1240" href="#L1240" id="L1240">
1240
</a>
<a class="file-line-num diff-line-num" data-line-number="1241" href="#L1241" id="L1241">
1241
</a>
<a class="file-line-num diff-line-num" data-line-number="1242" href="#L1242" id="L1242">
1242
</a>
<a class="file-line-num diff-line-num" data-line-number="1243" href="#L1243" id="L1243">
1243
</a>
<a class="file-line-num diff-line-num" data-line-number="1244" href="#L1244" id="L1244">
1244
</a>
<a class="file-line-num diff-line-num" data-line-number="1245" href="#L1245" id="L1245">
1245
</a>
<a class="file-line-num diff-line-num" data-line-number="1246" href="#L1246" id="L1246">
1246
</a>
<a class="file-line-num diff-line-num" data-line-number="1247" href="#L1247" id="L1247">
1247
</a>
<a class="file-line-num diff-line-num" data-line-number="1248" href="#L1248" id="L1248">
1248
</a>
<a class="file-line-num diff-line-num" data-line-number="1249" href="#L1249" id="L1249">
1249
</a>
<a class="file-line-num diff-line-num" data-line-number="1250" href="#L1250" id="L1250">
1250
</a>
<a class="file-line-num diff-line-num" data-line-number="1251" href="#L1251" id="L1251">
1251
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2003, 2005, Oracle and/or its affiliates. All rights reserved.</span></span>
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
<span id="LC25" class="line" lang="java"></span>
<span id="LC26" class="line" lang="java"></span>
<span id="LC27" class="line" lang="java"><span class="kn">package</span> <span class="nn">com.sun.java_cup.internal.runtime</span><span class="o">;</span></span>
<span id="LC28" class="line" lang="java"></span>
<span id="LC29" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.Stack</span><span class="o">;</span></span>
<span id="LC30" class="line" lang="java"></span>
<span id="LC31" class="line" lang="java"><span class="cm">/** This class implements a skeleton table driven LR parser.  In general,</span></span>
<span id="LC32" class="line" lang="java"><span class="cm"> *  LR parsers are a form of bottom up shift-reduce parsers.  Shift-reduce</span></span>
<span id="LC33" class="line" lang="java"><span class="cm"> *  parsers act by shifting input onto a parse stack until the Symbols</span></span>
<span id="LC34" class="line" lang="java"><span class="cm"> *  matching the right hand side of a production appear on the top of the</span></span>
<span id="LC35" class="line" lang="java"><span class="cm"> *  stack.  Once this occurs, a reduce is performed.  This involves removing</span></span>
<span id="LC36" class="line" lang="java"><span class="cm"> *  the Symbols corresponding to the right hand side of the production</span></span>
<span id="LC37" class="line" lang="java"><span class="cm"> *  (the so called "handle") and replacing them with the non-terminal from</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> *  the left hand side of the production.  &lt;p&gt;</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> *  To control the decision of whether to shift or reduce at any given point,</span></span>
<span id="LC41" class="line" lang="java"><span class="cm"> *  the parser uses a state machine (the "viable prefix recognition machine"</span></span>
<span id="LC42" class="line" lang="java"><span class="cm"> *  built by the parser generator).  The current state of the machine is placed</span></span>
<span id="LC43" class="line" lang="java"><span class="cm"> *  on top of the parse stack (stored as part of a Symbol object representing</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> *  a terminal or non terminal).  The parse action table is consulted</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> *  (using the current state and the current lookahead Symbol as indexes) to</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> *  determine whether to shift or to reduce.  When the parser shifts, it</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> *  changes to a new state by pushing a new Symbol (containing a new state)</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> *  onto the stack.  When the parser reduces, it pops the handle (right hand</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> *  side of a production) off the stack.  This leaves the parser in the state</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> *  it was in before any of those Symbols were matched.  Next the reduce-goto</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> *  table is consulted (using the new state and current lookahead Symbol as</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> *  indexes) to determine a new state to go to.  The parser then shifts to</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> *  this goto state by pushing the left hand side Symbol of the production</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> *  (also containing the new state) onto the stack.&lt;p&gt;</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> *  This class actually provides four LR parsers.  The methods parse() and</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> *  debug_parse() provide two versions of the main parser (the only difference</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> *  being that debug_parse() emits debugging trace messages as it parses).</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> *  In addition to these main parsers, the error recovery mechanism uses two</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> *  more.  One of these is used to simulate "parsing ahead" in the input</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> *  without carrying out actions (to verify that a potential error recovery</span></span>
<span id="LC62" class="line" lang="java"><span class="cm"> *  has worked), and the other is used to parse through buffered "parse ahead"</span></span>
<span id="LC63" class="line" lang="java"><span class="cm"> *  input in order to execute all actions and re-synchronize the actual parser</span></span>
<span id="LC64" class="line" lang="java"><span class="cm"> *  configuration.&lt;p&gt;</span></span>
<span id="LC65" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> *  This is an abstract class which is normally filled out by a subclass</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> *  generated by the JavaCup parser generator.  In addition to supplying</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> *  the actual parse tables, generated code also supplies methods which</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> *  invoke various pieces of user supplied code, provide access to certain</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> *  special Symbols (e.g., EOF and error), etc.  Specifically, the following</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> *  abstract methods are normally supplied by generated code:</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> *  &lt;dl compact&gt;</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; short[][] production_table()</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Provides a reference to the production table (indicating the index of</span></span>
<span id="LC75" class="line" lang="java"><span class="cm"> *       the left hand side non terminal and the length of the right hand side</span></span>
<span id="LC76" class="line" lang="java"><span class="cm"> *       for each production in the grammar).</span></span>
<span id="LC77" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; short[][] action_table()</span></span>
<span id="LC78" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Provides a reference to the parse action table.</span></span>
<span id="LC79" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; short[][] reduce_table()</span></span>
<span id="LC80" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Provides a reference to the reduce-goto table.</span></span>
<span id="LC81" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; int start_state()</span></span>
<span id="LC82" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Indicates the index of the start state.</span></span>
<span id="LC83" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; int start_production()</span></span>
<span id="LC84" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Indicates the index of the starting production.</span></span>
<span id="LC85" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; int EOF_sym()</span></span>
<span id="LC86" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Indicates the index of the EOF Symbol.</span></span>
<span id="LC87" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; int error_sym()</span></span>
<span id="LC88" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Indicates the index of the error Symbol.</span></span>
<span id="LC89" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; Symbol do_action()</span></span>
<span id="LC90" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Executes a piece of user supplied action code.  This always comes at</span></span>
<span id="LC91" class="line" lang="java"><span class="cm"> *       the point of a reduce in the parse, so this code also allocates and</span></span>
<span id="LC92" class="line" lang="java"><span class="cm"> *       fills in the left hand side non terminal Symbol object that is to be</span></span>
<span id="LC93" class="line" lang="java"><span class="cm"> *       pushed onto the stack for the reduce.</span></span>
<span id="LC94" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; void init_actions()</span></span>
<span id="LC95" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Code to initialize a special object that encapsulates user supplied</span></span>
<span id="LC96" class="line" lang="java"><span class="cm"> *       actions (this object is used by do_action() to actually carry out the</span></span>
<span id="LC97" class="line" lang="java"><span class="cm"> *       actions).</span></span>
<span id="LC98" class="line" lang="java"><span class="cm"> *  &lt;/dl&gt;</span></span>
<span id="LC99" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC100" class="line" lang="java"><span class="cm"> *  In addition to these routines that &lt;i&gt;must&lt;/i&gt; be supplied by the</span></span>
<span id="LC101" class="line" lang="java"><span class="cm"> *  generated subclass there are also a series of routines that &lt;i&gt;may&lt;/i&gt;</span></span>
<span id="LC102" class="line" lang="java"><span class="cm"> *  be supplied.  These include:</span></span>
<span id="LC103" class="line" lang="java"><span class="cm"> *  &lt;dl&gt;</span></span>
<span id="LC104" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; Symbol scan()</span></span>
<span id="LC105" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Used to get the next input Symbol from the scanner.</span></span>
<span id="LC106" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; Scanner getScanner()</span></span>
<span id="LC107" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; Used to provide a scanner for the default implementation of</span></span>
<span id="LC108" class="line" lang="java"><span class="cm"> *       scan().</span></span>
<span id="LC109" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; int error_sync_size()</span></span>
<span id="LC110" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; This determines how many Symbols past the point of an error</span></span>
<span id="LC111" class="line" lang="java"><span class="cm"> *       must be parsed without error in order to consider a recovery to</span></span>
<span id="LC112" class="line" lang="java"><span class="cm"> *       be valid.  This defaults to 3.  Values less than 2 are not</span></span>
<span id="LC113" class="line" lang="java"><span class="cm"> *       recommended.</span></span>
<span id="LC114" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; void report_error(String message, Object info)</span></span>
<span id="LC115" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; This method is called to report an error.  The default implementation</span></span>
<span id="LC116" class="line" lang="java"><span class="cm"> *       simply prints a message to System.err and where the error occurred.</span></span>
<span id="LC117" class="line" lang="java"><span class="cm"> *       This method is often replaced in order to provide a more sophisticated</span></span>
<span id="LC118" class="line" lang="java"><span class="cm"> *       error reporting mechanism.</span></span>
<span id="LC119" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; void report_fatal_error(String message, Object info)</span></span>
<span id="LC120" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; This method is called when a fatal error that cannot be recovered from</span></span>
<span id="LC121" class="line" lang="java"><span class="cm"> *       is encountered.  In the default implementation, it calls</span></span>
<span id="LC122" class="line" lang="java"><span class="cm"> *       report_error() to emit a message, then throws an exception.</span></span>
<span id="LC123" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; void syntax_error(Symbol cur_token)</span></span>
<span id="LC124" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; This method is called as soon as syntax error is detected (but</span></span>
<span id="LC125" class="line" lang="java"><span class="cm"> *       before recovery is attempted).  In the default implementation it</span></span>
<span id="LC126" class="line" lang="java"><span class="cm"> *       invokes: report_error("Syntax error", null);</span></span>
<span id="LC127" class="line" lang="java"><span class="cm"> *  &lt;dt&gt; void unrecovered_syntax_error(Symbol cur_token)</span></span>
<span id="LC128" class="line" lang="java"><span class="cm"> *  &lt;dd&gt; This method is called if syntax error recovery fails.  In the default</span></span>
<span id="LC129" class="line" lang="java"><span class="cm"> *       implementation it invokes:&lt;br&gt;</span></span>
<span id="LC130" class="line" lang="java"><span class="cm"> *         report_fatal_error("Couldn't repair and continue parse", null);</span></span>
<span id="LC131" class="line" lang="java"><span class="cm"> *  &lt;/dl&gt;</span></span>
<span id="LC132" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC133" class="line" lang="java"><span class="cm"> * @see     com.sun.java_cup.internal.runtime.Symbol</span></span>
<span id="LC134" class="line" lang="java"><span class="cm"> * @see     com.sun.java_cup.internal.runtime.Symbol</span></span>
<span id="LC135" class="line" lang="java"><span class="cm"> * @see     com.sun.java_cup.internal.runtime.virtual_parse_stack</span></span>
<span id="LC136" class="line" lang="java"><span class="cm"> * @author  Frank Flannery</span></span>
<span id="LC137" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC138" class="line" lang="java"></span>
<span id="LC139" class="line" lang="java"><span class="kd">public</span> <span class="kd">abstract</span> <span class="kd">class</span> <span class="nc">lr_parser</span> <span class="o">{</span></span>
<span id="LC140" class="line" lang="java"></span>
<span id="LC141" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC142" class="line" lang="java">  <span class="cm">/*--- Constructor(s) ----------------------------------------*/</span></span>
<span id="LC143" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC144" class="line" lang="java"></span>
<span id="LC145" class="line" lang="java">  <span class="cm">/** Simple constructor. */</span></span>
<span id="LC146" class="line" lang="java">  <span class="kd">public</span> <span class="nf">lr_parser</span><span class="o">()</span></span>
<span id="LC147" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC148" class="line" lang="java">      <span class="cm">/* nothing to do here */</span></span>
<span id="LC149" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC150" class="line" lang="java"></span>
<span id="LC151" class="line" lang="java">  <span class="cm">/** Constructor that sets the default scanner. [CSA/davidm] */</span></span>
<span id="LC152" class="line" lang="java">  <span class="kd">public</span> <span class="nf">lr_parser</span><span class="o">(</span><span class="nc">Scanner</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC153" class="line" lang="java">    <span class="k">this</span><span class="o">();</span> <span class="cm">/* in case default constructor someday does something */</span></span>
<span id="LC154" class="line" lang="java">    <span class="n">setScanner</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></span>
<span id="LC155" class="line" lang="java">  <span class="o">}</span></span>
<span id="LC156" class="line" lang="java"></span>
<span id="LC157" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC158" class="line" lang="java">  <span class="cm">/*--- (Access to) Static (Class) Variables ------------------*/</span></span>
<span id="LC159" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC160" class="line" lang="java"></span>
<span id="LC161" class="line" lang="java">  <span class="cm">/** The default number of Symbols after an error we much match to consider</span></span>
<span id="LC162" class="line" lang="java"><span class="cm">   *  it recovered from.</span></span>
<span id="LC163" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC164" class="line" lang="java">  <span class="kd">protected</span> <span class="kd">final</span> <span class="kd">static</span> <span class="kt">int</span> <span class="n">_error_sync_size</span> <span class="o">=</span> <span class="mi">3</span><span class="o">;</span></span>
<span id="LC165" class="line" lang="java"></span>
<span id="LC166" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC167" class="line" lang="java"></span>
<span id="LC168" class="line" lang="java">  <span class="cm">/** The number of Symbols after an error we much match to consider it</span></span>
<span id="LC169" class="line" lang="java"><span class="cm">   *  recovered from.</span></span>
<span id="LC170" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC171" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">int</span> <span class="nf">error_sync_size</span><span class="o">()</span> <span class="o">{</span><span class="k">return</span> <span class="n">_error_sync_size</span><span class="o">;</span> <span class="o">}</span></span>
<span id="LC172" class="line" lang="java"></span>
<span id="LC173" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC174" class="line" lang="java">  <span class="cm">/*--- (Access to) Instance Variables ------------------------*/</span></span>
<span id="LC175" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC176" class="line" lang="java"></span>
<span id="LC177" class="line" lang="java">  <span class="cm">/** Table of production information (supplied by generated subclass).</span></span>
<span id="LC178" class="line" lang="java"><span class="cm">   *  This table contains one entry per production and is indexed by</span></span>
<span id="LC179" class="line" lang="java"><span class="cm">   *  the negative-encoded values (reduce actions) in the action_table.</span></span>
<span id="LC180" class="line" lang="java"><span class="cm">   *  Each entry has two parts, the index of the non-terminal on the</span></span>
<span id="LC181" class="line" lang="java"><span class="cm">   *  left hand side of the production, and the number of Symbols</span></span>
<span id="LC182" class="line" lang="java"><span class="cm">   *  on the right hand side.</span></span>
<span id="LC183" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC184" class="line" lang="java">  <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">short</span><span class="o">[][]</span> <span class="nf">production_table</span><span class="o">();</span></span>
<span id="LC185" class="line" lang="java"></span>
<span id="LC186" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC187" class="line" lang="java"></span>
<span id="LC188" class="line" lang="java">  <span class="cm">/** The action table (supplied by generated subclass).  This table is</span></span>
<span id="LC189" class="line" lang="java"><span class="cm">   *  indexed by state and terminal number indicating what action is to</span></span>
<span id="LC190" class="line" lang="java"><span class="cm">   *  be taken when the parser is in the given state (i.e., the given state</span></span>
<span id="LC191" class="line" lang="java"><span class="cm">   *  is on top of the stack) and the given terminal is next on the input.</span></span>
<span id="LC192" class="line" lang="java"><span class="cm">   *  States are indexed using the first dimension, however, the entries for</span></span>
<span id="LC193" class="line" lang="java"><span class="cm">   *  a given state are compacted and stored in adjacent index, value pairs</span></span>
<span id="LC194" class="line" lang="java"><span class="cm">   *  which are searched for rather than accessed directly (see get_action()).</span></span>
<span id="LC195" class="line" lang="java"><span class="cm">   *  The actions stored in the table will be either shifts, reduces, or</span></span>
<span id="LC196" class="line" lang="java"><span class="cm">   *  errors.  Shifts are encoded as positive values (one greater than the</span></span>
<span id="LC197" class="line" lang="java"><span class="cm">   *  state shifted to).  Reduces are encoded as negative values (one less</span></span>
<span id="LC198" class="line" lang="java"><span class="cm">   *  than the production reduced by).  Error entries are denoted by zero.</span></span>
<span id="LC199" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC200" class="line" lang="java"><span class="cm">   * @see com.sun.java_cup.internal.runtime.lr_parser#get_action</span></span>
<span id="LC201" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC202" class="line" lang="java">  <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">short</span><span class="o">[][]</span> <span class="nf">action_table</span><span class="o">();</span></span>
<span id="LC203" class="line" lang="java"></span>
<span id="LC204" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC205" class="line" lang="java"></span>
<span id="LC206" class="line" lang="java">  <span class="cm">/** The reduce-goto table (supplied by generated subclass).  This</span></span>
<span id="LC207" class="line" lang="java"><span class="cm">   *  table is indexed by state and non-terminal number and contains</span></span>
<span id="LC208" class="line" lang="java"><span class="cm">   *  state numbers.  States are indexed using the first dimension, however,</span></span>
<span id="LC209" class="line" lang="java"><span class="cm">   *  the entries for a given state are compacted and stored in adjacent</span></span>
<span id="LC210" class="line" lang="java"><span class="cm">   *  index, value pairs which are searched for rather than accessed</span></span>
<span id="LC211" class="line" lang="java"><span class="cm">   *  directly (see get_reduce()).  When a reduce occurs, the handle</span></span>
<span id="LC212" class="line" lang="java"><span class="cm">   *  (corresponding to the RHS of the matched production) is popped off</span></span>
<span id="LC213" class="line" lang="java"><span class="cm">   *  the stack.  The new top of stack indicates a state.  This table is</span></span>
<span id="LC214" class="line" lang="java"><span class="cm">   *  then indexed by that state and the LHS of the reducing production to</span></span>
<span id="LC215" class="line" lang="java"><span class="cm">   *  indicate where to "shift" to.</span></span>
<span id="LC216" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC217" class="line" lang="java"><span class="cm">   * @see com.sun.java_cup.internal.runtime.lr_parser#get_reduce</span></span>
<span id="LC218" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC219" class="line" lang="java">  <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">short</span><span class="o">[][]</span> <span class="nf">reduce_table</span><span class="o">();</span></span>
<span id="LC220" class="line" lang="java"></span>
<span id="LC221" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC222" class="line" lang="java"></span>
<span id="LC223" class="line" lang="java">  <span class="cm">/** The index of the start state (supplied by generated subclass). */</span></span>
<span id="LC224" class="line" lang="java">  <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">start_state</span><span class="o">();</span></span>
<span id="LC225" class="line" lang="java"></span>
<span id="LC226" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC227" class="line" lang="java"></span>
<span id="LC228" class="line" lang="java">  <span class="cm">/** The index of the start production (supplied by generated subclass). */</span></span>
<span id="LC229" class="line" lang="java">  <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">start_production</span><span class="o">();</span></span>
<span id="LC230" class="line" lang="java"></span>
<span id="LC231" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC232" class="line" lang="java"></span>
<span id="LC233" class="line" lang="java">  <span class="cm">/** The index of the end of file terminal Symbol (supplied by generated</span></span>
<span id="LC234" class="line" lang="java"><span class="cm">   *  subclass).</span></span>
<span id="LC235" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC236" class="line" lang="java">  <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">EOF_sym</span><span class="o">();</span></span>
<span id="LC237" class="line" lang="java"></span>
<span id="LC238" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC239" class="line" lang="java"></span>
<span id="LC240" class="line" lang="java">  <span class="cm">/** The index of the special error Symbol (supplied by generated subclass). */</span></span>
<span id="LC241" class="line" lang="java">  <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">error_sym</span><span class="o">();</span></span>
<span id="LC242" class="line" lang="java"></span>
<span id="LC243" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC244" class="line" lang="java"></span>
<span id="LC245" class="line" lang="java">  <span class="cm">/** Internal flag to indicate when parser should quit. */</span></span>
<span id="LC246" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">boolean</span> <span class="n">_done_parsing</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC247" class="line" lang="java"></span>
<span id="LC248" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC249" class="line" lang="java"></span>
<span id="LC250" class="line" lang="java">  <span class="cm">/** This method is called to indicate that the parser should quit.  This is</span></span>
<span id="LC251" class="line" lang="java"><span class="cm">   *  normally called by an accept action, but can be used to cancel parsing</span></span>
<span id="LC252" class="line" lang="java"><span class="cm">   *  early in other circumstances if desired.</span></span>
<span id="LC253" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC254" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">done_parsing</span><span class="o">()</span></span>
<span id="LC255" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC256" class="line" lang="java">      <span class="n">_done_parsing</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC257" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC258" class="line" lang="java"></span>
<span id="LC259" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC260" class="line" lang="java">  <span class="cm">/* Global parse state shared by parse(), error recovery, and</span></span>
<span id="LC261" class="line" lang="java"><span class="cm">   * debugging routines */</span></span>
<span id="LC262" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC263" class="line" lang="java"></span>
<span id="LC264" class="line" lang="java">  <span class="cm">/** Indication of the index for top of stack (for use by actions). */</span></span>
<span id="LC265" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">int</span> <span class="n">tos</span><span class="o">;</span></span>
<span id="LC266" class="line" lang="java"></span>
<span id="LC267" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC268" class="line" lang="java"></span>
<span id="LC269" class="line" lang="java">  <span class="cm">/** The current lookahead Symbol. */</span></span>
<span id="LC270" class="line" lang="java">  <span class="kd">protected</span> <span class="nc">Symbol</span> <span class="n">cur_token</span><span class="o">;</span></span>
<span id="LC271" class="line" lang="java"></span>
<span id="LC272" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC273" class="line" lang="java"></span>
<span id="LC274" class="line" lang="java">  <span class="cm">/** The parse stack itself. */</span></span>
<span id="LC275" class="line" lang="java">  <span class="kd">protected</span> <span class="nc">Stack</span> <span class="n">stack</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Stack</span><span class="o">();</span></span>
<span id="LC276" class="line" lang="java"></span>
<span id="LC277" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC278" class="line" lang="java"></span>
<span id="LC279" class="line" lang="java">  <span class="cm">/** Direct reference to the production table. */</span></span>
<span id="LC280" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">short</span><span class="o">[][]</span> <span class="n">production_tab</span><span class="o">;</span></span>
<span id="LC281" class="line" lang="java"></span>
<span id="LC282" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC283" class="line" lang="java"></span>
<span id="LC284" class="line" lang="java">  <span class="cm">/** Direct reference to the action table. */</span></span>
<span id="LC285" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">short</span><span class="o">[][]</span> <span class="n">action_tab</span><span class="o">;</span></span>
<span id="LC286" class="line" lang="java"></span>
<span id="LC287" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC288" class="line" lang="java"></span>
<span id="LC289" class="line" lang="java">  <span class="cm">/** Direct reference to the reduce-goto table. */</span></span>
<span id="LC290" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">short</span><span class="o">[][]</span> <span class="n">reduce_tab</span><span class="o">;</span></span>
<span id="LC291" class="line" lang="java"></span>
<span id="LC292" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC293" class="line" lang="java"></span>
<span id="LC294" class="line" lang="java">  <span class="cm">/** This is the scanner object used by the default implementation</span></span>
<span id="LC295" class="line" lang="java"><span class="cm">   *  of scan() to get Symbols.  To avoid name conflicts with existing</span></span>
<span id="LC296" class="line" lang="java"><span class="cm">   *  code, this field is private. [CSA/davidm] */</span></span>
<span id="LC297" class="line" lang="java">  <span class="kd">private</span> <span class="nc">Scanner</span> <span class="n">_scanner</span><span class="o">;</span></span>
<span id="LC298" class="line" lang="java"></span>
<span id="LC299" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC300" class="line" lang="java"><span class="cm">   * Simple accessor method to set the default scanner.</span></span>
<span id="LC301" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC302" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setScanner</span><span class="o">(</span><span class="nc">Scanner</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span> <span class="n">_scanner</span> <span class="o">=</span> <span class="n">s</span><span class="o">;</span> <span class="o">}</span></span>
<span id="LC303" class="line" lang="java"></span>
<span id="LC304" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC305" class="line" lang="java"><span class="cm">   * Simple accessor method to get the default scanner.</span></span>
<span id="LC306" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC307" class="line" lang="java">  <span class="kd">public</span> <span class="nc">Scanner</span> <span class="nf">getScanner</span><span class="o">()</span> <span class="o">{</span> <span class="k">return</span> <span class="n">_scanner</span><span class="o">;</span> <span class="o">}</span></span>
<span id="LC308" class="line" lang="java"></span>
<span id="LC309" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC310" class="line" lang="java">  <span class="cm">/*--- General Methods ---------------------------------------*/</span></span>
<span id="LC311" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC312" class="line" lang="java"></span>
<span id="LC313" class="line" lang="java">  <span class="cm">/** Perform a bit of user supplied action code (supplied by generated</span></span>
<span id="LC314" class="line" lang="java"><span class="cm">   *  subclass).  Actions are indexed by an internal action number assigned</span></span>
<span id="LC315" class="line" lang="java"><span class="cm">   *  at parser generation time.</span></span>
<span id="LC316" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC317" class="line" lang="java"><span class="cm">   * @param act_num   the internal index of the action to be performed.</span></span>
<span id="LC318" class="line" lang="java"><span class="cm">   * @param parser    the parser object we are acting for.</span></span>
<span id="LC319" class="line" lang="java"><span class="cm">   * @param stack     the parse stack of that object.</span></span>
<span id="LC320" class="line" lang="java"><span class="cm">   * @param top       the index of the top element of the parse stack.</span></span>
<span id="LC321" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC322" class="line" lang="java">  <span class="kd">public</span> <span class="kd">abstract</span> <span class="nc">Symbol</span> <span class="nf">do_action</span><span class="o">(</span></span>
<span id="LC323" class="line" lang="java">    <span class="kt">int</span>       <span class="n">act_num</span><span class="o">,</span></span>
<span id="LC324" class="line" lang="java">    <span class="n">lr_parser</span> <span class="n">parser</span><span class="o">,</span></span>
<span id="LC325" class="line" lang="java">    <span class="nc">Stack</span>     <span class="n">stack</span><span class="o">,</span></span>
<span id="LC326" class="line" lang="java">    <span class="kt">int</span>       <span class="n">top</span><span class="o">)</span></span>
<span id="LC327" class="line" lang="java">    <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span><span class="o">;</span></span>
<span id="LC328" class="line" lang="java"></span>
<span id="LC329" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC330" class="line" lang="java"></span>
<span id="LC331" class="line" lang="java">  <span class="cm">/** User code for initialization inside the parser.  Typically this</span></span>
<span id="LC332" class="line" lang="java"><span class="cm">   *  initializes the scanner.  This is called before the parser requests</span></span>
<span id="LC333" class="line" lang="java"><span class="cm">   *  the first Symbol.  Here this is just a placeholder for subclasses that</span></span>
<span id="LC334" class="line" lang="java"><span class="cm">   *  might need this and we perform no action.   This method is normally</span></span>
<span id="LC335" class="line" lang="java"><span class="cm">   *  overridden by the generated code using this contents of the "init with"</span></span>
<span id="LC336" class="line" lang="java"><span class="cm">   *  clause as its body.</span></span>
<span id="LC337" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC338" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">user_init</span><span class="o">()</span> <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span> <span class="o">{</span> <span class="o">}</span></span>
<span id="LC339" class="line" lang="java"></span>
<span id="LC340" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC341" class="line" lang="java"></span>
<span id="LC342" class="line" lang="java">  <span class="cm">/** Initialize the action object.  This is called before the parser does</span></span>
<span id="LC343" class="line" lang="java"><span class="cm">   *  any parse actions. This is filled in by generated code to create</span></span>
<span id="LC344" class="line" lang="java"><span class="cm">   *  an object that encapsulates all action code.</span></span>
<span id="LC345" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC346" class="line" lang="java">  <span class="kd">protected</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">init_actions</span><span class="o">()</span> <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span><span class="o">;</span></span>
<span id="LC347" class="line" lang="java"></span>
<span id="LC348" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC349" class="line" lang="java"></span>
<span id="LC350" class="line" lang="java">  <span class="cm">/** Get the next Symbol from the input (supplied by generated subclass).</span></span>
<span id="LC351" class="line" lang="java"><span class="cm">   *  Once end of file has been reached, all subsequent calls to scan</span></span>
<span id="LC352" class="line" lang="java"><span class="cm">   *  should return an EOF Symbol (which is Symbol number 0).  By default</span></span>
<span id="LC353" class="line" lang="java"><span class="cm">   *  this method returns getScanner().next_token(); this implementation</span></span>
<span id="LC354" class="line" lang="java"><span class="cm">   *  can be overriden by the generated parser using the code declared in</span></span>
<span id="LC355" class="line" lang="java"><span class="cm">   *  the "scan with" clause.  Do not recycle objects; every call to</span></span>
<span id="LC356" class="line" lang="java"><span class="cm">   *  scan() should return a fresh object.</span></span>
<span id="LC357" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC358" class="line" lang="java">  <span class="kd">public</span> <span class="nc">Symbol</span> <span class="nf">scan</span><span class="o">()</span> <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span> <span class="o">{</span></span>
<span id="LC359" class="line" lang="java">    <span class="k">return</span> <span class="nf">getScanner</span><span class="o">().</span><span class="na">next_token</span><span class="o">();</span></span>
<span id="LC360" class="line" lang="java">  <span class="o">}</span></span>
<span id="LC361" class="line" lang="java"></span>
<span id="LC362" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC363" class="line" lang="java"></span>
<span id="LC364" class="line" lang="java">  <span class="cm">/** Report a fatal error.  This method takes a  message string and an</span></span>
<span id="LC365" class="line" lang="java"><span class="cm">   *  additional object (to be used by specializations implemented in</span></span>
<span id="LC366" class="line" lang="java"><span class="cm">   *  subclasses).  Here in the base class a very simple implementation</span></span>
<span id="LC367" class="line" lang="java"><span class="cm">   *  is provided which reports the error then throws an exception.</span></span>
<span id="LC368" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC369" class="line" lang="java"><span class="cm">   * @param message an error message.</span></span>
<span id="LC370" class="line" lang="java"><span class="cm">   * @param info    an extra object reserved for use by specialized subclasses.</span></span>
<span id="LC371" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC372" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">report_fatal_error</span><span class="o">(</span></span>
<span id="LC373" class="line" lang="java">    <span class="nc">String</span>   <span class="n">message</span><span class="o">,</span></span>
<span id="LC374" class="line" lang="java">    <span class="nc">Object</span>   <span class="n">info</span><span class="o">)</span></span>
<span id="LC375" class="line" lang="java">    <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC376" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC377" class="line" lang="java">      <span class="cm">/* stop parsing (not really necessary since we throw an exception, but) */</span></span>
<span id="LC378" class="line" lang="java">      <span class="n">done_parsing</span><span class="o">();</span></span>
<span id="LC379" class="line" lang="java"></span>
<span id="LC380" class="line" lang="java">      <span class="cm">/* use the normal error message reporting to put out the message */</span></span>
<span id="LC381" class="line" lang="java">      <span class="n">report_error</span><span class="o">(</span><span class="n">message</span><span class="o">,</span> <span class="n">info</span><span class="o">);</span></span>
<span id="LC382" class="line" lang="java"></span>
<span id="LC383" class="line" lang="java">      <span class="cm">/* throw an exception */</span></span>
<span id="LC384" class="line" lang="java">      <span class="k">throw</span> <span class="k">new</span> <span class="nf">Exception</span><span class="o">(</span><span class="s">"Can't recover from previous error(s)"</span><span class="o">);</span></span>
<span id="LC385" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC386" class="line" lang="java"></span>
<span id="LC387" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC388" class="line" lang="java"></span>
<span id="LC389" class="line" lang="java">  <span class="cm">/** Report a non fatal error (or warning).  This method takes a message</span></span>
<span id="LC390" class="line" lang="java"><span class="cm">   *  string and an additional object (to be used by specializations</span></span>
<span id="LC391" class="line" lang="java"><span class="cm">   *  implemented in subclasses).  Here in the base class a very simple</span></span>
<span id="LC392" class="line" lang="java"><span class="cm">   *  implementation is provided which simply prints the message to</span></span>
<span id="LC393" class="line" lang="java"><span class="cm">   *  System.err.</span></span>
<span id="LC394" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC395" class="line" lang="java"><span class="cm">   * @param message an error message.</span></span>
<span id="LC396" class="line" lang="java"><span class="cm">   * @param info    an extra object reserved for use by specialized subclasses.</span></span>
<span id="LC397" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC398" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">report_error</span><span class="o">(</span><span class="nc">String</span> <span class="n">message</span><span class="o">,</span> <span class="nc">Object</span> <span class="n">info</span><span class="o">)</span></span>
<span id="LC399" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC400" class="line" lang="java">      <span class="nc">System</span><span class="o">.</span><span class="na">err</span><span class="o">.</span><span class="na">print</span><span class="o">(</span><span class="n">message</span><span class="o">);</span></span>
<span id="LC401" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">info</span> <span class="k">instanceof</span> <span class="nc">Symbol</span><span class="o">)</span></span>
<span id="LC402" class="line" lang="java">        <span class="k">if</span> <span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">info</span><span class="o">).</span><span class="na">left</span> <span class="o">!=</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span></span>
<span id="LC403" class="line" lang="java">        <span class="nc">System</span><span class="o">.</span><span class="na">err</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">" at character "</span> <span class="o">+</span> <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">info</span><span class="o">).</span><span class="na">left</span> <span class="o">+</span></span>
<span id="LC404" class="line" lang="java">                           <span class="s">" of input"</span><span class="o">);</span></span>
<span id="LC405" class="line" lang="java">        <span class="k">else</span> <span class="nc">System</span><span class="o">.</span><span class="na">err</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">""</span><span class="o">);</span></span>
<span id="LC406" class="line" lang="java">      <span class="k">else</span> <span class="nc">System</span><span class="o">.</span><span class="na">err</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">""</span><span class="o">);</span></span>
<span id="LC407" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC408" class="line" lang="java"></span>
<span id="LC409" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC410" class="line" lang="java"></span>
<span id="LC411" class="line" lang="java">  <span class="cm">/** This method is called when a syntax error has been detected and recovery</span></span>
<span id="LC412" class="line" lang="java"><span class="cm">   *  is about to be invoked.  Here in the base class we just emit a</span></span>
<span id="LC413" class="line" lang="java"><span class="cm">   *  "Syntax error" error message.</span></span>
<span id="LC414" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC415" class="line" lang="java"><span class="cm">   * @param cur_token the current lookahead Symbol.</span></span>
<span id="LC416" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC417" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">syntax_error</span><span class="o">(</span><span class="nc">Symbol</span> <span class="n">cur_token</span><span class="o">)</span></span>
<span id="LC418" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC419" class="line" lang="java">      <span class="n">report_error</span><span class="o">(</span><span class="s">"Syntax error"</span><span class="o">,</span> <span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC420" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC421" class="line" lang="java"></span>
<span id="LC422" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC423" class="line" lang="java"></span>
<span id="LC424" class="line" lang="java">  <span class="cm">/** This method is called if it is determined that syntax error recovery</span></span>
<span id="LC425" class="line" lang="java"><span class="cm">   *  has been unsuccessful.  Here in the base class we report a fatal error.</span></span>
<span id="LC426" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC427" class="line" lang="java"><span class="cm">   * @param cur_token the current lookahead Symbol.</span></span>
<span id="LC428" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC429" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">unrecovered_syntax_error</span><span class="o">(</span><span class="nc">Symbol</span> <span class="n">cur_token</span><span class="o">)</span></span>
<span id="LC430" class="line" lang="java">    <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC431" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC432" class="line" lang="java">      <span class="n">report_fatal_error</span><span class="o">(</span><span class="s">"Couldn't repair and continue parse"</span><span class="o">,</span> <span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC433" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC434" class="line" lang="java"></span>
<span id="LC435" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC436" class="line" lang="java"></span>
<span id="LC437" class="line" lang="java">  <span class="cm">/** Fetch an action from the action table.  The table is broken up into</span></span>
<span id="LC438" class="line" lang="java"><span class="cm">   *  rows, one per state (rows are indexed directly by state number).</span></span>
<span id="LC439" class="line" lang="java"><span class="cm">   *  Within each row, a list of index, value pairs are given (as sequential</span></span>
<span id="LC440" class="line" lang="java"><span class="cm">   *  entries in the table), and the list is terminated by a default entry</span></span>
<span id="LC441" class="line" lang="java"><span class="cm">   *  (denoted with a Symbol index of -1).  To find the proper entry in a row</span></span>
<span id="LC442" class="line" lang="java"><span class="cm">   *  we do a linear or binary search (depending on the size of the row).</span></span>
<span id="LC443" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC444" class="line" lang="java"><span class="cm">   * @param state the state index of the action being accessed.</span></span>
<span id="LC445" class="line" lang="java"><span class="cm">   * @param sym   the Symbol index of the action being accessed.</span></span>
<span id="LC446" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC447" class="line" lang="java">  <span class="kd">protected</span> <span class="kd">final</span> <span class="kt">short</span> <span class="nf">get_action</span><span class="o">(</span><span class="kt">int</span> <span class="n">state</span><span class="o">,</span> <span class="kt">int</span> <span class="n">sym</span><span class="o">)</span></span>
<span id="LC448" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC449" class="line" lang="java">      <span class="kt">short</span> <span class="n">tag</span><span class="o">;</span></span>
<span id="LC450" class="line" lang="java">      <span class="kt">int</span> <span class="n">first</span><span class="o">,</span> <span class="n">last</span><span class="o">,</span> <span class="n">probe</span><span class="o">;</span></span>
<span id="LC451" class="line" lang="java">      <span class="kt">short</span><span class="o">[]</span> <span class="n">row</span> <span class="o">=</span> <span class="n">action_tab</span><span class="o">[</span><span class="n">state</span><span class="o">];</span></span>
<span id="LC452" class="line" lang="java"></span>
<span id="LC453" class="line" lang="java">      <span class="cm">/* linear search if we are &lt; 10 entries */</span></span>
<span id="LC454" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">row</span><span class="o">.</span><span class="na">length</span> <span class="o">&lt;</span> <span class="mi">20</span><span class="o">)</span></span>
<span id="LC455" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="n">probe</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">probe</span> <span class="o">&lt;</span> <span class="n">row</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">probe</span><span class="o">++)</span></span>
<span id="LC456" class="line" lang="java">          <span class="o">{</span></span>
<span id="LC457" class="line" lang="java">            <span class="cm">/* is this entry labeled with our Symbol or the default? */</span></span>
<span id="LC458" class="line" lang="java">            <span class="n">tag</span> <span class="o">=</span> <span class="n">row</span><span class="o">[</span><span class="n">probe</span><span class="o">++];</span></span>
<span id="LC459" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">tag</span> <span class="o">==</span> <span class="n">sym</span> <span class="o">||</span> <span class="n">tag</span> <span class="o">==</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span></span>
<span id="LC460" class="line" lang="java">              <span class="o">{</span></span>
<span id="LC461" class="line" lang="java">                <span class="cm">/* return the next entry */</span></span>
<span id="LC462" class="line" lang="java">                <span class="k">return</span> <span class="n">row</span><span class="o">[</span><span class="n">probe</span><span class="o">];</span></span>
<span id="LC463" class="line" lang="java">              <span class="o">}</span></span>
<span id="LC464" class="line" lang="java">          <span class="o">}</span></span>
<span id="LC465" class="line" lang="java">      <span class="cm">/* otherwise binary search */</span></span>
<span id="LC466" class="line" lang="java">      <span class="k">else</span></span>
<span id="LC467" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC468" class="line" lang="java">          <span class="n">first</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC469" class="line" lang="java">          <span class="n">last</span> <span class="o">=</span> <span class="o">(</span><span class="n">row</span><span class="o">.</span><span class="na">length</span><span class="o">-</span><span class="mi">1</span><span class="o">)/</span><span class="mi">2</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span>  <span class="cm">/* leave out trailing default entry */</span></span>
<span id="LC470" class="line" lang="java">          <span class="k">while</span> <span class="o">(</span><span class="n">first</span> <span class="o">&lt;=</span> <span class="n">last</span><span class="o">)</span></span>
<span id="LC471" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC472" class="line" lang="java">              <span class="n">probe</span> <span class="o">=</span> <span class="o">(</span><span class="n">first</span><span class="o">+</span><span class="n">last</span><span class="o">)/</span><span class="mi">2</span><span class="o">;</span></span>
<span id="LC473" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">sym</span> <span class="o">==</span> <span class="n">row</span><span class="o">[</span><span class="n">probe</span><span class="o">*</span><span class="mi">2</span><span class="o">])</span></span>
<span id="LC474" class="line" lang="java">                <span class="k">return</span> <span class="n">row</span><span class="o">[</span><span class="n">probe</span><span class="o">*</span><span class="mi">2</span><span class="o">+</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC475" class="line" lang="java">              <span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">sym</span> <span class="o">&gt;</span> <span class="n">row</span><span class="o">[</span><span class="n">probe</span><span class="o">*</span><span class="mi">2</span><span class="o">])</span></span>
<span id="LC476" class="line" lang="java">                <span class="n">first</span> <span class="o">=</span> <span class="n">probe</span><span class="o">+</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC477" class="line" lang="java">              <span class="k">else</span></span>
<span id="LC478" class="line" lang="java">                <span class="n">last</span> <span class="o">=</span> <span class="n">probe</span><span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC479" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC480" class="line" lang="java"></span>
<span id="LC481" class="line" lang="java">          <span class="cm">/* not found, use the default at the end */</span></span>
<span id="LC482" class="line" lang="java">          <span class="k">return</span> <span class="n">row</span><span class="o">[</span><span class="n">row</span><span class="o">.</span><span class="na">length</span><span class="o">-</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC483" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC484" class="line" lang="java"></span>
<span id="LC485" class="line" lang="java">      <span class="cm">/* shouldn't happened, but if we run off the end we return the</span></span>
<span id="LC486" class="line" lang="java"><span class="cm">         default (error == 0) */</span></span>
<span id="LC487" class="line" lang="java">      <span class="k">return</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC488" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC489" class="line" lang="java"></span>
<span id="LC490" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC491" class="line" lang="java"></span>
<span id="LC492" class="line" lang="java">  <span class="cm">/** Fetch a state from the reduce-goto table.  The table is broken up into</span></span>
<span id="LC493" class="line" lang="java"><span class="cm">   *  rows, one per state (rows are indexed directly by state number).</span></span>
<span id="LC494" class="line" lang="java"><span class="cm">   *  Within each row, a list of index, value pairs are given (as sequential</span></span>
<span id="LC495" class="line" lang="java"><span class="cm">   *  entries in the table), and the list is terminated by a default entry</span></span>
<span id="LC496" class="line" lang="java"><span class="cm">   *  (denoted with a Symbol index of -1).  To find the proper entry in a row</span></span>
<span id="LC497" class="line" lang="java"><span class="cm">   *  we do a linear search.</span></span>
<span id="LC498" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC499" class="line" lang="java"><span class="cm">   * @param state the state index of the entry being accessed.</span></span>
<span id="LC500" class="line" lang="java"><span class="cm">   * @param sym   the Symbol index of the entry being accessed.</span></span>
<span id="LC501" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC502" class="line" lang="java">  <span class="kd">protected</span> <span class="kd">final</span> <span class="kt">short</span> <span class="nf">get_reduce</span><span class="o">(</span><span class="kt">int</span> <span class="n">state</span><span class="o">,</span> <span class="kt">int</span> <span class="n">sym</span><span class="o">)</span></span>
<span id="LC503" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC504" class="line" lang="java">      <span class="kt">short</span> <span class="n">tag</span><span class="o">;</span></span>
<span id="LC505" class="line" lang="java">      <span class="kt">short</span><span class="o">[]</span> <span class="n">row</span> <span class="o">=</span> <span class="n">reduce_tab</span><span class="o">[</span><span class="n">state</span><span class="o">];</span></span>
<span id="LC506" class="line" lang="java"></span>
<span id="LC507" class="line" lang="java">      <span class="cm">/* if we have a null row we go with the default */</span></span>
<span id="LC508" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">row</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC509" class="line" lang="java">        <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC510" class="line" lang="java"></span>
<span id="LC511" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">probe</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">probe</span> <span class="o">&lt;</span> <span class="n">row</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">probe</span><span class="o">++)</span></span>
<span id="LC512" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC513" class="line" lang="java">          <span class="cm">/* is this entry labeled with our Symbol or the default? */</span></span>
<span id="LC514" class="line" lang="java">          <span class="n">tag</span> <span class="o">=</span> <span class="n">row</span><span class="o">[</span><span class="n">probe</span><span class="o">++];</span></span>
<span id="LC515" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">tag</span> <span class="o">==</span> <span class="n">sym</span> <span class="o">||</span> <span class="n">tag</span> <span class="o">==</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span></span>
<span id="LC516" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC517" class="line" lang="java">              <span class="cm">/* return the next entry */</span></span>
<span id="LC518" class="line" lang="java">              <span class="k">return</span> <span class="n">row</span><span class="o">[</span><span class="n">probe</span><span class="o">];</span></span>
<span id="LC519" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC520" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC521" class="line" lang="java">      <span class="cm">/* if we run off the end we return the default (error == -1) */</span></span>
<span id="LC522" class="line" lang="java">      <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC523" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC524" class="line" lang="java"></span>
<span id="LC525" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC526" class="line" lang="java"></span>
<span id="LC527" class="line" lang="java">  <span class="cm">/** This method provides the main parsing routine.  It returns only when</span></span>
<span id="LC528" class="line" lang="java"><span class="cm">   *  done_parsing() has been called (typically because the parser has</span></span>
<span id="LC529" class="line" lang="java"><span class="cm">   *  accepted, or a fatal error has been reported).  See the header</span></span>
<span id="LC530" class="line" lang="java"><span class="cm">   *  documentation for the class regarding how shift/reduce parsers operate</span></span>
<span id="LC531" class="line" lang="java"><span class="cm">   *  and how the various tables are used.</span></span>
<span id="LC532" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC533" class="line" lang="java">  <span class="kd">public</span> <span class="nc">Symbol</span> <span class="nf">parse</span><span class="o">()</span> <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC534" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC535" class="line" lang="java">      <span class="cm">/* the current action code */</span></span>
<span id="LC536" class="line" lang="java">      <span class="kt">int</span> <span class="n">act</span><span class="o">;</span></span>
<span id="LC537" class="line" lang="java"></span>
<span id="LC538" class="line" lang="java">      <span class="cm">/* the Symbol/stack element returned by a reduce */</span></span>
<span id="LC539" class="line" lang="java">      <span class="nc">Symbol</span> <span class="n">lhs_sym</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC540" class="line" lang="java"></span>
<span id="LC541" class="line" lang="java">      <span class="cm">/* information about production being reduced with */</span></span>
<span id="LC542" class="line" lang="java">      <span class="kt">short</span> <span class="n">handle_size</span><span class="o">,</span> <span class="n">lhs_sym_num</span><span class="o">;</span></span>
<span id="LC543" class="line" lang="java"></span>
<span id="LC544" class="line" lang="java">      <span class="cm">/* set up direct reference to tables to drive the parser */</span></span>
<span id="LC545" class="line" lang="java"></span>
<span id="LC546" class="line" lang="java">      <span class="n">production_tab</span> <span class="o">=</span> <span class="n">production_table</span><span class="o">();</span></span>
<span id="LC547" class="line" lang="java">      <span class="n">action_tab</span>     <span class="o">=</span> <span class="n">action_table</span><span class="o">();</span></span>
<span id="LC548" class="line" lang="java">      <span class="n">reduce_tab</span>     <span class="o">=</span> <span class="n">reduce_table</span><span class="o">();</span></span>
<span id="LC549" class="line" lang="java"></span>
<span id="LC550" class="line" lang="java">      <span class="cm">/* initialize the action encapsulation object */</span></span>
<span id="LC551" class="line" lang="java">      <span class="n">init_actions</span><span class="o">();</span></span>
<span id="LC552" class="line" lang="java"></span>
<span id="LC553" class="line" lang="java">      <span class="cm">/* do user initialization */</span></span>
<span id="LC554" class="line" lang="java">      <span class="n">user_init</span><span class="o">();</span></span>
<span id="LC555" class="line" lang="java"></span>
<span id="LC556" class="line" lang="java">      <span class="cm">/* get the first token */</span></span>
<span id="LC557" class="line" lang="java">      <span class="n">cur_token</span> <span class="o">=</span> <span class="n">scan</span><span class="o">();</span></span>
<span id="LC558" class="line" lang="java"></span>
<span id="LC559" class="line" lang="java">      <span class="cm">/* push dummy Symbol with start state to get us underway */</span></span>
<span id="LC560" class="line" lang="java">      <span class="n">stack</span><span class="o">.</span><span class="na">removeAllElements</span><span class="o">();</span></span>
<span id="LC561" class="line" lang="java">      <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="k">new</span> <span class="nc">Symbol</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">start_state</span><span class="o">()));</span></span>
<span id="LC562" class="line" lang="java">      <span class="n">tos</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC563" class="line" lang="java"></span>
<span id="LC564" class="line" lang="java">      <span class="cm">/* continue until we are told to stop */</span></span>
<span id="LC565" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="n">_done_parsing</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span> <span class="o">!</span><span class="n">_done_parsing</span><span class="o">;</span> <span class="o">)</span></span>
<span id="LC566" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC567" class="line" lang="java">          <span class="cm">/* Check current token for freshness. */</span></span>
<span id="LC568" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">cur_token</span><span class="o">.</span><span class="na">used_by_parser</span><span class="o">)</span></span>
<span id="LC569" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">Error</span><span class="o">(</span><span class="s">"Symbol recycling detected (fix your scanner)."</span><span class="o">);</span></span>
<span id="LC570" class="line" lang="java"></span>
<span id="LC571" class="line" lang="java">          <span class="cm">/* current state is always on the top of the stack */</span></span>
<span id="LC572" class="line" lang="java"></span>
<span id="LC573" class="line" lang="java">          <span class="cm">/* look up action out of the current state with the current input */</span></span>
<span id="LC574" class="line" lang="java">          <span class="n">act</span> <span class="o">=</span> <span class="n">get_action</span><span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">,</span> <span class="n">cur_token</span><span class="o">.</span><span class="na">sym</span><span class="o">);</span></span>
<span id="LC575" class="line" lang="java"></span>
<span id="LC576" class="line" lang="java">          <span class="cm">/* decode the action -- &gt; 0 encodes shift */</span></span>
<span id="LC577" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC578" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC579" class="line" lang="java">              <span class="cm">/* shift to the encoded state by pushing it on the stack */</span></span>
<span id="LC580" class="line" lang="java">              <span class="n">cur_token</span><span class="o">.</span><span class="na">parse_state</span> <span class="o">=</span> <span class="n">act</span><span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC581" class="line" lang="java">              <span class="n">cur_token</span><span class="o">.</span><span class="na">used_by_parser</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC582" class="line" lang="java">              <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC583" class="line" lang="java">              <span class="n">tos</span><span class="o">++;</span></span>
<span id="LC584" class="line" lang="java"></span>
<span id="LC585" class="line" lang="java">              <span class="cm">/* advance to the next Symbol */</span></span>
<span id="LC586" class="line" lang="java">              <span class="n">cur_token</span> <span class="o">=</span> <span class="n">scan</span><span class="o">();</span></span>
<span id="LC587" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC588" class="line" lang="java">          <span class="cm">/* if its less than zero, then it encodes a reduce action */</span></span>
<span id="LC589" class="line" lang="java">          <span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC590" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC591" class="line" lang="java">              <span class="cm">/* perform the action for the reduce */</span></span>
<span id="LC592" class="line" lang="java">              <span class="n">lhs_sym</span> <span class="o">=</span> <span class="n">do_action</span><span class="o">((-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">,</span> <span class="k">this</span><span class="o">,</span> <span class="n">stack</span><span class="o">,</span> <span class="n">tos</span><span class="o">);</span></span>
<span id="LC593" class="line" lang="java"></span>
<span id="LC594" class="line" lang="java">              <span class="cm">/* look up information about the production */</span></span>
<span id="LC595" class="line" lang="java">              <span class="n">lhs_sym_num</span> <span class="o">=</span> <span class="n">production_tab</span><span class="o">[(-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">][</span><span class="mi">0</span><span class="o">];</span></span>
<span id="LC596" class="line" lang="java">              <span class="n">handle_size</span> <span class="o">=</span> <span class="n">production_tab</span><span class="o">[(-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">][</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC597" class="line" lang="java"></span>
<span id="LC598" class="line" lang="java">              <span class="cm">/* pop the handle off the stack */</span></span>
<span id="LC599" class="line" lang="java">              <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">handle_size</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC600" class="line" lang="java">                <span class="o">{</span></span>
<span id="LC601" class="line" lang="java">                  <span class="n">stack</span><span class="o">.</span><span class="na">pop</span><span class="o">();</span></span>
<span id="LC602" class="line" lang="java">                  <span class="n">tos</span><span class="o">--;</span></span>
<span id="LC603" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC604" class="line" lang="java"></span>
<span id="LC605" class="line" lang="java">              <span class="cm">/* look up the state to go to from the one popped back to */</span></span>
<span id="LC606" class="line" lang="java">              <span class="n">act</span> <span class="o">=</span> <span class="n">get_reduce</span><span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">,</span> <span class="n">lhs_sym_num</span><span class="o">);</span></span>
<span id="LC607" class="line" lang="java"></span>
<span id="LC608" class="line" lang="java">              <span class="cm">/* shift to that state */</span></span>
<span id="LC609" class="line" lang="java">              <span class="n">lhs_sym</span><span class="o">.</span><span class="na">parse_state</span> <span class="o">=</span> <span class="n">act</span><span class="o">;</span></span>
<span id="LC610" class="line" lang="java">              <span class="n">lhs_sym</span><span class="o">.</span><span class="na">used_by_parser</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC611" class="line" lang="java">              <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">lhs_sym</span><span class="o">);</span></span>
<span id="LC612" class="line" lang="java">              <span class="n">tos</span><span class="o">++;</span></span>
<span id="LC613" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC614" class="line" lang="java">          <span class="cm">/* finally if the entry is zero, we have an error */</span></span>
<span id="LC615" class="line" lang="java">          <span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC616" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC617" class="line" lang="java">              <span class="cm">/* call user syntax error reporting routine */</span></span>
<span id="LC618" class="line" lang="java">              <span class="n">syntax_error</span><span class="o">(</span><span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC619" class="line" lang="java"></span>
<span id="LC620" class="line" lang="java">              <span class="cm">/* try to error recover */</span></span>
<span id="LC621" class="line" lang="java">              <span class="k">if</span> <span class="o">(!</span><span class="n">error_recovery</span><span class="o">(</span><span class="kc">false</span><span class="o">))</span></span>
<span id="LC622" class="line" lang="java">                <span class="o">{</span></span>
<span id="LC623" class="line" lang="java">                  <span class="cm">/* if that fails give up with a fatal syntax error */</span></span>
<span id="LC624" class="line" lang="java">                  <span class="n">unrecovered_syntax_error</span><span class="o">(</span><span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC625" class="line" lang="java"></span>
<span id="LC626" class="line" lang="java">                  <span class="cm">/* just in case that wasn't fatal enough, end parse */</span></span>
<span id="LC627" class="line" lang="java">                  <span class="n">done_parsing</span><span class="o">();</span></span>
<span id="LC628" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC629" class="line" lang="java">                  <span class="n">lhs_sym</span> <span class="o">=</span> <span class="o">(</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">();</span></span>
<span id="LC630" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC631" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC632" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC633" class="line" lang="java">      <span class="k">return</span> <span class="n">lhs_sym</span><span class="o">;</span></span>
<span id="LC634" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC635" class="line" lang="java"></span>
<span id="LC636" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC637" class="line" lang="java"></span>
<span id="LC638" class="line" lang="java">  <span class="cm">/** Write a debugging message to System.err for the debugging version</span></span>
<span id="LC639" class="line" lang="java"><span class="cm">   *  of the parser.</span></span>
<span id="LC640" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC641" class="line" lang="java"><span class="cm">   * @param mess the text of the debugging message.</span></span>
<span id="LC642" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC643" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">debug_message</span><span class="o">(</span><span class="nc">String</span> <span class="n">mess</span><span class="o">)</span></span>
<span id="LC644" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC645" class="line" lang="java">      <span class="nc">System</span><span class="o">.</span><span class="na">err</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">mess</span><span class="o">);</span></span>
<span id="LC646" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC647" class="line" lang="java"></span>
<span id="LC648" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC649" class="line" lang="java"></span>
<span id="LC650" class="line" lang="java">  <span class="cm">/** Dump the parse stack for debugging purposes. */</span></span>
<span id="LC651" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">dump_stack</span><span class="o">()</span></span>
<span id="LC652" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC653" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">stack</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC654" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC655" class="line" lang="java">          <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Stack dump requested, but stack is null"</span><span class="o">);</span></span>
<span id="LC656" class="line" lang="java">          <span class="k">return</span><span class="o">;</span></span>
<span id="LC657" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC658" class="line" lang="java"></span>
<span id="LC659" class="line" lang="java">      <span class="n">debug_message</span><span class="o">(</span><span class="s">"============ Parse Stack Dump ============"</span><span class="o">);</span></span>
<span id="LC660" class="line" lang="java"></span>
<span id="LC661" class="line" lang="java">      <span class="cm">/* dump the stack */</span></span>
<span id="LC662" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span><span class="o">&lt;</span><span class="n">stack</span><span class="o">.</span><span class="na">size</span><span class="o">();</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC663" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC664" class="line" lang="java">          <span class="n">debug_message</span><span class="o">(</span><span class="s">"Symbol: "</span> <span class="o">+</span> <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">elementAt</span><span class="o">(</span><span class="n">i</span><span class="o">)).</span><span class="na">sym</span> <span class="o">+</span></span>
<span id="LC665" class="line" lang="java">                        <span class="s">" State: "</span> <span class="o">+</span> <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">elementAt</span><span class="o">(</span><span class="n">i</span><span class="o">)).</span><span class="na">parse_state</span><span class="o">);</span></span>
<span id="LC666" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC667" class="line" lang="java">      <span class="n">debug_message</span><span class="o">(</span><span class="s">"=========================================="</span><span class="o">);</span></span>
<span id="LC668" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC669" class="line" lang="java"></span>
<span id="LC670" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC671" class="line" lang="java"></span>
<span id="LC672" class="line" lang="java">  <span class="cm">/** Do debug output for a reduce.</span></span>
<span id="LC673" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC674" class="line" lang="java"><span class="cm">   * @param prod_num  the production we are reducing with.</span></span>
<span id="LC675" class="line" lang="java"><span class="cm">   * @param nt_num    the index of the LHS non terminal.</span></span>
<span id="LC676" class="line" lang="java"><span class="cm">   * @param rhs_size  the size of the RHS.</span></span>
<span id="LC677" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC678" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">debug_reduce</span><span class="o">(</span><span class="kt">int</span> <span class="n">prod_num</span><span class="o">,</span> <span class="kt">int</span> <span class="n">nt_num</span><span class="o">,</span> <span class="kt">int</span> <span class="n">rhs_size</span><span class="o">)</span></span>
<span id="LC679" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC680" class="line" lang="java">      <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Reduce with prod #"</span> <span class="o">+</span> <span class="n">prod_num</span> <span class="o">+</span> <span class="s">" [NT="</span> <span class="o">+</span> <span class="n">nt_num</span> <span class="o">+</span></span>
<span id="LC681" class="line" lang="java">                    <span class="s">", "</span> <span class="o">+</span> <span class="s">"SZ="</span> <span class="o">+</span> <span class="n">rhs_size</span> <span class="o">+</span> <span class="s">"]"</span><span class="o">);</span></span>
<span id="LC682" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC683" class="line" lang="java"></span>
<span id="LC684" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC685" class="line" lang="java"></span>
<span id="LC686" class="line" lang="java">  <span class="cm">/** Do debug output for shift.</span></span>
<span id="LC687" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC688" class="line" lang="java"><span class="cm">   * @param shift_tkn the Symbol being shifted onto the stack.</span></span>
<span id="LC689" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC690" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">debug_shift</span><span class="o">(</span><span class="nc">Symbol</span> <span class="n">shift_tkn</span><span class="o">)</span></span>
<span id="LC691" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC692" class="line" lang="java">      <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Shift under term #"</span> <span class="o">+</span> <span class="n">shift_tkn</span><span class="o">.</span><span class="na">sym</span> <span class="o">+</span></span>
<span id="LC693" class="line" lang="java">                    <span class="s">" to state #"</span> <span class="o">+</span> <span class="n">shift_tkn</span><span class="o">.</span><span class="na">parse_state</span><span class="o">);</span></span>
<span id="LC694" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC695" class="line" lang="java"></span>
<span id="LC696" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC697" class="line" lang="java"></span>
<span id="LC698" class="line" lang="java">  <span class="cm">/** Do debug output for stack state. [CSA]</span></span>
<span id="LC699" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC700" class="line" lang="java">  <span class="kd">public</span> <span class="kt">void</span> <span class="nf">debug_stack</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC701" class="line" lang="java">      <span class="nc">StringBuffer</span> <span class="n">sb</span><span class="o">=</span><span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">(</span><span class="s">"## STACK:"</span><span class="o">);</span></span>
<span id="LC702" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span><span class="o">&lt;</span><span class="n">stack</span><span class="o">.</span><span class="na">size</span><span class="o">();</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC703" class="line" lang="java">          <span class="nc">Symbol</span> <span class="n">s</span> <span class="o">=</span> <span class="o">(</span><span class="nc">Symbol</span><span class="o">)</span> <span class="n">stack</span><span class="o">.</span><span class="na">elementAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC704" class="line" lang="java">          <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">" &lt;state "</span><span class="o">+</span><span class="n">s</span><span class="o">.</span><span class="na">parse_state</span><span class="o">+</span><span class="s">", sym "</span><span class="o">+</span><span class="n">s</span><span class="o">.</span><span class="na">sym</span><span class="o">+</span><span class="s">"&gt;"</span><span class="o">);</span></span>
<span id="LC705" class="line" lang="java">          <span class="k">if</span> <span class="o">((</span><span class="n">i</span><span class="o">%</span><span class="mi">3</span><span class="o">)==</span><span class="mi">2</span> <span class="o">||</span> <span class="o">(</span><span class="n">i</span><span class="o">==(</span><span class="n">stack</span><span class="o">.</span><span class="na">size</span><span class="o">()-</span><span class="mi">1</span><span class="o">)))</span> <span class="o">{</span></span>
<span id="LC706" class="line" lang="java">              <span class="n">debug_message</span><span class="o">(</span><span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">());</span></span>
<span id="LC707" class="line" lang="java">              <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">(</span><span class="s">"         "</span><span class="o">);</span></span>
<span id="LC708" class="line" lang="java">          <span class="o">}</span></span>
<span id="LC709" class="line" lang="java">      <span class="o">}</span></span>
<span id="LC710" class="line" lang="java">  <span class="o">}</span></span>
<span id="LC711" class="line" lang="java"></span>
<span id="LC712" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC713" class="line" lang="java"></span>
<span id="LC714" class="line" lang="java">  <span class="cm">/** Perform a parse with debugging output.  This does exactly the</span></span>
<span id="LC715" class="line" lang="java"><span class="cm">   *  same things as parse(), except that it calls debug_shift() and</span></span>
<span id="LC716" class="line" lang="java"><span class="cm">   *  debug_reduce() when shift and reduce moves are taken by the parser</span></span>
<span id="LC717" class="line" lang="java"><span class="cm">   *  and produces various other debugging messages.</span></span>
<span id="LC718" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC719" class="line" lang="java">  <span class="kd">public</span> <span class="nc">Symbol</span> <span class="nf">debug_parse</span><span class="o">()</span></span>
<span id="LC720" class="line" lang="java">    <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC721" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC722" class="line" lang="java">      <span class="cm">/* the current action code */</span></span>
<span id="LC723" class="line" lang="java">      <span class="kt">int</span> <span class="n">act</span><span class="o">;</span></span>
<span id="LC724" class="line" lang="java"></span>
<span id="LC725" class="line" lang="java">      <span class="cm">/* the Symbol/stack element returned by a reduce */</span></span>
<span id="LC726" class="line" lang="java">      <span class="nc">Symbol</span> <span class="n">lhs_sym</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC727" class="line" lang="java"></span>
<span id="LC728" class="line" lang="java">      <span class="cm">/* information about production being reduced with */</span></span>
<span id="LC729" class="line" lang="java">      <span class="kt">short</span> <span class="n">handle_size</span><span class="o">,</span> <span class="n">lhs_sym_num</span><span class="o">;</span></span>
<span id="LC730" class="line" lang="java"></span>
<span id="LC731" class="line" lang="java">      <span class="cm">/* set up direct reference to tables to drive the parser */</span></span>
<span id="LC732" class="line" lang="java">      <span class="n">production_tab</span> <span class="o">=</span> <span class="n">production_table</span><span class="o">();</span></span>
<span id="LC733" class="line" lang="java">      <span class="n">action_tab</span>     <span class="o">=</span> <span class="n">action_table</span><span class="o">();</span></span>
<span id="LC734" class="line" lang="java">      <span class="n">reduce_tab</span>     <span class="o">=</span> <span class="n">reduce_table</span><span class="o">();</span></span>
<span id="LC735" class="line" lang="java"></span>
<span id="LC736" class="line" lang="java">      <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Initializing parser"</span><span class="o">);</span></span>
<span id="LC737" class="line" lang="java"></span>
<span id="LC738" class="line" lang="java">      <span class="cm">/* initialize the action encapsulation object */</span></span>
<span id="LC739" class="line" lang="java">      <span class="n">init_actions</span><span class="o">();</span></span>
<span id="LC740" class="line" lang="java"></span>
<span id="LC741" class="line" lang="java">      <span class="cm">/* do user initialization */</span></span>
<span id="LC742" class="line" lang="java">      <span class="n">user_init</span><span class="o">();</span></span>
<span id="LC743" class="line" lang="java"></span>
<span id="LC744" class="line" lang="java">      <span class="cm">/* the current Symbol */</span></span>
<span id="LC745" class="line" lang="java">      <span class="n">cur_token</span> <span class="o">=</span> <span class="n">scan</span><span class="o">();</span></span>
<span id="LC746" class="line" lang="java"></span>
<span id="LC747" class="line" lang="java">      <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Current Symbol is #"</span> <span class="o">+</span> <span class="n">cur_token</span><span class="o">.</span><span class="na">sym</span><span class="o">);</span></span>
<span id="LC748" class="line" lang="java"></span>
<span id="LC749" class="line" lang="java">      <span class="cm">/* push dummy Symbol with start state to get us underway */</span></span>
<span id="LC750" class="line" lang="java">      <span class="n">stack</span><span class="o">.</span><span class="na">removeAllElements</span><span class="o">();</span></span>
<span id="LC751" class="line" lang="java">      <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="k">new</span> <span class="nc">Symbol</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">start_state</span><span class="o">()));</span></span>
<span id="LC752" class="line" lang="java">      <span class="n">tos</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC753" class="line" lang="java"></span>
<span id="LC754" class="line" lang="java">      <span class="cm">/* continue until we are told to stop */</span></span>
<span id="LC755" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="n">_done_parsing</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span> <span class="o">!</span><span class="n">_done_parsing</span><span class="o">;</span> <span class="o">)</span></span>
<span id="LC756" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC757" class="line" lang="java">          <span class="cm">/* Check current token for freshness. */</span></span>
<span id="LC758" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">cur_token</span><span class="o">.</span><span class="na">used_by_parser</span><span class="o">)</span></span>
<span id="LC759" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">Error</span><span class="o">(</span><span class="s">"Symbol recycling detected (fix your scanner)."</span><span class="o">);</span></span>
<span id="LC760" class="line" lang="java"></span>
<span id="LC761" class="line" lang="java">          <span class="cm">/* current state is always on the top of the stack */</span></span>
<span id="LC762" class="line" lang="java">          <span class="c1">//debug_stack();</span></span>
<span id="LC763" class="line" lang="java"></span>
<span id="LC764" class="line" lang="java">          <span class="cm">/* look up action out of the current state with the current input */</span></span>
<span id="LC765" class="line" lang="java">          <span class="n">act</span> <span class="o">=</span> <span class="n">get_action</span><span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">,</span> <span class="n">cur_token</span><span class="o">.</span><span class="na">sym</span><span class="o">);</span></span>
<span id="LC766" class="line" lang="java"></span>
<span id="LC767" class="line" lang="java">          <span class="cm">/* decode the action -- &gt; 0 encodes shift */</span></span>
<span id="LC768" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC769" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC770" class="line" lang="java">              <span class="cm">/* shift to the encoded state by pushing it on the stack */</span></span>
<span id="LC771" class="line" lang="java">              <span class="n">cur_token</span><span class="o">.</span><span class="na">parse_state</span> <span class="o">=</span> <span class="n">act</span><span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC772" class="line" lang="java">              <span class="n">cur_token</span><span class="o">.</span><span class="na">used_by_parser</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC773" class="line" lang="java">              <span class="n">debug_shift</span><span class="o">(</span><span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC774" class="line" lang="java">              <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC775" class="line" lang="java">              <span class="n">tos</span><span class="o">++;</span></span>
<span id="LC776" class="line" lang="java"></span>
<span id="LC777" class="line" lang="java">              <span class="cm">/* advance to the next Symbol */</span></span>
<span id="LC778" class="line" lang="java">              <span class="n">cur_token</span> <span class="o">=</span> <span class="n">scan</span><span class="o">();</span></span>
<span id="LC779" class="line" lang="java">              <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Current token is "</span> <span class="o">+</span> <span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC780" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC781" class="line" lang="java">          <span class="cm">/* if its less than zero, then it encodes a reduce action */</span></span>
<span id="LC782" class="line" lang="java">          <span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC783" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC784" class="line" lang="java">              <span class="cm">/* perform the action for the reduce */</span></span>
<span id="LC785" class="line" lang="java">              <span class="n">lhs_sym</span> <span class="o">=</span> <span class="n">do_action</span><span class="o">((-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">,</span> <span class="k">this</span><span class="o">,</span> <span class="n">stack</span><span class="o">,</span> <span class="n">tos</span><span class="o">);</span></span>
<span id="LC786" class="line" lang="java"></span>
<span id="LC787" class="line" lang="java">              <span class="cm">/* look up information about the production */</span></span>
<span id="LC788" class="line" lang="java">              <span class="n">lhs_sym_num</span> <span class="o">=</span> <span class="n">production_tab</span><span class="o">[(-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">][</span><span class="mi">0</span><span class="o">];</span></span>
<span id="LC789" class="line" lang="java">              <span class="n">handle_size</span> <span class="o">=</span> <span class="n">production_tab</span><span class="o">[(-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">][</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC790" class="line" lang="java"></span>
<span id="LC791" class="line" lang="java">              <span class="n">debug_reduce</span><span class="o">((-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">,</span> <span class="n">lhs_sym_num</span><span class="o">,</span> <span class="n">handle_size</span><span class="o">);</span></span>
<span id="LC792" class="line" lang="java"></span>
<span id="LC793" class="line" lang="java">              <span class="cm">/* pop the handle off the stack */</span></span>
<span id="LC794" class="line" lang="java">              <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">handle_size</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC795" class="line" lang="java">                <span class="o">{</span></span>
<span id="LC796" class="line" lang="java">                  <span class="n">stack</span><span class="o">.</span><span class="na">pop</span><span class="o">();</span></span>
<span id="LC797" class="line" lang="java">                  <span class="n">tos</span><span class="o">--;</span></span>
<span id="LC798" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC799" class="line" lang="java"></span>
<span id="LC800" class="line" lang="java">              <span class="cm">/* look up the state to go to from the one popped back to */</span></span>
<span id="LC801" class="line" lang="java">              <span class="n">act</span> <span class="o">=</span> <span class="n">get_reduce</span><span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">,</span> <span class="n">lhs_sym_num</span><span class="o">);</span></span>
<span id="LC802" class="line" lang="java">              <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Reduce rule: top state "</span> <span class="o">+</span></span>
<span id="LC803" class="line" lang="java">                             <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span> <span class="o">+</span></span>
<span id="LC804" class="line" lang="java">                             <span class="s">", lhs sym "</span> <span class="o">+</span> <span class="n">lhs_sym_num</span> <span class="o">+</span> <span class="s">" -&gt; state "</span> <span class="o">+</span> <span class="n">act</span><span class="o">);</span></span>
<span id="LC805" class="line" lang="java"></span>
<span id="LC806" class="line" lang="java">              <span class="cm">/* shift to that state */</span></span>
<span id="LC807" class="line" lang="java">              <span class="n">lhs_sym</span><span class="o">.</span><span class="na">parse_state</span> <span class="o">=</span> <span class="n">act</span><span class="o">;</span></span>
<span id="LC808" class="line" lang="java">              <span class="n">lhs_sym</span><span class="o">.</span><span class="na">used_by_parser</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC809" class="line" lang="java">              <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">lhs_sym</span><span class="o">);</span></span>
<span id="LC810" class="line" lang="java">              <span class="n">tos</span><span class="o">++;</span></span>
<span id="LC811" class="line" lang="java"></span>
<span id="LC812" class="line" lang="java">              <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Goto state #"</span> <span class="o">+</span> <span class="n">act</span><span class="o">);</span></span>
<span id="LC813" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC814" class="line" lang="java">          <span class="cm">/* finally if the entry is zero, we have an error */</span></span>
<span id="LC815" class="line" lang="java">          <span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC816" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC817" class="line" lang="java">              <span class="cm">/* call user syntax error reporting routine */</span></span>
<span id="LC818" class="line" lang="java">              <span class="n">syntax_error</span><span class="o">(</span><span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC819" class="line" lang="java"></span>
<span id="LC820" class="line" lang="java">              <span class="cm">/* try to error recover */</span></span>
<span id="LC821" class="line" lang="java">              <span class="k">if</span> <span class="o">(!</span><span class="n">error_recovery</span><span class="o">(</span><span class="kc">true</span><span class="o">))</span></span>
<span id="LC822" class="line" lang="java">                <span class="o">{</span></span>
<span id="LC823" class="line" lang="java">                  <span class="cm">/* if that fails give up with a fatal syntax error */</span></span>
<span id="LC824" class="line" lang="java">                  <span class="n">unrecovered_syntax_error</span><span class="o">(</span><span class="n">cur_token</span><span class="o">);</span></span>
<span id="LC825" class="line" lang="java"></span>
<span id="LC826" class="line" lang="java">                  <span class="cm">/* just in case that wasn't fatal enough, end parse */</span></span>
<span id="LC827" class="line" lang="java">                  <span class="n">done_parsing</span><span class="o">();</span></span>
<span id="LC828" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC829" class="line" lang="java">                  <span class="n">lhs_sym</span> <span class="o">=</span> <span class="o">(</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">();</span></span>
<span id="LC830" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC831" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC832" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC833" class="line" lang="java">      <span class="k">return</span> <span class="n">lhs_sym</span><span class="o">;</span></span>
<span id="LC834" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC835" class="line" lang="java"></span>
<span id="LC836" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC837" class="line" lang="java">  <span class="cm">/* Error recovery code */</span></span>
<span id="LC838" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC839" class="line" lang="java"></span>
<span id="LC840" class="line" lang="java">  <span class="cm">/** Attempt to recover from a syntax error.  This returns false if recovery</span></span>
<span id="LC841" class="line" lang="java"><span class="cm">   *  fails, true if it succeeds.  Recovery happens in 4 steps.  First we</span></span>
<span id="LC842" class="line" lang="java"><span class="cm">   *  pop the parse stack down to a point at which we have a shift out</span></span>
<span id="LC843" class="line" lang="java"><span class="cm">   *  of the top-most state on the error Symbol.  This represents the</span></span>
<span id="LC844" class="line" lang="java"><span class="cm">   *  initial error recovery configuration.  If no such configuration is</span></span>
<span id="LC845" class="line" lang="java"><span class="cm">   *  found, then we fail.  Next a small number of "lookahead" or "parse</span></span>
<span id="LC846" class="line" lang="java"><span class="cm">   *  ahead" Symbols are read into a buffer.  The size of this buffer is</span></span>
<span id="LC847" class="line" lang="java"><span class="cm">   *  determined by error_sync_size() and determines how many Symbols beyond</span></span>
<span id="LC848" class="line" lang="java"><span class="cm">   *  the error must be matched to consider the recovery a success.  Next,</span></span>
<span id="LC849" class="line" lang="java"><span class="cm">   *  we begin to discard Symbols in attempt to get past the point of error</span></span>
<span id="LC850" class="line" lang="java"><span class="cm">   *  to a point where we can continue parsing.  After each Symbol, we attempt</span></span>
<span id="LC851" class="line" lang="java"><span class="cm">   *  to "parse ahead" though the buffered lookahead Symbols.  The "parse ahead"</span></span>
<span id="LC852" class="line" lang="java"><span class="cm">   *  process simulates that actual parse, but does not modify the real</span></span>
<span id="LC853" class="line" lang="java"><span class="cm">   *  parser's configuration, nor execute any actions. If we can  parse all</span></span>
<span id="LC854" class="line" lang="java"><span class="cm">   *  the stored Symbols without error, then the recovery is considered a</span></span>
<span id="LC855" class="line" lang="java"><span class="cm">   *  success.  Once a successful recovery point is determined, we do an</span></span>
<span id="LC856" class="line" lang="java"><span class="cm">   *  actual parse over the stored input -- modifying the real parse</span></span>
<span id="LC857" class="line" lang="java"><span class="cm">   *  configuration and executing all actions.  Finally, we return the the</span></span>
<span id="LC858" class="line" lang="java"><span class="cm">   *  normal parser to continue with the overall parse.</span></span>
<span id="LC859" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC860" class="line" lang="java"><span class="cm">   * @param debug should we produce debugging messages as we parse.</span></span>
<span id="LC861" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC862" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">boolean</span> <span class="nf">error_recovery</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">debug</span><span class="o">)</span></span>
<span id="LC863" class="line" lang="java">    <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC864" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC865" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Attempting error recovery"</span><span class="o">);</span></span>
<span id="LC866" class="line" lang="java"></span>
<span id="LC867" class="line" lang="java">      <span class="cm">/* first pop the stack back into a state that can shift on error and</span></span>
<span id="LC868" class="line" lang="java"><span class="cm">         do that shift (if that fails, we fail) */</span></span>
<span id="LC869" class="line" lang="java">      <span class="k">if</span> <span class="o">(!</span><span class="n">find_recovery_config</span><span class="o">(</span><span class="n">debug</span><span class="o">))</span></span>
<span id="LC870" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC871" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Error recovery fails"</span><span class="o">);</span></span>
<span id="LC872" class="line" lang="java">          <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC873" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC874" class="line" lang="java"></span>
<span id="LC875" class="line" lang="java">      <span class="cm">/* read ahead to create lookahead we can parse multiple times */</span></span>
<span id="LC876" class="line" lang="java">      <span class="n">read_lookahead</span><span class="o">();</span></span>
<span id="LC877" class="line" lang="java"></span>
<span id="LC878" class="line" lang="java">      <span class="cm">/* repeatedly try to parse forward until we make it the required dist */</span></span>
<span id="LC879" class="line" lang="java">      <span class="k">for</span> <span class="o">(;;)</span></span>
<span id="LC880" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC881" class="line" lang="java">          <span class="cm">/* try to parse forward, if it makes it, bail out of loop */</span></span>
<span id="LC882" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Trying to parse ahead"</span><span class="o">);</span></span>
<span id="LC883" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">try_parse_ahead</span><span class="o">(</span><span class="n">debug</span><span class="o">))</span></span>
<span id="LC884" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC885" class="line" lang="java">              <span class="k">break</span><span class="o">;</span></span>
<span id="LC886" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC887" class="line" lang="java"></span>
<span id="LC888" class="line" lang="java">          <span class="cm">/* if we are now at EOF, we have failed */</span></span>
<span id="LC889" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">lookahead</span><span class="o">[</span><span class="mi">0</span><span class="o">].</span><span class="na">sym</span> <span class="o">==</span> <span class="n">EOF_sym</span><span class="o">())</span></span>
<span id="LC890" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC891" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Error recovery fails at EOF"</span><span class="o">);</span></span>
<span id="LC892" class="line" lang="java">              <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC893" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC894" class="line" lang="java"></span>
<span id="LC895" class="line" lang="java">          <span class="cm">/* otherwise, we consume another Symbol and try again */</span></span>
<span id="LC896" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span></span>
<span id="LC897" class="line" lang="java">          <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Consuming Symbol #"</span> <span class="o">+</span> <span class="n">cur_err_token</span><span class="o">().</span><span class="na">sym</span><span class="o">);</span></span>
<span id="LC898" class="line" lang="java">          <span class="n">restart_lookahead</span><span class="o">();</span></span>
<span id="LC899" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC900" class="line" lang="java"></span>
<span id="LC901" class="line" lang="java">      <span class="cm">/* we have consumed to a point where we can parse forward */</span></span>
<span id="LC902" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Parse-ahead ok, going back to normal parse"</span><span class="o">);</span></span>
<span id="LC903" class="line" lang="java"></span>
<span id="LC904" class="line" lang="java">      <span class="cm">/* do the real parse (including actions) across the lookahead */</span></span>
<span id="LC905" class="line" lang="java">      <span class="n">parse_lookahead</span><span class="o">(</span><span class="n">debug</span><span class="o">);</span></span>
<span id="LC906" class="line" lang="java"></span>
<span id="LC907" class="line" lang="java">      <span class="cm">/* we have success */</span></span>
<span id="LC908" class="line" lang="java">      <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC909" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC910" class="line" lang="java"></span>
<span id="LC911" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC912" class="line" lang="java"></span>
<span id="LC913" class="line" lang="java">  <span class="cm">/** Determine if we can shift under the special error Symbol out of the</span></span>
<span id="LC914" class="line" lang="java"><span class="cm">   *  state currently on the top of the (real) parse stack.</span></span>
<span id="LC915" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC916" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">boolean</span> <span class="nf">shift_under_error</span><span class="o">()</span></span>
<span id="LC917" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC918" class="line" lang="java">      <span class="cm">/* is there a shift under error Symbol */</span></span>
<span id="LC919" class="line" lang="java">      <span class="k">return</span> <span class="nf">get_action</span><span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">,</span> <span class="n">error_sym</span><span class="o">())</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC920" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC921" class="line" lang="java"></span>
<span id="LC922" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC923" class="line" lang="java"></span>
<span id="LC924" class="line" lang="java">  <span class="cm">/** Put the (real) parse stack into error recovery configuration by</span></span>
<span id="LC925" class="line" lang="java"><span class="cm">   *  popping the stack down to a state that can shift on the special</span></span>
<span id="LC926" class="line" lang="java"><span class="cm">   *  error Symbol, then doing the shift.  If no suitable state exists on</span></span>
<span id="LC927" class="line" lang="java"><span class="cm">   *  the stack we return false</span></span>
<span id="LC928" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC929" class="line" lang="java"><span class="cm">   * @param debug should we produce debugging messages as we parse.</span></span>
<span id="LC930" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC931" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">boolean</span> <span class="nf">find_recovery_config</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">debug</span><span class="o">)</span></span>
<span id="LC932" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC933" class="line" lang="java">      <span class="nc">Symbol</span> <span class="n">error_token</span><span class="o">;</span></span>
<span id="LC934" class="line" lang="java">      <span class="kt">int</span> <span class="n">act</span><span class="o">;</span></span>
<span id="LC935" class="line" lang="java"></span>
<span id="LC936" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Finding recovery state on stack"</span><span class="o">);</span></span>
<span id="LC937" class="line" lang="java"></span>
<span id="LC938" class="line" lang="java">      <span class="cm">/* Remember the right-position of the top symbol on the stack */</span></span>
<span id="LC939" class="line" lang="java">      <span class="kt">int</span> <span class="n">right_pos</span> <span class="o">=</span> <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">right</span><span class="o">;</span></span>
<span id="LC940" class="line" lang="java">      <span class="kt">int</span> <span class="n">left_pos</span>  <span class="o">=</span> <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">left</span><span class="o">;</span></span>
<span id="LC941" class="line" lang="java"></span>
<span id="LC942" class="line" lang="java">      <span class="cm">/* pop down until we can shift under error Symbol */</span></span>
<span id="LC943" class="line" lang="java">      <span class="k">while</span> <span class="o">(!</span><span class="n">shift_under_error</span><span class="o">())</span></span>
<span id="LC944" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC945" class="line" lang="java">          <span class="cm">/* pop the stack */</span></span>
<span id="LC946" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span></span>
<span id="LC947" class="line" lang="java">            <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Pop stack by one, state was # "</span> <span class="o">+</span></span>
<span id="LC948" class="line" lang="java">                          <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">);</span></span>
<span id="LC949" class="line" lang="java">          <span class="n">left_pos</span> <span class="o">=</span> <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">pop</span><span class="o">()).</span><span class="na">left</span><span class="o">;</span></span>
<span id="LC950" class="line" lang="java">          <span class="n">tos</span><span class="o">--;</span></span>
<span id="LC951" class="line" lang="java"></span>
<span id="LC952" class="line" lang="java">          <span class="cm">/* if we have hit bottom, we fail */</span></span>
<span id="LC953" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">stack</span><span class="o">.</span><span class="na">empty</span><span class="o">())</span></span>
<span id="LC954" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC955" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# No recovery state found on stack"</span><span class="o">);</span></span>
<span id="LC956" class="line" lang="java">              <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC957" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC958" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC959" class="line" lang="java"></span>
<span id="LC960" class="line" lang="java">      <span class="cm">/* state on top of the stack can shift under error, find the shift */</span></span>
<span id="LC961" class="line" lang="java">      <span class="n">act</span> <span class="o">=</span> <span class="n">get_action</span><span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">,</span> <span class="n">error_sym</span><span class="o">());</span></span>
<span id="LC962" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span></span>
<span id="LC963" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC964" class="line" lang="java">          <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Recover state found (#"</span> <span class="o">+</span></span>
<span id="LC965" class="line" lang="java">                        <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span> <span class="o">+</span> <span class="s">")"</span><span class="o">);</span></span>
<span id="LC966" class="line" lang="java">          <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Shifting on error to state #"</span> <span class="o">+</span> <span class="o">(</span><span class="n">act</span><span class="o">-</span><span class="mi">1</span><span class="o">));</span></span>
<span id="LC967" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC968" class="line" lang="java"></span>
<span id="LC969" class="line" lang="java">      <span class="cm">/* build and shift a special error Symbol */</span></span>
<span id="LC970" class="line" lang="java">      <span class="n">error_token</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Symbol</span><span class="o">(</span><span class="n">error_sym</span><span class="o">(),</span> <span class="n">left_pos</span><span class="o">,</span> <span class="n">right_pos</span><span class="o">);</span></span>
<span id="LC971" class="line" lang="java">      <span class="n">error_token</span><span class="o">.</span><span class="na">parse_state</span> <span class="o">=</span> <span class="n">act</span><span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC972" class="line" lang="java">      <span class="n">error_token</span><span class="o">.</span><span class="na">used_by_parser</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC973" class="line" lang="java">      <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">error_token</span><span class="o">);</span></span>
<span id="LC974" class="line" lang="java">      <span class="n">tos</span><span class="o">++;</span></span>
<span id="LC975" class="line" lang="java"></span>
<span id="LC976" class="line" lang="java">      <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC977" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC978" class="line" lang="java"></span>
<span id="LC979" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC980" class="line" lang="java"></span>
<span id="LC981" class="line" lang="java">  <span class="cm">/** Lookahead Symbols used for attempting error recovery "parse aheads". */</span></span>
<span id="LC982" class="line" lang="java">  <span class="kd">protected</span> <span class="nc">Symbol</span> <span class="n">lookahead</span><span class="o">[];</span></span>
<span id="LC983" class="line" lang="java"></span>
<span id="LC984" class="line" lang="java">  <span class="cm">/** Position in lookahead input buffer used for "parse ahead". */</span></span>
<span id="LC985" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">int</span> <span class="n">lookahead_pos</span><span class="o">;</span></span>
<span id="LC986" class="line" lang="java"></span>
<span id="LC987" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC988" class="line" lang="java"></span>
<span id="LC989" class="line" lang="java">  <span class="cm">/** Read from input to establish our buffer of "parse ahead" lookahead</span></span>
<span id="LC990" class="line" lang="java"><span class="cm">   *  Symbols.</span></span>
<span id="LC991" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC992" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">read_lookahead</span><span class="o">()</span> <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC993" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC994" class="line" lang="java">      <span class="cm">/* create the lookahead array */</span></span>
<span id="LC995" class="line" lang="java">      <span class="n">lookahead</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Symbol</span><span class="o">[</span><span class="n">error_sync_size</span><span class="o">()];</span></span>
<span id="LC996" class="line" lang="java"></span>
<span id="LC997" class="line" lang="java">      <span class="cm">/* fill in the array */</span></span>
<span id="LC998" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">error_sync_size</span><span class="o">();</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC999" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC1000" class="line" lang="java">          <span class="n">lookahead</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="n">cur_token</span><span class="o">;</span></span>
<span id="LC1001" class="line" lang="java">          <span class="n">cur_token</span> <span class="o">=</span> <span class="n">scan</span><span class="o">();</span></span>
<span id="LC1002" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1003" class="line" lang="java"></span>
<span id="LC1004" class="line" lang="java">      <span class="cm">/* start at the beginning */</span></span>
<span id="LC1005" class="line" lang="java">      <span class="n">lookahead_pos</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC1006" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1007" class="line" lang="java"></span>
<span id="LC1008" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC1009" class="line" lang="java"></span>
<span id="LC1010" class="line" lang="java">  <span class="cm">/** Return the current lookahead in our error "parse ahead" buffer. */</span></span>
<span id="LC1011" class="line" lang="java">  <span class="kd">protected</span> <span class="nc">Symbol</span> <span class="nf">cur_err_token</span><span class="o">()</span> <span class="o">{</span> <span class="k">return</span> <span class="n">lookahead</span><span class="o">[</span><span class="n">lookahead_pos</span><span class="o">];</span> <span class="o">}</span></span>
<span id="LC1012" class="line" lang="java"></span>
<span id="LC1013" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC1014" class="line" lang="java"></span>
<span id="LC1015" class="line" lang="java">  <span class="cm">/** Advance to next "parse ahead" input Symbol. Return true if we have</span></span>
<span id="LC1016" class="line" lang="java"><span class="cm">   *  input to advance to, false otherwise.</span></span>
<span id="LC1017" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC1018" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">boolean</span> <span class="nf">advance_lookahead</span><span class="o">()</span></span>
<span id="LC1019" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1020" class="line" lang="java">      <span class="cm">/* advance the input location */</span></span>
<span id="LC1021" class="line" lang="java">      <span class="n">lookahead_pos</span><span class="o">++;</span></span>
<span id="LC1022" class="line" lang="java"></span>
<span id="LC1023" class="line" lang="java">      <span class="cm">/* return true if we didn't go off the end */</span></span>
<span id="LC1024" class="line" lang="java">      <span class="k">return</span> <span class="n">lookahead_pos</span> <span class="o">&lt;</span> <span class="n">error_sync_size</span><span class="o">();</span></span>
<span id="LC1025" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1026" class="line" lang="java"></span>
<span id="LC1027" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC1028" class="line" lang="java"></span>
<span id="LC1029" class="line" lang="java">  <span class="cm">/** Reset the parse ahead input to one Symbol past where we started error</span></span>
<span id="LC1030" class="line" lang="java"><span class="cm">   *  recovery (this consumes one new Symbol from the real input).</span></span>
<span id="LC1031" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC1032" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">restart_lookahead</span><span class="o">()</span> <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC1033" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1034" class="line" lang="java">      <span class="cm">/* move all the existing input over */</span></span>
<span id="LC1035" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">error_sync_size</span><span class="o">();</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC1036" class="line" lang="java">        <span class="n">lookahead</span><span class="o">[</span><span class="n">i</span><span class="o">-</span><span class="mi">1</span><span class="o">]</span> <span class="o">=</span> <span class="n">lookahead</span><span class="o">[</span><span class="n">i</span><span class="o">];</span></span>
<span id="LC1037" class="line" lang="java"></span>
<span id="LC1038" class="line" lang="java">      <span class="cm">/* read a new Symbol into the last spot */</span></span>
<span id="LC1039" class="line" lang="java">      <span class="n">cur_token</span> <span class="o">=</span> <span class="n">scan</span><span class="o">();</span></span>
<span id="LC1040" class="line" lang="java">      <span class="n">lookahead</span><span class="o">[</span><span class="n">error_sync_size</span><span class="o">()-</span><span class="mi">1</span><span class="o">]</span> <span class="o">=</span> <span class="n">cur_token</span><span class="o">;</span></span>
<span id="LC1041" class="line" lang="java"></span>
<span id="LC1042" class="line" lang="java">      <span class="cm">/* reset our internal position marker */</span></span>
<span id="LC1043" class="line" lang="java">      <span class="n">lookahead_pos</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC1044" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1045" class="line" lang="java"></span>
<span id="LC1046" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC1047" class="line" lang="java"></span>
<span id="LC1048" class="line" lang="java">  <span class="cm">/** Do a simulated parse forward (a "parse ahead") from the current</span></span>
<span id="LC1049" class="line" lang="java"><span class="cm">   *  stack configuration using stored lookahead input and a virtual parse</span></span>
<span id="LC1050" class="line" lang="java"><span class="cm">   *  stack.  Return true if we make it all the way through the stored</span></span>
<span id="LC1051" class="line" lang="java"><span class="cm">   *  lookahead input without error. This basically simulates the action of</span></span>
<span id="LC1052" class="line" lang="java"><span class="cm">   *  parse() using only our saved "parse ahead" input, and not executing any</span></span>
<span id="LC1053" class="line" lang="java"><span class="cm">   *  actions.</span></span>
<span id="LC1054" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC1055" class="line" lang="java"><span class="cm">   * @param debug should we produce debugging messages as we parse.</span></span>
<span id="LC1056" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC1057" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">boolean</span> <span class="nf">try_parse_ahead</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">debug</span><span class="o">)</span></span>
<span id="LC1058" class="line" lang="java">    <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC1059" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1060" class="line" lang="java">      <span class="kt">int</span> <span class="n">act</span><span class="o">;</span></span>
<span id="LC1061" class="line" lang="java">      <span class="kt">short</span> <span class="n">lhs</span><span class="o">,</span> <span class="n">rhs_size</span><span class="o">;</span></span>
<span id="LC1062" class="line" lang="java"></span>
<span id="LC1063" class="line" lang="java">      <span class="cm">/* create a virtual stack from the real parse stack */</span></span>
<span id="LC1064" class="line" lang="java">      <span class="n">virtual_parse_stack</span> <span class="n">vstack</span> <span class="o">=</span> <span class="k">new</span> <span class="n">virtual_parse_stack</span><span class="o">(</span><span class="n">stack</span><span class="o">);</span></span>
<span id="LC1065" class="line" lang="java"></span>
<span id="LC1066" class="line" lang="java">      <span class="cm">/* parse until we fail or get past the lookahead input */</span></span>
<span id="LC1067" class="line" lang="java">      <span class="k">for</span> <span class="o">(;;)</span></span>
<span id="LC1068" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC1069" class="line" lang="java">          <span class="cm">/* look up the action from the current state (on top of stack) */</span></span>
<span id="LC1070" class="line" lang="java">          <span class="n">act</span> <span class="o">=</span> <span class="n">get_action</span><span class="o">(</span><span class="n">vstack</span><span class="o">.</span><span class="na">top</span><span class="o">(),</span> <span class="n">cur_err_token</span><span class="o">().</span><span class="na">sym</span><span class="o">);</span></span>
<span id="LC1071" class="line" lang="java"></span>
<span id="LC1072" class="line" lang="java">          <span class="cm">/* if its an error, we fail */</span></span>
<span id="LC1073" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1074" class="line" lang="java"></span>
<span id="LC1075" class="line" lang="java">          <span class="cm">/* &gt; 0 encodes a shift */</span></span>
<span id="LC1076" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1077" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC1078" class="line" lang="java">              <span class="cm">/* push the new state on the stack */</span></span>
<span id="LC1079" class="line" lang="java">              <span class="n">vstack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">act</span><span class="o">-</span><span class="mi">1</span><span class="o">);</span></span>
<span id="LC1080" class="line" lang="java"></span>
<span id="LC1081" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Parse-ahead shifts Symbol #"</span> <span class="o">+</span></span>
<span id="LC1082" class="line" lang="java">                       <span class="n">cur_err_token</span><span class="o">().</span><span class="na">sym</span> <span class="o">+</span> <span class="s">" into state #"</span> <span class="o">+</span> <span class="o">(</span><span class="n">act</span><span class="o">-</span><span class="mi">1</span><span class="o">));</span></span>
<span id="LC1083" class="line" lang="java"></span>
<span id="LC1084" class="line" lang="java">              <span class="cm">/* advance simulated input, if we run off the end, we are done */</span></span>
<span id="LC1085" class="line" lang="java">              <span class="k">if</span> <span class="o">(!</span><span class="n">advance_lookahead</span><span class="o">())</span> <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1086" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1087" class="line" lang="java">          <span class="cm">/* &lt; 0 encodes a reduce */</span></span>
<span id="LC1088" class="line" lang="java">          <span class="k">else</span></span>
<span id="LC1089" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC1090" class="line" lang="java">              <span class="cm">/* if this is a reduce with the start production we are done */</span></span>
<span id="LC1091" class="line" lang="java">              <span class="k">if</span> <span class="o">((-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span> <span class="o">==</span> <span class="n">start_production</span><span class="o">())</span></span>
<span id="LC1092" class="line" lang="java">                <span class="o">{</span></span>
<span id="LC1093" class="line" lang="java">                  <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Parse-ahead accepts"</span><span class="o">);</span></span>
<span id="LC1094" class="line" lang="java">                  <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1095" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1096" class="line" lang="java"></span>
<span id="LC1097" class="line" lang="java">              <span class="cm">/* get the lhs Symbol and the rhs size */</span></span>
<span id="LC1098" class="line" lang="java">              <span class="n">lhs</span> <span class="o">=</span> <span class="n">production_tab</span><span class="o">[(-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">][</span><span class="mi">0</span><span class="o">];</span></span>
<span id="LC1099" class="line" lang="java">              <span class="n">rhs_size</span> <span class="o">=</span> <span class="n">production_tab</span><span class="o">[(-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">][</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC1100" class="line" lang="java"></span>
<span id="LC1101" class="line" lang="java">              <span class="cm">/* pop handle off the stack */</span></span>
<span id="LC1102" class="line" lang="java">              <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">rhs_size</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC1103" class="line" lang="java">                <span class="n">vstack</span><span class="o">.</span><span class="na">pop</span><span class="o">();</span></span>
<span id="LC1104" class="line" lang="java"></span>
<span id="LC1105" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span></span>
<span id="LC1106" class="line" lang="java">                <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Parse-ahead reduces: handle size = "</span> <span class="o">+</span></span>
<span id="LC1107" class="line" lang="java">                  <span class="n">rhs_size</span> <span class="o">+</span> <span class="s">" lhs = #"</span> <span class="o">+</span> <span class="n">lhs</span> <span class="o">+</span> <span class="s">" from state #"</span> <span class="o">+</span> <span class="n">vstack</span><span class="o">.</span><span class="na">top</span><span class="o">());</span></span>
<span id="LC1108" class="line" lang="java"></span>
<span id="LC1109" class="line" lang="java">              <span class="cm">/* look up goto and push it onto the stack */</span></span>
<span id="LC1110" class="line" lang="java">              <span class="n">vstack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">get_reduce</span><span class="o">(</span><span class="n">vstack</span><span class="o">.</span><span class="na">top</span><span class="o">(),</span> <span class="n">lhs</span><span class="o">));</span></span>
<span id="LC1111" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span></span>
<span id="LC1112" class="line" lang="java">                <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Goto state #"</span> <span class="o">+</span> <span class="n">vstack</span><span class="o">.</span><span class="na">top</span><span class="o">());</span></span>
<span id="LC1113" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1114" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1115" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1116" class="line" lang="java"></span>
<span id="LC1117" class="line" lang="java">  <span class="cm">/*. . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*/</span></span>
<span id="LC1118" class="line" lang="java"></span>
<span id="LC1119" class="line" lang="java">  <span class="cm">/** Parse forward using stored lookahead Symbols.  In this case we have</span></span>
<span id="LC1120" class="line" lang="java"><span class="cm">   *  already verified that parsing will make it through the stored lookahead</span></span>
<span id="LC1121" class="line" lang="java"><span class="cm">   *  Symbols and we are now getting back to the point at which we can hand</span></span>
<span id="LC1122" class="line" lang="java"><span class="cm">   *  control back to the normal parser.  Consequently, this version of the</span></span>
<span id="LC1123" class="line" lang="java"><span class="cm">   *  parser performs all actions and modifies the real parse configuration.</span></span>
<span id="LC1124" class="line" lang="java"><span class="cm">   *  This returns once we have consumed all the stored input or we accept.</span></span>
<span id="LC1125" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC1126" class="line" lang="java"><span class="cm">   * @param debug should we produce debugging messages as we parse.</span></span>
<span id="LC1127" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC1128" class="line" lang="java">  <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">parse_lookahead</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">debug</span><span class="o">)</span></span>
<span id="LC1129" class="line" lang="java">    <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Exception</span></span>
<span id="LC1130" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1131" class="line" lang="java">      <span class="cm">/* the current action code */</span></span>
<span id="LC1132" class="line" lang="java">      <span class="kt">int</span> <span class="n">act</span><span class="o">;</span></span>
<span id="LC1133" class="line" lang="java"></span>
<span id="LC1134" class="line" lang="java">      <span class="cm">/* the Symbol/stack element returned by a reduce */</span></span>
<span id="LC1135" class="line" lang="java">      <span class="nc">Symbol</span> <span class="n">lhs_sym</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1136" class="line" lang="java"></span>
<span id="LC1137" class="line" lang="java">      <span class="cm">/* information about production being reduced with */</span></span>
<span id="LC1138" class="line" lang="java">      <span class="kt">short</span> <span class="n">handle_size</span><span class="o">,</span> <span class="n">lhs_sym_num</span><span class="o">;</span></span>
<span id="LC1139" class="line" lang="java"></span>
<span id="LC1140" class="line" lang="java">      <span class="cm">/* restart the saved input at the beginning */</span></span>
<span id="LC1141" class="line" lang="java">      <span class="n">lookahead_pos</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC1142" class="line" lang="java"></span>
<span id="LC1143" class="line" lang="java">      <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span></span>
<span id="LC1144" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC1145" class="line" lang="java">          <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Reparsing saved input with actions"</span><span class="o">);</span></span>
<span id="LC1146" class="line" lang="java">          <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Current Symbol is #"</span> <span class="o">+</span> <span class="n">cur_err_token</span><span class="o">().</span><span class="na">sym</span><span class="o">);</span></span>
<span id="LC1147" class="line" lang="java">          <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Current state is #"</span> <span class="o">+</span></span>
<span id="LC1148" class="line" lang="java">                        <span class="o">((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">);</span></span>
<span id="LC1149" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1150" class="line" lang="java"></span>
<span id="LC1151" class="line" lang="java">      <span class="cm">/* continue until we accept or have read all lookahead input */</span></span>
<span id="LC1152" class="line" lang="java">      <span class="k">while</span><span class="o">(!</span><span class="n">_done_parsing</span><span class="o">)</span></span>
<span id="LC1153" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC1154" class="line" lang="java">          <span class="cm">/* current state is always on the top of the stack */</span></span>
<span id="LC1155" class="line" lang="java"></span>
<span id="LC1156" class="line" lang="java">          <span class="cm">/* look up action out of the current state with the current input */</span></span>
<span id="LC1157" class="line" lang="java">          <span class="n">act</span> <span class="o">=</span></span>
<span id="LC1158" class="line" lang="java">            <span class="n">get_action</span><span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">,</span> <span class="n">cur_err_token</span><span class="o">().</span><span class="na">sym</span><span class="o">);</span></span>
<span id="LC1159" class="line" lang="java"></span>
<span id="LC1160" class="line" lang="java">          <span class="cm">/* decode the action -- &gt; 0 encodes shift */</span></span>
<span id="LC1161" class="line" lang="java">          <span class="k">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1162" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC1163" class="line" lang="java">              <span class="cm">/* shift to the encoded state by pushing it on the stack */</span></span>
<span id="LC1164" class="line" lang="java">              <span class="n">cur_err_token</span><span class="o">().</span><span class="na">parse_state</span> <span class="o">=</span> <span class="n">act</span><span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC1165" class="line" lang="java">              <span class="n">cur_err_token</span><span class="o">().</span><span class="na">used_by_parser</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1166" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_shift</span><span class="o">(</span><span class="n">cur_err_token</span><span class="o">());</span></span>
<span id="LC1167" class="line" lang="java">              <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">cur_err_token</span><span class="o">());</span></span>
<span id="LC1168" class="line" lang="java">              <span class="n">tos</span><span class="o">++;</span></span>
<span id="LC1169" class="line" lang="java"></span>
<span id="LC1170" class="line" lang="java">              <span class="cm">/* advance to the next Symbol, if there is none, we are done */</span></span>
<span id="LC1171" class="line" lang="java">              <span class="k">if</span> <span class="o">(!</span><span class="n">advance_lookahead</span><span class="o">())</span></span>
<span id="LC1172" class="line" lang="java">                <span class="o">{</span></span>
<span id="LC1173" class="line" lang="java">                  <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Completed reparse"</span><span class="o">);</span></span>
<span id="LC1174" class="line" lang="java"></span>
<span id="LC1175" class="line" lang="java">                  <span class="cm">/* scan next Symbol so we can continue parse */</span></span>
<span id="LC1176" class="line" lang="java">                  <span class="c1">// BUGFIX by Chris Harris &lt;ckharris@ucsd.edu&gt;:</span></span>
<span id="LC1177" class="line" lang="java">                  <span class="c1">//   correct a one-off error by commenting out</span></span>
<span id="LC1178" class="line" lang="java">                  <span class="c1">//   this next line.</span></span>
<span id="LC1179" class="line" lang="java">                  <span class="cm">/*cur_token = scan();*/</span></span>
<span id="LC1180" class="line" lang="java"></span>
<span id="LC1181" class="line" lang="java">                  <span class="cm">/* go back to normal parser */</span></span>
<span id="LC1182" class="line" lang="java">                  <span class="k">return</span><span class="o">;</span></span>
<span id="LC1183" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1184" class="line" lang="java"></span>
<span id="LC1185" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span></span>
<span id="LC1186" class="line" lang="java">                <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Current Symbol is #"</span> <span class="o">+</span> <span class="n">cur_err_token</span><span class="o">().</span><span class="na">sym</span><span class="o">);</span></span>
<span id="LC1187" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1188" class="line" lang="java">          <span class="cm">/* if its less than zero, then it encodes a reduce action */</span></span>
<span id="LC1189" class="line" lang="java">          <span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1190" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC1191" class="line" lang="java">              <span class="cm">/* perform the action for the reduce */</span></span>
<span id="LC1192" class="line" lang="java">              <span class="n">lhs_sym</span> <span class="o">=</span> <span class="n">do_action</span><span class="o">((-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">,</span> <span class="k">this</span><span class="o">,</span> <span class="n">stack</span><span class="o">,</span> <span class="n">tos</span><span class="o">);</span></span>
<span id="LC1193" class="line" lang="java"></span>
<span id="LC1194" class="line" lang="java">              <span class="cm">/* look up information about the production */</span></span>
<span id="LC1195" class="line" lang="java">              <span class="n">lhs_sym_num</span> <span class="o">=</span> <span class="n">production_tab</span><span class="o">[(-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">][</span><span class="mi">0</span><span class="o">];</span></span>
<span id="LC1196" class="line" lang="java">              <span class="n">handle_size</span> <span class="o">=</span> <span class="n">production_tab</span><span class="o">[(-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">][</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC1197" class="line" lang="java"></span>
<span id="LC1198" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_reduce</span><span class="o">((-</span><span class="n">act</span><span class="o">)-</span><span class="mi">1</span><span class="o">,</span> <span class="n">lhs_sym_num</span><span class="o">,</span> <span class="n">handle_size</span><span class="o">);</span></span>
<span id="LC1199" class="line" lang="java"></span>
<span id="LC1200" class="line" lang="java">              <span class="cm">/* pop the handle off the stack */</span></span>
<span id="LC1201" class="line" lang="java">              <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">handle_size</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC1202" class="line" lang="java">                <span class="o">{</span></span>
<span id="LC1203" class="line" lang="java">                  <span class="n">stack</span><span class="o">.</span><span class="na">pop</span><span class="o">();</span></span>
<span id="LC1204" class="line" lang="java">                  <span class="n">tos</span><span class="o">--;</span></span>
<span id="LC1205" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1206" class="line" lang="java"></span>
<span id="LC1207" class="line" lang="java">              <span class="cm">/* look up the state to go to from the one popped back to */</span></span>
<span id="LC1208" class="line" lang="java">              <span class="n">act</span> <span class="o">=</span> <span class="n">get_reduce</span><span class="o">(((</span><span class="nc">Symbol</span><span class="o">)</span><span class="n">stack</span><span class="o">.</span><span class="na">peek</span><span class="o">()).</span><span class="na">parse_state</span><span class="o">,</span> <span class="n">lhs_sym_num</span><span class="o">);</span></span>
<span id="LC1209" class="line" lang="java"></span>
<span id="LC1210" class="line" lang="java">              <span class="cm">/* shift to that state */</span></span>
<span id="LC1211" class="line" lang="java">              <span class="n">lhs_sym</span><span class="o">.</span><span class="na">parse_state</span> <span class="o">=</span> <span class="n">act</span><span class="o">;</span></span>
<span id="LC1212" class="line" lang="java">              <span class="n">lhs_sym</span><span class="o">.</span><span class="na">used_by_parser</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1213" class="line" lang="java">              <span class="n">stack</span><span class="o">.</span><span class="na">push</span><span class="o">(</span><span class="n">lhs_sym</span><span class="o">);</span></span>
<span id="LC1214" class="line" lang="java">              <span class="n">tos</span><span class="o">++;</span></span>
<span id="LC1215" class="line" lang="java"></span>
<span id="LC1216" class="line" lang="java">              <span class="k">if</span> <span class="o">(</span><span class="n">debug</span><span class="o">)</span> <span class="n">debug_message</span><span class="o">(</span><span class="s">"# Goto state #"</span> <span class="o">+</span> <span class="n">act</span><span class="o">);</span></span>
<span id="LC1217" class="line" lang="java"></span>
<span id="LC1218" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1219" class="line" lang="java">          <span class="cm">/* finally if the entry is zero, we have an error</span></span>
<span id="LC1220" class="line" lang="java"><span class="cm">             (shouldn't happen here, but...)*/</span></span>
<span id="LC1221" class="line" lang="java">          <span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">act</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1222" class="line" lang="java">            <span class="o">{</span></span>
<span id="LC1223" class="line" lang="java">              <span class="n">report_fatal_error</span><span class="o">(</span><span class="s">"Syntax error"</span><span class="o">,</span> <span class="n">lhs_sym</span><span class="o">);</span></span>
<span id="LC1224" class="line" lang="java">              <span class="k">return</span><span class="o">;</span></span>
<span id="LC1225" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1226" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1227" class="line" lang="java"></span>
<span id="LC1228" class="line" lang="java"></span>
<span id="LC1229" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1230" class="line" lang="java"></span>
<span id="LC1231" class="line" lang="java">  <span class="cm">/*-----------------------------------------------------------*/</span></span>
<span id="LC1232" class="line" lang="java"></span>
<span id="LC1233" class="line" lang="java">  <span class="cm">/** Utility function: unpacks parse tables from strings */</span></span>
<span id="LC1234" class="line" lang="java">  <span class="kd">protected</span> <span class="kd">static</span> <span class="kt">short</span><span class="o">[][]</span> <span class="nf">unpackFromStrings</span><span class="o">(</span><span class="nc">String</span><span class="o">[]</span> <span class="n">sa</span><span class="o">)</span></span>
<span id="LC1235" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1236" class="line" lang="java">      <span class="c1">// Concatanate initialization strings.</span></span>
<span id="LC1237" class="line" lang="java">      <span class="nc">StringBuffer</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">(</span><span class="n">sa</span><span class="o">[</span><span class="mi">0</span><span class="o">]);</span></span>
<span id="LC1238" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">=</span><span class="mi">1</span><span class="o">;</span> <span class="n">i</span><span class="o">&lt;</span><span class="n">sa</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC1239" class="line" lang="java">        <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">sa</span><span class="o">[</span><span class="n">i</span><span class="o">]);</span></span>
<span id="LC1240" class="line" lang="java">      <span class="kt">int</span> <span class="n">n</span><span class="o">=</span><span class="mi">0</span><span class="o">;</span> <span class="c1">// location in initialization string</span></span>
<span id="LC1241" class="line" lang="java">      <span class="kt">int</span> <span class="n">size1</span> <span class="o">=</span> <span class="o">(((</span><span class="kt">int</span><span class="o">)</span><span class="n">sb</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">n</span><span class="o">))&lt;&lt;</span><span class="mi">16</span><span class="o">)</span> <span class="o">|</span> <span class="o">((</span><span class="kt">int</span><span class="o">)</span><span class="n">sb</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">n</span><span class="o">+</span><span class="mi">1</span><span class="o">));</span> <span class="n">n</span><span class="o">+=</span><span class="mi">2</span><span class="o">;</span></span>
<span id="LC1242" class="line" lang="java">      <span class="kt">short</span><span class="o">[][]</span> <span class="n">result</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">short</span><span class="o">[</span><span class="n">size1</span><span class="o">][];</span></span>
<span id="LC1243" class="line" lang="java">      <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span><span class="o">&lt;</span><span class="n">size1</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC1244" class="line" lang="java">        <span class="kt">int</span> <span class="n">size2</span> <span class="o">=</span> <span class="o">(((</span><span class="kt">int</span><span class="o">)</span><span class="n">sb</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">n</span><span class="o">))&lt;&lt;</span><span class="mi">16</span><span class="o">)</span> <span class="o">|</span> <span class="o">((</span><span class="kt">int</span><span class="o">)</span><span class="n">sb</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">n</span><span class="o">+</span><span class="mi">1</span><span class="o">));</span> <span class="n">n</span><span class="o">+=</span><span class="mi">2</span><span class="o">;</span></span>
<span id="LC1245" class="line" lang="java">        <span class="n">result</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">short</span><span class="o">[</span><span class="n">size2</span><span class="o">];</span></span>
<span id="LC1246" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">j</span><span class="o">=</span><span class="mi">0</span><span class="o">;</span> <span class="n">j</span><span class="o">&lt;</span><span class="n">size2</span><span class="o">;</span> <span class="n">j</span><span class="o">++)</span></span>
<span id="LC1247" class="line" lang="java">          <span class="n">result</span><span class="o">[</span><span class="n">i</span><span class="o">][</span><span class="n">j</span><span class="o">]</span> <span class="o">=</span> <span class="o">(</span><span class="kt">short</span><span class="o">)</span> <span class="o">(</span><span class="n">sb</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">n</span><span class="o">++)-</span><span class="mi">2</span><span class="o">);</span></span>
<span id="LC1248" class="line" lang="java">      <span class="o">}</span></span>
<span id="LC1249" class="line" lang="java">      <span class="k">return</span> <span class="n">result</span><span class="o">;</span></span>
<span id="LC1250" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1251" class="line" lang="java"><span class="o">}</span></span>
