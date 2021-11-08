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
<a class="file-line-num diff-line-num" data-line-number="1252" href="#L1252" id="L1252">
1252
</a>
<a class="file-line-num diff-line-num" data-line-number="1253" href="#L1253" id="L1253">
1253
</a>
<a class="file-line-num diff-line-num" data-line-number="1254" href="#L1254" id="L1254">
1254
</a>
<a class="file-line-num diff-line-num" data-line-number="1255" href="#L1255" id="L1255">
1255
</a>
<a class="file-line-num diff-line-num" data-line-number="1256" href="#L1256" id="L1256">
1256
</a>
<a class="file-line-num diff-line-num" data-line-number="1257" href="#L1257" id="L1257">
1257
</a>
<a class="file-line-num diff-line-num" data-line-number="1258" href="#L1258" id="L1258">
1258
</a>
<a class="file-line-num diff-line-num" data-line-number="1259" href="#L1259" id="L1259">
1259
</a>
<a class="file-line-num diff-line-num" data-line-number="1260" href="#L1260" id="L1260">
1260
</a>
<a class="file-line-num diff-line-num" data-line-number="1261" href="#L1261" id="L1261">
1261
</a>
<a class="file-line-num diff-line-num" data-line-number="1262" href="#L1262" id="L1262">
1262
</a>
<a class="file-line-num diff-line-num" data-line-number="1263" href="#L1263" id="L1263">
1263
</a>
<a class="file-line-num diff-line-num" data-line-number="1264" href="#L1264" id="L1264">
1264
</a>
<a class="file-line-num diff-line-num" data-line-number="1265" href="#L1265" id="L1265">
1265
</a>
<a class="file-line-num diff-line-num" data-line-number="1266" href="#L1266" id="L1266">
1266
</a>
<a class="file-line-num diff-line-num" data-line-number="1267" href="#L1267" id="L1267">
1267
</a>
<a class="file-line-num diff-line-num" data-line-number="1268" href="#L1268" id="L1268">
1268
</a>
<a class="file-line-num diff-line-num" data-line-number="1269" href="#L1269" id="L1269">
1269
</a>
<a class="file-line-num diff-line-num" data-line-number="1270" href="#L1270" id="L1270">
1270
</a>
<a class="file-line-num diff-line-num" data-line-number="1271" href="#L1271" id="L1271">
1271
</a>
<a class="file-line-num diff-line-num" data-line-number="1272" href="#L1272" id="L1272">
1272
</a>
<a class="file-line-num diff-line-num" data-line-number="1273" href="#L1273" id="L1273">
1273
</a>
<a class="file-line-num diff-line-num" data-line-number="1274" href="#L1274" id="L1274">
1274
</a>
<a class="file-line-num diff-line-num" data-line-number="1275" href="#L1275" id="L1275">
1275
</a>
<a class="file-line-num diff-line-num" data-line-number="1276" href="#L1276" id="L1276">
1276
</a>
<a class="file-line-num diff-line-num" data-line-number="1277" href="#L1277" id="L1277">
1277
</a>
<a class="file-line-num diff-line-num" data-line-number="1278" href="#L1278" id="L1278">
1278
</a>
<a class="file-line-num diff-line-num" data-line-number="1279" href="#L1279" id="L1279">
1279
</a>
<a class="file-line-num diff-line-num" data-line-number="1280" href="#L1280" id="L1280">
1280
</a>
<a class="file-line-num diff-line-num" data-line-number="1281" href="#L1281" id="L1281">
1281
</a>
<a class="file-line-num diff-line-num" data-line-number="1282" href="#L1282" id="L1282">
1282
</a>
<a class="file-line-num diff-line-num" data-line-number="1283" href="#L1283" id="L1283">
1283
</a>
<a class="file-line-num diff-line-num" data-line-number="1284" href="#L1284" id="L1284">
1284
</a>
<a class="file-line-num diff-line-num" data-line-number="1285" href="#L1285" id="L1285">
1285
</a>
<a class="file-line-num diff-line-num" data-line-number="1286" href="#L1286" id="L1286">
1286
</a>
<a class="file-line-num diff-line-num" data-line-number="1287" href="#L1287" id="L1287">
1287
</a>
<a class="file-line-num diff-line-num" data-line-number="1288" href="#L1288" id="L1288">
1288
</a>
<a class="file-line-num diff-line-num" data-line-number="1289" href="#L1289" id="L1289">
1289
</a>
<a class="file-line-num diff-line-num" data-line-number="1290" href="#L1290" id="L1290">
1290
</a>
<a class="file-line-num diff-line-num" data-line-number="1291" href="#L1291" id="L1291">
1291
</a>
<a class="file-line-num diff-line-num" data-line-number="1292" href="#L1292" id="L1292">
1292
</a>
<a class="file-line-num diff-line-num" data-line-number="1293" href="#L1293" id="L1293">
1293
</a>
<a class="file-line-num diff-line-num" data-line-number="1294" href="#L1294" id="L1294">
1294
</a>
<a class="file-line-num diff-line-num" data-line-number="1295" href="#L1295" id="L1295">
1295
</a>
<a class="file-line-num diff-line-num" data-line-number="1296" href="#L1296" id="L1296">
1296
</a>
<a class="file-line-num diff-line-num" data-line-number="1297" href="#L1297" id="L1297">
1297
</a>
<a class="file-line-num diff-line-num" data-line-number="1298" href="#L1298" id="L1298">
1298
</a>
<a class="file-line-num diff-line-num" data-line-number="1299" href="#L1299" id="L1299">
1299
</a>
<a class="file-line-num diff-line-num" data-line-number="1300" href="#L1300" id="L1300">
1300
</a>
<a class="file-line-num diff-line-num" data-line-number="1301" href="#L1301" id="L1301">
1301
</a>
<a class="file-line-num diff-line-num" data-line-number="1302" href="#L1302" id="L1302">
1302
</a>
<a class="file-line-num diff-line-num" data-line-number="1303" href="#L1303" id="L1303">
1303
</a>
<a class="file-line-num diff-line-num" data-line-number="1304" href="#L1304" id="L1304">
1304
</a>
<a class="file-line-num diff-line-num" data-line-number="1305" href="#L1305" id="L1305">
1305
</a>
<a class="file-line-num diff-line-num" data-line-number="1306" href="#L1306" id="L1306">
1306
</a>
<a class="file-line-num diff-line-num" data-line-number="1307" href="#L1307" id="L1307">
1307
</a>
<a class="file-line-num diff-line-num" data-line-number="1308" href="#L1308" id="L1308">
1308
</a>
<a class="file-line-num diff-line-num" data-line-number="1309" href="#L1309" id="L1309">
1309
</a>
<a class="file-line-num diff-line-num" data-line-number="1310" href="#L1310" id="L1310">
1310
</a>
<a class="file-line-num diff-line-num" data-line-number="1311" href="#L1311" id="L1311">
1311
</a>
<a class="file-line-num diff-line-num" data-line-number="1312" href="#L1312" id="L1312">
1312
</a>
<a class="file-line-num diff-line-num" data-line-number="1313" href="#L1313" id="L1313">
1313
</a>
<a class="file-line-num diff-line-num" data-line-number="1314" href="#L1314" id="L1314">
1314
</a>
<a class="file-line-num diff-line-num" data-line-number="1315" href="#L1315" id="L1315">
1315
</a>
<a class="file-line-num diff-line-num" data-line-number="1316" href="#L1316" id="L1316">
1316
</a>
<a class="file-line-num diff-line-num" data-line-number="1317" href="#L1317" id="L1317">
1317
</a>
<a class="file-line-num diff-line-num" data-line-number="1318" href="#L1318" id="L1318">
1318
</a>
<a class="file-line-num diff-line-num" data-line-number="1319" href="#L1319" id="L1319">
1319
</a>
<a class="file-line-num diff-line-num" data-line-number="1320" href="#L1320" id="L1320">
1320
</a>
<a class="file-line-num diff-line-num" data-line-number="1321" href="#L1321" id="L1321">
1321
</a>
<a class="file-line-num diff-line-num" data-line-number="1322" href="#L1322" id="L1322">
1322
</a>
<a class="file-line-num diff-line-num" data-line-number="1323" href="#L1323" id="L1323">
1323
</a>
<a class="file-line-num diff-line-num" data-line-number="1324" href="#L1324" id="L1324">
1324
</a>
<a class="file-line-num diff-line-num" data-line-number="1325" href="#L1325" id="L1325">
1325
</a>
<a class="file-line-num diff-line-num" data-line-number="1326" href="#L1326" id="L1326">
1326
</a>
<a class="file-line-num diff-line-num" data-line-number="1327" href="#L1327" id="L1327">
1327
</a>
<a class="file-line-num diff-line-num" data-line-number="1328" href="#L1328" id="L1328">
1328
</a>
<a class="file-line-num diff-line-num" data-line-number="1329" href="#L1329" id="L1329">
1329
</a>
<a class="file-line-num diff-line-num" data-line-number="1330" href="#L1330" id="L1330">
1330
</a>
<a class="file-line-num diff-line-num" data-line-number="1331" href="#L1331" id="L1331">
1331
</a>
<a class="file-line-num diff-line-num" data-line-number="1332" href="#L1332" id="L1332">
1332
</a>
<a class="file-line-num diff-line-num" data-line-number="1333" href="#L1333" id="L1333">
1333
</a>
<a class="file-line-num diff-line-num" data-line-number="1334" href="#L1334" id="L1334">
1334
</a>
<a class="file-line-num diff-line-num" data-line-number="1335" href="#L1335" id="L1335">
1335
</a>
<a class="file-line-num diff-line-num" data-line-number="1336" href="#L1336" id="L1336">
1336
</a>
<a class="file-line-num diff-line-num" data-line-number="1337" href="#L1337" id="L1337">
1337
</a>
<a class="file-line-num diff-line-num" data-line-number="1338" href="#L1338" id="L1338">
1338
</a>
<a class="file-line-num diff-line-num" data-line-number="1339" href="#L1339" id="L1339">
1339
</a>
<a class="file-line-num diff-line-num" data-line-number="1340" href="#L1340" id="L1340">
1340
</a>
<a class="file-line-num diff-line-num" data-line-number="1341" href="#L1341" id="L1341">
1341
</a>
<a class="file-line-num diff-line-num" data-line-number="1342" href="#L1342" id="L1342">
1342
</a>
<a class="file-line-num diff-line-num" data-line-number="1343" href="#L1343" id="L1343">
1343
</a>
<a class="file-line-num diff-line-num" data-line-number="1344" href="#L1344" id="L1344">
1344
</a>
<a class="file-line-num diff-line-num" data-line-number="1345" href="#L1345" id="L1345">
1345
</a>
<a class="file-line-num diff-line-num" data-line-number="1346" href="#L1346" id="L1346">
1346
</a>
<a class="file-line-num diff-line-num" data-line-number="1347" href="#L1347" id="L1347">
1347
</a>
<a class="file-line-num diff-line-num" data-line-number="1348" href="#L1348" id="L1348">
1348
</a>
<a class="file-line-num diff-line-num" data-line-number="1349" href="#L1349" id="L1349">
1349
</a>
<a class="file-line-num diff-line-num" data-line-number="1350" href="#L1350" id="L1350">
1350
</a>
<a class="file-line-num diff-line-num" data-line-number="1351" href="#L1351" id="L1351">
1351
</a>
<a class="file-line-num diff-line-num" data-line-number="1352" href="#L1352" id="L1352">
1352
</a>
<a class="file-line-num diff-line-num" data-line-number="1353" href="#L1353" id="L1353">
1353
</a>
<a class="file-line-num diff-line-num" data-line-number="1354" href="#L1354" id="L1354">
1354
</a>
<a class="file-line-num diff-line-num" data-line-number="1355" href="#L1355" id="L1355">
1355
</a>
<a class="file-line-num diff-line-num" data-line-number="1356" href="#L1356" id="L1356">
1356
</a>
<a class="file-line-num diff-line-num" data-line-number="1357" href="#L1357" id="L1357">
1357
</a>
<a class="file-line-num diff-line-num" data-line-number="1358" href="#L1358" id="L1358">
1358
</a>
<a class="file-line-num diff-line-num" data-line-number="1359" href="#L1359" id="L1359">
1359
</a>
<a class="file-line-num diff-line-num" data-line-number="1360" href="#L1360" id="L1360">
1360
</a>
<a class="file-line-num diff-line-num" data-line-number="1361" href="#L1361" id="L1361">
1361
</a>
<a class="file-line-num diff-line-num" data-line-number="1362" href="#L1362" id="L1362">
1362
</a>
<a class="file-line-num diff-line-num" data-line-number="1363" href="#L1363" id="L1363">
1363
</a>
<a class="file-line-num diff-line-num" data-line-number="1364" href="#L1364" id="L1364">
1364
</a>
<a class="file-line-num diff-line-num" data-line-number="1365" href="#L1365" id="L1365">
1365
</a>
<a class="file-line-num diff-line-num" data-line-number="1366" href="#L1366" id="L1366">
1366
</a>
<a class="file-line-num diff-line-num" data-line-number="1367" href="#L1367" id="L1367">
1367
</a>
<a class="file-line-num diff-line-num" data-line-number="1368" href="#L1368" id="L1368">
1368
</a>
<a class="file-line-num diff-line-num" data-line-number="1369" href="#L1369" id="L1369">
1369
</a>
<a class="file-line-num diff-line-num" data-line-number="1370" href="#L1370" id="L1370">
1370
</a>
<a class="file-line-num diff-line-num" data-line-number="1371" href="#L1371" id="L1371">
1371
</a>
<a class="file-line-num diff-line-num" data-line-number="1372" href="#L1372" id="L1372">
1372
</a>
<a class="file-line-num diff-line-num" data-line-number="1373" href="#L1373" id="L1373">
1373
</a>
<a class="file-line-num diff-line-num" data-line-number="1374" href="#L1374" id="L1374">
1374
</a>
<a class="file-line-num diff-line-num" data-line-number="1375" href="#L1375" id="L1375">
1375
</a>
<a class="file-line-num diff-line-num" data-line-number="1376" href="#L1376" id="L1376">
1376
</a>
<a class="file-line-num diff-line-num" data-line-number="1377" href="#L1377" id="L1377">
1377
</a>
<a class="file-line-num diff-line-num" data-line-number="1378" href="#L1378" id="L1378">
1378
</a>
<a class="file-line-num diff-line-num" data-line-number="1379" href="#L1379" id="L1379">
1379
</a>
<a class="file-line-num diff-line-num" data-line-number="1380" href="#L1380" id="L1380">
1380
</a>
<a class="file-line-num diff-line-num" data-line-number="1381" href="#L1381" id="L1381">
1381
</a>
<a class="file-line-num diff-line-num" data-line-number="1382" href="#L1382" id="L1382">
1382
</a>
<a class="file-line-num diff-line-num" data-line-number="1383" href="#L1383" id="L1383">
1383
</a>
<a class="file-line-num diff-line-num" data-line-number="1384" href="#L1384" id="L1384">
1384
</a>
<a class="file-line-num diff-line-num" data-line-number="1385" href="#L1385" id="L1385">
1385
</a>
<a class="file-line-num diff-line-num" data-line-number="1386" href="#L1386" id="L1386">
1386
</a>
<a class="file-line-num diff-line-num" data-line-number="1387" href="#L1387" id="L1387">
1387
</a>
<a class="file-line-num diff-line-num" data-line-number="1388" href="#L1388" id="L1388">
1388
</a>
<a class="file-line-num diff-line-num" data-line-number="1389" href="#L1389" id="L1389">
1389
</a>
<a class="file-line-num diff-line-num" data-line-number="1390" href="#L1390" id="L1390">
1390
</a>
<a class="file-line-num diff-line-num" data-line-number="1391" href="#L1391" id="L1391">
1391
</a>
<a class="file-line-num diff-line-num" data-line-number="1392" href="#L1392" id="L1392">
1392
</a>
<a class="file-line-num diff-line-num" data-line-number="1393" href="#L1393" id="L1393">
1393
</a>
<a class="file-line-num diff-line-num" data-line-number="1394" href="#L1394" id="L1394">
1394
</a>
<a class="file-line-num diff-line-num" data-line-number="1395" href="#L1395" id="L1395">
1395
</a>
<a class="file-line-num diff-line-num" data-line-number="1396" href="#L1396" id="L1396">
1396
</a>
<a class="file-line-num diff-line-num" data-line-number="1397" href="#L1397" id="L1397">
1397
</a>
<a class="file-line-num diff-line-num" data-line-number="1398" href="#L1398" id="L1398">
1398
</a>
<a class="file-line-num diff-line-num" data-line-number="1399" href="#L1399" id="L1399">
1399
</a>
<a class="file-line-num diff-line-num" data-line-number="1400" href="#L1400" id="L1400">
1400
</a>
<a class="file-line-num diff-line-num" data-line-number="1401" href="#L1401" id="L1401">
1401
</a>
<a class="file-line-num diff-line-num" data-line-number="1402" href="#L1402" id="L1402">
1402
</a>
<a class="file-line-num diff-line-num" data-line-number="1403" href="#L1403" id="L1403">
1403
</a>
<a class="file-line-num diff-line-num" data-line-number="1404" href="#L1404" id="L1404">
1404
</a>
<a class="file-line-num diff-line-num" data-line-number="1405" href="#L1405" id="L1405">
1405
</a>
<a class="file-line-num diff-line-num" data-line-number="1406" href="#L1406" id="L1406">
1406
</a>
<a class="file-line-num diff-line-num" data-line-number="1407" href="#L1407" id="L1407">
1407
</a>
<a class="file-line-num diff-line-num" data-line-number="1408" href="#L1408" id="L1408">
1408
</a>
<a class="file-line-num diff-line-num" data-line-number="1409" href="#L1409" id="L1409">
1409
</a>
<a class="file-line-num diff-line-num" data-line-number="1410" href="#L1410" id="L1410">
1410
</a>
<a class="file-line-num diff-line-num" data-line-number="1411" href="#L1411" id="L1411">
1411
</a>
<a class="file-line-num diff-line-num" data-line-number="1412" href="#L1412" id="L1412">
1412
</a>
<a class="file-line-num diff-line-num" data-line-number="1413" href="#L1413" id="L1413">
1413
</a>
<a class="file-line-num diff-line-num" data-line-number="1414" href="#L1414" id="L1414">
1414
</a>
<a class="file-line-num diff-line-num" data-line-number="1415" href="#L1415" id="L1415">
1415
</a>
<a class="file-line-num diff-line-num" data-line-number="1416" href="#L1416" id="L1416">
1416
</a>
<a class="file-line-num diff-line-num" data-line-number="1417" href="#L1417" id="L1417">
1417
</a>
<a class="file-line-num diff-line-num" data-line-number="1418" href="#L1418" id="L1418">
1418
</a>
<a class="file-line-num diff-line-num" data-line-number="1419" href="#L1419" id="L1419">
1419
</a>
<a class="file-line-num diff-line-num" data-line-number="1420" href="#L1420" id="L1420">
1420
</a>
<a class="file-line-num diff-line-num" data-line-number="1421" href="#L1421" id="L1421">
1421
</a>
<a class="file-line-num diff-line-num" data-line-number="1422" href="#L1422" id="L1422">
1422
</a>
<a class="file-line-num diff-line-num" data-line-number="1423" href="#L1423" id="L1423">
1423
</a>
<a class="file-line-num diff-line-num" data-line-number="1424" href="#L1424" id="L1424">
1424
</a>
<a class="file-line-num diff-line-num" data-line-number="1425" href="#L1425" id="L1425">
1425
</a>
<a class="file-line-num diff-line-num" data-line-number="1426" href="#L1426" id="L1426">
1426
</a>
<a class="file-line-num diff-line-num" data-line-number="1427" href="#L1427" id="L1427">
1427
</a>
<a class="file-line-num diff-line-num" data-line-number="1428" href="#L1428" id="L1428">
1428
</a>
<a class="file-line-num diff-line-num" data-line-number="1429" href="#L1429" id="L1429">
1429
</a>
<a class="file-line-num diff-line-num" data-line-number="1430" href="#L1430" id="L1430">
1430
</a>
<a class="file-line-num diff-line-num" data-line-number="1431" href="#L1431" id="L1431">
1431
</a>
<a class="file-line-num diff-line-num" data-line-number="1432" href="#L1432" id="L1432">
1432
</a>
<a class="file-line-num diff-line-num" data-line-number="1433" href="#L1433" id="L1433">
1433
</a>
<a class="file-line-num diff-line-num" data-line-number="1434" href="#L1434" id="L1434">
1434
</a>
<a class="file-line-num diff-line-num" data-line-number="1435" href="#L1435" id="L1435">
1435
</a>
<a class="file-line-num diff-line-num" data-line-number="1436" href="#L1436" id="L1436">
1436
</a>
<a class="file-line-num diff-line-num" data-line-number="1437" href="#L1437" id="L1437">
1437
</a>
<a class="file-line-num diff-line-num" data-line-number="1438" href="#L1438" id="L1438">
1438
</a>
<a class="file-line-num diff-line-num" data-line-number="1439" href="#L1439" id="L1439">
1439
</a>
<a class="file-line-num diff-line-num" data-line-number="1440" href="#L1440" id="L1440">
1440
</a>
<a class="file-line-num diff-line-num" data-line-number="1441" href="#L1441" id="L1441">
1441
</a>
<a class="file-line-num diff-line-num" data-line-number="1442" href="#L1442" id="L1442">
1442
</a>
<a class="file-line-num diff-line-num" data-line-number="1443" href="#L1443" id="L1443">
1443
</a>
<a class="file-line-num diff-line-num" data-line-number="1444" href="#L1444" id="L1444">
1444
</a>
<a class="file-line-num diff-line-num" data-line-number="1445" href="#L1445" id="L1445">
1445
</a>
<a class="file-line-num diff-line-num" data-line-number="1446" href="#L1446" id="L1446">
1446
</a>
<a class="file-line-num diff-line-num" data-line-number="1447" href="#L1447" id="L1447">
1447
</a>
<a class="file-line-num diff-line-num" data-line-number="1448" href="#L1448" id="L1448">
1448
</a>
<a class="file-line-num diff-line-num" data-line-number="1449" href="#L1449" id="L1449">
1449
</a>
<a class="file-line-num diff-line-num" data-line-number="1450" href="#L1450" id="L1450">
1450
</a>
<a class="file-line-num diff-line-num" data-line-number="1451" href="#L1451" id="L1451">
1451
</a>
<a class="file-line-num diff-line-num" data-line-number="1452" href="#L1452" id="L1452">
1452
</a>
<a class="file-line-num diff-line-num" data-line-number="1453" href="#L1453" id="L1453">
1453
</a>
<a class="file-line-num diff-line-num" data-line-number="1454" href="#L1454" id="L1454">
1454
</a>
<a class="file-line-num diff-line-num" data-line-number="1455" href="#L1455" id="L1455">
1455
</a>
<a class="file-line-num diff-line-num" data-line-number="1456" href="#L1456" id="L1456">
1456
</a>
<a class="file-line-num diff-line-num" data-line-number="1457" href="#L1457" id="L1457">
1457
</a>
<a class="file-line-num diff-line-num" data-line-number="1458" href="#L1458" id="L1458">
1458
</a>
<a class="file-line-num diff-line-num" data-line-number="1459" href="#L1459" id="L1459">
1459
</a>
<a class="file-line-num diff-line-num" data-line-number="1460" href="#L1460" id="L1460">
1460
</a>
<a class="file-line-num diff-line-num" data-line-number="1461" href="#L1461" id="L1461">
1461
</a>
<a class="file-line-num diff-line-num" data-line-number="1462" href="#L1462" id="L1462">
1462
</a>
<a class="file-line-num diff-line-num" data-line-number="1463" href="#L1463" id="L1463">
1463
</a>
<a class="file-line-num diff-line-num" data-line-number="1464" href="#L1464" id="L1464">
1464
</a>
<a class="file-line-num diff-line-num" data-line-number="1465" href="#L1465" id="L1465">
1465
</a>
<a class="file-line-num diff-line-num" data-line-number="1466" href="#L1466" id="L1466">
1466
</a>
<a class="file-line-num diff-line-num" data-line-number="1467" href="#L1467" id="L1467">
1467
</a>
<a class="file-line-num diff-line-num" data-line-number="1468" href="#L1468" id="L1468">
1468
</a>
<a class="file-line-num diff-line-num" data-line-number="1469" href="#L1469" id="L1469">
1469
</a>
<a class="file-line-num diff-line-num" data-line-number="1470" href="#L1470" id="L1470">
1470
</a>
<a class="file-line-num diff-line-num" data-line-number="1471" href="#L1471" id="L1471">
1471
</a>
<a class="file-line-num diff-line-num" data-line-number="1472" href="#L1472" id="L1472">
1472
</a>
<a class="file-line-num diff-line-num" data-line-number="1473" href="#L1473" id="L1473">
1473
</a>
<a class="file-line-num diff-line-num" data-line-number="1474" href="#L1474" id="L1474">
1474
</a>
<a class="file-line-num diff-line-num" data-line-number="1475" href="#L1475" id="L1475">
1475
</a>
<a class="file-line-num diff-line-num" data-line-number="1476" href="#L1476" id="L1476">
1476
</a>
<a class="file-line-num diff-line-num" data-line-number="1477" href="#L1477" id="L1477">
1477
</a>
<a class="file-line-num diff-line-num" data-line-number="1478" href="#L1478" id="L1478">
1478
</a>
<a class="file-line-num diff-line-num" data-line-number="1479" href="#L1479" id="L1479">
1479
</a>
<a class="file-line-num diff-line-num" data-line-number="1480" href="#L1480" id="L1480">
1480
</a>
<a class="file-line-num diff-line-num" data-line-number="1481" href="#L1481" id="L1481">
1481
</a>
<a class="file-line-num diff-line-num" data-line-number="1482" href="#L1482" id="L1482">
1482
</a>
<a class="file-line-num diff-line-num" data-line-number="1483" href="#L1483" id="L1483">
1483
</a>
<a class="file-line-num diff-line-num" data-line-number="1484" href="#L1484" id="L1484">
1484
</a>
<a class="file-line-num diff-line-num" data-line-number="1485" href="#L1485" id="L1485">
1485
</a>
<a class="file-line-num diff-line-num" data-line-number="1486" href="#L1486" id="L1486">
1486
</a>
<a class="file-line-num diff-line-num" data-line-number="1487" href="#L1487" id="L1487">
1487
</a>
<a class="file-line-num diff-line-num" data-line-number="1488" href="#L1488" id="L1488">
1488
</a>
<a class="file-line-num diff-line-num" data-line-number="1489" href="#L1489" id="L1489">
1489
</a>
<a class="file-line-num diff-line-num" data-line-number="1490" href="#L1490" id="L1490">
1490
</a>
<a class="file-line-num diff-line-num" data-line-number="1491" href="#L1491" id="L1491">
1491
</a>
<a class="file-line-num diff-line-num" data-line-number="1492" href="#L1492" id="L1492">
1492
</a>
<a class="file-line-num diff-line-num" data-line-number="1493" href="#L1493" id="L1493">
1493
</a>
<a class="file-line-num diff-line-num" data-line-number="1494" href="#L1494" id="L1494">
1494
</a>
<a class="file-line-num diff-line-num" data-line-number="1495" href="#L1495" id="L1495">
1495
</a>
<a class="file-line-num diff-line-num" data-line-number="1496" href="#L1496" id="L1496">
1496
</a>
<a class="file-line-num diff-line-num" data-line-number="1497" href="#L1497" id="L1497">
1497
</a>
<a class="file-line-num diff-line-num" data-line-number="1498" href="#L1498" id="L1498">
1498
</a>
<a class="file-line-num diff-line-num" data-line-number="1499" href="#L1499" id="L1499">
1499
</a>
<a class="file-line-num diff-line-num" data-line-number="1500" href="#L1500" id="L1500">
1500
</a>
<a class="file-line-num diff-line-num" data-line-number="1501" href="#L1501" id="L1501">
1501
</a>
<a class="file-line-num diff-line-num" data-line-number="1502" href="#L1502" id="L1502">
1502
</a>
<a class="file-line-num diff-line-num" data-line-number="1503" href="#L1503" id="L1503">
1503
</a>
<a class="file-line-num diff-line-num" data-line-number="1504" href="#L1504" id="L1504">
1504
</a>
<a class="file-line-num diff-line-num" data-line-number="1505" href="#L1505" id="L1505">
1505
</a>
<a class="file-line-num diff-line-num" data-line-number="1506" href="#L1506" id="L1506">
1506
</a>
<a class="file-line-num diff-line-num" data-line-number="1507" href="#L1507" id="L1507">
1507
</a>
<a class="file-line-num diff-line-num" data-line-number="1508" href="#L1508" id="L1508">
1508
</a>
<a class="file-line-num diff-line-num" data-line-number="1509" href="#L1509" id="L1509">
1509
</a>
<a class="file-line-num diff-line-num" data-line-number="1510" href="#L1510" id="L1510">
1510
</a>
<a class="file-line-num diff-line-num" data-line-number="1511" href="#L1511" id="L1511">
1511
</a>
<a class="file-line-num diff-line-num" data-line-number="1512" href="#L1512" id="L1512">
1512
</a>
<a class="file-line-num diff-line-num" data-line-number="1513" href="#L1513" id="L1513">
1513
</a>
<a class="file-line-num diff-line-num" data-line-number="1514" href="#L1514" id="L1514">
1514
</a>
<a class="file-line-num diff-line-num" data-line-number="1515" href="#L1515" id="L1515">
1515
</a>
<a class="file-line-num diff-line-num" data-line-number="1516" href="#L1516" id="L1516">
1516
</a>
<a class="file-line-num diff-line-num" data-line-number="1517" href="#L1517" id="L1517">
1517
</a>
<a class="file-line-num diff-line-num" data-line-number="1518" href="#L1518" id="L1518">
1518
</a>
<a class="file-line-num diff-line-num" data-line-number="1519" href="#L1519" id="L1519">
1519
</a>
<a class="file-line-num diff-line-num" data-line-number="1520" href="#L1520" id="L1520">
1520
</a>
<a class="file-line-num diff-line-num" data-line-number="1521" href="#L1521" id="L1521">
1521
</a>
<a class="file-line-num diff-line-num" data-line-number="1522" href="#L1522" id="L1522">
1522
</a>
<a class="file-line-num diff-line-num" data-line-number="1523" href="#L1523" id="L1523">
1523
</a>
<a class="file-line-num diff-line-num" data-line-number="1524" href="#L1524" id="L1524">
1524
</a>
<a class="file-line-num diff-line-num" data-line-number="1525" href="#L1525" id="L1525">
1525
</a>
<a class="file-line-num diff-line-num" data-line-number="1526" href="#L1526" id="L1526">
1526
</a>
<a class="file-line-num diff-line-num" data-line-number="1527" href="#L1527" id="L1527">
1527
</a>
<a class="file-line-num diff-line-num" data-line-number="1528" href="#L1528" id="L1528">
1528
</a>
<a class="file-line-num diff-line-num" data-line-number="1529" href="#L1529" id="L1529">
1529
</a>
<a class="file-line-num diff-line-num" data-line-number="1530" href="#L1530" id="L1530">
1530
</a>
<a class="file-line-num diff-line-num" data-line-number="1531" href="#L1531" id="L1531">
1531
</a>
<a class="file-line-num diff-line-num" data-line-number="1532" href="#L1532" id="L1532">
1532
</a>
<a class="file-line-num diff-line-num" data-line-number="1533" href="#L1533" id="L1533">
1533
</a>
<a class="file-line-num diff-line-num" data-line-number="1534" href="#L1534" id="L1534">
1534
</a>
<a class="file-line-num diff-line-num" data-line-number="1535" href="#L1535" id="L1535">
1535
</a>
<a class="file-line-num diff-line-num" data-line-number="1536" href="#L1536" id="L1536">
1536
</a>
<a class="file-line-num diff-line-num" data-line-number="1537" href="#L1537" id="L1537">
1537
</a>
<a class="file-line-num diff-line-num" data-line-number="1538" href="#L1538" id="L1538">
1538
</a>
<a class="file-line-num diff-line-num" data-line-number="1539" href="#L1539" id="L1539">
1539
</a>
<a class="file-line-num diff-line-num" data-line-number="1540" href="#L1540" id="L1540">
1540
</a>
<a class="file-line-num diff-line-num" data-line-number="1541" href="#L1541" id="L1541">
1541
</a>
<a class="file-line-num diff-line-num" data-line-number="1542" href="#L1542" id="L1542">
1542
</a>
<a class="file-line-num diff-line-num" data-line-number="1543" href="#L1543" id="L1543">
1543
</a>
<a class="file-line-num diff-line-num" data-line-number="1544" href="#L1544" id="L1544">
1544
</a>
<a class="file-line-num diff-line-num" data-line-number="1545" href="#L1545" id="L1545">
1545
</a>
<a class="file-line-num diff-line-num" data-line-number="1546" href="#L1546" id="L1546">
1546
</a>
<a class="file-line-num diff-line-num" data-line-number="1547" href="#L1547" id="L1547">
1547
</a>
<a class="file-line-num diff-line-num" data-line-number="1548" href="#L1548" id="L1548">
1548
</a>
<a class="file-line-num diff-line-num" data-line-number="1549" href="#L1549" id="L1549">
1549
</a>
<a class="file-line-num diff-line-num" data-line-number="1550" href="#L1550" id="L1550">
1550
</a>
<a class="file-line-num diff-line-num" data-line-number="1551" href="#L1551" id="L1551">
1551
</a>
<a class="file-line-num diff-line-num" data-line-number="1552" href="#L1552" id="L1552">
1552
</a>
<a class="file-line-num diff-line-num" data-line-number="1553" href="#L1553" id="L1553">
1553
</a>
<a class="file-line-num diff-line-num" data-line-number="1554" href="#L1554" id="L1554">
1554
</a>
<a class="file-line-num diff-line-num" data-line-number="1555" href="#L1555" id="L1555">
1555
</a>
<a class="file-line-num diff-line-num" data-line-number="1556" href="#L1556" id="L1556">
1556
</a>
<a class="file-line-num diff-line-num" data-line-number="1557" href="#L1557" id="L1557">
1557
</a>
<a class="file-line-num diff-line-num" data-line-number="1558" href="#L1558" id="L1558">
1558
</a>
<a class="file-line-num diff-line-num" data-line-number="1559" href="#L1559" id="L1559">
1559
</a>
<a class="file-line-num diff-line-num" data-line-number="1560" href="#L1560" id="L1560">
1560
</a>
<a class="file-line-num diff-line-num" data-line-number="1561" href="#L1561" id="L1561">
1561
</a>
<a class="file-line-num diff-line-num" data-line-number="1562" href="#L1562" id="L1562">
1562
</a>
<a class="file-line-num diff-line-num" data-line-number="1563" href="#L1563" id="L1563">
1563
</a>
<a class="file-line-num diff-line-num" data-line-number="1564" href="#L1564" id="L1564">
1564
</a>
<a class="file-line-num diff-line-num" data-line-number="1565" href="#L1565" id="L1565">
1565
</a>
<a class="file-line-num diff-line-num" data-line-number="1566" href="#L1566" id="L1566">
1566
</a>
<a class="file-line-num diff-line-num" data-line-number="1567" href="#L1567" id="L1567">
1567
</a>
<a class="file-line-num diff-line-num" data-line-number="1568" href="#L1568" id="L1568">
1568
</a>
<a class="file-line-num diff-line-num" data-line-number="1569" href="#L1569" id="L1569">
1569
</a>
<a class="file-line-num diff-line-num" data-line-number="1570" href="#L1570" id="L1570">
1570
</a>
<a class="file-line-num diff-line-num" data-line-number="1571" href="#L1571" id="L1571">
1571
</a>
<a class="file-line-num diff-line-num" data-line-number="1572" href="#L1572" id="L1572">
1572
</a>
<a class="file-line-num diff-line-num" data-line-number="1573" href="#L1573" id="L1573">
1573
</a>
<a class="file-line-num diff-line-num" data-line-number="1574" href="#L1574" id="L1574">
1574
</a>
<a class="file-line-num diff-line-num" data-line-number="1575" href="#L1575" id="L1575">
1575
</a>
<a class="file-line-num diff-line-num" data-line-number="1576" href="#L1576" id="L1576">
1576
</a>
<a class="file-line-num diff-line-num" data-line-number="1577" href="#L1577" id="L1577">
1577
</a>
<a class="file-line-num diff-line-num" data-line-number="1578" href="#L1578" id="L1578">
1578
</a>
<a class="file-line-num diff-line-num" data-line-number="1579" href="#L1579" id="L1579">
1579
</a>
<a class="file-line-num diff-line-num" data-line-number="1580" href="#L1580" id="L1580">
1580
</a>
<a class="file-line-num diff-line-num" data-line-number="1581" href="#L1581" id="L1581">
1581
</a>
<a class="file-line-num diff-line-num" data-line-number="1582" href="#L1582" id="L1582">
1582
</a>
<a class="file-line-num diff-line-num" data-line-number="1583" href="#L1583" id="L1583">
1583
</a>
<a class="file-line-num diff-line-num" data-line-number="1584" href="#L1584" id="L1584">
1584
</a>
<a class="file-line-num diff-line-num" data-line-number="1585" href="#L1585" id="L1585">
1585
</a>
<a class="file-line-num diff-line-num" data-line-number="1586" href="#L1586" id="L1586">
1586
</a>
<a class="file-line-num diff-line-num" data-line-number="1587" href="#L1587" id="L1587">
1587
</a>
<a class="file-line-num diff-line-num" data-line-number="1588" href="#L1588" id="L1588">
1588
</a>
<a class="file-line-num diff-line-num" data-line-number="1589" href="#L1589" id="L1589">
1589
</a>
<a class="file-line-num diff-line-num" data-line-number="1590" href="#L1590" id="L1590">
1590
</a>
<a class="file-line-num diff-line-num" data-line-number="1591" href="#L1591" id="L1591">
1591
</a>
<a class="file-line-num diff-line-num" data-line-number="1592" href="#L1592" id="L1592">
1592
</a>
<a class="file-line-num diff-line-num" data-line-number="1593" href="#L1593" id="L1593">
1593
</a>
<a class="file-line-num diff-line-num" data-line-number="1594" href="#L1594" id="L1594">
1594
</a>
<a class="file-line-num diff-line-num" data-line-number="1595" href="#L1595" id="L1595">
1595
</a>
<a class="file-line-num diff-line-num" data-line-number="1596" href="#L1596" id="L1596">
1596
</a>
<a class="file-line-num diff-line-num" data-line-number="1597" href="#L1597" id="L1597">
1597
</a>
<a class="file-line-num diff-line-num" data-line-number="1598" href="#L1598" id="L1598">
1598
</a>
<a class="file-line-num diff-line-num" data-line-number="1599" href="#L1599" id="L1599">
1599
</a>
<a class="file-line-num diff-line-num" data-line-number="1600" href="#L1600" id="L1600">
1600
</a>
<a class="file-line-num diff-line-num" data-line-number="1601" href="#L1601" id="L1601">
1601
</a>
<a class="file-line-num diff-line-num" data-line-number="1602" href="#L1602" id="L1602">
1602
</a>
<a class="file-line-num diff-line-num" data-line-number="1603" href="#L1603" id="L1603">
1603
</a>
<a class="file-line-num diff-line-num" data-line-number="1604" href="#L1604" id="L1604">
1604
</a>
<a class="file-line-num diff-line-num" data-line-number="1605" href="#L1605" id="L1605">
1605
</a>
<a class="file-line-num diff-line-num" data-line-number="1606" href="#L1606" id="L1606">
1606
</a>
<a class="file-line-num diff-line-num" data-line-number="1607" href="#L1607" id="L1607">
1607
</a>
<a class="file-line-num diff-line-num" data-line-number="1608" href="#L1608" id="L1608">
1608
</a>
<a class="file-line-num diff-line-num" data-line-number="1609" href="#L1609" id="L1609">
1609
</a>
<a class="file-line-num diff-line-num" data-line-number="1610" href="#L1610" id="L1610">
1610
</a>
<a class="file-line-num diff-line-num" data-line-number="1611" href="#L1611" id="L1611">
1611
</a>
<a class="file-line-num diff-line-num" data-line-number="1612" href="#L1612" id="L1612">
1612
</a>
<a class="file-line-num diff-line-num" data-line-number="1613" href="#L1613" id="L1613">
1613
</a>
<a class="file-line-num diff-line-num" data-line-number="1614" href="#L1614" id="L1614">
1614
</a>
<a class="file-line-num diff-line-num" data-line-number="1615" href="#L1615" id="L1615">
1615
</a>
<a class="file-line-num diff-line-num" data-line-number="1616" href="#L1616" id="L1616">
1616
</a>
<a class="file-line-num diff-line-num" data-line-number="1617" href="#L1617" id="L1617">
1617
</a>
<a class="file-line-num diff-line-num" data-line-number="1618" href="#L1618" id="L1618">
1618
</a>
<a class="file-line-num diff-line-num" data-line-number="1619" href="#L1619" id="L1619">
1619
</a>
<a class="file-line-num diff-line-num" data-line-number="1620" href="#L1620" id="L1620">
1620
</a>
<a class="file-line-num diff-line-num" data-line-number="1621" href="#L1621" id="L1621">
1621
</a>
<a class="file-line-num diff-line-num" data-line-number="1622" href="#L1622" id="L1622">
1622
</a>
<a class="file-line-num diff-line-num" data-line-number="1623" href="#L1623" id="L1623">
1623
</a>
<a class="file-line-num diff-line-num" data-line-number="1624" href="#L1624" id="L1624">
1624
</a>
<a class="file-line-num diff-line-num" data-line-number="1625" href="#L1625" id="L1625">
1625
</a>
<a class="file-line-num diff-line-num" data-line-number="1626" href="#L1626" id="L1626">
1626
</a>
<a class="file-line-num diff-line-num" data-line-number="1627" href="#L1627" id="L1627">
1627
</a>
<a class="file-line-num diff-line-num" data-line-number="1628" href="#L1628" id="L1628">
1628
</a>
<a class="file-line-num diff-line-num" data-line-number="1629" href="#L1629" id="L1629">
1629
</a>
<a class="file-line-num diff-line-num" data-line-number="1630" href="#L1630" id="L1630">
1630
</a>
<a class="file-line-num diff-line-num" data-line-number="1631" href="#L1631" id="L1631">
1631
</a>
<a class="file-line-num diff-line-num" data-line-number="1632" href="#L1632" id="L1632">
1632
</a>
<a class="file-line-num diff-line-num" data-line-number="1633" href="#L1633" id="L1633">
1633
</a>
<a class="file-line-num diff-line-num" data-line-number="1634" href="#L1634" id="L1634">
1634
</a>
<a class="file-line-num diff-line-num" data-line-number="1635" href="#L1635" id="L1635">
1635
</a>
<a class="file-line-num diff-line-num" data-line-number="1636" href="#L1636" id="L1636">
1636
</a>
<a class="file-line-num diff-line-num" data-line-number="1637" href="#L1637" id="L1637">
1637
</a>
<a class="file-line-num diff-line-num" data-line-number="1638" href="#L1638" id="L1638">
1638
</a>
<a class="file-line-num diff-line-num" data-line-number="1639" href="#L1639" id="L1639">
1639
</a>
<a class="file-line-num diff-line-num" data-line-number="1640" href="#L1640" id="L1640">
1640
</a>
<a class="file-line-num diff-line-num" data-line-number="1641" href="#L1641" id="L1641">
1641
</a>
<a class="file-line-num diff-line-num" data-line-number="1642" href="#L1642" id="L1642">
1642
</a>
<a class="file-line-num diff-line-num" data-line-number="1643" href="#L1643" id="L1643">
1643
</a>
<a class="file-line-num diff-line-num" data-line-number="1644" href="#L1644" id="L1644">
1644
</a>
<a class="file-line-num diff-line-num" data-line-number="1645" href="#L1645" id="L1645">
1645
</a>
<a class="file-line-num diff-line-num" data-line-number="1646" href="#L1646" id="L1646">
1646
</a>
<a class="file-line-num diff-line-num" data-line-number="1647" href="#L1647" id="L1647">
1647
</a>
<a class="file-line-num diff-line-num" data-line-number="1648" href="#L1648" id="L1648">
1648
</a>
<a class="file-line-num diff-line-num" data-line-number="1649" href="#L1649" id="L1649">
1649
</a>
<a class="file-line-num diff-line-num" data-line-number="1650" href="#L1650" id="L1650">
1650
</a>
<a class="file-line-num diff-line-num" data-line-number="1651" href="#L1651" id="L1651">
1651
</a>
<a class="file-line-num diff-line-num" data-line-number="1652" href="#L1652" id="L1652">
1652
</a>
<a class="file-line-num diff-line-num" data-line-number="1653" href="#L1653" id="L1653">
1653
</a>
<a class="file-line-num diff-line-num" data-line-number="1654" href="#L1654" id="L1654">
1654
</a>
<a class="file-line-num diff-line-num" data-line-number="1655" href="#L1655" id="L1655">
1655
</a>
<a class="file-line-num diff-line-num" data-line-number="1656" href="#L1656" id="L1656">
1656
</a>
<a class="file-line-num diff-line-num" data-line-number="1657" href="#L1657" id="L1657">
1657
</a>
<a class="file-line-num diff-line-num" data-line-number="1658" href="#L1658" id="L1658">
1658
</a>
<a class="file-line-num diff-line-num" data-line-number="1659" href="#L1659" id="L1659">
1659
</a>
<a class="file-line-num diff-line-num" data-line-number="1660" href="#L1660" id="L1660">
1660
</a>
<a class="file-line-num diff-line-num" data-line-number="1661" href="#L1661" id="L1661">
1661
</a>
<a class="file-line-num diff-line-num" data-line-number="1662" href="#L1662" id="L1662">
1662
</a>
<a class="file-line-num diff-line-num" data-line-number="1663" href="#L1663" id="L1663">
1663
</a>
<a class="file-line-num diff-line-num" data-line-number="1664" href="#L1664" id="L1664">
1664
</a>
<a class="file-line-num diff-line-num" data-line-number="1665" href="#L1665" id="L1665">
1665
</a>
<a class="file-line-num diff-line-num" data-line-number="1666" href="#L1666" id="L1666">
1666
</a>
<a class="file-line-num diff-line-num" data-line-number="1667" href="#L1667" id="L1667">
1667
</a>
<a class="file-line-num diff-line-num" data-line-number="1668" href="#L1668" id="L1668">
1668
</a>
<a class="file-line-num diff-line-num" data-line-number="1669" href="#L1669" id="L1669">
1669
</a>
<a class="file-line-num diff-line-num" data-line-number="1670" href="#L1670" id="L1670">
1670
</a>
<a class="file-line-num diff-line-num" data-line-number="1671" href="#L1671" id="L1671">
1671
</a>
<a class="file-line-num diff-line-num" data-line-number="1672" href="#L1672" id="L1672">
1672
</a>
<a class="file-line-num diff-line-num" data-line-number="1673" href="#L1673" id="L1673">
1673
</a>
<a class="file-line-num diff-line-num" data-line-number="1674" href="#L1674" id="L1674">
1674
</a>
<a class="file-line-num diff-line-num" data-line-number="1675" href="#L1675" id="L1675">
1675
</a>
<a class="file-line-num diff-line-num" data-line-number="1676" href="#L1676" id="L1676">
1676
</a>
<a class="file-line-num diff-line-num" data-line-number="1677" href="#L1677" id="L1677">
1677
</a>
<a class="file-line-num diff-line-num" data-line-number="1678" href="#L1678" id="L1678">
1678
</a>
<a class="file-line-num diff-line-num" data-line-number="1679" href="#L1679" id="L1679">
1679
</a>
<a class="file-line-num diff-line-num" data-line-number="1680" href="#L1680" id="L1680">
1680
</a>
<a class="file-line-num diff-line-num" data-line-number="1681" href="#L1681" id="L1681">
1681
</a>
<a class="file-line-num diff-line-num" data-line-number="1682" href="#L1682" id="L1682">
1682
</a>
<a class="file-line-num diff-line-num" data-line-number="1683" href="#L1683" id="L1683">
1683
</a>
<a class="file-line-num diff-line-num" data-line-number="1684" href="#L1684" id="L1684">
1684
</a>
<a class="file-line-num diff-line-num" data-line-number="1685" href="#L1685" id="L1685">
1685
</a>
<a class="file-line-num diff-line-num" data-line-number="1686" href="#L1686" id="L1686">
1686
</a>
<a class="file-line-num diff-line-num" data-line-number="1687" href="#L1687" id="L1687">
1687
</a>
<a class="file-line-num diff-line-num" data-line-number="1688" href="#L1688" id="L1688">
1688
</a>
<a class="file-line-num diff-line-num" data-line-number="1689" href="#L1689" id="L1689">
1689
</a>
<a class="file-line-num diff-line-num" data-line-number="1690" href="#L1690" id="L1690">
1690
</a>
<a class="file-line-num diff-line-num" data-line-number="1691" href="#L1691" id="L1691">
1691
</a>
<a class="file-line-num diff-line-num" data-line-number="1692" href="#L1692" id="L1692">
1692
</a>
<a class="file-line-num diff-line-num" data-line-number="1693" href="#L1693" id="L1693">
1693
</a>
<a class="file-line-num diff-line-num" data-line-number="1694" href="#L1694" id="L1694">
1694
</a>
<a class="file-line-num diff-line-num" data-line-number="1695" href="#L1695" id="L1695">
1695
</a>
<a class="file-line-num diff-line-num" data-line-number="1696" href="#L1696" id="L1696">
1696
</a>
<a class="file-line-num diff-line-num" data-line-number="1697" href="#L1697" id="L1697">
1697
</a>
<a class="file-line-num diff-line-num" data-line-number="1698" href="#L1698" id="L1698">
1698
</a>
<a class="file-line-num diff-line-num" data-line-number="1699" href="#L1699" id="L1699">
1699
</a>
<a class="file-line-num diff-line-num" data-line-number="1700" href="#L1700" id="L1700">
1700
</a>
<a class="file-line-num diff-line-num" data-line-number="1701" href="#L1701" id="L1701">
1701
</a>
<a class="file-line-num diff-line-num" data-line-number="1702" href="#L1702" id="L1702">
1702
</a>
<a class="file-line-num diff-line-num" data-line-number="1703" href="#L1703" id="L1703">
1703
</a>
<a class="file-line-num diff-line-num" data-line-number="1704" href="#L1704" id="L1704">
1704
</a>
<a class="file-line-num diff-line-num" data-line-number="1705" href="#L1705" id="L1705">
1705
</a>
<a class="file-line-num diff-line-num" data-line-number="1706" href="#L1706" id="L1706">
1706
</a>
<a class="file-line-num diff-line-num" data-line-number="1707" href="#L1707" id="L1707">
1707
</a>
<a class="file-line-num diff-line-num" data-line-number="1708" href="#L1708" id="L1708">
1708
</a>
<a class="file-line-num diff-line-num" data-line-number="1709" href="#L1709" id="L1709">
1709
</a>
<a class="file-line-num diff-line-num" data-line-number="1710" href="#L1710" id="L1710">
1710
</a>
<a class="file-line-num diff-line-num" data-line-number="1711" href="#L1711" id="L1711">
1711
</a>
<a class="file-line-num diff-line-num" data-line-number="1712" href="#L1712" id="L1712">
1712
</a>
<a class="file-line-num diff-line-num" data-line-number="1713" href="#L1713" id="L1713">
1713
</a>
<a class="file-line-num diff-line-num" data-line-number="1714" href="#L1714" id="L1714">
1714
</a>
<a class="file-line-num diff-line-num" data-line-number="1715" href="#L1715" id="L1715">
1715
</a>
<a class="file-line-num diff-line-num" data-line-number="1716" href="#L1716" id="L1716">
1716
</a>
<a class="file-line-num diff-line-num" data-line-number="1717" href="#L1717" id="L1717">
1717
</a>
<a class="file-line-num diff-line-num" data-line-number="1718" href="#L1718" id="L1718">
1718
</a>
<a class="file-line-num diff-line-num" data-line-number="1719" href="#L1719" id="L1719">
1719
</a>
<a class="file-line-num diff-line-num" data-line-number="1720" href="#L1720" id="L1720">
1720
</a>
<a class="file-line-num diff-line-num" data-line-number="1721" href="#L1721" id="L1721">
1721
</a>
<a class="file-line-num diff-line-num" data-line-number="1722" href="#L1722" id="L1722">
1722
</a>
<a class="file-line-num diff-line-num" data-line-number="1723" href="#L1723" id="L1723">
1723
</a>
<a class="file-line-num diff-line-num" data-line-number="1724" href="#L1724" id="L1724">
1724
</a>
<a class="file-line-num diff-line-num" data-line-number="1725" href="#L1725" id="L1725">
1725
</a>
<a class="file-line-num diff-line-num" data-line-number="1726" href="#L1726" id="L1726">
1726
</a>
<a class="file-line-num diff-line-num" data-line-number="1727" href="#L1727" id="L1727">
1727
</a>
<a class="file-line-num diff-line-num" data-line-number="1728" href="#L1728" id="L1728">
1728
</a>
<a class="file-line-num diff-line-num" data-line-number="1729" href="#L1729" id="L1729">
1729
</a>
<a class="file-line-num diff-line-num" data-line-number="1730" href="#L1730" id="L1730">
1730
</a>
<a class="file-line-num diff-line-num" data-line-number="1731" href="#L1731" id="L1731">
1731
</a>
<a class="file-line-num diff-line-num" data-line-number="1732" href="#L1732" id="L1732">
1732
</a>
<a class="file-line-num diff-line-num" data-line-number="1733" href="#L1733" id="L1733">
1733
</a>
<a class="file-line-num diff-line-num" data-line-number="1734" href="#L1734" id="L1734">
1734
</a>
<a class="file-line-num diff-line-num" data-line-number="1735" href="#L1735" id="L1735">
1735
</a>
<a class="file-line-num diff-line-num" data-line-number="1736" href="#L1736" id="L1736">
1736
</a>
<a class="file-line-num diff-line-num" data-line-number="1737" href="#L1737" id="L1737">
1737
</a>
<a class="file-line-num diff-line-num" data-line-number="1738" href="#L1738" id="L1738">
1738
</a>
<a class="file-line-num diff-line-num" data-line-number="1739" href="#L1739" id="L1739">
1739
</a>
<a class="file-line-num diff-line-num" data-line-number="1740" href="#L1740" id="L1740">
1740
</a>
<a class="file-line-num diff-line-num" data-line-number="1741" href="#L1741" id="L1741">
1741
</a>
<a class="file-line-num diff-line-num" data-line-number="1742" href="#L1742" id="L1742">
1742
</a>
<a class="file-line-num diff-line-num" data-line-number="1743" href="#L1743" id="L1743">
1743
</a>
<a class="file-line-num diff-line-num" data-line-number="1744" href="#L1744" id="L1744">
1744
</a>
<a class="file-line-num diff-line-num" data-line-number="1745" href="#L1745" id="L1745">
1745
</a>
<a class="file-line-num diff-line-num" data-line-number="1746" href="#L1746" id="L1746">
1746
</a>
<a class="file-line-num diff-line-num" data-line-number="1747" href="#L1747" id="L1747">
1747
</a>
<a class="file-line-num diff-line-num" data-line-number="1748" href="#L1748" id="L1748">
1748
</a>
<a class="file-line-num diff-line-num" data-line-number="1749" href="#L1749" id="L1749">
1749
</a>
<a class="file-line-num diff-line-num" data-line-number="1750" href="#L1750" id="L1750">
1750
</a>
<a class="file-line-num diff-line-num" data-line-number="1751" href="#L1751" id="L1751">
1751
</a>
<a class="file-line-num diff-line-num" data-line-number="1752" href="#L1752" id="L1752">
1752
</a>
<a class="file-line-num diff-line-num" data-line-number="1753" href="#L1753" id="L1753">
1753
</a>
<a class="file-line-num diff-line-num" data-line-number="1754" href="#L1754" id="L1754">
1754
</a>
<a class="file-line-num diff-line-num" data-line-number="1755" href="#L1755" id="L1755">
1755
</a>
<a class="file-line-num diff-line-num" data-line-number="1756" href="#L1756" id="L1756">
1756
</a>
<a class="file-line-num diff-line-num" data-line-number="1757" href="#L1757" id="L1757">
1757
</a>
<a class="file-line-num diff-line-num" data-line-number="1758" href="#L1758" id="L1758">
1758
</a>
<a class="file-line-num diff-line-num" data-line-number="1759" href="#L1759" id="L1759">
1759
</a>
<a class="file-line-num diff-line-num" data-line-number="1760" href="#L1760" id="L1760">
1760
</a>
<a class="file-line-num diff-line-num" data-line-number="1761" href="#L1761" id="L1761">
1761
</a>
<a class="file-line-num diff-line-num" data-line-number="1762" href="#L1762" id="L1762">
1762
</a>
<a class="file-line-num diff-line-num" data-line-number="1763" href="#L1763" id="L1763">
1763
</a>
<a class="file-line-num diff-line-num" data-line-number="1764" href="#L1764" id="L1764">
1764
</a>
<a class="file-line-num diff-line-num" data-line-number="1765" href="#L1765" id="L1765">
1765
</a>
<a class="file-line-num diff-line-num" data-line-number="1766" href="#L1766" id="L1766">
1766
</a>
<a class="file-line-num diff-line-num" data-line-number="1767" href="#L1767" id="L1767">
1767
</a>
<a class="file-line-num diff-line-num" data-line-number="1768" href="#L1768" id="L1768">
1768
</a>
<a class="file-line-num diff-line-num" data-line-number="1769" href="#L1769" id="L1769">
1769
</a>
<a class="file-line-num diff-line-num" data-line-number="1770" href="#L1770" id="L1770">
1770
</a>
<a class="file-line-num diff-line-num" data-line-number="1771" href="#L1771" id="L1771">
1771
</a>
<a class="file-line-num diff-line-num" data-line-number="1772" href="#L1772" id="L1772">
1772
</a>
<a class="file-line-num diff-line-num" data-line-number="1773" href="#L1773" id="L1773">
1773
</a>
<a class="file-line-num diff-line-num" data-line-number="1774" href="#L1774" id="L1774">
1774
</a>
<a class="file-line-num diff-line-num" data-line-number="1775" href="#L1775" id="L1775">
1775
</a>
<a class="file-line-num diff-line-num" data-line-number="1776" href="#L1776" id="L1776">
1776
</a>
<a class="file-line-num diff-line-num" data-line-number="1777" href="#L1777" id="L1777">
1777
</a>
<a class="file-line-num diff-line-num" data-line-number="1778" href="#L1778" id="L1778">
1778
</a>
<a class="file-line-num diff-line-num" data-line-number="1779" href="#L1779" id="L1779">
1779
</a>
<a class="file-line-num diff-line-num" data-line-number="1780" href="#L1780" id="L1780">
1780
</a>
<a class="file-line-num diff-line-num" data-line-number="1781" href="#L1781" id="L1781">
1781
</a>
<a class="file-line-num diff-line-num" data-line-number="1782" href="#L1782" id="L1782">
1782
</a>
<a class="file-line-num diff-line-num" data-line-number="1783" href="#L1783" id="L1783">
1783
</a>
<a class="file-line-num diff-line-num" data-line-number="1784" href="#L1784" id="L1784">
1784
</a>
<a class="file-line-num diff-line-num" data-line-number="1785" href="#L1785" id="L1785">
1785
</a>
<a class="file-line-num diff-line-num" data-line-number="1786" href="#L1786" id="L1786">
1786
</a>
<a class="file-line-num diff-line-num" data-line-number="1787" href="#L1787" id="L1787">
1787
</a>
<a class="file-line-num diff-line-num" data-line-number="1788" href="#L1788" id="L1788">
1788
</a>
<a class="file-line-num diff-line-num" data-line-number="1789" href="#L1789" id="L1789">
1789
</a>
<a class="file-line-num diff-line-num" data-line-number="1790" href="#L1790" id="L1790">
1790
</a>
<a class="file-line-num diff-line-num" data-line-number="1791" href="#L1791" id="L1791">
1791
</a>
<a class="file-line-num diff-line-num" data-line-number="1792" href="#L1792" id="L1792">
1792
</a>
<a class="file-line-num diff-line-num" data-line-number="1793" href="#L1793" id="L1793">
1793
</a>
<a class="file-line-num diff-line-num" data-line-number="1794" href="#L1794" id="L1794">
1794
</a>
<a class="file-line-num diff-line-num" data-line-number="1795" href="#L1795" id="L1795">
1795
</a>
<a class="file-line-num diff-line-num" data-line-number="1796" href="#L1796" id="L1796">
1796
</a>
<a class="file-line-num diff-line-num" data-line-number="1797" href="#L1797" id="L1797">
1797
</a>
<a class="file-line-num diff-line-num" data-line-number="1798" href="#L1798" id="L1798">
1798
</a>
<a class="file-line-num diff-line-num" data-line-number="1799" href="#L1799" id="L1799">
1799
</a>
<a class="file-line-num diff-line-num" data-line-number="1800" href="#L1800" id="L1800">
1800
</a>
<a class="file-line-num diff-line-num" data-line-number="1801" href="#L1801" id="L1801">
1801
</a>
<a class="file-line-num diff-line-num" data-line-number="1802" href="#L1802" id="L1802">
1802
</a>
<a class="file-line-num diff-line-num" data-line-number="1803" href="#L1803" id="L1803">
1803
</a>
<a class="file-line-num diff-line-num" data-line-number="1804" href="#L1804" id="L1804">
1804
</a>
<a class="file-line-num diff-line-num" data-line-number="1805" href="#L1805" id="L1805">
1805
</a>
<a class="file-line-num diff-line-num" data-line-number="1806" href="#L1806" id="L1806">
1806
</a>
<a class="file-line-num diff-line-num" data-line-number="1807" href="#L1807" id="L1807">
1807
</a>
<a class="file-line-num diff-line-num" data-line-number="1808" href="#L1808" id="L1808">
1808
</a>
<a class="file-line-num diff-line-num" data-line-number="1809" href="#L1809" id="L1809">
1809
</a>
<a class="file-line-num diff-line-num" data-line-number="1810" href="#L1810" id="L1810">
1810
</a>
<a class="file-line-num diff-line-num" data-line-number="1811" href="#L1811" id="L1811">
1811
</a>
<a class="file-line-num diff-line-num" data-line-number="1812" href="#L1812" id="L1812">
1812
</a>
<a class="file-line-num diff-line-num" data-line-number="1813" href="#L1813" id="L1813">
1813
</a>
<a class="file-line-num diff-line-num" data-line-number="1814" href="#L1814" id="L1814">
1814
</a>
<a class="file-line-num diff-line-num" data-line-number="1815" href="#L1815" id="L1815">
1815
</a>
<a class="file-line-num diff-line-num" data-line-number="1816" href="#L1816" id="L1816">
1816
</a>
<a class="file-line-num diff-line-num" data-line-number="1817" href="#L1817" id="L1817">
1817
</a>
<a class="file-line-num diff-line-num" data-line-number="1818" href="#L1818" id="L1818">
1818
</a>
<a class="file-line-num diff-line-num" data-line-number="1819" href="#L1819" id="L1819">
1819
</a>
<a class="file-line-num diff-line-num" data-line-number="1820" href="#L1820" id="L1820">
1820
</a>
<a class="file-line-num diff-line-num" data-line-number="1821" href="#L1821" id="L1821">
1821
</a>
<a class="file-line-num diff-line-num" data-line-number="1822" href="#L1822" id="L1822">
1822
</a>
<a class="file-line-num diff-line-num" data-line-number="1823" href="#L1823" id="L1823">
1823
</a>
<a class="file-line-num diff-line-num" data-line-number="1824" href="#L1824" id="L1824">
1824
</a>
<a class="file-line-num diff-line-num" data-line-number="1825" href="#L1825" id="L1825">
1825
</a>
<a class="file-line-num diff-line-num" data-line-number="1826" href="#L1826" id="L1826">
1826
</a>
<a class="file-line-num diff-line-num" data-line-number="1827" href="#L1827" id="L1827">
1827
</a>
<a class="file-line-num diff-line-num" data-line-number="1828" href="#L1828" id="L1828">
1828
</a>
<a class="file-line-num diff-line-num" data-line-number="1829" href="#L1829" id="L1829">
1829
</a>
<a class="file-line-num diff-line-num" data-line-number="1830" href="#L1830" id="L1830">
1830
</a>
<a class="file-line-num diff-line-num" data-line-number="1831" href="#L1831" id="L1831">
1831
</a>
<a class="file-line-num diff-line-num" data-line-number="1832" href="#L1832" id="L1832">
1832
</a>
<a class="file-line-num diff-line-num" data-line-number="1833" href="#L1833" id="L1833">
1833
</a>
<a class="file-line-num diff-line-num" data-line-number="1834" href="#L1834" id="L1834">
1834
</a>
<a class="file-line-num diff-line-num" data-line-number="1835" href="#L1835" id="L1835">
1835
</a>
<a class="file-line-num diff-line-num" data-line-number="1836" href="#L1836" id="L1836">
1836
</a>
<a class="file-line-num diff-line-num" data-line-number="1837" href="#L1837" id="L1837">
1837
</a>
<a class="file-line-num diff-line-num" data-line-number="1838" href="#L1838" id="L1838">
1838
</a>
<a class="file-line-num diff-line-num" data-line-number="1839" href="#L1839" id="L1839">
1839
</a>
<a class="file-line-num diff-line-num" data-line-number="1840" href="#L1840" id="L1840">
1840
</a>
<a class="file-line-num diff-line-num" data-line-number="1841" href="#L1841" id="L1841">
1841
</a>
<a class="file-line-num diff-line-num" data-line-number="1842" href="#L1842" id="L1842">
1842
</a>
<a class="file-line-num diff-line-num" data-line-number="1843" href="#L1843" id="L1843">
1843
</a>
<a class="file-line-num diff-line-num" data-line-number="1844" href="#L1844" id="L1844">
1844
</a>
<a class="file-line-num diff-line-num" data-line-number="1845" href="#L1845" id="L1845">
1845
</a>
<a class="file-line-num diff-line-num" data-line-number="1846" href="#L1846" id="L1846">
1846
</a>
<a class="file-line-num diff-line-num" data-line-number="1847" href="#L1847" id="L1847">
1847
</a>
<a class="file-line-num diff-line-num" data-line-number="1848" href="#L1848" id="L1848">
1848
</a>
<a class="file-line-num diff-line-num" data-line-number="1849" href="#L1849" id="L1849">
1849
</a>
<a class="file-line-num diff-line-num" data-line-number="1850" href="#L1850" id="L1850">
1850
</a>
<a class="file-line-num diff-line-num" data-line-number="1851" href="#L1851" id="L1851">
1851
</a>
<a class="file-line-num diff-line-num" data-line-number="1852" href="#L1852" id="L1852">
1852
</a>
<a class="file-line-num diff-line-num" data-line-number="1853" href="#L1853" id="L1853">
1853
</a>
<a class="file-line-num diff-line-num" data-line-number="1854" href="#L1854" id="L1854">
1854
</a>
<a class="file-line-num diff-line-num" data-line-number="1855" href="#L1855" id="L1855">
1855
</a>
<a class="file-line-num diff-line-num" data-line-number="1856" href="#L1856" id="L1856">
1856
</a>
<a class="file-line-num diff-line-num" data-line-number="1857" href="#L1857" id="L1857">
1857
</a>
<a class="file-line-num diff-line-num" data-line-number="1858" href="#L1858" id="L1858">
1858
</a>
<a class="file-line-num diff-line-num" data-line-number="1859" href="#L1859" id="L1859">
1859
</a>
<a class="file-line-num diff-line-num" data-line-number="1860" href="#L1860" id="L1860">
1860
</a>
<a class="file-line-num diff-line-num" data-line-number="1861" href="#L1861" id="L1861">
1861
</a>
<a class="file-line-num diff-line-num" data-line-number="1862" href="#L1862" id="L1862">
1862
</a>
<a class="file-line-num diff-line-num" data-line-number="1863" href="#L1863" id="L1863">
1863
</a>
<a class="file-line-num diff-line-num" data-line-number="1864" href="#L1864" id="L1864">
1864
</a>
<a class="file-line-num diff-line-num" data-line-number="1865" href="#L1865" id="L1865">
1865
</a>
<a class="file-line-num diff-line-num" data-line-number="1866" href="#L1866" id="L1866">
1866
</a>
<a class="file-line-num diff-line-num" data-line-number="1867" href="#L1867" id="L1867">
1867
</a>
<a class="file-line-num diff-line-num" data-line-number="1868" href="#L1868" id="L1868">
1868
</a>
<a class="file-line-num diff-line-num" data-line-number="1869" href="#L1869" id="L1869">
1869
</a>
<a class="file-line-num diff-line-num" data-line-number="1870" href="#L1870" id="L1870">
1870
</a>
<a class="file-line-num diff-line-num" data-line-number="1871" href="#L1871" id="L1871">
1871
</a>
<a class="file-line-num diff-line-num" data-line-number="1872" href="#L1872" id="L1872">
1872
</a>
<a class="file-line-num diff-line-num" data-line-number="1873" href="#L1873" id="L1873">
1873
</a>
<a class="file-line-num diff-line-num" data-line-number="1874" href="#L1874" id="L1874">
1874
</a>
<a class="file-line-num diff-line-num" data-line-number="1875" href="#L1875" id="L1875">
1875
</a>
<a class="file-line-num diff-line-num" data-line-number="1876" href="#L1876" id="L1876">
1876
</a>
<a class="file-line-num diff-line-num" data-line-number="1877" href="#L1877" id="L1877">
1877
</a>
<a class="file-line-num diff-line-num" data-line-number="1878" href="#L1878" id="L1878">
1878
</a>
<a class="file-line-num diff-line-num" data-line-number="1879" href="#L1879" id="L1879">
1879
</a>
<a class="file-line-num diff-line-num" data-line-number="1880" href="#L1880" id="L1880">
1880
</a>
<a class="file-line-num diff-line-num" data-line-number="1881" href="#L1881" id="L1881">
1881
</a>
<a class="file-line-num diff-line-num" data-line-number="1882" href="#L1882" id="L1882">
1882
</a>
<a class="file-line-num diff-line-num" data-line-number="1883" href="#L1883" id="L1883">
1883
</a>
<a class="file-line-num diff-line-num" data-line-number="1884" href="#L1884" id="L1884">
1884
</a>
<a class="file-line-num diff-line-num" data-line-number="1885" href="#L1885" id="L1885">
1885
</a>
<a class="file-line-num diff-line-num" data-line-number="1886" href="#L1886" id="L1886">
1886
</a>
<a class="file-line-num diff-line-num" data-line-number="1887" href="#L1887" id="L1887">
1887
</a>
<a class="file-line-num diff-line-num" data-line-number="1888" href="#L1888" id="L1888">
1888
</a>
<a class="file-line-num diff-line-num" data-line-number="1889" href="#L1889" id="L1889">
1889
</a>
<a class="file-line-num diff-line-num" data-line-number="1890" href="#L1890" id="L1890">
1890
</a>
<a class="file-line-num diff-line-num" data-line-number="1891" href="#L1891" id="L1891">
1891
</a>
<a class="file-line-num diff-line-num" data-line-number="1892" href="#L1892" id="L1892">
1892
</a>
<a class="file-line-num diff-line-num" data-line-number="1893" href="#L1893" id="L1893">
1893
</a>
<a class="file-line-num diff-line-num" data-line-number="1894" href="#L1894" id="L1894">
1894
</a>
<a class="file-line-num diff-line-num" data-line-number="1895" href="#L1895" id="L1895">
1895
</a>
<a class="file-line-num diff-line-num" data-line-number="1896" href="#L1896" id="L1896">
1896
</a>
<a class="file-line-num diff-line-num" data-line-number="1897" href="#L1897" id="L1897">
1897
</a>
<a class="file-line-num diff-line-num" data-line-number="1898" href="#L1898" id="L1898">
1898
</a>
<a class="file-line-num diff-line-num" data-line-number="1899" href="#L1899" id="L1899">
1899
</a>
<a class="file-line-num diff-line-num" data-line-number="1900" href="#L1900" id="L1900">
1900
</a>
<a class="file-line-num diff-line-num" data-line-number="1901" href="#L1901" id="L1901">
1901
</a>
<a class="file-line-num diff-line-num" data-line-number="1902" href="#L1902" id="L1902">
1902
</a>
<a class="file-line-num diff-line-num" data-line-number="1903" href="#L1903" id="L1903">
1903
</a>
<a class="file-line-num diff-line-num" data-line-number="1904" href="#L1904" id="L1904">
1904
</a>
<a class="file-line-num diff-line-num" data-line-number="1905" href="#L1905" id="L1905">
1905
</a>
<a class="file-line-num diff-line-num" data-line-number="1906" href="#L1906" id="L1906">
1906
</a>
<a class="file-line-num diff-line-num" data-line-number="1907" href="#L1907" id="L1907">
1907
</a>
<a class="file-line-num diff-line-num" data-line-number="1908" href="#L1908" id="L1908">
1908
</a>
<a class="file-line-num diff-line-num" data-line-number="1909" href="#L1909" id="L1909">
1909
</a>
<a class="file-line-num diff-line-num" data-line-number="1910" href="#L1910" id="L1910">
1910
</a>
<a class="file-line-num diff-line-num" data-line-number="1911" href="#L1911" id="L1911">
1911
</a>
<a class="file-line-num diff-line-num" data-line-number="1912" href="#L1912" id="L1912">
1912
</a>
<a class="file-line-num diff-line-num" data-line-number="1913" href="#L1913" id="L1913">
1913
</a>
<a class="file-line-num diff-line-num" data-line-number="1914" href="#L1914" id="L1914">
1914
</a>
<a class="file-line-num diff-line-num" data-line-number="1915" href="#L1915" id="L1915">
1915
</a>
<a class="file-line-num diff-line-num" data-line-number="1916" href="#L1916" id="L1916">
1916
</a>
<a class="file-line-num diff-line-num" data-line-number="1917" href="#L1917" id="L1917">
1917
</a>
<a class="file-line-num diff-line-num" data-line-number="1918" href="#L1918" id="L1918">
1918
</a>
<a class="file-line-num diff-line-num" data-line-number="1919" href="#L1919" id="L1919">
1919
</a>
<a class="file-line-num diff-line-num" data-line-number="1920" href="#L1920" id="L1920">
1920
</a>
<a class="file-line-num diff-line-num" data-line-number="1921" href="#L1921" id="L1921">
1921
</a>
<a class="file-line-num diff-line-num" data-line-number="1922" href="#L1922" id="L1922">
1922
</a>
<a class="file-line-num diff-line-num" data-line-number="1923" href="#L1923" id="L1923">
1923
</a>
<a class="file-line-num diff-line-num" data-line-number="1924" href="#L1924" id="L1924">
1924
</a>
<a class="file-line-num diff-line-num" data-line-number="1925" href="#L1925" id="L1925">
1925
</a>
<a class="file-line-num diff-line-num" data-line-number="1926" href="#L1926" id="L1926">
1926
</a>
<a class="file-line-num diff-line-num" data-line-number="1927" href="#L1927" id="L1927">
1927
</a>
<a class="file-line-num diff-line-num" data-line-number="1928" href="#L1928" id="L1928">
1928
</a>
<a class="file-line-num diff-line-num" data-line-number="1929" href="#L1929" id="L1929">
1929
</a>
<a class="file-line-num diff-line-num" data-line-number="1930" href="#L1930" id="L1930">
1930
</a>
<a class="file-line-num diff-line-num" data-line-number="1931" href="#L1931" id="L1931">
1931
</a>
<a class="file-line-num diff-line-num" data-line-number="1932" href="#L1932" id="L1932">
1932
</a>
<a class="file-line-num diff-line-num" data-line-number="1933" href="#L1933" id="L1933">
1933
</a>
<a class="file-line-num diff-line-num" data-line-number="1934" href="#L1934" id="L1934">
1934
</a>
<a class="file-line-num diff-line-num" data-line-number="1935" href="#L1935" id="L1935">
1935
</a>
<a class="file-line-num diff-line-num" data-line-number="1936" href="#L1936" id="L1936">
1936
</a>
<a class="file-line-num diff-line-num" data-line-number="1937" href="#L1937" id="L1937">
1937
</a>
<a class="file-line-num diff-line-num" data-line-number="1938" href="#L1938" id="L1938">
1938
</a>
<a class="file-line-num diff-line-num" data-line-number="1939" href="#L1939" id="L1939">
1939
</a>
<a class="file-line-num diff-line-num" data-line-number="1940" href="#L1940" id="L1940">
1940
</a>
<a class="file-line-num diff-line-num" data-line-number="1941" href="#L1941" id="L1941">
1941
</a>
<a class="file-line-num diff-line-num" data-line-number="1942" href="#L1942" id="L1942">
1942
</a>
<a class="file-line-num diff-line-num" data-line-number="1943" href="#L1943" id="L1943">
1943
</a>
<a class="file-line-num diff-line-num" data-line-number="1944" href="#L1944" id="L1944">
1944
</a>
<a class="file-line-num diff-line-num" data-line-number="1945" href="#L1945" id="L1945">
1945
</a>
<a class="file-line-num diff-line-num" data-line-number="1946" href="#L1946" id="L1946">
1946
</a>
<a class="file-line-num diff-line-num" data-line-number="1947" href="#L1947" id="L1947">
1947
</a>
<a class="file-line-num diff-line-num" data-line-number="1948" href="#L1948" id="L1948">
1948
</a>
<a class="file-line-num diff-line-num" data-line-number="1949" href="#L1949" id="L1949">
1949
</a>
<a class="file-line-num diff-line-num" data-line-number="1950" href="#L1950" id="L1950">
1950
</a>
<a class="file-line-num diff-line-num" data-line-number="1951" href="#L1951" id="L1951">
1951
</a>
<a class="file-line-num diff-line-num" data-line-number="1952" href="#L1952" id="L1952">
1952
</a>
<a class="file-line-num diff-line-num" data-line-number="1953" href="#L1953" id="L1953">
1953
</a>
<a class="file-line-num diff-line-num" data-line-number="1954" href="#L1954" id="L1954">
1954
</a>
<a class="file-line-num diff-line-num" data-line-number="1955" href="#L1955" id="L1955">
1955
</a>
<a class="file-line-num diff-line-num" data-line-number="1956" href="#L1956" id="L1956">
1956
</a>
<a class="file-line-num diff-line-num" data-line-number="1957" href="#L1957" id="L1957">
1957
</a>
<a class="file-line-num diff-line-num" data-line-number="1958" href="#L1958" id="L1958">
1958
</a>
<a class="file-line-num diff-line-num" data-line-number="1959" href="#L1959" id="L1959">
1959
</a>
<a class="file-line-num diff-line-num" data-line-number="1960" href="#L1960" id="L1960">
1960
</a>
<a class="file-line-num diff-line-num" data-line-number="1961" href="#L1961" id="L1961">
1961
</a>
<a class="file-line-num diff-line-num" data-line-number="1962" href="#L1962" id="L1962">
1962
</a>
<a class="file-line-num diff-line-num" data-line-number="1963" href="#L1963" id="L1963">
1963
</a>
<a class="file-line-num diff-line-num" data-line-number="1964" href="#L1964" id="L1964">
1964
</a>
<a class="file-line-num diff-line-num" data-line-number="1965" href="#L1965" id="L1965">
1965
</a>
<a class="file-line-num diff-line-num" data-line-number="1966" href="#L1966" id="L1966">
1966
</a>
<a class="file-line-num diff-line-num" data-line-number="1967" href="#L1967" id="L1967">
1967
</a>
<a class="file-line-num diff-line-num" data-line-number="1968" href="#L1968" id="L1968">
1968
</a>
<a class="file-line-num diff-line-num" data-line-number="1969" href="#L1969" id="L1969">
1969
</a>
<a class="file-line-num diff-line-num" data-line-number="1970" href="#L1970" id="L1970">
1970
</a>
<a class="file-line-num diff-line-num" data-line-number="1971" href="#L1971" id="L1971">
1971
</a>
<a class="file-line-num diff-line-num" data-line-number="1972" href="#L1972" id="L1972">
1972
</a>
<a class="file-line-num diff-line-num" data-line-number="1973" href="#L1973" id="L1973">
1973
</a>
<a class="file-line-num diff-line-num" data-line-number="1974" href="#L1974" id="L1974">
1974
</a>
<a class="file-line-num diff-line-num" data-line-number="1975" href="#L1975" id="L1975">
1975
</a>
<a class="file-line-num diff-line-num" data-line-number="1976" href="#L1976" id="L1976">
1976
</a>
<a class="file-line-num diff-line-num" data-line-number="1977" href="#L1977" id="L1977">
1977
</a>
<a class="file-line-num diff-line-num" data-line-number="1978" href="#L1978" id="L1978">
1978
</a>
<a class="file-line-num diff-line-num" data-line-number="1979" href="#L1979" id="L1979">
1979
</a>
<a class="file-line-num diff-line-num" data-line-number="1980" href="#L1980" id="L1980">
1980
</a>
<a class="file-line-num diff-line-num" data-line-number="1981" href="#L1981" id="L1981">
1981
</a>
<a class="file-line-num diff-line-num" data-line-number="1982" href="#L1982" id="L1982">
1982
</a>
<a class="file-line-num diff-line-num" data-line-number="1983" href="#L1983" id="L1983">
1983
</a>
<a class="file-line-num diff-line-num" data-line-number="1984" href="#L1984" id="L1984">
1984
</a>
<a class="file-line-num diff-line-num" data-line-number="1985" href="#L1985" id="L1985">
1985
</a>
<a class="file-line-num diff-line-num" data-line-number="1986" href="#L1986" id="L1986">
1986
</a>
<a class="file-line-num diff-line-num" data-line-number="1987" href="#L1987" id="L1987">
1987
</a>
<a class="file-line-num diff-line-num" data-line-number="1988" href="#L1988" id="L1988">
1988
</a>
<a class="file-line-num diff-line-num" data-line-number="1989" href="#L1989" id="L1989">
1989
</a>
<a class="file-line-num diff-line-num" data-line-number="1990" href="#L1990" id="L1990">
1990
</a>
<a class="file-line-num diff-line-num" data-line-number="1991" href="#L1991" id="L1991">
1991
</a>
<a class="file-line-num diff-line-num" data-line-number="1992" href="#L1992" id="L1992">
1992
</a>
<a class="file-line-num diff-line-num" data-line-number="1993" href="#L1993" id="L1993">
1993
</a>
<a class="file-line-num diff-line-num" data-line-number="1994" href="#L1994" id="L1994">
1994
</a>
<a class="file-line-num diff-line-num" data-line-number="1995" href="#L1995" id="L1995">
1995
</a>
<a class="file-line-num diff-line-num" data-line-number="1996" href="#L1996" id="L1996">
1996
</a>
<a class="file-line-num diff-line-num" data-line-number="1997" href="#L1997" id="L1997">
1997
</a>
<a class="file-line-num diff-line-num" data-line-number="1998" href="#L1998" id="L1998">
1998
</a>
<a class="file-line-num diff-line-num" data-line-number="1999" href="#L1999" id="L1999">
1999
</a>
<a class="file-line-num diff-line-num" data-line-number="2000" href="#L2000" id="L2000">
2000
</a>
<a class="file-line-num diff-line-num" data-line-number="2001" href="#L2001" id="L2001">
2001
</a>
<a class="file-line-num diff-line-num" data-line-number="2002" href="#L2002" id="L2002">
2002
</a>
<a class="file-line-num diff-line-num" data-line-number="2003" href="#L2003" id="L2003">
2003
</a>
<a class="file-line-num diff-line-num" data-line-number="2004" href="#L2004" id="L2004">
2004
</a>
<a class="file-line-num diff-line-num" data-line-number="2005" href="#L2005" id="L2005">
2005
</a>
<a class="file-line-num diff-line-num" data-line-number="2006" href="#L2006" id="L2006">
2006
</a>
<a class="file-line-num diff-line-num" data-line-number="2007" href="#L2007" id="L2007">
2007
</a>
<a class="file-line-num diff-line-num" data-line-number="2008" href="#L2008" id="L2008">
2008
</a>
<a class="file-line-num diff-line-num" data-line-number="2009" href="#L2009" id="L2009">
2009
</a>
<a class="file-line-num diff-line-num" data-line-number="2010" href="#L2010" id="L2010">
2010
</a>
<a class="file-line-num diff-line-num" data-line-number="2011" href="#L2011" id="L2011">
2011
</a>
<a class="file-line-num diff-line-num" data-line-number="2012" href="#L2012" id="L2012">
2012
</a>
<a class="file-line-num diff-line-num" data-line-number="2013" href="#L2013" id="L2013">
2013
</a>
<a class="file-line-num diff-line-num" data-line-number="2014" href="#L2014" id="L2014">
2014
</a>
<a class="file-line-num diff-line-num" data-line-number="2015" href="#L2015" id="L2015">
2015
</a>
<a class="file-line-num diff-line-num" data-line-number="2016" href="#L2016" id="L2016">
2016
</a>
<a class="file-line-num diff-line-num" data-line-number="2017" href="#L2017" id="L2017">
2017
</a>
<a class="file-line-num diff-line-num" data-line-number="2018" href="#L2018" id="L2018">
2018
</a>
<a class="file-line-num diff-line-num" data-line-number="2019" href="#L2019" id="L2019">
2019
</a>
<a class="file-line-num diff-line-num" data-line-number="2020" href="#L2020" id="L2020">
2020
</a>
<a class="file-line-num diff-line-num" data-line-number="2021" href="#L2021" id="L2021">
2021
</a>
<a class="file-line-num diff-line-num" data-line-number="2022" href="#L2022" id="L2022">
2022
</a>
<a class="file-line-num diff-line-num" data-line-number="2023" href="#L2023" id="L2023">
2023
</a>
<a class="file-line-num diff-line-num" data-line-number="2024" href="#L2024" id="L2024">
2024
</a>
<a class="file-line-num diff-line-num" data-line-number="2025" href="#L2025" id="L2025">
2025
</a>
<a class="file-line-num diff-line-num" data-line-number="2026" href="#L2026" id="L2026">
2026
</a>
<a class="file-line-num diff-line-num" data-line-number="2027" href="#L2027" id="L2027">
2027
</a>
<a class="file-line-num diff-line-num" data-line-number="2028" href="#L2028" id="L2028">
2028
</a>
<a class="file-line-num diff-line-num" data-line-number="2029" href="#L2029" id="L2029">
2029
</a>
<a class="file-line-num diff-line-num" data-line-number="2030" href="#L2030" id="L2030">
2030
</a>
<a class="file-line-num diff-line-num" data-line-number="2031" href="#L2031" id="L2031">
2031
</a>
<a class="file-line-num diff-line-num" data-line-number="2032" href="#L2032" id="L2032">
2032
</a>
<a class="file-line-num diff-line-num" data-line-number="2033" href="#L2033" id="L2033">
2033
</a>
<a class="file-line-num diff-line-num" data-line-number="2034" href="#L2034" id="L2034">
2034
</a>
<a class="file-line-num diff-line-num" data-line-number="2035" href="#L2035" id="L2035">
2035
</a>
<a class="file-line-num diff-line-num" data-line-number="2036" href="#L2036" id="L2036">
2036
</a>
<a class="file-line-num diff-line-num" data-line-number="2037" href="#L2037" id="L2037">
2037
</a>
<a class="file-line-num diff-line-num" data-line-number="2038" href="#L2038" id="L2038">
2038
</a>
<a class="file-line-num diff-line-num" data-line-number="2039" href="#L2039" id="L2039">
2039
</a>
<a class="file-line-num diff-line-num" data-line-number="2040" href="#L2040" id="L2040">
2040
</a>
<a class="file-line-num diff-line-num" data-line-number="2041" href="#L2041" id="L2041">
2041
</a>
<a class="file-line-num diff-line-num" data-line-number="2042" href="#L2042" id="L2042">
2042
</a>
<a class="file-line-num diff-line-num" data-line-number="2043" href="#L2043" id="L2043">
2043
</a>
<a class="file-line-num diff-line-num" data-line-number="2044" href="#L2044" id="L2044">
2044
</a>
<a class="file-line-num diff-line-num" data-line-number="2045" href="#L2045" id="L2045">
2045
</a>
<a class="file-line-num diff-line-num" data-line-number="2046" href="#L2046" id="L2046">
2046
</a>
<a class="file-line-num diff-line-num" data-line-number="2047" href="#L2047" id="L2047">
2047
</a>
<a class="file-line-num diff-line-num" data-line-number="2048" href="#L2048" id="L2048">
2048
</a>
<a class="file-line-num diff-line-num" data-line-number="2049" href="#L2049" id="L2049">
2049
</a>
<a class="file-line-num diff-line-num" data-line-number="2050" href="#L2050" id="L2050">
2050
</a>
<a class="file-line-num diff-line-num" data-line-number="2051" href="#L2051" id="L2051">
2051
</a>
<a class="file-line-num diff-line-num" data-line-number="2052" href="#L2052" id="L2052">
2052
</a>
<a class="file-line-num diff-line-num" data-line-number="2053" href="#L2053" id="L2053">
2053
</a>
<a class="file-line-num diff-line-num" data-line-number="2054" href="#L2054" id="L2054">
2054
</a>
<a class="file-line-num diff-line-num" data-line-number="2055" href="#L2055" id="L2055">
2055
</a>
<a class="file-line-num diff-line-num" data-line-number="2056" href="#L2056" id="L2056">
2056
</a>
<a class="file-line-num diff-line-num" data-line-number="2057" href="#L2057" id="L2057">
2057
</a>
<a class="file-line-num diff-line-num" data-line-number="2058" href="#L2058" id="L2058">
2058
</a>
<a class="file-line-num diff-line-num" data-line-number="2059" href="#L2059" id="L2059">
2059
</a>
<a class="file-line-num diff-line-num" data-line-number="2060" href="#L2060" id="L2060">
2060
</a>
<a class="file-line-num diff-line-num" data-line-number="2061" href="#L2061" id="L2061">
2061
</a>
<a class="file-line-num diff-line-num" data-line-number="2062" href="#L2062" id="L2062">
2062
</a>
<a class="file-line-num diff-line-num" data-line-number="2063" href="#L2063" id="L2063">
2063
</a>
<a class="file-line-num diff-line-num" data-line-number="2064" href="#L2064" id="L2064">
2064
</a>
<a class="file-line-num diff-line-num" data-line-number="2065" href="#L2065" id="L2065">
2065
</a>
<a class="file-line-num diff-line-num" data-line-number="2066" href="#L2066" id="L2066">
2066
</a>
<a class="file-line-num diff-line-num" data-line-number="2067" href="#L2067" id="L2067">
2067
</a>
<a class="file-line-num diff-line-num" data-line-number="2068" href="#L2068" id="L2068">
2068
</a>
<a class="file-line-num diff-line-num" data-line-number="2069" href="#L2069" id="L2069">
2069
</a>
<a class="file-line-num diff-line-num" data-line-number="2070" href="#L2070" id="L2070">
2070
</a>
<a class="file-line-num diff-line-num" data-line-number="2071" href="#L2071" id="L2071">
2071
</a>
<a class="file-line-num diff-line-num" data-line-number="2072" href="#L2072" id="L2072">
2072
</a>
<a class="file-line-num diff-line-num" data-line-number="2073" href="#L2073" id="L2073">
2073
</a>
<a class="file-line-num diff-line-num" data-line-number="2074" href="#L2074" id="L2074">
2074
</a>
<a class="file-line-num diff-line-num" data-line-number="2075" href="#L2075" id="L2075">
2075
</a>
<a class="file-line-num diff-line-num" data-line-number="2076" href="#L2076" id="L2076">
2076
</a>
<a class="file-line-num diff-line-num" data-line-number="2077" href="#L2077" id="L2077">
2077
</a>
<a class="file-line-num diff-line-num" data-line-number="2078" href="#L2078" id="L2078">
2078
</a>
<a class="file-line-num diff-line-num" data-line-number="2079" href="#L2079" id="L2079">
2079
</a>
<a class="file-line-num diff-line-num" data-line-number="2080" href="#L2080" id="L2080">
2080
</a>
<a class="file-line-num diff-line-num" data-line-number="2081" href="#L2081" id="L2081">
2081
</a>
<a class="file-line-num diff-line-num" data-line-number="2082" href="#L2082" id="L2082">
2082
</a>
<a class="file-line-num diff-line-num" data-line-number="2083" href="#L2083" id="L2083">
2083
</a>
<a class="file-line-num diff-line-num" data-line-number="2084" href="#L2084" id="L2084">
2084
</a>
<a class="file-line-num diff-line-num" data-line-number="2085" href="#L2085" id="L2085">
2085
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.</span></span>
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
<span id="LC26" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC27" class="line" lang="java"><span class="cm"> **********************************************************************</span></span>
<span id="LC28" class="line" lang="java"><span class="cm"> **********************************************************************</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> **********************************************************************</span></span>
<span id="LC30" class="line" lang="java"><span class="cm"> *** COPYRIGHT (c) Eastman Kodak Company, 1997                      ***</span></span>
<span id="LC31" class="line" lang="java"><span class="cm"> *** As  an unpublished  work pursuant to Title 17 of the United    ***</span></span>
<span id="LC32" class="line" lang="java"><span class="cm"> *** States Code.  All rights reserved.                             ***</span></span>
<span id="LC33" class="line" lang="java"><span class="cm"> **********************************************************************</span></span>
<span id="LC34" class="line" lang="java"><span class="cm"> **********************************************************************</span></span>
<span id="LC35" class="line" lang="java"><span class="cm"> **********************************************************************/</span></span>
<span id="LC36" class="line" lang="java"></span>
<span id="LC37" class="line" lang="java"><span class="kn">package</span> <span class="nn">java.awt.color</span><span class="o">;</span></span>
<span id="LC38" class="line" lang="java"></span>
<span id="LC39" class="line" lang="java"><span class="kn">import</span> <span class="nn">sun.java2d.cmm.PCMM</span><span class="o">;</span></span>
<span id="LC40" class="line" lang="java"><span class="kn">import</span> <span class="nn">sun.java2d.cmm.CMSManager</span><span class="o">;</span></span>
<span id="LC41" class="line" lang="java"><span class="kn">import</span> <span class="nn">sun.java2d.cmm.Profile</span><span class="o">;</span></span>
<span id="LC42" class="line" lang="java"><span class="kn">import</span> <span class="nn">sun.java2d.cmm.ProfileDataVerifier</span><span class="o">;</span></span>
<span id="LC43" class="line" lang="java"><span class="kn">import</span> <span class="nn">sun.java2d.cmm.ProfileDeferralMgr</span><span class="o">;</span></span>
<span id="LC44" class="line" lang="java"><span class="kn">import</span> <span class="nn">sun.java2d.cmm.ProfileDeferralInfo</span><span class="o">;</span></span>
<span id="LC45" class="line" lang="java"><span class="kn">import</span> <span class="nn">sun.java2d.cmm.ProfileActivator</span><span class="o">;</span></span>
<span id="LC46" class="line" lang="java"></span>
<span id="LC47" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.File</span><span class="o">;</span></span>
<span id="LC48" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.FileInputStream</span><span class="o">;</span></span>
<span id="LC49" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.FileNotFoundException</span><span class="o">;</span></span>
<span id="LC50" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.FileOutputStream</span><span class="o">;</span></span>
<span id="LC51" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.IOException</span><span class="o">;</span></span>
<span id="LC52" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.InputStream</span><span class="o">;</span></span>
<span id="LC53" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.ObjectInputStream</span><span class="o">;</span></span>
<span id="LC54" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.ObjectOutputStream</span><span class="o">;</span></span>
<span id="LC55" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.ObjectStreamException</span><span class="o">;</span></span>
<span id="LC56" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.OutputStream</span><span class="o">;</span></span>
<span id="LC57" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.Serializable</span><span class="o">;</span></span>
<span id="LC58" class="line" lang="java"></span>
<span id="LC59" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.StringTokenizer</span><span class="o">;</span></span>
<span id="LC60" class="line" lang="java"></span>
<span id="LC61" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.security.AccessController</span><span class="o">;</span></span>
<span id="LC62" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.security.PrivilegedAction</span><span class="o">;</span></span>
<span id="LC63" class="line" lang="java"></span>
<span id="LC64" class="line" lang="java"></span>
<span id="LC65" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> * A representation of color profile data for device independent and</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> * device dependent color spaces based on the International Color</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> * Consortium Specification ICC.1:2001-12, File Format for Color Profiles,</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> * (see &lt;A href="http://www.color.org"&gt; http://www.color.org&lt;/A&gt;).</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> * An ICC_ColorSpace object can be constructed from an appropriate</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> * ICC_Profile.</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> * Typically, an ICC_ColorSpace would be associated with an ICC</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> * Profile which is either an input, display, or output profile (see</span></span>
<span id="LC75" class="line" lang="java"><span class="cm"> * the ICC specification).  There are also device link, abstract,</span></span>
<span id="LC76" class="line" lang="java"><span class="cm"> * color space conversion, and named color profiles.  These are less</span></span>
<span id="LC77" class="line" lang="java"><span class="cm"> * useful for tagging a color or image, but are useful for other</span></span>
<span id="LC78" class="line" lang="java"><span class="cm"> * purposes (in particular device link profiles can provide improved</span></span>
<span id="LC79" class="line" lang="java"><span class="cm"> * performance for converting from one device's color space to</span></span>
<span id="LC80" class="line" lang="java"><span class="cm"> * another's).</span></span>
<span id="LC81" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC82" class="line" lang="java"><span class="cm"> * ICC Profiles represent transformations from the color space of</span></span>
<span id="LC83" class="line" lang="java"><span class="cm"> * the profile (e.g. a monitor) to a Profile Connection Space (PCS).</span></span>
<span id="LC84" class="line" lang="java"><span class="cm"> * Profiles of interest for tagging images or colors have a PCS</span></span>
<span id="LC85" class="line" lang="java"><span class="cm"> * which is one of the two specific device independent</span></span>
<span id="LC86" class="line" lang="java"><span class="cm"> * spaces (one CIEXYZ space and one CIELab space) defined in the</span></span>
<span id="LC87" class="line" lang="java"><span class="cm"> * ICC Profile Format Specification.  Most profiles of interest</span></span>
<span id="LC88" class="line" lang="java"><span class="cm"> * either have invertible transformations or explicitly specify</span></span>
<span id="LC89" class="line" lang="java"><span class="cm"> * transformations going both directions.</span></span>
<span id="LC90" class="line" lang="java"><span class="cm"> * @see ICC_ColorSpace</span></span>
<span id="LC91" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC92" class="line" lang="java"></span>
<span id="LC93" class="line" lang="java"></span>
<span id="LC94" class="line" lang="java"><span class="kd">public</span> <span class="kd">class</span> <span class="nc">ICC_Profile</span> <span class="kd">implements</span> <span class="nc">Serializable</span> <span class="o">{</span></span>
<span id="LC95" class="line" lang="java"></span>
<span id="LC96" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="n">serialVersionUID</span> <span class="o">=</span> <span class="o">-</span><span class="mi">3938515861990936766L</span><span class="o">;</span></span>
<span id="LC97" class="line" lang="java"></span>
<span id="LC98" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">Profile</span> <span class="n">cmmProfile</span><span class="o">;</span></span>
<span id="LC99" class="line" lang="java"></span>
<span id="LC100" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">ProfileDeferralInfo</span> <span class="n">deferralInfo</span><span class="o">;</span></span>
<span id="LC101" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">ProfileActivator</span> <span class="n">profileActivator</span><span class="o">;</span></span>
<span id="LC102" class="line" lang="java"></span>
<span id="LC103" class="line" lang="java">    <span class="c1">// Registry of singleton profile objects for specific color spaces</span></span>
<span id="LC104" class="line" lang="java">    <span class="c1">// defined in the ColorSpace class (e.g. CS_sRGB), see</span></span>
<span id="LC105" class="line" lang="java">    <span class="c1">// getInstance(int cspace) factory method.</span></span>
<span id="LC106" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="n">sRGBprofile</span><span class="o">;</span></span>
<span id="LC107" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nc">XYZprofile</span><span class="o">;</span></span>
<span id="LC108" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nc">PYCCprofile</span><span class="o">;</span></span>
<span id="LC109" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nc">GRAYprofile</span><span class="o">;</span></span>
<span id="LC110" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="n">LINEAR_RGBprofile</span><span class="o">;</span></span>
<span id="LC111" class="line" lang="java"></span>
<span id="LC112" class="line" lang="java"></span>
<span id="LC113" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC114" class="line" lang="java"><span class="cm">     * Profile class is input.</span></span>
<span id="LC115" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC116" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="no">CLASS_INPUT</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC117" class="line" lang="java"></span>
<span id="LC118" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC119" class="line" lang="java"><span class="cm">     * Profile class is display.</span></span>
<span id="LC120" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC121" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="no">CLASS_DISPLAY</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC122" class="line" lang="java"></span>
<span id="LC123" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC124" class="line" lang="java"><span class="cm">     * Profile class is output.</span></span>
<span id="LC125" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC126" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="no">CLASS_OUTPUT</span> <span class="o">=</span> <span class="mi">2</span><span class="o">;</span></span>
<span id="LC127" class="line" lang="java"></span>
<span id="LC128" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC129" class="line" lang="java"><span class="cm">     * Profile class is device link.</span></span>
<span id="LC130" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC131" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="no">CLASS_DEVICELINK</span> <span class="o">=</span> <span class="mi">3</span><span class="o">;</span></span>
<span id="LC132" class="line" lang="java"></span>
<span id="LC133" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC134" class="line" lang="java"><span class="cm">     * Profile class is color space conversion.</span></span>
<span id="LC135" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC136" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="no">CLASS_COLORSPACECONVERSION</span> <span class="o">=</span> <span class="mi">4</span><span class="o">;</span></span>
<span id="LC137" class="line" lang="java"></span>
<span id="LC138" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC139" class="line" lang="java"><span class="cm">     * Profile class is abstract.</span></span>
<span id="LC140" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC141" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="no">CLASS_ABSTRACT</span> <span class="o">=</span> <span class="mi">5</span><span class="o">;</span></span>
<span id="LC142" class="line" lang="java"></span>
<span id="LC143" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC144" class="line" lang="java"><span class="cm">     * Profile class is named color.</span></span>
<span id="LC145" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC146" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="no">CLASS_NAMEDCOLOR</span> <span class="o">=</span> <span class="mi">6</span><span class="o">;</span></span>
<span id="LC147" class="line" lang="java"></span>
<span id="LC148" class="line" lang="java"></span>
<span id="LC149" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC150" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'XYZ '.</span></span>
<span id="LC151" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC152" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigXYZData</span>        <span class="o">=</span> <span class="mh">0x58595A20</span><span class="o">;</span>    <span class="cm">/* 'XYZ ' */</span></span>
<span id="LC153" class="line" lang="java"></span>
<span id="LC154" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC155" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'Lab '.</span></span>
<span id="LC156" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC157" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigLabData</span>        <span class="o">=</span> <span class="mh">0x4C616220</span><span class="o">;</span>    <span class="cm">/* 'Lab ' */</span></span>
<span id="LC158" class="line" lang="java"></span>
<span id="LC159" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC160" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'Luv '.</span></span>
<span id="LC161" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC162" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigLuvData</span>        <span class="o">=</span> <span class="mh">0x4C757620</span><span class="o">;</span>    <span class="cm">/* 'Luv ' */</span></span>
<span id="LC163" class="line" lang="java"></span>
<span id="LC164" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC165" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'YCbr'.</span></span>
<span id="LC166" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC167" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigYCbCrData</span>        <span class="o">=</span> <span class="mh">0x59436272</span><span class="o">;</span>    <span class="cm">/* 'YCbr' */</span></span>
<span id="LC168" class="line" lang="java"></span>
<span id="LC169" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC170" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'Yxy '.</span></span>
<span id="LC171" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC172" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigYxyData</span>        <span class="o">=</span> <span class="mh">0x59787920</span><span class="o">;</span>    <span class="cm">/* 'Yxy ' */</span></span>
<span id="LC173" class="line" lang="java"></span>
<span id="LC174" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC175" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'RGB '.</span></span>
<span id="LC176" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC177" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigRgbData</span>        <span class="o">=</span> <span class="mh">0x52474220</span><span class="o">;</span>    <span class="cm">/* 'RGB ' */</span></span>
<span id="LC178" class="line" lang="java"></span>
<span id="LC179" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC180" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'GRAY'.</span></span>
<span id="LC181" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC182" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigGrayData</span>        <span class="o">=</span> <span class="mh">0x47524159</span><span class="o">;</span>    <span class="cm">/* 'GRAY' */</span></span>
<span id="LC183" class="line" lang="java"></span>
<span id="LC184" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC185" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'HSV'.</span></span>
<span id="LC186" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC187" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigHsvData</span>        <span class="o">=</span> <span class="mh">0x48535620</span><span class="o">;</span>    <span class="cm">/* 'HSV ' */</span></span>
<span id="LC188" class="line" lang="java"></span>
<span id="LC189" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC190" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'HLS'.</span></span>
<span id="LC191" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC192" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigHlsData</span>        <span class="o">=</span> <span class="mh">0x484C5320</span><span class="o">;</span>    <span class="cm">/* 'HLS ' */</span></span>
<span id="LC193" class="line" lang="java"></span>
<span id="LC194" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC195" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'CMYK'.</span></span>
<span id="LC196" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC197" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigCmykData</span>        <span class="o">=</span> <span class="mh">0x434D594B</span><span class="o">;</span>    <span class="cm">/* 'CMYK' */</span></span>
<span id="LC198" class="line" lang="java"></span>
<span id="LC199" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC200" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'CMY '.</span></span>
<span id="LC201" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC202" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigCmyData</span>        <span class="o">=</span> <span class="mh">0x434D5920</span><span class="o">;</span>    <span class="cm">/* 'CMY ' */</span></span>
<span id="LC203" class="line" lang="java"></span>
<span id="LC204" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC205" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: '2CLR'.</span></span>
<span id="LC206" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC207" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpace2CLR</span>        <span class="o">=</span> <span class="mh">0x32434C52</span><span class="o">;</span>    <span class="cm">/* '2CLR' */</span></span>
<span id="LC208" class="line" lang="java"></span>
<span id="LC209" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC210" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: '3CLR'.</span></span>
<span id="LC211" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC212" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpace3CLR</span>        <span class="o">=</span> <span class="mh">0x33434C52</span><span class="o">;</span>    <span class="cm">/* '3CLR' */</span></span>
<span id="LC213" class="line" lang="java"></span>
<span id="LC214" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC215" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: '4CLR'.</span></span>
<span id="LC216" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC217" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpace4CLR</span>        <span class="o">=</span> <span class="mh">0x34434C52</span><span class="o">;</span>    <span class="cm">/* '4CLR' */</span></span>
<span id="LC218" class="line" lang="java"></span>
<span id="LC219" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC220" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: '5CLR'.</span></span>
<span id="LC221" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC222" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpace5CLR</span>        <span class="o">=</span> <span class="mh">0x35434C52</span><span class="o">;</span>    <span class="cm">/* '5CLR' */</span></span>
<span id="LC223" class="line" lang="java"></span>
<span id="LC224" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC225" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: '6CLR'.</span></span>
<span id="LC226" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC227" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpace6CLR</span>        <span class="o">=</span> <span class="mh">0x36434C52</span><span class="o">;</span>    <span class="cm">/* '6CLR' */</span></span>
<span id="LC228" class="line" lang="java"></span>
<span id="LC229" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC230" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: '7CLR'.</span></span>
<span id="LC231" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC232" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpace7CLR</span>        <span class="o">=</span> <span class="mh">0x37434C52</span><span class="o">;</span>    <span class="cm">/* '7CLR' */</span></span>
<span id="LC233" class="line" lang="java"></span>
<span id="LC234" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC235" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: '8CLR'.</span></span>
<span id="LC236" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC237" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpace8CLR</span>        <span class="o">=</span> <span class="mh">0x38434C52</span><span class="o">;</span>    <span class="cm">/* '8CLR' */</span></span>
<span id="LC238" class="line" lang="java"></span>
<span id="LC239" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC240" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: '9CLR'.</span></span>
<span id="LC241" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC242" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpace9CLR</span>        <span class="o">=</span> <span class="mh">0x39434C52</span><span class="o">;</span>    <span class="cm">/* '9CLR' */</span></span>
<span id="LC243" class="line" lang="java"></span>
<span id="LC244" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC245" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'ACLR'.</span></span>
<span id="LC246" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC247" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpaceACLR</span>        <span class="o">=</span> <span class="mh">0x41434C52</span><span class="o">;</span>    <span class="cm">/* 'ACLR' */</span></span>
<span id="LC248" class="line" lang="java"></span>
<span id="LC249" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC250" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'BCLR'.</span></span>
<span id="LC251" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC252" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpaceBCLR</span>        <span class="o">=</span> <span class="mh">0x42434C52</span><span class="o">;</span>    <span class="cm">/* 'BCLR' */</span></span>
<span id="LC253" class="line" lang="java"></span>
<span id="LC254" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC255" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'CCLR'.</span></span>
<span id="LC256" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC257" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpaceCCLR</span>        <span class="o">=</span> <span class="mh">0x43434C52</span><span class="o">;</span>    <span class="cm">/* 'CCLR' */</span></span>
<span id="LC258" class="line" lang="java"></span>
<span id="LC259" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC260" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'DCLR'.</span></span>
<span id="LC261" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC262" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpaceDCLR</span>        <span class="o">=</span> <span class="mh">0x44434C52</span><span class="o">;</span>    <span class="cm">/* 'DCLR' */</span></span>
<span id="LC263" class="line" lang="java"></span>
<span id="LC264" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC265" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'ECLR'.</span></span>
<span id="LC266" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC267" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpaceECLR</span>        <span class="o">=</span> <span class="mh">0x45434C52</span><span class="o">;</span>    <span class="cm">/* 'ECLR' */</span></span>
<span id="LC268" class="line" lang="java"></span>
<span id="LC269" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC270" class="line" lang="java"><span class="cm">     * ICC Profile Color Space Type Signature: 'FCLR'.</span></span>
<span id="LC271" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC272" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigSpaceFCLR</span>        <span class="o">=</span> <span class="mh">0x46434C52</span><span class="o">;</span>    <span class="cm">/* 'FCLR' */</span></span>
<span id="LC273" class="line" lang="java"></span>
<span id="LC274" class="line" lang="java"></span>
<span id="LC275" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC276" class="line" lang="java"><span class="cm">     * ICC Profile Class Signature: 'scnr'.</span></span>
<span id="LC277" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC278" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigInputClass</span>       <span class="o">=</span> <span class="mh">0x73636E72</span><span class="o">;</span>    <span class="cm">/* 'scnr' */</span></span>
<span id="LC279" class="line" lang="java"></span>
<span id="LC280" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC281" class="line" lang="java"><span class="cm">     * ICC Profile Class Signature: 'mntr'.</span></span>
<span id="LC282" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC283" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigDisplayClass</span>     <span class="o">=</span> <span class="mh">0x6D6E7472</span><span class="o">;</span>    <span class="cm">/* 'mntr' */</span></span>
<span id="LC284" class="line" lang="java"></span>
<span id="LC285" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC286" class="line" lang="java"><span class="cm">     * ICC Profile Class Signature: 'prtr'.</span></span>
<span id="LC287" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC288" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigOutputClass</span>      <span class="o">=</span> <span class="mh">0x70727472</span><span class="o">;</span>    <span class="cm">/* 'prtr' */</span></span>
<span id="LC289" class="line" lang="java"></span>
<span id="LC290" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC291" class="line" lang="java"><span class="cm">     * ICC Profile Class Signature: 'link'.</span></span>
<span id="LC292" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC293" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigLinkClass</span>        <span class="o">=</span> <span class="mh">0x6C696E6B</span><span class="o">;</span>    <span class="cm">/* 'link' */</span></span>
<span id="LC294" class="line" lang="java"></span>
<span id="LC295" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC296" class="line" lang="java"><span class="cm">     * ICC Profile Class Signature: 'abst'.</span></span>
<span id="LC297" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC298" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigAbstractClass</span>    <span class="o">=</span> <span class="mh">0x61627374</span><span class="o">;</span>    <span class="cm">/* 'abst' */</span></span>
<span id="LC299" class="line" lang="java"></span>
<span id="LC300" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC301" class="line" lang="java"><span class="cm">     * ICC Profile Class Signature: 'spac'.</span></span>
<span id="LC302" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC303" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigColorSpaceClass</span>  <span class="o">=</span> <span class="mh">0x73706163</span><span class="o">;</span>    <span class="cm">/* 'spac' */</span></span>
<span id="LC304" class="line" lang="java"></span>
<span id="LC305" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC306" class="line" lang="java"><span class="cm">     * ICC Profile Class Signature: 'nmcl'.</span></span>
<span id="LC307" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC308" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigNamedColorClass</span>  <span class="o">=</span> <span class="mh">0x6e6d636c</span><span class="o">;</span>    <span class="cm">/* 'nmcl' */</span></span>
<span id="LC309" class="line" lang="java"></span>
<span id="LC310" class="line" lang="java"></span>
<span id="LC311" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC312" class="line" lang="java"><span class="cm">     * ICC Profile Rendering Intent: Perceptual.</span></span>
<span id="LC313" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC314" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icPerceptual</span>            <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC315" class="line" lang="java"></span>
<span id="LC316" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC317" class="line" lang="java"><span class="cm">     * ICC Profile Rendering Intent: RelativeColorimetric.</span></span>
<span id="LC318" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC319" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icRelativeColorimetric</span>    <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC320" class="line" lang="java"></span>
<span id="LC321" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC322" class="line" lang="java"><span class="cm">     * ICC Profile Rendering Intent: Media-RelativeColorimetric.</span></span>
<span id="LC323" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC324" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC325" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icMediaRelativeColorimetric</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC326" class="line" lang="java"></span>
<span id="LC327" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC328" class="line" lang="java"><span class="cm">     * ICC Profile Rendering Intent: Saturation.</span></span>
<span id="LC329" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC330" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSaturation</span>            <span class="o">=</span> <span class="mi">2</span><span class="o">;</span></span>
<span id="LC331" class="line" lang="java"></span>
<span id="LC332" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC333" class="line" lang="java"><span class="cm">     * ICC Profile Rendering Intent: AbsoluteColorimetric.</span></span>
<span id="LC334" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC335" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icAbsoluteColorimetric</span>    <span class="o">=</span> <span class="mi">3</span><span class="o">;</span></span>
<span id="LC336" class="line" lang="java"></span>
<span id="LC337" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC338" class="line" lang="java"><span class="cm">     * ICC Profile Rendering Intent: ICC-AbsoluteColorimetric.</span></span>
<span id="LC339" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC340" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC341" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icICCAbsoluteColorimetric</span> <span class="o">=</span> <span class="mi">3</span><span class="o">;</span></span>
<span id="LC342" class="line" lang="java"></span>
<span id="LC343" class="line" lang="java"></span>
<span id="LC344" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC345" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'head' - special.</span></span>
<span id="LC346" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC347" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigHead</span>      <span class="o">=</span> <span class="mh">0x68656164</span><span class="o">;</span> <span class="cm">/* 'head' - special */</span></span>
<span id="LC348" class="line" lang="java"></span>
<span id="LC349" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC350" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'A2B0'.</span></span>
<span id="LC351" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC352" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigAToB0Tag</span>         <span class="o">=</span> <span class="mh">0x41324230</span><span class="o">;</span>    <span class="cm">/* 'A2B0' */</span></span>
<span id="LC353" class="line" lang="java"></span>
<span id="LC354" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC355" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'A2B1'.</span></span>
<span id="LC356" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC357" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigAToB1Tag</span>         <span class="o">=</span> <span class="mh">0x41324231</span><span class="o">;</span>    <span class="cm">/* 'A2B1' */</span></span>
<span id="LC358" class="line" lang="java"></span>
<span id="LC359" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC360" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'A2B2'.</span></span>
<span id="LC361" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC362" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigAToB2Tag</span>         <span class="o">=</span> <span class="mh">0x41324232</span><span class="o">;</span>    <span class="cm">/* 'A2B2' */</span></span>
<span id="LC363" class="line" lang="java"></span>
<span id="LC364" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC365" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'bXYZ'.</span></span>
<span id="LC366" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC367" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigBlueColorantTag</span>  <span class="o">=</span> <span class="mh">0x6258595A</span><span class="o">;</span>    <span class="cm">/* 'bXYZ' */</span></span>
<span id="LC368" class="line" lang="java"></span>
<span id="LC369" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC370" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'bXYZ'.</span></span>
<span id="LC371" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC372" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC373" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigBlueMatrixColumnTag</span> <span class="o">=</span> <span class="mh">0x6258595A</span><span class="o">;</span> <span class="cm">/* 'bXYZ' */</span></span>
<span id="LC374" class="line" lang="java"></span>
<span id="LC375" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC376" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'bTRC'.</span></span>
<span id="LC377" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC378" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigBlueTRCTag</span>       <span class="o">=</span> <span class="mh">0x62545243</span><span class="o">;</span>    <span class="cm">/* 'bTRC' */</span></span>
<span id="LC379" class="line" lang="java"></span>
<span id="LC380" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC381" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'B2A0'.</span></span>
<span id="LC382" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC383" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigBToA0Tag</span>         <span class="o">=</span> <span class="mh">0x42324130</span><span class="o">;</span>    <span class="cm">/* 'B2A0' */</span></span>
<span id="LC384" class="line" lang="java"></span>
<span id="LC385" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC386" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'B2A1'.</span></span>
<span id="LC387" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC388" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigBToA1Tag</span>         <span class="o">=</span> <span class="mh">0x42324131</span><span class="o">;</span>    <span class="cm">/* 'B2A1' */</span></span>
<span id="LC389" class="line" lang="java"></span>
<span id="LC390" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC391" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'B2A2'.</span></span>
<span id="LC392" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC393" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigBToA2Tag</span>         <span class="o">=</span> <span class="mh">0x42324132</span><span class="o">;</span>    <span class="cm">/* 'B2A2' */</span></span>
<span id="LC394" class="line" lang="java"></span>
<span id="LC395" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC396" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'calt'.</span></span>
<span id="LC397" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC398" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigCalibrationDateTimeTag</span> <span class="o">=</span> <span class="mh">0x63616C74</span><span class="o">;</span></span>
<span id="LC399" class="line" lang="java">                                                                   <span class="cm">/* 'calt' */</span></span>
<span id="LC400" class="line" lang="java"></span>
<span id="LC401" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC402" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'targ'.</span></span>
<span id="LC403" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC404" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigCharTargetTag</span>    <span class="o">=</span> <span class="mh">0x74617267</span><span class="o">;</span>    <span class="cm">/* 'targ' */</span></span>
<span id="LC405" class="line" lang="java"></span>
<span id="LC406" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC407" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'cprt'.</span></span>
<span id="LC408" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC409" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigCopyrightTag</span>     <span class="o">=</span> <span class="mh">0x63707274</span><span class="o">;</span>    <span class="cm">/* 'cprt' */</span></span>
<span id="LC410" class="line" lang="java"></span>
<span id="LC411" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC412" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'crdi'.</span></span>
<span id="LC413" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC414" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigCrdInfoTag</span>       <span class="o">=</span> <span class="mh">0x63726469</span><span class="o">;</span>    <span class="cm">/* 'crdi' */</span></span>
<span id="LC415" class="line" lang="java"></span>
<span id="LC416" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC417" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'dmnd'.</span></span>
<span id="LC418" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC419" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigDeviceMfgDescTag</span> <span class="o">=</span> <span class="mh">0x646D6E64</span><span class="o">;</span>    <span class="cm">/* 'dmnd' */</span></span>
<span id="LC420" class="line" lang="java"></span>
<span id="LC421" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC422" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'dmdd'.</span></span>
<span id="LC423" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC424" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigDeviceModelDescTag</span> <span class="o">=</span> <span class="mh">0x646D6464</span><span class="o">;</span>  <span class="cm">/* 'dmdd' */</span></span>
<span id="LC425" class="line" lang="java"></span>
<span id="LC426" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC427" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'devs'.</span></span>
<span id="LC428" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC429" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigDeviceSettingsTag</span> <span class="o">=</span>  <span class="mh">0x64657673</span><span class="o">;</span>  <span class="cm">/* 'devs' */</span></span>
<span id="LC430" class="line" lang="java"></span>
<span id="LC431" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC432" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'gamt'.</span></span>
<span id="LC433" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC434" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigGamutTag</span>         <span class="o">=</span> <span class="mh">0x67616D74</span><span class="o">;</span>    <span class="cm">/* 'gamt' */</span></span>
<span id="LC435" class="line" lang="java"></span>
<span id="LC436" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC437" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'kTRC'.</span></span>
<span id="LC438" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC439" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigGrayTRCTag</span>       <span class="o">=</span> <span class="mh">0x6b545243</span><span class="o">;</span>    <span class="cm">/* 'kTRC' */</span></span>
<span id="LC440" class="line" lang="java"></span>
<span id="LC441" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC442" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'gXYZ'.</span></span>
<span id="LC443" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC444" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigGreenColorantTag</span> <span class="o">=</span> <span class="mh">0x6758595A</span><span class="o">;</span>    <span class="cm">/* 'gXYZ' */</span></span>
<span id="LC445" class="line" lang="java"></span>
<span id="LC446" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC447" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'gXYZ'.</span></span>
<span id="LC448" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC449" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC450" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigGreenMatrixColumnTag</span> <span class="o">=</span> <span class="mh">0x6758595A</span><span class="o">;</span><span class="cm">/* 'gXYZ' */</span></span>
<span id="LC451" class="line" lang="java"></span>
<span id="LC452" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC453" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'gTRC'.</span></span>
<span id="LC454" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC455" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigGreenTRCTag</span>      <span class="o">=</span> <span class="mh">0x67545243</span><span class="o">;</span>    <span class="cm">/* 'gTRC' */</span></span>
<span id="LC456" class="line" lang="java"></span>
<span id="LC457" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC458" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'lumi'.</span></span>
<span id="LC459" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC460" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigLuminanceTag</span>     <span class="o">=</span> <span class="mh">0x6C756d69</span><span class="o">;</span>    <span class="cm">/* 'lumi' */</span></span>
<span id="LC461" class="line" lang="java"></span>
<span id="LC462" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC463" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'meas'.</span></span>
<span id="LC464" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC465" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigMeasurementTag</span>   <span class="o">=</span> <span class="mh">0x6D656173</span><span class="o">;</span>    <span class="cm">/* 'meas' */</span></span>
<span id="LC466" class="line" lang="java"></span>
<span id="LC467" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC468" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'bkpt'.</span></span>
<span id="LC469" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC470" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigMediaBlackPointTag</span> <span class="o">=</span> <span class="mh">0x626B7074</span><span class="o">;</span>  <span class="cm">/* 'bkpt' */</span></span>
<span id="LC471" class="line" lang="java"></span>
<span id="LC472" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC473" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'wtpt'.</span></span>
<span id="LC474" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC475" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigMediaWhitePointTag</span> <span class="o">=</span> <span class="mh">0x77747074</span><span class="o">;</span>  <span class="cm">/* 'wtpt' */</span></span>
<span id="LC476" class="line" lang="java"></span>
<span id="LC477" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC478" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'ncl2'.</span></span>
<span id="LC479" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC480" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigNamedColor2Tag</span>   <span class="o">=</span> <span class="mh">0x6E636C32</span><span class="o">;</span>    <span class="cm">/* 'ncl2' */</span></span>
<span id="LC481" class="line" lang="java"></span>
<span id="LC482" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC483" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'resp'.</span></span>
<span id="LC484" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC485" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigOutputResponseTag</span> <span class="o">=</span> <span class="mh">0x72657370</span><span class="o">;</span>   <span class="cm">/* 'resp' */</span></span>
<span id="LC486" class="line" lang="java"></span>
<span id="LC487" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC488" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'pre0'.</span></span>
<span id="LC489" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC490" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPreview0Tag</span>      <span class="o">=</span> <span class="mh">0x70726530</span><span class="o">;</span>    <span class="cm">/* 'pre0' */</span></span>
<span id="LC491" class="line" lang="java"></span>
<span id="LC492" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC493" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'pre1'.</span></span>
<span id="LC494" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC495" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPreview1Tag</span>      <span class="o">=</span> <span class="mh">0x70726531</span><span class="o">;</span>    <span class="cm">/* 'pre1' */</span></span>
<span id="LC496" class="line" lang="java"></span>
<span id="LC497" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC498" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'pre2'.</span></span>
<span id="LC499" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC500" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPreview2Tag</span>      <span class="o">=</span> <span class="mh">0x70726532</span><span class="o">;</span>    <span class="cm">/* 'pre2' */</span></span>
<span id="LC501" class="line" lang="java"></span>
<span id="LC502" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC503" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'desc'.</span></span>
<span id="LC504" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC505" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigProfileDescriptionTag</span> <span class="o">=</span> <span class="mh">0x64657363</span><span class="o">;</span></span>
<span id="LC506" class="line" lang="java">                                                                   <span class="cm">/* 'desc' */</span></span>
<span id="LC507" class="line" lang="java"></span>
<span id="LC508" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC509" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'pseq'.</span></span>
<span id="LC510" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC511" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigProfileSequenceDescTag</span> <span class="o">=</span> <span class="mh">0x70736571</span><span class="o">;</span></span>
<span id="LC512" class="line" lang="java">                                                                   <span class="cm">/* 'pseq' */</span></span>
<span id="LC513" class="line" lang="java"></span>
<span id="LC514" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC515" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'psd0'.</span></span>
<span id="LC516" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC517" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPs2CRD0Tag</span>       <span class="o">=</span> <span class="mh">0x70736430</span><span class="o">;</span>    <span class="cm">/* 'psd0' */</span></span>
<span id="LC518" class="line" lang="java"></span>
<span id="LC519" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC520" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'psd1'.</span></span>
<span id="LC521" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC522" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPs2CRD1Tag</span>       <span class="o">=</span> <span class="mh">0x70736431</span><span class="o">;</span>    <span class="cm">/* 'psd1' */</span></span>
<span id="LC523" class="line" lang="java"></span>
<span id="LC524" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC525" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'psd2'.</span></span>
<span id="LC526" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC527" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPs2CRD2Tag</span>       <span class="o">=</span> <span class="mh">0x70736432</span><span class="o">;</span>    <span class="cm">/* 'psd2' */</span></span>
<span id="LC528" class="line" lang="java"></span>
<span id="LC529" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC530" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'psd3'.</span></span>
<span id="LC531" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC532" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPs2CRD3Tag</span>       <span class="o">=</span> <span class="mh">0x70736433</span><span class="o">;</span>    <span class="cm">/* 'psd3' */</span></span>
<span id="LC533" class="line" lang="java"></span>
<span id="LC534" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC535" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'ps2s'.</span></span>
<span id="LC536" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC537" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPs2CSATag</span>        <span class="o">=</span> <span class="mh">0x70733273</span><span class="o">;</span>    <span class="cm">/* 'ps2s' */</span></span>
<span id="LC538" class="line" lang="java"></span>
<span id="LC539" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC540" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'ps2i'.</span></span>
<span id="LC541" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC542" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigPs2RenderingIntentTag</span> <span class="o">=</span> <span class="mh">0x70733269</span><span class="o">;</span></span>
<span id="LC543" class="line" lang="java">                                                                   <span class="cm">/* 'ps2i' */</span></span>
<span id="LC544" class="line" lang="java"></span>
<span id="LC545" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC546" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'rXYZ'.</span></span>
<span id="LC547" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC548" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigRedColorantTag</span>   <span class="o">=</span> <span class="mh">0x7258595A</span><span class="o">;</span>    <span class="cm">/* 'rXYZ' */</span></span>
<span id="LC549" class="line" lang="java"></span>
<span id="LC550" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC551" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'rXYZ'.</span></span>
<span id="LC552" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC553" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC554" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigRedMatrixColumnTag</span> <span class="o">=</span> <span class="mh">0x7258595A</span><span class="o">;</span>  <span class="cm">/* 'rXYZ' */</span></span>
<span id="LC555" class="line" lang="java"></span>
<span id="LC556" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC557" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'rTRC'.</span></span>
<span id="LC558" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC559" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigRedTRCTag</span>        <span class="o">=</span> <span class="mh">0x72545243</span><span class="o">;</span>    <span class="cm">/* 'rTRC' */</span></span>
<span id="LC560" class="line" lang="java"></span>
<span id="LC561" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC562" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'scrd'.</span></span>
<span id="LC563" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC564" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigScreeningDescTag</span> <span class="o">=</span> <span class="mh">0x73637264</span><span class="o">;</span>    <span class="cm">/* 'scrd' */</span></span>
<span id="LC565" class="line" lang="java"></span>
<span id="LC566" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC567" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'scrn'.</span></span>
<span id="LC568" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC569" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigScreeningTag</span>     <span class="o">=</span> <span class="mh">0x7363726E</span><span class="o">;</span>    <span class="cm">/* 'scrn' */</span></span>
<span id="LC570" class="line" lang="java"></span>
<span id="LC571" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC572" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'tech'.</span></span>
<span id="LC573" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC574" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigTechnologyTag</span>    <span class="o">=</span> <span class="mh">0x74656368</span><span class="o">;</span>    <span class="cm">/* 'tech' */</span></span>
<span id="LC575" class="line" lang="java"></span>
<span id="LC576" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC577" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'bfd '.</span></span>
<span id="LC578" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC579" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigUcrBgTag</span>         <span class="o">=</span> <span class="mh">0x62666420</span><span class="o">;</span>    <span class="cm">/* 'bfd ' */</span></span>
<span id="LC580" class="line" lang="java"></span>
<span id="LC581" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC582" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'vued'.</span></span>
<span id="LC583" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC584" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigViewingCondDescTag</span> <span class="o">=</span> <span class="mh">0x76756564</span><span class="o">;</span>  <span class="cm">/* 'vued' */</span></span>
<span id="LC585" class="line" lang="java"></span>
<span id="LC586" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC587" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'view'.</span></span>
<span id="LC588" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC589" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigViewingConditionsTag</span> <span class="o">=</span> <span class="mh">0x76696577</span><span class="o">;</span><span class="cm">/* 'view' */</span></span>
<span id="LC590" class="line" lang="java"></span>
<span id="LC591" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC592" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'chrm'.</span></span>
<span id="LC593" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC594" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigChromaticityTag</span>  <span class="o">=</span> <span class="mh">0x6368726d</span><span class="o">;</span>    <span class="cm">/* 'chrm' */</span></span>
<span id="LC595" class="line" lang="java"></span>
<span id="LC596" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC597" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'chad'.</span></span>
<span id="LC598" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC599" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC600" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigChromaticAdaptationTag</span> <span class="o">=</span> <span class="mh">0x63686164</span><span class="o">;</span><span class="cm">/* 'chad' */</span></span>
<span id="LC601" class="line" lang="java"></span>
<span id="LC602" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC603" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'clro'.</span></span>
<span id="LC604" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC605" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC606" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigColorantOrderTag</span> <span class="o">=</span> <span class="mh">0x636C726F</span><span class="o">;</span>    <span class="cm">/* 'clro' */</span></span>
<span id="LC607" class="line" lang="java"></span>
<span id="LC608" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC609" class="line" lang="java"><span class="cm">     * ICC Profile Tag Signature: 'clrt'.</span></span>
<span id="LC610" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC611" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC612" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icSigColorantTableTag</span> <span class="o">=</span> <span class="mh">0x636C7274</span><span class="o">;</span>    <span class="cm">/* 'clrt' */</span></span>
<span id="LC613" class="line" lang="java"></span>
<span id="LC614" class="line" lang="java"></span>
<span id="LC615" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC616" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: profile size in bytes.</span></span>
<span id="LC617" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC618" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrSize</span>         <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>  <span class="cm">/* Profile size in bytes */</span></span>
<span id="LC619" class="line" lang="java"></span>
<span id="LC620" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC621" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: CMM for this profile.</span></span>
<span id="LC622" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC623" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrCmmId</span>        <span class="o">=</span> <span class="mi">4</span><span class="o">;</span>  <span class="cm">/* CMM for this profile */</span></span>
<span id="LC624" class="line" lang="java"></span>
<span id="LC625" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC626" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: format version number.</span></span>
<span id="LC627" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC628" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrVersion</span>      <span class="o">=</span> <span class="mi">8</span><span class="o">;</span>  <span class="cm">/* Format version number */</span></span>
<span id="LC629" class="line" lang="java"></span>
<span id="LC630" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC631" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: type of profile.</span></span>
<span id="LC632" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC633" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrDeviceClass</span>  <span class="o">=</span> <span class="mi">12</span><span class="o">;</span> <span class="cm">/* Type of profile */</span></span>
<span id="LC634" class="line" lang="java"></span>
<span id="LC635" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC636" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: color space of data.</span></span>
<span id="LC637" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC638" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrColorSpace</span>   <span class="o">=</span> <span class="mi">16</span><span class="o">;</span> <span class="cm">/* Color space of data */</span></span>
<span id="LC639" class="line" lang="java"></span>
<span id="LC640" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC641" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: PCS - XYZ or Lab only.</span></span>
<span id="LC642" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC643" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrPcs</span>          <span class="o">=</span> <span class="mi">20</span><span class="o">;</span> <span class="cm">/* PCS - XYZ or Lab only */</span></span>
<span id="LC644" class="line" lang="java"></span>
<span id="LC645" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC646" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: date profile was created.</span></span>
<span id="LC647" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC648" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrDate</span>       <span class="o">=</span> <span class="mi">24</span><span class="o">;</span> <span class="cm">/* Date profile was created */</span></span>
<span id="LC649" class="line" lang="java"></span>
<span id="LC650" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC651" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: icMagicNumber.</span></span>
<span id="LC652" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC653" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrMagic</span>        <span class="o">=</span> <span class="mi">36</span><span class="o">;</span> <span class="cm">/* icMagicNumber */</span></span>
<span id="LC654" class="line" lang="java"></span>
<span id="LC655" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC656" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: primary platform.</span></span>
<span id="LC657" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC658" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrPlatform</span>     <span class="o">=</span> <span class="mi">40</span><span class="o">;</span> <span class="cm">/* Primary Platform */</span></span>
<span id="LC659" class="line" lang="java"></span>
<span id="LC660" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC661" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: various bit settings.</span></span>
<span id="LC662" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC663" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrFlags</span>        <span class="o">=</span> <span class="mi">44</span><span class="o">;</span> <span class="cm">/* Various bit settings */</span></span>
<span id="LC664" class="line" lang="java"></span>
<span id="LC665" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC666" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: device manufacturer.</span></span>
<span id="LC667" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC668" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrManufacturer</span> <span class="o">=</span> <span class="mi">48</span><span class="o">;</span> <span class="cm">/* Device manufacturer */</span></span>
<span id="LC669" class="line" lang="java"></span>
<span id="LC670" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC671" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: device model number.</span></span>
<span id="LC672" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC673" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrModel</span>        <span class="o">=</span> <span class="mi">52</span><span class="o">;</span> <span class="cm">/* Device model number */</span></span>
<span id="LC674" class="line" lang="java"></span>
<span id="LC675" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC676" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: device attributes.</span></span>
<span id="LC677" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC678" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrAttributes</span>   <span class="o">=</span> <span class="mi">56</span><span class="o">;</span> <span class="cm">/* Device attributes */</span></span>
<span id="LC679" class="line" lang="java"></span>
<span id="LC680" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC681" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: rendering intent.</span></span>
<span id="LC682" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC683" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrRenderingIntent</span> <span class="o">=</span> <span class="mi">64</span><span class="o">;</span> <span class="cm">/* Rendering intent */</span></span>
<span id="LC684" class="line" lang="java"></span>
<span id="LC685" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC686" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: profile illuminant.</span></span>
<span id="LC687" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC688" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrIlluminant</span>   <span class="o">=</span> <span class="mi">68</span><span class="o">;</span> <span class="cm">/* Profile illuminant */</span></span>
<span id="LC689" class="line" lang="java"></span>
<span id="LC690" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC691" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: profile creator.</span></span>
<span id="LC692" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC693" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrCreator</span>      <span class="o">=</span> <span class="mi">80</span><span class="o">;</span> <span class="cm">/* Profile creator */</span></span>
<span id="LC694" class="line" lang="java"></span>
<span id="LC695" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC696" class="line" lang="java"><span class="cm">     * ICC Profile Header Location: profile's ID.</span></span>
<span id="LC697" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC698" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC699" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icHdrProfileID</span> <span class="o">=</span> <span class="mi">84</span><span class="o">;</span> <span class="cm">/* Profile's ID */</span></span>
<span id="LC700" class="line" lang="java"></span>
<span id="LC701" class="line" lang="java"></span>
<span id="LC702" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC703" class="line" lang="java"><span class="cm">     * ICC Profile Constant: tag type signaturE.</span></span>
<span id="LC704" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC705" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icTagType</span>          <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>    <span class="cm">/* tag type signature */</span></span>
<span id="LC706" class="line" lang="java"></span>
<span id="LC707" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC708" class="line" lang="java"><span class="cm">     * ICC Profile Constant: reserved.</span></span>
<span id="LC709" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC710" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icTagReserved</span>      <span class="o">=</span> <span class="mi">4</span><span class="o">;</span>    <span class="cm">/* reserved */</span></span>
<span id="LC711" class="line" lang="java"></span>
<span id="LC712" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC713" class="line" lang="java"><span class="cm">     * ICC Profile Constant: curveType count.</span></span>
<span id="LC714" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC715" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icCurveCount</span>       <span class="o">=</span> <span class="mi">8</span><span class="o">;</span>    <span class="cm">/* curveType count */</span></span>
<span id="LC716" class="line" lang="java"></span>
<span id="LC717" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC718" class="line" lang="java"><span class="cm">     * ICC Profile Constant: curveType data.</span></span>
<span id="LC719" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC720" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icCurveData</span>        <span class="o">=</span> <span class="mi">12</span><span class="o">;</span>   <span class="cm">/* curveType data */</span></span>
<span id="LC721" class="line" lang="java"></span>
<span id="LC722" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC723" class="line" lang="java"><span class="cm">     * ICC Profile Constant: XYZNumber X.</span></span>
<span id="LC724" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC725" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">icXYZNumberX</span>       <span class="o">=</span> <span class="mi">8</span><span class="o">;</span>    <span class="cm">/* XYZNumber X */</span></span>
<span id="LC726" class="line" lang="java"></span>
<span id="LC727" class="line" lang="java"></span>
<span id="LC728" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC729" class="line" lang="java"><span class="cm">     * Constructs an ICC_Profile object with a given ID.</span></span>
<span id="LC730" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC731" class="line" lang="java">    <span class="n">ICC_Profile</span><span class="o">(</span><span class="nc">Profile</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC732" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">cmmProfile</span> <span class="o">=</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC733" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC734" class="line" lang="java"></span>
<span id="LC735" class="line" lang="java"></span>
<span id="LC736" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC737" class="line" lang="java"><span class="cm">     * Constructs an ICC_Profile object whose loading will be deferred.</span></span>
<span id="LC738" class="line" lang="java"><span class="cm">     * The ID will be 0 until the profile is loaded.</span></span>
<span id="LC739" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC740" class="line" lang="java">    <span class="n">ICC_Profile</span><span class="o">(</span><span class="nc">ProfileDeferralInfo</span> <span class="n">pdi</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC741" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">deferralInfo</span> <span class="o">=</span> <span class="n">pdi</span><span class="o">;</span></span>
<span id="LC742" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">profileActivator</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">ProfileActivator</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC743" class="line" lang="java">            <span class="kd">public</span> <span class="kt">void</span> <span class="nf">activate</span><span class="o">()</span> <span class="kd">throws</span> <span class="nc">ProfileDataException</span> <span class="o">{</span></span>
<span id="LC744" class="line" lang="java">                <span class="n">activateDeferredProfile</span><span class="o">();</span></span>
<span id="LC745" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC746" class="line" lang="java">        <span class="o">};</span></span>
<span id="LC747" class="line" lang="java">        <span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">registerDeferral</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">profileActivator</span><span class="o">);</span></span>
<span id="LC748" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC749" class="line" lang="java"></span>
<span id="LC750" class="line" lang="java"></span>
<span id="LC751" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC752" class="line" lang="java"><span class="cm">     * Frees the resources associated with an ICC_Profile object.</span></span>
<span id="LC753" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC754" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">finalize</span> <span class="o">()</span> <span class="o">{</span></span>
<span id="LC755" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">cmmProfile</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC756" class="line" lang="java">            <span class="nc">CMSManager</span><span class="o">.</span><span class="na">getModule</span><span class="o">().</span><span class="na">freeProfile</span><span class="o">(</span><span class="n">cmmProfile</span><span class="o">);</span></span>
<span id="LC757" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">profileActivator</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC758" class="line" lang="java">            <span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">unregisterDeferral</span><span class="o">(</span><span class="n">profileActivator</span><span class="o">);</span></span>
<span id="LC759" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC760" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC761" class="line" lang="java"></span>
<span id="LC762" class="line" lang="java"></span>
<span id="LC763" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC764" class="line" lang="java"><span class="cm">     * Constructs an ICC_Profile object corresponding to the data in</span></span>
<span id="LC765" class="line" lang="java"><span class="cm">     * a byte array.  Throws an IllegalArgumentException if the data</span></span>
<span id="LC766" class="line" lang="java"><span class="cm">     * does not correspond to a valid ICC Profile.</span></span>
<span id="LC767" class="line" lang="java"><span class="cm">     * @param data the specified ICC Profile data</span></span>
<span id="LC768" class="line" lang="java"><span class="cm">     * @return an &lt;code&gt;ICC_Profile&lt;/code&gt; object corresponding to</span></span>
<span id="LC769" class="line" lang="java"><span class="cm">     *          the data in the specified &lt;code&gt;data&lt;/code&gt; array.</span></span>
<span id="LC770" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC771" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nf">getInstance</span><span class="o">(</span><span class="kt">byte</span><span class="o">[]</span> <span class="n">data</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC772" class="line" lang="java">    <span class="n">ICC_Profile</span> <span class="n">thisProfile</span><span class="o">;</span></span>
<span id="LC773" class="line" lang="java"></span>
<span id="LC774" class="line" lang="java">        <span class="nc">Profile</span> <span class="n">p</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC775" class="line" lang="java"></span>
<span id="LC776" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">deferring</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC777" class="line" lang="java">            <span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">activateProfiles</span><span class="o">();</span></span>
<span id="LC778" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC779" class="line" lang="java"></span>
<span id="LC780" class="line" lang="java">        <span class="nc">ProfileDataVerifier</span><span class="o">.</span><span class="na">verify</span><span class="o">(</span><span class="n">data</span><span class="o">);</span></span>
<span id="LC781" class="line" lang="java"></span>
<span id="LC782" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC783" class="line" lang="java">            <span class="n">p</span> <span class="o">=</span> <span class="nc">CMSManager</span><span class="o">.</span><span class="na">getModule</span><span class="o">().</span><span class="na">loadProfile</span><span class="o">(</span><span class="n">data</span><span class="o">);</span></span>
<span id="LC784" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">CMMException</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC785" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="s">"Invalid ICC Profile Data"</span><span class="o">);</span></span>
<span id="LC786" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC787" class="line" lang="java"></span>
<span id="LC788" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC789" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">getColorSpaceType</span> <span class="o">(</span><span class="n">p</span><span class="o">)</span> <span class="o">==</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_GRAY</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC790" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigMediaWhitePointTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC791" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigGrayTRCTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC792" class="line" lang="java">                <span class="n">thisProfile</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ICC_ProfileGray</span> <span class="o">(</span><span class="n">p</span><span class="o">);</span></span>
<span id="LC793" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC794" class="line" lang="java">            <span class="k">else</span> <span class="nf">if</span> <span class="o">((</span><span class="n">getColorSpaceType</span> <span class="o">(</span><span class="n">p</span><span class="o">)</span> <span class="o">==</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_RGB</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC795" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigMediaWhitePointTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC796" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigRedColorantTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC797" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigGreenColorantTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC798" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigBlueColorantTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC799" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigRedTRCTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC800" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigGreenTRCTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC801" class="line" lang="java">                <span class="o">(</span><span class="n">getData</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigBlueTRCTag</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC802" class="line" lang="java">                <span class="n">thisProfile</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ICC_ProfileRGB</span> <span class="o">(</span><span class="n">p</span><span class="o">);</span></span>
<span id="LC803" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC804" class="line" lang="java">            <span class="k">else</span> <span class="o">{</span></span>
<span id="LC805" class="line" lang="java">                <span class="n">thisProfile</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ICC_Profile</span> <span class="o">(</span><span class="n">p</span><span class="o">);</span></span>
<span id="LC806" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC807" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">CMMException</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC808" class="line" lang="java">            <span class="n">thisProfile</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ICC_Profile</span> <span class="o">(</span><span class="n">p</span><span class="o">);</span></span>
<span id="LC809" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC810" class="line" lang="java">        <span class="k">return</span> <span class="n">thisProfile</span><span class="o">;</span></span>
<span id="LC811" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC812" class="line" lang="java"></span>
<span id="LC813" class="line" lang="java"></span>
<span id="LC814" class="line" lang="java"></span>
<span id="LC815" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC816" class="line" lang="java"><span class="cm">     * Constructs an ICC_Profile corresponding to one of the specific color</span></span>
<span id="LC817" class="line" lang="java"><span class="cm">     * spaces defined by the ColorSpace class (for example CS_sRGB).</span></span>
<span id="LC818" class="line" lang="java"><span class="cm">     * Throws an IllegalArgumentException if cspace is not one of the</span></span>
<span id="LC819" class="line" lang="java"><span class="cm">     * defined color spaces.</span></span>
<span id="LC820" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC821" class="line" lang="java"><span class="cm">     * @param cspace the type of color space to create a profile for.</span></span>
<span id="LC822" class="line" lang="java"><span class="cm">     * The specified type is one of the color</span></span>
<span id="LC823" class="line" lang="java"><span class="cm">     * space constants defined in the  &lt;CODE&gt;ColorSpace&lt;/CODE&gt; class.</span></span>
<span id="LC824" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC825" class="line" lang="java"><span class="cm">     * @return an &lt;code&gt;ICC_Profile&lt;/code&gt; object corresponding to</span></span>
<span id="LC826" class="line" lang="java"><span class="cm">     *          the specified &lt;code&gt;ColorSpace&lt;/code&gt; type.</span></span>
<span id="LC827" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException If &lt;CODE&gt;cspace&lt;/CODE&gt; is not</span></span>
<span id="LC828" class="line" lang="java"><span class="cm">     * one of the predefined color space types.</span></span>
<span id="LC829" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC830" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nf">getInstance</span> <span class="o">(</span><span class="kt">int</span> <span class="n">cspace</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC831" class="line" lang="java">        <span class="n">ICC_Profile</span> <span class="n">thisProfile</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC832" class="line" lang="java">        <span class="nc">String</span> <span class="n">fileName</span><span class="o">;</span></span>
<span id="LC833" class="line" lang="java"></span>
<span id="LC834" class="line" lang="java">        <span class="k">switch</span> <span class="o">(</span><span class="n">cspace</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC835" class="line" lang="java">        <span class="k">case</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_sRGB</span><span class="o">:</span></span>
<span id="LC836" class="line" lang="java">            <span class="kd">synchronized</span><span class="o">(</span><span class="n">ICC_Profile</span><span class="o">.</span><span class="na">class</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC837" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">sRGBprofile</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC838" class="line" lang="java">                    <span class="cm">/*</span></span>
<span id="LC839" class="line" lang="java"><span class="cm">                     * Deferral is only used for standard profiles.</span></span>
<span id="LC840" class="line" lang="java"><span class="cm">                     * Enabling the appropriate access privileges is handled</span></span>
<span id="LC841" class="line" lang="java"><span class="cm">                     * at a lower level.</span></span>
<span id="LC842" class="line" lang="java"><span class="cm">                     */</span></span>
<span id="LC843" class="line" lang="java">                    <span class="nc">ProfileDeferralInfo</span> <span class="n">pInfo</span> <span class="o">=</span></span>
<span id="LC844" class="line" lang="java">                        <span class="k">new</span> <span class="nf">ProfileDeferralInfo</span><span class="o">(</span><span class="s">"sRGB.pf"</span><span class="o">,</span></span>
<span id="LC845" class="line" lang="java">                                                <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_RGB</span><span class="o">,</span> <span class="mi">3</span><span class="o">,</span></span>
<span id="LC846" class="line" lang="java">                                                <span class="no">CLASS_DISPLAY</span><span class="o">);</span></span>
<span id="LC847" class="line" lang="java">                    <span class="n">sRGBprofile</span> <span class="o">=</span> <span class="n">getDeferredInstance</span><span class="o">(</span><span class="n">pInfo</span><span class="o">);</span></span>
<span id="LC848" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC849" class="line" lang="java">                <span class="n">thisProfile</span> <span class="o">=</span> <span class="n">sRGBprofile</span><span class="o">;</span></span>
<span id="LC850" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC851" class="line" lang="java"></span>
<span id="LC852" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC853" class="line" lang="java"></span>
<span id="LC854" class="line" lang="java">        <span class="k">case</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_CIEXYZ</span><span class="o">:</span></span>
<span id="LC855" class="line" lang="java">            <span class="kd">synchronized</span><span class="o">(</span><span class="n">ICC_Profile</span><span class="o">.</span><span class="na">class</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC856" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="nc">XYZprofile</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC857" class="line" lang="java">                    <span class="nc">ProfileDeferralInfo</span> <span class="n">pInfo</span> <span class="o">=</span></span>
<span id="LC858" class="line" lang="java">                        <span class="k">new</span> <span class="nf">ProfileDeferralInfo</span><span class="o">(</span><span class="s">"CIEXYZ.pf"</span><span class="o">,</span></span>
<span id="LC859" class="line" lang="java">                                                <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_XYZ</span><span class="o">,</span> <span class="mi">3</span><span class="o">,</span></span>
<span id="LC860" class="line" lang="java">                                                <span class="no">CLASS_DISPLAY</span><span class="o">);</span></span>
<span id="LC861" class="line" lang="java">                    <span class="nc">XYZprofile</span> <span class="o">=</span> <span class="n">getDeferredInstance</span><span class="o">(</span><span class="n">pInfo</span><span class="o">);</span></span>
<span id="LC862" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC863" class="line" lang="java">                <span class="n">thisProfile</span> <span class="o">=</span> <span class="nc">XYZprofile</span><span class="o">;</span></span>
<span id="LC864" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC865" class="line" lang="java"></span>
<span id="LC866" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC867" class="line" lang="java"></span>
<span id="LC868" class="line" lang="java">        <span class="k">case</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_PYCC</span><span class="o">:</span></span>
<span id="LC869" class="line" lang="java">            <span class="kd">synchronized</span><span class="o">(</span><span class="n">ICC_Profile</span><span class="o">.</span><span class="na">class</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC870" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="nc">PYCCprofile</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC871" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">standardProfileExists</span><span class="o">(</span><span class="s">"PYCC.pf"</span><span class="o">))</span></span>
<span id="LC872" class="line" lang="java">                    <span class="o">{</span></span>
<span id="LC873" class="line" lang="java">                        <span class="nc">ProfileDeferralInfo</span> <span class="n">pInfo</span> <span class="o">=</span></span>
<span id="LC874" class="line" lang="java">                            <span class="k">new</span> <span class="nf">ProfileDeferralInfo</span><span class="o">(</span><span class="s">"PYCC.pf"</span><span class="o">,</span></span>
<span id="LC875" class="line" lang="java">                                                    <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_3CLR</span><span class="o">,</span> <span class="mi">3</span><span class="o">,</span></span>
<span id="LC876" class="line" lang="java">                                                    <span class="no">CLASS_DISPLAY</span><span class="o">);</span></span>
<span id="LC877" class="line" lang="java">                        <span class="nc">PYCCprofile</span> <span class="o">=</span> <span class="n">getDeferredInstance</span><span class="o">(</span><span class="n">pInfo</span><span class="o">);</span></span>
<span id="LC878" class="line" lang="java">                    <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC879" class="line" lang="java">                        <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span></span>
<span id="LC880" class="line" lang="java">                                <span class="s">"Can't load standard profile: PYCC.pf"</span><span class="o">);</span></span>
<span id="LC881" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC882" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC883" class="line" lang="java">                <span class="n">thisProfile</span> <span class="o">=</span> <span class="nc">PYCCprofile</span><span class="o">;</span></span>
<span id="LC884" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC885" class="line" lang="java"></span>
<span id="LC886" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC887" class="line" lang="java"></span>
<span id="LC888" class="line" lang="java">        <span class="k">case</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_GRAY</span><span class="o">:</span></span>
<span id="LC889" class="line" lang="java">            <span class="kd">synchronized</span><span class="o">(</span><span class="n">ICC_Profile</span><span class="o">.</span><span class="na">class</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC890" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="nc">GRAYprofile</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC891" class="line" lang="java">                    <span class="nc">ProfileDeferralInfo</span> <span class="n">pInfo</span> <span class="o">=</span></span>
<span id="LC892" class="line" lang="java">                        <span class="k">new</span> <span class="nf">ProfileDeferralInfo</span><span class="o">(</span><span class="s">"GRAY.pf"</span><span class="o">,</span></span>
<span id="LC893" class="line" lang="java">                                                <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_GRAY</span><span class="o">,</span> <span class="mi">1</span><span class="o">,</span></span>
<span id="LC894" class="line" lang="java">                                                <span class="no">CLASS_DISPLAY</span><span class="o">);</span></span>
<span id="LC895" class="line" lang="java">                    <span class="nc">GRAYprofile</span> <span class="o">=</span> <span class="n">getDeferredInstance</span><span class="o">(</span><span class="n">pInfo</span><span class="o">);</span></span>
<span id="LC896" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC897" class="line" lang="java">                <span class="n">thisProfile</span> <span class="o">=</span> <span class="nc">GRAYprofile</span><span class="o">;</span></span>
<span id="LC898" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC899" class="line" lang="java"></span>
<span id="LC900" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC901" class="line" lang="java"></span>
<span id="LC902" class="line" lang="java">        <span class="k">case</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_LINEAR_RGB</span><span class="o">:</span></span>
<span id="LC903" class="line" lang="java">            <span class="kd">synchronized</span><span class="o">(</span><span class="n">ICC_Profile</span><span class="o">.</span><span class="na">class</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC904" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">LINEAR_RGBprofile</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC905" class="line" lang="java">                    <span class="nc">ProfileDeferralInfo</span> <span class="n">pInfo</span> <span class="o">=</span></span>
<span id="LC906" class="line" lang="java">                        <span class="k">new</span> <span class="nf">ProfileDeferralInfo</span><span class="o">(</span><span class="s">"LINEAR_RGB.pf"</span><span class="o">,</span></span>
<span id="LC907" class="line" lang="java">                                                <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_RGB</span><span class="o">,</span> <span class="mi">3</span><span class="o">,</span></span>
<span id="LC908" class="line" lang="java">                                                <span class="no">CLASS_DISPLAY</span><span class="o">);</span></span>
<span id="LC909" class="line" lang="java">                    <span class="n">LINEAR_RGBprofile</span> <span class="o">=</span> <span class="n">getDeferredInstance</span><span class="o">(</span><span class="n">pInfo</span><span class="o">);</span></span>
<span id="LC910" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC911" class="line" lang="java">                <span class="n">thisProfile</span> <span class="o">=</span> <span class="n">LINEAR_RGBprofile</span><span class="o">;</span></span>
<span id="LC912" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC913" class="line" lang="java"></span>
<span id="LC914" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC915" class="line" lang="java"></span>
<span id="LC916" class="line" lang="java">        <span class="k">default</span><span class="o">:</span></span>
<span id="LC917" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="s">"Unknown color space"</span><span class="o">);</span></span>
<span id="LC918" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC919" class="line" lang="java"></span>
<span id="LC920" class="line" lang="java">        <span class="k">return</span> <span class="n">thisProfile</span><span class="o">;</span></span>
<span id="LC921" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC922" class="line" lang="java"></span>
<span id="LC923" class="line" lang="java">    <span class="cm">/* This asserts system privileges, so is used only for the</span></span>
<span id="LC924" class="line" lang="java"><span class="cm">     * standard profiles.</span></span>
<span id="LC925" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC926" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nf">getStandardProfile</span><span class="o">(</span><span class="kd">final</span> <span class="nc">String</span> <span class="n">name</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC927" class="line" lang="java"></span>
<span id="LC928" class="line" lang="java">        <span class="k">return</span> <span class="nc">AccessController</span><span class="o">.</span><span class="na">doPrivileged</span><span class="o">(</span></span>
<span id="LC929" class="line" lang="java">            <span class="k">new</span> <span class="nc">PrivilegedAction</span><span class="o">&lt;</span><span class="n">ICC_Profile</span><span class="o">&gt;()</span> <span class="o">{</span></span>
<span id="LC930" class="line" lang="java">                 <span class="kd">public</span> <span class="n">ICC_Profile</span> <span class="nf">run</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC931" class="line" lang="java">                     <span class="n">ICC_Profile</span> <span class="n">p</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC932" class="line" lang="java">                     <span class="k">try</span> <span class="o">{</span></span>
<span id="LC933" class="line" lang="java">                         <span class="n">p</span> <span class="o">=</span> <span class="n">getInstance</span> <span class="o">(</span><span class="n">name</span><span class="o">);</span></span>
<span id="LC934" class="line" lang="java">                     <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">IOException</span> <span class="n">ex</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC935" class="line" lang="java">                         <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span></span>
<span id="LC936" class="line" lang="java">                               <span class="s">"Can't load standard profile: "</span> <span class="o">+</span> <span class="n">name</span><span class="o">);</span></span>
<span id="LC937" class="line" lang="java">                     <span class="o">}</span></span>
<span id="LC938" class="line" lang="java">                     <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC939" class="line" lang="java">                 <span class="o">}</span></span>
<span id="LC940" class="line" lang="java">             <span class="o">});</span></span>
<span id="LC941" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC942" class="line" lang="java"></span>
<span id="LC943" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC944" class="line" lang="java"><span class="cm">     * Constructs an ICC_Profile corresponding to the data in a file.</span></span>
<span id="LC945" class="line" lang="java"><span class="cm">     * fileName may be an absolute or a relative file specification.</span></span>
<span id="LC946" class="line" lang="java"><span class="cm">     * Relative file names are looked for in several places: first, relative</span></span>
<span id="LC947" class="line" lang="java"><span class="cm">     * to any directories specified by the java.iccprofile.path property;</span></span>
<span id="LC948" class="line" lang="java"><span class="cm">     * second, relative to any directories specified by the java.class.path</span></span>
<span id="LC949" class="line" lang="java"><span class="cm">     * property; finally, in a directory used to store profiles always</span></span>
<span id="LC950" class="line" lang="java"><span class="cm">     * available, such as the profile for sRGB.  Built-in profiles use .pf as</span></span>
<span id="LC951" class="line" lang="java"><span class="cm">     * the file name extension for profiles, e.g. sRGB.pf.</span></span>
<span id="LC952" class="line" lang="java"><span class="cm">     * This method throws an IOException if the specified file cannot be</span></span>
<span id="LC953" class="line" lang="java"><span class="cm">     * opened or if an I/O error occurs while reading the file.  It throws</span></span>
<span id="LC954" class="line" lang="java"><span class="cm">     * an IllegalArgumentException if the file does not contain valid ICC</span></span>
<span id="LC955" class="line" lang="java"><span class="cm">     * Profile data.</span></span>
<span id="LC956" class="line" lang="java"><span class="cm">     * @param fileName The file that contains the data for the profile.</span></span>
<span id="LC957" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC958" class="line" lang="java"><span class="cm">     * @return an &lt;code&gt;ICC_Profile&lt;/code&gt; object corresponding to</span></span>
<span id="LC959" class="line" lang="java"><span class="cm">     *          the data in the specified file.</span></span>
<span id="LC960" class="line" lang="java"><span class="cm">     * @exception IOException If the specified file cannot be opened or</span></span>
<span id="LC961" class="line" lang="java"><span class="cm">     * an I/O error occurs while reading the file.</span></span>
<span id="LC962" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC963" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException If the file does not</span></span>
<span id="LC964" class="line" lang="java"><span class="cm">     * contain valid ICC Profile data.</span></span>
<span id="LC965" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC966" class="line" lang="java"><span class="cm">     * @exception SecurityException If a security manager is installed</span></span>
<span id="LC967" class="line" lang="java"><span class="cm">     * and it does not permit read access to the given file.</span></span>
<span id="LC968" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC969" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nf">getInstance</span><span class="o">(</span><span class="nc">String</span> <span class="n">fileName</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">IOException</span> <span class="o">{</span></span>
<span id="LC970" class="line" lang="java">        <span class="n">ICC_Profile</span> <span class="n">thisProfile</span><span class="o">;</span></span>
<span id="LC971" class="line" lang="java">        <span class="nc">FileInputStream</span> <span class="n">fis</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC972" class="line" lang="java"></span>
<span id="LC973" class="line" lang="java"></span>
<span id="LC974" class="line" lang="java">        <span class="nc">File</span> <span class="n">f</span> <span class="o">=</span> <span class="n">getProfileFile</span><span class="o">(</span><span class="n">fileName</span><span class="o">);</span></span>
<span id="LC975" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">f</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC976" class="line" lang="java">            <span class="n">fis</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">FileInputStream</span><span class="o">(</span><span class="n">f</span><span class="o">);</span></span>
<span id="LC977" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC978" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">fis</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC979" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IOException</span><span class="o">(</span><span class="s">"Cannot open file "</span> <span class="o">+</span> <span class="n">fileName</span><span class="o">);</span></span>
<span id="LC980" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC981" class="line" lang="java"></span>
<span id="LC982" class="line" lang="java">        <span class="n">thisProfile</span> <span class="o">=</span> <span class="n">getInstance</span><span class="o">(</span><span class="n">fis</span><span class="o">);</span></span>
<span id="LC983" class="line" lang="java"></span>
<span id="LC984" class="line" lang="java">        <span class="n">fis</span><span class="o">.</span><span class="na">close</span><span class="o">();</span>    <span class="cm">/* close the file */</span></span>
<span id="LC985" class="line" lang="java"></span>
<span id="LC986" class="line" lang="java">        <span class="k">return</span> <span class="n">thisProfile</span><span class="o">;</span></span>
<span id="LC987" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC988" class="line" lang="java"></span>
<span id="LC989" class="line" lang="java"></span>
<span id="LC990" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC991" class="line" lang="java"><span class="cm">     * Constructs an ICC_Profile corresponding to the data in an InputStream.</span></span>
<span id="LC992" class="line" lang="java"><span class="cm">     * This method throws an IllegalArgumentException if the stream does not</span></span>
<span id="LC993" class="line" lang="java"><span class="cm">     * contain valid ICC Profile data.  It throws an IOException if an I/O</span></span>
<span id="LC994" class="line" lang="java"><span class="cm">     * error occurs while reading the stream.</span></span>
<span id="LC995" class="line" lang="java"><span class="cm">     * @param s The input stream from which to read the profile data.</span></span>
<span id="LC996" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC997" class="line" lang="java"><span class="cm">     * @return an &lt;CODE&gt;ICC_Profile&lt;/CODE&gt; object corresponding to the</span></span>
<span id="LC998" class="line" lang="java"><span class="cm">     *     data in the specified &lt;code&gt;InputStream&lt;/code&gt;.</span></span>
<span id="LC999" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1000" class="line" lang="java"><span class="cm">     * @exception IOException If an I/O error occurs while reading the stream.</span></span>
<span id="LC1001" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1002" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException If the stream does not</span></span>
<span id="LC1003" class="line" lang="java"><span class="cm">     * contain valid ICC Profile data.</span></span>
<span id="LC1004" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1005" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nf">getInstance</span><span class="o">(</span><span class="nc">InputStream</span> <span class="n">s</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">IOException</span> <span class="o">{</span></span>
<span id="LC1006" class="line" lang="java">    <span class="kt">byte</span> <span class="n">profileData</span><span class="o">[];</span></span>
<span id="LC1007" class="line" lang="java"></span>
<span id="LC1008" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="k">instanceof</span> <span class="nc">ProfileDeferralInfo</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1009" class="line" lang="java">            <span class="cm">/* hack to detect profiles whose loading can be deferred */</span></span>
<span id="LC1010" class="line" lang="java">            <span class="k">return</span> <span class="nf">getDeferredInstance</span><span class="o">((</span><span class="nc">ProfileDeferralInfo</span><span class="o">)</span> <span class="n">s</span><span class="o">);</span></span>
<span id="LC1011" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1012" class="line" lang="java"></span>
<span id="LC1013" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">profileData</span> <span class="o">=</span> <span class="n">getProfileDataFromStream</span><span class="o">(</span><span class="n">s</span><span class="o">))</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1014" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="s">"Invalid ICC Profile Data"</span><span class="o">);</span></span>
<span id="LC1015" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1016" class="line" lang="java"></span>
<span id="LC1017" class="line" lang="java">        <span class="k">return</span> <span class="nf">getInstance</span><span class="o">(</span><span class="n">profileData</span><span class="o">);</span></span>
<span id="LC1018" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1019" class="line" lang="java"></span>
<span id="LC1020" class="line" lang="java"></span>
<span id="LC1021" class="line" lang="java">    <span class="kd">static</span> <span class="kt">byte</span><span class="o">[]</span> <span class="nf">getProfileDataFromStream</span><span class="o">(</span><span class="nc">InputStream</span> <span class="n">s</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">IOException</span> <span class="o">{</span></span>
<span id="LC1022" class="line" lang="java">    <span class="kt">byte</span> <span class="n">profileData</span><span class="o">[];</span></span>
<span id="LC1023" class="line" lang="java">    <span class="kt">int</span> <span class="n">profileSize</span><span class="o">;</span></span>
<span id="LC1024" class="line" lang="java"></span>
<span id="LC1025" class="line" lang="java">        <span class="kt">byte</span> <span class="n">header</span><span class="o">[]</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">byte</span><span class="o">[</span><span class="mi">128</span><span class="o">];</span></span>
<span id="LC1026" class="line" lang="java">        <span class="kt">int</span> <span class="n">bytestoread</span> <span class="o">=</span> <span class="mi">128</span><span class="o">;</span></span>
<span id="LC1027" class="line" lang="java">        <span class="kt">int</span> <span class="n">bytesread</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC1028" class="line" lang="java">        <span class="kt">int</span> <span class="n">n</span><span class="o">;</span></span>
<span id="LC1029" class="line" lang="java"></span>
<span id="LC1030" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">bytestoread</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1031" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">n</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">read</span><span class="o">(</span><span class="n">header</span><span class="o">,</span> <span class="n">bytesread</span><span class="o">,</span> <span class="n">bytestoread</span><span class="o">))</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1032" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1033" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1034" class="line" lang="java">            <span class="n">bytesread</span> <span class="o">+=</span> <span class="n">n</span><span class="o">;</span></span>
<span id="LC1035" class="line" lang="java">            <span class="n">bytestoread</span> <span class="o">-=</span> <span class="n">n</span><span class="o">;</span></span>
<span id="LC1036" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1037" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">header</span><span class="o">[</span><span class="mi">36</span><span class="o">]</span> <span class="o">!=</span> <span class="mh">0x61</span> <span class="o">||</span> <span class="n">header</span><span class="o">[</span><span class="mi">37</span><span class="o">]</span> <span class="o">!=</span> <span class="mh">0x63</span> <span class="o">||</span></span>
<span id="LC1038" class="line" lang="java">            <span class="n">header</span><span class="o">[</span><span class="mi">38</span><span class="o">]</span> <span class="o">!=</span> <span class="mh">0x73</span> <span class="o">||</span> <span class="n">header</span><span class="o">[</span><span class="mi">39</span><span class="o">]</span> <span class="o">!=</span> <span class="mh">0x70</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1039" class="line" lang="java">            <span class="k">return</span> <span class="kc">null</span><span class="o">;</span>   <span class="cm">/* not a valid profile */</span></span>
<span id="LC1040" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1041" class="line" lang="java">        <span class="n">profileSize</span> <span class="o">=</span> <span class="o">((</span><span class="n">header</span><span class="o">[</span><span class="mi">0</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">)</span> <span class="o">&lt;&lt;</span> <span class="mi">24</span><span class="o">)</span> <span class="o">|</span></span>
<span id="LC1042" class="line" lang="java">                      <span class="o">((</span><span class="n">header</span><span class="o">[</span><span class="mi">1</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">)</span> <span class="o">&lt;&lt;</span> <span class="mi">16</span><span class="o">)</span> <span class="o">|</span></span>
<span id="LC1043" class="line" lang="java">                      <span class="o">((</span><span class="n">header</span><span class="o">[</span><span class="mi">2</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">)</span> <span class="o">&lt;&lt;</span>  <span class="mi">8</span><span class="o">)</span> <span class="o">|</span></span>
<span id="LC1044" class="line" lang="java">                       <span class="o">(</span><span class="n">header</span><span class="o">[</span><span class="mi">3</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">);</span></span>
<span id="LC1045" class="line" lang="java">        <span class="n">profileData</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">byte</span><span class="o">[</span><span class="n">profileSize</span><span class="o">];</span></span>
<span id="LC1046" class="line" lang="java">        <span class="nc">System</span><span class="o">.</span><span class="na">arraycopy</span><span class="o">(</span><span class="n">header</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="n">profileData</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">128</span><span class="o">);</span></span>
<span id="LC1047" class="line" lang="java">        <span class="n">bytestoread</span> <span class="o">=</span> <span class="n">profileSize</span> <span class="o">-</span> <span class="mi">128</span><span class="o">;</span></span>
<span id="LC1048" class="line" lang="java">        <span class="n">bytesread</span> <span class="o">=</span> <span class="mi">128</span><span class="o">;</span></span>
<span id="LC1049" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">bytestoread</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1050" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">n</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">read</span><span class="o">(</span><span class="n">profileData</span><span class="o">,</span> <span class="n">bytesread</span><span class="o">,</span> <span class="n">bytestoread</span><span class="o">))</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1051" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1052" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1053" class="line" lang="java">            <span class="n">bytesread</span> <span class="o">+=</span> <span class="n">n</span><span class="o">;</span></span>
<span id="LC1054" class="line" lang="java">            <span class="n">bytestoread</span> <span class="o">-=</span> <span class="n">n</span><span class="o">;</span></span>
<span id="LC1055" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1056" class="line" lang="java"></span>
<span id="LC1057" class="line" lang="java">        <span class="k">return</span> <span class="n">profileData</span><span class="o">;</span></span>
<span id="LC1058" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1059" class="line" lang="java"></span>
<span id="LC1060" class="line" lang="java"></span>
<span id="LC1061" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1062" class="line" lang="java"><span class="cm">     * Constructs an ICC_Profile for which the actual loading of the</span></span>
<span id="LC1063" class="line" lang="java"><span class="cm">     * profile data from a file and the initialization of the CMM should</span></span>
<span id="LC1064" class="line" lang="java"><span class="cm">     * be deferred as long as possible.</span></span>
<span id="LC1065" class="line" lang="java"><span class="cm">     * Deferral is only used for standard profiles.</span></span>
<span id="LC1066" class="line" lang="java"><span class="cm">     * If deferring is disabled, then getStandardProfile() ensures</span></span>
<span id="LC1067" class="line" lang="java"><span class="cm">     * that all of the appropriate access privileges are granted</span></span>
<span id="LC1068" class="line" lang="java"><span class="cm">     * when loading this profile.</span></span>
<span id="LC1069" class="line" lang="java"><span class="cm">     * If deferring is enabled, then the deferred activation</span></span>
<span id="LC1070" class="line" lang="java"><span class="cm">     * code will take care of access privileges.</span></span>
<span id="LC1071" class="line" lang="java"><span class="cm">     * @see activateDeferredProfile()</span></span>
<span id="LC1072" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1073" class="line" lang="java">    <span class="kd">static</span> <span class="n">ICC_Profile</span> <span class="nf">getDeferredInstance</span><span class="o">(</span><span class="nc">ProfileDeferralInfo</span> <span class="n">pdi</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1074" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">deferring</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1075" class="line" lang="java">            <span class="k">return</span> <span class="nf">getStandardProfile</span><span class="o">(</span><span class="n">pdi</span><span class="o">.</span><span class="na">filename</span><span class="o">);</span></span>
<span id="LC1076" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1077" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">pdi</span><span class="o">.</span><span class="na">colorSpaceType</span> <span class="o">==</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_RGB</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1078" class="line" lang="java">            <span class="k">return</span> <span class="k">new</span> <span class="nf">ICC_ProfileRGB</span><span class="o">(</span><span class="n">pdi</span><span class="o">);</span></span>
<span id="LC1079" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">pdi</span><span class="o">.</span><span class="na">colorSpaceType</span> <span class="o">==</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_GRAY</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1080" class="line" lang="java">            <span class="k">return</span> <span class="k">new</span> <span class="nf">ICC_ProfileGray</span><span class="o">(</span><span class="n">pdi</span><span class="o">);</span></span>
<span id="LC1081" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1082" class="line" lang="java">            <span class="k">return</span> <span class="k">new</span> <span class="nf">ICC_Profile</span><span class="o">(</span><span class="n">pdi</span><span class="o">);</span></span>
<span id="LC1083" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1084" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1085" class="line" lang="java"></span>
<span id="LC1086" class="line" lang="java"></span>
<span id="LC1087" class="line" lang="java">    <span class="kt">void</span> <span class="nf">activateDeferredProfile</span><span class="o">()</span> <span class="kd">throws</span> <span class="nc">ProfileDataException</span> <span class="o">{</span></span>
<span id="LC1088" class="line" lang="java">        <span class="kt">byte</span> <span class="n">profileData</span><span class="o">[];</span></span>
<span id="LC1089" class="line" lang="java">        <span class="nc">FileInputStream</span> <span class="n">fis</span><span class="o">;</span></span>
<span id="LC1090" class="line" lang="java">        <span class="kd">final</span> <span class="nc">String</span> <span class="n">fileName</span> <span class="o">=</span> <span class="n">deferralInfo</span><span class="o">.</span><span class="na">filename</span><span class="o">;</span></span>
<span id="LC1091" class="line" lang="java"></span>
<span id="LC1092" class="line" lang="java">        <span class="n">profileActivator</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1093" class="line" lang="java">        <span class="n">deferralInfo</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1094" class="line" lang="java">        <span class="nc">PrivilegedAction</span><span class="o">&lt;</span><span class="nc">FileInputStream</span><span class="o">&gt;</span> <span class="n">pa</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">PrivilegedAction</span><span class="o">&lt;</span><span class="nc">FileInputStream</span><span class="o">&gt;()</span> <span class="o">{</span></span>
<span id="LC1095" class="line" lang="java">            <span class="kd">public</span> <span class="nc">FileInputStream</span> <span class="nf">run</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1096" class="line" lang="java">                <span class="nc">File</span> <span class="n">f</span> <span class="o">=</span> <span class="n">getStandardProfileFile</span><span class="o">(</span><span class="n">fileName</span><span class="o">);</span></span>
<span id="LC1097" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">f</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1098" class="line" lang="java">                    <span class="k">try</span> <span class="o">{</span></span>
<span id="LC1099" class="line" lang="java">                        <span class="k">return</span> <span class="k">new</span> <span class="nf">FileInputStream</span><span class="o">(</span><span class="n">f</span><span class="o">);</span></span>
<span id="LC1100" class="line" lang="java">                    <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">FileNotFoundException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{}</span></span>
<span id="LC1101" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1102" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1103" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1104" class="line" lang="java">        <span class="o">};</span></span>
<span id="LC1105" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">fis</span> <span class="o">=</span> <span class="nc">AccessController</span><span class="o">.</span><span class="na">doPrivileged</span><span class="o">(</span><span class="n">pa</span><span class="o">))</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1106" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">ProfileDataException</span><span class="o">(</span><span class="s">"Cannot open file "</span> <span class="o">+</span> <span class="n">fileName</span><span class="o">);</span></span>
<span id="LC1107" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1108" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC1109" class="line" lang="java">            <span class="n">profileData</span> <span class="o">=</span> <span class="n">getProfileDataFromStream</span><span class="o">(</span><span class="n">fis</span><span class="o">);</span></span>
<span id="LC1110" class="line" lang="java">            <span class="n">fis</span><span class="o">.</span><span class="na">close</span><span class="o">();</span>    <span class="cm">/* close the file */</span></span>
<span id="LC1111" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1112" class="line" lang="java">        <span class="k">catch</span> <span class="o">(</span><span class="nc">IOException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1113" class="line" lang="java">            <span class="nc">ProfileDataException</span> <span class="n">pde</span> <span class="o">=</span> <span class="k">new</span></span>
<span id="LC1114" class="line" lang="java">                <span class="nc">ProfileDataException</span><span class="o">(</span><span class="s">"Invalid ICC Profile Data"</span> <span class="o">+</span> <span class="n">fileName</span><span class="o">);</span></span>
<span id="LC1115" class="line" lang="java">            <span class="n">pde</span><span class="o">.</span><span class="na">initCause</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></span>
<span id="LC1116" class="line" lang="java">            <span class="k">throw</span> <span class="n">pde</span><span class="o">;</span></span>
<span id="LC1117" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1118" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">profileData</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1119" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">ProfileDataException</span><span class="o">(</span><span class="s">"Invalid ICC Profile Data"</span> <span class="o">+</span></span>
<span id="LC1120" class="line" lang="java">                <span class="n">fileName</span><span class="o">);</span></span>
<span id="LC1121" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1122" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC1123" class="line" lang="java">            <span class="n">cmmProfile</span> <span class="o">=</span> <span class="nc">CMSManager</span><span class="o">.</span><span class="na">getModule</span><span class="o">().</span><span class="na">loadProfile</span><span class="o">(</span><span class="n">profileData</span><span class="o">);</span></span>
<span id="LC1124" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">CMMException</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1125" class="line" lang="java">            <span class="nc">ProfileDataException</span> <span class="n">pde</span> <span class="o">=</span> <span class="k">new</span></span>
<span id="LC1126" class="line" lang="java">                <span class="nc">ProfileDataException</span><span class="o">(</span><span class="s">"Invalid ICC Profile Data"</span> <span class="o">+</span> <span class="n">fileName</span><span class="o">);</span></span>
<span id="LC1127" class="line" lang="java">            <span class="n">pde</span><span class="o">.</span><span class="na">initCause</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></span>
<span id="LC1128" class="line" lang="java">            <span class="k">throw</span> <span class="n">pde</span><span class="o">;</span></span>
<span id="LC1129" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1130" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1131" class="line" lang="java"></span>
<span id="LC1132" class="line" lang="java"></span>
<span id="LC1133" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1134" class="line" lang="java"><span class="cm">     * Returns profile major version.</span></span>
<span id="LC1135" class="line" lang="java"><span class="cm">     * @return  The major version of the profile.</span></span>
<span id="LC1136" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1137" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getMajorVersion</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1138" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">theHeader</span><span class="o">;</span></span>
<span id="LC1139" class="line" lang="java"></span>
<span id="LC1140" class="line" lang="java">        <span class="n">theHeader</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">icSigHead</span><span class="o">);</span> <span class="cm">/* getData will activate deferred</span></span>
<span id="LC1141" class="line" lang="java"><span class="cm">                                           profiles if necessary */</span></span>
<span id="LC1142" class="line" lang="java"></span>
<span id="LC1143" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span> <span class="n">theHeader</span><span class="o">[</span><span class="mi">8</span><span class="o">];</span></span>
<span id="LC1144" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1145" class="line" lang="java"></span>
<span id="LC1146" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1147" class="line" lang="java"><span class="cm">     * Returns profile minor version.</span></span>
<span id="LC1148" class="line" lang="java"><span class="cm">     * @return The minor version of the profile.</span></span>
<span id="LC1149" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1150" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getMinorVersion</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1151" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">theHeader</span><span class="o">;</span></span>
<span id="LC1152" class="line" lang="java"></span>
<span id="LC1153" class="line" lang="java">        <span class="n">theHeader</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">icSigHead</span><span class="o">);</span> <span class="cm">/* getData will activate deferred</span></span>
<span id="LC1154" class="line" lang="java"><span class="cm">                                           profiles if necessary */</span></span>
<span id="LC1155" class="line" lang="java"></span>
<span id="LC1156" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span> <span class="n">theHeader</span><span class="o">[</span><span class="mi">9</span><span class="o">];</span></span>
<span id="LC1157" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1158" class="line" lang="java"></span>
<span id="LC1159" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1160" class="line" lang="java"><span class="cm">     * Returns the profile class.</span></span>
<span id="LC1161" class="line" lang="java"><span class="cm">     * @return One of the predefined profile class constants.</span></span>
<span id="LC1162" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1163" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getProfileClass</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1164" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">theHeader</span><span class="o">;</span></span>
<span id="LC1165" class="line" lang="java">    <span class="kt">int</span> <span class="n">theClassSig</span><span class="o">,</span> <span class="n">theClass</span><span class="o">;</span></span>
<span id="LC1166" class="line" lang="java"></span>
<span id="LC1167" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">deferralInfo</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1168" class="line" lang="java">            <span class="k">return</span> <span class="n">deferralInfo</span><span class="o">.</span><span class="na">profileClass</span><span class="o">;</span> <span class="cm">/* Need to have this info for</span></span>
<span id="LC1169" class="line" lang="java"><span class="cm">                                                 ICC_ColorSpace without</span></span>
<span id="LC1170" class="line" lang="java"><span class="cm">                                                 causing a deferred profile</span></span>
<span id="LC1171" class="line" lang="java"><span class="cm">                                                 to be loaded */</span></span>
<span id="LC1172" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1173" class="line" lang="java"></span>
<span id="LC1174" class="line" lang="java">        <span class="n">theHeader</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">icSigHead</span><span class="o">);</span></span>
<span id="LC1175" class="line" lang="java"></span>
<span id="LC1176" class="line" lang="java">        <span class="n">theClassSig</span> <span class="o">=</span> <span class="n">intFromBigEndian</span> <span class="o">(</span><span class="n">theHeader</span><span class="o">,</span> <span class="n">icHdrDeviceClass</span><span class="o">);</span></span>
<span id="LC1177" class="line" lang="java"></span>
<span id="LC1178" class="line" lang="java">        <span class="k">switch</span> <span class="o">(</span><span class="n">theClassSig</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1179" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigInputClass:</span></span>
<span id="LC1180" class="line" lang="java">            <span class="n">theClass</span> <span class="o">=</span> <span class="no">CLASS_INPUT</span><span class="o">;</span></span>
<span id="LC1181" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1182" class="line" lang="java"></span>
<span id="LC1183" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigDisplayClass:</span></span>
<span id="LC1184" class="line" lang="java">            <span class="n">theClass</span> <span class="o">=</span> <span class="no">CLASS_DISPLAY</span><span class="o">;</span></span>
<span id="LC1185" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1186" class="line" lang="java"></span>
<span id="LC1187" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigOutputClass:</span></span>
<span id="LC1188" class="line" lang="java">            <span class="n">theClass</span> <span class="o">=</span> <span class="no">CLASS_OUTPUT</span><span class="o">;</span></span>
<span id="LC1189" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1190" class="line" lang="java"></span>
<span id="LC1191" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigLinkClass:</span></span>
<span id="LC1192" class="line" lang="java">            <span class="n">theClass</span> <span class="o">=</span> <span class="no">CLASS_DEVICELINK</span><span class="o">;</span></span>
<span id="LC1193" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1194" class="line" lang="java"></span>
<span id="LC1195" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigColorSpaceClass:</span></span>
<span id="LC1196" class="line" lang="java">            <span class="n">theClass</span> <span class="o">=</span> <span class="no">CLASS_COLORSPACECONVERSION</span><span class="o">;</span></span>
<span id="LC1197" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1198" class="line" lang="java"></span>
<span id="LC1199" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigAbstractClass:</span></span>
<span id="LC1200" class="line" lang="java">            <span class="n">theClass</span> <span class="o">=</span> <span class="no">CLASS_ABSTRACT</span><span class="o">;</span></span>
<span id="LC1201" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1202" class="line" lang="java"></span>
<span id="LC1203" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigNamedColorClass:</span></span>
<span id="LC1204" class="line" lang="java">            <span class="n">theClass</span> <span class="o">=</span> <span class="no">CLASS_NAMEDCOLOR</span><span class="o">;</span></span>
<span id="LC1205" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1206" class="line" lang="java"></span>
<span id="LC1207" class="line" lang="java">        <span class="k">default</span><span class="o">:</span></span>
<span id="LC1208" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="s">"Unknown profile class"</span><span class="o">);</span></span>
<span id="LC1209" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1210" class="line" lang="java"></span>
<span id="LC1211" class="line" lang="java">        <span class="k">return</span> <span class="n">theClass</span><span class="o">;</span></span>
<span id="LC1212" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1213" class="line" lang="java"></span>
<span id="LC1214" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1215" class="line" lang="java"><span class="cm">     * Returns the color space type.  Returns one of the color space type</span></span>
<span id="LC1216" class="line" lang="java"><span class="cm">     * constants defined by the ColorSpace class.  This is the</span></span>
<span id="LC1217" class="line" lang="java"><span class="cm">     * "input" color space of the profile.  The type defines the</span></span>
<span id="LC1218" class="line" lang="java"><span class="cm">     * number of components of the color space and the interpretation,</span></span>
<span id="LC1219" class="line" lang="java"><span class="cm">     * e.g. TYPE_RGB identifies a color space with three components - red,</span></span>
<span id="LC1220" class="line" lang="java"><span class="cm">     * green, and blue.  It does not define the particular color</span></span>
<span id="LC1221" class="line" lang="java"><span class="cm">     * characteristics of the space, e.g. the chromaticities of the</span></span>
<span id="LC1222" class="line" lang="java"><span class="cm">     * primaries.</span></span>
<span id="LC1223" class="line" lang="java"><span class="cm">     * @return One of the color space type constants defined in the</span></span>
<span id="LC1224" class="line" lang="java"><span class="cm">     * &lt;CODE&gt;ColorSpace&lt;/CODE&gt; class.</span></span>
<span id="LC1225" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1226" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getColorSpaceType</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1227" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">deferralInfo</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1228" class="line" lang="java">            <span class="k">return</span> <span class="n">deferralInfo</span><span class="o">.</span><span class="na">colorSpaceType</span><span class="o">;</span> <span class="cm">/* Need to have this info for</span></span>
<span id="LC1229" class="line" lang="java"><span class="cm">                                                   ICC_ColorSpace without</span></span>
<span id="LC1230" class="line" lang="java"><span class="cm">                                                   causing a deferred profile</span></span>
<span id="LC1231" class="line" lang="java"><span class="cm">                                                   to be loaded */</span></span>
<span id="LC1232" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1233" class="line" lang="java">        <span class="k">return</span>    <span class="nf">getColorSpaceType</span><span class="o">(</span><span class="n">cmmProfile</span><span class="o">);</span></span>
<span id="LC1234" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1235" class="line" lang="java"></span>
<span id="LC1236" class="line" lang="java">    <span class="kd">static</span> <span class="kt">int</span> <span class="nf">getColorSpaceType</span><span class="o">(</span><span class="nc">Profile</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1237" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">theHeader</span><span class="o">;</span></span>
<span id="LC1238" class="line" lang="java">    <span class="kt">int</span> <span class="n">theColorSpaceSig</span><span class="o">,</span> <span class="n">theColorSpace</span><span class="o">;</span></span>
<span id="LC1239" class="line" lang="java"></span>
<span id="LC1240" class="line" lang="java">        <span class="n">theHeader</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigHead</span><span class="o">);</span></span>
<span id="LC1241" class="line" lang="java">        <span class="n">theColorSpaceSig</span> <span class="o">=</span> <span class="n">intFromBigEndian</span><span class="o">(</span><span class="n">theHeader</span><span class="o">,</span> <span class="n">icHdrColorSpace</span><span class="o">);</span></span>
<span id="LC1242" class="line" lang="java">        <span class="n">theColorSpace</span> <span class="o">=</span> <span class="n">iccCStoJCS</span> <span class="o">(</span><span class="n">theColorSpaceSig</span><span class="o">);</span></span>
<span id="LC1243" class="line" lang="java">        <span class="k">return</span> <span class="n">theColorSpace</span><span class="o">;</span></span>
<span id="LC1244" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1245" class="line" lang="java"></span>
<span id="LC1246" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1247" class="line" lang="java"><span class="cm">     * Returns the color space type of the Profile Connection Space (PCS).</span></span>
<span id="LC1248" class="line" lang="java"><span class="cm">     * Returns one of the color space type constants defined by the</span></span>
<span id="LC1249" class="line" lang="java"><span class="cm">     * ColorSpace class.  This is the "output" color space of the</span></span>
<span id="LC1250" class="line" lang="java"><span class="cm">     * profile.  For an input, display, or output profile useful</span></span>
<span id="LC1251" class="line" lang="java"><span class="cm">     * for tagging colors or images, this will be either TYPE_XYZ or</span></span>
<span id="LC1252" class="line" lang="java"><span class="cm">     * TYPE_Lab and should be interpreted as the corresponding specific</span></span>
<span id="LC1253" class="line" lang="java"><span class="cm">     * color space defined in the ICC specification.  For a device</span></span>
<span id="LC1254" class="line" lang="java"><span class="cm">     * link profile, this could be any of the color space type constants.</span></span>
<span id="LC1255" class="line" lang="java"><span class="cm">     * @return One of the color space type constants defined in the</span></span>
<span id="LC1256" class="line" lang="java"><span class="cm">     * &lt;CODE&gt;ColorSpace&lt;/CODE&gt; class.</span></span>
<span id="LC1257" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1258" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getPCSType</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1259" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">deferring</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1260" class="line" lang="java">            <span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">activateProfiles</span><span class="o">();</span></span>
<span id="LC1261" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1262" class="line" lang="java">        <span class="k">return</span> <span class="nf">getPCSType</span><span class="o">(</span><span class="n">cmmProfile</span><span class="o">);</span></span>
<span id="LC1263" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1264" class="line" lang="java"></span>
<span id="LC1265" class="line" lang="java"></span>
<span id="LC1266" class="line" lang="java">    <span class="kd">static</span> <span class="kt">int</span> <span class="nf">getPCSType</span><span class="o">(</span><span class="nc">Profile</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1267" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">theHeader</span><span class="o">;</span></span>
<span id="LC1268" class="line" lang="java">    <span class="kt">int</span> <span class="n">thePCSSig</span><span class="o">,</span> <span class="n">thePCS</span><span class="o">;</span></span>
<span id="LC1269" class="line" lang="java"></span>
<span id="LC1270" class="line" lang="java">        <span class="n">theHeader</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">icSigHead</span><span class="o">);</span></span>
<span id="LC1271" class="line" lang="java">        <span class="n">thePCSSig</span> <span class="o">=</span> <span class="n">intFromBigEndian</span><span class="o">(</span><span class="n">theHeader</span><span class="o">,</span> <span class="n">icHdrPcs</span><span class="o">);</span></span>
<span id="LC1272" class="line" lang="java">        <span class="n">thePCS</span> <span class="o">=</span> <span class="n">iccCStoJCS</span><span class="o">(</span><span class="n">thePCSSig</span><span class="o">);</span></span>
<span id="LC1273" class="line" lang="java">        <span class="k">return</span> <span class="n">thePCS</span><span class="o">;</span></span>
<span id="LC1274" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1275" class="line" lang="java"></span>
<span id="LC1276" class="line" lang="java"></span>
<span id="LC1277" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1278" class="line" lang="java"><span class="cm">     * Write this ICC_Profile to a file.</span></span>
<span id="LC1279" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1280" class="line" lang="java"><span class="cm">     * @param fileName The file to write the profile data to.</span></span>
<span id="LC1281" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1282" class="line" lang="java"><span class="cm">     * @exception IOException If the file cannot be opened for writing</span></span>
<span id="LC1283" class="line" lang="java"><span class="cm">     * or an I/O error occurs while writing to the file.</span></span>
<span id="LC1284" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1285" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">write</span><span class="o">(</span><span class="nc">String</span> <span class="n">fileName</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">IOException</span> <span class="o">{</span></span>
<span id="LC1286" class="line" lang="java">    <span class="nc">FileOutputStream</span> <span class="n">outputFile</span><span class="o">;</span></span>
<span id="LC1287" class="line" lang="java">    <span class="kt">byte</span> <span class="n">profileData</span><span class="o">[];</span></span>
<span id="LC1288" class="line" lang="java"></span>
<span id="LC1289" class="line" lang="java">        <span class="n">profileData</span> <span class="o">=</span> <span class="n">getData</span><span class="o">();</span> <span class="cm">/* this will activate deferred</span></span>
<span id="LC1290" class="line" lang="java"><span class="cm">                                    profiles if necessary */</span></span>
<span id="LC1291" class="line" lang="java">        <span class="n">outputFile</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">FileOutputStream</span><span class="o">(</span><span class="n">fileName</span><span class="o">);</span></span>
<span id="LC1292" class="line" lang="java">        <span class="n">outputFile</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">profileData</span><span class="o">);</span></span>
<span id="LC1293" class="line" lang="java">        <span class="n">outputFile</span><span class="o">.</span><span class="na">close</span> <span class="o">();</span></span>
<span id="LC1294" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1295" class="line" lang="java"></span>
<span id="LC1296" class="line" lang="java"></span>
<span id="LC1297" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1298" class="line" lang="java"><span class="cm">     * Write this ICC_Profile to an OutputStream.</span></span>
<span id="LC1299" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1300" class="line" lang="java"><span class="cm">     * @param s The stream to write the profile data to.</span></span>
<span id="LC1301" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1302" class="line" lang="java"><span class="cm">     * @exception IOException If an I/O error occurs while writing to the</span></span>
<span id="LC1303" class="line" lang="java"><span class="cm">     * stream.</span></span>
<span id="LC1304" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1305" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">write</span><span class="o">(</span><span class="nc">OutputStream</span> <span class="n">s</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">IOException</span> <span class="o">{</span></span>
<span id="LC1306" class="line" lang="java">    <span class="kt">byte</span> <span class="n">profileData</span><span class="o">[];</span></span>
<span id="LC1307" class="line" lang="java"></span>
<span id="LC1308" class="line" lang="java">        <span class="n">profileData</span> <span class="o">=</span> <span class="n">getData</span><span class="o">();</span> <span class="cm">/* this will activate deferred</span></span>
<span id="LC1309" class="line" lang="java"><span class="cm">                                    profiles if necessary */</span></span>
<span id="LC1310" class="line" lang="java">        <span class="n">s</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">profileData</span><span class="o">);</span></span>
<span id="LC1311" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1312" class="line" lang="java"></span>
<span id="LC1313" class="line" lang="java"></span>
<span id="LC1314" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1315" class="line" lang="java"><span class="cm">     * Returns a byte array corresponding to the data of this ICC_Profile.</span></span>
<span id="LC1316" class="line" lang="java"><span class="cm">     * @return A byte array that contains the profile data.</span></span>
<span id="LC1317" class="line" lang="java"><span class="cm">     * @see #setData(int, byte[])</span></span>
<span id="LC1318" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1319" class="line" lang="java">    <span class="kd">public</span> <span class="kt">byte</span><span class="o">[]</span> <span class="nf">getData</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1320" class="line" lang="java">    <span class="kt">int</span> <span class="n">profileSize</span><span class="o">;</span></span>
<span id="LC1321" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">profileData</span><span class="o">;</span></span>
<span id="LC1322" class="line" lang="java"></span>
<span id="LC1323" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">deferring</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1324" class="line" lang="java">            <span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">activateProfiles</span><span class="o">();</span></span>
<span id="LC1325" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1326" class="line" lang="java"></span>
<span id="LC1327" class="line" lang="java">        <span class="no">PCMM</span> <span class="n">mdl</span> <span class="o">=</span> <span class="nc">CMSManager</span><span class="o">.</span><span class="na">getModule</span><span class="o">();</span></span>
<span id="LC1328" class="line" lang="java"></span>
<span id="LC1329" class="line" lang="java">        <span class="cm">/* get the number of bytes needed for this profile */</span></span>
<span id="LC1330" class="line" lang="java">        <span class="n">profileSize</span> <span class="o">=</span> <span class="n">mdl</span><span class="o">.</span><span class="na">getProfileSize</span><span class="o">(</span><span class="n">cmmProfile</span><span class="o">);</span></span>
<span id="LC1331" class="line" lang="java"></span>
<span id="LC1332" class="line" lang="java">        <span class="n">profileData</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">byte</span> <span class="o">[</span><span class="n">profileSize</span><span class="o">];</span></span>
<span id="LC1333" class="line" lang="java"></span>
<span id="LC1334" class="line" lang="java">        <span class="cm">/* get the data for the profile */</span></span>
<span id="LC1335" class="line" lang="java">        <span class="n">mdl</span><span class="o">.</span><span class="na">getProfileData</span><span class="o">(</span><span class="n">cmmProfile</span><span class="o">,</span> <span class="n">profileData</span><span class="o">);</span></span>
<span id="LC1336" class="line" lang="java"></span>
<span id="LC1337" class="line" lang="java">        <span class="k">return</span> <span class="n">profileData</span><span class="o">;</span></span>
<span id="LC1338" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1339" class="line" lang="java"></span>
<span id="LC1340" class="line" lang="java"></span>
<span id="LC1341" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1342" class="line" lang="java"><span class="cm">     * Returns a particular tagged data element from the profile as</span></span>
<span id="LC1343" class="line" lang="java"><span class="cm">     * a byte array.  Elements are identified by signatures</span></span>
<span id="LC1344" class="line" lang="java"><span class="cm">     * as defined in the ICC specification.  The signature</span></span>
<span id="LC1345" class="line" lang="java"><span class="cm">     * icSigHead can be used to get the header.  This method is useful</span></span>
<span id="LC1346" class="line" lang="java"><span class="cm">     * for advanced applets or applications which need to access</span></span>
<span id="LC1347" class="line" lang="java"><span class="cm">     * profile data directly.</span></span>
<span id="LC1348" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1349" class="line" lang="java"><span class="cm">     * @param tagSignature The ICC tag signature for the data element you</span></span>
<span id="LC1350" class="line" lang="java"><span class="cm">     * want to get.</span></span>
<span id="LC1351" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1352" class="line" lang="java"><span class="cm">     * @return A byte array that contains the tagged data element. Returns</span></span>
<span id="LC1353" class="line" lang="java"><span class="cm">     * &lt;code&gt;null&lt;/code&gt; if the specified tag doesn't exist.</span></span>
<span id="LC1354" class="line" lang="java"><span class="cm">     * @see #setData(int, byte[])</span></span>
<span id="LC1355" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1356" class="line" lang="java">    <span class="kd">public</span> <span class="kt">byte</span><span class="o">[]</span> <span class="nf">getData</span><span class="o">(</span><span class="kt">int</span> <span class="n">tagSignature</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1357" class="line" lang="java"></span>
<span id="LC1358" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">deferring</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1359" class="line" lang="java">            <span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">activateProfiles</span><span class="o">();</span></span>
<span id="LC1360" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1361" class="line" lang="java"></span>
<span id="LC1362" class="line" lang="java">        <span class="k">return</span> <span class="nf">getData</span><span class="o">(</span><span class="n">cmmProfile</span><span class="o">,</span> <span class="n">tagSignature</span><span class="o">);</span></span>
<span id="LC1363" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1364" class="line" lang="java"></span>
<span id="LC1365" class="line" lang="java"></span>
<span id="LC1366" class="line" lang="java">    <span class="kd">static</span> <span class="kt">byte</span><span class="o">[]</span> <span class="nf">getData</span><span class="o">(</span><span class="nc">Profile</span> <span class="n">p</span><span class="o">,</span> <span class="kt">int</span> <span class="n">tagSignature</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1367" class="line" lang="java">    <span class="kt">int</span> <span class="n">tagSize</span><span class="o">;</span></span>
<span id="LC1368" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">tagData</span><span class="o">;</span></span>
<span id="LC1369" class="line" lang="java"></span>
<span id="LC1370" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC1371" class="line" lang="java">            <span class="no">PCMM</span> <span class="n">mdl</span> <span class="o">=</span> <span class="nc">CMSManager</span><span class="o">.</span><span class="na">getModule</span><span class="o">();</span></span>
<span id="LC1372" class="line" lang="java"></span>
<span id="LC1373" class="line" lang="java">            <span class="cm">/* get the number of bytes needed for this tag */</span></span>
<span id="LC1374" class="line" lang="java">            <span class="n">tagSize</span> <span class="o">=</span> <span class="n">mdl</span><span class="o">.</span><span class="na">getTagSize</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">tagSignature</span><span class="o">);</span></span>
<span id="LC1375" class="line" lang="java"></span>
<span id="LC1376" class="line" lang="java">            <span class="n">tagData</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">byte</span><span class="o">[</span><span class="n">tagSize</span><span class="o">];</span> <span class="cm">/* get an array for the tag */</span></span>
<span id="LC1377" class="line" lang="java"></span>
<span id="LC1378" class="line" lang="java">            <span class="cm">/* get the tag's data */</span></span>
<span id="LC1379" class="line" lang="java">            <span class="n">mdl</span><span class="o">.</span><span class="na">getTagData</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">tagSignature</span><span class="o">,</span> <span class="n">tagData</span><span class="o">);</span></span>
<span id="LC1380" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span><span class="o">(</span><span class="nc">CMMException</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1381" class="line" lang="java">            <span class="n">tagData</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1382" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1383" class="line" lang="java"></span>
<span id="LC1384" class="line" lang="java">        <span class="k">return</span> <span class="n">tagData</span><span class="o">;</span></span>
<span id="LC1385" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1386" class="line" lang="java"></span>
<span id="LC1387" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1388" class="line" lang="java"><span class="cm">     * Sets a particular tagged data element in the profile from</span></span>
<span id="LC1389" class="line" lang="java"><span class="cm">     * a byte array. The array should contain data in a format, corresponded</span></span>
<span id="LC1390" class="line" lang="java"><span class="cm">     * to the {@code tagSignature} as defined in the ICC specification, section 10.</span></span>
<span id="LC1391" class="line" lang="java"><span class="cm">     * This method is useful for advanced applets or applications which need to</span></span>
<span id="LC1392" class="line" lang="java"><span class="cm">     * access profile data directly.</span></span>
<span id="LC1393" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1394" class="line" lang="java"><span class="cm">     * @param tagSignature The ICC tag signature for the data element</span></span>
<span id="LC1395" class="line" lang="java"><span class="cm">     * you want to set.</span></span>
<span id="LC1396" class="line" lang="java"><span class="cm">     * @param tagData the data to set for the specified tag signature</span></span>
<span id="LC1397" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if {@code tagSignature} is not a signature</span></span>
<span id="LC1398" class="line" lang="java"><span class="cm">     *         as defined in the ICC specification.</span></span>
<span id="LC1399" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if a content of the {@code tagData}</span></span>
<span id="LC1400" class="line" lang="java"><span class="cm">     *         array can not be interpreted as valid tag data, corresponding</span></span>
<span id="LC1401" class="line" lang="java"><span class="cm">     *         to the {@code tagSignature}.</span></span>
<span id="LC1402" class="line" lang="java"><span class="cm">     * @see #getData</span></span>
<span id="LC1403" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1404" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setData</span><span class="o">(</span><span class="kt">int</span> <span class="n">tagSignature</span><span class="o">,</span> <span class="kt">byte</span><span class="o">[]</span> <span class="n">tagData</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1405" class="line" lang="java"></span>
<span id="LC1406" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">deferring</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1407" class="line" lang="java">            <span class="nc">ProfileDeferralMgr</span><span class="o">.</span><span class="na">activateProfiles</span><span class="o">();</span></span>
<span id="LC1408" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1409" class="line" lang="java"></span>
<span id="LC1410" class="line" lang="java">        <span class="nc">CMSManager</span><span class="o">.</span><span class="na">getModule</span><span class="o">().</span><span class="na">setTagData</span><span class="o">(</span><span class="n">cmmProfile</span><span class="o">,</span> <span class="n">tagSignature</span><span class="o">,</span> <span class="n">tagData</span><span class="o">);</span></span>
<span id="LC1411" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1412" class="line" lang="java"></span>
<span id="LC1413" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1414" class="line" lang="java"><span class="cm">     * Sets the rendering intent of the profile.</span></span>
<span id="LC1415" class="line" lang="java"><span class="cm">     * This is used to select the proper transform from a profile that</span></span>
<span id="LC1416" class="line" lang="java"><span class="cm">     * has multiple transforms.</span></span>
<span id="LC1417" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1418" class="line" lang="java">    <span class="kt">void</span> <span class="nf">setRenderingIntent</span><span class="o">(</span><span class="kt">int</span> <span class="n">renderingIntent</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1419" class="line" lang="java">        <span class="kt">byte</span><span class="o">[]</span> <span class="n">theHeader</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">icSigHead</span><span class="o">);</span><span class="cm">/* getData will activate deferred</span></span>
<span id="LC1420" class="line" lang="java"><span class="cm">                                                 profiles if necessary */</span></span>
<span id="LC1421" class="line" lang="java">        <span class="n">intToBigEndian</span> <span class="o">(</span><span class="n">renderingIntent</span><span class="o">,</span> <span class="n">theHeader</span><span class="o">,</span> <span class="n">icHdrRenderingIntent</span><span class="o">);</span></span>
<span id="LC1422" class="line" lang="java">                                                 <span class="cm">/* set the rendering intent */</span></span>
<span id="LC1423" class="line" lang="java">        <span class="n">setData</span> <span class="o">(</span><span class="n">icSigHead</span><span class="o">,</span> <span class="n">theHeader</span><span class="o">);</span></span>
<span id="LC1424" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1425" class="line" lang="java"></span>
<span id="LC1426" class="line" lang="java"></span>
<span id="LC1427" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1428" class="line" lang="java"><span class="cm">     * Returns the rendering intent of the profile.</span></span>
<span id="LC1429" class="line" lang="java"><span class="cm">     * This is used to select the proper transform from a profile that</span></span>
<span id="LC1430" class="line" lang="java"><span class="cm">     * has multiple transforms.  It is typically set in a source profile</span></span>
<span id="LC1431" class="line" lang="java"><span class="cm">     * to select a transform from an output profile.</span></span>
<span id="LC1432" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1433" class="line" lang="java">    <span class="kt">int</span> <span class="nf">getRenderingIntent</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1434" class="line" lang="java">        <span class="kt">byte</span><span class="o">[]</span> <span class="n">theHeader</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">icSigHead</span><span class="o">);</span><span class="cm">/* getData will activate deferred</span></span>
<span id="LC1435" class="line" lang="java"><span class="cm">                                                 profiles if necessary */</span></span>
<span id="LC1436" class="line" lang="java"></span>
<span id="LC1437" class="line" lang="java">        <span class="kt">int</span> <span class="n">renderingIntent</span> <span class="o">=</span> <span class="n">intFromBigEndian</span><span class="o">(</span><span class="n">theHeader</span><span class="o">,</span> <span class="n">icHdrRenderingIntent</span><span class="o">);</span></span>
<span id="LC1438" class="line" lang="java">                                                 <span class="cm">/* set the rendering intent */</span></span>
<span id="LC1439" class="line" lang="java"></span>
<span id="LC1440" class="line" lang="java">        <span class="cm">/* According to ICC spec, only the least-significant 16 bits shall be</span></span>
<span id="LC1441" class="line" lang="java"><span class="cm">         * used to encode the rendering intent. The most significant 16 bits</span></span>
<span id="LC1442" class="line" lang="java"><span class="cm">         * shall be set to zero. Thus, we are ignoring two most significant</span></span>
<span id="LC1443" class="line" lang="java"><span class="cm">         * bytes here.</span></span>
<span id="LC1444" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC1445" class="line" lang="java"><span class="cm">         *  See http://www.color.org/ICC1v42_2006-05.pdf, section 7.2.15.</span></span>
<span id="LC1446" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC1447" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="mh">0xffff</span> <span class="o">&amp;</span> <span class="n">renderingIntent</span><span class="o">);</span></span>
<span id="LC1448" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1449" class="line" lang="java"></span>
<span id="LC1450" class="line" lang="java"></span>
<span id="LC1451" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1452" class="line" lang="java"><span class="cm">     * Returns the number of color components in the "input" color</span></span>
<span id="LC1453" class="line" lang="java"><span class="cm">     * space of this profile.  For example if the color space type</span></span>
<span id="LC1454" class="line" lang="java"><span class="cm">     * of this profile is TYPE_RGB, then this method will return 3.</span></span>
<span id="LC1455" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1456" class="line" lang="java"><span class="cm">     * @return The number of color components in the profile's input</span></span>
<span id="LC1457" class="line" lang="java"><span class="cm">     * color space.</span></span>
<span id="LC1458" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1459" class="line" lang="java"><span class="cm">     * @throws ProfileDataException if color space is in the profile</span></span>
<span id="LC1460" class="line" lang="java"><span class="cm">     *         is invalid</span></span>
<span id="LC1461" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1462" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getNumComponents</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1463" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span>    <span class="n">theHeader</span><span class="o">;</span></span>
<span id="LC1464" class="line" lang="java">    <span class="kt">int</span>    <span class="n">theColorSpaceSig</span><span class="o">,</span> <span class="n">theNumComponents</span><span class="o">;</span></span>
<span id="LC1465" class="line" lang="java"></span>
<span id="LC1466" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">deferralInfo</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1467" class="line" lang="java">            <span class="k">return</span> <span class="n">deferralInfo</span><span class="o">.</span><span class="na">numComponents</span><span class="o">;</span> <span class="cm">/* Need to have this info for</span></span>
<span id="LC1468" class="line" lang="java"><span class="cm">                                                  ICC_ColorSpace without</span></span>
<span id="LC1469" class="line" lang="java"><span class="cm">                                                  causing a deferred profile</span></span>
<span id="LC1470" class="line" lang="java"><span class="cm">                                                  to be loaded */</span></span>
<span id="LC1471" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1472" class="line" lang="java">        <span class="n">theHeader</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">icSigHead</span><span class="o">);</span></span>
<span id="LC1473" class="line" lang="java"></span>
<span id="LC1474" class="line" lang="java">        <span class="n">theColorSpaceSig</span> <span class="o">=</span> <span class="n">intFromBigEndian</span> <span class="o">(</span><span class="n">theHeader</span><span class="o">,</span> <span class="n">icHdrColorSpace</span><span class="o">);</span></span>
<span id="LC1475" class="line" lang="java"></span>
<span id="LC1476" class="line" lang="java">        <span class="k">switch</span> <span class="o">(</span><span class="n">theColorSpaceSig</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1477" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigGrayData:</span></span>
<span id="LC1478" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC1479" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1480" class="line" lang="java"></span>
<span id="LC1481" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace2CLR:</span></span>
<span id="LC1482" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">2</span><span class="o">;</span></span>
<span id="LC1483" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1484" class="line" lang="java"></span>
<span id="LC1485" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigXYZData:</span></span>
<span id="LC1486" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigLabData:</span></span>
<span id="LC1487" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigLuvData:</span></span>
<span id="LC1488" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigYCbCrData:</span></span>
<span id="LC1489" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigYxyData:</span></span>
<span id="LC1490" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigRgbData:</span></span>
<span id="LC1491" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigHsvData:</span></span>
<span id="LC1492" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigHlsData:</span></span>
<span id="LC1493" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigCmyData:</span></span>
<span id="LC1494" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace3CLR:</span></span>
<span id="LC1495" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">3</span><span class="o">;</span></span>
<span id="LC1496" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1497" class="line" lang="java"></span>
<span id="LC1498" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigCmykData:</span></span>
<span id="LC1499" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace4CLR:</span></span>
<span id="LC1500" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">4</span><span class="o">;</span></span>
<span id="LC1501" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1502" class="line" lang="java"></span>
<span id="LC1503" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace5CLR:</span></span>
<span id="LC1504" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">5</span><span class="o">;</span></span>
<span id="LC1505" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1506" class="line" lang="java"></span>
<span id="LC1507" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace6CLR:</span></span>
<span id="LC1508" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">6</span><span class="o">;</span></span>
<span id="LC1509" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1510" class="line" lang="java"></span>
<span id="LC1511" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace7CLR:</span></span>
<span id="LC1512" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">7</span><span class="o">;</span></span>
<span id="LC1513" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1514" class="line" lang="java"></span>
<span id="LC1515" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace8CLR:</span></span>
<span id="LC1516" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">8</span><span class="o">;</span></span>
<span id="LC1517" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1518" class="line" lang="java"></span>
<span id="LC1519" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace9CLR:</span></span>
<span id="LC1520" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">9</span><span class="o">;</span></span>
<span id="LC1521" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1522" class="line" lang="java"></span>
<span id="LC1523" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceACLR:</span></span>
<span id="LC1524" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">10</span><span class="o">;</span></span>
<span id="LC1525" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1526" class="line" lang="java"></span>
<span id="LC1527" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceBCLR:</span></span>
<span id="LC1528" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">11</span><span class="o">;</span></span>
<span id="LC1529" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1530" class="line" lang="java"></span>
<span id="LC1531" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceCCLR:</span></span>
<span id="LC1532" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">12</span><span class="o">;</span></span>
<span id="LC1533" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1534" class="line" lang="java"></span>
<span id="LC1535" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceDCLR:</span></span>
<span id="LC1536" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">13</span><span class="o">;</span></span>
<span id="LC1537" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1538" class="line" lang="java"></span>
<span id="LC1539" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceECLR:</span></span>
<span id="LC1540" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">14</span><span class="o">;</span></span>
<span id="LC1541" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1542" class="line" lang="java"></span>
<span id="LC1543" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceFCLR:</span></span>
<span id="LC1544" class="line" lang="java">            <span class="n">theNumComponents</span> <span class="o">=</span> <span class="mi">15</span><span class="o">;</span></span>
<span id="LC1545" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1546" class="line" lang="java"></span>
<span id="LC1547" class="line" lang="java">        <span class="k">default</span><span class="o">:</span></span>
<span id="LC1548" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">ProfileDataException</span> <span class="o">(</span><span class="s">"invalid ICC color space"</span><span class="o">);</span></span>
<span id="LC1549" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1550" class="line" lang="java"></span>
<span id="LC1551" class="line" lang="java">        <span class="k">return</span> <span class="n">theNumComponents</span><span class="o">;</span></span>
<span id="LC1552" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1553" class="line" lang="java"></span>
<span id="LC1554" class="line" lang="java"></span>
<span id="LC1555" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1556" class="line" lang="java"><span class="cm">     * Returns a float array of length 3 containing the X, Y, and Z</span></span>
<span id="LC1557" class="line" lang="java"><span class="cm">     * components of the mediaWhitePointTag in the ICC profile.</span></span>
<span id="LC1558" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1559" class="line" lang="java">    <span class="kt">float</span><span class="o">[]</span> <span class="nf">getMediaWhitePoint</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1560" class="line" lang="java">        <span class="k">return</span> <span class="nf">getXYZTag</span><span class="o">(</span><span class="n">icSigMediaWhitePointTag</span><span class="o">);</span></span>
<span id="LC1561" class="line" lang="java">                                           <span class="cm">/* get the media white point tag */</span></span>
<span id="LC1562" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1563" class="line" lang="java"></span>
<span id="LC1564" class="line" lang="java"></span>
<span id="LC1565" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1566" class="line" lang="java"><span class="cm">     * Returns a float array of length 3 containing the X, Y, and Z</span></span>
<span id="LC1567" class="line" lang="java"><span class="cm">     * components encoded in an XYZType tag.</span></span>
<span id="LC1568" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1569" class="line" lang="java">    <span class="kt">float</span><span class="o">[]</span> <span class="nf">getXYZTag</span><span class="o">(</span><span class="kt">int</span> <span class="n">theTagSignature</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1570" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">theData</span><span class="o">;</span></span>
<span id="LC1571" class="line" lang="java">    <span class="kt">float</span><span class="o">[]</span> <span class="n">theXYZNumber</span><span class="o">;</span></span>
<span id="LC1572" class="line" lang="java">    <span class="kt">int</span> <span class="n">i1</span><span class="o">,</span> <span class="n">i2</span><span class="o">,</span> <span class="n">theS15Fixed16</span><span class="o">;</span></span>
<span id="LC1573" class="line" lang="java"></span>
<span id="LC1574" class="line" lang="java">        <span class="n">theData</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">theTagSignature</span><span class="o">);</span> <span class="cm">/* get the tag data */</span></span>
<span id="LC1575" class="line" lang="java">                                            <span class="cm">/* getData will activate deferred</span></span>
<span id="LC1576" class="line" lang="java"><span class="cm">                                               profiles if necessary */</span></span>
<span id="LC1577" class="line" lang="java"></span>
<span id="LC1578" class="line" lang="java">        <span class="n">theXYZNumber</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">float</span> <span class="o">[</span><span class="mi">3</span><span class="o">];</span>        <span class="cm">/* array to return */</span></span>
<span id="LC1579" class="line" lang="java"></span>
<span id="LC1580" class="line" lang="java">        <span class="cm">/* convert s15Fixed16Number to float */</span></span>
<span id="LC1581" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="n">i1</span> <span class="o">=</span> <span class="mi">0</span><span class="o">,</span> <span class="n">i2</span> <span class="o">=</span> <span class="n">icXYZNumberX</span><span class="o">;</span> <span class="n">i1</span> <span class="o">&lt;</span> <span class="mi">3</span><span class="o">;</span> <span class="n">i1</span><span class="o">++,</span> <span class="n">i2</span> <span class="o">+=</span> <span class="mi">4</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1582" class="line" lang="java">            <span class="n">theS15Fixed16</span> <span class="o">=</span> <span class="n">intFromBigEndian</span><span class="o">(</span><span class="n">theData</span><span class="o">,</span> <span class="n">i2</span><span class="o">);</span></span>
<span id="LC1583" class="line" lang="java">            <span class="n">theXYZNumber</span> <span class="o">[</span><span class="n">i1</span><span class="o">]</span> <span class="o">=</span> <span class="o">((</span><span class="kt">float</span><span class="o">)</span> <span class="n">theS15Fixed16</span><span class="o">)</span> <span class="o">/</span> <span class="mf">65536.0f</span><span class="o">;</span></span>
<span id="LC1584" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1585" class="line" lang="java">        <span class="k">return</span> <span class="n">theXYZNumber</span><span class="o">;</span></span>
<span id="LC1586" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1587" class="line" lang="java"></span>
<span id="LC1588" class="line" lang="java"></span>
<span id="LC1589" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1590" class="line" lang="java"><span class="cm">     * Returns a gamma value representing a tone reproduction</span></span>
<span id="LC1591" class="line" lang="java"><span class="cm">     * curve (TRC).  If the profile represents the TRC as a table rather</span></span>
<span id="LC1592" class="line" lang="java"><span class="cm">     * than a single gamma value, then an exception is thrown.  In this</span></span>
<span id="LC1593" class="line" lang="java"><span class="cm">     * case the actual table can be obtained via getTRC().</span></span>
<span id="LC1594" class="line" lang="java"><span class="cm">     * theTagSignature should be one of icSigGrayTRCTag, icSigRedTRCTag,</span></span>
<span id="LC1595" class="line" lang="java"><span class="cm">     * icSigGreenTRCTag, or icSigBlueTRCTag.</span></span>
<span id="LC1596" class="line" lang="java"><span class="cm">     * @return the gamma value as a float.</span></span>
<span id="LC1597" class="line" lang="java"><span class="cm">     * @exception ProfileDataException if the profile does not specify</span></span>
<span id="LC1598" class="line" lang="java"><span class="cm">     *            the TRC as a single gamma value.</span></span>
<span id="LC1599" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1600" class="line" lang="java">    <span class="kt">float</span> <span class="nf">getGamma</span><span class="o">(</span><span class="kt">int</span> <span class="n">theTagSignature</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1601" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">theTRCData</span><span class="o">;</span></span>
<span id="LC1602" class="line" lang="java">    <span class="kt">float</span> <span class="n">theGamma</span><span class="o">;</span></span>
<span id="LC1603" class="line" lang="java">    <span class="kt">int</span> <span class="n">theU8Fixed8</span><span class="o">;</span></span>
<span id="LC1604" class="line" lang="java"></span>
<span id="LC1605" class="line" lang="java">        <span class="n">theTRCData</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">theTagSignature</span><span class="o">);</span> <span class="cm">/* get the TRC */</span></span>
<span id="LC1606" class="line" lang="java">                                               <span class="cm">/* getData will activate deferred</span></span>
<span id="LC1607" class="line" lang="java"><span class="cm">                                                  profiles if necessary */</span></span>
<span id="LC1608" class="line" lang="java"></span>
<span id="LC1609" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">intFromBigEndian</span> <span class="o">(</span><span class="n">theTRCData</span><span class="o">,</span> <span class="n">icCurveCount</span><span class="o">)</span> <span class="o">!=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1610" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">ProfileDataException</span> <span class="o">(</span><span class="s">"TRC is not a gamma"</span><span class="o">);</span></span>
<span id="LC1611" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1612" class="line" lang="java"></span>
<span id="LC1613" class="line" lang="java">        <span class="cm">/* convert u8Fixed8 to float */</span></span>
<span id="LC1614" class="line" lang="java">        <span class="n">theU8Fixed8</span> <span class="o">=</span> <span class="o">(</span><span class="n">shortFromBigEndian</span><span class="o">(</span><span class="n">theTRCData</span><span class="o">,</span> <span class="n">icCurveData</span><span class="o">))</span> <span class="o">&amp;</span> <span class="mh">0xffff</span><span class="o">;</span></span>
<span id="LC1615" class="line" lang="java"></span>
<span id="LC1616" class="line" lang="java">        <span class="n">theGamma</span> <span class="o">=</span> <span class="o">((</span><span class="kt">float</span><span class="o">)</span> <span class="n">theU8Fixed8</span><span class="o">)</span> <span class="o">/</span> <span class="mf">256.0f</span><span class="o">;</span></span>
<span id="LC1617" class="line" lang="java"></span>
<span id="LC1618" class="line" lang="java">        <span class="k">return</span> <span class="n">theGamma</span><span class="o">;</span></span>
<span id="LC1619" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1620" class="line" lang="java"></span>
<span id="LC1621" class="line" lang="java"></span>
<span id="LC1622" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1623" class="line" lang="java"><span class="cm">     * Returns the TRC as an array of shorts.  If the profile has</span></span>
<span id="LC1624" class="line" lang="java"><span class="cm">     * specified the TRC as linear (gamma = 1.0) or as a simple gamma</span></span>
<span id="LC1625" class="line" lang="java"><span class="cm">     * value, this method throws an exception, and the getGamma() method</span></span>
<span id="LC1626" class="line" lang="java"><span class="cm">     * should be used to get the gamma value.  Otherwise the short array</span></span>
<span id="LC1627" class="line" lang="java"><span class="cm">     * returned here represents a lookup table where the input Gray value</span></span>
<span id="LC1628" class="line" lang="java"><span class="cm">     * is conceptually in the range [0.0, 1.0].  Value 0.0 maps</span></span>
<span id="LC1629" class="line" lang="java"><span class="cm">     * to array index 0 and value 1.0 maps to array index length-1.</span></span>
<span id="LC1630" class="line" lang="java"><span class="cm">     * Interpolation may be used to generate output values for</span></span>
<span id="LC1631" class="line" lang="java"><span class="cm">     * input values which do not map exactly to an index in the</span></span>
<span id="LC1632" class="line" lang="java"><span class="cm">     * array.  Output values also map linearly to the range [0.0, 1.0].</span></span>
<span id="LC1633" class="line" lang="java"><span class="cm">     * Value 0.0 is represented by an array value of 0x0000 and</span></span>
<span id="LC1634" class="line" lang="java"><span class="cm">     * value 1.0 by 0xFFFF, i.e. the values are really unsigned</span></span>
<span id="LC1635" class="line" lang="java"><span class="cm">     * short values, although they are returned in a short array.</span></span>
<span id="LC1636" class="line" lang="java"><span class="cm">     * theTagSignature should be one of icSigGrayTRCTag, icSigRedTRCTag,</span></span>
<span id="LC1637" class="line" lang="java"><span class="cm">     * icSigGreenTRCTag, or icSigBlueTRCTag.</span></span>
<span id="LC1638" class="line" lang="java"><span class="cm">     * @return a short array representing the TRC.</span></span>
<span id="LC1639" class="line" lang="java"><span class="cm">     * @exception ProfileDataException if the profile does not specify</span></span>
<span id="LC1640" class="line" lang="java"><span class="cm">     *            the TRC as a table.</span></span>
<span id="LC1641" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1642" class="line" lang="java">    <span class="kt">short</span><span class="o">[]</span> <span class="nf">getTRC</span><span class="o">(</span><span class="kt">int</span> <span class="n">theTagSignature</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1643" class="line" lang="java">    <span class="kt">byte</span><span class="o">[]</span> <span class="n">theTRCData</span><span class="o">;</span></span>
<span id="LC1644" class="line" lang="java">    <span class="kt">short</span><span class="o">[]</span> <span class="n">theTRC</span><span class="o">;</span></span>
<span id="LC1645" class="line" lang="java">    <span class="kt">int</span> <span class="n">i1</span><span class="o">,</span> <span class="n">i2</span><span class="o">,</span> <span class="n">nElements</span><span class="o">,</span> <span class="n">theU8Fixed8</span><span class="o">;</span></span>
<span id="LC1646" class="line" lang="java"></span>
<span id="LC1647" class="line" lang="java">        <span class="n">theTRCData</span> <span class="o">=</span> <span class="n">getData</span><span class="o">(</span><span class="n">theTagSignature</span><span class="o">);</span> <span class="cm">/* get the TRC */</span></span>
<span id="LC1648" class="line" lang="java">                                               <span class="cm">/* getData will activate deferred</span></span>
<span id="LC1649" class="line" lang="java"><span class="cm">                                                  profiles if necessary */</span></span>
<span id="LC1650" class="line" lang="java"></span>
<span id="LC1651" class="line" lang="java">        <span class="n">nElements</span> <span class="o">=</span> <span class="n">intFromBigEndian</span><span class="o">(</span><span class="n">theTRCData</span><span class="o">,</span> <span class="n">icCurveCount</span><span class="o">);</span></span>
<span id="LC1652" class="line" lang="java"></span>
<span id="LC1653" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">nElements</span> <span class="o">==</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1654" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">ProfileDataException</span><span class="o">(</span><span class="s">"TRC is not a table"</span><span class="o">);</span></span>
<span id="LC1655" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1656" class="line" lang="java"></span>
<span id="LC1657" class="line" lang="java">        <span class="cm">/* make the short array */</span></span>
<span id="LC1658" class="line" lang="java">        <span class="n">theTRC</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">short</span> <span class="o">[</span><span class="n">nElements</span><span class="o">];</span></span>
<span id="LC1659" class="line" lang="java"></span>
<span id="LC1660" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="n">i1</span> <span class="o">=</span> <span class="mi">0</span><span class="o">,</span> <span class="n">i2</span> <span class="o">=</span> <span class="n">icCurveData</span><span class="o">;</span> <span class="n">i1</span> <span class="o">&lt;</span> <span class="n">nElements</span><span class="o">;</span> <span class="n">i1</span><span class="o">++,</span> <span class="n">i2</span> <span class="o">+=</span> <span class="mi">2</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1661" class="line" lang="java">            <span class="n">theTRC</span><span class="o">[</span><span class="n">i1</span><span class="o">]</span> <span class="o">=</span> <span class="n">shortFromBigEndian</span><span class="o">(</span><span class="n">theTRCData</span><span class="o">,</span> <span class="n">i2</span><span class="o">);</span></span>
<span id="LC1662" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1663" class="line" lang="java"></span>
<span id="LC1664" class="line" lang="java">        <span class="k">return</span> <span class="n">theTRC</span><span class="o">;</span></span>
<span id="LC1665" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1666" class="line" lang="java"></span>
<span id="LC1667" class="line" lang="java"></span>
<span id="LC1668" class="line" lang="java">    <span class="cm">/* convert an ICC color space signature into a Java color space type */</span></span>
<span id="LC1669" class="line" lang="java">    <span class="kd">static</span> <span class="kt">int</span> <span class="nf">iccCStoJCS</span><span class="o">(</span><span class="kt">int</span> <span class="n">theColorSpaceSig</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1670" class="line" lang="java">    <span class="kt">int</span> <span class="n">theColorSpace</span><span class="o">;</span></span>
<span id="LC1671" class="line" lang="java"></span>
<span id="LC1672" class="line" lang="java">        <span class="k">switch</span> <span class="o">(</span><span class="n">theColorSpaceSig</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1673" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigXYZData:</span></span>
<span id="LC1674" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_XYZ</span><span class="o">;</span></span>
<span id="LC1675" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1676" class="line" lang="java"></span>
<span id="LC1677" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigLabData:</span></span>
<span id="LC1678" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_Lab</span><span class="o">;</span></span>
<span id="LC1679" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1680" class="line" lang="java"></span>
<span id="LC1681" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigLuvData:</span></span>
<span id="LC1682" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_Luv</span><span class="o">;</span></span>
<span id="LC1683" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1684" class="line" lang="java"></span>
<span id="LC1685" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigYCbCrData:</span></span>
<span id="LC1686" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_YCbCr</span><span class="o">;</span></span>
<span id="LC1687" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1688" class="line" lang="java"></span>
<span id="LC1689" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigYxyData:</span></span>
<span id="LC1690" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_Yxy</span><span class="o">;</span></span>
<span id="LC1691" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1692" class="line" lang="java"></span>
<span id="LC1693" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigRgbData:</span></span>
<span id="LC1694" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_RGB</span><span class="o">;</span></span>
<span id="LC1695" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1696" class="line" lang="java"></span>
<span id="LC1697" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigGrayData:</span></span>
<span id="LC1698" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_GRAY</span><span class="o">;</span></span>
<span id="LC1699" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1700" class="line" lang="java"></span>
<span id="LC1701" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigHsvData:</span></span>
<span id="LC1702" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_HSV</span><span class="o">;</span></span>
<span id="LC1703" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1704" class="line" lang="java"></span>
<span id="LC1705" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigHlsData:</span></span>
<span id="LC1706" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_HLS</span><span class="o">;</span></span>
<span id="LC1707" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1708" class="line" lang="java"></span>
<span id="LC1709" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigCmykData:</span></span>
<span id="LC1710" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_CMYK</span><span class="o">;</span></span>
<span id="LC1711" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1712" class="line" lang="java"></span>
<span id="LC1713" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigCmyData:</span></span>
<span id="LC1714" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_CMY</span><span class="o">;</span></span>
<span id="LC1715" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1716" class="line" lang="java"></span>
<span id="LC1717" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace2CLR:</span></span>
<span id="LC1718" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_2CLR</span><span class="o">;</span></span>
<span id="LC1719" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1720" class="line" lang="java"></span>
<span id="LC1721" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace3CLR:</span></span>
<span id="LC1722" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_3CLR</span><span class="o">;</span></span>
<span id="LC1723" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1724" class="line" lang="java"></span>
<span id="LC1725" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace4CLR:</span></span>
<span id="LC1726" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_4CLR</span><span class="o">;</span></span>
<span id="LC1727" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1728" class="line" lang="java"></span>
<span id="LC1729" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace5CLR:</span></span>
<span id="LC1730" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_5CLR</span><span class="o">;</span></span>
<span id="LC1731" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1732" class="line" lang="java"></span>
<span id="LC1733" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace6CLR:</span></span>
<span id="LC1734" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_6CLR</span><span class="o">;</span></span>
<span id="LC1735" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1736" class="line" lang="java"></span>
<span id="LC1737" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace7CLR:</span></span>
<span id="LC1738" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_7CLR</span><span class="o">;</span></span>
<span id="LC1739" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1740" class="line" lang="java"></span>
<span id="LC1741" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace8CLR:</span></span>
<span id="LC1742" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_8CLR</span><span class="o">;</span></span>
<span id="LC1743" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1744" class="line" lang="java"></span>
<span id="LC1745" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpace9CLR:</span></span>
<span id="LC1746" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_9CLR</span><span class="o">;</span></span>
<span id="LC1747" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1748" class="line" lang="java"></span>
<span id="LC1749" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceACLR:</span></span>
<span id="LC1750" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_ACLR</span><span class="o">;</span></span>
<span id="LC1751" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1752" class="line" lang="java"></span>
<span id="LC1753" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceBCLR:</span></span>
<span id="LC1754" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_BCLR</span><span class="o">;</span></span>
<span id="LC1755" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1756" class="line" lang="java"></span>
<span id="LC1757" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceCCLR:</span></span>
<span id="LC1758" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_CCLR</span><span class="o">;</span></span>
<span id="LC1759" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1760" class="line" lang="java"></span>
<span id="LC1761" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceDCLR:</span></span>
<span id="LC1762" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_DCLR</span><span class="o">;</span></span>
<span id="LC1763" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1764" class="line" lang="java"></span>
<span id="LC1765" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceECLR:</span></span>
<span id="LC1766" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_ECLR</span><span class="o">;</span></span>
<span id="LC1767" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1768" class="line" lang="java"></span>
<span id="LC1769" class="line" lang="java">        <span class="k">case</span> <span class="nl">icSigSpaceFCLR:</span></span>
<span id="LC1770" class="line" lang="java">            <span class="n">theColorSpace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">TYPE_FCLR</span><span class="o">;</span></span>
<span id="LC1771" class="line" lang="java">            <span class="k">break</span><span class="o">;</span></span>
<span id="LC1772" class="line" lang="java"></span>
<span id="LC1773" class="line" lang="java">        <span class="k">default</span><span class="o">:</span></span>
<span id="LC1774" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span> <span class="o">(</span><span class="s">"Unknown color space"</span><span class="o">);</span></span>
<span id="LC1775" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1776" class="line" lang="java"></span>
<span id="LC1777" class="line" lang="java">        <span class="k">return</span> <span class="n">theColorSpace</span><span class="o">;</span></span>
<span id="LC1778" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1779" class="line" lang="java"></span>
<span id="LC1780" class="line" lang="java"></span>
<span id="LC1781" class="line" lang="java">    <span class="kd">static</span> <span class="kt">int</span> <span class="nf">intFromBigEndian</span><span class="o">(</span><span class="kt">byte</span><span class="o">[]</span> <span class="n">array</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1782" class="line" lang="java">        <span class="k">return</span> <span class="o">(((</span><span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">]</span>   <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">)</span> <span class="o">&lt;&lt;</span> <span class="mi">24</span><span class="o">)</span> <span class="o">|</span></span>
<span id="LC1783" class="line" lang="java">                <span class="o">((</span><span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">+</span><span class="mi">1</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">)</span> <span class="o">&lt;&lt;</span> <span class="mi">16</span><span class="o">)</span> <span class="o">|</span></span>
<span id="LC1784" class="line" lang="java">                <span class="o">((</span><span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">+</span><span class="mi">2</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">)</span> <span class="o">&lt;&lt;</span>  <span class="mi">8</span><span class="o">)</span> <span class="o">|</span></span>
<span id="LC1785" class="line" lang="java">                 <span class="o">(</span><span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">+</span><span class="mi">3</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">));</span></span>
<span id="LC1786" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1787" class="line" lang="java"></span>
<span id="LC1788" class="line" lang="java"></span>
<span id="LC1789" class="line" lang="java">    <span class="kd">static</span> <span class="kt">void</span> <span class="nf">intToBigEndian</span><span class="o">(</span><span class="kt">int</span> <span class="n">value</span><span class="o">,</span> <span class="kt">byte</span><span class="o">[]</span> <span class="n">array</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1790" class="line" lang="java">            <span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">]</span>   <span class="o">=</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span> <span class="o">(</span><span class="n">value</span> <span class="o">&gt;&gt;</span> <span class="mi">24</span><span class="o">);</span></span>
<span id="LC1791" class="line" lang="java">            <span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">+</span><span class="mi">1</span><span class="o">]</span> <span class="o">=</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span> <span class="o">(</span><span class="n">value</span> <span class="o">&gt;&gt;</span> <span class="mi">16</span><span class="o">);</span></span>
<span id="LC1792" class="line" lang="java">            <span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">+</span><span class="mi">2</span><span class="o">]</span> <span class="o">=</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span> <span class="o">(</span><span class="n">value</span> <span class="o">&gt;&gt;</span>  <span class="mi">8</span><span class="o">);</span></span>
<span id="LC1793" class="line" lang="java">            <span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">+</span><span class="mi">3</span><span class="o">]</span> <span class="o">=</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span> <span class="o">(</span><span class="n">value</span><span class="o">);</span></span>
<span id="LC1794" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1795" class="line" lang="java"></span>
<span id="LC1796" class="line" lang="java"></span>
<span id="LC1797" class="line" lang="java">    <span class="kd">static</span> <span class="kt">short</span> <span class="nf">shortFromBigEndian</span><span class="o">(</span><span class="kt">byte</span><span class="o">[]</span> <span class="n">array</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1798" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="kt">short</span><span class="o">)</span> <span class="o">(((</span><span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">]</span>   <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">)</span> <span class="o">&lt;&lt;</span> <span class="mi">8</span><span class="o">)</span> <span class="o">|</span></span>
<span id="LC1799" class="line" lang="java">                         <span class="o">(</span><span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">+</span><span class="mi">1</span><span class="o">]</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">));</span></span>
<span id="LC1800" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1801" class="line" lang="java"></span>
<span id="LC1802" class="line" lang="java"></span>
<span id="LC1803" class="line" lang="java">    <span class="kd">static</span> <span class="kt">void</span> <span class="nf">shortToBigEndian</span><span class="o">(</span><span class="kt">short</span> <span class="n">value</span><span class="o">,</span> <span class="kt">byte</span><span class="o">[]</span> <span class="n">array</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1804" class="line" lang="java">            <span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">]</span>   <span class="o">=</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span> <span class="o">(</span><span class="n">value</span> <span class="o">&gt;&gt;</span> <span class="mi">8</span><span class="o">);</span></span>
<span id="LC1805" class="line" lang="java">            <span class="n">array</span><span class="o">[</span><span class="n">index</span><span class="o">+</span><span class="mi">1</span><span class="o">]</span> <span class="o">=</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span> <span class="o">(</span><span class="n">value</span><span class="o">);</span></span>
<span id="LC1806" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1807" class="line" lang="java"></span>
<span id="LC1808" class="line" lang="java"></span>
<span id="LC1809" class="line" lang="java">    <span class="cm">/*</span></span>
<span id="LC1810" class="line" lang="java"><span class="cm">     * fileName may be an absolute or a relative file specification.</span></span>
<span id="LC1811" class="line" lang="java"><span class="cm">     * Relative file names are looked for in several places: first, relative</span></span>
<span id="LC1812" class="line" lang="java"><span class="cm">     * to any directories specified by the java.iccprofile.path property;</span></span>
<span id="LC1813" class="line" lang="java"><span class="cm">     * second, relative to any directories specified by the java.class.path</span></span>
<span id="LC1814" class="line" lang="java"><span class="cm">     * property; finally, in a directory used to store profiles always</span></span>
<span id="LC1815" class="line" lang="java"><span class="cm">     * available, such as a profile for sRGB.  Built-in profiles use .pf as</span></span>
<span id="LC1816" class="line" lang="java"><span class="cm">     * the file name extension for profiles, e.g. sRGB.pf.</span></span>
<span id="LC1817" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1818" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">File</span> <span class="nf">getProfileFile</span><span class="o">(</span><span class="nc">String</span> <span class="n">fileName</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1819" class="line" lang="java">        <span class="nc">String</span> <span class="n">path</span><span class="o">,</span> <span class="n">dir</span><span class="o">,</span> <span class="n">fullPath</span><span class="o">;</span></span>
<span id="LC1820" class="line" lang="java"></span>
<span id="LC1821" class="line" lang="java">        <span class="nc">File</span> <span class="n">f</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">File</span><span class="o">(</span><span class="n">fileName</span><span class="o">);</span> <span class="cm">/* try absolute file name */</span></span>
<span id="LC1822" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">f</span><span class="o">.</span><span class="na">isAbsolute</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1823" class="line" lang="java">            <span class="cm">/* Rest of code has little sense for an absolute pathname,</span></span>
<span id="LC1824" class="line" lang="java"><span class="cm">               so return here. */</span></span>
<span id="LC1825" class="line" lang="java">            <span class="k">return</span> <span class="n">f</span><span class="o">.</span><span class="na">isFile</span><span class="o">()</span> <span class="o">?</span> <span class="n">f</span> <span class="o">:</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1826" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1827" class="line" lang="java">        <span class="k">if</span> <span class="o">((!</span><span class="n">f</span><span class="o">.</span><span class="na">isFile</span><span class="o">())</span> <span class="o">&amp;&amp;</span></span>
<span id="LC1828" class="line" lang="java">                <span class="o">((</span><span class="n">path</span> <span class="o">=</span> <span class="nc">System</span><span class="o">.</span><span class="na">getProperty</span><span class="o">(</span><span class="s">"java.iccprofile.path"</span><span class="o">))</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)){</span></span>
<span id="LC1829" class="line" lang="java">                                    <span class="cm">/* try relative to java.iccprofile.path */</span></span>
<span id="LC1830" class="line" lang="java">                <span class="nc">StringTokenizer</span> <span class="n">st</span> <span class="o">=</span></span>
<span id="LC1831" class="line" lang="java">                    <span class="k">new</span> <span class="nf">StringTokenizer</span><span class="o">(</span><span class="n">path</span><span class="o">,</span> <span class="nc">File</span><span class="o">.</span><span class="na">pathSeparator</span><span class="o">);</span></span>
<span id="LC1832" class="line" lang="java">                <span class="k">while</span> <span class="o">(</span><span class="n">st</span><span class="o">.</span><span class="na">hasMoreTokens</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">f</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">||</span> <span class="o">(!</span><span class="n">f</span><span class="o">.</span><span class="na">isFile</span><span class="o">())))</span> <span class="o">{</span></span>
<span id="LC1833" class="line" lang="java">                    <span class="n">dir</span> <span class="o">=</span> <span class="n">st</span><span class="o">.</span><span class="na">nextToken</span><span class="o">();</span></span>
<span id="LC1834" class="line" lang="java">                        <span class="n">fullPath</span> <span class="o">=</span> <span class="n">dir</span> <span class="o">+</span> <span class="nc">File</span><span class="o">.</span><span class="na">separatorChar</span> <span class="o">+</span> <span class="n">fileName</span><span class="o">;</span></span>
<span id="LC1835" class="line" lang="java">                    <span class="n">f</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">File</span><span class="o">(</span><span class="n">fullPath</span><span class="o">);</span></span>
<span id="LC1836" class="line" lang="java">                    <span class="k">if</span> <span class="o">(!</span><span class="n">isChildOf</span><span class="o">(</span><span class="n">f</span><span class="o">,</span> <span class="n">dir</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1837" class="line" lang="java">                        <span class="n">f</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1838" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC1839" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1840" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1841" class="line" lang="java"></span>
<span id="LC1842" class="line" lang="java">        <span class="k">if</span> <span class="o">(((</span><span class="n">f</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">||</span> <span class="o">(!</span><span class="n">f</span><span class="o">.</span><span class="na">isFile</span><span class="o">()))</span> <span class="o">&amp;&amp;</span></span>
<span id="LC1843" class="line" lang="java">                <span class="o">((</span><span class="n">path</span> <span class="o">=</span> <span class="nc">System</span><span class="o">.</span><span class="na">getProperty</span><span class="o">(</span><span class="s">"java.class.path"</span><span class="o">))</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1844" class="line" lang="java">                                    <span class="cm">/* try relative to java.class.path */</span></span>
<span id="LC1845" class="line" lang="java">                <span class="nc">StringTokenizer</span> <span class="n">st</span> <span class="o">=</span></span>
<span id="LC1846" class="line" lang="java">                    <span class="k">new</span> <span class="nf">StringTokenizer</span><span class="o">(</span><span class="n">path</span><span class="o">,</span> <span class="nc">File</span><span class="o">.</span><span class="na">pathSeparator</span><span class="o">);</span></span>
<span id="LC1847" class="line" lang="java">                <span class="k">while</span> <span class="o">(</span><span class="n">st</span><span class="o">.</span><span class="na">hasMoreTokens</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">f</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">||</span> <span class="o">(!</span><span class="n">f</span><span class="o">.</span><span class="na">isFile</span><span class="o">())))</span> <span class="o">{</span></span>
<span id="LC1848" class="line" lang="java">                    <span class="n">dir</span> <span class="o">=</span> <span class="n">st</span><span class="o">.</span><span class="na">nextToken</span><span class="o">();</span></span>
<span id="LC1849" class="line" lang="java">                        <span class="n">fullPath</span> <span class="o">=</span> <span class="n">dir</span> <span class="o">+</span> <span class="nc">File</span><span class="o">.</span><span class="na">separatorChar</span> <span class="o">+</span> <span class="n">fileName</span><span class="o">;</span></span>
<span id="LC1850" class="line" lang="java">                    <span class="n">f</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">File</span><span class="o">(</span><span class="n">fullPath</span><span class="o">);</span></span>
<span id="LC1851" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1852" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1853" class="line" lang="java"></span>
<span id="LC1854" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">f</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">||</span> <span class="o">(!</span><span class="n">f</span><span class="o">.</span><span class="na">isFile</span><span class="o">()))</span> <span class="o">{</span></span>
<span id="LC1855" class="line" lang="java">            <span class="cm">/* try the directory of built-in profiles */</span></span>
<span id="LC1856" class="line" lang="java">            <span class="n">f</span> <span class="o">=</span> <span class="n">getStandardProfileFile</span><span class="o">(</span><span class="n">fileName</span><span class="o">);</span></span>
<span id="LC1857" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1858" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">f</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">f</span><span class="o">.</span><span class="na">isFile</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1859" class="line" lang="java">            <span class="k">return</span> <span class="n">f</span><span class="o">;</span></span>
<span id="LC1860" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1861" class="line" lang="java">        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1862" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1863" class="line" lang="java"></span>
<span id="LC1864" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1865" class="line" lang="java"><span class="cm">     * Returns a file object corresponding to a built-in profile</span></span>
<span id="LC1866" class="line" lang="java"><span class="cm">     * specified by fileName.</span></span>
<span id="LC1867" class="line" lang="java"><span class="cm">     * If there is no built-in profile with such name, then the method</span></span>
<span id="LC1868" class="line" lang="java"><span class="cm">     * returns null.</span></span>
<span id="LC1869" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1870" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">File</span> <span class="nf">getStandardProfileFile</span><span class="o">(</span><span class="nc">String</span> <span class="n">fileName</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1871" class="line" lang="java">        <span class="nc">String</span> <span class="n">dir</span> <span class="o">=</span> <span class="nc">System</span><span class="o">.</span><span class="na">getProperty</span><span class="o">(</span><span class="s">"java.home"</span><span class="o">)</span> <span class="o">+</span></span>
<span id="LC1872" class="line" lang="java">            <span class="nc">File</span><span class="o">.</span><span class="na">separatorChar</span> <span class="o">+</span> <span class="s">"lib"</span> <span class="o">+</span> <span class="nc">File</span><span class="o">.</span><span class="na">separatorChar</span> <span class="o">+</span> <span class="s">"cmm"</span><span class="o">;</span></span>
<span id="LC1873" class="line" lang="java">        <span class="nc">String</span> <span class="n">fullPath</span> <span class="o">=</span> <span class="n">dir</span> <span class="o">+</span> <span class="nc">File</span><span class="o">.</span><span class="na">separatorChar</span> <span class="o">+</span> <span class="n">fileName</span><span class="o">;</span></span>
<span id="LC1874" class="line" lang="java">        <span class="nc">File</span> <span class="n">f</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">File</span><span class="o">(</span><span class="n">fullPath</span><span class="o">);</span></span>
<span id="LC1875" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="n">f</span><span class="o">.</span><span class="na">isFile</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="n">isChildOf</span><span class="o">(</span><span class="n">f</span><span class="o">,</span> <span class="n">dir</span><span class="o">))</span> <span class="o">?</span> <span class="n">f</span> <span class="o">:</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1876" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1877" class="line" lang="java"></span>
<span id="LC1878" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1879" class="line" lang="java"><span class="cm">     * Checks whether given file resides inside give directory.</span></span>
<span id="LC1880" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1881" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">isChildOf</span><span class="o">(</span><span class="nc">File</span> <span class="n">f</span><span class="o">,</span> <span class="nc">String</span> <span class="n">dirName</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1882" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC1883" class="line" lang="java">            <span class="nc">File</span> <span class="n">dir</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">File</span><span class="o">(</span><span class="n">dirName</span><span class="o">);</span></span>
<span id="LC1884" class="line" lang="java">            <span class="nc">String</span> <span class="n">canonicalDirName</span> <span class="o">=</span> <span class="n">dir</span><span class="o">.</span><span class="na">getCanonicalPath</span><span class="o">();</span></span>
<span id="LC1885" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">canonicalDirName</span><span class="o">.</span><span class="na">endsWith</span><span class="o">(</span><span class="nc">File</span><span class="o">.</span><span class="na">separator</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1886" class="line" lang="java">                <span class="n">canonicalDirName</span> <span class="o">+=</span> <span class="nc">File</span><span class="o">.</span><span class="na">separator</span><span class="o">;</span></span>
<span id="LC1887" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1888" class="line" lang="java">            <span class="nc">String</span> <span class="n">canonicalFileName</span> <span class="o">=</span> <span class="n">f</span><span class="o">.</span><span class="na">getCanonicalPath</span><span class="o">();</span></span>
<span id="LC1889" class="line" lang="java">            <span class="k">return</span> <span class="n">canonicalFileName</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="n">canonicalDirName</span><span class="o">);</span></span>
<span id="LC1890" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">IOException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1891" class="line" lang="java">            <span class="cm">/* we do not expect the IOException here, because invocation</span></span>
<span id="LC1892" class="line" lang="java"><span class="cm">             * of this function is always preceeded by isFile() call.</span></span>
<span id="LC1893" class="line" lang="java"><span class="cm">             */</span></span>
<span id="LC1894" class="line" lang="java">            <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1895" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1896" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1897" class="line" lang="java"></span>
<span id="LC1898" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1899" class="line" lang="java"><span class="cm">     * Checks whether built-in profile specified by fileName exists.</span></span>
<span id="LC1900" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1901" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">standardProfileExists</span><span class="o">(</span><span class="kd">final</span> <span class="nc">String</span> <span class="n">fileName</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1902" class="line" lang="java">        <span class="k">return</span> <span class="nc">AccessController</span><span class="o">.</span><span class="na">doPrivileged</span><span class="o">(</span><span class="k">new</span> <span class="nc">PrivilegedAction</span><span class="o">&lt;</span><span class="nc">Boolean</span><span class="o">&gt;()</span> <span class="o">{</span></span>
<span id="LC1903" class="line" lang="java">                <span class="kd">public</span> <span class="nc">Boolean</span> <span class="nf">run</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1904" class="line" lang="java">                    <span class="k">return</span> <span class="nf">getStandardProfileFile</span><span class="o">(</span><span class="n">fileName</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1905" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1906" class="line" lang="java">            <span class="o">});</span></span>
<span id="LC1907" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1908" class="line" lang="java"></span>
<span id="LC1909" class="line" lang="java"></span>
<span id="LC1910" class="line" lang="java">    <span class="cm">/*</span></span>
<span id="LC1911" class="line" lang="java"><span class="cm">     * Serialization support.</span></span>
<span id="LC1912" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1913" class="line" lang="java"><span class="cm">     * Directly deserialized profiles are useless since they are not</span></span>
<span id="LC1914" class="line" lang="java"><span class="cm">     * registered with CMM.  We don't allow constructor to be called</span></span>
<span id="LC1915" class="line" lang="java"><span class="cm">     * directly and instead have clients to call one of getInstance</span></span>
<span id="LC1916" class="line" lang="java"><span class="cm">     * factory methods that will register the profile with CMM.  For</span></span>
<span id="LC1917" class="line" lang="java"><span class="cm">     * deserialization we implement readResolve method that will</span></span>
<span id="LC1918" class="line" lang="java"><span class="cm">     * resolve the bogus deserialized profile object with one obtained</span></span>
<span id="LC1919" class="line" lang="java"><span class="cm">     * with getInstance as well.</span></span>
<span id="LC1920" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1921" class="line" lang="java"><span class="cm">     * There're two primary factory methods for construction of ICC</span></span>
<span id="LC1922" class="line" lang="java"><span class="cm">     * profiles: getInstance(int cspace) and getInstance(byte[] data).</span></span>
<span id="LC1923" class="line" lang="java"><span class="cm">     * This implementation of ICC_Profile uses the former to return a</span></span>
<span id="LC1924" class="line" lang="java"><span class="cm">     * cached singleton profile object, other implementations will</span></span>
<span id="LC1925" class="line" lang="java"><span class="cm">     * likely use this technique too.  To preserve the singleton</span></span>
<span id="LC1926" class="line" lang="java"><span class="cm">     * pattern across serialization we serialize cached singleton</span></span>
<span id="LC1927" class="line" lang="java"><span class="cm">     * profiles in such a way that deserializing VM could call</span></span>
<span id="LC1928" class="line" lang="java"><span class="cm">     * getInstance(int cspace) method that will resolve deserialized</span></span>
<span id="LC1929" class="line" lang="java"><span class="cm">     * object into the corresponding singleton as well.</span></span>
<span id="LC1930" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1931" class="line" lang="java"><span class="cm">     * Since the singletons are private to ICC_Profile the readResolve</span></span>
<span id="LC1932" class="line" lang="java"><span class="cm">     * method have to be `protected' instead of `private' so that</span></span>
<span id="LC1933" class="line" lang="java"><span class="cm">     * singletons that are instances of subclasses of ICC_Profile</span></span>
<span id="LC1934" class="line" lang="java"><span class="cm">     * could be correctly deserialized.</span></span>
<span id="LC1935" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1936" class="line" lang="java"></span>
<span id="LC1937" class="line" lang="java"></span>
<span id="LC1938" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1939" class="line" lang="java"><span class="cm">     * Version of the format of additional serialized data in the</span></span>
<span id="LC1940" class="line" lang="java"><span class="cm">     * stream.  Version&amp;nbsp;&lt;code&gt;1&lt;/code&gt; corresponds to Java&amp;nbsp;2</span></span>
<span id="LC1941" class="line" lang="java"><span class="cm">     * Platform,&amp;nbsp;v1.3.</span></span>
<span id="LC1942" class="line" lang="java"><span class="cm">     * @since 1.3</span></span>
<span id="LC1943" class="line" lang="java"><span class="cm">     * @serial</span></span>
<span id="LC1944" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1945" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span> <span class="n">iccProfileSerializedDataVersion</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC1946" class="line" lang="java"></span>
<span id="LC1947" class="line" lang="java"></span>
<span id="LC1948" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1949" class="line" lang="java"><span class="cm">     * Writes default serializable fields to the stream.  Writes a</span></span>
<span id="LC1950" class="line" lang="java"><span class="cm">     * string and an array of bytes to the stream as additional data.</span></span>
<span id="LC1951" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1952" class="line" lang="java"><span class="cm">     * @param s stream used for serialization.</span></span>
<span id="LC1953" class="line" lang="java"><span class="cm">     * @throws IOException</span></span>
<span id="LC1954" class="line" lang="java"><span class="cm">     *     thrown by &lt;code&gt;ObjectInputStream&lt;/code&gt;.</span></span>
<span id="LC1955" class="line" lang="java"><span class="cm">     * @serialData</span></span>
<span id="LC1956" class="line" lang="java"><span class="cm">     *     The &lt;code&gt;String&lt;/code&gt; is the name of one of</span></span>
<span id="LC1957" class="line" lang="java"><span class="cm">     *     &lt;code&gt;CS_&lt;var&gt;*&lt;/var&gt;&lt;/code&gt; constants defined in the</span></span>
<span id="LC1958" class="line" lang="java"><span class="cm">     *     {@link ColorSpace} class if the profile object is a profile</span></span>
<span id="LC1959" class="line" lang="java"><span class="cm">     *     for a predefined color space (for example</span></span>
<span id="LC1960" class="line" lang="java"><span class="cm">     *     &lt;code&gt;"CS_sRGB"&lt;/code&gt;).  The string is &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC1961" class="line" lang="java"><span class="cm">     *     otherwise.</span></span>
<span id="LC1962" class="line" lang="java"><span class="cm">     *     &lt;p&gt;</span></span>
<span id="LC1963" class="line" lang="java"><span class="cm">     *     The &lt;code&gt;byte[]&lt;/code&gt; array is the profile data for the</span></span>
<span id="LC1964" class="line" lang="java"><span class="cm">     *     profile.  For predefined color spaces &lt;code&gt;null&lt;/code&gt; is</span></span>
<span id="LC1965" class="line" lang="java"><span class="cm">     *     written instead of the profile data.  If in the future</span></span>
<span id="LC1966" class="line" lang="java"><span class="cm">     *     versions of Java API new predefined color spaces will be</span></span>
<span id="LC1967" class="line" lang="java"><span class="cm">     *     added, future versions of this class may choose to write</span></span>
<span id="LC1968" class="line" lang="java"><span class="cm">     *     for new predefined color spaces not only the color space</span></span>
<span id="LC1969" class="line" lang="java"><span class="cm">     *     name, but the profile data as well so that older versions</span></span>
<span id="LC1970" class="line" lang="java"><span class="cm">     *     could still deserialize the object.</span></span>
<span id="LC1971" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1972" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">writeObject</span><span class="o">(</span><span class="nc">ObjectOutputStream</span> <span class="n">s</span><span class="o">)</span></span>
<span id="LC1973" class="line" lang="java">      <span class="kd">throws</span> <span class="nc">IOException</span></span>
<span id="LC1974" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1975" class="line" lang="java">        <span class="n">s</span><span class="o">.</span><span class="na">defaultWriteObject</span><span class="o">();</span></span>
<span id="LC1976" class="line" lang="java"></span>
<span id="LC1977" class="line" lang="java">        <span class="nc">String</span> <span class="n">csName</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1978" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="k">this</span> <span class="o">==</span> <span class="n">sRGBprofile</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1979" class="line" lang="java">            <span class="n">csName</span> <span class="o">=</span> <span class="s">"CS_sRGB"</span><span class="o">;</span></span>
<span id="LC1980" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="k">this</span> <span class="o">==</span> <span class="nc">XYZprofile</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1981" class="line" lang="java">            <span class="n">csName</span> <span class="o">=</span> <span class="s">"CS_CIEXYZ"</span><span class="o">;</span></span>
<span id="LC1982" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="k">this</span> <span class="o">==</span> <span class="nc">PYCCprofile</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1983" class="line" lang="java">            <span class="n">csName</span> <span class="o">=</span> <span class="s">"CS_PYCC"</span><span class="o">;</span></span>
<span id="LC1984" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="k">this</span> <span class="o">==</span> <span class="nc">GRAYprofile</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1985" class="line" lang="java">            <span class="n">csName</span> <span class="o">=</span> <span class="s">"CS_GRAY"</span><span class="o">;</span></span>
<span id="LC1986" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="k">this</span> <span class="o">==</span> <span class="n">LINEAR_RGBprofile</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1987" class="line" lang="java">            <span class="n">csName</span> <span class="o">=</span> <span class="s">"CS_LINEAR_RGB"</span><span class="o">;</span></span>
<span id="LC1988" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1989" class="line" lang="java"></span>
<span id="LC1990" class="line" lang="java">        <span class="c1">// Future versions may choose to write profile data for new</span></span>
<span id="LC1991" class="line" lang="java">        <span class="c1">// predefined color spaces as well, if any will be introduced,</span></span>
<span id="LC1992" class="line" lang="java">        <span class="c1">// so that old versions that don't recognize the new CS name</span></span>
<span id="LC1993" class="line" lang="java">        <span class="c1">// may fall back to constructing profile from the data.</span></span>
<span id="LC1994" class="line" lang="java">        <span class="kt">byte</span><span class="o">[]</span> <span class="n">data</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1995" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">csName</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1996" class="line" lang="java">            <span class="c1">// getData will activate deferred profile if necessary</span></span>
<span id="LC1997" class="line" lang="java">            <span class="n">data</span> <span class="o">=</span> <span class="n">getData</span><span class="o">();</span></span>
<span id="LC1998" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1999" class="line" lang="java"></span>
<span id="LC2000" class="line" lang="java">        <span class="n">s</span><span class="o">.</span><span class="na">writeObject</span><span class="o">(</span><span class="n">csName</span><span class="o">);</span></span>
<span id="LC2001" class="line" lang="java">        <span class="n">s</span><span class="o">.</span><span class="na">writeObject</span><span class="o">(</span><span class="n">data</span><span class="o">);</span></span>
<span id="LC2002" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2003" class="line" lang="java"></span>
<span id="LC2004" class="line" lang="java">    <span class="c1">// Temporary storage used by readObject to store resolved profile</span></span>
<span id="LC2005" class="line" lang="java">    <span class="c1">// (obtained with getInstance) for readResolve to return.</span></span>
<span id="LC2006" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="n">ICC_Profile</span> <span class="n">resolvedDeserializedProfile</span><span class="o">;</span></span>
<span id="LC2007" class="line" lang="java"></span>
<span id="LC2008" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2009" class="line" lang="java"><span class="cm">     * Reads default serializable fields from the stream.  Reads from</span></span>
<span id="LC2010" class="line" lang="java"><span class="cm">     * the stream a string and an array of bytes as additional data.</span></span>
<span id="LC2011" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC2012" class="line" lang="java"><span class="cm">     * @param s stream used for deserialization.</span></span>
<span id="LC2013" class="line" lang="java"><span class="cm">     * @throws IOException</span></span>
<span id="LC2014" class="line" lang="java"><span class="cm">     *     thrown by &lt;code&gt;ObjectInputStream&lt;/code&gt;.</span></span>
<span id="LC2015" class="line" lang="java"><span class="cm">     * @throws ClassNotFoundException</span></span>
<span id="LC2016" class="line" lang="java"><span class="cm">     *     thrown by &lt;code&gt;ObjectInputStream&lt;/code&gt;.</span></span>
<span id="LC2017" class="line" lang="java"><span class="cm">     * @serialData</span></span>
<span id="LC2018" class="line" lang="java"><span class="cm">     *     The &lt;code&gt;String&lt;/code&gt; is the name of one of</span></span>
<span id="LC2019" class="line" lang="java"><span class="cm">     *     &lt;code&gt;CS_&lt;var&gt;*&lt;/var&gt;&lt;/code&gt; constants defined in the</span></span>
<span id="LC2020" class="line" lang="java"><span class="cm">     *     {@link ColorSpace} class if the profile object is a profile</span></span>
<span id="LC2021" class="line" lang="java"><span class="cm">     *     for a predefined color space (for example</span></span>
<span id="LC2022" class="line" lang="java"><span class="cm">     *     &lt;code&gt;"CS_sRGB"&lt;/code&gt;).  The string is &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC2023" class="line" lang="java"><span class="cm">     *     otherwise.</span></span>
<span id="LC2024" class="line" lang="java"><span class="cm">     *     &lt;p&gt;</span></span>
<span id="LC2025" class="line" lang="java"><span class="cm">     *     The &lt;code&gt;byte[]&lt;/code&gt; array is the profile data for the</span></span>
<span id="LC2026" class="line" lang="java"><span class="cm">     *     profile.  It will usually be &lt;code&gt;null&lt;/code&gt; for the</span></span>
<span id="LC2027" class="line" lang="java"><span class="cm">     *     predefined profiles.</span></span>
<span id="LC2028" class="line" lang="java"><span class="cm">     *     &lt;p&gt;</span></span>
<span id="LC2029" class="line" lang="java"><span class="cm">     *     If the string is recognized as a constant name for</span></span>
<span id="LC2030" class="line" lang="java"><span class="cm">     *     predefined color space the object will be resolved into</span></span>
<span id="LC2031" class="line" lang="java"><span class="cm">     *     profile obtained with</span></span>
<span id="LC2032" class="line" lang="java"><span class="cm">     *     &lt;code&gt;getInstance(int&amp;nbsp;cspace)&lt;/code&gt; and the profile</span></span>
<span id="LC2033" class="line" lang="java"><span class="cm">     *     data are ignored.  Otherwise the object will be resolved</span></span>
<span id="LC2034" class="line" lang="java"><span class="cm">     *     into profile obtained with</span></span>
<span id="LC2035" class="line" lang="java"><span class="cm">     *     &lt;code&gt;getInstance(byte[]&amp;nbsp;data)&lt;/code&gt;.</span></span>
<span id="LC2036" class="line" lang="java"><span class="cm">     * @see #readResolve()</span></span>
<span id="LC2037" class="line" lang="java"><span class="cm">     * @see #getInstance(int)</span></span>
<span id="LC2038" class="line" lang="java"><span class="cm">     * @see #getInstance(byte[])</span></span>
<span id="LC2039" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2040" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">readObject</span><span class="o">(</span><span class="nc">ObjectInputStream</span> <span class="n">s</span><span class="o">)</span></span>
<span id="LC2041" class="line" lang="java">      <span class="kd">throws</span> <span class="nc">IOException</span><span class="o">,</span> <span class="nc">ClassNotFoundException</span></span>
<span id="LC2042" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC2043" class="line" lang="java">        <span class="n">s</span><span class="o">.</span><span class="na">defaultReadObject</span><span class="o">();</span></span>
<span id="LC2044" class="line" lang="java"></span>
<span id="LC2045" class="line" lang="java">        <span class="nc">String</span> <span class="n">csName</span> <span class="o">=</span> <span class="o">(</span><span class="nc">String</span><span class="o">)</span><span class="n">s</span><span class="o">.</span><span class="na">readObject</span><span class="o">();</span></span>
<span id="LC2046" class="line" lang="java">        <span class="kt">byte</span><span class="o">[]</span> <span class="n">data</span> <span class="o">=</span> <span class="o">(</span><span class="kt">byte</span><span class="o">[])</span><span class="n">s</span><span class="o">.</span><span class="na">readObject</span><span class="o">();</span></span>
<span id="LC2047" class="line" lang="java"></span>
<span id="LC2048" class="line" lang="java">        <span class="kt">int</span> <span class="n">cspace</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>         <span class="c1">// ColorSpace.CS_* constant if known</span></span>
<span id="LC2049" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">isKnownPredefinedCS</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2050" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">csName</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2051" class="line" lang="java">            <span class="n">isKnownPredefinedCS</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC2052" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">csName</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">"CS_sRGB"</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2053" class="line" lang="java">                <span class="n">cspace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_sRGB</span><span class="o">;</span></span>
<span id="LC2054" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">csName</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">"CS_CIEXYZ"</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2055" class="line" lang="java">                <span class="n">cspace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_CIEXYZ</span><span class="o">;</span></span>
<span id="LC2056" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">csName</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">"CS_PYCC"</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2057" class="line" lang="java">                <span class="n">cspace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_PYCC</span><span class="o">;</span></span>
<span id="LC2058" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">csName</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">"CS_GRAY"</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2059" class="line" lang="java">                <span class="n">cspace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_GRAY</span><span class="o">;</span></span>
<span id="LC2060" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">csName</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">"CS_LINEAR_RGB"</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2061" class="line" lang="java">                <span class="n">cspace</span> <span class="o">=</span> <span class="nc">ColorSpace</span><span class="o">.</span><span class="na">CS_LINEAR_RGB</span><span class="o">;</span></span>
<span id="LC2062" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2063" class="line" lang="java">                <span class="n">isKnownPredefinedCS</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2064" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2065" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2066" class="line" lang="java"></span>
<span id="LC2067" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">isKnownPredefinedCS</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2068" class="line" lang="java">            <span class="n">resolvedDeserializedProfile</span> <span class="o">=</span> <span class="n">getInstance</span><span class="o">(</span><span class="n">cspace</span><span class="o">);</span></span>
<span id="LC2069" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2070" class="line" lang="java">            <span class="n">resolvedDeserializedProfile</span> <span class="o">=</span> <span class="n">getInstance</span><span class="o">(</span><span class="n">data</span><span class="o">);</span></span>
<span id="LC2071" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2072" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2073" class="line" lang="java"></span>
<span id="LC2074" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2075" class="line" lang="java"><span class="cm">     * Resolves instances being deserialized into instances registered</span></span>
<span id="LC2076" class="line" lang="java"><span class="cm">     * with CMM.</span></span>
<span id="LC2077" class="line" lang="java"><span class="cm">     * @return ICC_Profile object for profile registered with CMM.</span></span>
<span id="LC2078" class="line" lang="java"><span class="cm">     * @throws ObjectStreamException</span></span>
<span id="LC2079" class="line" lang="java"><span class="cm">     *     never thrown, but mandated by the serialization spec.</span></span>
<span id="LC2080" class="line" lang="java"><span class="cm">     * @since 1.3</span></span>
<span id="LC2081" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2082" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">Object</span> <span class="nf">readResolve</span><span class="o">()</span> <span class="kd">throws</span> <span class="nc">ObjectStreamException</span> <span class="o">{</span></span>
<span id="LC2083" class="line" lang="java">        <span class="k">return</span> <span class="n">resolvedDeserializedProfile</span><span class="o">;</span></span>
<span id="LC2084" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2085" class="line" lang="java"><span class="o">}</span></span>
