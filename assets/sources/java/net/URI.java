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
<a class="file-line-num diff-line-num" data-line-number="2086" href="#L2086" id="L2086">
2086
</a>
<a class="file-line-num diff-line-num" data-line-number="2087" href="#L2087" id="L2087">
2087
</a>
<a class="file-line-num diff-line-num" data-line-number="2088" href="#L2088" id="L2088">
2088
</a>
<a class="file-line-num diff-line-num" data-line-number="2089" href="#L2089" id="L2089">
2089
</a>
<a class="file-line-num diff-line-num" data-line-number="2090" href="#L2090" id="L2090">
2090
</a>
<a class="file-line-num diff-line-num" data-line-number="2091" href="#L2091" id="L2091">
2091
</a>
<a class="file-line-num diff-line-num" data-line-number="2092" href="#L2092" id="L2092">
2092
</a>
<a class="file-line-num diff-line-num" data-line-number="2093" href="#L2093" id="L2093">
2093
</a>
<a class="file-line-num diff-line-num" data-line-number="2094" href="#L2094" id="L2094">
2094
</a>
<a class="file-line-num diff-line-num" data-line-number="2095" href="#L2095" id="L2095">
2095
</a>
<a class="file-line-num diff-line-num" data-line-number="2096" href="#L2096" id="L2096">
2096
</a>
<a class="file-line-num diff-line-num" data-line-number="2097" href="#L2097" id="L2097">
2097
</a>
<a class="file-line-num diff-line-num" data-line-number="2098" href="#L2098" id="L2098">
2098
</a>
<a class="file-line-num diff-line-num" data-line-number="2099" href="#L2099" id="L2099">
2099
</a>
<a class="file-line-num diff-line-num" data-line-number="2100" href="#L2100" id="L2100">
2100
</a>
<a class="file-line-num diff-line-num" data-line-number="2101" href="#L2101" id="L2101">
2101
</a>
<a class="file-line-num diff-line-num" data-line-number="2102" href="#L2102" id="L2102">
2102
</a>
<a class="file-line-num diff-line-num" data-line-number="2103" href="#L2103" id="L2103">
2103
</a>
<a class="file-line-num diff-line-num" data-line-number="2104" href="#L2104" id="L2104">
2104
</a>
<a class="file-line-num diff-line-num" data-line-number="2105" href="#L2105" id="L2105">
2105
</a>
<a class="file-line-num diff-line-num" data-line-number="2106" href="#L2106" id="L2106">
2106
</a>
<a class="file-line-num diff-line-num" data-line-number="2107" href="#L2107" id="L2107">
2107
</a>
<a class="file-line-num diff-line-num" data-line-number="2108" href="#L2108" id="L2108">
2108
</a>
<a class="file-line-num diff-line-num" data-line-number="2109" href="#L2109" id="L2109">
2109
</a>
<a class="file-line-num diff-line-num" data-line-number="2110" href="#L2110" id="L2110">
2110
</a>
<a class="file-line-num diff-line-num" data-line-number="2111" href="#L2111" id="L2111">
2111
</a>
<a class="file-line-num diff-line-num" data-line-number="2112" href="#L2112" id="L2112">
2112
</a>
<a class="file-line-num diff-line-num" data-line-number="2113" href="#L2113" id="L2113">
2113
</a>
<a class="file-line-num diff-line-num" data-line-number="2114" href="#L2114" id="L2114">
2114
</a>
<a class="file-line-num diff-line-num" data-line-number="2115" href="#L2115" id="L2115">
2115
</a>
<a class="file-line-num diff-line-num" data-line-number="2116" href="#L2116" id="L2116">
2116
</a>
<a class="file-line-num diff-line-num" data-line-number="2117" href="#L2117" id="L2117">
2117
</a>
<a class="file-line-num diff-line-num" data-line-number="2118" href="#L2118" id="L2118">
2118
</a>
<a class="file-line-num diff-line-num" data-line-number="2119" href="#L2119" id="L2119">
2119
</a>
<a class="file-line-num diff-line-num" data-line-number="2120" href="#L2120" id="L2120">
2120
</a>
<a class="file-line-num diff-line-num" data-line-number="2121" href="#L2121" id="L2121">
2121
</a>
<a class="file-line-num diff-line-num" data-line-number="2122" href="#L2122" id="L2122">
2122
</a>
<a class="file-line-num diff-line-num" data-line-number="2123" href="#L2123" id="L2123">
2123
</a>
<a class="file-line-num diff-line-num" data-line-number="2124" href="#L2124" id="L2124">
2124
</a>
<a class="file-line-num diff-line-num" data-line-number="2125" href="#L2125" id="L2125">
2125
</a>
<a class="file-line-num diff-line-num" data-line-number="2126" href="#L2126" id="L2126">
2126
</a>
<a class="file-line-num diff-line-num" data-line-number="2127" href="#L2127" id="L2127">
2127
</a>
<a class="file-line-num diff-line-num" data-line-number="2128" href="#L2128" id="L2128">
2128
</a>
<a class="file-line-num diff-line-num" data-line-number="2129" href="#L2129" id="L2129">
2129
</a>
<a class="file-line-num diff-line-num" data-line-number="2130" href="#L2130" id="L2130">
2130
</a>
<a class="file-line-num diff-line-num" data-line-number="2131" href="#L2131" id="L2131">
2131
</a>
<a class="file-line-num diff-line-num" data-line-number="2132" href="#L2132" id="L2132">
2132
</a>
<a class="file-line-num diff-line-num" data-line-number="2133" href="#L2133" id="L2133">
2133
</a>
<a class="file-line-num diff-line-num" data-line-number="2134" href="#L2134" id="L2134">
2134
</a>
<a class="file-line-num diff-line-num" data-line-number="2135" href="#L2135" id="L2135">
2135
</a>
<a class="file-line-num diff-line-num" data-line-number="2136" href="#L2136" id="L2136">
2136
</a>
<a class="file-line-num diff-line-num" data-line-number="2137" href="#L2137" id="L2137">
2137
</a>
<a class="file-line-num diff-line-num" data-line-number="2138" href="#L2138" id="L2138">
2138
</a>
<a class="file-line-num diff-line-num" data-line-number="2139" href="#L2139" id="L2139">
2139
</a>
<a class="file-line-num diff-line-num" data-line-number="2140" href="#L2140" id="L2140">
2140
</a>
<a class="file-line-num diff-line-num" data-line-number="2141" href="#L2141" id="L2141">
2141
</a>
<a class="file-line-num diff-line-num" data-line-number="2142" href="#L2142" id="L2142">
2142
</a>
<a class="file-line-num diff-line-num" data-line-number="2143" href="#L2143" id="L2143">
2143
</a>
<a class="file-line-num diff-line-num" data-line-number="2144" href="#L2144" id="L2144">
2144
</a>
<a class="file-line-num diff-line-num" data-line-number="2145" href="#L2145" id="L2145">
2145
</a>
<a class="file-line-num diff-line-num" data-line-number="2146" href="#L2146" id="L2146">
2146
</a>
<a class="file-line-num diff-line-num" data-line-number="2147" href="#L2147" id="L2147">
2147
</a>
<a class="file-line-num diff-line-num" data-line-number="2148" href="#L2148" id="L2148">
2148
</a>
<a class="file-line-num diff-line-num" data-line-number="2149" href="#L2149" id="L2149">
2149
</a>
<a class="file-line-num diff-line-num" data-line-number="2150" href="#L2150" id="L2150">
2150
</a>
<a class="file-line-num diff-line-num" data-line-number="2151" href="#L2151" id="L2151">
2151
</a>
<a class="file-line-num diff-line-num" data-line-number="2152" href="#L2152" id="L2152">
2152
</a>
<a class="file-line-num diff-line-num" data-line-number="2153" href="#L2153" id="L2153">
2153
</a>
<a class="file-line-num diff-line-num" data-line-number="2154" href="#L2154" id="L2154">
2154
</a>
<a class="file-line-num diff-line-num" data-line-number="2155" href="#L2155" id="L2155">
2155
</a>
<a class="file-line-num diff-line-num" data-line-number="2156" href="#L2156" id="L2156">
2156
</a>
<a class="file-line-num diff-line-num" data-line-number="2157" href="#L2157" id="L2157">
2157
</a>
<a class="file-line-num diff-line-num" data-line-number="2158" href="#L2158" id="L2158">
2158
</a>
<a class="file-line-num diff-line-num" data-line-number="2159" href="#L2159" id="L2159">
2159
</a>
<a class="file-line-num diff-line-num" data-line-number="2160" href="#L2160" id="L2160">
2160
</a>
<a class="file-line-num diff-line-num" data-line-number="2161" href="#L2161" id="L2161">
2161
</a>
<a class="file-line-num diff-line-num" data-line-number="2162" href="#L2162" id="L2162">
2162
</a>
<a class="file-line-num diff-line-num" data-line-number="2163" href="#L2163" id="L2163">
2163
</a>
<a class="file-line-num diff-line-num" data-line-number="2164" href="#L2164" id="L2164">
2164
</a>
<a class="file-line-num diff-line-num" data-line-number="2165" href="#L2165" id="L2165">
2165
</a>
<a class="file-line-num diff-line-num" data-line-number="2166" href="#L2166" id="L2166">
2166
</a>
<a class="file-line-num diff-line-num" data-line-number="2167" href="#L2167" id="L2167">
2167
</a>
<a class="file-line-num diff-line-num" data-line-number="2168" href="#L2168" id="L2168">
2168
</a>
<a class="file-line-num diff-line-num" data-line-number="2169" href="#L2169" id="L2169">
2169
</a>
<a class="file-line-num diff-line-num" data-line-number="2170" href="#L2170" id="L2170">
2170
</a>
<a class="file-line-num diff-line-num" data-line-number="2171" href="#L2171" id="L2171">
2171
</a>
<a class="file-line-num diff-line-num" data-line-number="2172" href="#L2172" id="L2172">
2172
</a>
<a class="file-line-num diff-line-num" data-line-number="2173" href="#L2173" id="L2173">
2173
</a>
<a class="file-line-num diff-line-num" data-line-number="2174" href="#L2174" id="L2174">
2174
</a>
<a class="file-line-num diff-line-num" data-line-number="2175" href="#L2175" id="L2175">
2175
</a>
<a class="file-line-num diff-line-num" data-line-number="2176" href="#L2176" id="L2176">
2176
</a>
<a class="file-line-num diff-line-num" data-line-number="2177" href="#L2177" id="L2177">
2177
</a>
<a class="file-line-num diff-line-num" data-line-number="2178" href="#L2178" id="L2178">
2178
</a>
<a class="file-line-num diff-line-num" data-line-number="2179" href="#L2179" id="L2179">
2179
</a>
<a class="file-line-num diff-line-num" data-line-number="2180" href="#L2180" id="L2180">
2180
</a>
<a class="file-line-num diff-line-num" data-line-number="2181" href="#L2181" id="L2181">
2181
</a>
<a class="file-line-num diff-line-num" data-line-number="2182" href="#L2182" id="L2182">
2182
</a>
<a class="file-line-num diff-line-num" data-line-number="2183" href="#L2183" id="L2183">
2183
</a>
<a class="file-line-num diff-line-num" data-line-number="2184" href="#L2184" id="L2184">
2184
</a>
<a class="file-line-num diff-line-num" data-line-number="2185" href="#L2185" id="L2185">
2185
</a>
<a class="file-line-num diff-line-num" data-line-number="2186" href="#L2186" id="L2186">
2186
</a>
<a class="file-line-num diff-line-num" data-line-number="2187" href="#L2187" id="L2187">
2187
</a>
<a class="file-line-num diff-line-num" data-line-number="2188" href="#L2188" id="L2188">
2188
</a>
<a class="file-line-num diff-line-num" data-line-number="2189" href="#L2189" id="L2189">
2189
</a>
<a class="file-line-num diff-line-num" data-line-number="2190" href="#L2190" id="L2190">
2190
</a>
<a class="file-line-num diff-line-num" data-line-number="2191" href="#L2191" id="L2191">
2191
</a>
<a class="file-line-num diff-line-num" data-line-number="2192" href="#L2192" id="L2192">
2192
</a>
<a class="file-line-num diff-line-num" data-line-number="2193" href="#L2193" id="L2193">
2193
</a>
<a class="file-line-num diff-line-num" data-line-number="2194" href="#L2194" id="L2194">
2194
</a>
<a class="file-line-num diff-line-num" data-line-number="2195" href="#L2195" id="L2195">
2195
</a>
<a class="file-line-num diff-line-num" data-line-number="2196" href="#L2196" id="L2196">
2196
</a>
<a class="file-line-num diff-line-num" data-line-number="2197" href="#L2197" id="L2197">
2197
</a>
<a class="file-line-num diff-line-num" data-line-number="2198" href="#L2198" id="L2198">
2198
</a>
<a class="file-line-num diff-line-num" data-line-number="2199" href="#L2199" id="L2199">
2199
</a>
<a class="file-line-num diff-line-num" data-line-number="2200" href="#L2200" id="L2200">
2200
</a>
<a class="file-line-num diff-line-num" data-line-number="2201" href="#L2201" id="L2201">
2201
</a>
<a class="file-line-num diff-line-num" data-line-number="2202" href="#L2202" id="L2202">
2202
</a>
<a class="file-line-num diff-line-num" data-line-number="2203" href="#L2203" id="L2203">
2203
</a>
<a class="file-line-num diff-line-num" data-line-number="2204" href="#L2204" id="L2204">
2204
</a>
<a class="file-line-num diff-line-num" data-line-number="2205" href="#L2205" id="L2205">
2205
</a>
<a class="file-line-num diff-line-num" data-line-number="2206" href="#L2206" id="L2206">
2206
</a>
<a class="file-line-num diff-line-num" data-line-number="2207" href="#L2207" id="L2207">
2207
</a>
<a class="file-line-num diff-line-num" data-line-number="2208" href="#L2208" id="L2208">
2208
</a>
<a class="file-line-num diff-line-num" data-line-number="2209" href="#L2209" id="L2209">
2209
</a>
<a class="file-line-num diff-line-num" data-line-number="2210" href="#L2210" id="L2210">
2210
</a>
<a class="file-line-num diff-line-num" data-line-number="2211" href="#L2211" id="L2211">
2211
</a>
<a class="file-line-num diff-line-num" data-line-number="2212" href="#L2212" id="L2212">
2212
</a>
<a class="file-line-num diff-line-num" data-line-number="2213" href="#L2213" id="L2213">
2213
</a>
<a class="file-line-num diff-line-num" data-line-number="2214" href="#L2214" id="L2214">
2214
</a>
<a class="file-line-num diff-line-num" data-line-number="2215" href="#L2215" id="L2215">
2215
</a>
<a class="file-line-num diff-line-num" data-line-number="2216" href="#L2216" id="L2216">
2216
</a>
<a class="file-line-num diff-line-num" data-line-number="2217" href="#L2217" id="L2217">
2217
</a>
<a class="file-line-num diff-line-num" data-line-number="2218" href="#L2218" id="L2218">
2218
</a>
<a class="file-line-num diff-line-num" data-line-number="2219" href="#L2219" id="L2219">
2219
</a>
<a class="file-line-num diff-line-num" data-line-number="2220" href="#L2220" id="L2220">
2220
</a>
<a class="file-line-num diff-line-num" data-line-number="2221" href="#L2221" id="L2221">
2221
</a>
<a class="file-line-num diff-line-num" data-line-number="2222" href="#L2222" id="L2222">
2222
</a>
<a class="file-line-num diff-line-num" data-line-number="2223" href="#L2223" id="L2223">
2223
</a>
<a class="file-line-num diff-line-num" data-line-number="2224" href="#L2224" id="L2224">
2224
</a>
<a class="file-line-num diff-line-num" data-line-number="2225" href="#L2225" id="L2225">
2225
</a>
<a class="file-line-num diff-line-num" data-line-number="2226" href="#L2226" id="L2226">
2226
</a>
<a class="file-line-num diff-line-num" data-line-number="2227" href="#L2227" id="L2227">
2227
</a>
<a class="file-line-num diff-line-num" data-line-number="2228" href="#L2228" id="L2228">
2228
</a>
<a class="file-line-num diff-line-num" data-line-number="2229" href="#L2229" id="L2229">
2229
</a>
<a class="file-line-num diff-line-num" data-line-number="2230" href="#L2230" id="L2230">
2230
</a>
<a class="file-line-num diff-line-num" data-line-number="2231" href="#L2231" id="L2231">
2231
</a>
<a class="file-line-num diff-line-num" data-line-number="2232" href="#L2232" id="L2232">
2232
</a>
<a class="file-line-num diff-line-num" data-line-number="2233" href="#L2233" id="L2233">
2233
</a>
<a class="file-line-num diff-line-num" data-line-number="2234" href="#L2234" id="L2234">
2234
</a>
<a class="file-line-num diff-line-num" data-line-number="2235" href="#L2235" id="L2235">
2235
</a>
<a class="file-line-num diff-line-num" data-line-number="2236" href="#L2236" id="L2236">
2236
</a>
<a class="file-line-num diff-line-num" data-line-number="2237" href="#L2237" id="L2237">
2237
</a>
<a class="file-line-num diff-line-num" data-line-number="2238" href="#L2238" id="L2238">
2238
</a>
<a class="file-line-num diff-line-num" data-line-number="2239" href="#L2239" id="L2239">
2239
</a>
<a class="file-line-num diff-line-num" data-line-number="2240" href="#L2240" id="L2240">
2240
</a>
<a class="file-line-num diff-line-num" data-line-number="2241" href="#L2241" id="L2241">
2241
</a>
<a class="file-line-num diff-line-num" data-line-number="2242" href="#L2242" id="L2242">
2242
</a>
<a class="file-line-num diff-line-num" data-line-number="2243" href="#L2243" id="L2243">
2243
</a>
<a class="file-line-num diff-line-num" data-line-number="2244" href="#L2244" id="L2244">
2244
</a>
<a class="file-line-num diff-line-num" data-line-number="2245" href="#L2245" id="L2245">
2245
</a>
<a class="file-line-num diff-line-num" data-line-number="2246" href="#L2246" id="L2246">
2246
</a>
<a class="file-line-num diff-line-num" data-line-number="2247" href="#L2247" id="L2247">
2247
</a>
<a class="file-line-num diff-line-num" data-line-number="2248" href="#L2248" id="L2248">
2248
</a>
<a class="file-line-num diff-line-num" data-line-number="2249" href="#L2249" id="L2249">
2249
</a>
<a class="file-line-num diff-line-num" data-line-number="2250" href="#L2250" id="L2250">
2250
</a>
<a class="file-line-num diff-line-num" data-line-number="2251" href="#L2251" id="L2251">
2251
</a>
<a class="file-line-num diff-line-num" data-line-number="2252" href="#L2252" id="L2252">
2252
</a>
<a class="file-line-num diff-line-num" data-line-number="2253" href="#L2253" id="L2253">
2253
</a>
<a class="file-line-num diff-line-num" data-line-number="2254" href="#L2254" id="L2254">
2254
</a>
<a class="file-line-num diff-line-num" data-line-number="2255" href="#L2255" id="L2255">
2255
</a>
<a class="file-line-num diff-line-num" data-line-number="2256" href="#L2256" id="L2256">
2256
</a>
<a class="file-line-num diff-line-num" data-line-number="2257" href="#L2257" id="L2257">
2257
</a>
<a class="file-line-num diff-line-num" data-line-number="2258" href="#L2258" id="L2258">
2258
</a>
<a class="file-line-num diff-line-num" data-line-number="2259" href="#L2259" id="L2259">
2259
</a>
<a class="file-line-num diff-line-num" data-line-number="2260" href="#L2260" id="L2260">
2260
</a>
<a class="file-line-num diff-line-num" data-line-number="2261" href="#L2261" id="L2261">
2261
</a>
<a class="file-line-num diff-line-num" data-line-number="2262" href="#L2262" id="L2262">
2262
</a>
<a class="file-line-num diff-line-num" data-line-number="2263" href="#L2263" id="L2263">
2263
</a>
<a class="file-line-num diff-line-num" data-line-number="2264" href="#L2264" id="L2264">
2264
</a>
<a class="file-line-num diff-line-num" data-line-number="2265" href="#L2265" id="L2265">
2265
</a>
<a class="file-line-num diff-line-num" data-line-number="2266" href="#L2266" id="L2266">
2266
</a>
<a class="file-line-num diff-line-num" data-line-number="2267" href="#L2267" id="L2267">
2267
</a>
<a class="file-line-num diff-line-num" data-line-number="2268" href="#L2268" id="L2268">
2268
</a>
<a class="file-line-num diff-line-num" data-line-number="2269" href="#L2269" id="L2269">
2269
</a>
<a class="file-line-num diff-line-num" data-line-number="2270" href="#L2270" id="L2270">
2270
</a>
<a class="file-line-num diff-line-num" data-line-number="2271" href="#L2271" id="L2271">
2271
</a>
<a class="file-line-num diff-line-num" data-line-number="2272" href="#L2272" id="L2272">
2272
</a>
<a class="file-line-num diff-line-num" data-line-number="2273" href="#L2273" id="L2273">
2273
</a>
<a class="file-line-num diff-line-num" data-line-number="2274" href="#L2274" id="L2274">
2274
</a>
<a class="file-line-num diff-line-num" data-line-number="2275" href="#L2275" id="L2275">
2275
</a>
<a class="file-line-num diff-line-num" data-line-number="2276" href="#L2276" id="L2276">
2276
</a>
<a class="file-line-num diff-line-num" data-line-number="2277" href="#L2277" id="L2277">
2277
</a>
<a class="file-line-num diff-line-num" data-line-number="2278" href="#L2278" id="L2278">
2278
</a>
<a class="file-line-num diff-line-num" data-line-number="2279" href="#L2279" id="L2279">
2279
</a>
<a class="file-line-num diff-line-num" data-line-number="2280" href="#L2280" id="L2280">
2280
</a>
<a class="file-line-num diff-line-num" data-line-number="2281" href="#L2281" id="L2281">
2281
</a>
<a class="file-line-num diff-line-num" data-line-number="2282" href="#L2282" id="L2282">
2282
</a>
<a class="file-line-num diff-line-num" data-line-number="2283" href="#L2283" id="L2283">
2283
</a>
<a class="file-line-num diff-line-num" data-line-number="2284" href="#L2284" id="L2284">
2284
</a>
<a class="file-line-num diff-line-num" data-line-number="2285" href="#L2285" id="L2285">
2285
</a>
<a class="file-line-num diff-line-num" data-line-number="2286" href="#L2286" id="L2286">
2286
</a>
<a class="file-line-num diff-line-num" data-line-number="2287" href="#L2287" id="L2287">
2287
</a>
<a class="file-line-num diff-line-num" data-line-number="2288" href="#L2288" id="L2288">
2288
</a>
<a class="file-line-num diff-line-num" data-line-number="2289" href="#L2289" id="L2289">
2289
</a>
<a class="file-line-num diff-line-num" data-line-number="2290" href="#L2290" id="L2290">
2290
</a>
<a class="file-line-num diff-line-num" data-line-number="2291" href="#L2291" id="L2291">
2291
</a>
<a class="file-line-num diff-line-num" data-line-number="2292" href="#L2292" id="L2292">
2292
</a>
<a class="file-line-num diff-line-num" data-line-number="2293" href="#L2293" id="L2293">
2293
</a>
<a class="file-line-num diff-line-num" data-line-number="2294" href="#L2294" id="L2294">
2294
</a>
<a class="file-line-num diff-line-num" data-line-number="2295" href="#L2295" id="L2295">
2295
</a>
<a class="file-line-num diff-line-num" data-line-number="2296" href="#L2296" id="L2296">
2296
</a>
<a class="file-line-num diff-line-num" data-line-number="2297" href="#L2297" id="L2297">
2297
</a>
<a class="file-line-num diff-line-num" data-line-number="2298" href="#L2298" id="L2298">
2298
</a>
<a class="file-line-num diff-line-num" data-line-number="2299" href="#L2299" id="L2299">
2299
</a>
<a class="file-line-num diff-line-num" data-line-number="2300" href="#L2300" id="L2300">
2300
</a>
<a class="file-line-num diff-line-num" data-line-number="2301" href="#L2301" id="L2301">
2301
</a>
<a class="file-line-num diff-line-num" data-line-number="2302" href="#L2302" id="L2302">
2302
</a>
<a class="file-line-num diff-line-num" data-line-number="2303" href="#L2303" id="L2303">
2303
</a>
<a class="file-line-num diff-line-num" data-line-number="2304" href="#L2304" id="L2304">
2304
</a>
<a class="file-line-num diff-line-num" data-line-number="2305" href="#L2305" id="L2305">
2305
</a>
<a class="file-line-num diff-line-num" data-line-number="2306" href="#L2306" id="L2306">
2306
</a>
<a class="file-line-num diff-line-num" data-line-number="2307" href="#L2307" id="L2307">
2307
</a>
<a class="file-line-num diff-line-num" data-line-number="2308" href="#L2308" id="L2308">
2308
</a>
<a class="file-line-num diff-line-num" data-line-number="2309" href="#L2309" id="L2309">
2309
</a>
<a class="file-line-num diff-line-num" data-line-number="2310" href="#L2310" id="L2310">
2310
</a>
<a class="file-line-num diff-line-num" data-line-number="2311" href="#L2311" id="L2311">
2311
</a>
<a class="file-line-num diff-line-num" data-line-number="2312" href="#L2312" id="L2312">
2312
</a>
<a class="file-line-num diff-line-num" data-line-number="2313" href="#L2313" id="L2313">
2313
</a>
<a class="file-line-num diff-line-num" data-line-number="2314" href="#L2314" id="L2314">
2314
</a>
<a class="file-line-num diff-line-num" data-line-number="2315" href="#L2315" id="L2315">
2315
</a>
<a class="file-line-num diff-line-num" data-line-number="2316" href="#L2316" id="L2316">
2316
</a>
<a class="file-line-num diff-line-num" data-line-number="2317" href="#L2317" id="L2317">
2317
</a>
<a class="file-line-num diff-line-num" data-line-number="2318" href="#L2318" id="L2318">
2318
</a>
<a class="file-line-num diff-line-num" data-line-number="2319" href="#L2319" id="L2319">
2319
</a>
<a class="file-line-num diff-line-num" data-line-number="2320" href="#L2320" id="L2320">
2320
</a>
<a class="file-line-num diff-line-num" data-line-number="2321" href="#L2321" id="L2321">
2321
</a>
<a class="file-line-num diff-line-num" data-line-number="2322" href="#L2322" id="L2322">
2322
</a>
<a class="file-line-num diff-line-num" data-line-number="2323" href="#L2323" id="L2323">
2323
</a>
<a class="file-line-num diff-line-num" data-line-number="2324" href="#L2324" id="L2324">
2324
</a>
<a class="file-line-num diff-line-num" data-line-number="2325" href="#L2325" id="L2325">
2325
</a>
<a class="file-line-num diff-line-num" data-line-number="2326" href="#L2326" id="L2326">
2326
</a>
<a class="file-line-num diff-line-num" data-line-number="2327" href="#L2327" id="L2327">
2327
</a>
<a class="file-line-num diff-line-num" data-line-number="2328" href="#L2328" id="L2328">
2328
</a>
<a class="file-line-num diff-line-num" data-line-number="2329" href="#L2329" id="L2329">
2329
</a>
<a class="file-line-num diff-line-num" data-line-number="2330" href="#L2330" id="L2330">
2330
</a>
<a class="file-line-num diff-line-num" data-line-number="2331" href="#L2331" id="L2331">
2331
</a>
<a class="file-line-num diff-line-num" data-line-number="2332" href="#L2332" id="L2332">
2332
</a>
<a class="file-line-num diff-line-num" data-line-number="2333" href="#L2333" id="L2333">
2333
</a>
<a class="file-line-num diff-line-num" data-line-number="2334" href="#L2334" id="L2334">
2334
</a>
<a class="file-line-num diff-line-num" data-line-number="2335" href="#L2335" id="L2335">
2335
</a>
<a class="file-line-num diff-line-num" data-line-number="2336" href="#L2336" id="L2336">
2336
</a>
<a class="file-line-num diff-line-num" data-line-number="2337" href="#L2337" id="L2337">
2337
</a>
<a class="file-line-num diff-line-num" data-line-number="2338" href="#L2338" id="L2338">
2338
</a>
<a class="file-line-num diff-line-num" data-line-number="2339" href="#L2339" id="L2339">
2339
</a>
<a class="file-line-num diff-line-num" data-line-number="2340" href="#L2340" id="L2340">
2340
</a>
<a class="file-line-num diff-line-num" data-line-number="2341" href="#L2341" id="L2341">
2341
</a>
<a class="file-line-num diff-line-num" data-line-number="2342" href="#L2342" id="L2342">
2342
</a>
<a class="file-line-num diff-line-num" data-line-number="2343" href="#L2343" id="L2343">
2343
</a>
<a class="file-line-num diff-line-num" data-line-number="2344" href="#L2344" id="L2344">
2344
</a>
<a class="file-line-num diff-line-num" data-line-number="2345" href="#L2345" id="L2345">
2345
</a>
<a class="file-line-num diff-line-num" data-line-number="2346" href="#L2346" id="L2346">
2346
</a>
<a class="file-line-num diff-line-num" data-line-number="2347" href="#L2347" id="L2347">
2347
</a>
<a class="file-line-num diff-line-num" data-line-number="2348" href="#L2348" id="L2348">
2348
</a>
<a class="file-line-num diff-line-num" data-line-number="2349" href="#L2349" id="L2349">
2349
</a>
<a class="file-line-num diff-line-num" data-line-number="2350" href="#L2350" id="L2350">
2350
</a>
<a class="file-line-num diff-line-num" data-line-number="2351" href="#L2351" id="L2351">
2351
</a>
<a class="file-line-num diff-line-num" data-line-number="2352" href="#L2352" id="L2352">
2352
</a>
<a class="file-line-num diff-line-num" data-line-number="2353" href="#L2353" id="L2353">
2353
</a>
<a class="file-line-num diff-line-num" data-line-number="2354" href="#L2354" id="L2354">
2354
</a>
<a class="file-line-num diff-line-num" data-line-number="2355" href="#L2355" id="L2355">
2355
</a>
<a class="file-line-num diff-line-num" data-line-number="2356" href="#L2356" id="L2356">
2356
</a>
<a class="file-line-num diff-line-num" data-line-number="2357" href="#L2357" id="L2357">
2357
</a>
<a class="file-line-num diff-line-num" data-line-number="2358" href="#L2358" id="L2358">
2358
</a>
<a class="file-line-num diff-line-num" data-line-number="2359" href="#L2359" id="L2359">
2359
</a>
<a class="file-line-num diff-line-num" data-line-number="2360" href="#L2360" id="L2360">
2360
</a>
<a class="file-line-num diff-line-num" data-line-number="2361" href="#L2361" id="L2361">
2361
</a>
<a class="file-line-num diff-line-num" data-line-number="2362" href="#L2362" id="L2362">
2362
</a>
<a class="file-line-num diff-line-num" data-line-number="2363" href="#L2363" id="L2363">
2363
</a>
<a class="file-line-num diff-line-num" data-line-number="2364" href="#L2364" id="L2364">
2364
</a>
<a class="file-line-num diff-line-num" data-line-number="2365" href="#L2365" id="L2365">
2365
</a>
<a class="file-line-num diff-line-num" data-line-number="2366" href="#L2366" id="L2366">
2366
</a>
<a class="file-line-num diff-line-num" data-line-number="2367" href="#L2367" id="L2367">
2367
</a>
<a class="file-line-num diff-line-num" data-line-number="2368" href="#L2368" id="L2368">
2368
</a>
<a class="file-line-num diff-line-num" data-line-number="2369" href="#L2369" id="L2369">
2369
</a>
<a class="file-line-num diff-line-num" data-line-number="2370" href="#L2370" id="L2370">
2370
</a>
<a class="file-line-num diff-line-num" data-line-number="2371" href="#L2371" id="L2371">
2371
</a>
<a class="file-line-num diff-line-num" data-line-number="2372" href="#L2372" id="L2372">
2372
</a>
<a class="file-line-num diff-line-num" data-line-number="2373" href="#L2373" id="L2373">
2373
</a>
<a class="file-line-num diff-line-num" data-line-number="2374" href="#L2374" id="L2374">
2374
</a>
<a class="file-line-num diff-line-num" data-line-number="2375" href="#L2375" id="L2375">
2375
</a>
<a class="file-line-num diff-line-num" data-line-number="2376" href="#L2376" id="L2376">
2376
</a>
<a class="file-line-num diff-line-num" data-line-number="2377" href="#L2377" id="L2377">
2377
</a>
<a class="file-line-num diff-line-num" data-line-number="2378" href="#L2378" id="L2378">
2378
</a>
<a class="file-line-num diff-line-num" data-line-number="2379" href="#L2379" id="L2379">
2379
</a>
<a class="file-line-num diff-line-num" data-line-number="2380" href="#L2380" id="L2380">
2380
</a>
<a class="file-line-num diff-line-num" data-line-number="2381" href="#L2381" id="L2381">
2381
</a>
<a class="file-line-num diff-line-num" data-line-number="2382" href="#L2382" id="L2382">
2382
</a>
<a class="file-line-num diff-line-num" data-line-number="2383" href="#L2383" id="L2383">
2383
</a>
<a class="file-line-num diff-line-num" data-line-number="2384" href="#L2384" id="L2384">
2384
</a>
<a class="file-line-num diff-line-num" data-line-number="2385" href="#L2385" id="L2385">
2385
</a>
<a class="file-line-num diff-line-num" data-line-number="2386" href="#L2386" id="L2386">
2386
</a>
<a class="file-line-num diff-line-num" data-line-number="2387" href="#L2387" id="L2387">
2387
</a>
<a class="file-line-num diff-line-num" data-line-number="2388" href="#L2388" id="L2388">
2388
</a>
<a class="file-line-num diff-line-num" data-line-number="2389" href="#L2389" id="L2389">
2389
</a>
<a class="file-line-num diff-line-num" data-line-number="2390" href="#L2390" id="L2390">
2390
</a>
<a class="file-line-num diff-line-num" data-line-number="2391" href="#L2391" id="L2391">
2391
</a>
<a class="file-line-num diff-line-num" data-line-number="2392" href="#L2392" id="L2392">
2392
</a>
<a class="file-line-num diff-line-num" data-line-number="2393" href="#L2393" id="L2393">
2393
</a>
<a class="file-line-num diff-line-num" data-line-number="2394" href="#L2394" id="L2394">
2394
</a>
<a class="file-line-num diff-line-num" data-line-number="2395" href="#L2395" id="L2395">
2395
</a>
<a class="file-line-num diff-line-num" data-line-number="2396" href="#L2396" id="L2396">
2396
</a>
<a class="file-line-num diff-line-num" data-line-number="2397" href="#L2397" id="L2397">
2397
</a>
<a class="file-line-num diff-line-num" data-line-number="2398" href="#L2398" id="L2398">
2398
</a>
<a class="file-line-num diff-line-num" data-line-number="2399" href="#L2399" id="L2399">
2399
</a>
<a class="file-line-num diff-line-num" data-line-number="2400" href="#L2400" id="L2400">
2400
</a>
<a class="file-line-num diff-line-num" data-line-number="2401" href="#L2401" id="L2401">
2401
</a>
<a class="file-line-num diff-line-num" data-line-number="2402" href="#L2402" id="L2402">
2402
</a>
<a class="file-line-num diff-line-num" data-line-number="2403" href="#L2403" id="L2403">
2403
</a>
<a class="file-line-num diff-line-num" data-line-number="2404" href="#L2404" id="L2404">
2404
</a>
<a class="file-line-num diff-line-num" data-line-number="2405" href="#L2405" id="L2405">
2405
</a>
<a class="file-line-num diff-line-num" data-line-number="2406" href="#L2406" id="L2406">
2406
</a>
<a class="file-line-num diff-line-num" data-line-number="2407" href="#L2407" id="L2407">
2407
</a>
<a class="file-line-num diff-line-num" data-line-number="2408" href="#L2408" id="L2408">
2408
</a>
<a class="file-line-num diff-line-num" data-line-number="2409" href="#L2409" id="L2409">
2409
</a>
<a class="file-line-num diff-line-num" data-line-number="2410" href="#L2410" id="L2410">
2410
</a>
<a class="file-line-num diff-line-num" data-line-number="2411" href="#L2411" id="L2411">
2411
</a>
<a class="file-line-num diff-line-num" data-line-number="2412" href="#L2412" id="L2412">
2412
</a>
<a class="file-line-num diff-line-num" data-line-number="2413" href="#L2413" id="L2413">
2413
</a>
<a class="file-line-num diff-line-num" data-line-number="2414" href="#L2414" id="L2414">
2414
</a>
<a class="file-line-num diff-line-num" data-line-number="2415" href="#L2415" id="L2415">
2415
</a>
<a class="file-line-num diff-line-num" data-line-number="2416" href="#L2416" id="L2416">
2416
</a>
<a class="file-line-num diff-line-num" data-line-number="2417" href="#L2417" id="L2417">
2417
</a>
<a class="file-line-num diff-line-num" data-line-number="2418" href="#L2418" id="L2418">
2418
</a>
<a class="file-line-num diff-line-num" data-line-number="2419" href="#L2419" id="L2419">
2419
</a>
<a class="file-line-num diff-line-num" data-line-number="2420" href="#L2420" id="L2420">
2420
</a>
<a class="file-line-num diff-line-num" data-line-number="2421" href="#L2421" id="L2421">
2421
</a>
<a class="file-line-num diff-line-num" data-line-number="2422" href="#L2422" id="L2422">
2422
</a>
<a class="file-line-num diff-line-num" data-line-number="2423" href="#L2423" id="L2423">
2423
</a>
<a class="file-line-num diff-line-num" data-line-number="2424" href="#L2424" id="L2424">
2424
</a>
<a class="file-line-num diff-line-num" data-line-number="2425" href="#L2425" id="L2425">
2425
</a>
<a class="file-line-num diff-line-num" data-line-number="2426" href="#L2426" id="L2426">
2426
</a>
<a class="file-line-num diff-line-num" data-line-number="2427" href="#L2427" id="L2427">
2427
</a>
<a class="file-line-num diff-line-num" data-line-number="2428" href="#L2428" id="L2428">
2428
</a>
<a class="file-line-num diff-line-num" data-line-number="2429" href="#L2429" id="L2429">
2429
</a>
<a class="file-line-num diff-line-num" data-line-number="2430" href="#L2430" id="L2430">
2430
</a>
<a class="file-line-num diff-line-num" data-line-number="2431" href="#L2431" id="L2431">
2431
</a>
<a class="file-line-num diff-line-num" data-line-number="2432" href="#L2432" id="L2432">
2432
</a>
<a class="file-line-num diff-line-num" data-line-number="2433" href="#L2433" id="L2433">
2433
</a>
<a class="file-line-num diff-line-num" data-line-number="2434" href="#L2434" id="L2434">
2434
</a>
<a class="file-line-num diff-line-num" data-line-number="2435" href="#L2435" id="L2435">
2435
</a>
<a class="file-line-num diff-line-num" data-line-number="2436" href="#L2436" id="L2436">
2436
</a>
<a class="file-line-num diff-line-num" data-line-number="2437" href="#L2437" id="L2437">
2437
</a>
<a class="file-line-num diff-line-num" data-line-number="2438" href="#L2438" id="L2438">
2438
</a>
<a class="file-line-num diff-line-num" data-line-number="2439" href="#L2439" id="L2439">
2439
</a>
<a class="file-line-num diff-line-num" data-line-number="2440" href="#L2440" id="L2440">
2440
</a>
<a class="file-line-num diff-line-num" data-line-number="2441" href="#L2441" id="L2441">
2441
</a>
<a class="file-line-num diff-line-num" data-line-number="2442" href="#L2442" id="L2442">
2442
</a>
<a class="file-line-num diff-line-num" data-line-number="2443" href="#L2443" id="L2443">
2443
</a>
<a class="file-line-num diff-line-num" data-line-number="2444" href="#L2444" id="L2444">
2444
</a>
<a class="file-line-num diff-line-num" data-line-number="2445" href="#L2445" id="L2445">
2445
</a>
<a class="file-line-num diff-line-num" data-line-number="2446" href="#L2446" id="L2446">
2446
</a>
<a class="file-line-num diff-line-num" data-line-number="2447" href="#L2447" id="L2447">
2447
</a>
<a class="file-line-num diff-line-num" data-line-number="2448" href="#L2448" id="L2448">
2448
</a>
<a class="file-line-num diff-line-num" data-line-number="2449" href="#L2449" id="L2449">
2449
</a>
<a class="file-line-num diff-line-num" data-line-number="2450" href="#L2450" id="L2450">
2450
</a>
<a class="file-line-num diff-line-num" data-line-number="2451" href="#L2451" id="L2451">
2451
</a>
<a class="file-line-num diff-line-num" data-line-number="2452" href="#L2452" id="L2452">
2452
</a>
<a class="file-line-num diff-line-num" data-line-number="2453" href="#L2453" id="L2453">
2453
</a>
<a class="file-line-num diff-line-num" data-line-number="2454" href="#L2454" id="L2454">
2454
</a>
<a class="file-line-num diff-line-num" data-line-number="2455" href="#L2455" id="L2455">
2455
</a>
<a class="file-line-num diff-line-num" data-line-number="2456" href="#L2456" id="L2456">
2456
</a>
<a class="file-line-num diff-line-num" data-line-number="2457" href="#L2457" id="L2457">
2457
</a>
<a class="file-line-num diff-line-num" data-line-number="2458" href="#L2458" id="L2458">
2458
</a>
<a class="file-line-num diff-line-num" data-line-number="2459" href="#L2459" id="L2459">
2459
</a>
<a class="file-line-num diff-line-num" data-line-number="2460" href="#L2460" id="L2460">
2460
</a>
<a class="file-line-num diff-line-num" data-line-number="2461" href="#L2461" id="L2461">
2461
</a>
<a class="file-line-num diff-line-num" data-line-number="2462" href="#L2462" id="L2462">
2462
</a>
<a class="file-line-num diff-line-num" data-line-number="2463" href="#L2463" id="L2463">
2463
</a>
<a class="file-line-num diff-line-num" data-line-number="2464" href="#L2464" id="L2464">
2464
</a>
<a class="file-line-num diff-line-num" data-line-number="2465" href="#L2465" id="L2465">
2465
</a>
<a class="file-line-num diff-line-num" data-line-number="2466" href="#L2466" id="L2466">
2466
</a>
<a class="file-line-num diff-line-num" data-line-number="2467" href="#L2467" id="L2467">
2467
</a>
<a class="file-line-num diff-line-num" data-line-number="2468" href="#L2468" id="L2468">
2468
</a>
<a class="file-line-num diff-line-num" data-line-number="2469" href="#L2469" id="L2469">
2469
</a>
<a class="file-line-num diff-line-num" data-line-number="2470" href="#L2470" id="L2470">
2470
</a>
<a class="file-line-num diff-line-num" data-line-number="2471" href="#L2471" id="L2471">
2471
</a>
<a class="file-line-num diff-line-num" data-line-number="2472" href="#L2472" id="L2472">
2472
</a>
<a class="file-line-num diff-line-num" data-line-number="2473" href="#L2473" id="L2473">
2473
</a>
<a class="file-line-num diff-line-num" data-line-number="2474" href="#L2474" id="L2474">
2474
</a>
<a class="file-line-num diff-line-num" data-line-number="2475" href="#L2475" id="L2475">
2475
</a>
<a class="file-line-num diff-line-num" data-line-number="2476" href="#L2476" id="L2476">
2476
</a>
<a class="file-line-num diff-line-num" data-line-number="2477" href="#L2477" id="L2477">
2477
</a>
<a class="file-line-num diff-line-num" data-line-number="2478" href="#L2478" id="L2478">
2478
</a>
<a class="file-line-num diff-line-num" data-line-number="2479" href="#L2479" id="L2479">
2479
</a>
<a class="file-line-num diff-line-num" data-line-number="2480" href="#L2480" id="L2480">
2480
</a>
<a class="file-line-num diff-line-num" data-line-number="2481" href="#L2481" id="L2481">
2481
</a>
<a class="file-line-num diff-line-num" data-line-number="2482" href="#L2482" id="L2482">
2482
</a>
<a class="file-line-num diff-line-num" data-line-number="2483" href="#L2483" id="L2483">
2483
</a>
<a class="file-line-num diff-line-num" data-line-number="2484" href="#L2484" id="L2484">
2484
</a>
<a class="file-line-num diff-line-num" data-line-number="2485" href="#L2485" id="L2485">
2485
</a>
<a class="file-line-num diff-line-num" data-line-number="2486" href="#L2486" id="L2486">
2486
</a>
<a class="file-line-num diff-line-num" data-line-number="2487" href="#L2487" id="L2487">
2487
</a>
<a class="file-line-num diff-line-num" data-line-number="2488" href="#L2488" id="L2488">
2488
</a>
<a class="file-line-num diff-line-num" data-line-number="2489" href="#L2489" id="L2489">
2489
</a>
<a class="file-line-num diff-line-num" data-line-number="2490" href="#L2490" id="L2490">
2490
</a>
<a class="file-line-num diff-line-num" data-line-number="2491" href="#L2491" id="L2491">
2491
</a>
<a class="file-line-num diff-line-num" data-line-number="2492" href="#L2492" id="L2492">
2492
</a>
<a class="file-line-num diff-line-num" data-line-number="2493" href="#L2493" id="L2493">
2493
</a>
<a class="file-line-num diff-line-num" data-line-number="2494" href="#L2494" id="L2494">
2494
</a>
<a class="file-line-num diff-line-num" data-line-number="2495" href="#L2495" id="L2495">
2495
</a>
<a class="file-line-num diff-line-num" data-line-number="2496" href="#L2496" id="L2496">
2496
</a>
<a class="file-line-num diff-line-num" data-line-number="2497" href="#L2497" id="L2497">
2497
</a>
<a class="file-line-num diff-line-num" data-line-number="2498" href="#L2498" id="L2498">
2498
</a>
<a class="file-line-num diff-line-num" data-line-number="2499" href="#L2499" id="L2499">
2499
</a>
<a class="file-line-num diff-line-num" data-line-number="2500" href="#L2500" id="L2500">
2500
</a>
<a class="file-line-num diff-line-num" data-line-number="2501" href="#L2501" id="L2501">
2501
</a>
<a class="file-line-num diff-line-num" data-line-number="2502" href="#L2502" id="L2502">
2502
</a>
<a class="file-line-num diff-line-num" data-line-number="2503" href="#L2503" id="L2503">
2503
</a>
<a class="file-line-num diff-line-num" data-line-number="2504" href="#L2504" id="L2504">
2504
</a>
<a class="file-line-num diff-line-num" data-line-number="2505" href="#L2505" id="L2505">
2505
</a>
<a class="file-line-num diff-line-num" data-line-number="2506" href="#L2506" id="L2506">
2506
</a>
<a class="file-line-num diff-line-num" data-line-number="2507" href="#L2507" id="L2507">
2507
</a>
<a class="file-line-num diff-line-num" data-line-number="2508" href="#L2508" id="L2508">
2508
</a>
<a class="file-line-num diff-line-num" data-line-number="2509" href="#L2509" id="L2509">
2509
</a>
<a class="file-line-num diff-line-num" data-line-number="2510" href="#L2510" id="L2510">
2510
</a>
<a class="file-line-num diff-line-num" data-line-number="2511" href="#L2511" id="L2511">
2511
</a>
<a class="file-line-num diff-line-num" data-line-number="2512" href="#L2512" id="L2512">
2512
</a>
<a class="file-line-num diff-line-num" data-line-number="2513" href="#L2513" id="L2513">
2513
</a>
<a class="file-line-num diff-line-num" data-line-number="2514" href="#L2514" id="L2514">
2514
</a>
<a class="file-line-num diff-line-num" data-line-number="2515" href="#L2515" id="L2515">
2515
</a>
<a class="file-line-num diff-line-num" data-line-number="2516" href="#L2516" id="L2516">
2516
</a>
<a class="file-line-num diff-line-num" data-line-number="2517" href="#L2517" id="L2517">
2517
</a>
<a class="file-line-num diff-line-num" data-line-number="2518" href="#L2518" id="L2518">
2518
</a>
<a class="file-line-num diff-line-num" data-line-number="2519" href="#L2519" id="L2519">
2519
</a>
<a class="file-line-num diff-line-num" data-line-number="2520" href="#L2520" id="L2520">
2520
</a>
<a class="file-line-num diff-line-num" data-line-number="2521" href="#L2521" id="L2521">
2521
</a>
<a class="file-line-num diff-line-num" data-line-number="2522" href="#L2522" id="L2522">
2522
</a>
<a class="file-line-num diff-line-num" data-line-number="2523" href="#L2523" id="L2523">
2523
</a>
<a class="file-line-num diff-line-num" data-line-number="2524" href="#L2524" id="L2524">
2524
</a>
<a class="file-line-num diff-line-num" data-line-number="2525" href="#L2525" id="L2525">
2525
</a>
<a class="file-line-num diff-line-num" data-line-number="2526" href="#L2526" id="L2526">
2526
</a>
<a class="file-line-num diff-line-num" data-line-number="2527" href="#L2527" id="L2527">
2527
</a>
<a class="file-line-num diff-line-num" data-line-number="2528" href="#L2528" id="L2528">
2528
</a>
<a class="file-line-num diff-line-num" data-line-number="2529" href="#L2529" id="L2529">
2529
</a>
<a class="file-line-num diff-line-num" data-line-number="2530" href="#L2530" id="L2530">
2530
</a>
<a class="file-line-num diff-line-num" data-line-number="2531" href="#L2531" id="L2531">
2531
</a>
<a class="file-line-num diff-line-num" data-line-number="2532" href="#L2532" id="L2532">
2532
</a>
<a class="file-line-num diff-line-num" data-line-number="2533" href="#L2533" id="L2533">
2533
</a>
<a class="file-line-num diff-line-num" data-line-number="2534" href="#L2534" id="L2534">
2534
</a>
<a class="file-line-num diff-line-num" data-line-number="2535" href="#L2535" id="L2535">
2535
</a>
<a class="file-line-num diff-line-num" data-line-number="2536" href="#L2536" id="L2536">
2536
</a>
<a class="file-line-num diff-line-num" data-line-number="2537" href="#L2537" id="L2537">
2537
</a>
<a class="file-line-num diff-line-num" data-line-number="2538" href="#L2538" id="L2538">
2538
</a>
<a class="file-line-num diff-line-num" data-line-number="2539" href="#L2539" id="L2539">
2539
</a>
<a class="file-line-num diff-line-num" data-line-number="2540" href="#L2540" id="L2540">
2540
</a>
<a class="file-line-num diff-line-num" data-line-number="2541" href="#L2541" id="L2541">
2541
</a>
<a class="file-line-num diff-line-num" data-line-number="2542" href="#L2542" id="L2542">
2542
</a>
<a class="file-line-num diff-line-num" data-line-number="2543" href="#L2543" id="L2543">
2543
</a>
<a class="file-line-num diff-line-num" data-line-number="2544" href="#L2544" id="L2544">
2544
</a>
<a class="file-line-num diff-line-num" data-line-number="2545" href="#L2545" id="L2545">
2545
</a>
<a class="file-line-num diff-line-num" data-line-number="2546" href="#L2546" id="L2546">
2546
</a>
<a class="file-line-num diff-line-num" data-line-number="2547" href="#L2547" id="L2547">
2547
</a>
<a class="file-line-num diff-line-num" data-line-number="2548" href="#L2548" id="L2548">
2548
</a>
<a class="file-line-num diff-line-num" data-line-number="2549" href="#L2549" id="L2549">
2549
</a>
<a class="file-line-num diff-line-num" data-line-number="2550" href="#L2550" id="L2550">
2550
</a>
<a class="file-line-num diff-line-num" data-line-number="2551" href="#L2551" id="L2551">
2551
</a>
<a class="file-line-num diff-line-num" data-line-number="2552" href="#L2552" id="L2552">
2552
</a>
<a class="file-line-num diff-line-num" data-line-number="2553" href="#L2553" id="L2553">
2553
</a>
<a class="file-line-num diff-line-num" data-line-number="2554" href="#L2554" id="L2554">
2554
</a>
<a class="file-line-num diff-line-num" data-line-number="2555" href="#L2555" id="L2555">
2555
</a>
<a class="file-line-num diff-line-num" data-line-number="2556" href="#L2556" id="L2556">
2556
</a>
<a class="file-line-num diff-line-num" data-line-number="2557" href="#L2557" id="L2557">
2557
</a>
<a class="file-line-num diff-line-num" data-line-number="2558" href="#L2558" id="L2558">
2558
</a>
<a class="file-line-num diff-line-num" data-line-number="2559" href="#L2559" id="L2559">
2559
</a>
<a class="file-line-num diff-line-num" data-line-number="2560" href="#L2560" id="L2560">
2560
</a>
<a class="file-line-num diff-line-num" data-line-number="2561" href="#L2561" id="L2561">
2561
</a>
<a class="file-line-num diff-line-num" data-line-number="2562" href="#L2562" id="L2562">
2562
</a>
<a class="file-line-num diff-line-num" data-line-number="2563" href="#L2563" id="L2563">
2563
</a>
<a class="file-line-num diff-line-num" data-line-number="2564" href="#L2564" id="L2564">
2564
</a>
<a class="file-line-num diff-line-num" data-line-number="2565" href="#L2565" id="L2565">
2565
</a>
<a class="file-line-num diff-line-num" data-line-number="2566" href="#L2566" id="L2566">
2566
</a>
<a class="file-line-num diff-line-num" data-line-number="2567" href="#L2567" id="L2567">
2567
</a>
<a class="file-line-num diff-line-num" data-line-number="2568" href="#L2568" id="L2568">
2568
</a>
<a class="file-line-num diff-line-num" data-line-number="2569" href="#L2569" id="L2569">
2569
</a>
<a class="file-line-num diff-line-num" data-line-number="2570" href="#L2570" id="L2570">
2570
</a>
<a class="file-line-num diff-line-num" data-line-number="2571" href="#L2571" id="L2571">
2571
</a>
<a class="file-line-num diff-line-num" data-line-number="2572" href="#L2572" id="L2572">
2572
</a>
<a class="file-line-num diff-line-num" data-line-number="2573" href="#L2573" id="L2573">
2573
</a>
<a class="file-line-num diff-line-num" data-line-number="2574" href="#L2574" id="L2574">
2574
</a>
<a class="file-line-num diff-line-num" data-line-number="2575" href="#L2575" id="L2575">
2575
</a>
<a class="file-line-num diff-line-num" data-line-number="2576" href="#L2576" id="L2576">
2576
</a>
<a class="file-line-num diff-line-num" data-line-number="2577" href="#L2577" id="L2577">
2577
</a>
<a class="file-line-num diff-line-num" data-line-number="2578" href="#L2578" id="L2578">
2578
</a>
<a class="file-line-num diff-line-num" data-line-number="2579" href="#L2579" id="L2579">
2579
</a>
<a class="file-line-num diff-line-num" data-line-number="2580" href="#L2580" id="L2580">
2580
</a>
<a class="file-line-num diff-line-num" data-line-number="2581" href="#L2581" id="L2581">
2581
</a>
<a class="file-line-num diff-line-num" data-line-number="2582" href="#L2582" id="L2582">
2582
</a>
<a class="file-line-num diff-line-num" data-line-number="2583" href="#L2583" id="L2583">
2583
</a>
<a class="file-line-num diff-line-num" data-line-number="2584" href="#L2584" id="L2584">
2584
</a>
<a class="file-line-num diff-line-num" data-line-number="2585" href="#L2585" id="L2585">
2585
</a>
<a class="file-line-num diff-line-num" data-line-number="2586" href="#L2586" id="L2586">
2586
</a>
<a class="file-line-num diff-line-num" data-line-number="2587" href="#L2587" id="L2587">
2587
</a>
<a class="file-line-num diff-line-num" data-line-number="2588" href="#L2588" id="L2588">
2588
</a>
<a class="file-line-num diff-line-num" data-line-number="2589" href="#L2589" id="L2589">
2589
</a>
<a class="file-line-num diff-line-num" data-line-number="2590" href="#L2590" id="L2590">
2590
</a>
<a class="file-line-num diff-line-num" data-line-number="2591" href="#L2591" id="L2591">
2591
</a>
<a class="file-line-num diff-line-num" data-line-number="2592" href="#L2592" id="L2592">
2592
</a>
<a class="file-line-num diff-line-num" data-line-number="2593" href="#L2593" id="L2593">
2593
</a>
<a class="file-line-num diff-line-num" data-line-number="2594" href="#L2594" id="L2594">
2594
</a>
<a class="file-line-num diff-line-num" data-line-number="2595" href="#L2595" id="L2595">
2595
</a>
<a class="file-line-num diff-line-num" data-line-number="2596" href="#L2596" id="L2596">
2596
</a>
<a class="file-line-num diff-line-num" data-line-number="2597" href="#L2597" id="L2597">
2597
</a>
<a class="file-line-num diff-line-num" data-line-number="2598" href="#L2598" id="L2598">
2598
</a>
<a class="file-line-num diff-line-num" data-line-number="2599" href="#L2599" id="L2599">
2599
</a>
<a class="file-line-num diff-line-num" data-line-number="2600" href="#L2600" id="L2600">
2600
</a>
<a class="file-line-num diff-line-num" data-line-number="2601" href="#L2601" id="L2601">
2601
</a>
<a class="file-line-num diff-line-num" data-line-number="2602" href="#L2602" id="L2602">
2602
</a>
<a class="file-line-num diff-line-num" data-line-number="2603" href="#L2603" id="L2603">
2603
</a>
<a class="file-line-num diff-line-num" data-line-number="2604" href="#L2604" id="L2604">
2604
</a>
<a class="file-line-num diff-line-num" data-line-number="2605" href="#L2605" id="L2605">
2605
</a>
<a class="file-line-num diff-line-num" data-line-number="2606" href="#L2606" id="L2606">
2606
</a>
<a class="file-line-num diff-line-num" data-line-number="2607" href="#L2607" id="L2607">
2607
</a>
<a class="file-line-num diff-line-num" data-line-number="2608" href="#L2608" id="L2608">
2608
</a>
<a class="file-line-num diff-line-num" data-line-number="2609" href="#L2609" id="L2609">
2609
</a>
<a class="file-line-num diff-line-num" data-line-number="2610" href="#L2610" id="L2610">
2610
</a>
<a class="file-line-num diff-line-num" data-line-number="2611" href="#L2611" id="L2611">
2611
</a>
<a class="file-line-num diff-line-num" data-line-number="2612" href="#L2612" id="L2612">
2612
</a>
<a class="file-line-num diff-line-num" data-line-number="2613" href="#L2613" id="L2613">
2613
</a>
<a class="file-line-num diff-line-num" data-line-number="2614" href="#L2614" id="L2614">
2614
</a>
<a class="file-line-num diff-line-num" data-line-number="2615" href="#L2615" id="L2615">
2615
</a>
<a class="file-line-num diff-line-num" data-line-number="2616" href="#L2616" id="L2616">
2616
</a>
<a class="file-line-num diff-line-num" data-line-number="2617" href="#L2617" id="L2617">
2617
</a>
<a class="file-line-num diff-line-num" data-line-number="2618" href="#L2618" id="L2618">
2618
</a>
<a class="file-line-num diff-line-num" data-line-number="2619" href="#L2619" id="L2619">
2619
</a>
<a class="file-line-num diff-line-num" data-line-number="2620" href="#L2620" id="L2620">
2620
</a>
<a class="file-line-num diff-line-num" data-line-number="2621" href="#L2621" id="L2621">
2621
</a>
<a class="file-line-num diff-line-num" data-line-number="2622" href="#L2622" id="L2622">
2622
</a>
<a class="file-line-num diff-line-num" data-line-number="2623" href="#L2623" id="L2623">
2623
</a>
<a class="file-line-num diff-line-num" data-line-number="2624" href="#L2624" id="L2624">
2624
</a>
<a class="file-line-num diff-line-num" data-line-number="2625" href="#L2625" id="L2625">
2625
</a>
<a class="file-line-num diff-line-num" data-line-number="2626" href="#L2626" id="L2626">
2626
</a>
<a class="file-line-num diff-line-num" data-line-number="2627" href="#L2627" id="L2627">
2627
</a>
<a class="file-line-num diff-line-num" data-line-number="2628" href="#L2628" id="L2628">
2628
</a>
<a class="file-line-num diff-line-num" data-line-number="2629" href="#L2629" id="L2629">
2629
</a>
<a class="file-line-num diff-line-num" data-line-number="2630" href="#L2630" id="L2630">
2630
</a>
<a class="file-line-num diff-line-num" data-line-number="2631" href="#L2631" id="L2631">
2631
</a>
<a class="file-line-num diff-line-num" data-line-number="2632" href="#L2632" id="L2632">
2632
</a>
<a class="file-line-num diff-line-num" data-line-number="2633" href="#L2633" id="L2633">
2633
</a>
<a class="file-line-num diff-line-num" data-line-number="2634" href="#L2634" id="L2634">
2634
</a>
<a class="file-line-num diff-line-num" data-line-number="2635" href="#L2635" id="L2635">
2635
</a>
<a class="file-line-num diff-line-num" data-line-number="2636" href="#L2636" id="L2636">
2636
</a>
<a class="file-line-num diff-line-num" data-line-number="2637" href="#L2637" id="L2637">
2637
</a>
<a class="file-line-num diff-line-num" data-line-number="2638" href="#L2638" id="L2638">
2638
</a>
<a class="file-line-num diff-line-num" data-line-number="2639" href="#L2639" id="L2639">
2639
</a>
<a class="file-line-num diff-line-num" data-line-number="2640" href="#L2640" id="L2640">
2640
</a>
<a class="file-line-num diff-line-num" data-line-number="2641" href="#L2641" id="L2641">
2641
</a>
<a class="file-line-num diff-line-num" data-line-number="2642" href="#L2642" id="L2642">
2642
</a>
<a class="file-line-num diff-line-num" data-line-number="2643" href="#L2643" id="L2643">
2643
</a>
<a class="file-line-num diff-line-num" data-line-number="2644" href="#L2644" id="L2644">
2644
</a>
<a class="file-line-num diff-line-num" data-line-number="2645" href="#L2645" id="L2645">
2645
</a>
<a class="file-line-num diff-line-num" data-line-number="2646" href="#L2646" id="L2646">
2646
</a>
<a class="file-line-num diff-line-num" data-line-number="2647" href="#L2647" id="L2647">
2647
</a>
<a class="file-line-num diff-line-num" data-line-number="2648" href="#L2648" id="L2648">
2648
</a>
<a class="file-line-num diff-line-num" data-line-number="2649" href="#L2649" id="L2649">
2649
</a>
<a class="file-line-num diff-line-num" data-line-number="2650" href="#L2650" id="L2650">
2650
</a>
<a class="file-line-num diff-line-num" data-line-number="2651" href="#L2651" id="L2651">
2651
</a>
<a class="file-line-num diff-line-num" data-line-number="2652" href="#L2652" id="L2652">
2652
</a>
<a class="file-line-num diff-line-num" data-line-number="2653" href="#L2653" id="L2653">
2653
</a>
<a class="file-line-num diff-line-num" data-line-number="2654" href="#L2654" id="L2654">
2654
</a>
<a class="file-line-num diff-line-num" data-line-number="2655" href="#L2655" id="L2655">
2655
</a>
<a class="file-line-num diff-line-num" data-line-number="2656" href="#L2656" id="L2656">
2656
</a>
<a class="file-line-num diff-line-num" data-line-number="2657" href="#L2657" id="L2657">
2657
</a>
<a class="file-line-num diff-line-num" data-line-number="2658" href="#L2658" id="L2658">
2658
</a>
<a class="file-line-num diff-line-num" data-line-number="2659" href="#L2659" id="L2659">
2659
</a>
<a class="file-line-num diff-line-num" data-line-number="2660" href="#L2660" id="L2660">
2660
</a>
<a class="file-line-num diff-line-num" data-line-number="2661" href="#L2661" id="L2661">
2661
</a>
<a class="file-line-num diff-line-num" data-line-number="2662" href="#L2662" id="L2662">
2662
</a>
<a class="file-line-num diff-line-num" data-line-number="2663" href="#L2663" id="L2663">
2663
</a>
<a class="file-line-num diff-line-num" data-line-number="2664" href="#L2664" id="L2664">
2664
</a>
<a class="file-line-num diff-line-num" data-line-number="2665" href="#L2665" id="L2665">
2665
</a>
<a class="file-line-num diff-line-num" data-line-number="2666" href="#L2666" id="L2666">
2666
</a>
<a class="file-line-num diff-line-num" data-line-number="2667" href="#L2667" id="L2667">
2667
</a>
<a class="file-line-num diff-line-num" data-line-number="2668" href="#L2668" id="L2668">
2668
</a>
<a class="file-line-num diff-line-num" data-line-number="2669" href="#L2669" id="L2669">
2669
</a>
<a class="file-line-num diff-line-num" data-line-number="2670" href="#L2670" id="L2670">
2670
</a>
<a class="file-line-num diff-line-num" data-line-number="2671" href="#L2671" id="L2671">
2671
</a>
<a class="file-line-num diff-line-num" data-line-number="2672" href="#L2672" id="L2672">
2672
</a>
<a class="file-line-num diff-line-num" data-line-number="2673" href="#L2673" id="L2673">
2673
</a>
<a class="file-line-num diff-line-num" data-line-number="2674" href="#L2674" id="L2674">
2674
</a>
<a class="file-line-num diff-line-num" data-line-number="2675" href="#L2675" id="L2675">
2675
</a>
<a class="file-line-num diff-line-num" data-line-number="2676" href="#L2676" id="L2676">
2676
</a>
<a class="file-line-num diff-line-num" data-line-number="2677" href="#L2677" id="L2677">
2677
</a>
<a class="file-line-num diff-line-num" data-line-number="2678" href="#L2678" id="L2678">
2678
</a>
<a class="file-line-num diff-line-num" data-line-number="2679" href="#L2679" id="L2679">
2679
</a>
<a class="file-line-num diff-line-num" data-line-number="2680" href="#L2680" id="L2680">
2680
</a>
<a class="file-line-num diff-line-num" data-line-number="2681" href="#L2681" id="L2681">
2681
</a>
<a class="file-line-num diff-line-num" data-line-number="2682" href="#L2682" id="L2682">
2682
</a>
<a class="file-line-num diff-line-num" data-line-number="2683" href="#L2683" id="L2683">
2683
</a>
<a class="file-line-num diff-line-num" data-line-number="2684" href="#L2684" id="L2684">
2684
</a>
<a class="file-line-num diff-line-num" data-line-number="2685" href="#L2685" id="L2685">
2685
</a>
<a class="file-line-num diff-line-num" data-line-number="2686" href="#L2686" id="L2686">
2686
</a>
<a class="file-line-num diff-line-num" data-line-number="2687" href="#L2687" id="L2687">
2687
</a>
<a class="file-line-num diff-line-num" data-line-number="2688" href="#L2688" id="L2688">
2688
</a>
<a class="file-line-num diff-line-num" data-line-number="2689" href="#L2689" id="L2689">
2689
</a>
<a class="file-line-num diff-line-num" data-line-number="2690" href="#L2690" id="L2690">
2690
</a>
<a class="file-line-num diff-line-num" data-line-number="2691" href="#L2691" id="L2691">
2691
</a>
<a class="file-line-num diff-line-num" data-line-number="2692" href="#L2692" id="L2692">
2692
</a>
<a class="file-line-num diff-line-num" data-line-number="2693" href="#L2693" id="L2693">
2693
</a>
<a class="file-line-num diff-line-num" data-line-number="2694" href="#L2694" id="L2694">
2694
</a>
<a class="file-line-num diff-line-num" data-line-number="2695" href="#L2695" id="L2695">
2695
</a>
<a class="file-line-num diff-line-num" data-line-number="2696" href="#L2696" id="L2696">
2696
</a>
<a class="file-line-num diff-line-num" data-line-number="2697" href="#L2697" id="L2697">
2697
</a>
<a class="file-line-num diff-line-num" data-line-number="2698" href="#L2698" id="L2698">
2698
</a>
<a class="file-line-num diff-line-num" data-line-number="2699" href="#L2699" id="L2699">
2699
</a>
<a class="file-line-num diff-line-num" data-line-number="2700" href="#L2700" id="L2700">
2700
</a>
<a class="file-line-num diff-line-num" data-line-number="2701" href="#L2701" id="L2701">
2701
</a>
<a class="file-line-num diff-line-num" data-line-number="2702" href="#L2702" id="L2702">
2702
</a>
<a class="file-line-num diff-line-num" data-line-number="2703" href="#L2703" id="L2703">
2703
</a>
<a class="file-line-num diff-line-num" data-line-number="2704" href="#L2704" id="L2704">
2704
</a>
<a class="file-line-num diff-line-num" data-line-number="2705" href="#L2705" id="L2705">
2705
</a>
<a class="file-line-num diff-line-num" data-line-number="2706" href="#L2706" id="L2706">
2706
</a>
<a class="file-line-num diff-line-num" data-line-number="2707" href="#L2707" id="L2707">
2707
</a>
<a class="file-line-num diff-line-num" data-line-number="2708" href="#L2708" id="L2708">
2708
</a>
<a class="file-line-num diff-line-num" data-line-number="2709" href="#L2709" id="L2709">
2709
</a>
<a class="file-line-num diff-line-num" data-line-number="2710" href="#L2710" id="L2710">
2710
</a>
<a class="file-line-num diff-line-num" data-line-number="2711" href="#L2711" id="L2711">
2711
</a>
<a class="file-line-num diff-line-num" data-line-number="2712" href="#L2712" id="L2712">
2712
</a>
<a class="file-line-num diff-line-num" data-line-number="2713" href="#L2713" id="L2713">
2713
</a>
<a class="file-line-num diff-line-num" data-line-number="2714" href="#L2714" id="L2714">
2714
</a>
<a class="file-line-num diff-line-num" data-line-number="2715" href="#L2715" id="L2715">
2715
</a>
<a class="file-line-num diff-line-num" data-line-number="2716" href="#L2716" id="L2716">
2716
</a>
<a class="file-line-num diff-line-num" data-line-number="2717" href="#L2717" id="L2717">
2717
</a>
<a class="file-line-num diff-line-num" data-line-number="2718" href="#L2718" id="L2718">
2718
</a>
<a class="file-line-num diff-line-num" data-line-number="2719" href="#L2719" id="L2719">
2719
</a>
<a class="file-line-num diff-line-num" data-line-number="2720" href="#L2720" id="L2720">
2720
</a>
<a class="file-line-num diff-line-num" data-line-number="2721" href="#L2721" id="L2721">
2721
</a>
<a class="file-line-num diff-line-num" data-line-number="2722" href="#L2722" id="L2722">
2722
</a>
<a class="file-line-num diff-line-num" data-line-number="2723" href="#L2723" id="L2723">
2723
</a>
<a class="file-line-num diff-line-num" data-line-number="2724" href="#L2724" id="L2724">
2724
</a>
<a class="file-line-num diff-line-num" data-line-number="2725" href="#L2725" id="L2725">
2725
</a>
<a class="file-line-num diff-line-num" data-line-number="2726" href="#L2726" id="L2726">
2726
</a>
<a class="file-line-num diff-line-num" data-line-number="2727" href="#L2727" id="L2727">
2727
</a>
<a class="file-line-num diff-line-num" data-line-number="2728" href="#L2728" id="L2728">
2728
</a>
<a class="file-line-num diff-line-num" data-line-number="2729" href="#L2729" id="L2729">
2729
</a>
<a class="file-line-num diff-line-num" data-line-number="2730" href="#L2730" id="L2730">
2730
</a>
<a class="file-line-num diff-line-num" data-line-number="2731" href="#L2731" id="L2731">
2731
</a>
<a class="file-line-num diff-line-num" data-line-number="2732" href="#L2732" id="L2732">
2732
</a>
<a class="file-line-num diff-line-num" data-line-number="2733" href="#L2733" id="L2733">
2733
</a>
<a class="file-line-num diff-line-num" data-line-number="2734" href="#L2734" id="L2734">
2734
</a>
<a class="file-line-num diff-line-num" data-line-number="2735" href="#L2735" id="L2735">
2735
</a>
<a class="file-line-num diff-line-num" data-line-number="2736" href="#L2736" id="L2736">
2736
</a>
<a class="file-line-num diff-line-num" data-line-number="2737" href="#L2737" id="L2737">
2737
</a>
<a class="file-line-num diff-line-num" data-line-number="2738" href="#L2738" id="L2738">
2738
</a>
<a class="file-line-num diff-line-num" data-line-number="2739" href="#L2739" id="L2739">
2739
</a>
<a class="file-line-num diff-line-num" data-line-number="2740" href="#L2740" id="L2740">
2740
</a>
<a class="file-line-num diff-line-num" data-line-number="2741" href="#L2741" id="L2741">
2741
</a>
<a class="file-line-num diff-line-num" data-line-number="2742" href="#L2742" id="L2742">
2742
</a>
<a class="file-line-num diff-line-num" data-line-number="2743" href="#L2743" id="L2743">
2743
</a>
<a class="file-line-num diff-line-num" data-line-number="2744" href="#L2744" id="L2744">
2744
</a>
<a class="file-line-num diff-line-num" data-line-number="2745" href="#L2745" id="L2745">
2745
</a>
<a class="file-line-num diff-line-num" data-line-number="2746" href="#L2746" id="L2746">
2746
</a>
<a class="file-line-num diff-line-num" data-line-number="2747" href="#L2747" id="L2747">
2747
</a>
<a class="file-line-num diff-line-num" data-line-number="2748" href="#L2748" id="L2748">
2748
</a>
<a class="file-line-num diff-line-num" data-line-number="2749" href="#L2749" id="L2749">
2749
</a>
<a class="file-line-num diff-line-num" data-line-number="2750" href="#L2750" id="L2750">
2750
</a>
<a class="file-line-num diff-line-num" data-line-number="2751" href="#L2751" id="L2751">
2751
</a>
<a class="file-line-num diff-line-num" data-line-number="2752" href="#L2752" id="L2752">
2752
</a>
<a class="file-line-num diff-line-num" data-line-number="2753" href="#L2753" id="L2753">
2753
</a>
<a class="file-line-num diff-line-num" data-line-number="2754" href="#L2754" id="L2754">
2754
</a>
<a class="file-line-num diff-line-num" data-line-number="2755" href="#L2755" id="L2755">
2755
</a>
<a class="file-line-num diff-line-num" data-line-number="2756" href="#L2756" id="L2756">
2756
</a>
<a class="file-line-num diff-line-num" data-line-number="2757" href="#L2757" id="L2757">
2757
</a>
<a class="file-line-num diff-line-num" data-line-number="2758" href="#L2758" id="L2758">
2758
</a>
<a class="file-line-num diff-line-num" data-line-number="2759" href="#L2759" id="L2759">
2759
</a>
<a class="file-line-num diff-line-num" data-line-number="2760" href="#L2760" id="L2760">
2760
</a>
<a class="file-line-num diff-line-num" data-line-number="2761" href="#L2761" id="L2761">
2761
</a>
<a class="file-line-num diff-line-num" data-line-number="2762" href="#L2762" id="L2762">
2762
</a>
<a class="file-line-num diff-line-num" data-line-number="2763" href="#L2763" id="L2763">
2763
</a>
<a class="file-line-num diff-line-num" data-line-number="2764" href="#L2764" id="L2764">
2764
</a>
<a class="file-line-num diff-line-num" data-line-number="2765" href="#L2765" id="L2765">
2765
</a>
<a class="file-line-num diff-line-num" data-line-number="2766" href="#L2766" id="L2766">
2766
</a>
<a class="file-line-num diff-line-num" data-line-number="2767" href="#L2767" id="L2767">
2767
</a>
<a class="file-line-num diff-line-num" data-line-number="2768" href="#L2768" id="L2768">
2768
</a>
<a class="file-line-num diff-line-num" data-line-number="2769" href="#L2769" id="L2769">
2769
</a>
<a class="file-line-num diff-line-num" data-line-number="2770" href="#L2770" id="L2770">
2770
</a>
<a class="file-line-num diff-line-num" data-line-number="2771" href="#L2771" id="L2771">
2771
</a>
<a class="file-line-num diff-line-num" data-line-number="2772" href="#L2772" id="L2772">
2772
</a>
<a class="file-line-num diff-line-num" data-line-number="2773" href="#L2773" id="L2773">
2773
</a>
<a class="file-line-num diff-line-num" data-line-number="2774" href="#L2774" id="L2774">
2774
</a>
<a class="file-line-num diff-line-num" data-line-number="2775" href="#L2775" id="L2775">
2775
</a>
<a class="file-line-num diff-line-num" data-line-number="2776" href="#L2776" id="L2776">
2776
</a>
<a class="file-line-num diff-line-num" data-line-number="2777" href="#L2777" id="L2777">
2777
</a>
<a class="file-line-num diff-line-num" data-line-number="2778" href="#L2778" id="L2778">
2778
</a>
<a class="file-line-num diff-line-num" data-line-number="2779" href="#L2779" id="L2779">
2779
</a>
<a class="file-line-num diff-line-num" data-line-number="2780" href="#L2780" id="L2780">
2780
</a>
<a class="file-line-num diff-line-num" data-line-number="2781" href="#L2781" id="L2781">
2781
</a>
<a class="file-line-num diff-line-num" data-line-number="2782" href="#L2782" id="L2782">
2782
</a>
<a class="file-line-num diff-line-num" data-line-number="2783" href="#L2783" id="L2783">
2783
</a>
<a class="file-line-num diff-line-num" data-line-number="2784" href="#L2784" id="L2784">
2784
</a>
<a class="file-line-num diff-line-num" data-line-number="2785" href="#L2785" id="L2785">
2785
</a>
<a class="file-line-num diff-line-num" data-line-number="2786" href="#L2786" id="L2786">
2786
</a>
<a class="file-line-num diff-line-num" data-line-number="2787" href="#L2787" id="L2787">
2787
</a>
<a class="file-line-num diff-line-num" data-line-number="2788" href="#L2788" id="L2788">
2788
</a>
<a class="file-line-num diff-line-num" data-line-number="2789" href="#L2789" id="L2789">
2789
</a>
<a class="file-line-num diff-line-num" data-line-number="2790" href="#L2790" id="L2790">
2790
</a>
<a class="file-line-num diff-line-num" data-line-number="2791" href="#L2791" id="L2791">
2791
</a>
<a class="file-line-num diff-line-num" data-line-number="2792" href="#L2792" id="L2792">
2792
</a>
<a class="file-line-num diff-line-num" data-line-number="2793" href="#L2793" id="L2793">
2793
</a>
<a class="file-line-num diff-line-num" data-line-number="2794" href="#L2794" id="L2794">
2794
</a>
<a class="file-line-num diff-line-num" data-line-number="2795" href="#L2795" id="L2795">
2795
</a>
<a class="file-line-num diff-line-num" data-line-number="2796" href="#L2796" id="L2796">
2796
</a>
<a class="file-line-num diff-line-num" data-line-number="2797" href="#L2797" id="L2797">
2797
</a>
<a class="file-line-num diff-line-num" data-line-number="2798" href="#L2798" id="L2798">
2798
</a>
<a class="file-line-num diff-line-num" data-line-number="2799" href="#L2799" id="L2799">
2799
</a>
<a class="file-line-num diff-line-num" data-line-number="2800" href="#L2800" id="L2800">
2800
</a>
<a class="file-line-num diff-line-num" data-line-number="2801" href="#L2801" id="L2801">
2801
</a>
<a class="file-line-num diff-line-num" data-line-number="2802" href="#L2802" id="L2802">
2802
</a>
<a class="file-line-num diff-line-num" data-line-number="2803" href="#L2803" id="L2803">
2803
</a>
<a class="file-line-num diff-line-num" data-line-number="2804" href="#L2804" id="L2804">
2804
</a>
<a class="file-line-num diff-line-num" data-line-number="2805" href="#L2805" id="L2805">
2805
</a>
<a class="file-line-num diff-line-num" data-line-number="2806" href="#L2806" id="L2806">
2806
</a>
<a class="file-line-num diff-line-num" data-line-number="2807" href="#L2807" id="L2807">
2807
</a>
<a class="file-line-num diff-line-num" data-line-number="2808" href="#L2808" id="L2808">
2808
</a>
<a class="file-line-num diff-line-num" data-line-number="2809" href="#L2809" id="L2809">
2809
</a>
<a class="file-line-num diff-line-num" data-line-number="2810" href="#L2810" id="L2810">
2810
</a>
<a class="file-line-num diff-line-num" data-line-number="2811" href="#L2811" id="L2811">
2811
</a>
<a class="file-line-num diff-line-num" data-line-number="2812" href="#L2812" id="L2812">
2812
</a>
<a class="file-line-num diff-line-num" data-line-number="2813" href="#L2813" id="L2813">
2813
</a>
<a class="file-line-num diff-line-num" data-line-number="2814" href="#L2814" id="L2814">
2814
</a>
<a class="file-line-num diff-line-num" data-line-number="2815" href="#L2815" id="L2815">
2815
</a>
<a class="file-line-num diff-line-num" data-line-number="2816" href="#L2816" id="L2816">
2816
</a>
<a class="file-line-num diff-line-num" data-line-number="2817" href="#L2817" id="L2817">
2817
</a>
<a class="file-line-num diff-line-num" data-line-number="2818" href="#L2818" id="L2818">
2818
</a>
<a class="file-line-num diff-line-num" data-line-number="2819" href="#L2819" id="L2819">
2819
</a>
<a class="file-line-num diff-line-num" data-line-number="2820" href="#L2820" id="L2820">
2820
</a>
<a class="file-line-num diff-line-num" data-line-number="2821" href="#L2821" id="L2821">
2821
</a>
<a class="file-line-num diff-line-num" data-line-number="2822" href="#L2822" id="L2822">
2822
</a>
<a class="file-line-num diff-line-num" data-line-number="2823" href="#L2823" id="L2823">
2823
</a>
<a class="file-line-num diff-line-num" data-line-number="2824" href="#L2824" id="L2824">
2824
</a>
<a class="file-line-num diff-line-num" data-line-number="2825" href="#L2825" id="L2825">
2825
</a>
<a class="file-line-num diff-line-num" data-line-number="2826" href="#L2826" id="L2826">
2826
</a>
<a class="file-line-num diff-line-num" data-line-number="2827" href="#L2827" id="L2827">
2827
</a>
<a class="file-line-num diff-line-num" data-line-number="2828" href="#L2828" id="L2828">
2828
</a>
<a class="file-line-num diff-line-num" data-line-number="2829" href="#L2829" id="L2829">
2829
</a>
<a class="file-line-num diff-line-num" data-line-number="2830" href="#L2830" id="L2830">
2830
</a>
<a class="file-line-num diff-line-num" data-line-number="2831" href="#L2831" id="L2831">
2831
</a>
<a class="file-line-num diff-line-num" data-line-number="2832" href="#L2832" id="L2832">
2832
</a>
<a class="file-line-num diff-line-num" data-line-number="2833" href="#L2833" id="L2833">
2833
</a>
<a class="file-line-num diff-line-num" data-line-number="2834" href="#L2834" id="L2834">
2834
</a>
<a class="file-line-num diff-line-num" data-line-number="2835" href="#L2835" id="L2835">
2835
</a>
<a class="file-line-num diff-line-num" data-line-number="2836" href="#L2836" id="L2836">
2836
</a>
<a class="file-line-num diff-line-num" data-line-number="2837" href="#L2837" id="L2837">
2837
</a>
<a class="file-line-num diff-line-num" data-line-number="2838" href="#L2838" id="L2838">
2838
</a>
<a class="file-line-num diff-line-num" data-line-number="2839" href="#L2839" id="L2839">
2839
</a>
<a class="file-line-num diff-line-num" data-line-number="2840" href="#L2840" id="L2840">
2840
</a>
<a class="file-line-num diff-line-num" data-line-number="2841" href="#L2841" id="L2841">
2841
</a>
<a class="file-line-num diff-line-num" data-line-number="2842" href="#L2842" id="L2842">
2842
</a>
<a class="file-line-num diff-line-num" data-line-number="2843" href="#L2843" id="L2843">
2843
</a>
<a class="file-line-num diff-line-num" data-line-number="2844" href="#L2844" id="L2844">
2844
</a>
<a class="file-line-num diff-line-num" data-line-number="2845" href="#L2845" id="L2845">
2845
</a>
<a class="file-line-num diff-line-num" data-line-number="2846" href="#L2846" id="L2846">
2846
</a>
<a class="file-line-num diff-line-num" data-line-number="2847" href="#L2847" id="L2847">
2847
</a>
<a class="file-line-num diff-line-num" data-line-number="2848" href="#L2848" id="L2848">
2848
</a>
<a class="file-line-num diff-line-num" data-line-number="2849" href="#L2849" id="L2849">
2849
</a>
<a class="file-line-num diff-line-num" data-line-number="2850" href="#L2850" id="L2850">
2850
</a>
<a class="file-line-num diff-line-num" data-line-number="2851" href="#L2851" id="L2851">
2851
</a>
<a class="file-line-num diff-line-num" data-line-number="2852" href="#L2852" id="L2852">
2852
</a>
<a class="file-line-num diff-line-num" data-line-number="2853" href="#L2853" id="L2853">
2853
</a>
<a class="file-line-num diff-line-num" data-line-number="2854" href="#L2854" id="L2854">
2854
</a>
<a class="file-line-num diff-line-num" data-line-number="2855" href="#L2855" id="L2855">
2855
</a>
<a class="file-line-num diff-line-num" data-line-number="2856" href="#L2856" id="L2856">
2856
</a>
<a class="file-line-num diff-line-num" data-line-number="2857" href="#L2857" id="L2857">
2857
</a>
<a class="file-line-num diff-line-num" data-line-number="2858" href="#L2858" id="L2858">
2858
</a>
<a class="file-line-num diff-line-num" data-line-number="2859" href="#L2859" id="L2859">
2859
</a>
<a class="file-line-num diff-line-num" data-line-number="2860" href="#L2860" id="L2860">
2860
</a>
<a class="file-line-num diff-line-num" data-line-number="2861" href="#L2861" id="L2861">
2861
</a>
<a class="file-line-num diff-line-num" data-line-number="2862" href="#L2862" id="L2862">
2862
</a>
<a class="file-line-num diff-line-num" data-line-number="2863" href="#L2863" id="L2863">
2863
</a>
<a class="file-line-num diff-line-num" data-line-number="2864" href="#L2864" id="L2864">
2864
</a>
<a class="file-line-num diff-line-num" data-line-number="2865" href="#L2865" id="L2865">
2865
</a>
<a class="file-line-num diff-line-num" data-line-number="2866" href="#L2866" id="L2866">
2866
</a>
<a class="file-line-num diff-line-num" data-line-number="2867" href="#L2867" id="L2867">
2867
</a>
<a class="file-line-num diff-line-num" data-line-number="2868" href="#L2868" id="L2868">
2868
</a>
<a class="file-line-num diff-line-num" data-line-number="2869" href="#L2869" id="L2869">
2869
</a>
<a class="file-line-num diff-line-num" data-line-number="2870" href="#L2870" id="L2870">
2870
</a>
<a class="file-line-num diff-line-num" data-line-number="2871" href="#L2871" id="L2871">
2871
</a>
<a class="file-line-num diff-line-num" data-line-number="2872" href="#L2872" id="L2872">
2872
</a>
<a class="file-line-num diff-line-num" data-line-number="2873" href="#L2873" id="L2873">
2873
</a>
<a class="file-line-num diff-line-num" data-line-number="2874" href="#L2874" id="L2874">
2874
</a>
<a class="file-line-num diff-line-num" data-line-number="2875" href="#L2875" id="L2875">
2875
</a>
<a class="file-line-num diff-line-num" data-line-number="2876" href="#L2876" id="L2876">
2876
</a>
<a class="file-line-num diff-line-num" data-line-number="2877" href="#L2877" id="L2877">
2877
</a>
<a class="file-line-num diff-line-num" data-line-number="2878" href="#L2878" id="L2878">
2878
</a>
<a class="file-line-num diff-line-num" data-line-number="2879" href="#L2879" id="L2879">
2879
</a>
<a class="file-line-num diff-line-num" data-line-number="2880" href="#L2880" id="L2880">
2880
</a>
<a class="file-line-num diff-line-num" data-line-number="2881" href="#L2881" id="L2881">
2881
</a>
<a class="file-line-num diff-line-num" data-line-number="2882" href="#L2882" id="L2882">
2882
</a>
<a class="file-line-num diff-line-num" data-line-number="2883" href="#L2883" id="L2883">
2883
</a>
<a class="file-line-num diff-line-num" data-line-number="2884" href="#L2884" id="L2884">
2884
</a>
<a class="file-line-num diff-line-num" data-line-number="2885" href="#L2885" id="L2885">
2885
</a>
<a class="file-line-num diff-line-num" data-line-number="2886" href="#L2886" id="L2886">
2886
</a>
<a class="file-line-num diff-line-num" data-line-number="2887" href="#L2887" id="L2887">
2887
</a>
<a class="file-line-num diff-line-num" data-line-number="2888" href="#L2888" id="L2888">
2888
</a>
<a class="file-line-num diff-line-num" data-line-number="2889" href="#L2889" id="L2889">
2889
</a>
<a class="file-line-num diff-line-num" data-line-number="2890" href="#L2890" id="L2890">
2890
</a>
<a class="file-line-num diff-line-num" data-line-number="2891" href="#L2891" id="L2891">
2891
</a>
<a class="file-line-num diff-line-num" data-line-number="2892" href="#L2892" id="L2892">
2892
</a>
<a class="file-line-num diff-line-num" data-line-number="2893" href="#L2893" id="L2893">
2893
</a>
<a class="file-line-num diff-line-num" data-line-number="2894" href="#L2894" id="L2894">
2894
</a>
<a class="file-line-num diff-line-num" data-line-number="2895" href="#L2895" id="L2895">
2895
</a>
<a class="file-line-num diff-line-num" data-line-number="2896" href="#L2896" id="L2896">
2896
</a>
<a class="file-line-num diff-line-num" data-line-number="2897" href="#L2897" id="L2897">
2897
</a>
<a class="file-line-num diff-line-num" data-line-number="2898" href="#L2898" id="L2898">
2898
</a>
<a class="file-line-num diff-line-num" data-line-number="2899" href="#L2899" id="L2899">
2899
</a>
<a class="file-line-num diff-line-num" data-line-number="2900" href="#L2900" id="L2900">
2900
</a>
<a class="file-line-num diff-line-num" data-line-number="2901" href="#L2901" id="L2901">
2901
</a>
<a class="file-line-num diff-line-num" data-line-number="2902" href="#L2902" id="L2902">
2902
</a>
<a class="file-line-num diff-line-num" data-line-number="2903" href="#L2903" id="L2903">
2903
</a>
<a class="file-line-num diff-line-num" data-line-number="2904" href="#L2904" id="L2904">
2904
</a>
<a class="file-line-num diff-line-num" data-line-number="2905" href="#L2905" id="L2905">
2905
</a>
<a class="file-line-num diff-line-num" data-line-number="2906" href="#L2906" id="L2906">
2906
</a>
<a class="file-line-num diff-line-num" data-line-number="2907" href="#L2907" id="L2907">
2907
</a>
<a class="file-line-num diff-line-num" data-line-number="2908" href="#L2908" id="L2908">
2908
</a>
<a class="file-line-num diff-line-num" data-line-number="2909" href="#L2909" id="L2909">
2909
</a>
<a class="file-line-num diff-line-num" data-line-number="2910" href="#L2910" id="L2910">
2910
</a>
<a class="file-line-num diff-line-num" data-line-number="2911" href="#L2911" id="L2911">
2911
</a>
<a class="file-line-num diff-line-num" data-line-number="2912" href="#L2912" id="L2912">
2912
</a>
<a class="file-line-num diff-line-num" data-line-number="2913" href="#L2913" id="L2913">
2913
</a>
<a class="file-line-num diff-line-num" data-line-number="2914" href="#L2914" id="L2914">
2914
</a>
<a class="file-line-num diff-line-num" data-line-number="2915" href="#L2915" id="L2915">
2915
</a>
<a class="file-line-num diff-line-num" data-line-number="2916" href="#L2916" id="L2916">
2916
</a>
<a class="file-line-num diff-line-num" data-line-number="2917" href="#L2917" id="L2917">
2917
</a>
<a class="file-line-num diff-line-num" data-line-number="2918" href="#L2918" id="L2918">
2918
</a>
<a class="file-line-num diff-line-num" data-line-number="2919" href="#L2919" id="L2919">
2919
</a>
<a class="file-line-num diff-line-num" data-line-number="2920" href="#L2920" id="L2920">
2920
</a>
<a class="file-line-num diff-line-num" data-line-number="2921" href="#L2921" id="L2921">
2921
</a>
<a class="file-line-num diff-line-num" data-line-number="2922" href="#L2922" id="L2922">
2922
</a>
<a class="file-line-num diff-line-num" data-line-number="2923" href="#L2923" id="L2923">
2923
</a>
<a class="file-line-num diff-line-num" data-line-number="2924" href="#L2924" id="L2924">
2924
</a>
<a class="file-line-num diff-line-num" data-line-number="2925" href="#L2925" id="L2925">
2925
</a>
<a class="file-line-num diff-line-num" data-line-number="2926" href="#L2926" id="L2926">
2926
</a>
<a class="file-line-num diff-line-num" data-line-number="2927" href="#L2927" id="L2927">
2927
</a>
<a class="file-line-num diff-line-num" data-line-number="2928" href="#L2928" id="L2928">
2928
</a>
<a class="file-line-num diff-line-num" data-line-number="2929" href="#L2929" id="L2929">
2929
</a>
<a class="file-line-num diff-line-num" data-line-number="2930" href="#L2930" id="L2930">
2930
</a>
<a class="file-line-num diff-line-num" data-line-number="2931" href="#L2931" id="L2931">
2931
</a>
<a class="file-line-num diff-line-num" data-line-number="2932" href="#L2932" id="L2932">
2932
</a>
<a class="file-line-num diff-line-num" data-line-number="2933" href="#L2933" id="L2933">
2933
</a>
<a class="file-line-num diff-line-num" data-line-number="2934" href="#L2934" id="L2934">
2934
</a>
<a class="file-line-num diff-line-num" data-line-number="2935" href="#L2935" id="L2935">
2935
</a>
<a class="file-line-num diff-line-num" data-line-number="2936" href="#L2936" id="L2936">
2936
</a>
<a class="file-line-num diff-line-num" data-line-number="2937" href="#L2937" id="L2937">
2937
</a>
<a class="file-line-num diff-line-num" data-line-number="2938" href="#L2938" id="L2938">
2938
</a>
<a class="file-line-num diff-line-num" data-line-number="2939" href="#L2939" id="L2939">
2939
</a>
<a class="file-line-num diff-line-num" data-line-number="2940" href="#L2940" id="L2940">
2940
</a>
<a class="file-line-num diff-line-num" data-line-number="2941" href="#L2941" id="L2941">
2941
</a>
<a class="file-line-num diff-line-num" data-line-number="2942" href="#L2942" id="L2942">
2942
</a>
<a class="file-line-num diff-line-num" data-line-number="2943" href="#L2943" id="L2943">
2943
</a>
<a class="file-line-num diff-line-num" data-line-number="2944" href="#L2944" id="L2944">
2944
</a>
<a class="file-line-num diff-line-num" data-line-number="2945" href="#L2945" id="L2945">
2945
</a>
<a class="file-line-num diff-line-num" data-line-number="2946" href="#L2946" id="L2946">
2946
</a>
<a class="file-line-num diff-line-num" data-line-number="2947" href="#L2947" id="L2947">
2947
</a>
<a class="file-line-num diff-line-num" data-line-number="2948" href="#L2948" id="L2948">
2948
</a>
<a class="file-line-num diff-line-num" data-line-number="2949" href="#L2949" id="L2949">
2949
</a>
<a class="file-line-num diff-line-num" data-line-number="2950" href="#L2950" id="L2950">
2950
</a>
<a class="file-line-num diff-line-num" data-line-number="2951" href="#L2951" id="L2951">
2951
</a>
<a class="file-line-num diff-line-num" data-line-number="2952" href="#L2952" id="L2952">
2952
</a>
<a class="file-line-num diff-line-num" data-line-number="2953" href="#L2953" id="L2953">
2953
</a>
<a class="file-line-num diff-line-num" data-line-number="2954" href="#L2954" id="L2954">
2954
</a>
<a class="file-line-num diff-line-num" data-line-number="2955" href="#L2955" id="L2955">
2955
</a>
<a class="file-line-num diff-line-num" data-line-number="2956" href="#L2956" id="L2956">
2956
</a>
<a class="file-line-num diff-line-num" data-line-number="2957" href="#L2957" id="L2957">
2957
</a>
<a class="file-line-num diff-line-num" data-line-number="2958" href="#L2958" id="L2958">
2958
</a>
<a class="file-line-num diff-line-num" data-line-number="2959" href="#L2959" id="L2959">
2959
</a>
<a class="file-line-num diff-line-num" data-line-number="2960" href="#L2960" id="L2960">
2960
</a>
<a class="file-line-num diff-line-num" data-line-number="2961" href="#L2961" id="L2961">
2961
</a>
<a class="file-line-num diff-line-num" data-line-number="2962" href="#L2962" id="L2962">
2962
</a>
<a class="file-line-num diff-line-num" data-line-number="2963" href="#L2963" id="L2963">
2963
</a>
<a class="file-line-num diff-line-num" data-line-number="2964" href="#L2964" id="L2964">
2964
</a>
<a class="file-line-num diff-line-num" data-line-number="2965" href="#L2965" id="L2965">
2965
</a>
<a class="file-line-num diff-line-num" data-line-number="2966" href="#L2966" id="L2966">
2966
</a>
<a class="file-line-num diff-line-num" data-line-number="2967" href="#L2967" id="L2967">
2967
</a>
<a class="file-line-num diff-line-num" data-line-number="2968" href="#L2968" id="L2968">
2968
</a>
<a class="file-line-num diff-line-num" data-line-number="2969" href="#L2969" id="L2969">
2969
</a>
<a class="file-line-num diff-line-num" data-line-number="2970" href="#L2970" id="L2970">
2970
</a>
<a class="file-line-num diff-line-num" data-line-number="2971" href="#L2971" id="L2971">
2971
</a>
<a class="file-line-num diff-line-num" data-line-number="2972" href="#L2972" id="L2972">
2972
</a>
<a class="file-line-num diff-line-num" data-line-number="2973" href="#L2973" id="L2973">
2973
</a>
<a class="file-line-num diff-line-num" data-line-number="2974" href="#L2974" id="L2974">
2974
</a>
<a class="file-line-num diff-line-num" data-line-number="2975" href="#L2975" id="L2975">
2975
</a>
<a class="file-line-num diff-line-num" data-line-number="2976" href="#L2976" id="L2976">
2976
</a>
<a class="file-line-num diff-line-num" data-line-number="2977" href="#L2977" id="L2977">
2977
</a>
<a class="file-line-num diff-line-num" data-line-number="2978" href="#L2978" id="L2978">
2978
</a>
<a class="file-line-num diff-line-num" data-line-number="2979" href="#L2979" id="L2979">
2979
</a>
<a class="file-line-num diff-line-num" data-line-number="2980" href="#L2980" id="L2980">
2980
</a>
<a class="file-line-num diff-line-num" data-line-number="2981" href="#L2981" id="L2981">
2981
</a>
<a class="file-line-num diff-line-num" data-line-number="2982" href="#L2982" id="L2982">
2982
</a>
<a class="file-line-num diff-line-num" data-line-number="2983" href="#L2983" id="L2983">
2983
</a>
<a class="file-line-num diff-line-num" data-line-number="2984" href="#L2984" id="L2984">
2984
</a>
<a class="file-line-num diff-line-num" data-line-number="2985" href="#L2985" id="L2985">
2985
</a>
<a class="file-line-num diff-line-num" data-line-number="2986" href="#L2986" id="L2986">
2986
</a>
<a class="file-line-num diff-line-num" data-line-number="2987" href="#L2987" id="L2987">
2987
</a>
<a class="file-line-num diff-line-num" data-line-number="2988" href="#L2988" id="L2988">
2988
</a>
<a class="file-line-num diff-line-num" data-line-number="2989" href="#L2989" id="L2989">
2989
</a>
<a class="file-line-num diff-line-num" data-line-number="2990" href="#L2990" id="L2990">
2990
</a>
<a class="file-line-num diff-line-num" data-line-number="2991" href="#L2991" id="L2991">
2991
</a>
<a class="file-line-num diff-line-num" data-line-number="2992" href="#L2992" id="L2992">
2992
</a>
<a class="file-line-num diff-line-num" data-line-number="2993" href="#L2993" id="L2993">
2993
</a>
<a class="file-line-num diff-line-num" data-line-number="2994" href="#L2994" id="L2994">
2994
</a>
<a class="file-line-num diff-line-num" data-line-number="2995" href="#L2995" id="L2995">
2995
</a>
<a class="file-line-num diff-line-num" data-line-number="2996" href="#L2996" id="L2996">
2996
</a>
<a class="file-line-num diff-line-num" data-line-number="2997" href="#L2997" id="L2997">
2997
</a>
<a class="file-line-num diff-line-num" data-line-number="2998" href="#L2998" id="L2998">
2998
</a>
<a class="file-line-num diff-line-num" data-line-number="2999" href="#L2999" id="L2999">
2999
</a>
<a class="file-line-num diff-line-num" data-line-number="3000" href="#L3000" id="L3000">
3000
</a>
<a class="file-line-num diff-line-num" data-line-number="3001" href="#L3001" id="L3001">
3001
</a>
<a class="file-line-num diff-line-num" data-line-number="3002" href="#L3002" id="L3002">
3002
</a>
<a class="file-line-num diff-line-num" data-line-number="3003" href="#L3003" id="L3003">
3003
</a>
<a class="file-line-num diff-line-num" data-line-number="3004" href="#L3004" id="L3004">
3004
</a>
<a class="file-line-num diff-line-num" data-line-number="3005" href="#L3005" id="L3005">
3005
</a>
<a class="file-line-num diff-line-num" data-line-number="3006" href="#L3006" id="L3006">
3006
</a>
<a class="file-line-num diff-line-num" data-line-number="3007" href="#L3007" id="L3007">
3007
</a>
<a class="file-line-num diff-line-num" data-line-number="3008" href="#L3008" id="L3008">
3008
</a>
<a class="file-line-num diff-line-num" data-line-number="3009" href="#L3009" id="L3009">
3009
</a>
<a class="file-line-num diff-line-num" data-line-number="3010" href="#L3010" id="L3010">
3010
</a>
<a class="file-line-num diff-line-num" data-line-number="3011" href="#L3011" id="L3011">
3011
</a>
<a class="file-line-num diff-line-num" data-line-number="3012" href="#L3012" id="L3012">
3012
</a>
<a class="file-line-num diff-line-num" data-line-number="3013" href="#L3013" id="L3013">
3013
</a>
<a class="file-line-num diff-line-num" data-line-number="3014" href="#L3014" id="L3014">
3014
</a>
<a class="file-line-num diff-line-num" data-line-number="3015" href="#L3015" id="L3015">
3015
</a>
<a class="file-line-num diff-line-num" data-line-number="3016" href="#L3016" id="L3016">
3016
</a>
<a class="file-line-num diff-line-num" data-line-number="3017" href="#L3017" id="L3017">
3017
</a>
<a class="file-line-num diff-line-num" data-line-number="3018" href="#L3018" id="L3018">
3018
</a>
<a class="file-line-num diff-line-num" data-line-number="3019" href="#L3019" id="L3019">
3019
</a>
<a class="file-line-num diff-line-num" data-line-number="3020" href="#L3020" id="L3020">
3020
</a>
<a class="file-line-num diff-line-num" data-line-number="3021" href="#L3021" id="L3021">
3021
</a>
<a class="file-line-num diff-line-num" data-line-number="3022" href="#L3022" id="L3022">
3022
</a>
<a class="file-line-num diff-line-num" data-line-number="3023" href="#L3023" id="L3023">
3023
</a>
<a class="file-line-num diff-line-num" data-line-number="3024" href="#L3024" id="L3024">
3024
</a>
<a class="file-line-num diff-line-num" data-line-number="3025" href="#L3025" id="L3025">
3025
</a>
<a class="file-line-num diff-line-num" data-line-number="3026" href="#L3026" id="L3026">
3026
</a>
<a class="file-line-num diff-line-num" data-line-number="3027" href="#L3027" id="L3027">
3027
</a>
<a class="file-line-num diff-line-num" data-line-number="3028" href="#L3028" id="L3028">
3028
</a>
<a class="file-line-num diff-line-num" data-line-number="3029" href="#L3029" id="L3029">
3029
</a>
<a class="file-line-num diff-line-num" data-line-number="3030" href="#L3030" id="L3030">
3030
</a>
<a class="file-line-num diff-line-num" data-line-number="3031" href="#L3031" id="L3031">
3031
</a>
<a class="file-line-num diff-line-num" data-line-number="3032" href="#L3032" id="L3032">
3032
</a>
<a class="file-line-num diff-line-num" data-line-number="3033" href="#L3033" id="L3033">
3033
</a>
<a class="file-line-num diff-line-num" data-line-number="3034" href="#L3034" id="L3034">
3034
</a>
<a class="file-line-num diff-line-num" data-line-number="3035" href="#L3035" id="L3035">
3035
</a>
<a class="file-line-num diff-line-num" data-line-number="3036" href="#L3036" id="L3036">
3036
</a>
<a class="file-line-num diff-line-num" data-line-number="3037" href="#L3037" id="L3037">
3037
</a>
<a class="file-line-num diff-line-num" data-line-number="3038" href="#L3038" id="L3038">
3038
</a>
<a class="file-line-num diff-line-num" data-line-number="3039" href="#L3039" id="L3039">
3039
</a>
<a class="file-line-num diff-line-num" data-line-number="3040" href="#L3040" id="L3040">
3040
</a>
<a class="file-line-num diff-line-num" data-line-number="3041" href="#L3041" id="L3041">
3041
</a>
<a class="file-line-num diff-line-num" data-line-number="3042" href="#L3042" id="L3042">
3042
</a>
<a class="file-line-num diff-line-num" data-line-number="3043" href="#L3043" id="L3043">
3043
</a>
<a class="file-line-num diff-line-num" data-line-number="3044" href="#L3044" id="L3044">
3044
</a>
<a class="file-line-num diff-line-num" data-line-number="3045" href="#L3045" id="L3045">
3045
</a>
<a class="file-line-num diff-line-num" data-line-number="3046" href="#L3046" id="L3046">
3046
</a>
<a class="file-line-num diff-line-num" data-line-number="3047" href="#L3047" id="L3047">
3047
</a>
<a class="file-line-num diff-line-num" data-line-number="3048" href="#L3048" id="L3048">
3048
</a>
<a class="file-line-num diff-line-num" data-line-number="3049" href="#L3049" id="L3049">
3049
</a>
<a class="file-line-num diff-line-num" data-line-number="3050" href="#L3050" id="L3050">
3050
</a>
<a class="file-line-num diff-line-num" data-line-number="3051" href="#L3051" id="L3051">
3051
</a>
<a class="file-line-num diff-line-num" data-line-number="3052" href="#L3052" id="L3052">
3052
</a>
<a class="file-line-num diff-line-num" data-line-number="3053" href="#L3053" id="L3053">
3053
</a>
<a class="file-line-num diff-line-num" data-line-number="3054" href="#L3054" id="L3054">
3054
</a>
<a class="file-line-num diff-line-num" data-line-number="3055" href="#L3055" id="L3055">
3055
</a>
<a class="file-line-num diff-line-num" data-line-number="3056" href="#L3056" id="L3056">
3056
</a>
<a class="file-line-num diff-line-num" data-line-number="3057" href="#L3057" id="L3057">
3057
</a>
<a class="file-line-num diff-line-num" data-line-number="3058" href="#L3058" id="L3058">
3058
</a>
<a class="file-line-num diff-line-num" data-line-number="3059" href="#L3059" id="L3059">
3059
</a>
<a class="file-line-num diff-line-num" data-line-number="3060" href="#L3060" id="L3060">
3060
</a>
<a class="file-line-num diff-line-num" data-line-number="3061" href="#L3061" id="L3061">
3061
</a>
<a class="file-line-num diff-line-num" data-line-number="3062" href="#L3062" id="L3062">
3062
</a>
<a class="file-line-num diff-line-num" data-line-number="3063" href="#L3063" id="L3063">
3063
</a>
<a class="file-line-num diff-line-num" data-line-number="3064" href="#L3064" id="L3064">
3064
</a>
<a class="file-line-num diff-line-num" data-line-number="3065" href="#L3065" id="L3065">
3065
</a>
<a class="file-line-num diff-line-num" data-line-number="3066" href="#L3066" id="L3066">
3066
</a>
<a class="file-line-num diff-line-num" data-line-number="3067" href="#L3067" id="L3067">
3067
</a>
<a class="file-line-num diff-line-num" data-line-number="3068" href="#L3068" id="L3068">
3068
</a>
<a class="file-line-num diff-line-num" data-line-number="3069" href="#L3069" id="L3069">
3069
</a>
<a class="file-line-num diff-line-num" data-line-number="3070" href="#L3070" id="L3070">
3070
</a>
<a class="file-line-num diff-line-num" data-line-number="3071" href="#L3071" id="L3071">
3071
</a>
<a class="file-line-num diff-line-num" data-line-number="3072" href="#L3072" id="L3072">
3072
</a>
<a class="file-line-num diff-line-num" data-line-number="3073" href="#L3073" id="L3073">
3073
</a>
<a class="file-line-num diff-line-num" data-line-number="3074" href="#L3074" id="L3074">
3074
</a>
<a class="file-line-num diff-line-num" data-line-number="3075" href="#L3075" id="L3075">
3075
</a>
<a class="file-line-num diff-line-num" data-line-number="3076" href="#L3076" id="L3076">
3076
</a>
<a class="file-line-num diff-line-num" data-line-number="3077" href="#L3077" id="L3077">
3077
</a>
<a class="file-line-num diff-line-num" data-line-number="3078" href="#L3078" id="L3078">
3078
</a>
<a class="file-line-num diff-line-num" data-line-number="3079" href="#L3079" id="L3079">
3079
</a>
<a class="file-line-num diff-line-num" data-line-number="3080" href="#L3080" id="L3080">
3080
</a>
<a class="file-line-num diff-line-num" data-line-number="3081" href="#L3081" id="L3081">
3081
</a>
<a class="file-line-num diff-line-num" data-line-number="3082" href="#L3082" id="L3082">
3082
</a>
<a class="file-line-num diff-line-num" data-line-number="3083" href="#L3083" id="L3083">
3083
</a>
<a class="file-line-num diff-line-num" data-line-number="3084" href="#L3084" id="L3084">
3084
</a>
<a class="file-line-num diff-line-num" data-line-number="3085" href="#L3085" id="L3085">
3085
</a>
<a class="file-line-num diff-line-num" data-line-number="3086" href="#L3086" id="L3086">
3086
</a>
<a class="file-line-num diff-line-num" data-line-number="3087" href="#L3087" id="L3087">
3087
</a>
<a class="file-line-num diff-line-num" data-line-number="3088" href="#L3088" id="L3088">
3088
</a>
<a class="file-line-num diff-line-num" data-line-number="3089" href="#L3089" id="L3089">
3089
</a>
<a class="file-line-num diff-line-num" data-line-number="3090" href="#L3090" id="L3090">
3090
</a>
<a class="file-line-num diff-line-num" data-line-number="3091" href="#L3091" id="L3091">
3091
</a>
<a class="file-line-num diff-line-num" data-line-number="3092" href="#L3092" id="L3092">
3092
</a>
<a class="file-line-num diff-line-num" data-line-number="3093" href="#L3093" id="L3093">
3093
</a>
<a class="file-line-num diff-line-num" data-line-number="3094" href="#L3094" id="L3094">
3094
</a>
<a class="file-line-num diff-line-num" data-line-number="3095" href="#L3095" id="L3095">
3095
</a>
<a class="file-line-num diff-line-num" data-line-number="3096" href="#L3096" id="L3096">
3096
</a>
<a class="file-line-num diff-line-num" data-line-number="3097" href="#L3097" id="L3097">
3097
</a>
<a class="file-line-num diff-line-num" data-line-number="3098" href="#L3098" id="L3098">
3098
</a>
<a class="file-line-num diff-line-num" data-line-number="3099" href="#L3099" id="L3099">
3099
</a>
<a class="file-line-num diff-line-num" data-line-number="3100" href="#L3100" id="L3100">
3100
</a>
<a class="file-line-num diff-line-num" data-line-number="3101" href="#L3101" id="L3101">
3101
</a>
<a class="file-line-num diff-line-num" data-line-number="3102" href="#L3102" id="L3102">
3102
</a>
<a class="file-line-num diff-line-num" data-line-number="3103" href="#L3103" id="L3103">
3103
</a>
<a class="file-line-num diff-line-num" data-line-number="3104" href="#L3104" id="L3104">
3104
</a>
<a class="file-line-num diff-line-num" data-line-number="3105" href="#L3105" id="L3105">
3105
</a>
<a class="file-line-num diff-line-num" data-line-number="3106" href="#L3106" id="L3106">
3106
</a>
<a class="file-line-num diff-line-num" data-line-number="3107" href="#L3107" id="L3107">
3107
</a>
<a class="file-line-num diff-line-num" data-line-number="3108" href="#L3108" id="L3108">
3108
</a>
<a class="file-line-num diff-line-num" data-line-number="3109" href="#L3109" id="L3109">
3109
</a>
<a class="file-line-num diff-line-num" data-line-number="3110" href="#L3110" id="L3110">
3110
</a>
<a class="file-line-num diff-line-num" data-line-number="3111" href="#L3111" id="L3111">
3111
</a>
<a class="file-line-num diff-line-num" data-line-number="3112" href="#L3112" id="L3112">
3112
</a>
<a class="file-line-num diff-line-num" data-line-number="3113" href="#L3113" id="L3113">
3113
</a>
<a class="file-line-num diff-line-num" data-line-number="3114" href="#L3114" id="L3114">
3114
</a>
<a class="file-line-num diff-line-num" data-line-number="3115" href="#L3115" id="L3115">
3115
</a>
<a class="file-line-num diff-line-num" data-line-number="3116" href="#L3116" id="L3116">
3116
</a>
<a class="file-line-num diff-line-num" data-line-number="3117" href="#L3117" id="L3117">
3117
</a>
<a class="file-line-num diff-line-num" data-line-number="3118" href="#L3118" id="L3118">
3118
</a>
<a class="file-line-num diff-line-num" data-line-number="3119" href="#L3119" id="L3119">
3119
</a>
<a class="file-line-num diff-line-num" data-line-number="3120" href="#L3120" id="L3120">
3120
</a>
<a class="file-line-num diff-line-num" data-line-number="3121" href="#L3121" id="L3121">
3121
</a>
<a class="file-line-num diff-line-num" data-line-number="3122" href="#L3122" id="L3122">
3122
</a>
<a class="file-line-num diff-line-num" data-line-number="3123" href="#L3123" id="L3123">
3123
</a>
<a class="file-line-num diff-line-num" data-line-number="3124" href="#L3124" id="L3124">
3124
</a>
<a class="file-line-num diff-line-num" data-line-number="3125" href="#L3125" id="L3125">
3125
</a>
<a class="file-line-num diff-line-num" data-line-number="3126" href="#L3126" id="L3126">
3126
</a>
<a class="file-line-num diff-line-num" data-line-number="3127" href="#L3127" id="L3127">
3127
</a>
<a class="file-line-num diff-line-num" data-line-number="3128" href="#L3128" id="L3128">
3128
</a>
<a class="file-line-num diff-line-num" data-line-number="3129" href="#L3129" id="L3129">
3129
</a>
<a class="file-line-num diff-line-num" data-line-number="3130" href="#L3130" id="L3130">
3130
</a>
<a class="file-line-num diff-line-num" data-line-number="3131" href="#L3131" id="L3131">
3131
</a>
<a class="file-line-num diff-line-num" data-line-number="3132" href="#L3132" id="L3132">
3132
</a>
<a class="file-line-num diff-line-num" data-line-number="3133" href="#L3133" id="L3133">
3133
</a>
<a class="file-line-num diff-line-num" data-line-number="3134" href="#L3134" id="L3134">
3134
</a>
<a class="file-line-num diff-line-num" data-line-number="3135" href="#L3135" id="L3135">
3135
</a>
<a class="file-line-num diff-line-num" data-line-number="3136" href="#L3136" id="L3136">
3136
</a>
<a class="file-line-num diff-line-num" data-line-number="3137" href="#L3137" id="L3137">
3137
</a>
<a class="file-line-num diff-line-num" data-line-number="3138" href="#L3138" id="L3138">
3138
</a>
<a class="file-line-num diff-line-num" data-line-number="3139" href="#L3139" id="L3139">
3139
</a>
<a class="file-line-num diff-line-num" data-line-number="3140" href="#L3140" id="L3140">
3140
</a>
<a class="file-line-num diff-line-num" data-line-number="3141" href="#L3141" id="L3141">
3141
</a>
<a class="file-line-num diff-line-num" data-line-number="3142" href="#L3142" id="L3142">
3142
</a>
<a class="file-line-num diff-line-num" data-line-number="3143" href="#L3143" id="L3143">
3143
</a>
<a class="file-line-num diff-line-num" data-line-number="3144" href="#L3144" id="L3144">
3144
</a>
<a class="file-line-num diff-line-num" data-line-number="3145" href="#L3145" id="L3145">
3145
</a>
<a class="file-line-num diff-line-num" data-line-number="3146" href="#L3146" id="L3146">
3146
</a>
<a class="file-line-num diff-line-num" data-line-number="3147" href="#L3147" id="L3147">
3147
</a>
<a class="file-line-num diff-line-num" data-line-number="3148" href="#L3148" id="L3148">
3148
</a>
<a class="file-line-num diff-line-num" data-line-number="3149" href="#L3149" id="L3149">
3149
</a>
<a class="file-line-num diff-line-num" data-line-number="3150" href="#L3150" id="L3150">
3150
</a>
<a class="file-line-num diff-line-num" data-line-number="3151" href="#L3151" id="L3151">
3151
</a>
<a class="file-line-num diff-line-num" data-line-number="3152" href="#L3152" id="L3152">
3152
</a>
<a class="file-line-num diff-line-num" data-line-number="3153" href="#L3153" id="L3153">
3153
</a>
<a class="file-line-num diff-line-num" data-line-number="3154" href="#L3154" id="L3154">
3154
</a>
<a class="file-line-num diff-line-num" data-line-number="3155" href="#L3155" id="L3155">
3155
</a>
<a class="file-line-num diff-line-num" data-line-number="3156" href="#L3156" id="L3156">
3156
</a>
<a class="file-line-num diff-line-num" data-line-number="3157" href="#L3157" id="L3157">
3157
</a>
<a class="file-line-num diff-line-num" data-line-number="3158" href="#L3158" id="L3158">
3158
</a>
<a class="file-line-num diff-line-num" data-line-number="3159" href="#L3159" id="L3159">
3159
</a>
<a class="file-line-num diff-line-num" data-line-number="3160" href="#L3160" id="L3160">
3160
</a>
<a class="file-line-num diff-line-num" data-line-number="3161" href="#L3161" id="L3161">
3161
</a>
<a class="file-line-num diff-line-num" data-line-number="3162" href="#L3162" id="L3162">
3162
</a>
<a class="file-line-num diff-line-num" data-line-number="3163" href="#L3163" id="L3163">
3163
</a>
<a class="file-line-num diff-line-num" data-line-number="3164" href="#L3164" id="L3164">
3164
</a>
<a class="file-line-num diff-line-num" data-line-number="3165" href="#L3165" id="L3165">
3165
</a>
<a class="file-line-num diff-line-num" data-line-number="3166" href="#L3166" id="L3166">
3166
</a>
<a class="file-line-num diff-line-num" data-line-number="3167" href="#L3167" id="L3167">
3167
</a>
<a class="file-line-num diff-line-num" data-line-number="3168" href="#L3168" id="L3168">
3168
</a>
<a class="file-line-num diff-line-num" data-line-number="3169" href="#L3169" id="L3169">
3169
</a>
<a class="file-line-num diff-line-num" data-line-number="3170" href="#L3170" id="L3170">
3170
</a>
<a class="file-line-num diff-line-num" data-line-number="3171" href="#L3171" id="L3171">
3171
</a>
<a class="file-line-num diff-line-num" data-line-number="3172" href="#L3172" id="L3172">
3172
</a>
<a class="file-line-num diff-line-num" data-line-number="3173" href="#L3173" id="L3173">
3173
</a>
<a class="file-line-num diff-line-num" data-line-number="3174" href="#L3174" id="L3174">
3174
</a>
<a class="file-line-num diff-line-num" data-line-number="3175" href="#L3175" id="L3175">
3175
</a>
<a class="file-line-num diff-line-num" data-line-number="3176" href="#L3176" id="L3176">
3176
</a>
<a class="file-line-num diff-line-num" data-line-number="3177" href="#L3177" id="L3177">
3177
</a>
<a class="file-line-num diff-line-num" data-line-number="3178" href="#L3178" id="L3178">
3178
</a>
<a class="file-line-num diff-line-num" data-line-number="3179" href="#L3179" id="L3179">
3179
</a>
<a class="file-line-num diff-line-num" data-line-number="3180" href="#L3180" id="L3180">
3180
</a>
<a class="file-line-num diff-line-num" data-line-number="3181" href="#L3181" id="L3181">
3181
</a>
<a class="file-line-num diff-line-num" data-line-number="3182" href="#L3182" id="L3182">
3182
</a>
<a class="file-line-num diff-line-num" data-line-number="3183" href="#L3183" id="L3183">
3183
</a>
<a class="file-line-num diff-line-num" data-line-number="3184" href="#L3184" id="L3184">
3184
</a>
<a class="file-line-num diff-line-num" data-line-number="3185" href="#L3185" id="L3185">
3185
</a>
<a class="file-line-num diff-line-num" data-line-number="3186" href="#L3186" id="L3186">
3186
</a>
<a class="file-line-num diff-line-num" data-line-number="3187" href="#L3187" id="L3187">
3187
</a>
<a class="file-line-num diff-line-num" data-line-number="3188" href="#L3188" id="L3188">
3188
</a>
<a class="file-line-num diff-line-num" data-line-number="3189" href="#L3189" id="L3189">
3189
</a>
<a class="file-line-num diff-line-num" data-line-number="3190" href="#L3190" id="L3190">
3190
</a>
<a class="file-line-num diff-line-num" data-line-number="3191" href="#L3191" id="L3191">
3191
</a>
<a class="file-line-num diff-line-num" data-line-number="3192" href="#L3192" id="L3192">
3192
</a>
<a class="file-line-num diff-line-num" data-line-number="3193" href="#L3193" id="L3193">
3193
</a>
<a class="file-line-num diff-line-num" data-line-number="3194" href="#L3194" id="L3194">
3194
</a>
<a class="file-line-num diff-line-num" data-line-number="3195" href="#L3195" id="L3195">
3195
</a>
<a class="file-line-num diff-line-num" data-line-number="3196" href="#L3196" id="L3196">
3196
</a>
<a class="file-line-num diff-line-num" data-line-number="3197" href="#L3197" id="L3197">
3197
</a>
<a class="file-line-num diff-line-num" data-line-number="3198" href="#L3198" id="L3198">
3198
</a>
<a class="file-line-num diff-line-num" data-line-number="3199" href="#L3199" id="L3199">
3199
</a>
<a class="file-line-num diff-line-num" data-line-number="3200" href="#L3200" id="L3200">
3200
</a>
<a class="file-line-num diff-line-num" data-line-number="3201" href="#L3201" id="L3201">
3201
</a>
<a class="file-line-num diff-line-num" data-line-number="3202" href="#L3202" id="L3202">
3202
</a>
<a class="file-line-num diff-line-num" data-line-number="3203" href="#L3203" id="L3203">
3203
</a>
<a class="file-line-num diff-line-num" data-line-number="3204" href="#L3204" id="L3204">
3204
</a>
<a class="file-line-num diff-line-num" data-line-number="3205" href="#L3205" id="L3205">
3205
</a>
<a class="file-line-num diff-line-num" data-line-number="3206" href="#L3206" id="L3206">
3206
</a>
<a class="file-line-num diff-line-num" data-line-number="3207" href="#L3207" id="L3207">
3207
</a>
<a class="file-line-num diff-line-num" data-line-number="3208" href="#L3208" id="L3208">
3208
</a>
<a class="file-line-num diff-line-num" data-line-number="3209" href="#L3209" id="L3209">
3209
</a>
<a class="file-line-num diff-line-num" data-line-number="3210" href="#L3210" id="L3210">
3210
</a>
<a class="file-line-num diff-line-num" data-line-number="3211" href="#L3211" id="L3211">
3211
</a>
<a class="file-line-num diff-line-num" data-line-number="3212" href="#L3212" id="L3212">
3212
</a>
<a class="file-line-num diff-line-num" data-line-number="3213" href="#L3213" id="L3213">
3213
</a>
<a class="file-line-num diff-line-num" data-line-number="3214" href="#L3214" id="L3214">
3214
</a>
<a class="file-line-num diff-line-num" data-line-number="3215" href="#L3215" id="L3215">
3215
</a>
<a class="file-line-num diff-line-num" data-line-number="3216" href="#L3216" id="L3216">
3216
</a>
<a class="file-line-num diff-line-num" data-line-number="3217" href="#L3217" id="L3217">
3217
</a>
<a class="file-line-num diff-line-num" data-line-number="3218" href="#L3218" id="L3218">
3218
</a>
<a class="file-line-num diff-line-num" data-line-number="3219" href="#L3219" id="L3219">
3219
</a>
<a class="file-line-num diff-line-num" data-line-number="3220" href="#L3220" id="L3220">
3220
</a>
<a class="file-line-num diff-line-num" data-line-number="3221" href="#L3221" id="L3221">
3221
</a>
<a class="file-line-num diff-line-num" data-line-number="3222" href="#L3222" id="L3222">
3222
</a>
<a class="file-line-num diff-line-num" data-line-number="3223" href="#L3223" id="L3223">
3223
</a>
<a class="file-line-num diff-line-num" data-line-number="3224" href="#L3224" id="L3224">
3224
</a>
<a class="file-line-num diff-line-num" data-line-number="3225" href="#L3225" id="L3225">
3225
</a>
<a class="file-line-num diff-line-num" data-line-number="3226" href="#L3226" id="L3226">
3226
</a>
<a class="file-line-num diff-line-num" data-line-number="3227" href="#L3227" id="L3227">
3227
</a>
<a class="file-line-num diff-line-num" data-line-number="3228" href="#L3228" id="L3228">
3228
</a>
<a class="file-line-num diff-line-num" data-line-number="3229" href="#L3229" id="L3229">
3229
</a>
<a class="file-line-num diff-line-num" data-line-number="3230" href="#L3230" id="L3230">
3230
</a>
<a class="file-line-num diff-line-num" data-line-number="3231" href="#L3231" id="L3231">
3231
</a>
<a class="file-line-num diff-line-num" data-line-number="3232" href="#L3232" id="L3232">
3232
</a>
<a class="file-line-num diff-line-num" data-line-number="3233" href="#L3233" id="L3233">
3233
</a>
<a class="file-line-num diff-line-num" data-line-number="3234" href="#L3234" id="L3234">
3234
</a>
<a class="file-line-num diff-line-num" data-line-number="3235" href="#L3235" id="L3235">
3235
</a>
<a class="file-line-num diff-line-num" data-line-number="3236" href="#L3236" id="L3236">
3236
</a>
<a class="file-line-num diff-line-num" data-line-number="3237" href="#L3237" id="L3237">
3237
</a>
<a class="file-line-num diff-line-num" data-line-number="3238" href="#L3238" id="L3238">
3238
</a>
<a class="file-line-num diff-line-num" data-line-number="3239" href="#L3239" id="L3239">
3239
</a>
<a class="file-line-num diff-line-num" data-line-number="3240" href="#L3240" id="L3240">
3240
</a>
<a class="file-line-num diff-line-num" data-line-number="3241" href="#L3241" id="L3241">
3241
</a>
<a class="file-line-num diff-line-num" data-line-number="3242" href="#L3242" id="L3242">
3242
</a>
<a class="file-line-num diff-line-num" data-line-number="3243" href="#L3243" id="L3243">
3243
</a>
<a class="file-line-num diff-line-num" data-line-number="3244" href="#L3244" id="L3244">
3244
</a>
<a class="file-line-num diff-line-num" data-line-number="3245" href="#L3245" id="L3245">
3245
</a>
<a class="file-line-num diff-line-num" data-line-number="3246" href="#L3246" id="L3246">
3246
</a>
<a class="file-line-num diff-line-num" data-line-number="3247" href="#L3247" id="L3247">
3247
</a>
<a class="file-line-num diff-line-num" data-line-number="3248" href="#L3248" id="L3248">
3248
</a>
<a class="file-line-num diff-line-num" data-line-number="3249" href="#L3249" id="L3249">
3249
</a>
<a class="file-line-num diff-line-num" data-line-number="3250" href="#L3250" id="L3250">
3250
</a>
<a class="file-line-num diff-line-num" data-line-number="3251" href="#L3251" id="L3251">
3251
</a>
<a class="file-line-num diff-line-num" data-line-number="3252" href="#L3252" id="L3252">
3252
</a>
<a class="file-line-num diff-line-num" data-line-number="3253" href="#L3253" id="L3253">
3253
</a>
<a class="file-line-num diff-line-num" data-line-number="3254" href="#L3254" id="L3254">
3254
</a>
<a class="file-line-num diff-line-num" data-line-number="3255" href="#L3255" id="L3255">
3255
</a>
<a class="file-line-num diff-line-num" data-line-number="3256" href="#L3256" id="L3256">
3256
</a>
<a class="file-line-num diff-line-num" data-line-number="3257" href="#L3257" id="L3257">
3257
</a>
<a class="file-line-num diff-line-num" data-line-number="3258" href="#L3258" id="L3258">
3258
</a>
<a class="file-line-num diff-line-num" data-line-number="3259" href="#L3259" id="L3259">
3259
</a>
<a class="file-line-num diff-line-num" data-line-number="3260" href="#L3260" id="L3260">
3260
</a>
<a class="file-line-num diff-line-num" data-line-number="3261" href="#L3261" id="L3261">
3261
</a>
<a class="file-line-num diff-line-num" data-line-number="3262" href="#L3262" id="L3262">
3262
</a>
<a class="file-line-num diff-line-num" data-line-number="3263" href="#L3263" id="L3263">
3263
</a>
<a class="file-line-num diff-line-num" data-line-number="3264" href="#L3264" id="L3264">
3264
</a>
<a class="file-line-num diff-line-num" data-line-number="3265" href="#L3265" id="L3265">
3265
</a>
<a class="file-line-num diff-line-num" data-line-number="3266" href="#L3266" id="L3266">
3266
</a>
<a class="file-line-num diff-line-num" data-line-number="3267" href="#L3267" id="L3267">
3267
</a>
<a class="file-line-num diff-line-num" data-line-number="3268" href="#L3268" id="L3268">
3268
</a>
<a class="file-line-num diff-line-num" data-line-number="3269" href="#L3269" id="L3269">
3269
</a>
<a class="file-line-num diff-line-num" data-line-number="3270" href="#L3270" id="L3270">
3270
</a>
<a class="file-line-num diff-line-num" data-line-number="3271" href="#L3271" id="L3271">
3271
</a>
<a class="file-line-num diff-line-num" data-line-number="3272" href="#L3272" id="L3272">
3272
</a>
<a class="file-line-num diff-line-num" data-line-number="3273" href="#L3273" id="L3273">
3273
</a>
<a class="file-line-num diff-line-num" data-line-number="3274" href="#L3274" id="L3274">
3274
</a>
<a class="file-line-num diff-line-num" data-line-number="3275" href="#L3275" id="L3275">
3275
</a>
<a class="file-line-num diff-line-num" data-line-number="3276" href="#L3276" id="L3276">
3276
</a>
<a class="file-line-num diff-line-num" data-line-number="3277" href="#L3277" id="L3277">
3277
</a>
<a class="file-line-num diff-line-num" data-line-number="3278" href="#L3278" id="L3278">
3278
</a>
<a class="file-line-num diff-line-num" data-line-number="3279" href="#L3279" id="L3279">
3279
</a>
<a class="file-line-num diff-line-num" data-line-number="3280" href="#L3280" id="L3280">
3280
</a>
<a class="file-line-num diff-line-num" data-line-number="3281" href="#L3281" id="L3281">
3281
</a>
<a class="file-line-num diff-line-num" data-line-number="3282" href="#L3282" id="L3282">
3282
</a>
<a class="file-line-num diff-line-num" data-line-number="3283" href="#L3283" id="L3283">
3283
</a>
<a class="file-line-num diff-line-num" data-line-number="3284" href="#L3284" id="L3284">
3284
</a>
<a class="file-line-num diff-line-num" data-line-number="3285" href="#L3285" id="L3285">
3285
</a>
<a class="file-line-num diff-line-num" data-line-number="3286" href="#L3286" id="L3286">
3286
</a>
<a class="file-line-num diff-line-num" data-line-number="3287" href="#L3287" id="L3287">
3287
</a>
<a class="file-line-num diff-line-num" data-line-number="3288" href="#L3288" id="L3288">
3288
</a>
<a class="file-line-num diff-line-num" data-line-number="3289" href="#L3289" id="L3289">
3289
</a>
<a class="file-line-num diff-line-num" data-line-number="3290" href="#L3290" id="L3290">
3290
</a>
<a class="file-line-num diff-line-num" data-line-number="3291" href="#L3291" id="L3291">
3291
</a>
<a class="file-line-num diff-line-num" data-line-number="3292" href="#L3292" id="L3292">
3292
</a>
<a class="file-line-num diff-line-num" data-line-number="3293" href="#L3293" id="L3293">
3293
</a>
<a class="file-line-num diff-line-num" data-line-number="3294" href="#L3294" id="L3294">
3294
</a>
<a class="file-line-num diff-line-num" data-line-number="3295" href="#L3295" id="L3295">
3295
</a>
<a class="file-line-num diff-line-num" data-line-number="3296" href="#L3296" id="L3296">
3296
</a>
<a class="file-line-num diff-line-num" data-line-number="3297" href="#L3297" id="L3297">
3297
</a>
<a class="file-line-num diff-line-num" data-line-number="3298" href="#L3298" id="L3298">
3298
</a>
<a class="file-line-num diff-line-num" data-line-number="3299" href="#L3299" id="L3299">
3299
</a>
<a class="file-line-num diff-line-num" data-line-number="3300" href="#L3300" id="L3300">
3300
</a>
<a class="file-line-num diff-line-num" data-line-number="3301" href="#L3301" id="L3301">
3301
</a>
<a class="file-line-num diff-line-num" data-line-number="3302" href="#L3302" id="L3302">
3302
</a>
<a class="file-line-num diff-line-num" data-line-number="3303" href="#L3303" id="L3303">
3303
</a>
<a class="file-line-num diff-line-num" data-line-number="3304" href="#L3304" id="L3304">
3304
</a>
<a class="file-line-num diff-line-num" data-line-number="3305" href="#L3305" id="L3305">
3305
</a>
<a class="file-line-num diff-line-num" data-line-number="3306" href="#L3306" id="L3306">
3306
</a>
<a class="file-line-num diff-line-num" data-line-number="3307" href="#L3307" id="L3307">
3307
</a>
<a class="file-line-num diff-line-num" data-line-number="3308" href="#L3308" id="L3308">
3308
</a>
<a class="file-line-num diff-line-num" data-line-number="3309" href="#L3309" id="L3309">
3309
</a>
<a class="file-line-num diff-line-num" data-line-number="3310" href="#L3310" id="L3310">
3310
</a>
<a class="file-line-num diff-line-num" data-line-number="3311" href="#L3311" id="L3311">
3311
</a>
<a class="file-line-num diff-line-num" data-line-number="3312" href="#L3312" id="L3312">
3312
</a>
<a class="file-line-num diff-line-num" data-line-number="3313" href="#L3313" id="L3313">
3313
</a>
<a class="file-line-num diff-line-num" data-line-number="3314" href="#L3314" id="L3314">
3314
</a>
<a class="file-line-num diff-line-num" data-line-number="3315" href="#L3315" id="L3315">
3315
</a>
<a class="file-line-num diff-line-num" data-line-number="3316" href="#L3316" id="L3316">
3316
</a>
<a class="file-line-num diff-line-num" data-line-number="3317" href="#L3317" id="L3317">
3317
</a>
<a class="file-line-num diff-line-num" data-line-number="3318" href="#L3318" id="L3318">
3318
</a>
<a class="file-line-num diff-line-num" data-line-number="3319" href="#L3319" id="L3319">
3319
</a>
<a class="file-line-num diff-line-num" data-line-number="3320" href="#L3320" id="L3320">
3320
</a>
<a class="file-line-num diff-line-num" data-line-number="3321" href="#L3321" id="L3321">
3321
</a>
<a class="file-line-num diff-line-num" data-line-number="3322" href="#L3322" id="L3322">
3322
</a>
<a class="file-line-num diff-line-num" data-line-number="3323" href="#L3323" id="L3323">
3323
</a>
<a class="file-line-num diff-line-num" data-line-number="3324" href="#L3324" id="L3324">
3324
</a>
<a class="file-line-num diff-line-num" data-line-number="3325" href="#L3325" id="L3325">
3325
</a>
<a class="file-line-num diff-line-num" data-line-number="3326" href="#L3326" id="L3326">
3326
</a>
<a class="file-line-num diff-line-num" data-line-number="3327" href="#L3327" id="L3327">
3327
</a>
<a class="file-line-num diff-line-num" data-line-number="3328" href="#L3328" id="L3328">
3328
</a>
<a class="file-line-num diff-line-num" data-line-number="3329" href="#L3329" id="L3329">
3329
</a>
<a class="file-line-num diff-line-num" data-line-number="3330" href="#L3330" id="L3330">
3330
</a>
<a class="file-line-num diff-line-num" data-line-number="3331" href="#L3331" id="L3331">
3331
</a>
<a class="file-line-num diff-line-num" data-line-number="3332" href="#L3332" id="L3332">
3332
</a>
<a class="file-line-num diff-line-num" data-line-number="3333" href="#L3333" id="L3333">
3333
</a>
<a class="file-line-num diff-line-num" data-line-number="3334" href="#L3334" id="L3334">
3334
</a>
<a class="file-line-num diff-line-num" data-line-number="3335" href="#L3335" id="L3335">
3335
</a>
<a class="file-line-num diff-line-num" data-line-number="3336" href="#L3336" id="L3336">
3336
</a>
<a class="file-line-num diff-line-num" data-line-number="3337" href="#L3337" id="L3337">
3337
</a>
<a class="file-line-num diff-line-num" data-line-number="3338" href="#L3338" id="L3338">
3338
</a>
<a class="file-line-num diff-line-num" data-line-number="3339" href="#L3339" id="L3339">
3339
</a>
<a class="file-line-num diff-line-num" data-line-number="3340" href="#L3340" id="L3340">
3340
</a>
<a class="file-line-num diff-line-num" data-line-number="3341" href="#L3341" id="L3341">
3341
</a>
<a class="file-line-num diff-line-num" data-line-number="3342" href="#L3342" id="L3342">
3342
</a>
<a class="file-line-num diff-line-num" data-line-number="3343" href="#L3343" id="L3343">
3343
</a>
<a class="file-line-num diff-line-num" data-line-number="3344" href="#L3344" id="L3344">
3344
</a>
<a class="file-line-num diff-line-num" data-line-number="3345" href="#L3345" id="L3345">
3345
</a>
<a class="file-line-num diff-line-num" data-line-number="3346" href="#L3346" id="L3346">
3346
</a>
<a class="file-line-num diff-line-num" data-line-number="3347" href="#L3347" id="L3347">
3347
</a>
<a class="file-line-num diff-line-num" data-line-number="3348" href="#L3348" id="L3348">
3348
</a>
<a class="file-line-num diff-line-num" data-line-number="3349" href="#L3349" id="L3349">
3349
</a>
<a class="file-line-num diff-line-num" data-line-number="3350" href="#L3350" id="L3350">
3350
</a>
<a class="file-line-num diff-line-num" data-line-number="3351" href="#L3351" id="L3351">
3351
</a>
<a class="file-line-num diff-line-num" data-line-number="3352" href="#L3352" id="L3352">
3352
</a>
<a class="file-line-num diff-line-num" data-line-number="3353" href="#L3353" id="L3353">
3353
</a>
<a class="file-line-num diff-line-num" data-line-number="3354" href="#L3354" id="L3354">
3354
</a>
<a class="file-line-num diff-line-num" data-line-number="3355" href="#L3355" id="L3355">
3355
</a>
<a class="file-line-num diff-line-num" data-line-number="3356" href="#L3356" id="L3356">
3356
</a>
<a class="file-line-num diff-line-num" data-line-number="3357" href="#L3357" id="L3357">
3357
</a>
<a class="file-line-num diff-line-num" data-line-number="3358" href="#L3358" id="L3358">
3358
</a>
<a class="file-line-num diff-line-num" data-line-number="3359" href="#L3359" id="L3359">
3359
</a>
<a class="file-line-num diff-line-num" data-line-number="3360" href="#L3360" id="L3360">
3360
</a>
<a class="file-line-num diff-line-num" data-line-number="3361" href="#L3361" id="L3361">
3361
</a>
<a class="file-line-num diff-line-num" data-line-number="3362" href="#L3362" id="L3362">
3362
</a>
<a class="file-line-num diff-line-num" data-line-number="3363" href="#L3363" id="L3363">
3363
</a>
<a class="file-line-num diff-line-num" data-line-number="3364" href="#L3364" id="L3364">
3364
</a>
<a class="file-line-num diff-line-num" data-line-number="3365" href="#L3365" id="L3365">
3365
</a>
<a class="file-line-num diff-line-num" data-line-number="3366" href="#L3366" id="L3366">
3366
</a>
<a class="file-line-num diff-line-num" data-line-number="3367" href="#L3367" id="L3367">
3367
</a>
<a class="file-line-num diff-line-num" data-line-number="3368" href="#L3368" id="L3368">
3368
</a>
<a class="file-line-num diff-line-num" data-line-number="3369" href="#L3369" id="L3369">
3369
</a>
<a class="file-line-num diff-line-num" data-line-number="3370" href="#L3370" id="L3370">
3370
</a>
<a class="file-line-num diff-line-num" data-line-number="3371" href="#L3371" id="L3371">
3371
</a>
<a class="file-line-num diff-line-num" data-line-number="3372" href="#L3372" id="L3372">
3372
</a>
<a class="file-line-num diff-line-num" data-line-number="3373" href="#L3373" id="L3373">
3373
</a>
<a class="file-line-num diff-line-num" data-line-number="3374" href="#L3374" id="L3374">
3374
</a>
<a class="file-line-num diff-line-num" data-line-number="3375" href="#L3375" id="L3375">
3375
</a>
<a class="file-line-num diff-line-num" data-line-number="3376" href="#L3376" id="L3376">
3376
</a>
<a class="file-line-num diff-line-num" data-line-number="3377" href="#L3377" id="L3377">
3377
</a>
<a class="file-line-num diff-line-num" data-line-number="3378" href="#L3378" id="L3378">
3378
</a>
<a class="file-line-num diff-line-num" data-line-number="3379" href="#L3379" id="L3379">
3379
</a>
<a class="file-line-num diff-line-num" data-line-number="3380" href="#L3380" id="L3380">
3380
</a>
<a class="file-line-num diff-line-num" data-line-number="3381" href="#L3381" id="L3381">
3381
</a>
<a class="file-line-num diff-line-num" data-line-number="3382" href="#L3382" id="L3382">
3382
</a>
<a class="file-line-num diff-line-num" data-line-number="3383" href="#L3383" id="L3383">
3383
</a>
<a class="file-line-num diff-line-num" data-line-number="3384" href="#L3384" id="L3384">
3384
</a>
<a class="file-line-num diff-line-num" data-line-number="3385" href="#L3385" id="L3385">
3385
</a>
<a class="file-line-num diff-line-num" data-line-number="3386" href="#L3386" id="L3386">
3386
</a>
<a class="file-line-num diff-line-num" data-line-number="3387" href="#L3387" id="L3387">
3387
</a>
<a class="file-line-num diff-line-num" data-line-number="3388" href="#L3388" id="L3388">
3388
</a>
<a class="file-line-num diff-line-num" data-line-number="3389" href="#L3389" id="L3389">
3389
</a>
<a class="file-line-num diff-line-num" data-line-number="3390" href="#L3390" id="L3390">
3390
</a>
<a class="file-line-num diff-line-num" data-line-number="3391" href="#L3391" id="L3391">
3391
</a>
<a class="file-line-num diff-line-num" data-line-number="3392" href="#L3392" id="L3392">
3392
</a>
<a class="file-line-num diff-line-num" data-line-number="3393" href="#L3393" id="L3393">
3393
</a>
<a class="file-line-num diff-line-num" data-line-number="3394" href="#L3394" id="L3394">
3394
</a>
<a class="file-line-num diff-line-num" data-line-number="3395" href="#L3395" id="L3395">
3395
</a>
<a class="file-line-num diff-line-num" data-line-number="3396" href="#L3396" id="L3396">
3396
</a>
<a class="file-line-num diff-line-num" data-line-number="3397" href="#L3397" id="L3397">
3397
</a>
<a class="file-line-num diff-line-num" data-line-number="3398" href="#L3398" id="L3398">
3398
</a>
<a class="file-line-num diff-line-num" data-line-number="3399" href="#L3399" id="L3399">
3399
</a>
<a class="file-line-num diff-line-num" data-line-number="3400" href="#L3400" id="L3400">
3400
</a>
<a class="file-line-num diff-line-num" data-line-number="3401" href="#L3401" id="L3401">
3401
</a>
<a class="file-line-num diff-line-num" data-line-number="3402" href="#L3402" id="L3402">
3402
</a>
<a class="file-line-num diff-line-num" data-line-number="3403" href="#L3403" id="L3403">
3403
</a>
<a class="file-line-num diff-line-num" data-line-number="3404" href="#L3404" id="L3404">
3404
</a>
<a class="file-line-num diff-line-num" data-line-number="3405" href="#L3405" id="L3405">
3405
</a>
<a class="file-line-num diff-line-num" data-line-number="3406" href="#L3406" id="L3406">
3406
</a>
<a class="file-line-num diff-line-num" data-line-number="3407" href="#L3407" id="L3407">
3407
</a>
<a class="file-line-num diff-line-num" data-line-number="3408" href="#L3408" id="L3408">
3408
</a>
<a class="file-line-num diff-line-num" data-line-number="3409" href="#L3409" id="L3409">
3409
</a>
<a class="file-line-num diff-line-num" data-line-number="3410" href="#L3410" id="L3410">
3410
</a>
<a class="file-line-num diff-line-num" data-line-number="3411" href="#L3411" id="L3411">
3411
</a>
<a class="file-line-num diff-line-num" data-line-number="3412" href="#L3412" id="L3412">
3412
</a>
<a class="file-line-num diff-line-num" data-line-number="3413" href="#L3413" id="L3413">
3413
</a>
<a class="file-line-num diff-line-num" data-line-number="3414" href="#L3414" id="L3414">
3414
</a>
<a class="file-line-num diff-line-num" data-line-number="3415" href="#L3415" id="L3415">
3415
</a>
<a class="file-line-num diff-line-num" data-line-number="3416" href="#L3416" id="L3416">
3416
</a>
<a class="file-line-num diff-line-num" data-line-number="3417" href="#L3417" id="L3417">
3417
</a>
<a class="file-line-num diff-line-num" data-line-number="3418" href="#L3418" id="L3418">
3418
</a>
<a class="file-line-num diff-line-num" data-line-number="3419" href="#L3419" id="L3419">
3419
</a>
<a class="file-line-num diff-line-num" data-line-number="3420" href="#L3420" id="L3420">
3420
</a>
<a class="file-line-num diff-line-num" data-line-number="3421" href="#L3421" id="L3421">
3421
</a>
<a class="file-line-num diff-line-num" data-line-number="3422" href="#L3422" id="L3422">
3422
</a>
<a class="file-line-num diff-line-num" data-line-number="3423" href="#L3423" id="L3423">
3423
</a>
<a class="file-line-num diff-line-num" data-line-number="3424" href="#L3424" id="L3424">
3424
</a>
<a class="file-line-num diff-line-num" data-line-number="3425" href="#L3425" id="L3425">
3425
</a>
<a class="file-line-num diff-line-num" data-line-number="3426" href="#L3426" id="L3426">
3426
</a>
<a class="file-line-num diff-line-num" data-line-number="3427" href="#L3427" id="L3427">
3427
</a>
<a class="file-line-num diff-line-num" data-line-number="3428" href="#L3428" id="L3428">
3428
</a>
<a class="file-line-num diff-line-num" data-line-number="3429" href="#L3429" id="L3429">
3429
</a>
<a class="file-line-num diff-line-num" data-line-number="3430" href="#L3430" id="L3430">
3430
</a>
<a class="file-line-num diff-line-num" data-line-number="3431" href="#L3431" id="L3431">
3431
</a>
<a class="file-line-num diff-line-num" data-line-number="3432" href="#L3432" id="L3432">
3432
</a>
<a class="file-line-num diff-line-num" data-line-number="3433" href="#L3433" id="L3433">
3433
</a>
<a class="file-line-num diff-line-num" data-line-number="3434" href="#L3434" id="L3434">
3434
</a>
<a class="file-line-num diff-line-num" data-line-number="3435" href="#L3435" id="L3435">
3435
</a>
<a class="file-line-num diff-line-num" data-line-number="3436" href="#L3436" id="L3436">
3436
</a>
<a class="file-line-num diff-line-num" data-line-number="3437" href="#L3437" id="L3437">
3437
</a>
<a class="file-line-num diff-line-num" data-line-number="3438" href="#L3438" id="L3438">
3438
</a>
<a class="file-line-num diff-line-num" data-line-number="3439" href="#L3439" id="L3439">
3439
</a>
<a class="file-line-num diff-line-num" data-line-number="3440" href="#L3440" id="L3440">
3440
</a>
<a class="file-line-num diff-line-num" data-line-number="3441" href="#L3441" id="L3441">
3441
</a>
<a class="file-line-num diff-line-num" data-line-number="3442" href="#L3442" id="L3442">
3442
</a>
<a class="file-line-num diff-line-num" data-line-number="3443" href="#L3443" id="L3443">
3443
</a>
<a class="file-line-num diff-line-num" data-line-number="3444" href="#L3444" id="L3444">
3444
</a>
<a class="file-line-num diff-line-num" data-line-number="3445" href="#L3445" id="L3445">
3445
</a>
<a class="file-line-num diff-line-num" data-line-number="3446" href="#L3446" id="L3446">
3446
</a>
<a class="file-line-num diff-line-num" data-line-number="3447" href="#L3447" id="L3447">
3447
</a>
<a class="file-line-num diff-line-num" data-line-number="3448" href="#L3448" id="L3448">
3448
</a>
<a class="file-line-num diff-line-num" data-line-number="3449" href="#L3449" id="L3449">
3449
</a>
<a class="file-line-num diff-line-num" data-line-number="3450" href="#L3450" id="L3450">
3450
</a>
<a class="file-line-num diff-line-num" data-line-number="3451" href="#L3451" id="L3451">
3451
</a>
<a class="file-line-num diff-line-num" data-line-number="3452" href="#L3452" id="L3452">
3452
</a>
<a class="file-line-num diff-line-num" data-line-number="3453" href="#L3453" id="L3453">
3453
</a>
<a class="file-line-num diff-line-num" data-line-number="3454" href="#L3454" id="L3454">
3454
</a>
<a class="file-line-num diff-line-num" data-line-number="3455" href="#L3455" id="L3455">
3455
</a>
<a class="file-line-num diff-line-num" data-line-number="3456" href="#L3456" id="L3456">
3456
</a>
<a class="file-line-num diff-line-num" data-line-number="3457" href="#L3457" id="L3457">
3457
</a>
<a class="file-line-num diff-line-num" data-line-number="3458" href="#L3458" id="L3458">
3458
</a>
<a class="file-line-num diff-line-num" data-line-number="3459" href="#L3459" id="L3459">
3459
</a>
<a class="file-line-num diff-line-num" data-line-number="3460" href="#L3460" id="L3460">
3460
</a>
<a class="file-line-num diff-line-num" data-line-number="3461" href="#L3461" id="L3461">
3461
</a>
<a class="file-line-num diff-line-num" data-line-number="3462" href="#L3462" id="L3462">
3462
</a>
<a class="file-line-num diff-line-num" data-line-number="3463" href="#L3463" id="L3463">
3463
</a>
<a class="file-line-num diff-line-num" data-line-number="3464" href="#L3464" id="L3464">
3464
</a>
<a class="file-line-num diff-line-num" data-line-number="3465" href="#L3465" id="L3465">
3465
</a>
<a class="file-line-num diff-line-num" data-line-number="3466" href="#L3466" id="L3466">
3466
</a>
<a class="file-line-num diff-line-num" data-line-number="3467" href="#L3467" id="L3467">
3467
</a>
<a class="file-line-num diff-line-num" data-line-number="3468" href="#L3468" id="L3468">
3468
</a>
<a class="file-line-num diff-line-num" data-line-number="3469" href="#L3469" id="L3469">
3469
</a>
<a class="file-line-num diff-line-num" data-line-number="3470" href="#L3470" id="L3470">
3470
</a>
<a class="file-line-num diff-line-num" data-line-number="3471" href="#L3471" id="L3471">
3471
</a>
<a class="file-line-num diff-line-num" data-line-number="3472" href="#L3472" id="L3472">
3472
</a>
<a class="file-line-num diff-line-num" data-line-number="3473" href="#L3473" id="L3473">
3473
</a>
<a class="file-line-num diff-line-num" data-line-number="3474" href="#L3474" id="L3474">
3474
</a>
<a class="file-line-num diff-line-num" data-line-number="3475" href="#L3475" id="L3475">
3475
</a>
<a class="file-line-num diff-line-num" data-line-number="3476" href="#L3476" id="L3476">
3476
</a>
<a class="file-line-num diff-line-num" data-line-number="3477" href="#L3477" id="L3477">
3477
</a>
<a class="file-line-num diff-line-num" data-line-number="3478" href="#L3478" id="L3478">
3478
</a>
<a class="file-line-num diff-line-num" data-line-number="3479" href="#L3479" id="L3479">
3479
</a>
<a class="file-line-num diff-line-num" data-line-number="3480" href="#L3480" id="L3480">
3480
</a>
<a class="file-line-num diff-line-num" data-line-number="3481" href="#L3481" id="L3481">
3481
</a>
<a class="file-line-num diff-line-num" data-line-number="3482" href="#L3482" id="L3482">
3482
</a>
<a class="file-line-num diff-line-num" data-line-number="3483" href="#L3483" id="L3483">
3483
</a>
<a class="file-line-num diff-line-num" data-line-number="3484" href="#L3484" id="L3484">
3484
</a>
<a class="file-line-num diff-line-num" data-line-number="3485" href="#L3485" id="L3485">
3485
</a>
<a class="file-line-num diff-line-num" data-line-number="3486" href="#L3486" id="L3486">
3486
</a>
<a class="file-line-num diff-line-num" data-line-number="3487" href="#L3487" id="L3487">
3487
</a>
<a class="file-line-num diff-line-num" data-line-number="3488" href="#L3488" id="L3488">
3488
</a>
<a class="file-line-num diff-line-num" data-line-number="3489" href="#L3489" id="L3489">
3489
</a>
<a class="file-line-num diff-line-num" data-line-number="3490" href="#L3490" id="L3490">
3490
</a>
<a class="file-line-num diff-line-num" data-line-number="3491" href="#L3491" id="L3491">
3491
</a>
<a class="file-line-num diff-line-num" data-line-number="3492" href="#L3492" id="L3492">
3492
</a>
<a class="file-line-num diff-line-num" data-line-number="3493" href="#L3493" id="L3493">
3493
</a>
<a class="file-line-num diff-line-num" data-line-number="3494" href="#L3494" id="L3494">
3494
</a>
<a class="file-line-num diff-line-num" data-line-number="3495" href="#L3495" id="L3495">
3495
</a>
<a class="file-line-num diff-line-num" data-line-number="3496" href="#L3496" id="L3496">
3496
</a>
<a class="file-line-num diff-line-num" data-line-number="3497" href="#L3497" id="L3497">
3497
</a>
<a class="file-line-num diff-line-num" data-line-number="3498" href="#L3498" id="L3498">
3498
</a>
<a class="file-line-num diff-line-num" data-line-number="3499" href="#L3499" id="L3499">
3499
</a>
<a class="file-line-num diff-line-num" data-line-number="3500" href="#L3500" id="L3500">
3500
</a>
<a class="file-line-num diff-line-num" data-line-number="3501" href="#L3501" id="L3501">
3501
</a>
<a class="file-line-num diff-line-num" data-line-number="3502" href="#L3502" id="L3502">
3502
</a>
<a class="file-line-num diff-line-num" data-line-number="3503" href="#L3503" id="L3503">
3503
</a>
<a class="file-line-num diff-line-num" data-line-number="3504" href="#L3504" id="L3504">
3504
</a>
<a class="file-line-num diff-line-num" data-line-number="3505" href="#L3505" id="L3505">
3505
</a>
<a class="file-line-num diff-line-num" data-line-number="3506" href="#L3506" id="L3506">
3506
</a>
<a class="file-line-num diff-line-num" data-line-number="3507" href="#L3507" id="L3507">
3507
</a>
<a class="file-line-num diff-line-num" data-line-number="3508" href="#L3508" id="L3508">
3508
</a>
<a class="file-line-num diff-line-num" data-line-number="3509" href="#L3509" id="L3509">
3509
</a>
<a class="file-line-num diff-line-num" data-line-number="3510" href="#L3510" id="L3510">
3510
</a>
<a class="file-line-num diff-line-num" data-line-number="3511" href="#L3511" id="L3511">
3511
</a>
<a class="file-line-num diff-line-num" data-line-number="3512" href="#L3512" id="L3512">
3512
</a>
<a class="file-line-num diff-line-num" data-line-number="3513" href="#L3513" id="L3513">
3513
</a>
<a class="file-line-num diff-line-num" data-line-number="3514" href="#L3514" id="L3514">
3514
</a>
<a class="file-line-num diff-line-num" data-line-number="3515" href="#L3515" id="L3515">
3515
</a>
<a class="file-line-num diff-line-num" data-line-number="3516" href="#L3516" id="L3516">
3516
</a>
<a class="file-line-num diff-line-num" data-line-number="3517" href="#L3517" id="L3517">
3517
</a>
<a class="file-line-num diff-line-num" data-line-number="3518" href="#L3518" id="L3518">
3518
</a>
<a class="file-line-num diff-line-num" data-line-number="3519" href="#L3519" id="L3519">
3519
</a>
<a class="file-line-num diff-line-num" data-line-number="3520" href="#L3520" id="L3520">
3520
</a>
<a class="file-line-num diff-line-num" data-line-number="3521" href="#L3521" id="L3521">
3521
</a>
<a class="file-line-num diff-line-num" data-line-number="3522" href="#L3522" id="L3522">
3522
</a>
<a class="file-line-num diff-line-num" data-line-number="3523" href="#L3523" id="L3523">
3523
</a>
<a class="file-line-num diff-line-num" data-line-number="3524" href="#L3524" id="L3524">
3524
</a>
<a class="file-line-num diff-line-num" data-line-number="3525" href="#L3525" id="L3525">
3525
</a>
<a class="file-line-num diff-line-num" data-line-number="3526" href="#L3526" id="L3526">
3526
</a>
<a class="file-line-num diff-line-num" data-line-number="3527" href="#L3527" id="L3527">
3527
</a>
<a class="file-line-num diff-line-num" data-line-number="3528" href="#L3528" id="L3528">
3528
</a>
<a class="file-line-num diff-line-num" data-line-number="3529" href="#L3529" id="L3529">
3529
</a>
<a class="file-line-num diff-line-num" data-line-number="3530" href="#L3530" id="L3530">
3530
</a>
<a class="file-line-num diff-line-num" data-line-number="3531" href="#L3531" id="L3531">
3531
</a>
<a class="file-line-num diff-line-num" data-line-number="3532" href="#L3532" id="L3532">
3532
</a>
<a class="file-line-num diff-line-num" data-line-number="3533" href="#L3533" id="L3533">
3533
</a>
<a class="file-line-num diff-line-num" data-line-number="3534" href="#L3534" id="L3534">
3534
</a>
<a class="file-line-num diff-line-num" data-line-number="3535" href="#L3535" id="L3535">
3535
</a>
<a class="file-line-num diff-line-num" data-line-number="3536" href="#L3536" id="L3536">
3536
</a>
<a class="file-line-num diff-line-num" data-line-number="3537" href="#L3537" id="L3537">
3537
</a>
<a class="file-line-num diff-line-num" data-line-number="3538" href="#L3538" id="L3538">
3538
</a>
<a class="file-line-num diff-line-num" data-line-number="3539" href="#L3539" id="L3539">
3539
</a>
<a class="file-line-num diff-line-num" data-line-number="3540" href="#L3540" id="L3540">
3540
</a>
<a class="file-line-num diff-line-num" data-line-number="3541" href="#L3541" id="L3541">
3541
</a>
<a class="file-line-num diff-line-num" data-line-number="3542" href="#L3542" id="L3542">
3542
</a>
<a class="file-line-num diff-line-num" data-line-number="3543" href="#L3543" id="L3543">
3543
</a>
<a class="file-line-num diff-line-num" data-line-number="3544" href="#L3544" id="L3544">
3544
</a>
<a class="file-line-num diff-line-num" data-line-number="3545" href="#L3545" id="L3545">
3545
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.</span></span>
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
<span id="LC26" class="line" lang="java"><span class="kn">package</span> <span class="nn">java.net</span><span class="o">;</span></span>
<span id="LC27" class="line" lang="java"></span>
<span id="LC28" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.IOException</span><span class="o">;</span></span>
<span id="LC29" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.InvalidObjectException</span><span class="o">;</span></span>
<span id="LC30" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.ObjectInputStream</span><span class="o">;</span></span>
<span id="LC31" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.ObjectOutputStream</span><span class="o">;</span></span>
<span id="LC32" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.Serializable</span><span class="o">;</span></span>
<span id="LC33" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.ByteBuffer</span><span class="o">;</span></span>
<span id="LC34" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.CharBuffer</span><span class="o">;</span></span>
<span id="LC35" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.CharsetDecoder</span><span class="o">;</span></span>
<span id="LC36" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.CharsetEncoder</span><span class="o">;</span></span>
<span id="LC37" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.CoderResult</span><span class="o">;</span></span>
<span id="LC38" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.CodingErrorAction</span><span class="o">;</span></span>
<span id="LC39" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.nio.charset.CharacterCodingException</span><span class="o">;</span></span>
<span id="LC40" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.text.Normalizer</span><span class="o">;</span></span>
<span id="LC41" class="line" lang="java"><span class="kn">import</span> <span class="nn">sun.nio.cs.ThreadLocalCoders</span><span class="o">;</span></span>
<span id="LC42" class="line" lang="java"></span>
<span id="LC43" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.lang.Character</span><span class="o">;</span>             <span class="c1">// for javadoc</span></span>
<span id="LC44" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.lang.NullPointerException</span><span class="o">;</span>  <span class="c1">// for javadoc</span></span>
<span id="LC45" class="line" lang="java"></span>
<span id="LC46" class="line" lang="java"></span>
<span id="LC47" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> * Represents a Uniform Resource Identifier (URI) reference.</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> * &lt;p&gt; Aside from some minor deviations noted below, an instance of this</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> * class represents a URI reference as defined by</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> * &lt;a href="http://www.ietf.org/rfc/rfc2396.txt"&gt;&lt;i&gt;RFC&amp;nbsp;2396: Uniform</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> * Resource Identifiers (URI): Generic Syntax&lt;/i&gt;&lt;/a&gt;, amended by &lt;a</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> * href="http://www.ietf.org/rfc/rfc2732.txt"&gt;&lt;i&gt;RFC&amp;nbsp;2732: Format for</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> * Literal IPv6 Addresses in URLs&lt;/i&gt;&lt;/a&gt;. The Literal IPv6 address format</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> * also supports scope_ids. The syntax and usage of scope_ids is described</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> * &lt;a href="Inet6Address.html#scoped"&gt;here&lt;/a&gt;.</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> * This class provides constructors for creating URI instances from</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> * their components or by parsing their string forms, methods for accessing the</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> * various components of an instance, and methods for normalizing, resolving,</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> * and relativizing URI instances.  Instances of this class are immutable.</span></span>
<span id="LC62" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC63" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC64" class="line" lang="java"><span class="cm"> * &lt;h3&gt; URI syntax and components &lt;/h3&gt;</span></span>
<span id="LC65" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> * At the highest level a URI reference (hereinafter simply "URI") in string</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> * form has the syntax</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> * [&lt;i&gt;scheme&lt;/i&gt;&lt;b&gt;{@code :}&lt;/b&gt;]&lt;i&gt;scheme-specific-part&lt;/i&gt;[&lt;b&gt;{@code #}&lt;/b&gt;&lt;i&gt;fragment&lt;/i&gt;]</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> * where square brackets [...] delineate optional components and the characters</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> * &lt;b&gt;{@code :}&lt;/b&gt; and &lt;b&gt;{@code #}&lt;/b&gt; stand for themselves.</span></span>
<span id="LC75" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC76" class="line" lang="java"><span class="cm"> * &lt;p&gt; An &lt;i&gt;absolute&lt;/i&gt; URI specifies a scheme; a URI that is not absolute is</span></span>
<span id="LC77" class="line" lang="java"><span class="cm"> * said to be &lt;i&gt;relative&lt;/i&gt;.  URIs are also classified according to whether</span></span>
<span id="LC78" class="line" lang="java"><span class="cm"> * they are &lt;i&gt;opaque&lt;/i&gt; or &lt;i&gt;hierarchical&lt;/i&gt;.</span></span>
<span id="LC79" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC80" class="line" lang="java"><span class="cm"> * &lt;p&gt; An &lt;i&gt;opaque&lt;/i&gt; URI is an absolute URI whose scheme-specific part does</span></span>
<span id="LC81" class="line" lang="java"><span class="cm"> * not begin with a slash character ({@code '/'}).  Opaque URIs are not</span></span>
<span id="LC82" class="line" lang="java"><span class="cm"> * subject to further parsing.  Some examples of opaque URIs are:</span></span>
<span id="LC83" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC84" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;&lt;table cellpadding=0 cellspacing=0 summary="layout"&gt;</span></span>
<span id="LC85" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;{@code mailto:java-net@java.sun.com}&lt;td&gt;&lt;/tr&gt;</span></span>
<span id="LC86" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;{@code news:comp.lang.java}&lt;td&gt;&lt;/tr&gt;</span></span>
<span id="LC87" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;{@code urn:isbn:096139210x}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC88" class="line" lang="java"><span class="cm"> * &lt;/table&gt;&lt;/blockquote&gt;</span></span>
<span id="LC89" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC90" class="line" lang="java"><span class="cm"> * &lt;p&gt; A &lt;i&gt;hierarchical&lt;/i&gt; URI is either an absolute URI whose</span></span>
<span id="LC91" class="line" lang="java"><span class="cm"> * scheme-specific part begins with a slash character, or a relative URI, that</span></span>
<span id="LC92" class="line" lang="java"><span class="cm"> * is, a URI that does not specify a scheme.  Some examples of hierarchical</span></span>
<span id="LC93" class="line" lang="java"><span class="cm"> * URIs are:</span></span>
<span id="LC94" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC95" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC96" class="line" lang="java"><span class="cm"> * {@code http://java.sun.com/j2se/1.3/}&lt;br&gt;</span></span>
<span id="LC97" class="line" lang="java"><span class="cm"> * {@code docs/guide/collections/designfaq.html#28}&lt;br&gt;</span></span>
<span id="LC98" class="line" lang="java"><span class="cm"> * {@code ../../../demo/jfc/SwingSet2/src/SwingSet2.java}&lt;br&gt;</span></span>
<span id="LC99" class="line" lang="java"><span class="cm"> * {@code file:///~/calendar}</span></span>
<span id="LC100" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC101" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC102" class="line" lang="java"><span class="cm"> * &lt;p&gt; A hierarchical URI is subject to further parsing according to the syntax</span></span>
<span id="LC103" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC104" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC105" class="line" lang="java"><span class="cm"> * [&lt;i&gt;scheme&lt;/i&gt;&lt;b&gt;{@code :}&lt;/b&gt;][&lt;b&gt;{@code //}&lt;/b&gt;&lt;i&gt;authority&lt;/i&gt;][&lt;i&gt;path&lt;/i&gt;][&lt;b&gt;{@code ?}&lt;/b&gt;&lt;i&gt;query&lt;/i&gt;][&lt;b&gt;{@code #}&lt;/b&gt;&lt;i&gt;fragment&lt;/i&gt;]</span></span>
<span id="LC106" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC107" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC108" class="line" lang="java"><span class="cm"> * where the characters &lt;b&gt;{@code :}&lt;/b&gt;, &lt;b&gt;{@code /}&lt;/b&gt;,</span></span>
<span id="LC109" class="line" lang="java"><span class="cm"> * &lt;b&gt;{@code ?}&lt;/b&gt;, and &lt;b&gt;{@code #}&lt;/b&gt; stand for themselves.  The</span></span>
<span id="LC110" class="line" lang="java"><span class="cm"> * scheme-specific part of a hierarchical URI consists of the characters</span></span>
<span id="LC111" class="line" lang="java"><span class="cm"> * between the scheme and fragment components.</span></span>
<span id="LC112" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC113" class="line" lang="java"><span class="cm"> * &lt;p&gt; The authority component of a hierarchical URI is, if specified, either</span></span>
<span id="LC114" class="line" lang="java"><span class="cm"> * &lt;i&gt;server-based&lt;/i&gt; or &lt;i&gt;registry-based&lt;/i&gt;.  A server-based authority</span></span>
<span id="LC115" class="line" lang="java"><span class="cm"> * parses according to the familiar syntax</span></span>
<span id="LC116" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC117" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC118" class="line" lang="java"><span class="cm"> * [&lt;i&gt;user-info&lt;/i&gt;&lt;b&gt;{@code @}&lt;/b&gt;]&lt;i&gt;host&lt;/i&gt;[&lt;b&gt;{@code :}&lt;/b&gt;&lt;i&gt;port&lt;/i&gt;]</span></span>
<span id="LC119" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC120" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC121" class="line" lang="java"><span class="cm"> * where the characters &lt;b&gt;{@code @}&lt;/b&gt; and &lt;b&gt;{@code :}&lt;/b&gt; stand for</span></span>
<span id="LC122" class="line" lang="java"><span class="cm"> * themselves.  Nearly all URI schemes currently in use are server-based.  An</span></span>
<span id="LC123" class="line" lang="java"><span class="cm"> * authority component that does not parse in this way is considered to be</span></span>
<span id="LC124" class="line" lang="java"><span class="cm"> * registry-based.</span></span>
<span id="LC125" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC126" class="line" lang="java"><span class="cm"> * &lt;p&gt; The path component of a hierarchical URI is itself said to be absolute</span></span>
<span id="LC127" class="line" lang="java"><span class="cm"> * if it begins with a slash character ({@code '/'}); otherwise it is</span></span>
<span id="LC128" class="line" lang="java"><span class="cm"> * relative.  The path of a hierarchical URI that is either absolute or</span></span>
<span id="LC129" class="line" lang="java"><span class="cm"> * specifies an authority is always absolute.</span></span>
<span id="LC130" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC131" class="line" lang="java"><span class="cm"> * &lt;p&gt; All told, then, a URI instance has the following nine components:</span></span>
<span id="LC132" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC133" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;&lt;table summary="Describes the components of a URI:scheme,scheme-specific-part,authority,user-info,host,port,path,query,fragment"&gt;</span></span>
<span id="LC134" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;th&gt;&lt;i&gt;Component&lt;/i&gt;&lt;/th&gt;&lt;th&gt;&lt;i&gt;Type&lt;/i&gt;&lt;/th&gt;&lt;/tr&gt;</span></span>
<span id="LC135" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;scheme&lt;/td&gt;&lt;td&gt;{@code String}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC136" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;scheme-specific-part&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;/td&gt;&lt;td&gt;{@code String}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC137" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;authority&lt;/td&gt;&lt;td&gt;{@code String}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC138" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;user-info&lt;/td&gt;&lt;td&gt;{@code String}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC139" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;host&lt;/td&gt;&lt;td&gt;{@code String}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC140" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;port&lt;/td&gt;&lt;td&gt;{@code int}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC141" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;path&lt;/td&gt;&lt;td&gt;{@code String}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC142" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;query&lt;/td&gt;&lt;td&gt;{@code String}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC143" class="line" lang="java"><span class="cm"> * &lt;tr&gt;&lt;td&gt;fragment&lt;/td&gt;&lt;td&gt;{@code String}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC144" class="line" lang="java"><span class="cm"> * &lt;/table&gt;&lt;/blockquote&gt;</span></span>
<span id="LC145" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC146" class="line" lang="java"><span class="cm"> * In a given instance any particular component is either &lt;i&gt;undefined&lt;/i&gt; or</span></span>
<span id="LC147" class="line" lang="java"><span class="cm"> * &lt;i&gt;defined&lt;/i&gt; with a distinct value.  Undefined string components are</span></span>
<span id="LC148" class="line" lang="java"><span class="cm"> * represented by {@code null}, while undefined integer components are</span></span>
<span id="LC149" class="line" lang="java"><span class="cm"> * represented by {@code -1}.  A string component may be defined to have the</span></span>
<span id="LC150" class="line" lang="java"><span class="cm"> * empty string as its value; this is not equivalent to that component being</span></span>
<span id="LC151" class="line" lang="java"><span class="cm"> * undefined.</span></span>
<span id="LC152" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC153" class="line" lang="java"><span class="cm"> * &lt;p&gt; Whether a particular component is or is not defined in an instance</span></span>
<span id="LC154" class="line" lang="java"><span class="cm"> * depends upon the type of the URI being represented.  An absolute URI has a</span></span>
<span id="LC155" class="line" lang="java"><span class="cm"> * scheme component.  An opaque URI has a scheme, a scheme-specific part, and</span></span>
<span id="LC156" class="line" lang="java"><span class="cm"> * possibly a fragment, but has no other components.  A hierarchical URI always</span></span>
<span id="LC157" class="line" lang="java"><span class="cm"> * has a path (though it may be empty) and a scheme-specific-part (which at</span></span>
<span id="LC158" class="line" lang="java"><span class="cm"> * least contains the path), and may have any of the other components.  If the</span></span>
<span id="LC159" class="line" lang="java"><span class="cm"> * authority component is present and is server-based then the host component</span></span>
<span id="LC160" class="line" lang="java"><span class="cm"> * will be defined and the user-information and port components may be defined.</span></span>
<span id="LC161" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC162" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC163" class="line" lang="java"><span class="cm"> * &lt;h4&gt; Operations on URI instances &lt;/h4&gt;</span></span>
<span id="LC164" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC165" class="line" lang="java"><span class="cm"> * The key operations supported by this class are those of</span></span>
<span id="LC166" class="line" lang="java"><span class="cm"> * &lt;i&gt;normalization&lt;/i&gt;, &lt;i&gt;resolution&lt;/i&gt;, and &lt;i&gt;relativization&lt;/i&gt;.</span></span>
<span id="LC167" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC168" class="line" lang="java"><span class="cm"> * &lt;p&gt; &lt;i&gt;Normalization&lt;/i&gt; is the process of removing unnecessary {@code "."}</span></span>
<span id="LC169" class="line" lang="java"><span class="cm"> * and {@code ".."} segments from the path component of a hierarchical URI.</span></span>
<span id="LC170" class="line" lang="java"><span class="cm"> * Each {@code "."} segment is simply removed.  A {@code ".."} segment is</span></span>
<span id="LC171" class="line" lang="java"><span class="cm"> * removed only if it is preceded by a non-{@code ".."} segment.</span></span>
<span id="LC172" class="line" lang="java"><span class="cm"> * Normalization has no effect upon opaque URIs.</span></span>
<span id="LC173" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC174" class="line" lang="java"><span class="cm"> * &lt;p&gt; &lt;i&gt;Resolution&lt;/i&gt; is the process of resolving one URI against another,</span></span>
<span id="LC175" class="line" lang="java"><span class="cm"> * &lt;i&gt;base&lt;/i&gt; URI.  The resulting URI is constructed from components of both</span></span>
<span id="LC176" class="line" lang="java"><span class="cm"> * URIs in the manner specified by RFC&amp;nbsp;2396, taking components from the</span></span>
<span id="LC177" class="line" lang="java"><span class="cm"> * base URI for those not specified in the original.  For hierarchical URIs,</span></span>
<span id="LC178" class="line" lang="java"><span class="cm"> * the path of the original is resolved against the path of the base and then</span></span>
<span id="LC179" class="line" lang="java"><span class="cm"> * normalized.  The result, for example, of resolving</span></span>
<span id="LC180" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC181" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC182" class="line" lang="java"><span class="cm"> * {@code docs/guide/collections/designfaq.html#28}</span></span>
<span id="LC183" class="line" lang="java"><span class="cm"> * &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;</span></span>
<span id="LC184" class="line" lang="java"><span class="cm"> * &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;(1)</span></span>
<span id="LC185" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC186" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC187" class="line" lang="java"><span class="cm"> * against the base URI {@code http://java.sun.com/j2se/1.3/} is the result</span></span>
<span id="LC188" class="line" lang="java"><span class="cm"> * URI</span></span>
<span id="LC189" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC190" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC191" class="line" lang="java"><span class="cm"> * {@code https://docs.oracle.com/javase/1.3/docs/guide/collections/designfaq.html#28}</span></span>
<span id="LC192" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC193" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC194" class="line" lang="java"><span class="cm"> * Resolving the relative URI</span></span>
<span id="LC195" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC196" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC197" class="line" lang="java"><span class="cm"> * {@code ../../../demo/jfc/SwingSet2/src/SwingSet2.java}&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;(2)</span></span>
<span id="LC198" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC199" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC200" class="line" lang="java"><span class="cm"> * against this result yields, in turn,</span></span>
<span id="LC201" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC202" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC203" class="line" lang="java"><span class="cm"> * {@code http://java.sun.com/j2se/1.3/demo/jfc/SwingSet2/src/SwingSet2.java}</span></span>
<span id="LC204" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC205" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC206" class="line" lang="java"><span class="cm"> * Resolution of both absolute and relative URIs, and of both absolute and</span></span>
<span id="LC207" class="line" lang="java"><span class="cm"> * relative paths in the case of hierarchical URIs, is supported.  Resolving</span></span>
<span id="LC208" class="line" lang="java"><span class="cm"> * the URI {@code file:///~calendar} against any other URI simply yields the</span></span>
<span id="LC209" class="line" lang="java"><span class="cm"> * original URI, since it is absolute.  Resolving the relative URI (2) above</span></span>
<span id="LC210" class="line" lang="java"><span class="cm"> * against the relative base URI (1) yields the normalized, but still relative,</span></span>
<span id="LC211" class="line" lang="java"><span class="cm"> * URI</span></span>
<span id="LC212" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC213" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC214" class="line" lang="java"><span class="cm"> * {@code demo/jfc/SwingSet2/src/SwingSet2.java}</span></span>
<span id="LC215" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC216" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC217" class="line" lang="java"><span class="cm"> * &lt;p&gt; &lt;i&gt;Relativization&lt;/i&gt;, finally, is the inverse of resolution: For any</span></span>
<span id="LC218" class="line" lang="java"><span class="cm"> * two normalized URIs &lt;i&gt;u&lt;/i&gt; and&amp;nbsp;&lt;i&gt;v&lt;/i&gt;,</span></span>
<span id="LC219" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC220" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC221" class="line" lang="java"><span class="cm"> *   &lt;i&gt;u&lt;/i&gt;{@code .relativize(}&lt;i&gt;u&lt;/i&gt;{@code .resolve(}&lt;i&gt;v&lt;/i&gt;{@code )).equals(}&lt;i&gt;v&lt;/i&gt;{@code )}&amp;nbsp;&amp;nbsp;and&lt;br&gt;</span></span>
<span id="LC222" class="line" lang="java"><span class="cm"> *   &lt;i&gt;u&lt;/i&gt;{@code .resolve(}&lt;i&gt;u&lt;/i&gt;{@code .relativize(}&lt;i&gt;v&lt;/i&gt;{@code )).equals(}&lt;i&gt;v&lt;/i&gt;{@code )}&amp;nbsp;&amp;nbsp;.&lt;br&gt;</span></span>
<span id="LC223" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC224" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC225" class="line" lang="java"><span class="cm"> * This operation is often useful when constructing a document containing URIs</span></span>
<span id="LC226" class="line" lang="java"><span class="cm"> * that must be made relative to the base URI of the document wherever</span></span>
<span id="LC227" class="line" lang="java"><span class="cm"> * possible.  For example, relativizing the URI</span></span>
<span id="LC228" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC229" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC230" class="line" lang="java"><span class="cm"> * {@code https://docs.oracle.com/javase/1.3/docs/guide/index.html}</span></span>
<span id="LC231" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC232" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC233" class="line" lang="java"><span class="cm"> * against the base URI</span></span>
<span id="LC234" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC235" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC236" class="line" lang="java"><span class="cm"> * {@code http://java.sun.com/j2se/1.3}</span></span>
<span id="LC237" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC238" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC239" class="line" lang="java"><span class="cm"> * yields the relative URI {@code docs/guide/index.html}.</span></span>
<span id="LC240" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC241" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC242" class="line" lang="java"><span class="cm"> * &lt;h4&gt; Character categories &lt;/h4&gt;</span></span>
<span id="LC243" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC244" class="line" lang="java"><span class="cm"> * RFC&amp;nbsp;2396 specifies precisely which characters are permitted in the</span></span>
<span id="LC245" class="line" lang="java"><span class="cm"> * various components of a URI reference.  The following categories, most of</span></span>
<span id="LC246" class="line" lang="java"><span class="cm"> * which are taken from that specification, are used below to describe these</span></span>
<span id="LC247" class="line" lang="java"><span class="cm"> * constraints:</span></span>
<span id="LC248" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC249" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;&lt;table cellspacing=2 summary="Describes categories alpha,digit,alphanum,unreserved,punct,reserved,escaped,and other"&gt;</span></span>
<span id="LC250" class="line" lang="java"><span class="cm"> *   &lt;tr&gt;&lt;th valign=top&gt;&lt;i&gt;alpha&lt;/i&gt;&lt;/th&gt;</span></span>
<span id="LC251" class="line" lang="java"><span class="cm"> *       &lt;td&gt;The US-ASCII alphabetic characters,</span></span>
<span id="LC252" class="line" lang="java"><span class="cm"> *        {@code 'A'}&amp;nbsp;through&amp;nbsp;{@code 'Z'}</span></span>
<span id="LC253" class="line" lang="java"><span class="cm"> *        and {@code 'a'}&amp;nbsp;through&amp;nbsp;{@code 'z'}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC254" class="line" lang="java"><span class="cm"> *   &lt;tr&gt;&lt;th valign=top&gt;&lt;i&gt;digit&lt;/i&gt;&lt;/th&gt;</span></span>
<span id="LC255" class="line" lang="java"><span class="cm"> *       &lt;td&gt;The US-ASCII decimal digit characters,</span></span>
<span id="LC256" class="line" lang="java"><span class="cm"> *       {@code '0'}&amp;nbsp;through&amp;nbsp;{@code '9'}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC257" class="line" lang="java"><span class="cm"> *   &lt;tr&gt;&lt;th valign=top&gt;&lt;i&gt;alphanum&lt;/i&gt;&lt;/th&gt;</span></span>
<span id="LC258" class="line" lang="java"><span class="cm"> *       &lt;td&gt;All &lt;i&gt;alpha&lt;/i&gt; and &lt;i&gt;digit&lt;/i&gt; characters&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC259" class="line" lang="java"><span class="cm"> *   &lt;tr&gt;&lt;th valign=top&gt;&lt;i&gt;unreserved&lt;/i&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;/th&gt;</span></span>
<span id="LC260" class="line" lang="java"><span class="cm"> *       &lt;td&gt;All &lt;i&gt;alphanum&lt;/i&gt; characters together with those in the string</span></span>
<span id="LC261" class="line" lang="java"><span class="cm"> *        {@code "_-!.~'()*"}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC262" class="line" lang="java"><span class="cm"> *   &lt;tr&gt;&lt;th valign=top&gt;&lt;i&gt;punct&lt;/i&gt;&lt;/th&gt;</span></span>
<span id="LC263" class="line" lang="java"><span class="cm"> *       &lt;td&gt;The characters in the string {@code ",;:$&amp;+="}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC264" class="line" lang="java"><span class="cm"> *   &lt;tr&gt;&lt;th valign=top&gt;&lt;i&gt;reserved&lt;/i&gt;&lt;/th&gt;</span></span>
<span id="LC265" class="line" lang="java"><span class="cm"> *       &lt;td&gt;All &lt;i&gt;punct&lt;/i&gt; characters together with those in the string</span></span>
<span id="LC266" class="line" lang="java"><span class="cm"> *        {@code "?/[]@"}&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC267" class="line" lang="java"><span class="cm"> *   &lt;tr&gt;&lt;th valign=top&gt;&lt;i&gt;escaped&lt;/i&gt;&lt;/th&gt;</span></span>
<span id="LC268" class="line" lang="java"><span class="cm"> *       &lt;td&gt;Escaped octets, that is, triplets consisting of the percent</span></span>
<span id="LC269" class="line" lang="java"><span class="cm"> *           character ({@code '%'}) followed by two hexadecimal digits</span></span>
<span id="LC270" class="line" lang="java"><span class="cm"> *           ({@code '0'}-{@code '9'}, {@code 'A'}-{@code 'F'}, and</span></span>
<span id="LC271" class="line" lang="java"><span class="cm"> *           {@code 'a'}-{@code 'f'})&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC272" class="line" lang="java"><span class="cm"> *   &lt;tr&gt;&lt;th valign=top&gt;&lt;i&gt;other&lt;/i&gt;&lt;/th&gt;</span></span>
<span id="LC273" class="line" lang="java"><span class="cm"> *       &lt;td&gt;The Unicode characters that are not in the US-ASCII character set,</span></span>
<span id="LC274" class="line" lang="java"><span class="cm"> *           are not control characters (according to the {@link</span></span>
<span id="LC275" class="line" lang="java"><span class="cm"> *           java.lang.Character#isISOControl(char) Character.isISOControl}</span></span>
<span id="LC276" class="line" lang="java"><span class="cm"> *           method), and are not space characters (according to the {@link</span></span>
<span id="LC277" class="line" lang="java"><span class="cm"> *           java.lang.Character#isSpaceChar(char) Character.isSpaceChar}</span></span>
<span id="LC278" class="line" lang="java"><span class="cm"> *           method)&amp;nbsp;&amp;nbsp;&lt;i&gt;(&lt;b&gt;Deviation from RFC 2396&lt;/b&gt;, which is</span></span>
<span id="LC279" class="line" lang="java"><span class="cm"> *           limited to US-ASCII)&lt;/i&gt;&lt;/td&gt;&lt;/tr&gt;</span></span>
<span id="LC280" class="line" lang="java"><span class="cm"> * &lt;/table&gt;&lt;/blockquote&gt;</span></span>
<span id="LC281" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC282" class="line" lang="java"><span class="cm"> * &lt;p&gt;&lt;a name="legal-chars"&gt;&lt;/a&gt; The set of all legal URI characters consists of</span></span>
<span id="LC283" class="line" lang="java"><span class="cm"> * the &lt;i&gt;unreserved&lt;/i&gt;, &lt;i&gt;reserved&lt;/i&gt;, &lt;i&gt;escaped&lt;/i&gt;, and &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC284" class="line" lang="java"><span class="cm"> * characters.</span></span>
<span id="LC285" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC286" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC287" class="line" lang="java"><span class="cm"> * &lt;h4&gt; Escaped octets, quotation, encoding, and decoding &lt;/h4&gt;</span></span>
<span id="LC288" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC289" class="line" lang="java"><span class="cm"> * RFC 2396 allows escaped octets to appear in the user-info, path, query, and</span></span>
<span id="LC290" class="line" lang="java"><span class="cm"> * fragment components.  Escaping serves two purposes in URIs:</span></span>
<span id="LC291" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC292" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC293" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC294" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt; To &lt;i&gt;encode&lt;/i&gt; non-US-ASCII characters when a URI is required to</span></span>
<span id="LC295" class="line" lang="java"><span class="cm"> *   conform strictly to RFC&amp;nbsp;2396 by not containing any &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC296" class="line" lang="java"><span class="cm"> *   characters.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC297" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC298" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt; To &lt;i&gt;quote&lt;/i&gt; characters that are otherwise illegal in a</span></span>
<span id="LC299" class="line" lang="java"><span class="cm"> *   component.  The user-info, path, query, and fragment components differ</span></span>
<span id="LC300" class="line" lang="java"><span class="cm"> *   slightly in terms of which characters are considered legal and illegal.</span></span>
<span id="LC301" class="line" lang="java"><span class="cm"> *   &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC302" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC303" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC304" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC305" class="line" lang="java"><span class="cm"> * These purposes are served in this class by three related operations:</span></span>
<span id="LC306" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC307" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC308" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC309" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt;&lt;a name="encode"&gt;&lt;/a&gt; A character is &lt;i&gt;encoded&lt;/i&gt; by replacing it</span></span>
<span id="LC310" class="line" lang="java"><span class="cm"> *   with the sequence of escaped octets that represent that character in the</span></span>
<span id="LC311" class="line" lang="java"><span class="cm"> *   UTF-8 character set.  The Euro currency symbol ({@code '\u005Cu20AC'}),</span></span>
<span id="LC312" class="line" lang="java"><span class="cm"> *   for example, is encoded as {@code "%E2%82%AC"}.  &lt;i&gt;(&lt;b&gt;Deviation from</span></span>
<span id="LC313" class="line" lang="java"><span class="cm"> *   RFC&amp;nbsp;2396&lt;/b&gt;, which does not specify any particular character</span></span>
<span id="LC314" class="line" lang="java"><span class="cm"> *   set.)&lt;/i&gt; &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC315" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC316" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt;&lt;a name="quote"&gt;&lt;/a&gt; An illegal character is &lt;i&gt;quoted&lt;/i&gt; simply by</span></span>
<span id="LC317" class="line" lang="java"><span class="cm"> *   encoding it.  The space character, for example, is quoted by replacing it</span></span>
<span id="LC318" class="line" lang="java"><span class="cm"> *   with {@code "%20"}.  UTF-8 contains US-ASCII, hence for US-ASCII</span></span>
<span id="LC319" class="line" lang="java"><span class="cm"> *   characters this transformation has exactly the effect required by</span></span>
<span id="LC320" class="line" lang="java"><span class="cm"> *   RFC&amp;nbsp;2396. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC321" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC322" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt;&lt;a name="decode"&gt;&lt;/a&gt;</span></span>
<span id="LC323" class="line" lang="java"><span class="cm"> *   A sequence of escaped octets is &lt;i&gt;decoded&lt;/i&gt; by</span></span>
<span id="LC324" class="line" lang="java"><span class="cm"> *   replacing it with the sequence of characters that it represents in the</span></span>
<span id="LC325" class="line" lang="java"><span class="cm"> *   UTF-8 character set.  UTF-8 contains US-ASCII, hence decoding has the</span></span>
<span id="LC326" class="line" lang="java"><span class="cm"> *   effect of de-quoting any quoted US-ASCII characters as well as that of</span></span>
<span id="LC327" class="line" lang="java"><span class="cm"> *   decoding any encoded non-US-ASCII characters.  If a &lt;a</span></span>
<span id="LC328" class="line" lang="java"><span class="cm"> *   href="../nio/charset/CharsetDecoder.html#ce"&gt;decoding error&lt;/a&gt; occurs</span></span>
<span id="LC329" class="line" lang="java"><span class="cm"> *   when decoding the escaped octets then the erroneous octets are replaced by</span></span>
<span id="LC330" class="line" lang="java"><span class="cm"> *   {@code '\u005CuFFFD'}, the Unicode replacement character.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC331" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC332" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC333" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC334" class="line" lang="java"><span class="cm"> * These operations are exposed in the constructors and methods of this class</span></span>
<span id="LC335" class="line" lang="java"><span class="cm"> * as follows:</span></span>
<span id="LC336" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC337" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC338" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC339" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt; The {@linkplain #URI(java.lang.String) single-argument</span></span>
<span id="LC340" class="line" lang="java"><span class="cm"> *   constructor} requires any illegal characters in its argument to be</span></span>
<span id="LC341" class="line" lang="java"><span class="cm"> *   quoted and preserves any escaped octets and &lt;i&gt;other&lt;/i&gt; characters that</span></span>
<span id="LC342" class="line" lang="java"><span class="cm"> *   are present.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC343" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC344" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt; The {@linkplain</span></span>
<span id="LC345" class="line" lang="java"><span class="cm"> *   #URI(java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,java.lang.String,java.lang.String)</span></span>
<span id="LC346" class="line" lang="java"><span class="cm"> *   multi-argument constructors} quote illegal characters as</span></span>
<span id="LC347" class="line" lang="java"><span class="cm"> *   required by the components in which they appear.  The percent character</span></span>
<span id="LC348" class="line" lang="java"><span class="cm"> *   ({@code '%'}) is always quoted by these constructors.  Any &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC349" class="line" lang="java"><span class="cm"> *   characters are preserved.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC350" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC351" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt; The {@link #getRawUserInfo() getRawUserInfo}, {@link #getRawPath()</span></span>
<span id="LC352" class="line" lang="java"><span class="cm"> *   getRawPath}, {@link #getRawQuery() getRawQuery}, {@link #getRawFragment()</span></span>
<span id="LC353" class="line" lang="java"><span class="cm"> *   getRawFragment}, {@link #getRawAuthority() getRawAuthority}, and {@link</span></span>
<span id="LC354" class="line" lang="java"><span class="cm"> *   #getRawSchemeSpecificPart() getRawSchemeSpecificPart} methods return the</span></span>
<span id="LC355" class="line" lang="java"><span class="cm"> *   values of their corresponding components in raw form, without interpreting</span></span>
<span id="LC356" class="line" lang="java"><span class="cm"> *   any escaped octets.  The strings returned by these methods may contain</span></span>
<span id="LC357" class="line" lang="java"><span class="cm"> *   both escaped octets and &lt;i&gt;other&lt;/i&gt; characters, and will not contain any</span></span>
<span id="LC358" class="line" lang="java"><span class="cm"> *   illegal characters.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC359" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC360" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt; The {@link #getUserInfo() getUserInfo}, {@link #getPath()</span></span>
<span id="LC361" class="line" lang="java"><span class="cm"> *   getPath}, {@link #getQuery() getQuery}, {@link #getFragment()</span></span>
<span id="LC362" class="line" lang="java"><span class="cm"> *   getFragment}, {@link #getAuthority() getAuthority}, and {@link</span></span>
<span id="LC363" class="line" lang="java"><span class="cm"> *   #getSchemeSpecificPart() getSchemeSpecificPart} methods decode any escaped</span></span>
<span id="LC364" class="line" lang="java"><span class="cm"> *   octets in their corresponding components.  The strings returned by these</span></span>
<span id="LC365" class="line" lang="java"><span class="cm"> *   methods may contain both &lt;i&gt;other&lt;/i&gt; characters and illegal characters,</span></span>
<span id="LC366" class="line" lang="java"><span class="cm"> *   and will not contain any escaped octets.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC367" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC368" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt; The {@link #toString() toString} method returns a URI string with</span></span>
<span id="LC369" class="line" lang="java"><span class="cm"> *   all necessary quotation but which may contain &lt;i&gt;other&lt;/i&gt; characters.</span></span>
<span id="LC370" class="line" lang="java"><span class="cm"> *   &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC371" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC372" class="line" lang="java"><span class="cm"> *   &lt;li&gt;&lt;p&gt; The {@link #toASCIIString() toASCIIString} method returns a fully</span></span>
<span id="LC373" class="line" lang="java"><span class="cm"> *   quoted and encoded URI string that does not contain any &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC374" class="line" lang="java"><span class="cm"> *   characters.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC375" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC376" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC377" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC378" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC379" class="line" lang="java"><span class="cm"> * &lt;h4&gt; Identities &lt;/h4&gt;</span></span>
<span id="LC380" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC381" class="line" lang="java"><span class="cm"> * For any URI &lt;i&gt;u&lt;/i&gt;, it is always the case that</span></span>
<span id="LC382" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC383" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;</span></span>
<span id="LC384" class="line" lang="java"><span class="cm"> * {@code new URI(}&lt;i&gt;u&lt;/i&gt;{@code .toString()).equals(}&lt;i&gt;u&lt;/i&gt;{@code )}&amp;nbsp;.</span></span>
<span id="LC385" class="line" lang="java"><span class="cm"> * &lt;/blockquote&gt;</span></span>
<span id="LC386" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC387" class="line" lang="java"><span class="cm"> * For any URI &lt;i&gt;u&lt;/i&gt; that does not contain redundant syntax such as two</span></span>
<span id="LC388" class="line" lang="java"><span class="cm"> * slashes before an empty authority (as in {@code file:///tmp/}&amp;nbsp;) or a</span></span>
<span id="LC389" class="line" lang="java"><span class="cm"> * colon following a host name but no port (as in</span></span>
<span id="LC390" class="line" lang="java"><span class="cm"> * {@code http://java.sun.com:}&amp;nbsp;), and that does not encode characters</span></span>
<span id="LC391" class="line" lang="java"><span class="cm"> * except those that must be quoted, the following identities also hold:</span></span>
<span id="LC392" class="line" lang="java"><span class="cm"> * &lt;pre&gt;</span></span>
<span id="LC393" class="line" lang="java"><span class="cm"> *     new URI(&lt;i&gt;u&lt;/i&gt;.getScheme(),</span></span>
<span id="LC394" class="line" lang="java"><span class="cm"> *             &lt;i&gt;u&lt;/i&gt;.getSchemeSpecificPart(),</span></span>
<span id="LC395" class="line" lang="java"><span class="cm"> *             &lt;i&gt;u&lt;/i&gt;.getFragment())</span></span>
<span id="LC396" class="line" lang="java"><span class="cm"> *     .equals(&lt;i&gt;u&lt;/i&gt;)&lt;/pre&gt;</span></span>
<span id="LC397" class="line" lang="java"><span class="cm"> * in all cases,</span></span>
<span id="LC398" class="line" lang="java"><span class="cm"> * &lt;pre&gt;</span></span>
<span id="LC399" class="line" lang="java"><span class="cm"> *     new URI(&lt;i&gt;u&lt;/i&gt;.getScheme(),</span></span>
<span id="LC400" class="line" lang="java"><span class="cm"> *             &lt;i&gt;u&lt;/i&gt;.getUserInfo(), &lt;i&gt;u&lt;/i&gt;.getAuthority(),</span></span>
<span id="LC401" class="line" lang="java"><span class="cm"> *             &lt;i&gt;u&lt;/i&gt;.getPath(), &lt;i&gt;u&lt;/i&gt;.getQuery(),</span></span>
<span id="LC402" class="line" lang="java"><span class="cm"> *             &lt;i&gt;u&lt;/i&gt;.getFragment())</span></span>
<span id="LC403" class="line" lang="java"><span class="cm"> *     .equals(&lt;i&gt;u&lt;/i&gt;)&lt;/pre&gt;</span></span>
<span id="LC404" class="line" lang="java"><span class="cm"> * if &lt;i&gt;u&lt;/i&gt; is hierarchical, and</span></span>
<span id="LC405" class="line" lang="java"><span class="cm"> * &lt;pre&gt;</span></span>
<span id="LC406" class="line" lang="java"><span class="cm"> *     new URI(&lt;i&gt;u&lt;/i&gt;.getScheme(),</span></span>
<span id="LC407" class="line" lang="java"><span class="cm"> *             &lt;i&gt;u&lt;/i&gt;.getUserInfo(), &lt;i&gt;u&lt;/i&gt;.getHost(), &lt;i&gt;u&lt;/i&gt;.getPort(),</span></span>
<span id="LC408" class="line" lang="java"><span class="cm"> *             &lt;i&gt;u&lt;/i&gt;.getPath(), &lt;i&gt;u&lt;/i&gt;.getQuery(),</span></span>
<span id="LC409" class="line" lang="java"><span class="cm"> *             &lt;i&gt;u&lt;/i&gt;.getFragment())</span></span>
<span id="LC410" class="line" lang="java"><span class="cm"> *     .equals(&lt;i&gt;u&lt;/i&gt;)&lt;/pre&gt;</span></span>
<span id="LC411" class="line" lang="java"><span class="cm"> * if &lt;i&gt;u&lt;/i&gt; is hierarchical and has either no authority or a server-based</span></span>
<span id="LC412" class="line" lang="java"><span class="cm"> * authority.</span></span>
<span id="LC413" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC414" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC415" class="line" lang="java"><span class="cm"> * &lt;h4&gt; URIs, URLs, and URNs &lt;/h4&gt;</span></span>
<span id="LC416" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC417" class="line" lang="java"><span class="cm"> * A URI is a uniform resource &lt;i&gt;identifier&lt;/i&gt; while a URL is a uniform</span></span>
<span id="LC418" class="line" lang="java"><span class="cm"> * resource &lt;i&gt;locator&lt;/i&gt;.  Hence every URL is a URI, abstractly speaking, but</span></span>
<span id="LC419" class="line" lang="java"><span class="cm"> * not every URI is a URL.  This is because there is another subcategory of</span></span>
<span id="LC420" class="line" lang="java"><span class="cm"> * URIs, uniform resource &lt;i&gt;names&lt;/i&gt; (URNs), which name resources but do not</span></span>
<span id="LC421" class="line" lang="java"><span class="cm"> * specify how to locate them.  The {@code mailto}, {@code news}, and</span></span>
<span id="LC422" class="line" lang="java"><span class="cm"> * {@code isbn} URIs shown above are examples of URNs.</span></span>
<span id="LC423" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC424" class="line" lang="java"><span class="cm"> * &lt;p&gt; The conceptual distinction between URIs and URLs is reflected in the</span></span>
<span id="LC425" class="line" lang="java"><span class="cm"> * differences between this class and the {@link URL} class.</span></span>
<span id="LC426" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC427" class="line" lang="java"><span class="cm"> * &lt;p&gt; An instance of this class represents a URI reference in the syntactic</span></span>
<span id="LC428" class="line" lang="java"><span class="cm"> * sense defined by RFC&amp;nbsp;2396.  A URI may be either absolute or relative.</span></span>
<span id="LC429" class="line" lang="java"><span class="cm"> * A URI string is parsed according to the generic syntax without regard to the</span></span>
<span id="LC430" class="line" lang="java"><span class="cm"> * scheme, if any, that it specifies.  No lookup of the host, if any, is</span></span>
<span id="LC431" class="line" lang="java"><span class="cm"> * performed, and no scheme-dependent stream handler is constructed.  Equality,</span></span>
<span id="LC432" class="line" lang="java"><span class="cm"> * hashing, and comparison are defined strictly in terms of the character</span></span>
<span id="LC433" class="line" lang="java"><span class="cm"> * content of the instance.  In other words, a URI instance is little more than</span></span>
<span id="LC434" class="line" lang="java"><span class="cm"> * a structured string that supports the syntactic, scheme-independent</span></span>
<span id="LC435" class="line" lang="java"><span class="cm"> * operations of comparison, normalization, resolution, and relativization.</span></span>
<span id="LC436" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC437" class="line" lang="java"><span class="cm"> * &lt;p&gt; An instance of the {@link URL} class, by contrast, represents the</span></span>
<span id="LC438" class="line" lang="java"><span class="cm"> * syntactic components of a URL together with some of the information required</span></span>
<span id="LC439" class="line" lang="java"><span class="cm"> * to access the resource that it describes.  A URL must be absolute, that is,</span></span>
<span id="LC440" class="line" lang="java"><span class="cm"> * it must always specify a scheme.  A URL string is parsed according to its</span></span>
<span id="LC441" class="line" lang="java"><span class="cm"> * scheme.  A stream handler is always established for a URL, and in fact it is</span></span>
<span id="LC442" class="line" lang="java"><span class="cm"> * impossible to create a URL instance for a scheme for which no handler is</span></span>
<span id="LC443" class="line" lang="java"><span class="cm"> * available.  Equality and hashing depend upon both the scheme and the</span></span>
<span id="LC444" class="line" lang="java"><span class="cm"> * Internet address of the host, if any; comparison is not defined.  In other</span></span>
<span id="LC445" class="line" lang="java"><span class="cm"> * words, a URL is a structured string that supports the syntactic operation of</span></span>
<span id="LC446" class="line" lang="java"><span class="cm"> * resolution as well as the network I/O operations of looking up the host and</span></span>
<span id="LC447" class="line" lang="java"><span class="cm"> * opening a connection to the specified resource.</span></span>
<span id="LC448" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC449" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC450" class="line" lang="java"><span class="cm"> * @author Mark Reinhold</span></span>
<span id="LC451" class="line" lang="java"><span class="cm"> * @since 1.4</span></span>
<span id="LC452" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC453" class="line" lang="java"><span class="cm"> * @see &lt;a href="http://www.ietf.org/rfc/rfc2279.txt"&gt;&lt;i&gt;RFC&amp;nbsp;2279: UTF-8, a</span></span>
<span id="LC454" class="line" lang="java"><span class="cm"> * transformation format of ISO 10646&lt;/i&gt;&lt;/a&gt;, &lt;br&gt;&lt;a</span></span>
<span id="LC455" class="line" lang="java"><span class="cm"> * href="http://www.ietf.org/rfc/rfc2373.txt"&gt;&lt;i&gt;RFC&amp;nbsp;2373: IPv6 Addressing</span></span>
<span id="LC456" class="line" lang="java"><span class="cm"> * Architecture&lt;/i&gt;&lt;/a&gt;, &lt;br&gt;&lt;a</span></span>
<span id="LC457" class="line" lang="java"><span class="cm"> * href="http://www.ietf.org/rfc/rfc2396.txt"&gt;&lt;i&gt;RFC&amp;nbsp;2396: Uniform</span></span>
<span id="LC458" class="line" lang="java"><span class="cm"> * Resource Identifiers (URI): Generic Syntax&lt;/i&gt;&lt;/a&gt;, &lt;br&gt;&lt;a</span></span>
<span id="LC459" class="line" lang="java"><span class="cm"> * href="http://www.ietf.org/rfc/rfc2732.txt"&gt;&lt;i&gt;RFC&amp;nbsp;2732: Format for</span></span>
<span id="LC460" class="line" lang="java"><span class="cm"> * Literal IPv6 Addresses in URLs&lt;/i&gt;&lt;/a&gt;, &lt;br&gt;&lt;a</span></span>
<span id="LC461" class="line" lang="java"><span class="cm"> * href="URISyntaxException.html"&gt;URISyntaxException&lt;/a&gt;</span></span>
<span id="LC462" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC463" class="line" lang="java"></span>
<span id="LC464" class="line" lang="java"><span class="kd">public</span> <span class="kd">final</span> <span class="kd">class</span> <span class="nc">URI</span></span>
<span id="LC465" class="line" lang="java">    <span class="kd">implements</span> <span class="nc">Comparable</span><span class="o">&lt;</span><span class="no">URI</span><span class="o">&gt;,</span> <span class="nc">Serializable</span></span>
<span id="LC466" class="line" lang="java"><span class="o">{</span></span>
<span id="LC467" class="line" lang="java"></span>
<span id="LC468" class="line" lang="java">    <span class="c1">// Note: Comments containing the word "ASSERT" indicate places where a</span></span>
<span id="LC469" class="line" lang="java">    <span class="c1">// throw of an InternalError should be replaced by an appropriate assertion</span></span>
<span id="LC470" class="line" lang="java">    <span class="c1">// statement once asserts are enabled in the build.</span></span>
<span id="LC471" class="line" lang="java"></span>
<span id="LC472" class="line" lang="java">    <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="n">serialVersionUID</span> <span class="o">=</span> <span class="o">-</span><span class="mi">6052424284110960213L</span><span class="o">;</span></span>
<span id="LC473" class="line" lang="java"></span>
<span id="LC474" class="line" lang="java"></span>
<span id="LC475" class="line" lang="java">    <span class="c1">// -- Properties and components of this instance --</span></span>
<span id="LC476" class="line" lang="java"></span>
<span id="LC477" class="line" lang="java">    <span class="c1">// Components of all URIs: [&lt;scheme&gt;:]&lt;scheme-specific-part&gt;[#&lt;fragment&gt;]</span></span>
<span id="LC478" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">scheme</span><span class="o">;</span>            <span class="c1">// null ==&gt; relative URI</span></span>
<span id="LC479" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">fragment</span><span class="o">;</span></span>
<span id="LC480" class="line" lang="java"></span>
<span id="LC481" class="line" lang="java">    <span class="c1">// Hierarchical URI components: [//&lt;authority&gt;]&lt;path&gt;[?&lt;query&gt;]</span></span>
<span id="LC482" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">authority</span><span class="o">;</span>         <span class="c1">// Registry or server</span></span>
<span id="LC483" class="line" lang="java"></span>
<span id="LC484" class="line" lang="java">    <span class="c1">// Server-based authority: [&lt;userInfo&gt;@]&lt;host&gt;[:&lt;port&gt;]</span></span>
<span id="LC485" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">userInfo</span><span class="o">;</span></span>
<span id="LC486" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">host</span><span class="o">;</span>              <span class="c1">// null ==&gt; registry-based</span></span>
<span id="LC487" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="kt">int</span> <span class="n">port</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span>            <span class="c1">// -1 ==&gt; undefined</span></span>
<span id="LC488" class="line" lang="java"></span>
<span id="LC489" class="line" lang="java">    <span class="c1">// Remaining components of hierarchical URIs</span></span>
<span id="LC490" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">path</span><span class="o">;</span>              <span class="c1">// null ==&gt; opaque</span></span>
<span id="LC491" class="line" lang="java">    <span class="kd">private</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">query</span><span class="o">;</span></span>
<span id="LC492" class="line" lang="java"></span>
<span id="LC493" class="line" lang="java">    <span class="c1">// The remaining fields may be computed on demand</span></span>
<span id="LC494" class="line" lang="java"></span>
<span id="LC495" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">schemeSpecificPart</span><span class="o">;</span></span>
<span id="LC496" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="kd">transient</span> <span class="kt">int</span> <span class="n">hash</span><span class="o">;</span>        <span class="c1">// Zero ==&gt; undefined</span></span>
<span id="LC497" class="line" lang="java"></span>
<span id="LC498" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">decodedUserInfo</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC499" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">decodedAuthority</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC500" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">decodedPath</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC501" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">decodedQuery</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC502" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">decodedFragment</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC503" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="kd">transient</span> <span class="nc">String</span> <span class="n">decodedSchemeSpecificPart</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC504" class="line" lang="java"></span>
<span id="LC505" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC506" class="line" lang="java"><span class="cm">     * The string form of this URI.</span></span>
<span id="LC507" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC508" class="line" lang="java"><span class="cm">     * @serial</span></span>
<span id="LC509" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC510" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="nc">String</span> <span class="n">string</span><span class="o">;</span>             <span class="c1">// The only serializable field</span></span>
<span id="LC511" class="line" lang="java"></span>
<span id="LC512" class="line" lang="java"></span>
<span id="LC513" class="line" lang="java"></span>
<span id="LC514" class="line" lang="java">    <span class="c1">// -- Constructors and factories --</span></span>
<span id="LC515" class="line" lang="java"></span>
<span id="LC516" class="line" lang="java">    <span class="kd">private</span> <span class="nf">URI</span><span class="o">()</span> <span class="o">{</span> <span class="o">}</span>                           <span class="c1">// Used internally</span></span>
<span id="LC517" class="line" lang="java"></span>
<span id="LC518" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC519" class="line" lang="java"><span class="cm">     * Constructs a URI by parsing the given string.</span></span>
<span id="LC520" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC521" class="line" lang="java"><span class="cm">     * &lt;p&gt; This constructor parses the given string exactly as specified by the</span></span>
<span id="LC522" class="line" lang="java"><span class="cm">     * grammar in &lt;a</span></span>
<span id="LC523" class="line" lang="java"><span class="cm">     * href="http://www.ietf.org/rfc/rfc2396.txt"&gt;RFC&amp;nbsp;2396&lt;/a&gt;,</span></span>
<span id="LC524" class="line" lang="java"><span class="cm">     * Appendix&amp;nbsp;A, &lt;b&gt;&lt;i&gt;except for the following deviations:&lt;/i&gt;&lt;/b&gt; &lt;/p&gt;</span></span>
<span id="LC525" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC526" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC527" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC528" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; An empty authority component is permitted as long as it is</span></span>
<span id="LC529" class="line" lang="java"><span class="cm">     *   followed by a non-empty path, a query component, or a fragment</span></span>
<span id="LC530" class="line" lang="java"><span class="cm">     *   component.  This allows the parsing of URIs such as</span></span>
<span id="LC531" class="line" lang="java"><span class="cm">     *   {@code "file:///foo/bar"}, which seems to be the intent of</span></span>
<span id="LC532" class="line" lang="java"><span class="cm">     *   RFC&amp;nbsp;2396 although the grammar does not permit it.  If the</span></span>
<span id="LC533" class="line" lang="java"><span class="cm">     *   authority component is empty then the user-information, host, and port</span></span>
<span id="LC534" class="line" lang="java"><span class="cm">     *   components are undefined. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC535" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC536" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Empty relative paths are permitted; this seems to be the</span></span>
<span id="LC537" class="line" lang="java"><span class="cm">     *   intent of RFC&amp;nbsp;2396 although the grammar does not permit it.  The</span></span>
<span id="LC538" class="line" lang="java"><span class="cm">     *   primary consequence of this deviation is that a standalone fragment</span></span>
<span id="LC539" class="line" lang="java"><span class="cm">     *   such as {@code "#foo"} parses as a relative URI with an empty path</span></span>
<span id="LC540" class="line" lang="java"><span class="cm">     *   and the given fragment, and can be usefully &lt;a</span></span>
<span id="LC541" class="line" lang="java"><span class="cm">     *   href="#resolve-frag"&gt;resolved&lt;/a&gt; against a base URI.</span></span>
<span id="LC542" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC543" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; IPv4 addresses in host components are parsed rigorously, as</span></span>
<span id="LC544" class="line" lang="java"><span class="cm">     *   specified by &lt;a</span></span>
<span id="LC545" class="line" lang="java"><span class="cm">     *   href="http://www.ietf.org/rfc/rfc2732.txt"&gt;RFC&amp;nbsp;2732&lt;/a&gt;: Each</span></span>
<span id="LC546" class="line" lang="java"><span class="cm">     *   element of a dotted-quad address must contain no more than three</span></span>
<span id="LC547" class="line" lang="java"><span class="cm">     *   decimal digits.  Each element is further constrained to have a value</span></span>
<span id="LC548" class="line" lang="java"><span class="cm">     *   no greater than 255. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC549" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC550" class="line" lang="java"><span class="cm">     *   &lt;li&gt; &lt;p&gt; Hostnames in host components that comprise only a single</span></span>
<span id="LC551" class="line" lang="java"><span class="cm">     *   domain label are permitted to start with an &lt;i&gt;alphanum&lt;/i&gt;</span></span>
<span id="LC552" class="line" lang="java"><span class="cm">     *   character. This seems to be the intent of &lt;a</span></span>
<span id="LC553" class="line" lang="java"><span class="cm">     *   href="http://www.ietf.org/rfc/rfc2396.txt"&gt;RFC&amp;nbsp;2396&lt;/a&gt;</span></span>
<span id="LC554" class="line" lang="java"><span class="cm">     *   section&amp;nbsp;3.2.2 although the grammar does not permit it. The</span></span>
<span id="LC555" class="line" lang="java"><span class="cm">     *   consequence of this deviation is that the authority component of a</span></span>
<span id="LC556" class="line" lang="java"><span class="cm">     *   hierarchical URI such as {@code s://123}, will parse as a server-based</span></span>
<span id="LC557" class="line" lang="java"><span class="cm">     *   authority. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC558" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC559" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; IPv6 addresses are permitted for the host component.  An IPv6</span></span>
<span id="LC560" class="line" lang="java"><span class="cm">     *   address must be enclosed in square brackets ({@code '['} and</span></span>
<span id="LC561" class="line" lang="java"><span class="cm">     *   {@code ']'}) as specified by &lt;a</span></span>
<span id="LC562" class="line" lang="java"><span class="cm">     *   href="http://www.ietf.org/rfc/rfc2732.txt"&gt;RFC&amp;nbsp;2732&lt;/a&gt;.  The</span></span>
<span id="LC563" class="line" lang="java"><span class="cm">     *   IPv6 address itself must parse according to &lt;a</span></span>
<span id="LC564" class="line" lang="java"><span class="cm">     *   href="http://www.ietf.org/rfc/rfc2373.txt"&gt;RFC&amp;nbsp;2373&lt;/a&gt;.  IPv6</span></span>
<span id="LC565" class="line" lang="java"><span class="cm">     *   addresses are further constrained to describe no more than sixteen</span></span>
<span id="LC566" class="line" lang="java"><span class="cm">     *   bytes of address information, a constraint implicit in RFC&amp;nbsp;2373</span></span>
<span id="LC567" class="line" lang="java"><span class="cm">     *   but not expressible in the grammar. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC568" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC569" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Characters in the &lt;i&gt;other&lt;/i&gt; category are permitted wherever</span></span>
<span id="LC570" class="line" lang="java"><span class="cm">     *   RFC&amp;nbsp;2396 permits &lt;i&gt;escaped&lt;/i&gt; octets, that is, in the</span></span>
<span id="LC571" class="line" lang="java"><span class="cm">     *   user-information, path, query, and fragment components, as well as in</span></span>
<span id="LC572" class="line" lang="java"><span class="cm">     *   the authority component if the authority is registry-based.  This</span></span>
<span id="LC573" class="line" lang="java"><span class="cm">     *   allows URIs to contain Unicode characters beyond those in the US-ASCII</span></span>
<span id="LC574" class="line" lang="java"><span class="cm">     *   character set. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC575" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC576" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC577" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC578" class="line" lang="java"><span class="cm">     * @param  str   The string to be parsed into a URI</span></span>
<span id="LC579" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC580" class="line" lang="java"><span class="cm">     * @throws  NullPointerException</span></span>
<span id="LC581" class="line" lang="java"><span class="cm">     *          If {@code str} is {@code null}</span></span>
<span id="LC582" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC583" class="line" lang="java"><span class="cm">     * @throws  URISyntaxException</span></span>
<span id="LC584" class="line" lang="java"><span class="cm">     *          If the given string violates RFC&amp;nbsp;2396, as augmented</span></span>
<span id="LC585" class="line" lang="java"><span class="cm">     *          by the above deviations</span></span>
<span id="LC586" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC587" class="line" lang="java">    <span class="kd">public</span> <span class="nf">URI</span><span class="o">(</span><span class="nc">String</span> <span class="n">str</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">URISyntaxException</span> <span class="o">{</span></span>
<span id="LC588" class="line" lang="java">        <span class="k">new</span> <span class="nf">Parser</span><span class="o">(</span><span class="n">str</span><span class="o">).</span><span class="na">parse</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC589" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC590" class="line" lang="java"></span>
<span id="LC591" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC592" class="line" lang="java"><span class="cm">     * Constructs a hierarchical URI from the given components.</span></span>
<span id="LC593" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC594" class="line" lang="java"><span class="cm">     * &lt;p&gt; If a scheme is given then the path, if also given, must either be</span></span>
<span id="LC595" class="line" lang="java"><span class="cm">     * empty or begin with a slash character ({@code '/'}).  Otherwise a</span></span>
<span id="LC596" class="line" lang="java"><span class="cm">     * component of the new URI may be left undefined by passing {@code null}</span></span>
<span id="LC597" class="line" lang="java"><span class="cm">     * for the corresponding parameter or, in the case of the {@code port}</span></span>
<span id="LC598" class="line" lang="java"><span class="cm">     * parameter, by passing {@code -1}.</span></span>
<span id="LC599" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC600" class="line" lang="java"><span class="cm">     * &lt;p&gt; This constructor first builds a URI string from the given components</span></span>
<span id="LC601" class="line" lang="java"><span class="cm">     * according to the rules specified in &lt;a</span></span>
<span id="LC602" class="line" lang="java"><span class="cm">     * href="http://www.ietf.org/rfc/rfc2396.txt"&gt;RFC&amp;nbsp;2396&lt;/a&gt;,</span></span>
<span id="LC603" class="line" lang="java"><span class="cm">     * section&amp;nbsp;5.2, step&amp;nbsp;7: &lt;/p&gt;</span></span>
<span id="LC604" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC605" class="line" lang="java"><span class="cm">     * &lt;ol&gt;</span></span>
<span id="LC606" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC607" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Initially, the result string is empty. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC608" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC609" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a scheme is given then it is appended to the result,</span></span>
<span id="LC610" class="line" lang="java"><span class="cm">     *   followed by a colon character ({@code ':'}).  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC611" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC612" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If user information, a host, or a port are given then the</span></span>
<span id="LC613" class="line" lang="java"><span class="cm">     *   string {@code "//"} is appended.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC614" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC615" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If user information is given then it is appended, followed by</span></span>
<span id="LC616" class="line" lang="java"><span class="cm">     *   a commercial-at character ({@code '@'}).  Any character not in the</span></span>
<span id="LC617" class="line" lang="java"><span class="cm">     *   &lt;i&gt;unreserved&lt;/i&gt;, &lt;i&gt;punct&lt;/i&gt;, &lt;i&gt;escaped&lt;/i&gt;, or &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC618" class="line" lang="java"><span class="cm">     *   categories is &lt;a href="#quote"&gt;quoted&lt;/a&gt;.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC619" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC620" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a host is given then it is appended.  If the host is a</span></span>
<span id="LC621" class="line" lang="java"><span class="cm">     *   literal IPv6 address but is not enclosed in square brackets</span></span>
<span id="LC622" class="line" lang="java"><span class="cm">     *   ({@code '['} and {@code ']'}) then the square brackets are added.</span></span>
<span id="LC623" class="line" lang="java"><span class="cm">     *   &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC624" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC625" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a port number is given then a colon character</span></span>
<span id="LC626" class="line" lang="java"><span class="cm">     *   ({@code ':'}) is appended, followed by the port number in decimal.</span></span>
<span id="LC627" class="line" lang="java"><span class="cm">     *   &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC628" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC629" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a path is given then it is appended.  Any character not in</span></span>
<span id="LC630" class="line" lang="java"><span class="cm">     *   the &lt;i&gt;unreserved&lt;/i&gt;, &lt;i&gt;punct&lt;/i&gt;, &lt;i&gt;escaped&lt;/i&gt;, or &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC631" class="line" lang="java"><span class="cm">     *   categories, and not equal to the slash character ({@code '/'}) or the</span></span>
<span id="LC632" class="line" lang="java"><span class="cm">     *   commercial-at character ({@code '@'}), is quoted.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC633" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC634" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a query is given then a question-mark character</span></span>
<span id="LC635" class="line" lang="java"><span class="cm">     *   ({@code '?'}) is appended, followed by the query.  Any character that</span></span>
<span id="LC636" class="line" lang="java"><span class="cm">     *   is not a &lt;a href="#legal-chars"&gt;legal URI character&lt;/a&gt; is quoted.</span></span>
<span id="LC637" class="line" lang="java"><span class="cm">     *   &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC638" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC639" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Finally, if a fragment is given then a hash character</span></span>
<span id="LC640" class="line" lang="java"><span class="cm">     *   ({@code '#'}) is appended, followed by the fragment.  Any character</span></span>
<span id="LC641" class="line" lang="java"><span class="cm">     *   that is not a legal URI character is quoted.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC642" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC643" class="line" lang="java"><span class="cm">     * &lt;/ol&gt;</span></span>
<span id="LC644" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC645" class="line" lang="java"><span class="cm">     * &lt;p&gt; The resulting URI string is then parsed as if by invoking the {@link</span></span>
<span id="LC646" class="line" lang="java"><span class="cm">     * #URI(String)} constructor and then invoking the {@link</span></span>
<span id="LC647" class="line" lang="java"><span class="cm">     * #parseServerAuthority()} method upon the result; this may cause a {@link</span></span>
<span id="LC648" class="line" lang="java"><span class="cm">     * URISyntaxException} to be thrown.  &lt;/p&gt;</span></span>
<span id="LC649" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC650" class="line" lang="java"><span class="cm">     * @param   scheme    Scheme name</span></span>
<span id="LC651" class="line" lang="java"><span class="cm">     * @param   userInfo  User name and authorization information</span></span>
<span id="LC652" class="line" lang="java"><span class="cm">     * @param   host      Host name</span></span>
<span id="LC653" class="line" lang="java"><span class="cm">     * @param   port      Port number</span></span>
<span id="LC654" class="line" lang="java"><span class="cm">     * @param   path      Path</span></span>
<span id="LC655" class="line" lang="java"><span class="cm">     * @param   query     Query</span></span>
<span id="LC656" class="line" lang="java"><span class="cm">     * @param   fragment  Fragment</span></span>
<span id="LC657" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC658" class="line" lang="java"><span class="cm">     * @throws URISyntaxException</span></span>
<span id="LC659" class="line" lang="java"><span class="cm">     *         If both a scheme and a path are given but the path is relative,</span></span>
<span id="LC660" class="line" lang="java"><span class="cm">     *         if the URI string constructed from the given components violates</span></span>
<span id="LC661" class="line" lang="java"><span class="cm">     *         RFC&amp;nbsp;2396, or if the authority component of the string is</span></span>
<span id="LC662" class="line" lang="java"><span class="cm">     *         present but cannot be parsed as a server-based authority</span></span>
<span id="LC663" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC664" class="line" lang="java">    <span class="kd">public</span> <span class="nf">URI</span><span class="o">(</span><span class="nc">String</span> <span class="n">scheme</span><span class="o">,</span></span>
<span id="LC665" class="line" lang="java">               <span class="nc">String</span> <span class="n">userInfo</span><span class="o">,</span> <span class="nc">String</span> <span class="n">host</span><span class="o">,</span> <span class="kt">int</span> <span class="n">port</span><span class="o">,</span></span>
<span id="LC666" class="line" lang="java">               <span class="nc">String</span> <span class="n">path</span><span class="o">,</span> <span class="nc">String</span> <span class="n">query</span><span class="o">,</span> <span class="nc">String</span> <span class="n">fragment</span><span class="o">)</span></span>
<span id="LC667" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC668" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC669" class="line" lang="java">        <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">toString</span><span class="o">(</span><span class="n">scheme</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span></span>
<span id="LC670" class="line" lang="java">                            <span class="kc">null</span><span class="o">,</span> <span class="n">userInfo</span><span class="o">,</span> <span class="n">host</span><span class="o">,</span> <span class="n">port</span><span class="o">,</span></span>
<span id="LC671" class="line" lang="java">                            <span class="n">path</span><span class="o">,</span> <span class="n">query</span><span class="o">,</span> <span class="n">fragment</span><span class="o">);</span></span>
<span id="LC672" class="line" lang="java">        <span class="n">checkPath</span><span class="o">(</span><span class="n">s</span><span class="o">,</span> <span class="n">scheme</span><span class="o">,</span> <span class="n">path</span><span class="o">);</span></span>
<span id="LC673" class="line" lang="java">        <span class="k">new</span> <span class="nf">Parser</span><span class="o">(</span><span class="n">s</span><span class="o">).</span><span class="na">parse</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></span>
<span id="LC674" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC675" class="line" lang="java"></span>
<span id="LC676" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC677" class="line" lang="java"><span class="cm">     * Constructs a hierarchical URI from the given components.</span></span>
<span id="LC678" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC679" class="line" lang="java"><span class="cm">     * &lt;p&gt; If a scheme is given then the path, if also given, must either be</span></span>
<span id="LC680" class="line" lang="java"><span class="cm">     * empty or begin with a slash character ({@code '/'}).  Otherwise a</span></span>
<span id="LC681" class="line" lang="java"><span class="cm">     * component of the new URI may be left undefined by passing {@code null}</span></span>
<span id="LC682" class="line" lang="java"><span class="cm">     * for the corresponding parameter.</span></span>
<span id="LC683" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC684" class="line" lang="java"><span class="cm">     * &lt;p&gt; This constructor first builds a URI string from the given components</span></span>
<span id="LC685" class="line" lang="java"><span class="cm">     * according to the rules specified in &lt;a</span></span>
<span id="LC686" class="line" lang="java"><span class="cm">     * href="http://www.ietf.org/rfc/rfc2396.txt"&gt;RFC&amp;nbsp;2396&lt;/a&gt;,</span></span>
<span id="LC687" class="line" lang="java"><span class="cm">     * section&amp;nbsp;5.2, step&amp;nbsp;7: &lt;/p&gt;</span></span>
<span id="LC688" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC689" class="line" lang="java"><span class="cm">     * &lt;ol&gt;</span></span>
<span id="LC690" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC691" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Initially, the result string is empty.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC692" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC693" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a scheme is given then it is appended to the result,</span></span>
<span id="LC694" class="line" lang="java"><span class="cm">     *   followed by a colon character ({@code ':'}).  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC695" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC696" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If an authority is given then the string {@code "//"} is</span></span>
<span id="LC697" class="line" lang="java"><span class="cm">     *   appended, followed by the authority.  If the authority contains a</span></span>
<span id="LC698" class="line" lang="java"><span class="cm">     *   literal IPv6 address then the address must be enclosed in square</span></span>
<span id="LC699" class="line" lang="java"><span class="cm">     *   brackets ({@code '['} and {@code ']'}).  Any character not in the</span></span>
<span id="LC700" class="line" lang="java"><span class="cm">     *   &lt;i&gt;unreserved&lt;/i&gt;, &lt;i&gt;punct&lt;/i&gt;, &lt;i&gt;escaped&lt;/i&gt;, or &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC701" class="line" lang="java"><span class="cm">     *   categories, and not equal to the commercial-at character</span></span>
<span id="LC702" class="line" lang="java"><span class="cm">     *   ({@code '@'}), is &lt;a href="#quote"&gt;quoted&lt;/a&gt;.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC703" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC704" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a path is given then it is appended.  Any character not in</span></span>
<span id="LC705" class="line" lang="java"><span class="cm">     *   the &lt;i&gt;unreserved&lt;/i&gt;, &lt;i&gt;punct&lt;/i&gt;, &lt;i&gt;escaped&lt;/i&gt;, or &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC706" class="line" lang="java"><span class="cm">     *   categories, and not equal to the slash character ({@code '/'}) or the</span></span>
<span id="LC707" class="line" lang="java"><span class="cm">     *   commercial-at character ({@code '@'}), is quoted.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC708" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC709" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a query is given then a question-mark character</span></span>
<span id="LC710" class="line" lang="java"><span class="cm">     *   ({@code '?'}) is appended, followed by the query.  Any character that</span></span>
<span id="LC711" class="line" lang="java"><span class="cm">     *   is not a &lt;a href="#legal-chars"&gt;legal URI character&lt;/a&gt; is quoted.</span></span>
<span id="LC712" class="line" lang="java"><span class="cm">     *   &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC713" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC714" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Finally, if a fragment is given then a hash character</span></span>
<span id="LC715" class="line" lang="java"><span class="cm">     *   ({@code '#'}) is appended, followed by the fragment.  Any character</span></span>
<span id="LC716" class="line" lang="java"><span class="cm">     *   that is not a legal URI character is quoted.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC717" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC718" class="line" lang="java"><span class="cm">     * &lt;/ol&gt;</span></span>
<span id="LC719" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC720" class="line" lang="java"><span class="cm">     * &lt;p&gt; The resulting URI string is then parsed as if by invoking the {@link</span></span>
<span id="LC721" class="line" lang="java"><span class="cm">     * #URI(String)} constructor and then invoking the {@link</span></span>
<span id="LC722" class="line" lang="java"><span class="cm">     * #parseServerAuthority()} method upon the result; this may cause a {@link</span></span>
<span id="LC723" class="line" lang="java"><span class="cm">     * URISyntaxException} to be thrown.  &lt;/p&gt;</span></span>
<span id="LC724" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC725" class="line" lang="java"><span class="cm">     * @param   scheme     Scheme name</span></span>
<span id="LC726" class="line" lang="java"><span class="cm">     * @param   authority  Authority</span></span>
<span id="LC727" class="line" lang="java"><span class="cm">     * @param   path       Path</span></span>
<span id="LC728" class="line" lang="java"><span class="cm">     * @param   query      Query</span></span>
<span id="LC729" class="line" lang="java"><span class="cm">     * @param   fragment   Fragment</span></span>
<span id="LC730" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC731" class="line" lang="java"><span class="cm">     * @throws URISyntaxException</span></span>
<span id="LC732" class="line" lang="java"><span class="cm">     *         If both a scheme and a path are given but the path is relative,</span></span>
<span id="LC733" class="line" lang="java"><span class="cm">     *         if the URI string constructed from the given components violates</span></span>
<span id="LC734" class="line" lang="java"><span class="cm">     *         RFC&amp;nbsp;2396, or if the authority component of the string is</span></span>
<span id="LC735" class="line" lang="java"><span class="cm">     *         present but cannot be parsed as a server-based authority</span></span>
<span id="LC736" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC737" class="line" lang="java">    <span class="kd">public</span> <span class="nf">URI</span><span class="o">(</span><span class="nc">String</span> <span class="n">scheme</span><span class="o">,</span></span>
<span id="LC738" class="line" lang="java">               <span class="nc">String</span> <span class="n">authority</span><span class="o">,</span></span>
<span id="LC739" class="line" lang="java">               <span class="nc">String</span> <span class="n">path</span><span class="o">,</span> <span class="nc">String</span> <span class="n">query</span><span class="o">,</span> <span class="nc">String</span> <span class="n">fragment</span><span class="o">)</span></span>
<span id="LC740" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC741" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC742" class="line" lang="java">        <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">toString</span><span class="o">(</span><span class="n">scheme</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span></span>
<span id="LC743" class="line" lang="java">                            <span class="n">authority</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="o">-</span><span class="mi">1</span><span class="o">,</span></span>
<span id="LC744" class="line" lang="java">                            <span class="n">path</span><span class="o">,</span> <span class="n">query</span><span class="o">,</span> <span class="n">fragment</span><span class="o">);</span></span>
<span id="LC745" class="line" lang="java">        <span class="n">checkPath</span><span class="o">(</span><span class="n">s</span><span class="o">,</span> <span class="n">scheme</span><span class="o">,</span> <span class="n">path</span><span class="o">);</span></span>
<span id="LC746" class="line" lang="java">        <span class="k">new</span> <span class="nf">Parser</span><span class="o">(</span><span class="n">s</span><span class="o">).</span><span class="na">parse</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC747" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC748" class="line" lang="java"></span>
<span id="LC749" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC750" class="line" lang="java"><span class="cm">     * Constructs a hierarchical URI from the given components.</span></span>
<span id="LC751" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC752" class="line" lang="java"><span class="cm">     * &lt;p&gt; A component may be left undefined by passing {@code null}.</span></span>
<span id="LC753" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC754" class="line" lang="java"><span class="cm">     * &lt;p&gt; This convenience constructor works as if by invoking the</span></span>
<span id="LC755" class="line" lang="java"><span class="cm">     * seven-argument constructor as follows:</span></span>
<span id="LC756" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC757" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;</span></span>
<span id="LC758" class="line" lang="java"><span class="cm">     * {@code new} {@link #URI(String, String, String, int, String, String, String)</span></span>
<span id="LC759" class="line" lang="java"><span class="cm">     * URI}{@code (scheme, null, host, -1, path, null, fragment);}</span></span>
<span id="LC760" class="line" lang="java"><span class="cm">     * &lt;/blockquote&gt;</span></span>
<span id="LC761" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC762" class="line" lang="java"><span class="cm">     * @param   scheme    Scheme name</span></span>
<span id="LC763" class="line" lang="java"><span class="cm">     * @param   host      Host name</span></span>
<span id="LC764" class="line" lang="java"><span class="cm">     * @param   path      Path</span></span>
<span id="LC765" class="line" lang="java"><span class="cm">     * @param   fragment  Fragment</span></span>
<span id="LC766" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC767" class="line" lang="java"><span class="cm">     * @throws  URISyntaxException</span></span>
<span id="LC768" class="line" lang="java"><span class="cm">     *          If the URI string constructed from the given components</span></span>
<span id="LC769" class="line" lang="java"><span class="cm">     *          violates RFC&amp;nbsp;2396</span></span>
<span id="LC770" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC771" class="line" lang="java">    <span class="kd">public</span> <span class="nf">URI</span><span class="o">(</span><span class="nc">String</span> <span class="n">scheme</span><span class="o">,</span> <span class="nc">String</span> <span class="n">host</span><span class="o">,</span> <span class="nc">String</span> <span class="n">path</span><span class="o">,</span> <span class="nc">String</span> <span class="n">fragment</span><span class="o">)</span></span>
<span id="LC772" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC773" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC774" class="line" lang="java">        <span class="k">this</span><span class="o">(</span><span class="n">scheme</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="n">host</span><span class="o">,</span> <span class="o">-</span><span class="mi">1</span><span class="o">,</span> <span class="n">path</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="n">fragment</span><span class="o">);</span></span>
<span id="LC775" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC776" class="line" lang="java"></span>
<span id="LC777" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC778" class="line" lang="java"><span class="cm">     * Constructs a URI from the given components.</span></span>
<span id="LC779" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC780" class="line" lang="java"><span class="cm">     * &lt;p&gt; A component may be left undefined by passing {@code null}.</span></span>
<span id="LC781" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC782" class="line" lang="java"><span class="cm">     * &lt;p&gt; This constructor first builds a URI in string form using the given</span></span>
<span id="LC783" class="line" lang="java"><span class="cm">     * components as follows:  &lt;/p&gt;</span></span>
<span id="LC784" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC785" class="line" lang="java"><span class="cm">     * &lt;ol&gt;</span></span>
<span id="LC786" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC787" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Initially, the result string is empty.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC788" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC789" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a scheme is given then it is appended to the result,</span></span>
<span id="LC790" class="line" lang="java"><span class="cm">     *   followed by a colon character ({@code ':'}).  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC791" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC792" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a scheme-specific part is given then it is appended.  Any</span></span>
<span id="LC793" class="line" lang="java"><span class="cm">     *   character that is not a &lt;a href="#legal-chars"&gt;legal URI character&lt;/a&gt;</span></span>
<span id="LC794" class="line" lang="java"><span class="cm">     *   is &lt;a href="#quote"&gt;quoted&lt;/a&gt;.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC795" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC796" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Finally, if a fragment is given then a hash character</span></span>
<span id="LC797" class="line" lang="java"><span class="cm">     *   ({@code '#'}) is appended to the string, followed by the fragment.</span></span>
<span id="LC798" class="line" lang="java"><span class="cm">     *   Any character that is not a legal URI character is quoted.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC799" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC800" class="line" lang="java"><span class="cm">     * &lt;/ol&gt;</span></span>
<span id="LC801" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC802" class="line" lang="java"><span class="cm">     * &lt;p&gt; The resulting URI string is then parsed in order to create the new</span></span>
<span id="LC803" class="line" lang="java"><span class="cm">     * URI instance as if by invoking the {@link #URI(String)} constructor;</span></span>
<span id="LC804" class="line" lang="java"><span class="cm">     * this may cause a {@link URISyntaxException} to be thrown.  &lt;/p&gt;</span></span>
<span id="LC805" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC806" class="line" lang="java"><span class="cm">     * @param   scheme    Scheme name</span></span>
<span id="LC807" class="line" lang="java"><span class="cm">     * @param   ssp       Scheme-specific part</span></span>
<span id="LC808" class="line" lang="java"><span class="cm">     * @param   fragment  Fragment</span></span>
<span id="LC809" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC810" class="line" lang="java"><span class="cm">     * @throws  URISyntaxException</span></span>
<span id="LC811" class="line" lang="java"><span class="cm">     *          If the URI string constructed from the given components</span></span>
<span id="LC812" class="line" lang="java"><span class="cm">     *          violates RFC&amp;nbsp;2396</span></span>
<span id="LC813" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC814" class="line" lang="java">    <span class="kd">public</span> <span class="nf">URI</span><span class="o">(</span><span class="nc">String</span> <span class="n">scheme</span><span class="o">,</span> <span class="nc">String</span> <span class="n">ssp</span><span class="o">,</span> <span class="nc">String</span> <span class="n">fragment</span><span class="o">)</span></span>
<span id="LC815" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC816" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC817" class="line" lang="java">        <span class="k">new</span> <span class="nf">Parser</span><span class="o">(</span><span class="n">toString</span><span class="o">(</span><span class="n">scheme</span><span class="o">,</span> <span class="n">ssp</span><span class="o">,</span></span>
<span id="LC818" class="line" lang="java">                            <span class="kc">null</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="o">-</span><span class="mi">1</span><span class="o">,</span></span>
<span id="LC819" class="line" lang="java">                            <span class="kc">null</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="n">fragment</span><span class="o">))</span></span>
<span id="LC820" class="line" lang="java">            <span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC821" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC822" class="line" lang="java"></span>
<span id="LC823" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC824" class="line" lang="java"><span class="cm">     * Creates a URI by parsing the given string.</span></span>
<span id="LC825" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC826" class="line" lang="java"><span class="cm">     * &lt;p&gt; This convenience factory method works as if by invoking the {@link</span></span>
<span id="LC827" class="line" lang="java"><span class="cm">     * #URI(String)} constructor; any {@link URISyntaxException} thrown by the</span></span>
<span id="LC828" class="line" lang="java"><span class="cm">     * constructor is caught and wrapped in a new {@link</span></span>
<span id="LC829" class="line" lang="java"><span class="cm">     * IllegalArgumentException} object, which is then thrown.</span></span>
<span id="LC830" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC831" class="line" lang="java"><span class="cm">     * &lt;p&gt; This method is provided for use in situations where it is known that</span></span>
<span id="LC832" class="line" lang="java"><span class="cm">     * the given string is a legal URI, for example for URI constants declared</span></span>
<span id="LC833" class="line" lang="java"><span class="cm">     * within in a program, and so it would be considered a programming error</span></span>
<span id="LC834" class="line" lang="java"><span class="cm">     * for the string not to parse as such.  The constructors, which throw</span></span>
<span id="LC835" class="line" lang="java"><span class="cm">     * {@link URISyntaxException} directly, should be used situations where a</span></span>
<span id="LC836" class="line" lang="java"><span class="cm">     * URI is being constructed from user input or from some other source that</span></span>
<span id="LC837" class="line" lang="java"><span class="cm">     * may be prone to errors.  &lt;/p&gt;</span></span>
<span id="LC838" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC839" class="line" lang="java"><span class="cm">     * @param  str   The string to be parsed into a URI</span></span>
<span id="LC840" class="line" lang="java"><span class="cm">     * @return The new URI</span></span>
<span id="LC841" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC842" class="line" lang="java"><span class="cm">     * @throws  NullPointerException</span></span>
<span id="LC843" class="line" lang="java"><span class="cm">     *          If {@code str} is {@code null}</span></span>
<span id="LC844" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC845" class="line" lang="java"><span class="cm">     * @throws  IllegalArgumentException</span></span>
<span id="LC846" class="line" lang="java"><span class="cm">     *          If the given string violates RFC&amp;nbsp;2396</span></span>
<span id="LC847" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC848" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="no">URI</span> <span class="nf">create</span><span class="o">(</span><span class="nc">String</span> <span class="n">str</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC849" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC850" class="line" lang="java">            <span class="k">return</span> <span class="k">new</span> <span class="nf">URI</span><span class="o">(</span><span class="n">str</span><span class="o">);</span></span>
<span id="LC851" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">URISyntaxException</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC852" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">getMessage</span><span class="o">(),</span> <span class="n">x</span><span class="o">);</span></span>
<span id="LC853" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC854" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC855" class="line" lang="java"></span>
<span id="LC856" class="line" lang="java"></span>
<span id="LC857" class="line" lang="java">    <span class="c1">// -- Operations --</span></span>
<span id="LC858" class="line" lang="java"></span>
<span id="LC859" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC860" class="line" lang="java"><span class="cm">     * Attempts to parse this URI's authority component, if defined, into</span></span>
<span id="LC861" class="line" lang="java"><span class="cm">     * user-information, host, and port components.</span></span>
<span id="LC862" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC863" class="line" lang="java"><span class="cm">     * &lt;p&gt; If this URI's authority component has already been recognized as</span></span>
<span id="LC864" class="line" lang="java"><span class="cm">     * being server-based then it will already have been parsed into</span></span>
<span id="LC865" class="line" lang="java"><span class="cm">     * user-information, host, and port components.  In this case, or if this</span></span>
<span id="LC866" class="line" lang="java"><span class="cm">     * URI has no authority component, this method simply returns this URI.</span></span>
<span id="LC867" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC868" class="line" lang="java"><span class="cm">     * &lt;p&gt; Otherwise this method attempts once more to parse the authority</span></span>
<span id="LC869" class="line" lang="java"><span class="cm">     * component into user-information, host, and port components, and throws</span></span>
<span id="LC870" class="line" lang="java"><span class="cm">     * an exception describing why the authority component could not be parsed</span></span>
<span id="LC871" class="line" lang="java"><span class="cm">     * in that way.</span></span>
<span id="LC872" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC873" class="line" lang="java"><span class="cm">     * &lt;p&gt; This method is provided because the generic URI syntax specified in</span></span>
<span id="LC874" class="line" lang="java"><span class="cm">     * &lt;a href="http://www.ietf.org/rfc/rfc2396.txt"&gt;RFC&amp;nbsp;2396&lt;/a&gt;</span></span>
<span id="LC875" class="line" lang="java"><span class="cm">     * cannot always distinguish a malformed server-based authority from a</span></span>
<span id="LC876" class="line" lang="java"><span class="cm">     * legitimate registry-based authority.  It must therefore treat some</span></span>
<span id="LC877" class="line" lang="java"><span class="cm">     * instances of the former as instances of the latter.  The authority</span></span>
<span id="LC878" class="line" lang="java"><span class="cm">     * component in the URI string {@code "//foo:bar"}, for example, is not a</span></span>
<span id="LC879" class="line" lang="java"><span class="cm">     * legal server-based authority but it is legal as a registry-based</span></span>
<span id="LC880" class="line" lang="java"><span class="cm">     * authority.</span></span>
<span id="LC881" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC882" class="line" lang="java"><span class="cm">     * &lt;p&gt; In many common situations, for example when working URIs that are</span></span>
<span id="LC883" class="line" lang="java"><span class="cm">     * known to be either URNs or URLs, the hierarchical URIs being used will</span></span>
<span id="LC884" class="line" lang="java"><span class="cm">     * always be server-based.  They therefore must either be parsed as such or</span></span>
<span id="LC885" class="line" lang="java"><span class="cm">     * treated as an error.  In these cases a statement such as</span></span>
<span id="LC886" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC887" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;</span></span>
<span id="LC888" class="line" lang="java"><span class="cm">     * {@code URI }&lt;i&gt;u&lt;/i&gt;{@code  = new URI(str).parseServerAuthority();}</span></span>
<span id="LC889" class="line" lang="java"><span class="cm">     * &lt;/blockquote&gt;</span></span>
<span id="LC890" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC891" class="line" lang="java"><span class="cm">     * &lt;p&gt; can be used to ensure that &lt;i&gt;u&lt;/i&gt; always refers to a URI that, if</span></span>
<span id="LC892" class="line" lang="java"><span class="cm">     * it has an authority component, has a server-based authority with proper</span></span>
<span id="LC893" class="line" lang="java"><span class="cm">     * user-information, host, and port components.  Invoking this method also</span></span>
<span id="LC894" class="line" lang="java"><span class="cm">     * ensures that if the authority could not be parsed in that way then an</span></span>
<span id="LC895" class="line" lang="java"><span class="cm">     * appropriate diagnostic message can be issued based upon the exception</span></span>
<span id="LC896" class="line" lang="java"><span class="cm">     * that is thrown. &lt;/p&gt;</span></span>
<span id="LC897" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC898" class="line" lang="java"><span class="cm">     * @return  A URI whose authority field has been parsed</span></span>
<span id="LC899" class="line" lang="java"><span class="cm">     *          as a server-based authority</span></span>
<span id="LC900" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC901" class="line" lang="java"><span class="cm">     * @throws  URISyntaxException</span></span>
<span id="LC902" class="line" lang="java"><span class="cm">     *          If the authority component of this URI is defined</span></span>
<span id="LC903" class="line" lang="java"><span class="cm">     *          but cannot be parsed as a server-based authority</span></span>
<span id="LC904" class="line" lang="java"><span class="cm">     *          according to RFC&amp;nbsp;2396</span></span>
<span id="LC905" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC906" class="line" lang="java">    <span class="kd">public</span> <span class="no">URI</span> <span class="nf">parseServerAuthority</span><span class="o">()</span></span>
<span id="LC907" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC908" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC909" class="line" lang="java">        <span class="c1">// We could be clever and cache the error message and index from the</span></span>
<span id="LC910" class="line" lang="java">        <span class="c1">// exception thrown during the original parse, but that would require</span></span>
<span id="LC911" class="line" lang="java">        <span class="c1">// either more fields or a more-obscure representation.</span></span>
<span id="LC912" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">host</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">||</span> <span class="o">(</span><span class="n">authority</span> <span class="o">==</span> <span class="kc">null</span><span class="o">))</span></span>
<span id="LC913" class="line" lang="java">            <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC914" class="line" lang="java">        <span class="n">defineString</span><span class="o">();</span></span>
<span id="LC915" class="line" lang="java">        <span class="k">new</span> <span class="nf">Parser</span><span class="o">(</span><span class="n">string</span><span class="o">).</span><span class="na">parse</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></span>
<span id="LC916" class="line" lang="java">        <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC917" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC918" class="line" lang="java"></span>
<span id="LC919" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC920" class="line" lang="java"><span class="cm">     * Normalizes this URI's path.</span></span>
<span id="LC921" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC922" class="line" lang="java"><span class="cm">     * &lt;p&gt; If this URI is opaque, or if its path is already in normal form,</span></span>
<span id="LC923" class="line" lang="java"><span class="cm">     * then this URI is returned.  Otherwise a new URI is constructed that is</span></span>
<span id="LC924" class="line" lang="java"><span class="cm">     * identical to this URI except that its path is computed by normalizing</span></span>
<span id="LC925" class="line" lang="java"><span class="cm">     * this URI's path in a manner consistent with &lt;a</span></span>
<span id="LC926" class="line" lang="java"><span class="cm">     * href="http://www.ietf.org/rfc/rfc2396.txt"&gt;RFC&amp;nbsp;2396&lt;/a&gt;,</span></span>
<span id="LC927" class="line" lang="java"><span class="cm">     * section&amp;nbsp;5.2, step&amp;nbsp;6, sub-steps&amp;nbsp;c through&amp;nbsp;f; that is:</span></span>
<span id="LC928" class="line" lang="java"><span class="cm">     * &lt;/p&gt;</span></span>
<span id="LC929" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC930" class="line" lang="java"><span class="cm">     * &lt;ol&gt;</span></span>
<span id="LC931" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC932" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; All {@code "."} segments are removed. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC933" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC934" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If a {@code ".."} segment is preceded by a non-{@code ".."}</span></span>
<span id="LC935" class="line" lang="java"><span class="cm">     *   segment then both of these segments are removed.  This step is</span></span>
<span id="LC936" class="line" lang="java"><span class="cm">     *   repeated until it is no longer applicable. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC937" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC938" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If the path is relative, and if its first segment contains a</span></span>
<span id="LC939" class="line" lang="java"><span class="cm">     *   colon character ({@code ':'}), then a {@code "."} segment is</span></span>
<span id="LC940" class="line" lang="java"><span class="cm">     *   prepended.  This prevents a relative URI with a path such as</span></span>
<span id="LC941" class="line" lang="java"><span class="cm">     *   {@code "a:b/c/d"} from later being re-parsed as an opaque URI with a</span></span>
<span id="LC942" class="line" lang="java"><span class="cm">     *   scheme of {@code "a"} and a scheme-specific part of {@code "b/c/d"}.</span></span>
<span id="LC943" class="line" lang="java"><span class="cm">     *   &lt;b&gt;&lt;i&gt;(Deviation from RFC&amp;nbsp;2396)&lt;/i&gt;&lt;/b&gt; &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC944" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC945" class="line" lang="java"><span class="cm">     * &lt;/ol&gt;</span></span>
<span id="LC946" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC947" class="line" lang="java"><span class="cm">     * &lt;p&gt; A normalized path will begin with one or more {@code ".."} segments</span></span>
<span id="LC948" class="line" lang="java"><span class="cm">     * if there were insufficient non-{@code ".."} segments preceding them to</span></span>
<span id="LC949" class="line" lang="java"><span class="cm">     * allow their removal.  A normalized path will begin with a {@code "."}</span></span>
<span id="LC950" class="line" lang="java"><span class="cm">     * segment if one was inserted by step 3 above.  Otherwise, a normalized</span></span>
<span id="LC951" class="line" lang="java"><span class="cm">     * path will not contain any {@code "."} or {@code ".."} segments. &lt;/p&gt;</span></span>
<span id="LC952" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC953" class="line" lang="java"><span class="cm">     * @return  A URI equivalent to this URI,</span></span>
<span id="LC954" class="line" lang="java"><span class="cm">     *          but whose path is in normal form</span></span>
<span id="LC955" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC956" class="line" lang="java">    <span class="kd">public</span> <span class="no">URI</span> <span class="nf">normalize</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC957" class="line" lang="java">        <span class="k">return</span> <span class="nf">normalize</span><span class="o">(</span><span class="k">this</span><span class="o">);</span></span>
<span id="LC958" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC959" class="line" lang="java"></span>
<span id="LC960" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC961" class="line" lang="java"><span class="cm">     * Resolves the given URI against this URI.</span></span>
<span id="LC962" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC963" class="line" lang="java"><span class="cm">     * &lt;p&gt; If the given URI is already absolute, or if this URI is opaque, then</span></span>
<span id="LC964" class="line" lang="java"><span class="cm">     * the given URI is returned.</span></span>
<span id="LC965" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC966" class="line" lang="java"><span class="cm">     * &lt;p&gt;&lt;a name="resolve-frag"&gt;&lt;/a&gt; If the given URI's fragment component is</span></span>
<span id="LC967" class="line" lang="java"><span class="cm">     * defined, its path component is empty, and its scheme, authority, and</span></span>
<span id="LC968" class="line" lang="java"><span class="cm">     * query components are undefined, then a URI with the given fragment but</span></span>
<span id="LC969" class="line" lang="java"><span class="cm">     * with all other components equal to those of this URI is returned.  This</span></span>
<span id="LC970" class="line" lang="java"><span class="cm">     * allows a URI representing a standalone fragment reference, such as</span></span>
<span id="LC971" class="line" lang="java"><span class="cm">     * {@code "#foo"}, to be usefully resolved against a base URI.</span></span>
<span id="LC972" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC973" class="line" lang="java"><span class="cm">     * &lt;p&gt; Otherwise this method constructs a new hierarchical URI in a manner</span></span>
<span id="LC974" class="line" lang="java"><span class="cm">     * consistent with &lt;a</span></span>
<span id="LC975" class="line" lang="java"><span class="cm">     * href="http://www.ietf.org/rfc/rfc2396.txt"&gt;RFC&amp;nbsp;2396&lt;/a&gt;,</span></span>
<span id="LC976" class="line" lang="java"><span class="cm">     * section&amp;nbsp;5.2; that is: &lt;/p&gt;</span></span>
<span id="LC977" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC978" class="line" lang="java"><span class="cm">     * &lt;ol&gt;</span></span>
<span id="LC979" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC980" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; A new URI is constructed with this URI's scheme and the given</span></span>
<span id="LC981" class="line" lang="java"><span class="cm">     *   URI's query and fragment components. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC982" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC983" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If the given URI has an authority component then the new URI's</span></span>
<span id="LC984" class="line" lang="java"><span class="cm">     *   authority and path are taken from the given URI. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC985" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC986" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Otherwise the new URI's authority component is copied from</span></span>
<span id="LC987" class="line" lang="java"><span class="cm">     *   this URI, and its path is computed as follows: &lt;/p&gt;</span></span>
<span id="LC988" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC989" class="line" lang="java"><span class="cm">     *   &lt;ol&gt;</span></span>
<span id="LC990" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC991" class="line" lang="java"><span class="cm">     *     &lt;li&gt;&lt;p&gt; If the given URI's path is absolute then the new URI's path</span></span>
<span id="LC992" class="line" lang="java"><span class="cm">     *     is taken from the given URI. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC993" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC994" class="line" lang="java"><span class="cm">     *     &lt;li&gt;&lt;p&gt; Otherwise the given URI's path is relative, and so the new</span></span>
<span id="LC995" class="line" lang="java"><span class="cm">     *     URI's path is computed by resolving the path of the given URI</span></span>
<span id="LC996" class="line" lang="java"><span class="cm">     *     against the path of this URI.  This is done by concatenating all but</span></span>
<span id="LC997" class="line" lang="java"><span class="cm">     *     the last segment of this URI's path, if any, with the given URI's</span></span>
<span id="LC998" class="line" lang="java"><span class="cm">     *     path and then normalizing the result as if by invoking the {@link</span></span>
<span id="LC999" class="line" lang="java"><span class="cm">     *     #normalize() normalize} method. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1000" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1001" class="line" lang="java"><span class="cm">     *   &lt;/ol&gt;&lt;/li&gt;</span></span>
<span id="LC1002" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1003" class="line" lang="java"><span class="cm">     * &lt;/ol&gt;</span></span>
<span id="LC1004" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1005" class="line" lang="java"><span class="cm">     * &lt;p&gt; The result of this method is absolute if, and only if, either this</span></span>
<span id="LC1006" class="line" lang="java"><span class="cm">     * URI is absolute or the given URI is absolute.  &lt;/p&gt;</span></span>
<span id="LC1007" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1008" class="line" lang="java"><span class="cm">     * @param  uri  The URI to be resolved against this URI</span></span>
<span id="LC1009" class="line" lang="java"><span class="cm">     * @return The resulting URI</span></span>
<span id="LC1010" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1011" class="line" lang="java"><span class="cm">     * @throws  NullPointerException</span></span>
<span id="LC1012" class="line" lang="java"><span class="cm">     *          If {@code uri} is {@code null}</span></span>
<span id="LC1013" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1014" class="line" lang="java">    <span class="kd">public</span> <span class="no">URI</span> <span class="nf">resolve</span><span class="o">(</span><span class="no">URI</span> <span class="n">uri</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1015" class="line" lang="java">        <span class="k">return</span> <span class="nf">resolve</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">uri</span><span class="o">);</span></span>
<span id="LC1016" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1017" class="line" lang="java"></span>
<span id="LC1018" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1019" class="line" lang="java"><span class="cm">     * Constructs a new URI by parsing the given string and then resolving it</span></span>
<span id="LC1020" class="line" lang="java"><span class="cm">     * against this URI.</span></span>
<span id="LC1021" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1022" class="line" lang="java"><span class="cm">     * &lt;p&gt; This convenience method works as if invoking it were equivalent to</span></span>
<span id="LC1023" class="line" lang="java"><span class="cm">     * evaluating the expression {@link #resolve(java.net.URI)</span></span>
<span id="LC1024" class="line" lang="java"><span class="cm">     * resolve}{@code (URI.}{@link #create(String) create}{@code (str))}. &lt;/p&gt;</span></span>
<span id="LC1025" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1026" class="line" lang="java"><span class="cm">     * @param  str   The string to be parsed into a URI</span></span>
<span id="LC1027" class="line" lang="java"><span class="cm">     * @return The resulting URI</span></span>
<span id="LC1028" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1029" class="line" lang="java"><span class="cm">     * @throws  NullPointerException</span></span>
<span id="LC1030" class="line" lang="java"><span class="cm">     *          If {@code str} is {@code null}</span></span>
<span id="LC1031" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1032" class="line" lang="java"><span class="cm">     * @throws  IllegalArgumentException</span></span>
<span id="LC1033" class="line" lang="java"><span class="cm">     *          If the given string violates RFC&amp;nbsp;2396</span></span>
<span id="LC1034" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1035" class="line" lang="java">    <span class="kd">public</span> <span class="no">URI</span> <span class="nf">resolve</span><span class="o">(</span><span class="nc">String</span> <span class="n">str</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1036" class="line" lang="java">        <span class="k">return</span> <span class="nf">resolve</span><span class="o">(</span><span class="no">URI</span><span class="o">.</span><span class="na">create</span><span class="o">(</span><span class="n">str</span><span class="o">));</span></span>
<span id="LC1037" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1038" class="line" lang="java"></span>
<span id="LC1039" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1040" class="line" lang="java"><span class="cm">     * Relativizes the given URI against this URI.</span></span>
<span id="LC1041" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1042" class="line" lang="java"><span class="cm">     * &lt;p&gt; The relativization of the given URI against this URI is computed as</span></span>
<span id="LC1043" class="line" lang="java"><span class="cm">     * follows: &lt;/p&gt;</span></span>
<span id="LC1044" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1045" class="line" lang="java"><span class="cm">     * &lt;ol&gt;</span></span>
<span id="LC1046" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1047" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; If either this URI or the given URI are opaque, or if the</span></span>
<span id="LC1048" class="line" lang="java"><span class="cm">     *   scheme and authority components of the two URIs are not identical, or</span></span>
<span id="LC1049" class="line" lang="java"><span class="cm">     *   if the path of this URI is not a prefix of the path of the given URI,</span></span>
<span id="LC1050" class="line" lang="java"><span class="cm">     *   then the given URI is returned. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1051" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1052" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Otherwise a new relative hierarchical URI is constructed with</span></span>
<span id="LC1053" class="line" lang="java"><span class="cm">     *   query and fragment components taken from the given URI and with a path</span></span>
<span id="LC1054" class="line" lang="java"><span class="cm">     *   component computed by removing this URI's path from the beginning of</span></span>
<span id="LC1055" class="line" lang="java"><span class="cm">     *   the given URI's path. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1056" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1057" class="line" lang="java"><span class="cm">     * &lt;/ol&gt;</span></span>
<span id="LC1058" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1059" class="line" lang="java"><span class="cm">     * @param  uri  The URI to be relativized against this URI</span></span>
<span id="LC1060" class="line" lang="java"><span class="cm">     * @return The resulting URI</span></span>
<span id="LC1061" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1062" class="line" lang="java"><span class="cm">     * @throws  NullPointerException</span></span>
<span id="LC1063" class="line" lang="java"><span class="cm">     *          If {@code uri} is {@code null}</span></span>
<span id="LC1064" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1065" class="line" lang="java">    <span class="kd">public</span> <span class="no">URI</span> <span class="nf">relativize</span><span class="o">(</span><span class="no">URI</span> <span class="n">uri</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1066" class="line" lang="java">        <span class="k">return</span> <span class="nf">relativize</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">uri</span><span class="o">);</span></span>
<span id="LC1067" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1068" class="line" lang="java"></span>
<span id="LC1069" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1070" class="line" lang="java"><span class="cm">     * Constructs a URL from this URI.</span></span>
<span id="LC1071" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1072" class="line" lang="java"><span class="cm">     * &lt;p&gt; This convenience method works as if invoking it were equivalent to</span></span>
<span id="LC1073" class="line" lang="java"><span class="cm">     * evaluating the expression {@code new URL(this.toString())} after</span></span>
<span id="LC1074" class="line" lang="java"><span class="cm">     * first checking that this URI is absolute. &lt;/p&gt;</span></span>
<span id="LC1075" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1076" class="line" lang="java"><span class="cm">     * @return  A URL constructed from this URI</span></span>
<span id="LC1077" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1078" class="line" lang="java"><span class="cm">     * @throws  IllegalArgumentException</span></span>
<span id="LC1079" class="line" lang="java"><span class="cm">     *          If this URL is not absolute</span></span>
<span id="LC1080" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1081" class="line" lang="java"><span class="cm">     * @throws  MalformedURLException</span></span>
<span id="LC1082" class="line" lang="java"><span class="cm">     *          If a protocol handler for the URL could not be found,</span></span>
<span id="LC1083" class="line" lang="java"><span class="cm">     *          or if some other error occurred while constructing the URL</span></span>
<span id="LC1084" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1085" class="line" lang="java">    <span class="kd">public</span> <span class="no">URL</span> <span class="nf">toURL</span><span class="o">()</span></span>
<span id="LC1086" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">MalformedURLException</span> <span class="o">{</span></span>
<span id="LC1087" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">isAbsolute</span><span class="o">())</span></span>
<span id="LC1088" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="s">"URI is not absolute"</span><span class="o">);</span></span>
<span id="LC1089" class="line" lang="java">        <span class="k">return</span> <span class="k">new</span> <span class="nf">URL</span><span class="o">(</span><span class="n">toString</span><span class="o">());</span></span>
<span id="LC1090" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1091" class="line" lang="java"></span>
<span id="LC1092" class="line" lang="java">    <span class="c1">// -- Component access methods --</span></span>
<span id="LC1093" class="line" lang="java"></span>
<span id="LC1094" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1095" class="line" lang="java"><span class="cm">     * Returns the scheme component of this URI.</span></span>
<span id="LC1096" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1097" class="line" lang="java"><span class="cm">     * &lt;p&gt; The scheme component of a URI, if defined, only contains characters</span></span>
<span id="LC1098" class="line" lang="java"><span class="cm">     * in the &lt;i&gt;alphanum&lt;/i&gt; category and in the string {@code "-.+"}.  A</span></span>
<span id="LC1099" class="line" lang="java"><span class="cm">     * scheme always starts with an &lt;i&gt;alpha&lt;/i&gt; character. &lt;p&gt;</span></span>
<span id="LC1100" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1101" class="line" lang="java"><span class="cm">     * The scheme component of a URI cannot contain escaped octets, hence this</span></span>
<span id="LC1102" class="line" lang="java"><span class="cm">     * method does not perform any decoding.</span></span>
<span id="LC1103" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1104" class="line" lang="java"><span class="cm">     * @return  The scheme component of this URI,</span></span>
<span id="LC1105" class="line" lang="java"><span class="cm">     *          or {@code null} if the scheme is undefined</span></span>
<span id="LC1106" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1107" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getScheme</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1108" class="line" lang="java">        <span class="k">return</span> <span class="n">scheme</span><span class="o">;</span></span>
<span id="LC1109" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1110" class="line" lang="java"></span>
<span id="LC1111" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1112" class="line" lang="java"><span class="cm">     * Tells whether or not this URI is absolute.</span></span>
<span id="LC1113" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1114" class="line" lang="java"><span class="cm">     * &lt;p&gt; A URI is absolute if, and only if, it has a scheme component. &lt;/p&gt;</span></span>
<span id="LC1115" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1116" class="line" lang="java"><span class="cm">     * @return  {@code true} if, and only if, this URI is absolute</span></span>
<span id="LC1117" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1118" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isAbsolute</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1119" class="line" lang="java">        <span class="k">return</span> <span class="n">scheme</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1120" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1121" class="line" lang="java"></span>
<span id="LC1122" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1123" class="line" lang="java"><span class="cm">     * Tells whether or not this URI is opaque.</span></span>
<span id="LC1124" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1125" class="line" lang="java"><span class="cm">     * &lt;p&gt; A URI is opaque if, and only if, it is absolute and its</span></span>
<span id="LC1126" class="line" lang="java"><span class="cm">     * scheme-specific part does not begin with a slash character ('/').</span></span>
<span id="LC1127" class="line" lang="java"><span class="cm">     * An opaque URI has a scheme, a scheme-specific part, and possibly</span></span>
<span id="LC1128" class="line" lang="java"><span class="cm">     * a fragment; all other components are undefined. &lt;/p&gt;</span></span>
<span id="LC1129" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1130" class="line" lang="java"><span class="cm">     * @return  {@code true} if, and only if, this URI is opaque</span></span>
<span id="LC1131" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1132" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isOpaque</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1133" class="line" lang="java">        <span class="k">return</span> <span class="n">path</span> <span class="o">==</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1134" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1135" class="line" lang="java"></span>
<span id="LC1136" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1137" class="line" lang="java"><span class="cm">     * Returns the raw scheme-specific part of this URI.  The scheme-specific</span></span>
<span id="LC1138" class="line" lang="java"><span class="cm">     * part is never undefined, though it may be empty.</span></span>
<span id="LC1139" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1140" class="line" lang="java"><span class="cm">     * &lt;p&gt; The scheme-specific part of a URI only contains legal URI</span></span>
<span id="LC1141" class="line" lang="java"><span class="cm">     * characters. &lt;/p&gt;</span></span>
<span id="LC1142" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1143" class="line" lang="java"><span class="cm">     * @return  The raw scheme-specific part of this URI</span></span>
<span id="LC1144" class="line" lang="java"><span class="cm">     *          (never {@code null})</span></span>
<span id="LC1145" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1146" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getRawSchemeSpecificPart</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1147" class="line" lang="java">        <span class="n">defineSchemeSpecificPart</span><span class="o">();</span></span>
<span id="LC1148" class="line" lang="java">        <span class="k">return</span> <span class="n">schemeSpecificPart</span><span class="o">;</span></span>
<span id="LC1149" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1150" class="line" lang="java"></span>
<span id="LC1151" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1152" class="line" lang="java"><span class="cm">     * Returns the decoded scheme-specific part of this URI.</span></span>
<span id="LC1153" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1154" class="line" lang="java"><span class="cm">     * &lt;p&gt; The string returned by this method is equal to that returned by the</span></span>
<span id="LC1155" class="line" lang="java"><span class="cm">     * {@link #getRawSchemeSpecificPart() getRawSchemeSpecificPart} method</span></span>
<span id="LC1156" class="line" lang="java"><span class="cm">     * except that all sequences of escaped octets are &lt;a</span></span>
<span id="LC1157" class="line" lang="java"><span class="cm">     * href="#decode"&gt;decoded&lt;/a&gt;.  &lt;/p&gt;</span></span>
<span id="LC1158" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1159" class="line" lang="java"><span class="cm">     * @return  The decoded scheme-specific part of this URI</span></span>
<span id="LC1160" class="line" lang="java"><span class="cm">     *          (never {@code null})</span></span>
<span id="LC1161" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1162" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getSchemeSpecificPart</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1163" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">decodedSchemeSpecificPart</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC1164" class="line" lang="java">            <span class="n">decodedSchemeSpecificPart</span> <span class="o">=</span> <span class="n">decode</span><span class="o">(</span><span class="n">getRawSchemeSpecificPart</span><span class="o">());</span></span>
<span id="LC1165" class="line" lang="java">        <span class="k">return</span> <span class="n">decodedSchemeSpecificPart</span><span class="o">;</span></span>
<span id="LC1166" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1167" class="line" lang="java"></span>
<span id="LC1168" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1169" class="line" lang="java"><span class="cm">     * Returns the raw authority component of this URI.</span></span>
<span id="LC1170" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1171" class="line" lang="java"><span class="cm">     * &lt;p&gt; The authority component of a URI, if defined, only contains the</span></span>
<span id="LC1172" class="line" lang="java"><span class="cm">     * commercial-at character ({@code '@'}) and characters in the</span></span>
<span id="LC1173" class="line" lang="java"><span class="cm">     * &lt;i&gt;unreserved&lt;/i&gt;, &lt;i&gt;punct&lt;/i&gt;, &lt;i&gt;escaped&lt;/i&gt;, and &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC1174" class="line" lang="java"><span class="cm">     * categories.  If the authority is server-based then it is further</span></span>
<span id="LC1175" class="line" lang="java"><span class="cm">     * constrained to have valid user-information, host, and port</span></span>
<span id="LC1176" class="line" lang="java"><span class="cm">     * components. &lt;/p&gt;</span></span>
<span id="LC1177" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1178" class="line" lang="java"><span class="cm">     * @return  The raw authority component of this URI,</span></span>
<span id="LC1179" class="line" lang="java"><span class="cm">     *          or {@code null} if the authority is undefined</span></span>
<span id="LC1180" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1181" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getRawAuthority</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1182" class="line" lang="java">        <span class="k">return</span> <span class="n">authority</span><span class="o">;</span></span>
<span id="LC1183" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1184" class="line" lang="java"></span>
<span id="LC1185" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1186" class="line" lang="java"><span class="cm">     * Returns the decoded authority component of this URI.</span></span>
<span id="LC1187" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1188" class="line" lang="java"><span class="cm">     * &lt;p&gt; The string returned by this method is equal to that returned by the</span></span>
<span id="LC1189" class="line" lang="java"><span class="cm">     * {@link #getRawAuthority() getRawAuthority} method except that all</span></span>
<span id="LC1190" class="line" lang="java"><span class="cm">     * sequences of escaped octets are &lt;a href="#decode"&gt;decoded&lt;/a&gt;.  &lt;/p&gt;</span></span>
<span id="LC1191" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1192" class="line" lang="java"><span class="cm">     * @return  The decoded authority component of this URI,</span></span>
<span id="LC1193" class="line" lang="java"><span class="cm">     *          or {@code null} if the authority is undefined</span></span>
<span id="LC1194" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1195" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getAuthority</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1196" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">decodedAuthority</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC1197" class="line" lang="java">            <span class="n">decodedAuthority</span> <span class="o">=</span> <span class="n">decode</span><span class="o">(</span><span class="n">authority</span><span class="o">);</span></span>
<span id="LC1198" class="line" lang="java">        <span class="k">return</span> <span class="n">decodedAuthority</span><span class="o">;</span></span>
<span id="LC1199" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1200" class="line" lang="java"></span>
<span id="LC1201" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1202" class="line" lang="java"><span class="cm">     * Returns the raw user-information component of this URI.</span></span>
<span id="LC1203" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1204" class="line" lang="java"><span class="cm">     * &lt;p&gt; The user-information component of a URI, if defined, only contains</span></span>
<span id="LC1205" class="line" lang="java"><span class="cm">     * characters in the &lt;i&gt;unreserved&lt;/i&gt;, &lt;i&gt;punct&lt;/i&gt;, &lt;i&gt;escaped&lt;/i&gt;, and</span></span>
<span id="LC1206" class="line" lang="java"><span class="cm">     * &lt;i&gt;other&lt;/i&gt; categories. &lt;/p&gt;</span></span>
<span id="LC1207" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1208" class="line" lang="java"><span class="cm">     * @return  The raw user-information component of this URI,</span></span>
<span id="LC1209" class="line" lang="java"><span class="cm">     *          or {@code null} if the user information is undefined</span></span>
<span id="LC1210" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1211" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getRawUserInfo</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1212" class="line" lang="java">        <span class="k">return</span> <span class="n">userInfo</span><span class="o">;</span></span>
<span id="LC1213" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1214" class="line" lang="java"></span>
<span id="LC1215" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1216" class="line" lang="java"><span class="cm">     * Returns the decoded user-information component of this URI.</span></span>
<span id="LC1217" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1218" class="line" lang="java"><span class="cm">     * &lt;p&gt; The string returned by this method is equal to that returned by the</span></span>
<span id="LC1219" class="line" lang="java"><span class="cm">     * {@link #getRawUserInfo() getRawUserInfo} method except that all</span></span>
<span id="LC1220" class="line" lang="java"><span class="cm">     * sequences of escaped octets are &lt;a href="#decode"&gt;decoded&lt;/a&gt;.  &lt;/p&gt;</span></span>
<span id="LC1221" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1222" class="line" lang="java"><span class="cm">     * @return  The decoded user-information component of this URI,</span></span>
<span id="LC1223" class="line" lang="java"><span class="cm">     *          or {@code null} if the user information is undefined</span></span>
<span id="LC1224" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1225" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getUserInfo</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1226" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">decodedUserInfo</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">userInfo</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span></span>
<span id="LC1227" class="line" lang="java">            <span class="n">decodedUserInfo</span> <span class="o">=</span> <span class="n">decode</span><span class="o">(</span><span class="n">userInfo</span><span class="o">);</span></span>
<span id="LC1228" class="line" lang="java">        <span class="k">return</span> <span class="n">decodedUserInfo</span><span class="o">;</span></span>
<span id="LC1229" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1230" class="line" lang="java"></span>
<span id="LC1231" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1232" class="line" lang="java"><span class="cm">     * Returns the host component of this URI.</span></span>
<span id="LC1233" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1234" class="line" lang="java"><span class="cm">     * &lt;p&gt; The host component of a URI, if defined, will have one of the</span></span>
<span id="LC1235" class="line" lang="java"><span class="cm">     * following forms: &lt;/p&gt;</span></span>
<span id="LC1236" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1237" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC1238" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1239" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; A domain name consisting of one or more &lt;i&gt;labels&lt;/i&gt;</span></span>
<span id="LC1240" class="line" lang="java"><span class="cm">     *   separated by period characters ({@code '.'}), optionally followed by</span></span>
<span id="LC1241" class="line" lang="java"><span class="cm">     *   a period character.  Each label consists of &lt;i&gt;alphanum&lt;/i&gt; characters</span></span>
<span id="LC1242" class="line" lang="java"><span class="cm">     *   as well as hyphen characters ({@code '-'}), though hyphens never</span></span>
<span id="LC1243" class="line" lang="java"><span class="cm">     *   occur as the first or last characters in a label. The rightmost</span></span>
<span id="LC1244" class="line" lang="java"><span class="cm">     *   label of a domain name consisting of two or more labels, begins</span></span>
<span id="LC1245" class="line" lang="java"><span class="cm">     *   with an &lt;i&gt;alpha&lt;/i&gt; character. &lt;/li&gt;</span></span>
<span id="LC1246" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1247" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; A dotted-quad IPv4 address of the form</span></span>
<span id="LC1248" class="line" lang="java"><span class="cm">     *   &lt;i&gt;digit&lt;/i&gt;{@code +.}&lt;i&gt;digit&lt;/i&gt;{@code +.}&lt;i&gt;digit&lt;/i&gt;{@code +.}&lt;i&gt;digit&lt;/i&gt;{@code +},</span></span>
<span id="LC1249" class="line" lang="java"><span class="cm">     *   where no &lt;i&gt;digit&lt;/i&gt; sequence is longer than three characters and no</span></span>
<span id="LC1250" class="line" lang="java"><span class="cm">     *   sequence has a value larger than 255. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1251" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1252" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; An IPv6 address enclosed in square brackets ({@code '['} and</span></span>
<span id="LC1253" class="line" lang="java"><span class="cm">     *   {@code ']'}) and consisting of hexadecimal digits, colon characters</span></span>
<span id="LC1254" class="line" lang="java"><span class="cm">     *   ({@code ':'}), and possibly an embedded IPv4 address.  The full</span></span>
<span id="LC1255" class="line" lang="java"><span class="cm">     *   syntax of IPv6 addresses is specified in &lt;a</span></span>
<span id="LC1256" class="line" lang="java"><span class="cm">     *   href="http://www.ietf.org/rfc/rfc2373.txt"&gt;&lt;i&gt;RFC&amp;nbsp;2373: IPv6</span></span>
<span id="LC1257" class="line" lang="java"><span class="cm">     *   Addressing Architecture&lt;/i&gt;&lt;/a&gt;.  &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1258" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1259" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC1260" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1261" class="line" lang="java"><span class="cm">     * The host component of a URI cannot contain escaped octets, hence this</span></span>
<span id="LC1262" class="line" lang="java"><span class="cm">     * method does not perform any decoding.</span></span>
<span id="LC1263" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1264" class="line" lang="java"><span class="cm">     * @return  The host component of this URI,</span></span>
<span id="LC1265" class="line" lang="java"><span class="cm">     *          or {@code null} if the host is undefined</span></span>
<span id="LC1266" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1267" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getHost</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1268" class="line" lang="java">        <span class="k">return</span> <span class="n">host</span><span class="o">;</span></span>
<span id="LC1269" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1270" class="line" lang="java"></span>
<span id="LC1271" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1272" class="line" lang="java"><span class="cm">     * Returns the port number of this URI.</span></span>
<span id="LC1273" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1274" class="line" lang="java"><span class="cm">     * &lt;p&gt; The port component of a URI, if defined, is a non-negative</span></span>
<span id="LC1275" class="line" lang="java"><span class="cm">     * integer. &lt;/p&gt;</span></span>
<span id="LC1276" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1277" class="line" lang="java"><span class="cm">     * @return  The port component of this URI,</span></span>
<span id="LC1278" class="line" lang="java"><span class="cm">     *          or {@code -1} if the port is undefined</span></span>
<span id="LC1279" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1280" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getPort</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1281" class="line" lang="java">        <span class="k">return</span> <span class="n">port</span><span class="o">;</span></span>
<span id="LC1282" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1283" class="line" lang="java"></span>
<span id="LC1284" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1285" class="line" lang="java"><span class="cm">     * Returns the raw path component of this URI.</span></span>
<span id="LC1286" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1287" class="line" lang="java"><span class="cm">     * &lt;p&gt; The path component of a URI, if defined, only contains the slash</span></span>
<span id="LC1288" class="line" lang="java"><span class="cm">     * character ({@code '/'}), the commercial-at character ({@code '@'}),</span></span>
<span id="LC1289" class="line" lang="java"><span class="cm">     * and characters in the &lt;i&gt;unreserved&lt;/i&gt;, &lt;i&gt;punct&lt;/i&gt;, &lt;i&gt;escaped&lt;/i&gt;,</span></span>
<span id="LC1290" class="line" lang="java"><span class="cm">     * and &lt;i&gt;other&lt;/i&gt; categories. &lt;/p&gt;</span></span>
<span id="LC1291" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1292" class="line" lang="java"><span class="cm">     * @return  The path component of this URI,</span></span>
<span id="LC1293" class="line" lang="java"><span class="cm">     *          or {@code null} if the path is undefined</span></span>
<span id="LC1294" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1295" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getRawPath</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1296" class="line" lang="java">        <span class="k">return</span> <span class="n">path</span><span class="o">;</span></span>
<span id="LC1297" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1298" class="line" lang="java"></span>
<span id="LC1299" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1300" class="line" lang="java"><span class="cm">     * Returns the decoded path component of this URI.</span></span>
<span id="LC1301" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1302" class="line" lang="java"><span class="cm">     * &lt;p&gt; The string returned by this method is equal to that returned by the</span></span>
<span id="LC1303" class="line" lang="java"><span class="cm">     * {@link #getRawPath() getRawPath} method except that all sequences of</span></span>
<span id="LC1304" class="line" lang="java"><span class="cm">     * escaped octets are &lt;a href="#decode"&gt;decoded&lt;/a&gt;.  &lt;/p&gt;</span></span>
<span id="LC1305" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1306" class="line" lang="java"><span class="cm">     * @return  The decoded path component of this URI,</span></span>
<span id="LC1307" class="line" lang="java"><span class="cm">     *          or {@code null} if the path is undefined</span></span>
<span id="LC1308" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1309" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getPath</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1310" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">decodedPath</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">path</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span></span>
<span id="LC1311" class="line" lang="java">            <span class="n">decodedPath</span> <span class="o">=</span> <span class="n">decode</span><span class="o">(</span><span class="n">path</span><span class="o">);</span></span>
<span id="LC1312" class="line" lang="java">        <span class="k">return</span> <span class="n">decodedPath</span><span class="o">;</span></span>
<span id="LC1313" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1314" class="line" lang="java"></span>
<span id="LC1315" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1316" class="line" lang="java"><span class="cm">     * Returns the raw query component of this URI.</span></span>
<span id="LC1317" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1318" class="line" lang="java"><span class="cm">     * &lt;p&gt; The query component of a URI, if defined, only contains legal URI</span></span>
<span id="LC1319" class="line" lang="java"><span class="cm">     * characters. &lt;/p&gt;</span></span>
<span id="LC1320" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1321" class="line" lang="java"><span class="cm">     * @return  The raw query component of this URI,</span></span>
<span id="LC1322" class="line" lang="java"><span class="cm">     *          or {@code null} if the query is undefined</span></span>
<span id="LC1323" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1324" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getRawQuery</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1325" class="line" lang="java">        <span class="k">return</span> <span class="n">query</span><span class="o">;</span></span>
<span id="LC1326" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1327" class="line" lang="java"></span>
<span id="LC1328" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1329" class="line" lang="java"><span class="cm">     * Returns the decoded query component of this URI.</span></span>
<span id="LC1330" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1331" class="line" lang="java"><span class="cm">     * &lt;p&gt; The string returned by this method is equal to that returned by the</span></span>
<span id="LC1332" class="line" lang="java"><span class="cm">     * {@link #getRawQuery() getRawQuery} method except that all sequences of</span></span>
<span id="LC1333" class="line" lang="java"><span class="cm">     * escaped octets are &lt;a href="#decode"&gt;decoded&lt;/a&gt;.  &lt;/p&gt;</span></span>
<span id="LC1334" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1335" class="line" lang="java"><span class="cm">     * @return  The decoded query component of this URI,</span></span>
<span id="LC1336" class="line" lang="java"><span class="cm">     *          or {@code null} if the query is undefined</span></span>
<span id="LC1337" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1338" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getQuery</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1339" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">decodedQuery</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">query</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span></span>
<span id="LC1340" class="line" lang="java">            <span class="n">decodedQuery</span> <span class="o">=</span> <span class="n">decode</span><span class="o">(</span><span class="n">query</span><span class="o">);</span></span>
<span id="LC1341" class="line" lang="java">        <span class="k">return</span> <span class="n">decodedQuery</span><span class="o">;</span></span>
<span id="LC1342" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1343" class="line" lang="java"></span>
<span id="LC1344" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1345" class="line" lang="java"><span class="cm">     * Returns the raw fragment component of this URI.</span></span>
<span id="LC1346" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1347" class="line" lang="java"><span class="cm">     * &lt;p&gt; The fragment component of a URI, if defined, only contains legal URI</span></span>
<span id="LC1348" class="line" lang="java"><span class="cm">     * characters. &lt;/p&gt;</span></span>
<span id="LC1349" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1350" class="line" lang="java"><span class="cm">     * @return  The raw fragment component of this URI,</span></span>
<span id="LC1351" class="line" lang="java"><span class="cm">     *          or {@code null} if the fragment is undefined</span></span>
<span id="LC1352" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1353" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getRawFragment</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1354" class="line" lang="java">        <span class="k">return</span> <span class="n">fragment</span><span class="o">;</span></span>
<span id="LC1355" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1356" class="line" lang="java"></span>
<span id="LC1357" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1358" class="line" lang="java"><span class="cm">     * Returns the decoded fragment component of this URI.</span></span>
<span id="LC1359" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1360" class="line" lang="java"><span class="cm">     * &lt;p&gt; The string returned by this method is equal to that returned by the</span></span>
<span id="LC1361" class="line" lang="java"><span class="cm">     * {@link #getRawFragment() getRawFragment} method except that all</span></span>
<span id="LC1362" class="line" lang="java"><span class="cm">     * sequences of escaped octets are &lt;a href="#decode"&gt;decoded&lt;/a&gt;.  &lt;/p&gt;</span></span>
<span id="LC1363" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1364" class="line" lang="java"><span class="cm">     * @return  The decoded fragment component of this URI,</span></span>
<span id="LC1365" class="line" lang="java"><span class="cm">     *          or {@code null} if the fragment is undefined</span></span>
<span id="LC1366" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1367" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getFragment</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1368" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">decodedFragment</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">fragment</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span></span>
<span id="LC1369" class="line" lang="java">            <span class="n">decodedFragment</span> <span class="o">=</span> <span class="n">decode</span><span class="o">(</span><span class="n">fragment</span><span class="o">);</span></span>
<span id="LC1370" class="line" lang="java">        <span class="k">return</span> <span class="n">decodedFragment</span><span class="o">;</span></span>
<span id="LC1371" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1372" class="line" lang="java"></span>
<span id="LC1373" class="line" lang="java"></span>
<span id="LC1374" class="line" lang="java">    <span class="c1">// -- Equality, comparison, hash code, toString, and serialization --</span></span>
<span id="LC1375" class="line" lang="java"></span>
<span id="LC1376" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1377" class="line" lang="java"><span class="cm">     * Tests this URI for equality with another object.</span></span>
<span id="LC1378" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1379" class="line" lang="java"><span class="cm">     * &lt;p&gt; If the given object is not a URI then this method immediately</span></span>
<span id="LC1380" class="line" lang="java"><span class="cm">     * returns {@code false}.</span></span>
<span id="LC1381" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1382" class="line" lang="java"><span class="cm">     * &lt;p&gt; For two URIs to be considered equal requires that either both are</span></span>
<span id="LC1383" class="line" lang="java"><span class="cm">     * opaque or both are hierarchical.  Their schemes must either both be</span></span>
<span id="LC1384" class="line" lang="java"><span class="cm">     * undefined or else be equal without regard to case. Their fragments</span></span>
<span id="LC1385" class="line" lang="java"><span class="cm">     * must either both be undefined or else be equal.</span></span>
<span id="LC1386" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1387" class="line" lang="java"><span class="cm">     * &lt;p&gt; For two opaque URIs to be considered equal, their scheme-specific</span></span>
<span id="LC1388" class="line" lang="java"><span class="cm">     * parts must be equal.</span></span>
<span id="LC1389" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1390" class="line" lang="java"><span class="cm">     * &lt;p&gt; For two hierarchical URIs to be considered equal, their paths must</span></span>
<span id="LC1391" class="line" lang="java"><span class="cm">     * be equal and their queries must either both be undefined or else be</span></span>
<span id="LC1392" class="line" lang="java"><span class="cm">     * equal.  Their authorities must either both be undefined, or both be</span></span>
<span id="LC1393" class="line" lang="java"><span class="cm">     * registry-based, or both be server-based.  If their authorities are</span></span>
<span id="LC1394" class="line" lang="java"><span class="cm">     * defined and are registry-based, then they must be equal.  If their</span></span>
<span id="LC1395" class="line" lang="java"><span class="cm">     * authorities are defined and are server-based, then their hosts must be</span></span>
<span id="LC1396" class="line" lang="java"><span class="cm">     * equal without regard to case, their port numbers must be equal, and</span></span>
<span id="LC1397" class="line" lang="java"><span class="cm">     * their user-information components must be equal.</span></span>
<span id="LC1398" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1399" class="line" lang="java"><span class="cm">     * &lt;p&gt; When testing the user-information, path, query, fragment, authority,</span></span>
<span id="LC1400" class="line" lang="java"><span class="cm">     * or scheme-specific parts of two URIs for equality, the raw forms rather</span></span>
<span id="LC1401" class="line" lang="java"><span class="cm">     * than the encoded forms of these components are compared and the</span></span>
<span id="LC1402" class="line" lang="java"><span class="cm">     * hexadecimal digits of escaped octets are compared without regard to</span></span>
<span id="LC1403" class="line" lang="java"><span class="cm">     * case.</span></span>
<span id="LC1404" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1405" class="line" lang="java"><span class="cm">     * &lt;p&gt; This method satisfies the general contract of the {@link</span></span>
<span id="LC1406" class="line" lang="java"><span class="cm">     * java.lang.Object#equals(Object) Object.equals} method. &lt;/p&gt;</span></span>
<span id="LC1407" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1408" class="line" lang="java"><span class="cm">     * @param   ob   The object to which this object is to be compared</span></span>
<span id="LC1409" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1410" class="line" lang="java"><span class="cm">     * @return  {@code true} if, and only if, the given object is a URI that</span></span>
<span id="LC1411" class="line" lang="java"><span class="cm">     *          is identical to this URI</span></span>
<span id="LC1412" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1413" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">equals</span><span class="o">(</span><span class="nc">Object</span> <span class="n">ob</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1414" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">ob</span> <span class="o">==</span> <span class="k">this</span><span class="o">)</span></span>
<span id="LC1415" class="line" lang="java">            <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1416" class="line" lang="java">        <span class="k">if</span> <span class="o">(!(</span><span class="n">ob</span> <span class="k">instanceof</span> <span class="no">URI</span><span class="o">))</span></span>
<span id="LC1417" class="line" lang="java">            <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1418" class="line" lang="java">        <span class="no">URI</span> <span class="n">that</span> <span class="o">=</span> <span class="o">(</span><span class="no">URI</span><span class="o">)</span><span class="n">ob</span><span class="o">;</span></span>
<span id="LC1419" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">()</span> <span class="o">!=</span> <span class="n">that</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">())</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1420" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">equalIgnoringCase</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">scheme</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">scheme</span><span class="o">))</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1421" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">equal</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">fragment</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">fragment</span><span class="o">))</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1422" class="line" lang="java"></span>
<span id="LC1423" class="line" lang="java">        <span class="c1">// Opaque</span></span>
<span id="LC1424" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">())</span></span>
<span id="LC1425" class="line" lang="java">            <span class="k">return</span> <span class="nf">equal</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">schemeSpecificPart</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">schemeSpecificPart</span><span class="o">);</span></span>
<span id="LC1426" class="line" lang="java"></span>
<span id="LC1427" class="line" lang="java">        <span class="c1">// Hierarchical</span></span>
<span id="LC1428" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">equal</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">path</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">path</span><span class="o">))</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1429" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">equal</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">query</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">query</span><span class="o">))</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1430" class="line" lang="java"></span>
<span id="LC1431" class="line" lang="java">        <span class="c1">// Authorities</span></span>
<span id="LC1432" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">authority</span> <span class="o">==</span> <span class="n">that</span><span class="o">.</span><span class="na">authority</span><span class="o">)</span> <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1433" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">host</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1434" class="line" lang="java">            <span class="c1">// Server-based</span></span>
<span id="LC1435" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">equal</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">userInfo</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">userInfo</span><span class="o">))</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1436" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">equalIgnoringCase</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">host</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">host</span><span class="o">))</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1437" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">port</span> <span class="o">!=</span> <span class="n">that</span><span class="o">.</span><span class="na">port</span><span class="o">)</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1438" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">authority</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1439" class="line" lang="java">            <span class="c1">// Registry-based</span></span>
<span id="LC1440" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">equal</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">authority</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">authority</span><span class="o">))</span> <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1441" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">authority</span> <span class="o">!=</span> <span class="n">that</span><span class="o">.</span><span class="na">authority</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1442" class="line" lang="java">            <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1443" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1444" class="line" lang="java"></span>
<span id="LC1445" class="line" lang="java">        <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1446" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1447" class="line" lang="java"></span>
<span id="LC1448" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1449" class="line" lang="java"><span class="cm">     * Returns a hash-code value for this URI.  The hash code is based upon all</span></span>
<span id="LC1450" class="line" lang="java"><span class="cm">     * of the URI's components, and satisfies the general contract of the</span></span>
<span id="LC1451" class="line" lang="java"><span class="cm">     * {@link java.lang.Object#hashCode() Object.hashCode} method.</span></span>
<span id="LC1452" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1453" class="line" lang="java"><span class="cm">     * @return  A hash-code value for this URI</span></span>
<span id="LC1454" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1455" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">hashCode</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1456" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">hash</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1457" class="line" lang="java">            <span class="k">return</span> <span class="n">hash</span><span class="o">;</span></span>
<span id="LC1458" class="line" lang="java">        <span class="kt">int</span> <span class="n">h</span> <span class="o">=</span> <span class="n">hashIgnoringCase</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">scheme</span><span class="o">);</span></span>
<span id="LC1459" class="line" lang="java">        <span class="n">h</span> <span class="o">=</span> <span class="n">hash</span><span class="o">(</span><span class="n">h</span><span class="o">,</span> <span class="n">fragment</span><span class="o">);</span></span>
<span id="LC1460" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">isOpaque</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1461" class="line" lang="java">            <span class="n">h</span> <span class="o">=</span> <span class="n">hash</span><span class="o">(</span><span class="n">h</span><span class="o">,</span> <span class="n">schemeSpecificPart</span><span class="o">);</span></span>
<span id="LC1462" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1463" class="line" lang="java">            <span class="n">h</span> <span class="o">=</span> <span class="n">hash</span><span class="o">(</span><span class="n">h</span><span class="o">,</span> <span class="n">path</span><span class="o">);</span></span>
<span id="LC1464" class="line" lang="java">            <span class="n">h</span> <span class="o">=</span> <span class="n">hash</span><span class="o">(</span><span class="n">h</span><span class="o">,</span> <span class="n">query</span><span class="o">);</span></span>
<span id="LC1465" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">host</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1466" class="line" lang="java">                <span class="n">h</span> <span class="o">=</span> <span class="n">hash</span><span class="o">(</span><span class="n">h</span><span class="o">,</span> <span class="n">userInfo</span><span class="o">);</span></span>
<span id="LC1467" class="line" lang="java">                <span class="n">h</span> <span class="o">=</span> <span class="n">hashIgnoringCase</span><span class="o">(</span><span class="n">h</span><span class="o">,</span> <span class="n">host</span><span class="o">);</span></span>
<span id="LC1468" class="line" lang="java">                <span class="n">h</span> <span class="o">+=</span> <span class="mi">1949</span> <span class="o">*</span> <span class="n">port</span><span class="o">;</span></span>
<span id="LC1469" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1470" class="line" lang="java">                <span class="n">h</span> <span class="o">=</span> <span class="n">hash</span><span class="o">(</span><span class="n">h</span><span class="o">,</span> <span class="n">authority</span><span class="o">);</span></span>
<span id="LC1471" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1472" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1473" class="line" lang="java">        <span class="n">hash</span> <span class="o">=</span> <span class="n">h</span><span class="o">;</span></span>
<span id="LC1474" class="line" lang="java">        <span class="k">return</span> <span class="n">h</span><span class="o">;</span></span>
<span id="LC1475" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1476" class="line" lang="java"></span>
<span id="LC1477" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1478" class="line" lang="java"><span class="cm">     * Compares this URI to another object, which must be a URI.</span></span>
<span id="LC1479" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1480" class="line" lang="java"><span class="cm">     * &lt;p&gt; When comparing corresponding components of two URIs, if one</span></span>
<span id="LC1481" class="line" lang="java"><span class="cm">     * component is undefined but the other is defined then the first is</span></span>
<span id="LC1482" class="line" lang="java"><span class="cm">     * considered to be less than the second.  Unless otherwise noted, string</span></span>
<span id="LC1483" class="line" lang="java"><span class="cm">     * components are ordered according to their natural, case-sensitive</span></span>
<span id="LC1484" class="line" lang="java"><span class="cm">     * ordering as defined by the {@link java.lang.String#compareTo(Object)</span></span>
<span id="LC1485" class="line" lang="java"><span class="cm">     * String.compareTo} method.  String components that are subject to</span></span>
<span id="LC1486" class="line" lang="java"><span class="cm">     * encoding are compared by comparing their raw forms rather than their</span></span>
<span id="LC1487" class="line" lang="java"><span class="cm">     * encoded forms.</span></span>
<span id="LC1488" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1489" class="line" lang="java"><span class="cm">     * &lt;p&gt; The ordering of URIs is defined as follows: &lt;/p&gt;</span></span>
<span id="LC1490" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1491" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC1492" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1493" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Two URIs with different schemes are ordered according the</span></span>
<span id="LC1494" class="line" lang="java"><span class="cm">     *   ordering of their schemes, without regard to case. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1495" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1496" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; A hierarchical URI is considered to be less than an opaque URI</span></span>
<span id="LC1497" class="line" lang="java"><span class="cm">     *   with an identical scheme. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1498" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1499" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Two opaque URIs with identical schemes are ordered according</span></span>
<span id="LC1500" class="line" lang="java"><span class="cm">     *   to the ordering of their scheme-specific parts. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1501" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1502" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Two opaque URIs with identical schemes and scheme-specific</span></span>
<span id="LC1503" class="line" lang="java"><span class="cm">     *   parts are ordered according to the ordering of their</span></span>
<span id="LC1504" class="line" lang="java"><span class="cm">     *   fragments. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1505" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1506" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Two hierarchical URIs with identical schemes are ordered</span></span>
<span id="LC1507" class="line" lang="java"><span class="cm">     *   according to the ordering of their authority components: &lt;/p&gt;</span></span>
<span id="LC1508" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1509" class="line" lang="java"><span class="cm">     *   &lt;ul&gt;</span></span>
<span id="LC1510" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1511" class="line" lang="java"><span class="cm">     *     &lt;li&gt;&lt;p&gt; If both authority components are server-based then the URIs</span></span>
<span id="LC1512" class="line" lang="java"><span class="cm">     *     are ordered according to their user-information components; if these</span></span>
<span id="LC1513" class="line" lang="java"><span class="cm">     *     components are identical then the URIs are ordered according to the</span></span>
<span id="LC1514" class="line" lang="java"><span class="cm">     *     ordering of their hosts, without regard to case; if the hosts are</span></span>
<span id="LC1515" class="line" lang="java"><span class="cm">     *     identical then the URIs are ordered according to the ordering of</span></span>
<span id="LC1516" class="line" lang="java"><span class="cm">     *     their ports. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1517" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1518" class="line" lang="java"><span class="cm">     *     &lt;li&gt;&lt;p&gt; If one or both authority components are registry-based then</span></span>
<span id="LC1519" class="line" lang="java"><span class="cm">     *     the URIs are ordered according to the ordering of their authority</span></span>
<span id="LC1520" class="line" lang="java"><span class="cm">     *     components. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1521" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1522" class="line" lang="java"><span class="cm">     *   &lt;/ul&gt;&lt;/li&gt;</span></span>
<span id="LC1523" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1524" class="line" lang="java"><span class="cm">     *   &lt;li&gt;&lt;p&gt; Finally, two hierarchical URIs with identical schemes and</span></span>
<span id="LC1525" class="line" lang="java"><span class="cm">     *   authority components are ordered according to the ordering of their</span></span>
<span id="LC1526" class="line" lang="java"><span class="cm">     *   paths; if their paths are identical then they are ordered according to</span></span>
<span id="LC1527" class="line" lang="java"><span class="cm">     *   the ordering of their queries; if the queries are identical then they</span></span>
<span id="LC1528" class="line" lang="java"><span class="cm">     *   are ordered according to the order of their fragments. &lt;/p&gt;&lt;/li&gt;</span></span>
<span id="LC1529" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1530" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC1531" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1532" class="line" lang="java"><span class="cm">     * &lt;p&gt; This method satisfies the general contract of the {@link</span></span>
<span id="LC1533" class="line" lang="java"><span class="cm">     * java.lang.Comparable#compareTo(Object) Comparable.compareTo}</span></span>
<span id="LC1534" class="line" lang="java"><span class="cm">     * method. &lt;/p&gt;</span></span>
<span id="LC1535" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1536" class="line" lang="java"><span class="cm">     * @param   that</span></span>
<span id="LC1537" class="line" lang="java"><span class="cm">     *          The object to which this URI is to be compared</span></span>
<span id="LC1538" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1539" class="line" lang="java"><span class="cm">     * @return  A negative integer, zero, or a positive integer as this URI is</span></span>
<span id="LC1540" class="line" lang="java"><span class="cm">     *          less than, equal to, or greater than the given URI</span></span>
<span id="LC1541" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1542" class="line" lang="java"><span class="cm">     * @throws  ClassCastException</span></span>
<span id="LC1543" class="line" lang="java"><span class="cm">     *          If the given object is not a URI</span></span>
<span id="LC1544" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1545" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">compareTo</span><span class="o">(</span><span class="no">URI</span> <span class="n">that</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1546" class="line" lang="java">        <span class="kt">int</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1547" class="line" lang="java"></span>
<span id="LC1548" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">=</span> <span class="n">compareIgnoringCase</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">scheme</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">scheme</span><span class="o">))</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1549" class="line" lang="java">            <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1550" class="line" lang="java"></span>
<span id="LC1551" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1552" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">that</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1553" class="line" lang="java">                <span class="c1">// Both opaque</span></span>
<span id="LC1554" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">=</span> <span class="n">compare</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">schemeSpecificPart</span><span class="o">,</span></span>
<span id="LC1555" class="line" lang="java">                                 <span class="n">that</span><span class="o">.</span><span class="na">schemeSpecificPart</span><span class="o">))</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1556" class="line" lang="java">                    <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1557" class="line" lang="java">                <span class="k">return</span> <span class="nf">compare</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">fragment</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">fragment</span><span class="o">);</span></span>
<span id="LC1558" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1559" class="line" lang="java">            <span class="k">return</span> <span class="o">+</span><span class="mi">1</span><span class="o">;</span>                  <span class="c1">// Opaque &gt; hierarchical</span></span>
<span id="LC1560" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">that</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1561" class="line" lang="java">            <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span>                  <span class="c1">// Hierarchical &lt; opaque</span></span>
<span id="LC1562" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1563" class="line" lang="java"></span>
<span id="LC1564" class="line" lang="java">        <span class="c1">// Hierarchical</span></span>
<span id="LC1565" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="k">this</span><span class="o">.</span><span class="na">host</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">that</span><span class="o">.</span><span class="na">host</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1566" class="line" lang="java">            <span class="c1">// Both server-based</span></span>
<span id="LC1567" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">=</span> <span class="n">compare</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">userInfo</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">userInfo</span><span class="o">))</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1568" class="line" lang="java">                <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1569" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">=</span> <span class="n">compareIgnoringCase</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">host</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">host</span><span class="o">))</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1570" class="line" lang="java">                <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1571" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">port</span> <span class="o">-</span> <span class="n">that</span><span class="o">.</span><span class="na">port</span><span class="o">)</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1572" class="line" lang="java">                <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1573" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1574" class="line" lang="java">            <span class="c1">// If one or both authorities are registry-based then we simply</span></span>
<span id="LC1575" class="line" lang="java">            <span class="c1">// compare them in the usual, case-sensitive way.  If one is</span></span>
<span id="LC1576" class="line" lang="java">            <span class="c1">// registry-based and one is server-based then the strings are</span></span>
<span id="LC1577" class="line" lang="java">            <span class="c1">// guaranteed to be unequal, hence the comparison will never return</span></span>
<span id="LC1578" class="line" lang="java">            <span class="c1">// zero and the compareTo and equals methods will remain</span></span>
<span id="LC1579" class="line" lang="java">            <span class="c1">// consistent.</span></span>
<span id="LC1580" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">=</span> <span class="n">compare</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">authority</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">authority</span><span class="o">))</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1581" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1582" class="line" lang="java"></span>
<span id="LC1583" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">=</span> <span class="n">compare</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">path</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">path</span><span class="o">))</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1584" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">=</span> <span class="n">compare</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">query</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">query</span><span class="o">))</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1585" class="line" lang="java">        <span class="k">return</span> <span class="nf">compare</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">fragment</span><span class="o">,</span> <span class="n">that</span><span class="o">.</span><span class="na">fragment</span><span class="o">);</span></span>
<span id="LC1586" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1587" class="line" lang="java"></span>
<span id="LC1588" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1589" class="line" lang="java"><span class="cm">     * Returns the content of this URI as a string.</span></span>
<span id="LC1590" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1591" class="line" lang="java"><span class="cm">     * &lt;p&gt; If this URI was created by invoking one of the constructors in this</span></span>
<span id="LC1592" class="line" lang="java"><span class="cm">     * class then a string equivalent to the original input string, or to the</span></span>
<span id="LC1593" class="line" lang="java"><span class="cm">     * string computed from the originally-given components, as appropriate, is</span></span>
<span id="LC1594" class="line" lang="java"><span class="cm">     * returned.  Otherwise this URI was created by normalization, resolution,</span></span>
<span id="LC1595" class="line" lang="java"><span class="cm">     * or relativization, and so a string is constructed from this URI's</span></span>
<span id="LC1596" class="line" lang="java"><span class="cm">     * components according to the rules specified in &lt;a</span></span>
<span id="LC1597" class="line" lang="java"><span class="cm">     * href="http://www.ietf.org/rfc/rfc2396.txt"&gt;RFC&amp;nbsp;2396&lt;/a&gt;,</span></span>
<span id="LC1598" class="line" lang="java"><span class="cm">     * section&amp;nbsp;5.2, step&amp;nbsp;7. &lt;/p&gt;</span></span>
<span id="LC1599" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1600" class="line" lang="java"><span class="cm">     * @return  The string form of this URI</span></span>
<span id="LC1601" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1602" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">toString</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1603" class="line" lang="java">        <span class="n">defineString</span><span class="o">();</span></span>
<span id="LC1604" class="line" lang="java">        <span class="k">return</span> <span class="n">string</span><span class="o">;</span></span>
<span id="LC1605" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1606" class="line" lang="java"></span>
<span id="LC1607" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1608" class="line" lang="java"><span class="cm">     * Returns the content of this URI as a US-ASCII string.</span></span>
<span id="LC1609" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1610" class="line" lang="java"><span class="cm">     * &lt;p&gt; If this URI does not contain any characters in the &lt;i&gt;other&lt;/i&gt;</span></span>
<span id="LC1611" class="line" lang="java"><span class="cm">     * category then an invocation of this method will return the same value as</span></span>
<span id="LC1612" class="line" lang="java"><span class="cm">     * an invocation of the {@link #toString() toString} method.  Otherwise</span></span>
<span id="LC1613" class="line" lang="java"><span class="cm">     * this method works as if by invoking that method and then &lt;a</span></span>
<span id="LC1614" class="line" lang="java"><span class="cm">     * href="#encode"&gt;encoding&lt;/a&gt; the result.  &lt;/p&gt;</span></span>
<span id="LC1615" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1616" class="line" lang="java"><span class="cm">     * @return  The string form of this URI, encoded as needed</span></span>
<span id="LC1617" class="line" lang="java"><span class="cm">     *          so that it only contains characters in the US-ASCII</span></span>
<span id="LC1618" class="line" lang="java"><span class="cm">     *          charset</span></span>
<span id="LC1619" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1620" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">toASCIIString</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1621" class="line" lang="java">        <span class="n">defineString</span><span class="o">();</span></span>
<span id="LC1622" class="line" lang="java">        <span class="k">return</span> <span class="nf">encode</span><span class="o">(</span><span class="n">string</span><span class="o">);</span></span>
<span id="LC1623" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1624" class="line" lang="java"></span>
<span id="LC1625" class="line" lang="java"></span>
<span id="LC1626" class="line" lang="java">    <span class="c1">// -- Serialization support --</span></span>
<span id="LC1627" class="line" lang="java"></span>
<span id="LC1628" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1629" class="line" lang="java"><span class="cm">     * Saves the content of this URI to the given serial stream.</span></span>
<span id="LC1630" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1631" class="line" lang="java"><span class="cm">     * &lt;p&gt; The only serializable field of a URI instance is its {@code string}</span></span>
<span id="LC1632" class="line" lang="java"><span class="cm">     * field.  That field is given a value, if it does not have one already,</span></span>
<span id="LC1633" class="line" lang="java"><span class="cm">     * and then the {@link java.io.ObjectOutputStream#defaultWriteObject()}</span></span>
<span id="LC1634" class="line" lang="java"><span class="cm">     * method of the given object-output stream is invoked. &lt;/p&gt;</span></span>
<span id="LC1635" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1636" class="line" lang="java"><span class="cm">     * @param  os  The object-output stream to which this object</span></span>
<span id="LC1637" class="line" lang="java"><span class="cm">     *             is to be written</span></span>
<span id="LC1638" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1639" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">writeObject</span><span class="o">(</span><span class="nc">ObjectOutputStream</span> <span class="n">os</span><span class="o">)</span></span>
<span id="LC1640" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">IOException</span></span>
<span id="LC1641" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1642" class="line" lang="java">        <span class="n">defineString</span><span class="o">();</span></span>
<span id="LC1643" class="line" lang="java">        <span class="n">os</span><span class="o">.</span><span class="na">defaultWriteObject</span><span class="o">();</span>        <span class="c1">// Writes the string field only</span></span>
<span id="LC1644" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1645" class="line" lang="java"></span>
<span id="LC1646" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1647" class="line" lang="java"><span class="cm">     * Reconstitutes a URI from the given serial stream.</span></span>
<span id="LC1648" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1649" class="line" lang="java"><span class="cm">     * &lt;p&gt; The {@link java.io.ObjectInputStream#defaultReadObject()} method is</span></span>
<span id="LC1650" class="line" lang="java"><span class="cm">     * invoked to read the value of the {@code string} field.  The result is</span></span>
<span id="LC1651" class="line" lang="java"><span class="cm">     * then parsed in the usual way.</span></span>
<span id="LC1652" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1653" class="line" lang="java"><span class="cm">     * @param  is  The object-input stream from which this object</span></span>
<span id="LC1654" class="line" lang="java"><span class="cm">     *             is being read</span></span>
<span id="LC1655" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1656" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">readObject</span><span class="o">(</span><span class="nc">ObjectInputStream</span> <span class="n">is</span><span class="o">)</span></span>
<span id="LC1657" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">ClassNotFoundException</span><span class="o">,</span> <span class="nc">IOException</span></span>
<span id="LC1658" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1659" class="line" lang="java">        <span class="n">port</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span>                      <span class="c1">// Argh</span></span>
<span id="LC1660" class="line" lang="java">        <span class="n">is</span><span class="o">.</span><span class="na">defaultReadObject</span><span class="o">();</span></span>
<span id="LC1661" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC1662" class="line" lang="java">            <span class="k">new</span> <span class="nf">Parser</span><span class="o">(</span><span class="n">string</span><span class="o">).</span><span class="na">parse</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC1663" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">URISyntaxException</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1664" class="line" lang="java">            <span class="nc">IOException</span> <span class="n">y</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">InvalidObjectException</span><span class="o">(</span><span class="s">"Invalid URI"</span><span class="o">);</span></span>
<span id="LC1665" class="line" lang="java">            <span class="n">y</span><span class="o">.</span><span class="na">initCause</span><span class="o">(</span><span class="n">x</span><span class="o">);</span></span>
<span id="LC1666" class="line" lang="java">            <span class="k">throw</span> <span class="n">y</span><span class="o">;</span></span>
<span id="LC1667" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1668" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1669" class="line" lang="java"></span>
<span id="LC1670" class="line" lang="java"></span>
<span id="LC1671" class="line" lang="java">    <span class="c1">// -- End of public methods --</span></span>
<span id="LC1672" class="line" lang="java"></span>
<span id="LC1673" class="line" lang="java"></span>
<span id="LC1674" class="line" lang="java">    <span class="c1">// -- Utility methods for string-field comparison and hashing --</span></span>
<span id="LC1675" class="line" lang="java"></span>
<span id="LC1676" class="line" lang="java">    <span class="c1">// These methods return appropriate values for null string arguments,</span></span>
<span id="LC1677" class="line" lang="java">    <span class="c1">// thereby simplifying the equals, hashCode, and compareTo methods.</span></span>
<span id="LC1678" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC1679" class="line" lang="java">    <span class="c1">// The case-ignoring methods should only be applied to strings whose</span></span>
<span id="LC1680" class="line" lang="java">    <span class="c1">// characters are all known to be US-ASCII.  Because of this restriction,</span></span>
<span id="LC1681" class="line" lang="java">    <span class="c1">// these methods are faster than the similar methods in the String class.</span></span>
<span id="LC1682" class="line" lang="java"></span>
<span id="LC1683" class="line" lang="java">    <span class="c1">// US-ASCII only</span></span>
<span id="LC1684" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">toLower</span><span class="o">(</span><span class="kt">char</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1685" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">&gt;=</span> <span class="sc">'A'</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;=</span> <span class="sc">'Z'</span><span class="o">))</span></span>
<span id="LC1686" class="line" lang="java">            <span class="k">return</span> <span class="n">c</span> <span class="o">+</span> <span class="o">(</span><span class="sc">'a'</span> <span class="o">-</span> <span class="sc">'A'</span><span class="o">);</span></span>
<span id="LC1687" class="line" lang="java">        <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1688" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1689" class="line" lang="java"></span>
<span id="LC1690" class="line" lang="java">    <span class="c1">// US-ASCII only</span></span>
<span id="LC1691" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">toUpper</span><span class="o">(</span><span class="kt">char</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1692" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">&gt;=</span> <span class="sc">'a'</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;=</span> <span class="sc">'z'</span><span class="o">))</span></span>
<span id="LC1693" class="line" lang="java">            <span class="k">return</span> <span class="n">c</span> <span class="o">-</span> <span class="o">(</span><span class="sc">'a'</span> <span class="o">-</span> <span class="sc">'A'</span><span class="o">);</span></span>
<span id="LC1694" class="line" lang="java">        <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1695" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1696" class="line" lang="java"></span>
<span id="LC1697" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">equal</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">,</span> <span class="nc">String</span> <span class="n">t</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1698" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">==</span> <span class="n">t</span><span class="o">)</span> <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1699" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">s</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">t</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1700" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">!=</span> <span class="n">t</span><span class="o">.</span><span class="na">length</span><span class="o">())</span></span>
<span id="LC1701" class="line" lang="java">                <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1702" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">'%'</span><span class="o">)</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1703" class="line" lang="java">                <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">t</span><span class="o">);</span></span>
<span id="LC1704" class="line" lang="java">            <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC1705" class="line" lang="java">            <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">;)</span> <span class="o">{</span></span>
<span id="LC1706" class="line" lang="java">                <span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC1707" class="line" lang="java">                <span class="kt">char</span> <span class="n">d</span> <span class="o">=</span> <span class="n">t</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC1708" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">!=</span> <span class="sc">'%'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1709" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">!=</span> <span class="n">d</span><span class="o">)</span></span>
<span id="LC1710" class="line" lang="java">                        <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1711" class="line" lang="java">                    <span class="n">i</span><span class="o">++;</span></span>
<span id="LC1712" class="line" lang="java">                    <span class="k">continue</span><span class="o">;</span></span>
<span id="LC1713" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1714" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">d</span> <span class="o">!=</span> <span class="sc">'%'</span><span class="o">)</span></span>
<span id="LC1715" class="line" lang="java">                    <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1716" class="line" lang="java">                <span class="n">i</span><span class="o">++;</span></span>
<span id="LC1717" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">toLower</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">))</span> <span class="o">!=</span> <span class="n">toLower</span><span class="o">(</span><span class="n">t</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">)))</span></span>
<span id="LC1718" class="line" lang="java">                    <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1719" class="line" lang="java">                <span class="n">i</span><span class="o">++;</span></span>
<span id="LC1720" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">toLower</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">))</span> <span class="o">!=</span> <span class="n">toLower</span><span class="o">(</span><span class="n">t</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">)))</span></span>
<span id="LC1721" class="line" lang="java">                    <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1722" class="line" lang="java">                <span class="n">i</span><span class="o">++;</span></span>
<span id="LC1723" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1724" class="line" lang="java">            <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1725" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1726" class="line" lang="java">        <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1727" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1728" class="line" lang="java"></span>
<span id="LC1729" class="line" lang="java">    <span class="c1">// US-ASCII only</span></span>
<span id="LC1730" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">equalIgnoringCase</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">,</span> <span class="nc">String</span> <span class="n">t</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1731" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">==</span> <span class="n">t</span><span class="o">)</span> <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1732" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">s</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">t</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1733" class="line" lang="java">            <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC1734" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">t</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">!=</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC1735" class="line" lang="java">                <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1736" class="line" lang="java">            <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC1737" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">toLower</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">))</span> <span class="o">!=</span> <span class="n">toLower</span><span class="o">(</span><span class="n">t</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">)))</span></span>
<span id="LC1738" class="line" lang="java">                    <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1739" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1740" class="line" lang="java">            <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1741" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1742" class="line" lang="java">        <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1743" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1744" class="line" lang="java"></span>
<span id="LC1745" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">hash</span><span class="o">(</span><span class="kt">int</span> <span class="n">hash</span><span class="o">,</span> <span class="nc">String</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1746" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="k">return</span> <span class="n">hash</span><span class="o">;</span></span>
<span id="LC1747" class="line" lang="java">        <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">'%'</span><span class="o">)</span> <span class="o">&lt;</span> <span class="mi">0</span> <span class="o">?</span> <span class="n">hash</span> <span class="o">*</span> <span class="mi">127</span> <span class="o">+</span> <span class="n">s</span><span class="o">.</span><span class="na">hashCode</span><span class="o">()</span></span>
<span id="LC1748" class="line" lang="java">                                  <span class="o">:</span> <span class="n">normalizedHash</span><span class="o">(</span><span class="n">hash</span><span class="o">,</span> <span class="n">s</span><span class="o">);</span></span>
<span id="LC1749" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1750" class="line" lang="java"></span>
<span id="LC1751" class="line" lang="java"></span>
<span id="LC1752" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">normalizedHash</span><span class="o">(</span><span class="kt">int</span> <span class="n">hash</span><span class="o">,</span> <span class="nc">String</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1753" class="line" lang="java">        <span class="kt">int</span> <span class="n">h</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC1754" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">index</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">index</span> <span class="o">&lt;</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span> <span class="n">index</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC1755" class="line" lang="java">            <span class="kt">char</span> <span class="n">ch</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></span>
<span id="LC1756" class="line" lang="java">            <span class="n">h</span> <span class="o">=</span> <span class="mi">31</span> <span class="o">*</span> <span class="n">h</span> <span class="o">+</span> <span class="n">ch</span><span class="o">;</span></span>
<span id="LC1757" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">ch</span> <span class="o">==</span> <span class="sc">'%'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1758" class="line" lang="java">                <span class="cm">/*</span></span>
<span id="LC1759" class="line" lang="java"><span class="cm">                 * Process the next two encoded characters</span></span>
<span id="LC1760" class="line" lang="java"><span class="cm">                 */</span></span>
<span id="LC1761" class="line" lang="java">                <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">index</span> <span class="o">+</span> <span class="mi">1</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">index</span> <span class="o">+</span> <span class="mi">3</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC1762" class="line" lang="java">                    <span class="n">h</span> <span class="o">=</span> <span class="mi">31</span> <span class="o">*</span> <span class="n">h</span> <span class="o">+</span> <span class="n">toUpper</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">));</span></span>
<span id="LC1763" class="line" lang="java">                <span class="n">index</span> <span class="o">+=</span> <span class="mi">2</span><span class="o">;</span></span>
<span id="LC1764" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1765" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1766" class="line" lang="java">        <span class="k">return</span> <span class="n">hash</span> <span class="o">*</span> <span class="mi">127</span> <span class="o">+</span> <span class="n">h</span><span class="o">;</span></span>
<span id="LC1767" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1768" class="line" lang="java"></span>
<span id="LC1769" class="line" lang="java">    <span class="c1">// US-ASCII only</span></span>
<span id="LC1770" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">hashIgnoringCase</span><span class="o">(</span><span class="kt">int</span> <span class="n">hash</span><span class="o">,</span> <span class="nc">String</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1771" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="k">return</span> <span class="n">hash</span><span class="o">;</span></span>
<span id="LC1772" class="line" lang="java">        <span class="kt">int</span> <span class="n">h</span> <span class="o">=</span> <span class="n">hash</span><span class="o">;</span></span>
<span id="LC1773" class="line" lang="java">        <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC1774" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC1775" class="line" lang="java">            <span class="n">h</span> <span class="o">=</span> <span class="mi">31</span> <span class="o">*</span> <span class="n">h</span> <span class="o">+</span> <span class="n">toLower</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">));</span></span>
<span id="LC1776" class="line" lang="java">        <span class="k">return</span> <span class="n">h</span><span class="o">;</span></span>
<span id="LC1777" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1778" class="line" lang="java"></span>
<span id="LC1779" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">compare</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">,</span> <span class="nc">String</span> <span class="n">t</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1780" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">==</span> <span class="n">t</span><span class="o">)</span> <span class="k">return</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC1781" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1782" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">t</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC1783" class="line" lang="java">                <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">compareTo</span><span class="o">(</span><span class="n">t</span><span class="o">);</span></span>
<span id="LC1784" class="line" lang="java">            <span class="k">else</span></span>
<span id="LC1785" class="line" lang="java">                <span class="k">return</span> <span class="o">+</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC1786" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1787" class="line" lang="java">            <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC1788" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1789" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1790" class="line" lang="java"></span>
<span id="LC1791" class="line" lang="java">    <span class="c1">// US-ASCII only</span></span>
<span id="LC1792" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">compareIgnoringCase</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">,</span> <span class="nc">String</span> <span class="n">t</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1793" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">==</span> <span class="n">t</span><span class="o">)</span> <span class="k">return</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC1794" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1795" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">t</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1796" class="line" lang="java">                <span class="kt">int</span> <span class="n">sn</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC1797" class="line" lang="java">                <span class="kt">int</span> <span class="n">tn</span> <span class="o">=</span> <span class="n">t</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC1798" class="line" lang="java">                <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">sn</span> <span class="o">&lt;</span> <span class="n">tn</span> <span class="o">?</span> <span class="n">sn</span> <span class="o">:</span> <span class="n">tn</span><span class="o">;</span></span>
<span id="LC1799" class="line" lang="java">                <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC1800" class="line" lang="java">                    <span class="kt">int</span> <span class="n">c</span> <span class="o">=</span> <span class="n">toLower</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">))</span> <span class="o">-</span> <span class="n">toLower</span><span class="o">(</span><span class="n">t</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">));</span></span>
<span id="LC1801" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1802" class="line" lang="java">                        <span class="k">return</span> <span class="n">c</span><span class="o">;</span></span>
<span id="LC1803" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1804" class="line" lang="java">                <span class="k">return</span> <span class="n">sn</span> <span class="o">-</span> <span class="n">tn</span><span class="o">;</span></span>
<span id="LC1805" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1806" class="line" lang="java">            <span class="k">return</span> <span class="o">+</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC1807" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1808" class="line" lang="java">            <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC1809" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1810" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1811" class="line" lang="java"></span>
<span id="LC1812" class="line" lang="java"></span>
<span id="LC1813" class="line" lang="java">    <span class="c1">// -- String construction --</span></span>
<span id="LC1814" class="line" lang="java"></span>
<span id="LC1815" class="line" lang="java">    <span class="c1">// If a scheme is given then the path, if given, must be absolute</span></span>
<span id="LC1816" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC1817" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">checkPath</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">,</span> <span class="nc">String</span> <span class="n">scheme</span><span class="o">,</span> <span class="nc">String</span> <span class="n">path</span><span class="o">)</span></span>
<span id="LC1818" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC1819" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1820" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">scheme</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1821" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">path</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC1822" class="line" lang="java">                <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">path</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">path</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="mi">0</span><span class="o">)</span> <span class="o">!=</span> <span class="sc">'/'</span><span class="o">)))</span></span>
<span id="LC1823" class="line" lang="java">                <span class="k">throw</span> <span class="k">new</span> <span class="nf">URISyntaxException</span><span class="o">(</span><span class="n">s</span><span class="o">,</span></span>
<span id="LC1824" class="line" lang="java">                                             <span class="s">"Relative path in absolute URI"</span><span class="o">);</span></span>
<span id="LC1825" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1826" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1827" class="line" lang="java"></span>
<span id="LC1828" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">appendAuthority</span><span class="o">(</span><span class="nc">StringBuffer</span> <span class="n">sb</span><span class="o">,</span></span>
<span id="LC1829" class="line" lang="java">                                 <span class="nc">String</span> <span class="n">authority</span><span class="o">,</span></span>
<span id="LC1830" class="line" lang="java">                                 <span class="nc">String</span> <span class="n">userInfo</span><span class="o">,</span></span>
<span id="LC1831" class="line" lang="java">                                 <span class="nc">String</span> <span class="n">host</span><span class="o">,</span></span>
<span id="LC1832" class="line" lang="java">                                 <span class="kt">int</span> <span class="n">port</span><span class="o">)</span></span>
<span id="LC1833" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1834" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">host</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1835" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">"//"</span><span class="o">);</span></span>
<span id="LC1836" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">userInfo</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1837" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">userInfo</span><span class="o">,</span> <span class="no">L_USERINFO</span><span class="o">,</span> <span class="no">H_USERINFO</span><span class="o">));</span></span>
<span id="LC1838" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'@'</span><span class="o">);</span></span>
<span id="LC1839" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1840" class="line" lang="java">            <span class="kt">boolean</span> <span class="n">needBrackets</span> <span class="o">=</span> <span class="o">((</span><span class="n">host</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">':'</span><span class="o">)</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1841" class="line" lang="java">                                    <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">host</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="s">"["</span><span class="o">)</span></span>
<span id="LC1842" class="line" lang="java">                                    <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">host</span><span class="o">.</span><span class="na">endsWith</span><span class="o">(</span><span class="s">"]"</span><span class="o">));</span></span>
<span id="LC1843" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">needBrackets</span><span class="o">)</span> <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'['</span><span class="o">);</span></span>
<span id="LC1844" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">host</span><span class="o">);</span></span>
<span id="LC1845" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">needBrackets</span><span class="o">)</span> <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">']'</span><span class="o">);</span></span>
<span id="LC1846" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">port</span> <span class="o">!=</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1847" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">':'</span><span class="o">);</span></span>
<span id="LC1848" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">port</span><span class="o">);</span></span>
<span id="LC1849" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1850" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">authority</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1851" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">"//"</span><span class="o">);</span></span>
<span id="LC1852" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">authority</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="s">"["</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1853" class="line" lang="java">                <span class="c1">// authority should (but may not) contain an embedded IPv6 address</span></span>
<span id="LC1854" class="line" lang="java">                <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">authority</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="s">"]"</span><span class="o">);</span></span>
<span id="LC1855" class="line" lang="java">                <span class="nc">String</span> <span class="n">doquote</span> <span class="o">=</span> <span class="n">authority</span><span class="o">,</span> <span class="n">dontquote</span> <span class="o">=</span> <span class="s">""</span><span class="o">;</span></span>
<span id="LC1856" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">end</span> <span class="o">!=</span> <span class="o">-</span><span class="mi">1</span> <span class="o">&amp;&amp;</span> <span class="n">authority</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="s">":"</span><span class="o">)</span> <span class="o">!=</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1857" class="line" lang="java">                    <span class="c1">// the authority contains an IPv6 address</span></span>
<span id="LC1858" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">end</span> <span class="o">==</span> <span class="n">authority</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1859" class="line" lang="java">                        <span class="n">dontquote</span> <span class="o">=</span> <span class="n">authority</span><span class="o">;</span></span>
<span id="LC1860" class="line" lang="java">                        <span class="n">doquote</span> <span class="o">=</span> <span class="s">""</span><span class="o">;</span></span>
<span id="LC1861" class="line" lang="java">                    <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1862" class="line" lang="java">                        <span class="n">dontquote</span> <span class="o">=</span> <span class="n">authority</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span> <span class="o">,</span> <span class="n">end</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></span>
<span id="LC1863" class="line" lang="java">                        <span class="n">doquote</span> <span class="o">=</span> <span class="n">authority</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">end</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></span>
<span id="LC1864" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC1865" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1866" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">dontquote</span><span class="o">);</span></span>
<span id="LC1867" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">doquote</span><span class="o">,</span></span>
<span id="LC1868" class="line" lang="java">                            <span class="no">L_REG_NAME</span> <span class="o">|</span> <span class="no">L_SERVER</span><span class="o">,</span></span>
<span id="LC1869" class="line" lang="java">                            <span class="no">H_REG_NAME</span> <span class="o">|</span> <span class="no">H_SERVER</span><span class="o">));</span></span>
<span id="LC1870" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1871" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">authority</span><span class="o">,</span></span>
<span id="LC1872" class="line" lang="java">                            <span class="no">L_REG_NAME</span> <span class="o">|</span> <span class="no">L_SERVER</span><span class="o">,</span></span>
<span id="LC1873" class="line" lang="java">                            <span class="no">H_REG_NAME</span> <span class="o">|</span> <span class="no">H_SERVER</span><span class="o">));</span></span>
<span id="LC1874" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1875" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1876" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1877" class="line" lang="java"></span>
<span id="LC1878" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">appendSchemeSpecificPart</span><span class="o">(</span><span class="nc">StringBuffer</span> <span class="n">sb</span><span class="o">,</span></span>
<span id="LC1879" class="line" lang="java">                                          <span class="nc">String</span> <span class="n">opaquePart</span><span class="o">,</span></span>
<span id="LC1880" class="line" lang="java">                                          <span class="nc">String</span> <span class="n">authority</span><span class="o">,</span></span>
<span id="LC1881" class="line" lang="java">                                          <span class="nc">String</span> <span class="n">userInfo</span><span class="o">,</span></span>
<span id="LC1882" class="line" lang="java">                                          <span class="nc">String</span> <span class="n">host</span><span class="o">,</span></span>
<span id="LC1883" class="line" lang="java">                                          <span class="kt">int</span> <span class="n">port</span><span class="o">,</span></span>
<span id="LC1884" class="line" lang="java">                                          <span class="nc">String</span> <span class="n">path</span><span class="o">,</span></span>
<span id="LC1885" class="line" lang="java">                                          <span class="nc">String</span> <span class="n">query</span><span class="o">)</span></span>
<span id="LC1886" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1887" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">opaquePart</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1888" class="line" lang="java">            <span class="cm">/* check if SSP begins with an IPv6 address</span></span>
<span id="LC1889" class="line" lang="java"><span class="cm">             * because we must not quote a literal IPv6 address</span></span>
<span id="LC1890" class="line" lang="java"><span class="cm">             */</span></span>
<span id="LC1891" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">opaquePart</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="s">"//["</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1892" class="line" lang="java">                <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span>  <span class="n">opaquePart</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="s">"]"</span><span class="o">);</span></span>
<span id="LC1893" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">end</span> <span class="o">!=</span> <span class="o">-</span><span class="mi">1</span> <span class="o">&amp;&amp;</span> <span class="n">opaquePart</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="s">":"</span><span class="o">)!=-</span><span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1894" class="line" lang="java">                    <span class="nc">String</span> <span class="n">doquote</span><span class="o">,</span> <span class="n">dontquote</span><span class="o">;</span></span>
<span id="LC1895" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">end</span> <span class="o">==</span> <span class="n">opaquePart</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1896" class="line" lang="java">                        <span class="n">dontquote</span> <span class="o">=</span> <span class="n">opaquePart</span><span class="o">;</span></span>
<span id="LC1897" class="line" lang="java">                        <span class="n">doquote</span> <span class="o">=</span> <span class="s">""</span><span class="o">;</span></span>
<span id="LC1898" class="line" lang="java">                    <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1899" class="line" lang="java">                        <span class="n">dontquote</span> <span class="o">=</span> <span class="n">opaquePart</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span><span class="n">end</span><span class="o">+</span><span class="mi">1</span><span class="o">);</span></span>
<span id="LC1900" class="line" lang="java">                        <span class="n">doquote</span> <span class="o">=</span> <span class="n">opaquePart</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">end</span><span class="o">+</span><span class="mi">1</span><span class="o">);</span></span>
<span id="LC1901" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC1902" class="line" lang="java">                    <span class="n">sb</span><span class="o">.</span><span class="na">append</span> <span class="o">(</span><span class="n">dontquote</span><span class="o">);</span></span>
<span id="LC1903" class="line" lang="java">                    <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">doquote</span><span class="o">,</span> <span class="no">L_URIC</span><span class="o">,</span> <span class="no">H_URIC</span><span class="o">));</span></span>
<span id="LC1904" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1905" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1906" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">opaquePart</span><span class="o">,</span> <span class="no">L_URIC</span><span class="o">,</span> <span class="no">H_URIC</span><span class="o">));</span></span>
<span id="LC1907" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1908" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1909" class="line" lang="java">            <span class="n">appendAuthority</span><span class="o">(</span><span class="n">sb</span><span class="o">,</span> <span class="n">authority</span><span class="o">,</span> <span class="n">userInfo</span><span class="o">,</span> <span class="n">host</span><span class="o">,</span> <span class="n">port</span><span class="o">);</span></span>
<span id="LC1910" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">path</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC1911" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">path</span><span class="o">,</span> <span class="no">L_PATH</span><span class="o">,</span> <span class="no">H_PATH</span><span class="o">));</span></span>
<span id="LC1912" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">query</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1913" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'?'</span><span class="o">);</span></span>
<span id="LC1914" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">query</span><span class="o">,</span> <span class="no">L_URIC</span><span class="o">,</span> <span class="no">H_URIC</span><span class="o">));</span></span>
<span id="LC1915" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1916" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1917" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1918" class="line" lang="java"></span>
<span id="LC1919" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">appendFragment</span><span class="o">(</span><span class="nc">StringBuffer</span> <span class="n">sb</span><span class="o">,</span> <span class="nc">String</span> <span class="n">fragment</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1920" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">fragment</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1921" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'#'</span><span class="o">);</span></span>
<span id="LC1922" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">fragment</span><span class="o">,</span> <span class="no">L_URIC</span><span class="o">,</span> <span class="no">H_URIC</span><span class="o">));</span></span>
<span id="LC1923" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1924" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1925" class="line" lang="java"></span>
<span id="LC1926" class="line" lang="java">    <span class="kd">private</span> <span class="nc">String</span> <span class="nf">toString</span><span class="o">(</span><span class="nc">String</span> <span class="n">scheme</span><span class="o">,</span></span>
<span id="LC1927" class="line" lang="java">                            <span class="nc">String</span> <span class="n">opaquePart</span><span class="o">,</span></span>
<span id="LC1928" class="line" lang="java">                            <span class="nc">String</span> <span class="n">authority</span><span class="o">,</span></span>
<span id="LC1929" class="line" lang="java">                            <span class="nc">String</span> <span class="n">userInfo</span><span class="o">,</span></span>
<span id="LC1930" class="line" lang="java">                            <span class="nc">String</span> <span class="n">host</span><span class="o">,</span></span>
<span id="LC1931" class="line" lang="java">                            <span class="kt">int</span> <span class="n">port</span><span class="o">,</span></span>
<span id="LC1932" class="line" lang="java">                            <span class="nc">String</span> <span class="n">path</span><span class="o">,</span></span>
<span id="LC1933" class="line" lang="java">                            <span class="nc">String</span> <span class="n">query</span><span class="o">,</span></span>
<span id="LC1934" class="line" lang="java">                            <span class="nc">String</span> <span class="n">fragment</span><span class="o">)</span></span>
<span id="LC1935" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC1936" class="line" lang="java">        <span class="nc">StringBuffer</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">();</span></span>
<span id="LC1937" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">scheme</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1938" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">scheme</span><span class="o">);</span></span>
<span id="LC1939" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">':'</span><span class="o">);</span></span>
<span id="LC1940" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1941" class="line" lang="java">        <span class="n">appendSchemeSpecificPart</span><span class="o">(</span><span class="n">sb</span><span class="o">,</span> <span class="n">opaquePart</span><span class="o">,</span></span>
<span id="LC1942" class="line" lang="java">                                 <span class="n">authority</span><span class="o">,</span> <span class="n">userInfo</span><span class="o">,</span> <span class="n">host</span><span class="o">,</span> <span class="n">port</span><span class="o">,</span></span>
<span id="LC1943" class="line" lang="java">                                 <span class="n">path</span><span class="o">,</span> <span class="n">query</span><span class="o">);</span></span>
<span id="LC1944" class="line" lang="java">        <span class="n">appendFragment</span><span class="o">(</span><span class="n">sb</span><span class="o">,</span> <span class="n">fragment</span><span class="o">);</span></span>
<span id="LC1945" class="line" lang="java">        <span class="k">return</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></span>
<span id="LC1946" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1947" class="line" lang="java"></span>
<span id="LC1948" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">defineSchemeSpecificPart</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1949" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">schemeSpecificPart</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="k">return</span><span class="o">;</span></span>
<span id="LC1950" class="line" lang="java">        <span class="nc">StringBuffer</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">();</span></span>
<span id="LC1951" class="line" lang="java">        <span class="n">appendSchemeSpecificPart</span><span class="o">(</span><span class="n">sb</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="n">getAuthority</span><span class="o">(),</span> <span class="n">getUserInfo</span><span class="o">(),</span></span>
<span id="LC1952" class="line" lang="java">                                 <span class="n">host</span><span class="o">,</span> <span class="n">port</span><span class="o">,</span> <span class="n">getPath</span><span class="o">(),</span> <span class="n">getQuery</span><span class="o">());</span></span>
<span id="LC1953" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">sb</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="k">return</span><span class="o">;</span></span>
<span id="LC1954" class="line" lang="java">        <span class="n">schemeSpecificPart</span> <span class="o">=</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></span>
<span id="LC1955" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1956" class="line" lang="java"></span>
<span id="LC1957" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">defineString</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1958" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">string</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="k">return</span><span class="o">;</span></span>
<span id="LC1959" class="line" lang="java"></span>
<span id="LC1960" class="line" lang="java">        <span class="nc">StringBuffer</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">();</span></span>
<span id="LC1961" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">scheme</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1962" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">scheme</span><span class="o">);</span></span>
<span id="LC1963" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">':'</span><span class="o">);</span></span>
<span id="LC1964" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1965" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">isOpaque</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1966" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">schemeSpecificPart</span><span class="o">);</span></span>
<span id="LC1967" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1968" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">host</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1969" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">"//"</span><span class="o">);</span></span>
<span id="LC1970" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">userInfo</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1971" class="line" lang="java">                    <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">userInfo</span><span class="o">);</span></span>
<span id="LC1972" class="line" lang="java">                    <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'@'</span><span class="o">);</span></span>
<span id="LC1973" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1974" class="line" lang="java">                <span class="kt">boolean</span> <span class="n">needBrackets</span> <span class="o">=</span> <span class="o">((</span><span class="n">host</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">':'</span><span class="o">)</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC1975" class="line" lang="java">                                    <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">host</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="s">"["</span><span class="o">)</span></span>
<span id="LC1976" class="line" lang="java">                                    <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">host</span><span class="o">.</span><span class="na">endsWith</span><span class="o">(</span><span class="s">"]"</span><span class="o">));</span></span>
<span id="LC1977" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">needBrackets</span><span class="o">)</span> <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'['</span><span class="o">);</span></span>
<span id="LC1978" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">host</span><span class="o">);</span></span>
<span id="LC1979" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">needBrackets</span><span class="o">)</span> <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">']'</span><span class="o">);</span></span>
<span id="LC1980" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">port</span> <span class="o">!=</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1981" class="line" lang="java">                    <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">':'</span><span class="o">);</span></span>
<span id="LC1982" class="line" lang="java">                    <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">port</span><span class="o">);</span></span>
<span id="LC1983" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1984" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">authority</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1985" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">"//"</span><span class="o">);</span></span>
<span id="LC1986" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">authority</span><span class="o">);</span></span>
<span id="LC1987" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1988" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">path</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC1989" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">path</span><span class="o">);</span></span>
<span id="LC1990" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">query</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1991" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'?'</span><span class="o">);</span></span>
<span id="LC1992" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">query</span><span class="o">);</span></span>
<span id="LC1993" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1994" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1995" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">fragment</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1996" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'#'</span><span class="o">);</span></span>
<span id="LC1997" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">fragment</span><span class="o">);</span></span>
<span id="LC1998" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1999" class="line" lang="java">        <span class="n">string</span> <span class="o">=</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></span>
<span id="LC2000" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2001" class="line" lang="java"></span>
<span id="LC2002" class="line" lang="java"></span>
<span id="LC2003" class="line" lang="java">    <span class="c1">// -- Normalization, resolution, and relativization --</span></span>
<span id="LC2004" class="line" lang="java"></span>
<span id="LC2005" class="line" lang="java">    <span class="c1">// RFC2396 5.2 (6)</span></span>
<span id="LC2006" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">String</span> <span class="nf">resolvePath</span><span class="o">(</span><span class="nc">String</span> <span class="n">base</span><span class="o">,</span> <span class="nc">String</span> <span class="n">child</span><span class="o">,</span></span>
<span id="LC2007" class="line" lang="java">                                      <span class="kt">boolean</span> <span class="n">absolute</span><span class="o">)</span></span>
<span id="LC2008" class="line" lang="java">    <span class="o">{</span></span>
<span id="LC2009" class="line" lang="java">        <span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">lastIndexOf</span><span class="o">(</span><span class="sc">'/'</span><span class="o">);</span></span>
<span id="LC2010" class="line" lang="java">        <span class="kt">int</span> <span class="n">cn</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC2011" class="line" lang="java">        <span class="nc">String</span> <span class="n">path</span> <span class="o">=</span> <span class="s">""</span><span class="o">;</span></span>
<span id="LC2012" class="line" lang="java"></span>
<span id="LC2013" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">cn</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2014" class="line" lang="java">            <span class="c1">// 5.2 (6a)</span></span>
<span id="LC2015" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">i</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2016" class="line" lang="java">                <span class="n">path</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">i</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></span>
<span id="LC2017" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2018" class="line" lang="java">            <span class="nc">StringBuffer</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">(</span><span class="n">base</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">+</span> <span class="n">cn</span><span class="o">);</span></span>
<span id="LC2019" class="line" lang="java">            <span class="c1">// 5.2 (6a)</span></span>
<span id="LC2020" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">i</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2021" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">base</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">i</span> <span class="o">+</span> <span class="mi">1</span><span class="o">));</span></span>
<span id="LC2022" class="line" lang="java">            <span class="c1">// 5.2 (6b)</span></span>
<span id="LC2023" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">child</span><span class="o">);</span></span>
<span id="LC2024" class="line" lang="java">            <span class="n">path</span> <span class="o">=</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></span>
<span id="LC2025" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2026" class="line" lang="java"></span>
<span id="LC2027" class="line" lang="java">        <span class="c1">// 5.2 (6c-f)</span></span>
<span id="LC2028" class="line" lang="java">        <span class="nc">String</span> <span class="n">np</span> <span class="o">=</span> <span class="n">normalize</span><span class="o">(</span><span class="n">path</span><span class="o">);</span></span>
<span id="LC2029" class="line" lang="java"></span>
<span id="LC2030" class="line" lang="java">        <span class="c1">// 5.2 (6g): If the result is absolute but the path begins with "../",</span></span>
<span id="LC2031" class="line" lang="java">        <span class="c1">// then we simply leave the path as-is</span></span>
<span id="LC2032" class="line" lang="java"></span>
<span id="LC2033" class="line" lang="java">        <span class="k">return</span> <span class="n">np</span><span class="o">;</span></span>
<span id="LC2034" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2035" class="line" lang="java"></span>
<span id="LC2036" class="line" lang="java">    <span class="c1">// RFC2396 5.2</span></span>
<span id="LC2037" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="no">URI</span> <span class="nf">resolve</span><span class="o">(</span><span class="no">URI</span> <span class="n">base</span><span class="o">,</span> <span class="no">URI</span> <span class="n">child</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2038" class="line" lang="java">        <span class="c1">// check if child if opaque first so that NPE is thrown</span></span>
<span id="LC2039" class="line" lang="java">        <span class="c1">// if child is null.</span></span>
<span id="LC2040" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">()</span> <span class="o">||</span> <span class="n">base</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">())</span></span>
<span id="LC2041" class="line" lang="java">            <span class="k">return</span> <span class="n">child</span><span class="o">;</span></span>
<span id="LC2042" class="line" lang="java"></span>
<span id="LC2043" class="line" lang="java">        <span class="c1">// 5.2 (2): Reference to current document (lone fragment)</span></span>
<span id="LC2044" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">child</span><span class="o">.</span><span class="na">scheme</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">authority</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2045" class="line" lang="java">            <span class="o">&amp;&amp;</span> <span class="n">child</span><span class="o">.</span><span class="na">path</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">""</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">fragment</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2046" class="line" lang="java">            <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">query</span> <span class="o">==</span> <span class="kc">null</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2047" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">base</span><span class="o">.</span><span class="na">fragment</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2048" class="line" lang="java">                <span class="o">&amp;&amp;</span> <span class="n">child</span><span class="o">.</span><span class="na">fragment</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">base</span><span class="o">.</span><span class="na">fragment</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2049" class="line" lang="java">                <span class="k">return</span> <span class="n">base</span><span class="o">;</span></span>
<span id="LC2050" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2051" class="line" lang="java">            <span class="no">URI</span> <span class="n">ru</span> <span class="o">=</span> <span class="k">new</span> <span class="no">URI</span><span class="o">();</span></span>
<span id="LC2052" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">scheme</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">scheme</span><span class="o">;</span></span>
<span id="LC2053" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">authority</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">authority</span><span class="o">;</span></span>
<span id="LC2054" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">userInfo</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">userInfo</span><span class="o">;</span></span>
<span id="LC2055" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">host</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">host</span><span class="o">;</span></span>
<span id="LC2056" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">port</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">port</span><span class="o">;</span></span>
<span id="LC2057" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">path</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">path</span><span class="o">;</span></span>
<span id="LC2058" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">fragment</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">fragment</span><span class="o">;</span></span>
<span id="LC2059" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">query</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">query</span><span class="o">;</span></span>
<span id="LC2060" class="line" lang="java">            <span class="k">return</span> <span class="n">ru</span><span class="o">;</span></span>
<span id="LC2061" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2062" class="line" lang="java"></span>
<span id="LC2063" class="line" lang="java">        <span class="c1">// 5.2 (3): Child is absolute</span></span>
<span id="LC2064" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">scheme</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2065" class="line" lang="java">            <span class="k">return</span> <span class="n">child</span><span class="o">;</span></span>
<span id="LC2066" class="line" lang="java"></span>
<span id="LC2067" class="line" lang="java">        <span class="no">URI</span> <span class="n">ru</span> <span class="o">=</span> <span class="k">new</span> <span class="no">URI</span><span class="o">();</span>             <span class="c1">// Resolved URI</span></span>
<span id="LC2068" class="line" lang="java">        <span class="n">ru</span><span class="o">.</span><span class="na">scheme</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">scheme</span><span class="o">;</span></span>
<span id="LC2069" class="line" lang="java">        <span class="n">ru</span><span class="o">.</span><span class="na">query</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">query</span><span class="o">;</span></span>
<span id="LC2070" class="line" lang="java">        <span class="n">ru</span><span class="o">.</span><span class="na">fragment</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">fragment</span><span class="o">;</span></span>
<span id="LC2071" class="line" lang="java"></span>
<span id="LC2072" class="line" lang="java">        <span class="c1">// 5.2 (4): Authority</span></span>
<span id="LC2073" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">authority</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2074" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">authority</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">authority</span><span class="o">;</span></span>
<span id="LC2075" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">host</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">host</span><span class="o">;</span></span>
<span id="LC2076" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">userInfo</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">userInfo</span><span class="o">;</span></span>
<span id="LC2077" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">port</span> <span class="o">=</span> <span class="n">base</span><span class="o">.</span><span class="na">port</span><span class="o">;</span></span>
<span id="LC2078" class="line" lang="java"></span>
<span id="LC2079" class="line" lang="java">            <span class="nc">String</span> <span class="n">cp</span> <span class="o">=</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">path</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span> <span class="s">""</span> <span class="o">:</span> <span class="n">child</span><span class="o">.</span><span class="na">path</span><span class="o">;</span></span>
<span id="LC2080" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">cp</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">cp</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="mi">0</span><span class="o">)</span> <span class="o">==</span> <span class="sc">'/'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2081" class="line" lang="java">                <span class="c1">// 5.2 (5): Child path is absolute</span></span>
<span id="LC2082" class="line" lang="java">                <span class="n">ru</span><span class="o">.</span><span class="na">path</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">path</span><span class="o">;</span></span>
<span id="LC2083" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2084" class="line" lang="java">                <span class="c1">// 5.2 (6): Resolve relative path</span></span>
<span id="LC2085" class="line" lang="java">                <span class="n">ru</span><span class="o">.</span><span class="na">path</span> <span class="o">=</span> <span class="n">resolvePath</span><span class="o">(</span><span class="n">base</span><span class="o">.</span><span class="na">path</span><span class="o">,</span> <span class="n">cp</span><span class="o">,</span> <span class="n">base</span><span class="o">.</span><span class="na">isAbsolute</span><span class="o">());</span></span>
<span id="LC2086" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2087" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2088" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">authority</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">authority</span><span class="o">;</span></span>
<span id="LC2089" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">host</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">host</span><span class="o">;</span></span>
<span id="LC2090" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">userInfo</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">userInfo</span><span class="o">;</span></span>
<span id="LC2091" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">host</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">host</span><span class="o">;</span></span>
<span id="LC2092" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">port</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">port</span><span class="o">;</span></span>
<span id="LC2093" class="line" lang="java">            <span class="n">ru</span><span class="o">.</span><span class="na">path</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">path</span><span class="o">;</span></span>
<span id="LC2094" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2095" class="line" lang="java"></span>
<span id="LC2096" class="line" lang="java">        <span class="c1">// 5.2 (7): Recombine (nothing to do here)</span></span>
<span id="LC2097" class="line" lang="java">        <span class="k">return</span> <span class="n">ru</span><span class="o">;</span></span>
<span id="LC2098" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2099" class="line" lang="java"></span>
<span id="LC2100" class="line" lang="java">    <span class="c1">// If the given URI's path is normal then return the URI;</span></span>
<span id="LC2101" class="line" lang="java">    <span class="c1">// o.w., return a new URI containing the normalized path.</span></span>
<span id="LC2102" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2103" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="no">URI</span> <span class="nf">normalize</span><span class="o">(</span><span class="no">URI</span> <span class="n">u</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2104" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">u</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">()</span> <span class="o">||</span> <span class="o">(</span><span class="n">u</span><span class="o">.</span><span class="na">path</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">||</span> <span class="o">(</span><span class="n">u</span><span class="o">.</span><span class="na">path</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span><span class="o">))</span></span>
<span id="LC2105" class="line" lang="java">            <span class="k">return</span> <span class="n">u</span><span class="o">;</span></span>
<span id="LC2106" class="line" lang="java"></span>
<span id="LC2107" class="line" lang="java">        <span class="nc">String</span> <span class="n">np</span> <span class="o">=</span> <span class="n">normalize</span><span class="o">(</span><span class="n">u</span><span class="o">.</span><span class="na">path</span><span class="o">);</span></span>
<span id="LC2108" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">np</span> <span class="o">==</span> <span class="n">u</span><span class="o">.</span><span class="na">path</span><span class="o">)</span></span>
<span id="LC2109" class="line" lang="java">            <span class="k">return</span> <span class="n">u</span><span class="o">;</span></span>
<span id="LC2110" class="line" lang="java"></span>
<span id="LC2111" class="line" lang="java">        <span class="no">URI</span> <span class="n">v</span> <span class="o">=</span> <span class="k">new</span> <span class="no">URI</span><span class="o">();</span></span>
<span id="LC2112" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">scheme</span> <span class="o">=</span> <span class="n">u</span><span class="o">.</span><span class="na">scheme</span><span class="o">;</span></span>
<span id="LC2113" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">fragment</span> <span class="o">=</span> <span class="n">u</span><span class="o">.</span><span class="na">fragment</span><span class="o">;</span></span>
<span id="LC2114" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">authority</span> <span class="o">=</span> <span class="n">u</span><span class="o">.</span><span class="na">authority</span><span class="o">;</span></span>
<span id="LC2115" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">userInfo</span> <span class="o">=</span> <span class="n">u</span><span class="o">.</span><span class="na">userInfo</span><span class="o">;</span></span>
<span id="LC2116" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">host</span> <span class="o">=</span> <span class="n">u</span><span class="o">.</span><span class="na">host</span><span class="o">;</span></span>
<span id="LC2117" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">port</span> <span class="o">=</span> <span class="n">u</span><span class="o">.</span><span class="na">port</span><span class="o">;</span></span>
<span id="LC2118" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">path</span> <span class="o">=</span> <span class="n">np</span><span class="o">;</span></span>
<span id="LC2119" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">query</span> <span class="o">=</span> <span class="n">u</span><span class="o">.</span><span class="na">query</span><span class="o">;</span></span>
<span id="LC2120" class="line" lang="java">        <span class="k">return</span> <span class="n">v</span><span class="o">;</span></span>
<span id="LC2121" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2122" class="line" lang="java"></span>
<span id="LC2123" class="line" lang="java">    <span class="c1">// If both URIs are hierarchical, their scheme and authority components are</span></span>
<span id="LC2124" class="line" lang="java">    <span class="c1">// identical, and the base path is a prefix of the child's path, then</span></span>
<span id="LC2125" class="line" lang="java">    <span class="c1">// return a relative URI that, when resolved against the base, yields the</span></span>
<span id="LC2126" class="line" lang="java">    <span class="c1">// child; otherwise, return the child.</span></span>
<span id="LC2127" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2128" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="no">URI</span> <span class="nf">relativize</span><span class="o">(</span><span class="no">URI</span> <span class="n">base</span><span class="o">,</span> <span class="no">URI</span> <span class="n">child</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2129" class="line" lang="java">        <span class="c1">// check if child if opaque first so that NPE is thrown</span></span>
<span id="LC2130" class="line" lang="java">        <span class="c1">// if child is null.</span></span>
<span id="LC2131" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">()</span> <span class="o">||</span> <span class="n">base</span><span class="o">.</span><span class="na">isOpaque</span><span class="o">())</span></span>
<span id="LC2132" class="line" lang="java">            <span class="k">return</span> <span class="n">child</span><span class="o">;</span></span>
<span id="LC2133" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">equalIgnoringCase</span><span class="o">(</span><span class="n">base</span><span class="o">.</span><span class="na">scheme</span><span class="o">,</span> <span class="n">child</span><span class="o">.</span><span class="na">scheme</span><span class="o">)</span></span>
<span id="LC2134" class="line" lang="java">            <span class="o">||</span> <span class="o">!</span><span class="n">equal</span><span class="o">(</span><span class="n">base</span><span class="o">.</span><span class="na">authority</span><span class="o">,</span> <span class="n">child</span><span class="o">.</span><span class="na">authority</span><span class="o">))</span></span>
<span id="LC2135" class="line" lang="java">            <span class="k">return</span> <span class="n">child</span><span class="o">;</span></span>
<span id="LC2136" class="line" lang="java"></span>
<span id="LC2137" class="line" lang="java">        <span class="nc">String</span> <span class="n">bp</span> <span class="o">=</span> <span class="n">normalize</span><span class="o">(</span><span class="n">base</span><span class="o">.</span><span class="na">path</span><span class="o">);</span></span>
<span id="LC2138" class="line" lang="java">        <span class="nc">String</span> <span class="n">cp</span> <span class="o">=</span> <span class="n">normalize</span><span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">path</span><span class="o">);</span></span>
<span id="LC2139" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">bp</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">cp</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2140" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">bp</span><span class="o">.</span><span class="na">endsWith</span><span class="o">(</span><span class="s">"/"</span><span class="o">))</span></span>
<span id="LC2141" class="line" lang="java">                <span class="n">bp</span> <span class="o">=</span> <span class="n">bp</span> <span class="o">+</span> <span class="s">"/"</span><span class="o">;</span></span>
<span id="LC2142" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">cp</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="n">bp</span><span class="o">))</span></span>
<span id="LC2143" class="line" lang="java">                <span class="k">return</span> <span class="n">child</span><span class="o">;</span></span>
<span id="LC2144" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2145" class="line" lang="java"></span>
<span id="LC2146" class="line" lang="java">        <span class="no">URI</span> <span class="n">v</span> <span class="o">=</span> <span class="k">new</span> <span class="no">URI</span><span class="o">();</span></span>
<span id="LC2147" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">path</span> <span class="o">=</span> <span class="n">cp</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">bp</span><span class="o">.</span><span class="na">length</span><span class="o">());</span></span>
<span id="LC2148" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">query</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">query</span><span class="o">;</span></span>
<span id="LC2149" class="line" lang="java">        <span class="n">v</span><span class="o">.</span><span class="na">fragment</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">fragment</span><span class="o">;</span></span>
<span id="LC2150" class="line" lang="java">        <span class="k">return</span> <span class="n">v</span><span class="o">;</span></span>
<span id="LC2151" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2152" class="line" lang="java"></span>
<span id="LC2153" class="line" lang="java"></span>
<span id="LC2154" class="line" lang="java"></span>
<span id="LC2155" class="line" lang="java">    <span class="c1">// -- Path normalization --</span></span>
<span id="LC2156" class="line" lang="java"></span>
<span id="LC2157" class="line" lang="java">    <span class="c1">// The following algorithm for path normalization avoids the creation of a</span></span>
<span id="LC2158" class="line" lang="java">    <span class="c1">// string object for each segment, as well as the use of a string buffer to</span></span>
<span id="LC2159" class="line" lang="java">    <span class="c1">// compute the final result, by using a single char array and editing it in</span></span>
<span id="LC2160" class="line" lang="java">    <span class="c1">// place.  The array is first split into segments, replacing each slash</span></span>
<span id="LC2161" class="line" lang="java">    <span class="c1">// with '\0' and creating a segment-index array, each element of which is</span></span>
<span id="LC2162" class="line" lang="java">    <span class="c1">// the index of the first char in the corresponding segment.  We then walk</span></span>
<span id="LC2163" class="line" lang="java">    <span class="c1">// through both arrays, removing ".", "..", and other segments as necessary</span></span>
<span id="LC2164" class="line" lang="java">    <span class="c1">// by setting their entries in the index array to -1.  Finally, the two</span></span>
<span id="LC2165" class="line" lang="java">    <span class="c1">// arrays are used to rejoin the segments and compute the final result.</span></span>
<span id="LC2166" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2167" class="line" lang="java">    <span class="c1">// This code is based upon src/solaris/native/java/io/canonicalize_md.c</span></span>
<span id="LC2168" class="line" lang="java"></span>
<span id="LC2169" class="line" lang="java"></span>
<span id="LC2170" class="line" lang="java">    <span class="c1">// Check the given path to see if it might need normalization.  A path</span></span>
<span id="LC2171" class="line" lang="java">    <span class="c1">// might need normalization if it contains duplicate slashes, a "."</span></span>
<span id="LC2172" class="line" lang="java">    <span class="c1">// segment, or a ".." segment.  Return -1 if no further normalization is</span></span>
<span id="LC2173" class="line" lang="java">    <span class="c1">// possible, otherwise return the number of segments found.</span></span>
<span id="LC2174" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2175" class="line" lang="java">    <span class="c1">// This method takes a string argument rather than a char array so that</span></span>
<span id="LC2176" class="line" lang="java">    <span class="c1">// this test can be performed without invoking path.toCharArray().</span></span>
<span id="LC2177" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2178" class="line" lang="java">    <span class="kd">static</span> <span class="kd">private</span> <span class="kt">int</span> <span class="nf">needsNormalization</span><span class="o">(</span><span class="nc">String</span> <span class="n">path</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2179" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">normal</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC2180" class="line" lang="java">        <span class="kt">int</span> <span class="n">ns</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>                     <span class="c1">// Number of segments</span></span>
<span id="LC2181" class="line" lang="java">        <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">path</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span>    <span class="c1">// Index of last char in path</span></span>
<span id="LC2182" class="line" lang="java">        <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>                      <span class="c1">// Index of next char in path</span></span>
<span id="LC2183" class="line" lang="java"></span>
<span id="LC2184" class="line" lang="java">        <span class="c1">// Skip initial slashes</span></span>
<span id="LC2185" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2186" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">)</span> <span class="o">!=</span> <span class="sc">'/'</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span></span>
<span id="LC2187" class="line" lang="java">            <span class="n">p</span><span class="o">++;</span></span>
<span id="LC2188" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2189" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&gt;</span> <span class="mi">1</span><span class="o">)</span> <span class="n">normal</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2190" class="line" lang="java"></span>
<span id="LC2191" class="line" lang="java">        <span class="c1">// Scan segments</span></span>
<span id="LC2192" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2193" class="line" lang="java"></span>
<span id="LC2194" class="line" lang="java">            <span class="c1">// Looking at "." or ".." ?</span></span>
<span id="LC2195" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">path</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">)</span> <span class="o">==</span> <span class="sc">'.'</span><span class="o">)</span></span>
<span id="LC2196" class="line" lang="java">                <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">p</span> <span class="o">==</span> <span class="n">end</span><span class="o">)</span></span>
<span id="LC2197" class="line" lang="java">                    <span class="o">||</span> <span class="o">((</span><span class="n">path</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">)</span> <span class="o">==</span> <span class="sc">'/'</span><span class="o">)</span></span>
<span id="LC2198" class="line" lang="java">                        <span class="o">||</span> <span class="o">((</span><span class="n">path</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">)</span> <span class="o">==</span> <span class="sc">'.'</span><span class="o">)</span></span>
<span id="LC2199" class="line" lang="java">                            <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span> <span class="o">==</span> <span class="n">end</span><span class="o">)</span></span>
<span id="LC2200" class="line" lang="java">                                <span class="o">||</span> <span class="o">(</span><span class="n">path</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">2</span><span class="o">)</span> <span class="o">==</span> <span class="sc">'/'</span><span class="o">))))))</span> <span class="o">{</span></span>
<span id="LC2201" class="line" lang="java">                <span class="n">normal</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2202" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2203" class="line" lang="java">            <span class="n">ns</span><span class="o">++;</span></span>
<span id="LC2204" class="line" lang="java"></span>
<span id="LC2205" class="line" lang="java">            <span class="c1">// Find beginning of next segment</span></span>
<span id="LC2206" class="line" lang="java">            <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2207" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">++)</span> <span class="o">!=</span> <span class="sc">'/'</span><span class="o">)</span></span>
<span id="LC2208" class="line" lang="java">                    <span class="k">continue</span><span class="o">;</span></span>
<span id="LC2209" class="line" lang="java"></span>
<span id="LC2210" class="line" lang="java">                <span class="c1">// Skip redundant slashes</span></span>
<span id="LC2211" class="line" lang="java">                <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2212" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">)</span> <span class="o">!=</span> <span class="sc">'/'</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span></span>
<span id="LC2213" class="line" lang="java">                    <span class="n">normal</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2214" class="line" lang="java">                    <span class="n">p</span><span class="o">++;</span></span>
<span id="LC2215" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2216" class="line" lang="java"></span>
<span id="LC2217" class="line" lang="java">                <span class="k">break</span><span class="o">;</span></span>
<span id="LC2218" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2219" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2220" class="line" lang="java"></span>
<span id="LC2221" class="line" lang="java">        <span class="k">return</span> <span class="n">normal</span> <span class="o">?</span> <span class="o">-</span><span class="mi">1</span> <span class="o">:</span> <span class="n">ns</span><span class="o">;</span></span>
<span id="LC2222" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2223" class="line" lang="java"></span>
<span id="LC2224" class="line" lang="java"></span>
<span id="LC2225" class="line" lang="java">    <span class="c1">// Split the given path into segments, replacing slashes with nulls and</span></span>
<span id="LC2226" class="line" lang="java">    <span class="c1">// filling in the given segment-index array.</span></span>
<span id="LC2227" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2228" class="line" lang="java">    <span class="c1">// Preconditions:</span></span>
<span id="LC2229" class="line" lang="java">    <span class="c1">//   segs.length == Number of segments in path</span></span>
<span id="LC2230" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2231" class="line" lang="java">    <span class="c1">// Postconditions:</span></span>
<span id="LC2232" class="line" lang="java">    <span class="c1">//   All slashes in path replaced by '\0'</span></span>
<span id="LC2233" class="line" lang="java">    <span class="c1">//   segs[i] == Index of first char in segment i (0 &lt;= i &lt; segs.length)</span></span>
<span id="LC2234" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2235" class="line" lang="java">    <span class="kd">static</span> <span class="kd">private</span> <span class="kt">void</span> <span class="nf">split</span><span class="o">(</span><span class="kt">char</span><span class="o">[]</span> <span class="n">path</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">segs</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2236" class="line" lang="java">        <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">path</span><span class="o">.</span><span class="na">length</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span>      <span class="c1">// Index of last char in path</span></span>
<span id="LC2237" class="line" lang="java">        <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>                      <span class="c1">// Index of next char in path</span></span>
<span id="LC2238" class="line" lang="java">        <span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>                      <span class="c1">// Index of current segment</span></span>
<span id="LC2239" class="line" lang="java"></span>
<span id="LC2240" class="line" lang="java">        <span class="c1">// Skip initial slashes</span></span>
<span id="LC2241" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2242" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">!=</span> <span class="sc">'/'</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span></span>
<span id="LC2243" class="line" lang="java">            <span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">=</span> <span class="sc">'\0'</span><span class="o">;</span></span>
<span id="LC2244" class="line" lang="java">            <span class="n">p</span><span class="o">++;</span></span>
<span id="LC2245" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2246" class="line" lang="java"></span>
<span id="LC2247" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2248" class="line" lang="java"></span>
<span id="LC2249" class="line" lang="java">            <span class="c1">// Note start of segment</span></span>
<span id="LC2250" class="line" lang="java">            <span class="n">segs</span><span class="o">[</span><span class="n">i</span><span class="o">++]</span> <span class="o">=</span> <span class="n">p</span><span class="o">++;</span></span>
<span id="LC2251" class="line" lang="java"></span>
<span id="LC2252" class="line" lang="java">            <span class="c1">// Find beginning of next segment</span></span>
<span id="LC2253" class="line" lang="java">            <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2254" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">++]</span> <span class="o">!=</span> <span class="sc">'/'</span><span class="o">)</span></span>
<span id="LC2255" class="line" lang="java">                    <span class="k">continue</span><span class="o">;</span></span>
<span id="LC2256" class="line" lang="java">                <span class="n">path</span><span class="o">[</span><span class="n">p</span> <span class="o">-</span> <span class="mi">1</span><span class="o">]</span> <span class="o">=</span> <span class="sc">'\0'</span><span class="o">;</span></span>
<span id="LC2257" class="line" lang="java"></span>
<span id="LC2258" class="line" lang="java">                <span class="c1">// Skip redundant slashes</span></span>
<span id="LC2259" class="line" lang="java">                <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2260" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">!=</span> <span class="sc">'/'</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span></span>
<span id="LC2261" class="line" lang="java">                    <span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">++]</span> <span class="o">=</span> <span class="sc">'\0'</span><span class="o">;</span></span>
<span id="LC2262" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2263" class="line" lang="java">                <span class="k">break</span><span class="o">;</span></span>
<span id="LC2264" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2265" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2266" class="line" lang="java"></span>
<span id="LC2267" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">i</span> <span class="o">!=</span> <span class="n">segs</span><span class="o">.</span><span class="na">length</span><span class="o">)</span></span>
<span id="LC2268" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">InternalError</span><span class="o">();</span>  <span class="c1">// ASSERT</span></span>
<span id="LC2269" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2270" class="line" lang="java"></span>
<span id="LC2271" class="line" lang="java"></span>
<span id="LC2272" class="line" lang="java">    <span class="c1">// Join the segments in the given path according to the given segment-index</span></span>
<span id="LC2273" class="line" lang="java">    <span class="c1">// array, ignoring those segments whose index entries have been set to -1,</span></span>
<span id="LC2274" class="line" lang="java">    <span class="c1">// and inserting slashes as needed.  Return the length of the resulting</span></span>
<span id="LC2275" class="line" lang="java">    <span class="c1">// path.</span></span>
<span id="LC2276" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2277" class="line" lang="java">    <span class="c1">// Preconditions:</span></span>
<span id="LC2278" class="line" lang="java">    <span class="c1">//   segs[i] == -1 implies segment i is to be ignored</span></span>
<span id="LC2279" class="line" lang="java">    <span class="c1">//   path computed by split, as above, with '\0' having replaced '/'</span></span>
<span id="LC2280" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2281" class="line" lang="java">    <span class="c1">// Postconditions:</span></span>
<span id="LC2282" class="line" lang="java">    <span class="c1">//   path[0] .. path[return value] == Resulting path</span></span>
<span id="LC2283" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2284" class="line" lang="java">    <span class="kd">static</span> <span class="kd">private</span> <span class="kt">int</span> <span class="nf">join</span><span class="o">(</span><span class="kt">char</span><span class="o">[]</span> <span class="n">path</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">segs</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2285" class="line" lang="java">        <span class="kt">int</span> <span class="n">ns</span> <span class="o">=</span> <span class="n">segs</span><span class="o">.</span><span class="na">length</span><span class="o">;</span>           <span class="c1">// Number of segments</span></span>
<span id="LC2286" class="line" lang="java">        <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">path</span><span class="o">.</span><span class="na">length</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span>      <span class="c1">// Index of last char in path</span></span>
<span id="LC2287" class="line" lang="java">        <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>                      <span class="c1">// Index of next path char to write</span></span>
<span id="LC2288" class="line" lang="java"></span>
<span id="LC2289" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'\0'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2290" class="line" lang="java">            <span class="c1">// Restore initial slash for absolute paths</span></span>
<span id="LC2291" class="line" lang="java">            <span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">++]</span> <span class="o">=</span> <span class="sc">'/'</span><span class="o">;</span></span>
<span id="LC2292" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2293" class="line" lang="java"></span>
<span id="LC2294" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">ns</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC2295" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span> <span class="o">=</span> <span class="n">segs</span><span class="o">[</span><span class="n">i</span><span class="o">];</span>            <span class="c1">// Current segment</span></span>
<span id="LC2296" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">==</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span></span>
<span id="LC2297" class="line" lang="java">                <span class="c1">// Ignore this segment</span></span>
<span id="LC2298" class="line" lang="java">                <span class="k">continue</span><span class="o">;</span></span>
<span id="LC2299" class="line" lang="java"></span>
<span id="LC2300" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">==</span> <span class="n">q</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2301" class="line" lang="java">                <span class="c1">// We're already at this segment, so just skip to its end</span></span>
<span id="LC2302" class="line" lang="java">                <span class="k">while</span> <span class="o">((</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">!=</span> <span class="sc">'\0'</span><span class="o">))</span></span>
<span id="LC2303" class="line" lang="java">                    <span class="n">p</span><span class="o">++;</span></span>
<span id="LC2304" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2305" class="line" lang="java">                    <span class="c1">// Preserve trailing slash</span></span>
<span id="LC2306" class="line" lang="java">                    <span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">++]</span> <span class="o">=</span> <span class="sc">'/'</span><span class="o">;</span></span>
<span id="LC2307" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2308" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">q</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2309" class="line" lang="java">                <span class="c1">// Copy q down to p</span></span>
<span id="LC2310" class="line" lang="java">                <span class="k">while</span> <span class="o">((</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">q</span><span class="o">]</span> <span class="o">!=</span> <span class="sc">'\0'</span><span class="o">))</span></span>
<span id="LC2311" class="line" lang="java">                    <span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">++]</span> <span class="o">=</span> <span class="n">path</span><span class="o">[</span><span class="n">q</span><span class="o">++];</span></span>
<span id="LC2312" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2313" class="line" lang="java">                    <span class="c1">// Preserve trailing slash</span></span>
<span id="LC2314" class="line" lang="java">                    <span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">++]</span> <span class="o">=</span> <span class="sc">'/'</span><span class="o">;</span></span>
<span id="LC2315" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2316" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span></span>
<span id="LC2317" class="line" lang="java">                <span class="k">throw</span> <span class="k">new</span> <span class="nf">InternalError</span><span class="o">();</span> <span class="c1">// ASSERT false</span></span>
<span id="LC2318" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2319" class="line" lang="java"></span>
<span id="LC2320" class="line" lang="java">        <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC2321" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2322" class="line" lang="java"></span>
<span id="LC2323" class="line" lang="java"></span>
<span id="LC2324" class="line" lang="java">    <span class="c1">// Remove "." segments from the given path, and remove segment pairs</span></span>
<span id="LC2325" class="line" lang="java">    <span class="c1">// consisting of a non-".." segment followed by a ".." segment.</span></span>
<span id="LC2326" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2327" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">removeDots</span><span class="o">(</span><span class="kt">char</span><span class="o">[]</span> <span class="n">path</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">segs</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2328" class="line" lang="java">        <span class="kt">int</span> <span class="n">ns</span> <span class="o">=</span> <span class="n">segs</span><span class="o">.</span><span class="na">length</span><span class="o">;</span></span>
<span id="LC2329" class="line" lang="java">        <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">path</span><span class="o">.</span><span class="na">length</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC2330" class="line" lang="java"></span>
<span id="LC2331" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">ns</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC2332" class="line" lang="java">            <span class="kt">int</span> <span class="n">dots</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>               <span class="c1">// Number of dots found (0, 1, or 2)</span></span>
<span id="LC2333" class="line" lang="java"></span>
<span id="LC2334" class="line" lang="java">            <span class="c1">// Find next occurrence of "." or ".."</span></span>
<span id="LC2335" class="line" lang="java">            <span class="k">do</span> <span class="o">{</span></span>
<span id="LC2336" class="line" lang="java">                <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">segs</span><span class="o">[</span><span class="n">i</span><span class="o">];</span></span>
<span id="LC2337" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'.'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2338" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">==</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2339" class="line" lang="java">                        <span class="n">dots</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC2340" class="line" lang="java">                        <span class="k">break</span><span class="o">;</span></span>
<span id="LC2341" class="line" lang="java">                    <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'\0'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2342" class="line" lang="java">                        <span class="n">dots</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC2343" class="line" lang="java">                        <span class="k">break</span><span class="o">;</span></span>
<span id="LC2344" class="line" lang="java">                    <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">((</span><span class="n">path</span><span class="o">[</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'.'</span><span class="o">)</span></span>
<span id="LC2345" class="line" lang="java">                               <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span> <span class="o">==</span> <span class="n">end</span><span class="o">)</span></span>
<span id="LC2346" class="line" lang="java">                                   <span class="o">||</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span> <span class="o">+</span> <span class="mi">2</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'\0'</span><span class="o">)))</span> <span class="o">{</span></span>
<span id="LC2347" class="line" lang="java">                        <span class="n">dots</span> <span class="o">=</span> <span class="mi">2</span><span class="o">;</span></span>
<span id="LC2348" class="line" lang="java">                        <span class="k">break</span><span class="o">;</span></span>
<span id="LC2349" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2350" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2351" class="line" lang="java">                <span class="n">i</span><span class="o">++;</span></span>
<span id="LC2352" class="line" lang="java">            <span class="o">}</span> <span class="k">while</span> <span class="o">(</span><span class="n">i</span> <span class="o">&lt;</span> <span class="n">ns</span><span class="o">);</span></span>
<span id="LC2353" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">i</span> <span class="o">&gt;</span> <span class="n">ns</span><span class="o">)</span> <span class="o">||</span> <span class="o">(</span><span class="n">dots</span> <span class="o">==</span> <span class="mi">0</span><span class="o">))</span></span>
<span id="LC2354" class="line" lang="java">                <span class="k">break</span><span class="o">;</span></span>
<span id="LC2355" class="line" lang="java"></span>
<span id="LC2356" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">dots</span> <span class="o">==</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2357" class="line" lang="java">                <span class="c1">// Remove this occurrence of "."</span></span>
<span id="LC2358" class="line" lang="java">                <span class="n">segs</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2359" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2360" class="line" lang="java">                <span class="c1">// If there is a preceding non-".." segment, remove both that</span></span>
<span id="LC2361" class="line" lang="java">                <span class="c1">// segment and this occurrence of ".."; otherwise, leave this</span></span>
<span id="LC2362" class="line" lang="java">                <span class="c1">// ".." segment as-is.</span></span>
<span id="LC2363" class="line" lang="java">                <span class="kt">int</span> <span class="n">j</span><span class="o">;</span></span>
<span id="LC2364" class="line" lang="java">                <span class="k">for</span> <span class="o">(</span><span class="n">j</span> <span class="o">=</span> <span class="n">i</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span> <span class="n">j</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">j</span><span class="o">--)</span> <span class="o">{</span></span>
<span id="LC2365" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">segs</span><span class="o">[</span><span class="n">j</span><span class="o">]</span> <span class="o">!=</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span></span>
<span id="LC2366" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2367" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">j</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2368" class="line" lang="java">                    <span class="kt">int</span> <span class="n">q</span> <span class="o">=</span> <span class="n">segs</span><span class="o">[</span><span class="n">j</span><span class="o">];</span></span>
<span id="LC2369" class="line" lang="java">                    <span class="k">if</span> <span class="o">(!((</span><span class="n">path</span><span class="o">[</span><span class="n">q</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'.'</span><span class="o">)</span></span>
<span id="LC2370" class="line" lang="java">                          <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">q</span> <span class="o">+</span> <span class="mi">1</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'.'</span><span class="o">)</span></span>
<span id="LC2371" class="line" lang="java">                          <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">q</span> <span class="o">+</span> <span class="mi">2</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'\0'</span><span class="o">)))</span> <span class="o">{</span></span>
<span id="LC2372" class="line" lang="java">                        <span class="n">segs</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2373" class="line" lang="java">                        <span class="n">segs</span><span class="o">[</span><span class="n">j</span><span class="o">]</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2374" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2375" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2376" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2377" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2378" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2379" class="line" lang="java"></span>
<span id="LC2380" class="line" lang="java"></span>
<span id="LC2381" class="line" lang="java">    <span class="c1">// DEVIATION: If the normalized path is relative, and if the first</span></span>
<span id="LC2382" class="line" lang="java">    <span class="c1">// segment could be parsed as a scheme name, then prepend a "." segment</span></span>
<span id="LC2383" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2384" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">maybeAddLeadingDot</span><span class="o">(</span><span class="kt">char</span><span class="o">[]</span> <span class="n">path</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">segs</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2385" class="line" lang="java"></span>
<span id="LC2386" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="mi">0</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'\0'</span><span class="o">)</span></span>
<span id="LC2387" class="line" lang="java">            <span class="c1">// The path is absolute</span></span>
<span id="LC2388" class="line" lang="java">            <span class="k">return</span><span class="o">;</span></span>
<span id="LC2389" class="line" lang="java"></span>
<span id="LC2390" class="line" lang="java">        <span class="kt">int</span> <span class="n">ns</span> <span class="o">=</span> <span class="n">segs</span><span class="o">.</span><span class="na">length</span><span class="o">;</span></span>
<span id="LC2391" class="line" lang="java">        <span class="kt">int</span> <span class="n">f</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span>                      <span class="c1">// Index of first segment</span></span>
<span id="LC2392" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">f</span> <span class="o">&lt;</span> <span class="n">ns</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2393" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">segs</span><span class="o">[</span><span class="n">f</span><span class="o">]</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2394" class="line" lang="java">                <span class="k">break</span><span class="o">;</span></span>
<span id="LC2395" class="line" lang="java">            <span class="n">f</span><span class="o">++;</span></span>
<span id="LC2396" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2397" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">f</span> <span class="o">&gt;=</span> <span class="n">ns</span><span class="o">)</span> <span class="o">||</span> <span class="o">(</span><span class="n">f</span> <span class="o">==</span> <span class="mi">0</span><span class="o">))</span></span>
<span id="LC2398" class="line" lang="java">            <span class="c1">// The path is empty, or else the original first segment survived,</span></span>
<span id="LC2399" class="line" lang="java">            <span class="c1">// in which case we already know that no leading "." is needed</span></span>
<span id="LC2400" class="line" lang="java">            <span class="k">return</span><span class="o">;</span></span>
<span id="LC2401" class="line" lang="java"></span>
<span id="LC2402" class="line" lang="java">        <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">segs</span><span class="o">[</span><span class="n">f</span><span class="o">];</span></span>
<span id="LC2403" class="line" lang="java">        <span class="k">while</span> <span class="o">((</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">path</span><span class="o">.</span><span class="na">length</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">!=</span> <span class="sc">':'</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">!=</span> <span class="sc">'\0'</span><span class="o">))</span> <span class="n">p</span><span class="o">++;</span></span>
<span id="LC2404" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&gt;=</span> <span class="n">path</span><span class="o">.</span><span class="na">length</span> <span class="o">||</span> <span class="n">path</span><span class="o">[</span><span class="n">p</span><span class="o">]</span> <span class="o">==</span> <span class="sc">'\0'</span><span class="o">)</span></span>
<span id="LC2405" class="line" lang="java">            <span class="c1">// No colon in first segment, so no "." needed</span></span>
<span id="LC2406" class="line" lang="java">            <span class="k">return</span><span class="o">;</span></span>
<span id="LC2407" class="line" lang="java"></span>
<span id="LC2408" class="line" lang="java">        <span class="c1">// At this point we know that the first segment is unused,</span></span>
<span id="LC2409" class="line" lang="java">        <span class="c1">// hence we can insert a "." segment at that position</span></span>
<span id="LC2410" class="line" lang="java">        <span class="n">path</span><span class="o">[</span><span class="mi">0</span><span class="o">]</span> <span class="o">=</span> <span class="sc">'.'</span><span class="o">;</span></span>
<span id="LC2411" class="line" lang="java">        <span class="n">path</span><span class="o">[</span><span class="mi">1</span><span class="o">]</span> <span class="o">=</span> <span class="sc">'\0'</span><span class="o">;</span></span>
<span id="LC2412" class="line" lang="java">        <span class="n">segs</span><span class="o">[</span><span class="mi">0</span><span class="o">]</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC2413" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2414" class="line" lang="java"></span>
<span id="LC2415" class="line" lang="java"></span>
<span id="LC2416" class="line" lang="java">    <span class="c1">// Normalize the given path string.  A normal path string has no empty</span></span>
<span id="LC2417" class="line" lang="java">    <span class="c1">// segments (i.e., occurrences of "//"), no segments equal to ".", and no</span></span>
<span id="LC2418" class="line" lang="java">    <span class="c1">// segments equal to ".." that are preceded by a segment not equal to "..".</span></span>
<span id="LC2419" class="line" lang="java">    <span class="c1">// In contrast to Unix-style pathname normalization, for URI paths we</span></span>
<span id="LC2420" class="line" lang="java">    <span class="c1">// always retain trailing slashes.</span></span>
<span id="LC2421" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2422" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">String</span> <span class="nf">normalize</span><span class="o">(</span><span class="nc">String</span> <span class="n">ps</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2423" class="line" lang="java"></span>
<span id="LC2424" class="line" lang="java">        <span class="c1">// Does this path need normalization?</span></span>
<span id="LC2425" class="line" lang="java">        <span class="kt">int</span> <span class="n">ns</span> <span class="o">=</span> <span class="n">needsNormalization</span><span class="o">(</span><span class="n">ps</span><span class="o">);</span>        <span class="c1">// Number of segments</span></span>
<span id="LC2426" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">ns</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2427" class="line" lang="java">            <span class="c1">// Nope -- just return it</span></span>
<span id="LC2428" class="line" lang="java">            <span class="k">return</span> <span class="n">ps</span><span class="o">;</span></span>
<span id="LC2429" class="line" lang="java"></span>
<span id="LC2430" class="line" lang="java">        <span class="kt">char</span><span class="o">[]</span> <span class="n">path</span> <span class="o">=</span> <span class="n">ps</span><span class="o">.</span><span class="na">toCharArray</span><span class="o">();</span>         <span class="c1">// Path in char-array form</span></span>
<span id="LC2431" class="line" lang="java"></span>
<span id="LC2432" class="line" lang="java">        <span class="c1">// Split path into segments</span></span>
<span id="LC2433" class="line" lang="java">        <span class="kt">int</span><span class="o">[]</span> <span class="n">segs</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">int</span><span class="o">[</span><span class="n">ns</span><span class="o">];</span>               <span class="c1">// Segment-index array</span></span>
<span id="LC2434" class="line" lang="java">        <span class="n">split</span><span class="o">(</span><span class="n">path</span><span class="o">,</span> <span class="n">segs</span><span class="o">);</span></span>
<span id="LC2435" class="line" lang="java"></span>
<span id="LC2436" class="line" lang="java">        <span class="c1">// Remove dots</span></span>
<span id="LC2437" class="line" lang="java">        <span class="n">removeDots</span><span class="o">(</span><span class="n">path</span><span class="o">,</span> <span class="n">segs</span><span class="o">);</span></span>
<span id="LC2438" class="line" lang="java"></span>
<span id="LC2439" class="line" lang="java">        <span class="c1">// Prevent scheme-name confusion</span></span>
<span id="LC2440" class="line" lang="java">        <span class="n">maybeAddLeadingDot</span><span class="o">(</span><span class="n">path</span><span class="o">,</span> <span class="n">segs</span><span class="o">);</span></span>
<span id="LC2441" class="line" lang="java"></span>
<span id="LC2442" class="line" lang="java">        <span class="c1">// Join the remaining segments and return the result</span></span>
<span id="LC2443" class="line" lang="java">        <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">String</span><span class="o">(</span><span class="n">path</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="n">join</span><span class="o">(</span><span class="n">path</span><span class="o">,</span> <span class="n">segs</span><span class="o">));</span></span>
<span id="LC2444" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">ps</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2445" class="line" lang="java">            <span class="c1">// string was already normalized</span></span>
<span id="LC2446" class="line" lang="java">            <span class="k">return</span> <span class="n">ps</span><span class="o">;</span></span>
<span id="LC2447" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2448" class="line" lang="java">        <span class="k">return</span> <span class="n">s</span><span class="o">;</span></span>
<span id="LC2449" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2450" class="line" lang="java"></span>
<span id="LC2451" class="line" lang="java"></span>
<span id="LC2452" class="line" lang="java"></span>
<span id="LC2453" class="line" lang="java">    <span class="c1">// -- Character classes for parsing --</span></span>
<span id="LC2454" class="line" lang="java"></span>
<span id="LC2455" class="line" lang="java">    <span class="c1">// RFC2396 precisely specifies which characters in the US-ASCII charset are</span></span>
<span id="LC2456" class="line" lang="java">    <span class="c1">// permissible in the various components of a URI reference.  We here</span></span>
<span id="LC2457" class="line" lang="java">    <span class="c1">// define a set of mask pairs to aid in enforcing these restrictions.  Each</span></span>
<span id="LC2458" class="line" lang="java">    <span class="c1">// mask pair consists of two longs, a low mask and a high mask.  Taken</span></span>
<span id="LC2459" class="line" lang="java">    <span class="c1">// together they represent a 128-bit mask, where bit i is set iff the</span></span>
<span id="LC2460" class="line" lang="java">    <span class="c1">// character with value i is permitted.</span></span>
<span id="LC2461" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2462" class="line" lang="java">    <span class="c1">// This approach is more efficient than sequentially searching arrays of</span></span>
<span id="LC2463" class="line" lang="java">    <span class="c1">// permitted characters.  It could be made still more efficient by</span></span>
<span id="LC2464" class="line" lang="java">    <span class="c1">// precompiling the mask information so that a character's presence in a</span></span>
<span id="LC2465" class="line" lang="java">    <span class="c1">// given mask could be determined by a single table lookup.</span></span>
<span id="LC2466" class="line" lang="java"></span>
<span id="LC2467" class="line" lang="java">    <span class="c1">// Compute the low-order mask for the characters in the given string</span></span>
<span id="LC2468" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">long</span> <span class="nf">lowMask</span><span class="o">(</span><span class="nc">String</span> <span class="n">chars</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2469" class="line" lang="java">        <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">chars</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC2470" class="line" lang="java">        <span class="kt">long</span> <span class="n">m</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC2471" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC2472" class="line" lang="java">            <span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="n">chars</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC2473" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;</span> <span class="mi">64</span><span class="o">)</span></span>
<span id="LC2474" class="line" lang="java">                <span class="n">m</span> <span class="o">|=</span> <span class="o">(</span><span class="mi">1L</span> <span class="o">&lt;&lt;</span> <span class="n">c</span><span class="o">);</span></span>
<span id="LC2475" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2476" class="line" lang="java">        <span class="k">return</span> <span class="n">m</span><span class="o">;</span></span>
<span id="LC2477" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2478" class="line" lang="java"></span>
<span id="LC2479" class="line" lang="java">    <span class="c1">// Compute the high-order mask for the characters in the given string</span></span>
<span id="LC2480" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">long</span> <span class="nf">highMask</span><span class="o">(</span><span class="nc">String</span> <span class="n">chars</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2481" class="line" lang="java">        <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">chars</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC2482" class="line" lang="java">        <span class="kt">long</span> <span class="n">m</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC2483" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC2484" class="line" lang="java">            <span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="n">chars</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC2485" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">&gt;=</span> <span class="mi">64</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;</span> <span class="mi">128</span><span class="o">))</span></span>
<span id="LC2486" class="line" lang="java">                <span class="n">m</span> <span class="o">|=</span> <span class="o">(</span><span class="mi">1L</span> <span class="o">&lt;&lt;</span> <span class="o">(</span><span class="n">c</span> <span class="o">-</span> <span class="mi">64</span><span class="o">));</span></span>
<span id="LC2487" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2488" class="line" lang="java">        <span class="k">return</span> <span class="n">m</span><span class="o">;</span></span>
<span id="LC2489" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2490" class="line" lang="java"></span>
<span id="LC2491" class="line" lang="java">    <span class="c1">// Compute a low-order mask for the characters</span></span>
<span id="LC2492" class="line" lang="java">    <span class="c1">// between first and last, inclusive</span></span>
<span id="LC2493" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">long</span> <span class="nf">lowMask</span><span class="o">(</span><span class="kt">char</span> <span class="n">first</span><span class="o">,</span> <span class="kt">char</span> <span class="n">last</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2494" class="line" lang="java">        <span class="kt">long</span> <span class="n">m</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC2495" class="line" lang="java">        <span class="kt">int</span> <span class="n">f</span> <span class="o">=</span> <span class="nc">Math</span><span class="o">.</span><span class="na">max</span><span class="o">(</span><span class="nc">Math</span><span class="o">.</span><span class="na">min</span><span class="o">(</span><span class="n">first</span><span class="o">,</span> <span class="mi">63</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></span>
<span id="LC2496" class="line" lang="java">        <span class="kt">int</span> <span class="n">l</span> <span class="o">=</span> <span class="nc">Math</span><span class="o">.</span><span class="na">max</span><span class="o">(</span><span class="nc">Math</span><span class="o">.</span><span class="na">min</span><span class="o">(</span><span class="n">last</span><span class="o">,</span> <span class="mi">63</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></span>
<span id="LC2497" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">f</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;=</span> <span class="n">l</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC2498" class="line" lang="java">            <span class="n">m</span> <span class="o">|=</span> <span class="mi">1L</span> <span class="o">&lt;&lt;</span> <span class="n">i</span><span class="o">;</span></span>
<span id="LC2499" class="line" lang="java">        <span class="k">return</span> <span class="n">m</span><span class="o">;</span></span>
<span id="LC2500" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2501" class="line" lang="java"></span>
<span id="LC2502" class="line" lang="java">    <span class="c1">// Compute a high-order mask for the characters</span></span>
<span id="LC2503" class="line" lang="java">    <span class="c1">// between first and last, inclusive</span></span>
<span id="LC2504" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">long</span> <span class="nf">highMask</span><span class="o">(</span><span class="kt">char</span> <span class="n">first</span><span class="o">,</span> <span class="kt">char</span> <span class="n">last</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2505" class="line" lang="java">        <span class="kt">long</span> <span class="n">m</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC2506" class="line" lang="java">        <span class="kt">int</span> <span class="n">f</span> <span class="o">=</span> <span class="nc">Math</span><span class="o">.</span><span class="na">max</span><span class="o">(</span><span class="nc">Math</span><span class="o">.</span><span class="na">min</span><span class="o">(</span><span class="n">first</span><span class="o">,</span> <span class="mi">127</span><span class="o">),</span> <span class="mi">64</span><span class="o">)</span> <span class="o">-</span> <span class="mi">64</span><span class="o">;</span></span>
<span id="LC2507" class="line" lang="java">        <span class="kt">int</span> <span class="n">l</span> <span class="o">=</span> <span class="nc">Math</span><span class="o">.</span><span class="na">max</span><span class="o">(</span><span class="nc">Math</span><span class="o">.</span><span class="na">min</span><span class="o">(</span><span class="n">last</span><span class="o">,</span> <span class="mi">127</span><span class="o">),</span> <span class="mi">64</span><span class="o">)</span> <span class="o">-</span> <span class="mi">64</span><span class="o">;</span></span>
<span id="LC2508" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">f</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;=</span> <span class="n">l</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></span>
<span id="LC2509" class="line" lang="java">            <span class="n">m</span> <span class="o">|=</span> <span class="mi">1L</span> <span class="o">&lt;&lt;</span> <span class="n">i</span><span class="o">;</span></span>
<span id="LC2510" class="line" lang="java">        <span class="k">return</span> <span class="n">m</span><span class="o">;</span></span>
<span id="LC2511" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2512" class="line" lang="java"></span>
<span id="LC2513" class="line" lang="java">    <span class="c1">// Tell whether the given character is permitted by the given mask pair</span></span>
<span id="LC2514" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">match</span><span class="o">(</span><span class="kt">char</span> <span class="n">c</span><span class="o">,</span> <span class="kt">long</span> <span class="n">lowMask</span><span class="o">,</span> <span class="kt">long</span> <span class="n">highMask</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2515" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="c1">// 0 doesn't have a slot in the mask. So, it never matches.</span></span>
<span id="LC2516" class="line" lang="java">            <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2517" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;</span> <span class="mi">64</span><span class="o">)</span></span>
<span id="LC2518" class="line" lang="java">            <span class="k">return</span> <span class="o">((</span><span class="mi">1L</span> <span class="o">&lt;&lt;</span> <span class="n">c</span><span class="o">)</span> <span class="o">&amp;</span> <span class="n">lowMask</span><span class="o">)</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC2519" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;</span> <span class="mi">128</span><span class="o">)</span></span>
<span id="LC2520" class="line" lang="java">            <span class="k">return</span> <span class="o">((</span><span class="mi">1L</span> <span class="o">&lt;&lt;</span> <span class="o">(</span><span class="n">c</span> <span class="o">-</span> <span class="mi">64</span><span class="o">))</span> <span class="o">&amp;</span> <span class="n">highMask</span><span class="o">)</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC2521" class="line" lang="java">        <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2522" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2523" class="line" lang="java"></span>
<span id="LC2524" class="line" lang="java">    <span class="c1">// Character-class masks, in reverse order from RFC2396 because</span></span>
<span id="LC2525" class="line" lang="java">    <span class="c1">// initializers for static fields cannot make forward references.</span></span>
<span id="LC2526" class="line" lang="java"></span>
<span id="LC2527" class="line" lang="java">    <span class="c1">// digit    = "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" |</span></span>
<span id="LC2528" class="line" lang="java">    <span class="c1">//            "8" | "9"</span></span>
<span id="LC2529" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_DIGIT</span> <span class="o">=</span> <span class="n">lowMask</span><span class="o">(</span><span class="sc">'0'</span><span class="o">,</span> <span class="sc">'9'</span><span class="o">);</span></span>
<span id="LC2530" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_DIGIT</span> <span class="o">=</span> <span class="mi">0L</span><span class="o">;</span></span>
<span id="LC2531" class="line" lang="java"></span>
<span id="LC2532" class="line" lang="java">    <span class="c1">// upalpha  = "A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" |</span></span>
<span id="LC2533" class="line" lang="java">    <span class="c1">//            "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" |</span></span>
<span id="LC2534" class="line" lang="java">    <span class="c1">//            "S" | "T" | "U" | "V" | "W" | "X" | "Y" | "Z"</span></span>
<span id="LC2535" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_UPALPHA</span> <span class="o">=</span> <span class="mi">0L</span><span class="o">;</span></span>
<span id="LC2536" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_UPALPHA</span> <span class="o">=</span> <span class="n">highMask</span><span class="o">(</span><span class="sc">'A'</span><span class="o">,</span> <span class="sc">'Z'</span><span class="o">);</span></span>
<span id="LC2537" class="line" lang="java"></span>
<span id="LC2538" class="line" lang="java">    <span class="c1">// lowalpha = "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" |</span></span>
<span id="LC2539" class="line" lang="java">    <span class="c1">//            "j" | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" |</span></span>
<span id="LC2540" class="line" lang="java">    <span class="c1">//            "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"</span></span>
<span id="LC2541" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_LOWALPHA</span> <span class="o">=</span> <span class="mi">0L</span><span class="o">;</span></span>
<span id="LC2542" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_LOWALPHA</span> <span class="o">=</span> <span class="n">highMask</span><span class="o">(</span><span class="sc">'a'</span><span class="o">,</span> <span class="sc">'z'</span><span class="o">);</span></span>
<span id="LC2543" class="line" lang="java"></span>
<span id="LC2544" class="line" lang="java">    <span class="c1">// alpha         = lowalpha | upalpha</span></span>
<span id="LC2545" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_ALPHA</span> <span class="o">=</span> <span class="no">L_LOWALPHA</span> <span class="o">|</span> <span class="no">L_UPALPHA</span><span class="o">;</span></span>
<span id="LC2546" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_ALPHA</span> <span class="o">=</span> <span class="no">H_LOWALPHA</span> <span class="o">|</span> <span class="no">H_UPALPHA</span><span class="o">;</span></span>
<span id="LC2547" class="line" lang="java"></span>
<span id="LC2548" class="line" lang="java">    <span class="c1">// alphanum      = alpha | digit</span></span>
<span id="LC2549" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_ALPHANUM</span> <span class="o">=</span> <span class="no">L_DIGIT</span> <span class="o">|</span> <span class="no">L_ALPHA</span><span class="o">;</span></span>
<span id="LC2550" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_ALPHANUM</span> <span class="o">=</span> <span class="no">H_DIGIT</span> <span class="o">|</span> <span class="no">H_ALPHA</span><span class="o">;</span></span>
<span id="LC2551" class="line" lang="java"></span>
<span id="LC2552" class="line" lang="java">    <span class="c1">// hex           = digit | "A" | "B" | "C" | "D" | "E" | "F" |</span></span>
<span id="LC2553" class="line" lang="java">    <span class="c1">//                         "a" | "b" | "c" | "d" | "e" | "f"</span></span>
<span id="LC2554" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_HEX</span> <span class="o">=</span> <span class="no">L_DIGIT</span><span class="o">;</span></span>
<span id="LC2555" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_HEX</span> <span class="o">=</span> <span class="n">highMask</span><span class="o">(</span><span class="sc">'A'</span><span class="o">,</span> <span class="sc">'F'</span><span class="o">)</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="sc">'a'</span><span class="o">,</span> <span class="sc">'f'</span><span class="o">);</span></span>
<span id="LC2556" class="line" lang="java"></span>
<span id="LC2557" class="line" lang="java">    <span class="c1">// mark          = "-" | "_" | "." | "!" | "~" | "*" | "'" |</span></span>
<span id="LC2558" class="line" lang="java">    <span class="c1">//                 "(" | ")"</span></span>
<span id="LC2559" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_MARK</span> <span class="o">=</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">"-_.!~*'()"</span><span class="o">);</span></span>
<span id="LC2560" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_MARK</span> <span class="o">=</span> <span class="n">highMask</span><span class="o">(</span><span class="s">"-_.!~*'()"</span><span class="o">);</span></span>
<span id="LC2561" class="line" lang="java"></span>
<span id="LC2562" class="line" lang="java">    <span class="c1">// unreserved    = alphanum | mark</span></span>
<span id="LC2563" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_UNRESERVED</span> <span class="o">=</span> <span class="no">L_ALPHANUM</span> <span class="o">|</span> <span class="no">L_MARK</span><span class="o">;</span></span>
<span id="LC2564" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_UNRESERVED</span> <span class="o">=</span> <span class="no">H_ALPHANUM</span> <span class="o">|</span> <span class="no">H_MARK</span><span class="o">;</span></span>
<span id="LC2565" class="line" lang="java"></span>
<span id="LC2566" class="line" lang="java">    <span class="c1">// reserved      = ";" | "/" | "?" | ":" | "@" | "&amp;" | "=" | "+" |</span></span>
<span id="LC2567" class="line" lang="java">    <span class="c1">//                 "$" | "," | "[" | "]"</span></span>
<span id="LC2568" class="line" lang="java">    <span class="c1">// Added per RFC2732: "[", "]"</span></span>
<span id="LC2569" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_RESERVED</span> <span class="o">=</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">";/?:@&amp;=+$,[]"</span><span class="o">);</span></span>
<span id="LC2570" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_RESERVED</span> <span class="o">=</span> <span class="n">highMask</span><span class="o">(</span><span class="s">";/?:@&amp;=+$,[]"</span><span class="o">);</span></span>
<span id="LC2571" class="line" lang="java"></span>
<span id="LC2572" class="line" lang="java">    <span class="c1">// The zero'th bit is used to indicate that escape pairs and non-US-ASCII</span></span>
<span id="LC2573" class="line" lang="java">    <span class="c1">// characters are allowed; this is handled by the scanEscape method below.</span></span>
<span id="LC2574" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_ESCAPED</span> <span class="o">=</span> <span class="mi">1L</span><span class="o">;</span></span>
<span id="LC2575" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_ESCAPED</span> <span class="o">=</span> <span class="mi">0L</span><span class="o">;</span></span>
<span id="LC2576" class="line" lang="java"></span>
<span id="LC2577" class="line" lang="java">    <span class="c1">// uric          = reserved | unreserved | escaped</span></span>
<span id="LC2578" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_URIC</span> <span class="o">=</span> <span class="no">L_RESERVED</span> <span class="o">|</span> <span class="no">L_UNRESERVED</span> <span class="o">|</span> <span class="no">L_ESCAPED</span><span class="o">;</span></span>
<span id="LC2579" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_URIC</span> <span class="o">=</span> <span class="no">H_RESERVED</span> <span class="o">|</span> <span class="no">H_UNRESERVED</span> <span class="o">|</span> <span class="no">H_ESCAPED</span><span class="o">;</span></span>
<span id="LC2580" class="line" lang="java"></span>
<span id="LC2581" class="line" lang="java">    <span class="c1">// pchar         = unreserved | escaped |</span></span>
<span id="LC2582" class="line" lang="java">    <span class="c1">//                 ":" | "@" | "&amp;" | "=" | "+" | "$" | ","</span></span>
<span id="LC2583" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_PCHAR</span></span>
<span id="LC2584" class="line" lang="java">        <span class="o">=</span> <span class="no">L_UNRESERVED</span> <span class="o">|</span> <span class="no">L_ESCAPED</span> <span class="o">|</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">":@&amp;=+$,"</span><span class="o">);</span></span>
<span id="LC2585" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_PCHAR</span></span>
<span id="LC2586" class="line" lang="java">        <span class="o">=</span> <span class="no">H_UNRESERVED</span> <span class="o">|</span> <span class="no">H_ESCAPED</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="s">":@&amp;=+$,"</span><span class="o">);</span></span>
<span id="LC2587" class="line" lang="java"></span>
<span id="LC2588" class="line" lang="java">    <span class="c1">// All valid path characters</span></span>
<span id="LC2589" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_PATH</span> <span class="o">=</span> <span class="no">L_PCHAR</span> <span class="o">|</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">";/"</span><span class="o">);</span></span>
<span id="LC2590" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_PATH</span> <span class="o">=</span> <span class="no">H_PCHAR</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="s">";/"</span><span class="o">);</span></span>
<span id="LC2591" class="line" lang="java"></span>
<span id="LC2592" class="line" lang="java">    <span class="c1">// Dash, for use in domainlabel and toplabel</span></span>
<span id="LC2593" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_DASH</span> <span class="o">=</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">"-"</span><span class="o">);</span></span>
<span id="LC2594" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_DASH</span> <span class="o">=</span> <span class="n">highMask</span><span class="o">(</span><span class="s">"-"</span><span class="o">);</span></span>
<span id="LC2595" class="line" lang="java"></span>
<span id="LC2596" class="line" lang="java">    <span class="c1">// Dot, for use in hostnames</span></span>
<span id="LC2597" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_DOT</span> <span class="o">=</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">"."</span><span class="o">);</span></span>
<span id="LC2598" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_DOT</span> <span class="o">=</span> <span class="n">highMask</span><span class="o">(</span><span class="s">"."</span><span class="o">);</span></span>
<span id="LC2599" class="line" lang="java"></span>
<span id="LC2600" class="line" lang="java">    <span class="c1">// userinfo      = *( unreserved | escaped |</span></span>
<span id="LC2601" class="line" lang="java">    <span class="c1">//                    ";" | ":" | "&amp;" | "=" | "+" | "$" | "," )</span></span>
<span id="LC2602" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_USERINFO</span></span>
<span id="LC2603" class="line" lang="java">        <span class="o">=</span> <span class="no">L_UNRESERVED</span> <span class="o">|</span> <span class="no">L_ESCAPED</span> <span class="o">|</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">";:&amp;=+$,"</span><span class="o">);</span></span>
<span id="LC2604" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_USERINFO</span></span>
<span id="LC2605" class="line" lang="java">        <span class="o">=</span> <span class="no">H_UNRESERVED</span> <span class="o">|</span> <span class="no">H_ESCAPED</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="s">";:&amp;=+$,"</span><span class="o">);</span></span>
<span id="LC2606" class="line" lang="java"></span>
<span id="LC2607" class="line" lang="java">    <span class="c1">// reg_name      = 1*( unreserved | escaped | "$" | "," |</span></span>
<span id="LC2608" class="line" lang="java">    <span class="c1">//                     ";" | ":" | "@" | "&amp;" | "=" | "+" )</span></span>
<span id="LC2609" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_REG_NAME</span></span>
<span id="LC2610" class="line" lang="java">        <span class="o">=</span> <span class="no">L_UNRESERVED</span> <span class="o">|</span> <span class="no">L_ESCAPED</span> <span class="o">|</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">"$,;:@&amp;=+"</span><span class="o">);</span></span>
<span id="LC2611" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_REG_NAME</span></span>
<span id="LC2612" class="line" lang="java">        <span class="o">=</span> <span class="no">H_UNRESERVED</span> <span class="o">|</span> <span class="no">H_ESCAPED</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="s">"$,;:@&amp;=+"</span><span class="o">);</span></span>
<span id="LC2613" class="line" lang="java"></span>
<span id="LC2614" class="line" lang="java">    <span class="c1">// All valid characters for server-based authorities</span></span>
<span id="LC2615" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_SERVER</span></span>
<span id="LC2616" class="line" lang="java">        <span class="o">=</span> <span class="no">L_USERINFO</span> <span class="o">|</span> <span class="no">L_ALPHANUM</span> <span class="o">|</span> <span class="no">L_DASH</span> <span class="o">|</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">".:@[]"</span><span class="o">);</span></span>
<span id="LC2617" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_SERVER</span></span>
<span id="LC2618" class="line" lang="java">        <span class="o">=</span> <span class="no">H_USERINFO</span> <span class="o">|</span> <span class="no">H_ALPHANUM</span> <span class="o">|</span> <span class="no">H_DASH</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="s">".:@[]"</span><span class="o">);</span></span>
<span id="LC2619" class="line" lang="java"></span>
<span id="LC2620" class="line" lang="java">    <span class="c1">// Special case of server authority that represents an IPv6 address</span></span>
<span id="LC2621" class="line" lang="java">    <span class="c1">// In this case, a % does not signify an escape sequence</span></span>
<span id="LC2622" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_SERVER_PERCENT</span></span>
<span id="LC2623" class="line" lang="java">        <span class="o">=</span> <span class="no">L_SERVER</span> <span class="o">|</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">"%"</span><span class="o">);</span></span>
<span id="LC2624" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_SERVER_PERCENT</span></span>
<span id="LC2625" class="line" lang="java">        <span class="o">=</span> <span class="no">H_SERVER</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="s">"%"</span><span class="o">);</span></span>
<span id="LC2626" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_LEFT_BRACKET</span> <span class="o">=</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">"["</span><span class="o">);</span></span>
<span id="LC2627" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_LEFT_BRACKET</span> <span class="o">=</span> <span class="n">highMask</span><span class="o">(</span><span class="s">"["</span><span class="o">);</span></span>
<span id="LC2628" class="line" lang="java"></span>
<span id="LC2629" class="line" lang="java">    <span class="c1">// scheme        = alpha *( alpha | digit | "+" | "-" | "." )</span></span>
<span id="LC2630" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_SCHEME</span> <span class="o">=</span> <span class="no">L_ALPHA</span> <span class="o">|</span> <span class="no">L_DIGIT</span> <span class="o">|</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">"+-."</span><span class="o">);</span></span>
<span id="LC2631" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_SCHEME</span> <span class="o">=</span> <span class="no">H_ALPHA</span> <span class="o">|</span> <span class="no">H_DIGIT</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="s">"+-."</span><span class="o">);</span></span>
<span id="LC2632" class="line" lang="java"></span>
<span id="LC2633" class="line" lang="java">    <span class="c1">// uric_no_slash = unreserved | escaped | ";" | "?" | ":" | "@" |</span></span>
<span id="LC2634" class="line" lang="java">    <span class="c1">//                 "&amp;" | "=" | "+" | "$" | ","</span></span>
<span id="LC2635" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">L_URIC_NO_SLASH</span></span>
<span id="LC2636" class="line" lang="java">        <span class="o">=</span> <span class="no">L_UNRESERVED</span> <span class="o">|</span> <span class="no">L_ESCAPED</span> <span class="o">|</span> <span class="n">lowMask</span><span class="o">(</span><span class="s">";?:@&amp;=+$,"</span><span class="o">);</span></span>
<span id="LC2637" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">H_URIC_NO_SLASH</span></span>
<span id="LC2638" class="line" lang="java">        <span class="o">=</span> <span class="no">H_UNRESERVED</span> <span class="o">|</span> <span class="no">H_ESCAPED</span> <span class="o">|</span> <span class="n">highMask</span><span class="o">(</span><span class="s">";?:@&amp;=+$,"</span><span class="o">);</span></span>
<span id="LC2639" class="line" lang="java"></span>
<span id="LC2640" class="line" lang="java"></span>
<span id="LC2641" class="line" lang="java">    <span class="c1">// -- Escaping and encoding --</span></span>
<span id="LC2642" class="line" lang="java"></span>
<span id="LC2643" class="line" lang="java">    <span class="kd">private</span> <span class="kd">final</span> <span class="kd">static</span> <span class="kt">char</span><span class="o">[]</span> <span class="n">hexDigits</span> <span class="o">=</span> <span class="o">{</span></span>
<span id="LC2644" class="line" lang="java">        <span class="sc">'0'</span><span class="o">,</span> <span class="sc">'1'</span><span class="o">,</span> <span class="sc">'2'</span><span class="o">,</span> <span class="sc">'3'</span><span class="o">,</span> <span class="sc">'4'</span><span class="o">,</span> <span class="sc">'5'</span><span class="o">,</span> <span class="sc">'6'</span><span class="o">,</span> <span class="sc">'7'</span><span class="o">,</span></span>
<span id="LC2645" class="line" lang="java">        <span class="sc">'8'</span><span class="o">,</span> <span class="sc">'9'</span><span class="o">,</span> <span class="sc">'A'</span><span class="o">,</span> <span class="sc">'B'</span><span class="o">,</span> <span class="sc">'C'</span><span class="o">,</span> <span class="sc">'D'</span><span class="o">,</span> <span class="sc">'E'</span><span class="o">,</span> <span class="sc">'F'</span></span>
<span id="LC2646" class="line" lang="java">    <span class="o">};</span></span>
<span id="LC2647" class="line" lang="java"></span>
<span id="LC2648" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">appendEscape</span><span class="o">(</span><span class="nc">StringBuffer</span> <span class="n">sb</span><span class="o">,</span> <span class="kt">byte</span> <span class="n">b</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2649" class="line" lang="java">        <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="sc">'%'</span><span class="o">);</span></span>
<span id="LC2650" class="line" lang="java">        <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">hexDigits</span><span class="o">[(</span><span class="n">b</span> <span class="o">&gt;&gt;</span> <span class="mi">4</span><span class="o">)</span> <span class="o">&amp;</span> <span class="mh">0x0f</span><span class="o">]);</span></span>
<span id="LC2651" class="line" lang="java">        <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">hexDigits</span><span class="o">[(</span><span class="n">b</span> <span class="o">&gt;&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">&amp;</span> <span class="mh">0x0f</span><span class="o">]);</span></span>
<span id="LC2652" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2653" class="line" lang="java"></span>
<span id="LC2654" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">appendEncoded</span><span class="o">(</span><span class="nc">StringBuffer</span> <span class="n">sb</span><span class="o">,</span> <span class="kt">char</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2655" class="line" lang="java">        <span class="nc">ByteBuffer</span> <span class="n">bb</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2656" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2657" class="line" lang="java">            <span class="n">bb</span> <span class="o">=</span> <span class="nc">ThreadLocalCoders</span><span class="o">.</span><span class="na">encoderFor</span><span class="o">(</span><span class="s">"UTF-8"</span><span class="o">)</span></span>
<span id="LC2658" class="line" lang="java">                <span class="o">.</span><span class="na">encode</span><span class="o">(</span><span class="nc">CharBuffer</span><span class="o">.</span><span class="na">wrap</span><span class="o">(</span><span class="s">""</span> <span class="o">+</span> <span class="n">c</span><span class="o">));</span></span>
<span id="LC2659" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">CharacterCodingException</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2660" class="line" lang="java">            <span class="k">assert</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2661" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2662" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">bb</span><span class="o">.</span><span class="na">hasRemaining</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2663" class="line" lang="java">            <span class="kt">int</span> <span class="n">b</span> <span class="o">=</span> <span class="n">bb</span><span class="o">.</span><span class="na">get</span><span class="o">()</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">;</span></span>
<span id="LC2664" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">b</span> <span class="o">&gt;=</span> <span class="mh">0x80</span><span class="o">)</span></span>
<span id="LC2665" class="line" lang="java">                <span class="n">appendEscape</span><span class="o">(</span><span class="n">sb</span><span class="o">,</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span><span class="n">b</span><span class="o">);</span></span>
<span id="LC2666" class="line" lang="java">            <span class="k">else</span></span>
<span id="LC2667" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">((</span><span class="kt">char</span><span class="o">)</span><span class="n">b</span><span class="o">);</span></span>
<span id="LC2668" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2669" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2670" class="line" lang="java"></span>
<span id="LC2671" class="line" lang="java">    <span class="c1">// Quote any characters in s that are not permitted</span></span>
<span id="LC2672" class="line" lang="java">    <span class="c1">// by the given mask pair</span></span>
<span id="LC2673" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2674" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">String</span> <span class="nf">quote</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">,</span> <span class="kt">long</span> <span class="n">lowMask</span><span class="o">,</span> <span class="kt">long</span> <span class="n">highMask</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2675" class="line" lang="java">        <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC2676" class="line" lang="java">        <span class="nc">StringBuffer</span> <span class="n">sb</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2677" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">allowNonASCII</span> <span class="o">=</span> <span class="o">((</span><span class="n">lowMask</span> <span class="o">&amp;</span> <span class="no">L_ESCAPED</span><span class="o">)</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">);</span></span>
<span id="LC2678" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC2679" class="line" lang="java">            <span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC2680" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;</span> <span class="sc">'\u0080'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2681" class="line" lang="java">                <span class="k">if</span> <span class="o">(!</span><span class="n">match</span><span class="o">(</span><span class="n">c</span><span class="o">,</span> <span class="n">lowMask</span><span class="o">,</span> <span class="n">highMask</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2682" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">sb</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2683" class="line" lang="java">                        <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">();</span></span>
<span id="LC2684" class="line" lang="java">                        <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">i</span><span class="o">));</span></span>
<span id="LC2685" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2686" class="line" lang="java">                    <span class="n">appendEscape</span><span class="o">(</span><span class="n">sb</span><span class="o">,</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span><span class="n">c</span><span class="o">);</span></span>
<span id="LC2687" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2688" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">sb</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2689" class="line" lang="java">                        <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></span>
<span id="LC2690" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2691" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">allowNonASCII</span></span>
<span id="LC2692" class="line" lang="java">                       <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="nc">Character</span><span class="o">.</span><span class="na">isSpaceChar</span><span class="o">(</span><span class="n">c</span><span class="o">)</span></span>
<span id="LC2693" class="line" lang="java">                           <span class="o">||</span> <span class="nc">Character</span><span class="o">.</span><span class="na">isISOControl</span><span class="o">(</span><span class="n">c</span><span class="o">)))</span> <span class="o">{</span></span>
<span id="LC2694" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">sb</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2695" class="line" lang="java">                    <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">();</span></span>
<span id="LC2696" class="line" lang="java">                    <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">i</span><span class="o">));</span></span>
<span id="LC2697" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2698" class="line" lang="java">                <span class="n">appendEncoded</span><span class="o">(</span><span class="n">sb</span><span class="o">,</span> <span class="n">c</span><span class="o">);</span></span>
<span id="LC2699" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2700" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">sb</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2701" class="line" lang="java">                    <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></span>
<span id="LC2702" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2703" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2704" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="n">sb</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span> <span class="n">s</span> <span class="o">:</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></span>
<span id="LC2705" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2706" class="line" lang="java"></span>
<span id="LC2707" class="line" lang="java">    <span class="c1">// Encodes all characters &gt;= \u0080 into escaped, normalized UTF-8 octets,</span></span>
<span id="LC2708" class="line" lang="java">    <span class="c1">// assuming that s is otherwise legal</span></span>
<span id="LC2709" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2710" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">String</span> <span class="nf">encode</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2711" class="line" lang="java">        <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC2712" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">n</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2713" class="line" lang="java">            <span class="k">return</span> <span class="n">s</span><span class="o">;</span></span>
<span id="LC2714" class="line" lang="java"></span>
<span id="LC2715" class="line" lang="java">        <span class="c1">// First check whether we actually need to encode</span></span>
<span id="LC2716" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;;)</span> <span class="o">{</span></span>
<span id="LC2717" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">)</span> <span class="o">&gt;=</span> <span class="sc">'\u0080'</span><span class="o">)</span></span>
<span id="LC2718" class="line" lang="java">                <span class="k">break</span><span class="o">;</span></span>
<span id="LC2719" class="line" lang="java">            <span class="k">if</span> <span class="o">(++</span><span class="n">i</span> <span class="o">&gt;=</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC2720" class="line" lang="java">                <span class="k">return</span> <span class="n">s</span><span class="o">;</span></span>
<span id="LC2721" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2722" class="line" lang="java"></span>
<span id="LC2723" class="line" lang="java">        <span class="nc">String</span> <span class="n">ns</span> <span class="o">=</span> <span class="nc">Normalizer</span><span class="o">.</span><span class="na">normalize</span><span class="o">(</span><span class="n">s</span><span class="o">,</span> <span class="nc">Normalizer</span><span class="o">.</span><span class="na">Form</span><span class="o">.</span><span class="na">NFC</span><span class="o">);</span></span>
<span id="LC2724" class="line" lang="java">        <span class="nc">ByteBuffer</span> <span class="n">bb</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2725" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2726" class="line" lang="java">            <span class="n">bb</span> <span class="o">=</span> <span class="nc">ThreadLocalCoders</span><span class="o">.</span><span class="na">encoderFor</span><span class="o">(</span><span class="s">"UTF-8"</span><span class="o">)</span></span>
<span id="LC2727" class="line" lang="java">                <span class="o">.</span><span class="na">encode</span><span class="o">(</span><span class="nc">CharBuffer</span><span class="o">.</span><span class="na">wrap</span><span class="o">(</span><span class="n">ns</span><span class="o">));</span></span>
<span id="LC2728" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">CharacterCodingException</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2729" class="line" lang="java">            <span class="k">assert</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2730" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2731" class="line" lang="java"></span>
<span id="LC2732" class="line" lang="java">        <span class="nc">StringBuffer</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">();</span></span>
<span id="LC2733" class="line" lang="java">        <span class="k">while</span> <span class="o">(</span><span class="n">bb</span><span class="o">.</span><span class="na">hasRemaining</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2734" class="line" lang="java">            <span class="kt">int</span> <span class="n">b</span> <span class="o">=</span> <span class="n">bb</span><span class="o">.</span><span class="na">get</span><span class="o">()</span> <span class="o">&amp;</span> <span class="mh">0xff</span><span class="o">;</span></span>
<span id="LC2735" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">b</span> <span class="o">&gt;=</span> <span class="mh">0x80</span><span class="o">)</span></span>
<span id="LC2736" class="line" lang="java">                <span class="n">appendEscape</span><span class="o">(</span><span class="n">sb</span><span class="o">,</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)</span><span class="n">b</span><span class="o">);</span></span>
<span id="LC2737" class="line" lang="java">            <span class="k">else</span></span>
<span id="LC2738" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">((</span><span class="kt">char</span><span class="o">)</span><span class="n">b</span><span class="o">);</span></span>
<span id="LC2739" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2740" class="line" lang="java">        <span class="k">return</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></span>
<span id="LC2741" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2742" class="line" lang="java"></span>
<span id="LC2743" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">decode</span><span class="o">(</span><span class="kt">char</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2744" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">&gt;=</span> <span class="sc">'0'</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;=</span> <span class="sc">'9'</span><span class="o">))</span></span>
<span id="LC2745" class="line" lang="java">            <span class="k">return</span> <span class="n">c</span> <span class="o">-</span> <span class="sc">'0'</span><span class="o">;</span></span>
<span id="LC2746" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">&gt;=</span> <span class="sc">'a'</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;=</span> <span class="sc">'f'</span><span class="o">))</span></span>
<span id="LC2747" class="line" lang="java">            <span class="k">return</span> <span class="n">c</span> <span class="o">-</span> <span class="sc">'a'</span> <span class="o">+</span> <span class="mi">10</span><span class="o">;</span></span>
<span id="LC2748" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">&gt;=</span> <span class="sc">'A'</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;=</span> <span class="sc">'F'</span><span class="o">))</span></span>
<span id="LC2749" class="line" lang="java">            <span class="k">return</span> <span class="n">c</span> <span class="o">-</span> <span class="sc">'A'</span> <span class="o">+</span> <span class="mi">10</span><span class="o">;</span></span>
<span id="LC2750" class="line" lang="java">        <span class="k">assert</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2751" class="line" lang="java">        <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2752" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2753" class="line" lang="java"></span>
<span id="LC2754" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kt">byte</span> <span class="nf">decode</span><span class="o">(</span><span class="kt">char</span> <span class="n">c1</span><span class="o">,</span> <span class="kt">char</span> <span class="n">c2</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2755" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="kt">byte</span><span class="o">)(</span>  <span class="o">((</span><span class="n">decode</span><span class="o">(</span><span class="n">c1</span><span class="o">)</span> <span class="o">&amp;</span> <span class="mh">0xf</span><span class="o">)</span> <span class="o">&lt;&lt;</span> <span class="mi">4</span><span class="o">)</span></span>
<span id="LC2756" class="line" lang="java">                      <span class="o">|</span> <span class="o">((</span><span class="n">decode</span><span class="o">(</span><span class="n">c2</span><span class="o">)</span> <span class="o">&amp;</span> <span class="mh">0xf</span><span class="o">)</span> <span class="o">&lt;&lt;</span> <span class="mi">0</span><span class="o">));</span></span>
<span id="LC2757" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2758" class="line" lang="java"></span>
<span id="LC2759" class="line" lang="java">    <span class="c1">// Evaluates all escapes in s, applying UTF-8 decoding if needed.  Assumes</span></span>
<span id="LC2760" class="line" lang="java">    <span class="c1">// that escapes are well-formed syntactically, i.e., of the form %XX.  If a</span></span>
<span id="LC2761" class="line" lang="java">    <span class="c1">// sequence of escaped octets is not valid UTF-8 then the erroneous octets</span></span>
<span id="LC2762" class="line" lang="java">    <span class="c1">// are replaced with '\uFFFD'.</span></span>
<span id="LC2763" class="line" lang="java">    <span class="c1">// Exception: any "%" found between "[]" is left alone. It is an IPv6 literal</span></span>
<span id="LC2764" class="line" lang="java">    <span class="c1">//            with a scope_id</span></span>
<span id="LC2765" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2766" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">String</span> <span class="nf">decode</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2767" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2768" class="line" lang="java">            <span class="k">return</span> <span class="n">s</span><span class="o">;</span></span>
<span id="LC2769" class="line" lang="java">        <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC2770" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">n</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2771" class="line" lang="java">            <span class="k">return</span> <span class="n">s</span><span class="o">;</span></span>
<span id="LC2772" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">'%'</span><span class="o">)</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2773" class="line" lang="java">            <span class="k">return</span> <span class="n">s</span><span class="o">;</span></span>
<span id="LC2774" class="line" lang="java"></span>
<span id="LC2775" class="line" lang="java">        <span class="nc">StringBuffer</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">StringBuffer</span><span class="o">(</span><span class="n">n</span><span class="o">);</span></span>
<span id="LC2776" class="line" lang="java">        <span class="nc">ByteBuffer</span> <span class="n">bb</span> <span class="o">=</span> <span class="nc">ByteBuffer</span><span class="o">.</span><span class="na">allocate</span><span class="o">(</span><span class="n">n</span><span class="o">);</span></span>
<span id="LC2777" class="line" lang="java">        <span class="nc">CharBuffer</span> <span class="n">cb</span> <span class="o">=</span> <span class="nc">CharBuffer</span><span class="o">.</span><span class="na">allocate</span><span class="o">(</span><span class="n">n</span><span class="o">);</span></span>
<span id="LC2778" class="line" lang="java">        <span class="nc">CharsetDecoder</span> <span class="n">dec</span> <span class="o">=</span> <span class="nc">ThreadLocalCoders</span><span class="o">.</span><span class="na">decoderFor</span><span class="o">(</span><span class="s">"UTF-8"</span><span class="o">)</span></span>
<span id="LC2779" class="line" lang="java">            <span class="o">.</span><span class="na">onMalformedInput</span><span class="o">(</span><span class="nc">CodingErrorAction</span><span class="o">.</span><span class="na">REPLACE</span><span class="o">)</span></span>
<span id="LC2780" class="line" lang="java">            <span class="o">.</span><span class="na">onUnmappableCharacter</span><span class="o">(</span><span class="nc">CodingErrorAction</span><span class="o">.</span><span class="na">REPLACE</span><span class="o">);</span></span>
<span id="LC2781" class="line" lang="java"></span>
<span id="LC2782" class="line" lang="java">        <span class="c1">// This is not horribly efficient, but it will do for now</span></span>
<span id="LC2783" class="line" lang="java">        <span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></span>
<span id="LC2784" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">betweenBrackets</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2785" class="line" lang="java"></span>
<span id="LC2786" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">;)</span> <span class="o">{</span></span>
<span id="LC2787" class="line" lang="java">            <span class="k">assert</span> <span class="n">c</span> <span class="o">==</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span>    <span class="c1">// Loop invariant</span></span>
<span id="LC2788" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">==</span> <span class="sc">'['</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2789" class="line" lang="java">                <span class="n">betweenBrackets</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC2790" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">betweenBrackets</span> <span class="o">&amp;&amp;</span> <span class="n">c</span> <span class="o">==</span> <span class="sc">']'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2791" class="line" lang="java">                <span class="n">betweenBrackets</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2792" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2793" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">!=</span> <span class="sc">'%'</span> <span class="o">||</span> <span class="n">betweenBrackets</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2794" class="line" lang="java">                <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></span>
<span id="LC2795" class="line" lang="java">                <span class="k">if</span> <span class="o">(++</span><span class="n">i</span> <span class="o">&gt;=</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC2796" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC2797" class="line" lang="java">                <span class="n">c</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC2798" class="line" lang="java">                <span class="k">continue</span><span class="o">;</span></span>
<span id="LC2799" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2800" class="line" lang="java">            <span class="n">bb</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></span>
<span id="LC2801" class="line" lang="java">            <span class="kt">int</span> <span class="n">ui</span> <span class="o">=</span> <span class="n">i</span><span class="o">;</span></span>
<span id="LC2802" class="line" lang="java">            <span class="k">for</span> <span class="o">(;;)</span> <span class="o">{</span></span>
<span id="LC2803" class="line" lang="java">                <span class="k">assert</span> <span class="o">(</span><span class="n">n</span> <span class="o">-</span> <span class="n">i</span> <span class="o">&gt;=</span> <span class="mi">2</span><span class="o">);</span></span>
<span id="LC2804" class="line" lang="java">                <span class="n">bb</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">decode</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(++</span><span class="n">i</span><span class="o">),</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(++</span><span class="n">i</span><span class="o">)));</span></span>
<span id="LC2805" class="line" lang="java">                <span class="k">if</span> <span class="o">(++</span><span class="n">i</span> <span class="o">&gt;=</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC2806" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC2807" class="line" lang="java">                <span class="n">c</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC2808" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">!=</span> <span class="sc">'%'</span><span class="o">)</span></span>
<span id="LC2809" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC2810" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2811" class="line" lang="java">            <span class="n">bb</span><span class="o">.</span><span class="na">flip</span><span class="o">();</span></span>
<span id="LC2812" class="line" lang="java">            <span class="n">cb</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></span>
<span id="LC2813" class="line" lang="java">            <span class="n">dec</span><span class="o">.</span><span class="na">reset</span><span class="o">();</span></span>
<span id="LC2814" class="line" lang="java">            <span class="nc">CoderResult</span> <span class="n">cr</span> <span class="o">=</span> <span class="n">dec</span><span class="o">.</span><span class="na">decode</span><span class="o">(</span><span class="n">bb</span><span class="o">,</span> <span class="n">cb</span><span class="o">,</span> <span class="kc">true</span><span class="o">);</span></span>
<span id="LC2815" class="line" lang="java">            <span class="k">assert</span> <span class="n">cr</span><span class="o">.</span><span class="na">isUnderflow</span><span class="o">();</span></span>
<span id="LC2816" class="line" lang="java">            <span class="n">cr</span> <span class="o">=</span> <span class="n">dec</span><span class="o">.</span><span class="na">flush</span><span class="o">(</span><span class="n">cb</span><span class="o">);</span></span>
<span id="LC2817" class="line" lang="java">            <span class="k">assert</span> <span class="n">cr</span><span class="o">.</span><span class="na">isUnderflow</span><span class="o">();</span></span>
<span id="LC2818" class="line" lang="java">            <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">cb</span><span class="o">.</span><span class="na">flip</span><span class="o">().</span><span class="na">toString</span><span class="o">());</span></span>
<span id="LC2819" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2820" class="line" lang="java"></span>
<span id="LC2821" class="line" lang="java">        <span class="k">return</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></span>
<span id="LC2822" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2823" class="line" lang="java"></span>
<span id="LC2824" class="line" lang="java"></span>
<span id="LC2825" class="line" lang="java">    <span class="c1">// -- Parsing --</span></span>
<span id="LC2826" class="line" lang="java"></span>
<span id="LC2827" class="line" lang="java">    <span class="c1">// For convenience we wrap the input URI string in a new instance of the</span></span>
<span id="LC2828" class="line" lang="java">    <span class="c1">// following internal class.  This saves always having to pass the input</span></span>
<span id="LC2829" class="line" lang="java">    <span class="c1">// string as an argument to each internal scan/parse method.</span></span>
<span id="LC2830" class="line" lang="java"></span>
<span id="LC2831" class="line" lang="java">    <span class="kd">private</span> <span class="kd">class</span> <span class="nc">Parser</span> <span class="o">{</span></span>
<span id="LC2832" class="line" lang="java"></span>
<span id="LC2833" class="line" lang="java">        <span class="kd">private</span> <span class="nc">String</span> <span class="n">input</span><span class="o">;</span>           <span class="c1">// URI input string</span></span>
<span id="LC2834" class="line" lang="java">        <span class="kd">private</span> <span class="kt">boolean</span> <span class="n">requireServerAuthority</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2835" class="line" lang="java"></span>
<span id="LC2836" class="line" lang="java">        <span class="nc">Parser</span><span class="o">(</span><span class="nc">String</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2837" class="line" lang="java">            <span class="n">input</span> <span class="o">=</span> <span class="n">s</span><span class="o">;</span></span>
<span id="LC2838" class="line" lang="java">            <span class="n">string</span> <span class="o">=</span> <span class="n">s</span><span class="o">;</span></span>
<span id="LC2839" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2840" class="line" lang="java"></span>
<span id="LC2841" class="line" lang="java">        <span class="c1">// -- Methods for throwing URISyntaxException in various ways --</span></span>
<span id="LC2842" class="line" lang="java"></span>
<span id="LC2843" class="line" lang="java">        <span class="kd">private</span> <span class="kt">void</span> <span class="nf">fail</span><span class="o">(</span><span class="nc">String</span> <span class="n">reason</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">URISyntaxException</span> <span class="o">{</span></span>
<span id="LC2844" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">URISyntaxException</span><span class="o">(</span><span class="n">input</span><span class="o">,</span> <span class="n">reason</span><span class="o">);</span></span>
<span id="LC2845" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2846" class="line" lang="java"></span>
<span id="LC2847" class="line" lang="java">        <span class="kd">private</span> <span class="kt">void</span> <span class="nf">fail</span><span class="o">(</span><span class="nc">String</span> <span class="n">reason</span><span class="o">,</span> <span class="kt">int</span> <span class="n">p</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">URISyntaxException</span> <span class="o">{</span></span>
<span id="LC2848" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">URISyntaxException</span><span class="o">(</span><span class="n">input</span><span class="o">,</span> <span class="n">reason</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC2849" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2850" class="line" lang="java"></span>
<span id="LC2851" class="line" lang="java">        <span class="kd">private</span> <span class="kt">void</span> <span class="nf">failExpecting</span><span class="o">(</span><span class="nc">String</span> <span class="n">expected</span><span class="o">,</span> <span class="kt">int</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC2852" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC2853" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC2854" class="line" lang="java">            <span class="n">fail</span><span class="o">(</span><span class="s">"Expected "</span> <span class="o">+</span> <span class="n">expected</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC2855" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2856" class="line" lang="java"></span>
<span id="LC2857" class="line" lang="java">        <span class="kd">private</span> <span class="kt">void</span> <span class="nf">failExpecting</span><span class="o">(</span><span class="nc">String</span> <span class="n">expected</span><span class="o">,</span> <span class="nc">String</span> <span class="n">prior</span><span class="o">,</span> <span class="kt">int</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC2858" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC2859" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC2860" class="line" lang="java">            <span class="n">fail</span><span class="o">(</span><span class="s">"Expected "</span> <span class="o">+</span> <span class="n">expected</span> <span class="o">+</span> <span class="s">" following "</span> <span class="o">+</span> <span class="n">prior</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC2861" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2862" class="line" lang="java"></span>
<span id="LC2863" class="line" lang="java"></span>
<span id="LC2864" class="line" lang="java">        <span class="c1">// -- Simple access to the input string --</span></span>
<span id="LC2865" class="line" lang="java"></span>
<span id="LC2866" class="line" lang="java">        <span class="c1">// Return a substring of the input string</span></span>
<span id="LC2867" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2868" class="line" lang="java">        <span class="kd">private</span> <span class="nc">String</span> <span class="nf">substring</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2869" class="line" lang="java">            <span class="k">return</span> <span class="n">input</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">end</span><span class="o">);</span></span>
<span id="LC2870" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2871" class="line" lang="java"></span>
<span id="LC2872" class="line" lang="java">        <span class="c1">// Return the char at position p,</span></span>
<span id="LC2873" class="line" lang="java">        <span class="c1">// assuming that p &lt; input.length()</span></span>
<span id="LC2874" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2875" class="line" lang="java">        <span class="kd">private</span> <span class="kt">char</span> <span class="nf">charAt</span><span class="o">(</span><span class="kt">int</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2876" class="line" lang="java">            <span class="k">return</span> <span class="n">input</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">);</span></span>
<span id="LC2877" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2878" class="line" lang="java"></span>
<span id="LC2879" class="line" lang="java">        <span class="c1">// Tells whether start &lt; end and, if so, whether charAt(start) == c</span></span>
<span id="LC2880" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2881" class="line" lang="java">        <span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">at</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">end</span><span class="o">,</span> <span class="kt">char</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2882" class="line" lang="java">            <span class="k">return</span> <span class="o">(</span><span class="n">start</span> <span class="o">&lt;</span> <span class="n">end</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">charAt</span><span class="o">(</span><span class="n">start</span><span class="o">)</span> <span class="o">==</span> <span class="n">c</span><span class="o">);</span></span>
<span id="LC2883" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2884" class="line" lang="java"></span>
<span id="LC2885" class="line" lang="java">        <span class="c1">// Tells whether start + s.length() &lt; end and, if so,</span></span>
<span id="LC2886" class="line" lang="java">        <span class="c1">// whether the chars at the start position match s exactly</span></span>
<span id="LC2887" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2888" class="line" lang="java">        <span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">at</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">end</span><span class="o">,</span> <span class="nc">String</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2889" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC2890" class="line" lang="java">            <span class="kt">int</span> <span class="n">sn</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC2891" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">sn</span> <span class="o">&gt;</span> <span class="n">end</span> <span class="o">-</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC2892" class="line" lang="java">                <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2893" class="line" lang="java">            <span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC2894" class="line" lang="java">            <span class="k">while</span> <span class="o">(</span><span class="n">i</span> <span class="o">&lt;</span> <span class="n">sn</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2895" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">++)</span> <span class="o">!=</span> <span class="n">s</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2896" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC2897" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2898" class="line" lang="java">                <span class="n">i</span><span class="o">++;</span></span>
<span id="LC2899" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2900" class="line" lang="java">            <span class="k">return</span> <span class="o">(</span><span class="n">i</span> <span class="o">==</span> <span class="n">sn</span><span class="o">);</span></span>
<span id="LC2901" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2902" class="line" lang="java"></span>
<span id="LC2903" class="line" lang="java"></span>
<span id="LC2904" class="line" lang="java">        <span class="c1">// -- Scanning --</span></span>
<span id="LC2905" class="line" lang="java"></span>
<span id="LC2906" class="line" lang="java">        <span class="c1">// The various scan and parse methods that follow use a uniform</span></span>
<span id="LC2907" class="line" lang="java">        <span class="c1">// convention of taking the current start position and end index as</span></span>
<span id="LC2908" class="line" lang="java">        <span class="c1">// their first two arguments.  The start is inclusive while the end is</span></span>
<span id="LC2909" class="line" lang="java">        <span class="c1">// exclusive, just as in the String class, i.e., a start/end pair</span></span>
<span id="LC2910" class="line" lang="java">        <span class="c1">// denotes the left-open interval [start, end) of the input string.</span></span>
<span id="LC2911" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2912" class="line" lang="java">        <span class="c1">// These methods never proceed past the end position.  They may return</span></span>
<span id="LC2913" class="line" lang="java">        <span class="c1">// -1 to indicate outright failure, but more often they simply return</span></span>
<span id="LC2914" class="line" lang="java">        <span class="c1">// the position of the first char after the last char scanned.  Thus</span></span>
<span id="LC2915" class="line" lang="java">        <span class="c1">// a typical idiom is</span></span>
<span id="LC2916" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2917" class="line" lang="java">        <span class="c1">//     int p = start;</span></span>
<span id="LC2918" class="line" lang="java">        <span class="c1">//     int q = scan(p, end, ...);</span></span>
<span id="LC2919" class="line" lang="java">        <span class="c1">//     if (q &gt; p)</span></span>
<span id="LC2920" class="line" lang="java">        <span class="c1">//         // We scanned something</span></span>
<span id="LC2921" class="line" lang="java">        <span class="c1">//         ...;</span></span>
<span id="LC2922" class="line" lang="java">        <span class="c1">//     else if (q == p)</span></span>
<span id="LC2923" class="line" lang="java">        <span class="c1">//         // We scanned nothing</span></span>
<span id="LC2924" class="line" lang="java">        <span class="c1">//         ...;</span></span>
<span id="LC2925" class="line" lang="java">        <span class="c1">//     else if (q == -1)</span></span>
<span id="LC2926" class="line" lang="java">        <span class="c1">//         // Something went wrong</span></span>
<span id="LC2927" class="line" lang="java">        <span class="c1">//         ...;</span></span>
<span id="LC2928" class="line" lang="java"></span>
<span id="LC2929" class="line" lang="java"></span>
<span id="LC2930" class="line" lang="java">        <span class="c1">// Scan a specific char: If the char at the given start position is</span></span>
<span id="LC2931" class="line" lang="java">        <span class="c1">// equal to c, return the index of the next char; otherwise, return the</span></span>
<span id="LC2932" class="line" lang="java">        <span class="c1">// start position.</span></span>
<span id="LC2933" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2934" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">scan</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">end</span><span class="o">,</span> <span class="kt">char</span> <span class="n">c</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2935" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">start</span> <span class="o">&lt;</span> <span class="n">end</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">charAt</span><span class="o">(</span><span class="n">start</span><span class="o">)</span> <span class="o">==</span> <span class="n">c</span><span class="o">))</span></span>
<span id="LC2936" class="line" lang="java">                <span class="k">return</span> <span class="n">start</span> <span class="o">+</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC2937" class="line" lang="java">            <span class="k">return</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC2938" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2939" class="line" lang="java"></span>
<span id="LC2940" class="line" lang="java">        <span class="c1">// Scan forward from the given start position.  Stop at the first char</span></span>
<span id="LC2941" class="line" lang="java">        <span class="c1">// in the err string (in which case -1 is returned), or the first char</span></span>
<span id="LC2942" class="line" lang="java">        <span class="c1">// in the stop string (in which case the index of the preceding char is</span></span>
<span id="LC2943" class="line" lang="java">        <span class="c1">// returned), or the end of the input string (in which case the length</span></span>
<span id="LC2944" class="line" lang="java">        <span class="c1">// of the input string is returned).  May return the start position if</span></span>
<span id="LC2945" class="line" lang="java">        <span class="c1">// nothing matches.</span></span>
<span id="LC2946" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2947" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">scan</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">end</span><span class="o">,</span> <span class="nc">String</span> <span class="n">err</span><span class="o">,</span> <span class="nc">String</span> <span class="n">stop</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2948" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC2949" class="line" lang="java">            <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">end</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2950" class="line" lang="java">                <span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="n">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">);</span></span>
<span id="LC2951" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">err</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="n">c</span><span class="o">)</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2952" class="line" lang="java">                    <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2953" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">stop</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="n">c</span><span class="o">)</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC2954" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC2955" class="line" lang="java">                <span class="n">p</span><span class="o">++;</span></span>
<span id="LC2956" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2957" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC2958" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2959" class="line" lang="java"></span>
<span id="LC2960" class="line" lang="java">        <span class="c1">// Scan a potential escape sequence, starting at the given position,</span></span>
<span id="LC2961" class="line" lang="java">        <span class="c1">// with the given first char (i.e., charAt(start) == c).</span></span>
<span id="LC2962" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2963" class="line" lang="java">        <span class="c1">// This method assumes that if escapes are allowed then visible</span></span>
<span id="LC2964" class="line" lang="java">        <span class="c1">// non-US-ASCII chars are also allowed.</span></span>
<span id="LC2965" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2966" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">scanEscape</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">,</span> <span class="kt">char</span> <span class="n">first</span><span class="o">)</span></span>
<span id="LC2967" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC2968" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC2969" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC2970" class="line" lang="java">            <span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="n">first</span><span class="o">;</span></span>
<span id="LC2971" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">==</span> <span class="sc">'%'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2972" class="line" lang="java">                <span class="c1">// Process escape pair</span></span>
<span id="LC2973" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">p</span> <span class="o">+</span> <span class="mi">3</span> <span class="o">&lt;=</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC2974" class="line" lang="java">                    <span class="o">&amp;&amp;</span> <span class="n">match</span><span class="o">(</span><span class="n">charAt</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">),</span> <span class="no">L_HEX</span><span class="o">,</span> <span class="no">H_HEX</span><span class="o">)</span></span>
<span id="LC2975" class="line" lang="java">                    <span class="o">&amp;&amp;</span> <span class="n">match</span><span class="o">(</span><span class="n">charAt</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">2</span><span class="o">),</span> <span class="no">L_HEX</span><span class="o">,</span> <span class="no">H_HEX</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2976" class="line" lang="java">                    <span class="k">return</span> <span class="n">p</span> <span class="o">+</span> <span class="mi">3</span><span class="o">;</span></span>
<span id="LC2977" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2978" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"Malformed escape pair"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC2979" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">((</span><span class="n">c</span> <span class="o">&gt;</span> <span class="mi">128</span><span class="o">)</span></span>
<span id="LC2980" class="line" lang="java">                       <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="nc">Character</span><span class="o">.</span><span class="na">isSpaceChar</span><span class="o">(</span><span class="n">c</span><span class="o">)</span></span>
<span id="LC2981" class="line" lang="java">                       <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="nc">Character</span><span class="o">.</span><span class="na">isISOControl</span><span class="o">(</span><span class="n">c</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2982" class="line" lang="java">                <span class="c1">// Allow unescaped but visible non-US-ASCII chars</span></span>
<span id="LC2983" class="line" lang="java">                <span class="k">return</span> <span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC2984" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2985" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC2986" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2987" class="line" lang="java"></span>
<span id="LC2988" class="line" lang="java">        <span class="c1">// Scan chars that match the given mask pair</span></span>
<span id="LC2989" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2990" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">scan</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">,</span> <span class="kt">long</span> <span class="n">lowMask</span><span class="o">,</span> <span class="kt">long</span> <span class="n">highMask</span><span class="o">)</span></span>
<span id="LC2991" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC2992" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC2993" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC2994" class="line" lang="java">            <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2995" class="line" lang="java">                <span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="n">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">);</span></span>
<span id="LC2996" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">match</span><span class="o">(</span><span class="n">c</span><span class="o">,</span> <span class="n">lowMask</span><span class="o">,</span> <span class="n">highMask</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2997" class="line" lang="java">                    <span class="n">p</span><span class="o">++;</span></span>
<span id="LC2998" class="line" lang="java">                    <span class="k">continue</span><span class="o">;</span></span>
<span id="LC2999" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3000" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">lowMask</span> <span class="o">&amp;</span> <span class="no">L_ESCAPED</span><span class="o">)</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3001" class="line" lang="java">                    <span class="kt">int</span> <span class="n">q</span> <span class="o">=</span> <span class="n">scanEscape</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="n">c</span><span class="o">);</span></span>
<span id="LC3002" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3003" class="line" lang="java">                        <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3004" class="line" lang="java">                        <span class="k">continue</span><span class="o">;</span></span>
<span id="LC3005" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC3006" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3007" class="line" lang="java">                <span class="k">break</span><span class="o">;</span></span>
<span id="LC3008" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3009" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3010" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3011" class="line" lang="java"></span>
<span id="LC3012" class="line" lang="java">        <span class="c1">// Check that each of the chars in [start, end) matches the given mask</span></span>
<span id="LC3013" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3014" class="line" lang="java">        <span class="kd">private</span> <span class="kt">void</span> <span class="nf">checkChars</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">end</span><span class="o">,</span></span>
<span id="LC3015" class="line" lang="java">                                <span class="kt">long</span> <span class="n">lowMask</span><span class="o">,</span> <span class="kt">long</span> <span class="n">highMask</span><span class="o">,</span></span>
<span id="LC3016" class="line" lang="java">                                <span class="nc">String</span> <span class="n">what</span><span class="o">)</span></span>
<span id="LC3017" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3018" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3019" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">end</span><span class="o">,</span> <span class="n">lowMask</span><span class="o">,</span> <span class="n">highMask</span><span class="o">);</span></span>
<span id="LC3020" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">end</span><span class="o">)</span></span>
<span id="LC3021" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"Illegal character in "</span> <span class="o">+</span> <span class="n">what</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3022" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3023" class="line" lang="java"></span>
<span id="LC3024" class="line" lang="java">        <span class="c1">// Check that the char at position p matches the given mask</span></span>
<span id="LC3025" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3026" class="line" lang="java">        <span class="kd">private</span> <span class="kt">void</span> <span class="nf">checkChar</span><span class="o">(</span><span class="kt">int</span> <span class="n">p</span><span class="o">,</span></span>
<span id="LC3027" class="line" lang="java">                               <span class="kt">long</span> <span class="n">lowMask</span><span class="o">,</span> <span class="kt">long</span> <span class="n">highMask</span><span class="o">,</span></span>
<span id="LC3028" class="line" lang="java">                               <span class="nc">String</span> <span class="n">what</span><span class="o">)</span></span>
<span id="LC3029" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3030" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3031" class="line" lang="java">            <span class="n">checkChars</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">,</span> <span class="n">lowMask</span><span class="o">,</span> <span class="n">highMask</span><span class="o">,</span> <span class="n">what</span><span class="o">);</span></span>
<span id="LC3032" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3033" class="line" lang="java"></span>
<span id="LC3034" class="line" lang="java"></span>
<span id="LC3035" class="line" lang="java">        <span class="c1">// -- Parsing --</span></span>
<span id="LC3036" class="line" lang="java"></span>
<span id="LC3037" class="line" lang="java">        <span class="c1">// [&lt;scheme&gt;:]&lt;scheme-specific-part&gt;[#&lt;fragment&gt;]</span></span>
<span id="LC3038" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3039" class="line" lang="java">        <span class="kt">void</span> <span class="nf">parse</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">rsa</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">URISyntaxException</span> <span class="o">{</span></span>
<span id="LC3040" class="line" lang="java">            <span class="n">requireServerAuthority</span> <span class="o">=</span> <span class="n">rsa</span><span class="o">;</span></span>
<span id="LC3041" class="line" lang="java">            <span class="kt">int</span> <span class="n">ssp</span><span class="o">;</span>                    <span class="c1">// Start of scheme-specific part</span></span>
<span id="LC3042" class="line" lang="java">            <span class="kt">int</span> <span class="n">n</span> <span class="o">=</span> <span class="n">input</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC3043" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">"/?#"</span><span class="o">,</span> <span class="s">":"</span><span class="o">);</span></span>
<span id="LC3044" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">p</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">':'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3045" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC3046" class="line" lang="java">                    <span class="n">failExpecting</span><span class="o">(</span><span class="s">"scheme name"</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></span>
<span id="LC3047" class="line" lang="java">                <span class="n">checkChar</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="no">L_ALPHA</span><span class="o">,</span> <span class="no">H_ALPHA</span><span class="o">,</span> <span class="s">"scheme name"</span><span class="o">);</span></span>
<span id="LC3048" class="line" lang="java">                <span class="n">checkChars</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="n">p</span><span class="o">,</span> <span class="no">L_SCHEME</span><span class="o">,</span> <span class="no">H_SCHEME</span><span class="o">,</span> <span class="s">"scheme name"</span><span class="o">);</span></span>
<span id="LC3049" class="line" lang="java">                <span class="n">scheme</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3050" class="line" lang="java">                <span class="n">p</span><span class="o">++;</span>                    <span class="c1">// Skip ':'</span></span>
<span id="LC3051" class="line" lang="java">                <span class="n">ssp</span> <span class="o">=</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3052" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'/'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3053" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">parseHierarchical</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3054" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3055" class="line" lang="java">                    <span class="kt">int</span> <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">""</span><span class="o">,</span> <span class="s">"#"</span><span class="o">);</span></span>
<span id="LC3056" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC3057" class="line" lang="java">                        <span class="n">failExpecting</span><span class="o">(</span><span class="s">"scheme-specific part"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3058" class="line" lang="java">                    <span class="n">checkChars</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">,</span> <span class="no">L_URIC</span><span class="o">,</span> <span class="no">H_URIC</span><span class="o">,</span> <span class="s">"opaque part"</span><span class="o">);</span></span>
<span id="LC3059" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3060" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3061" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3062" class="line" lang="java">                <span class="n">ssp</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC3063" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">parseHierarchical</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3064" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3065" class="line" lang="java">            <span class="n">schemeSpecificPart</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">ssp</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3066" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'#'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3067" class="line" lang="java">                <span class="n">checkChars</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_URIC</span><span class="o">,</span> <span class="no">H_URIC</span><span class="o">,</span> <span class="s">"fragment"</span><span class="o">);</span></span>
<span id="LC3068" class="line" lang="java">                <span class="n">fragment</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3069" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">n</span><span class="o">;</span></span>
<span id="LC3070" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3071" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3072" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"end of URI"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3073" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3074" class="line" lang="java"></span>
<span id="LC3075" class="line" lang="java">        <span class="c1">// [//authority]&lt;path&gt;[?&lt;query&gt;]</span></span>
<span id="LC3076" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3077" class="line" lang="java">        <span class="c1">// DEVIATION from RFC2396: We allow an empty authority component as</span></span>
<span id="LC3078" class="line" lang="java">        <span class="c1">// long as it's followed by a non-empty path, query component, or</span></span>
<span id="LC3079" class="line" lang="java">        <span class="c1">// fragment component.  This is so that URIs such as "file:///foo/bar"</span></span>
<span id="LC3080" class="line" lang="java">        <span class="c1">// will parse.  This seems to be the intent of RFC2396, though the</span></span>
<span id="LC3081" class="line" lang="java">        <span class="c1">// grammar does not permit it.  If the authority is empty then the</span></span>
<span id="LC3082" class="line" lang="java">        <span class="c1">// userInfo, host, and port components are undefined.</span></span>
<span id="LC3083" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3084" class="line" lang="java">        <span class="c1">// DEVIATION from RFC2396: We allow empty relative paths.  This seems</span></span>
<span id="LC3085" class="line" lang="java">        <span class="c1">// to be the intent of RFC2396, but the grammar does not permit it.</span></span>
<span id="LC3086" class="line" lang="java">        <span class="c1">// The primary consequence of this deviation is that "#f" parses as a</span></span>
<span id="LC3087" class="line" lang="java">        <span class="c1">// relative URI with an empty path.</span></span>
<span id="LC3088" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3089" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">parseHierarchical</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3090" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3091" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3092" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3093" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'/'</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="n">at</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'/'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3094" class="line" lang="java">                <span class="n">p</span> <span class="o">+=</span> <span class="mi">2</span><span class="o">;</span></span>
<span id="LC3095" class="line" lang="java">                <span class="kt">int</span> <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">""</span><span class="o">,</span> <span class="s">"/?#"</span><span class="o">);</span></span>
<span id="LC3096" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3097" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">parseAuthority</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3098" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3099" class="line" lang="java">                    <span class="c1">// DEVIATION: Allow empty authority prior to non-empty</span></span>
<span id="LC3100" class="line" lang="java">                    <span class="c1">// path, query component or fragment identifier</span></span>
<span id="LC3101" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span></span>
<span id="LC3102" class="line" lang="java">                    <span class="n">failExpecting</span><span class="o">(</span><span class="s">"authority"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3103" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3104" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">""</span><span class="o">,</span> <span class="s">"?#"</span><span class="o">);</span> <span class="c1">// DEVIATION: May be empty</span></span>
<span id="LC3105" class="line" lang="java">            <span class="n">checkChars</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">,</span> <span class="no">L_PATH</span><span class="o">,</span> <span class="no">H_PATH</span><span class="o">,</span> <span class="s">"path"</span><span class="o">);</span></span>
<span id="LC3106" class="line" lang="java">            <span class="n">path</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3107" class="line" lang="java">            <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3108" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'?'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3109" class="line" lang="java">                <span class="n">p</span><span class="o">++;</span></span>
<span id="LC3110" class="line" lang="java">                <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">""</span><span class="o">,</span> <span class="s">"#"</span><span class="o">);</span></span>
<span id="LC3111" class="line" lang="java">                <span class="n">checkChars</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">,</span> <span class="no">L_URIC</span><span class="o">,</span> <span class="no">H_URIC</span><span class="o">,</span> <span class="s">"query"</span><span class="o">);</span></span>
<span id="LC3112" class="line" lang="java">                <span class="n">query</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3113" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3114" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3115" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3116" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3117" class="line" lang="java"></span>
<span id="LC3118" class="line" lang="java">        <span class="c1">// authority     = server | reg_name</span></span>
<span id="LC3119" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3120" class="line" lang="java">        <span class="c1">// Ambiguity: An authority that is a registry name rather than a server</span></span>
<span id="LC3121" class="line" lang="java">        <span class="c1">// might have a prefix that parses as a server.  We use the fact that</span></span>
<span id="LC3122" class="line" lang="java">        <span class="c1">// the authority component is always followed by '/' or the end of the</span></span>
<span id="LC3123" class="line" lang="java">        <span class="c1">// input string to resolve this: If the complete authority did not</span></span>
<span id="LC3124" class="line" lang="java">        <span class="c1">// parse as a server then we try to parse it as a registry name.</span></span>
<span id="LC3125" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3126" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">parseAuthority</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3127" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3128" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3129" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3130" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span> <span class="o">=</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3131" class="line" lang="java">            <span class="nc">URISyntaxException</span> <span class="n">ex</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC3132" class="line" lang="java"></span>
<span id="LC3133" class="line" lang="java">            <span class="kt">boolean</span> <span class="n">serverChars</span><span class="o">;</span></span>
<span id="LC3134" class="line" lang="java">            <span class="kt">boolean</span> <span class="n">regChars</span><span class="o">;</span></span>
<span id="LC3135" class="line" lang="java"></span>
<span id="LC3136" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">""</span><span class="o">,</span> <span class="s">"]"</span><span class="o">)</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3137" class="line" lang="java">                <span class="c1">// contains a literal IPv6 address, therefore % is allowed</span></span>
<span id="LC3138" class="line" lang="java">                <span class="n">serverChars</span> <span class="o">=</span> <span class="o">(</span><span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_SERVER_PERCENT</span><span class="o">,</span> <span class="no">H_SERVER_PERCENT</span><span class="o">)</span> <span class="o">==</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3139" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3140" class="line" lang="java">                <span class="n">serverChars</span> <span class="o">=</span> <span class="o">(</span><span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_SERVER</span><span class="o">,</span> <span class="no">H_SERVER</span><span class="o">)</span> <span class="o">==</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3141" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3142" class="line" lang="java">            <span class="n">regChars</span> <span class="o">=</span> <span class="o">(</span><span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_REG_NAME</span><span class="o">,</span> <span class="no">H_REG_NAME</span><span class="o">)</span> <span class="o">==</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3143" class="line" lang="java"></span>
<span id="LC3144" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">regChars</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">serverChars</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3145" class="line" lang="java">                <span class="c1">// Must be a registry-based authority</span></span>
<span id="LC3146" class="line" lang="java">                <span class="n">authority</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3147" class="line" lang="java">                <span class="k">return</span> <span class="n">n</span><span class="o">;</span></span>
<span id="LC3148" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3149" class="line" lang="java"></span>
<span id="LC3150" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">serverChars</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3151" class="line" lang="java">                <span class="c1">// Might be (probably is) a server-based authority, so attempt</span></span>
<span id="LC3152" class="line" lang="java">                <span class="c1">// to parse it as such.  If the attempt fails, try to treat it</span></span>
<span id="LC3153" class="line" lang="java">                <span class="c1">// as a registry-based authority.</span></span>
<span id="LC3154" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC3155" class="line" lang="java">                    <span class="n">q</span> <span class="o">=</span> <span class="n">parseServer</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3156" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3157" class="line" lang="java">                        <span class="n">failExpecting</span><span class="o">(</span><span class="s">"end of authority"</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3158" class="line" lang="java">                    <span class="n">authority</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3159" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">URISyntaxException</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3160" class="line" lang="java">                    <span class="c1">// Undo results of failed parse</span></span>
<span id="LC3161" class="line" lang="java">                    <span class="n">userInfo</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC3162" class="line" lang="java">                    <span class="n">host</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC3163" class="line" lang="java">                    <span class="n">port</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC3164" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">requireServerAuthority</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3165" class="line" lang="java">                        <span class="c1">// If we're insisting upon a server-based authority,</span></span>
<span id="LC3166" class="line" lang="java">                        <span class="c1">// then just re-throw the exception</span></span>
<span id="LC3167" class="line" lang="java">                        <span class="k">throw</span> <span class="n">x</span><span class="o">;</span></span>
<span id="LC3168" class="line" lang="java">                    <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3169" class="line" lang="java">                        <span class="c1">// Save the exception in case it doesn't parse as a</span></span>
<span id="LC3170" class="line" lang="java">                        <span class="c1">// registry either</span></span>
<span id="LC3171" class="line" lang="java">                        <span class="n">ex</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></span>
<span id="LC3172" class="line" lang="java">                        <span class="n">q</span> <span class="o">=</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3173" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC3174" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3175" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3176" class="line" lang="java"></span>
<span id="LC3177" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3178" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">regChars</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3179" class="line" lang="java">                    <span class="c1">// Registry-based authority</span></span>
<span id="LC3180" class="line" lang="java">                    <span class="n">authority</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3181" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">ex</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3182" class="line" lang="java">                    <span class="c1">// Re-throw exception; it was probably due to</span></span>
<span id="LC3183" class="line" lang="java">                    <span class="c1">// a malformed IPv6 address</span></span>
<span id="LC3184" class="line" lang="java">                    <span class="k">throw</span> <span class="n">ex</span><span class="o">;</span></span>
<span id="LC3185" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3186" class="line" lang="java">                    <span class="n">fail</span><span class="o">(</span><span class="s">"Illegal character in authority"</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3187" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3188" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3189" class="line" lang="java"></span>
<span id="LC3190" class="line" lang="java">            <span class="k">return</span> <span class="n">n</span><span class="o">;</span></span>
<span id="LC3191" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3192" class="line" lang="java"></span>
<span id="LC3193" class="line" lang="java"></span>
<span id="LC3194" class="line" lang="java">        <span class="c1">// [&lt;userinfo&gt;@]&lt;host&gt;[:&lt;port&gt;]</span></span>
<span id="LC3195" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3196" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">parseServer</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3197" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3198" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3199" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3200" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3201" class="line" lang="java"></span>
<span id="LC3202" class="line" lang="java">            <span class="c1">// userinfo</span></span>
<span id="LC3203" class="line" lang="java">            <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">"/?#"</span><span class="o">,</span> <span class="s">"@"</span><span class="o">);</span></span>
<span id="LC3204" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">&gt;=</span> <span class="n">p</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="n">at</span><span class="o">(</span><span class="n">q</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'@'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3205" class="line" lang="java">                <span class="n">checkChars</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">,</span> <span class="no">L_USERINFO</span><span class="o">,</span> <span class="no">H_USERINFO</span><span class="o">,</span> <span class="s">"user info"</span><span class="o">);</span></span>
<span id="LC3206" class="line" lang="java">                <span class="n">userInfo</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3207" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">q</span> <span class="o">+</span> <span class="mi">1</span><span class="o">;</span>              <span class="c1">// Skip '@'</span></span>
<span id="LC3208" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3209" class="line" lang="java"></span>
<span id="LC3210" class="line" lang="java">            <span class="c1">// hostname, IPv4 address, or IPv6 address</span></span>
<span id="LC3211" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'['</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3212" class="line" lang="java">                <span class="c1">// DEVIATION from RFC2396: Support IPv6 addresses, per RFC2732</span></span>
<span id="LC3213" class="line" lang="java">                <span class="n">p</span><span class="o">++;</span></span>
<span id="LC3214" class="line" lang="java">                <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">"/?#"</span><span class="o">,</span> <span class="s">"]"</span><span class="o">);</span></span>
<span id="LC3215" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="n">at</span><span class="o">(</span><span class="n">q</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">']'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3216" class="line" lang="java">                    <span class="c1">// look for a "%" scope id</span></span>
<span id="LC3217" class="line" lang="java">                    <span class="kt">int</span> <span class="n">r</span> <span class="o">=</span> <span class="n">scan</span> <span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">,</span> <span class="s">""</span><span class="o">,</span> <span class="s">"%"</span><span class="o">);</span></span>
<span id="LC3218" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">r</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3219" class="line" lang="java">                        <span class="n">parseIPv6Reference</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">r</span><span class="o">);</span></span>
<span id="LC3220" class="line" lang="java">                        <span class="k">if</span> <span class="o">(</span><span class="n">r</span><span class="o">+</span><span class="mi">1</span> <span class="o">==</span> <span class="n">q</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3221" class="line" lang="java">                            <span class="n">fail</span> <span class="o">(</span><span class="s">"scope id expected"</span><span class="o">);</span></span>
<span id="LC3222" class="line" lang="java">                        <span class="o">}</span></span>
<span id="LC3223" class="line" lang="java">                        <span class="n">checkChars</span> <span class="o">(</span><span class="n">r</span><span class="o">+</span><span class="mi">1</span><span class="o">,</span> <span class="n">q</span><span class="o">,</span> <span class="no">L_ALPHANUM</span><span class="o">,</span> <span class="no">H_ALPHANUM</span><span class="o">,</span></span>
<span id="LC3224" class="line" lang="java">                                                <span class="s">"scope id"</span><span class="o">);</span></span>
<span id="LC3225" class="line" lang="java">                    <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3226" class="line" lang="java">                        <span class="n">parseIPv6Reference</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3227" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC3228" class="line" lang="java">                    <span class="n">host</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">-</span><span class="mi">1</span><span class="o">,</span> <span class="n">q</span><span class="o">+</span><span class="mi">1</span><span class="o">);</span></span>
<span id="LC3229" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">q</span> <span class="o">+</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC3230" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3231" class="line" lang="java">                    <span class="n">failExpecting</span><span class="o">(</span><span class="s">"closing bracket for IPv6 address"</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3232" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3233" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3234" class="line" lang="java">                <span class="n">q</span> <span class="o">=</span> <span class="n">parseIPv4Address</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3235" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC3236" class="line" lang="java">                    <span class="n">q</span> <span class="o">=</span> <span class="n">parseHostname</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3237" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3238" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3239" class="line" lang="java"></span>
<span id="LC3240" class="line" lang="java">            <span class="c1">// port</span></span>
<span id="LC3241" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">':'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3242" class="line" lang="java">                <span class="n">p</span><span class="o">++;</span></span>
<span id="LC3243" class="line" lang="java">                <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">""</span><span class="o">,</span> <span class="s">"/"</span><span class="o">);</span></span>
<span id="LC3244" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3245" class="line" lang="java">                    <span class="n">checkChars</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">,</span> <span class="no">L_DIGIT</span><span class="o">,</span> <span class="no">H_DIGIT</span><span class="o">,</span> <span class="s">"port number"</span><span class="o">);</span></span>
<span id="LC3246" class="line" lang="java">                    <span class="k">try</span> <span class="o">{</span></span>
<span id="LC3247" class="line" lang="java">                        <span class="n">port</span> <span class="o">=</span> <span class="nc">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">(</span><span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">));</span></span>
<span id="LC3248" class="line" lang="java">                    <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">NumberFormatException</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3249" class="line" lang="java">                        <span class="n">fail</span><span class="o">(</span><span class="s">"Malformed port number"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3250" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC3251" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3252" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3253" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3254" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3255" class="line" lang="java">                <span class="n">failExpecting</span><span class="o">(</span><span class="s">"port number"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3256" class="line" lang="java"></span>
<span id="LC3257" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3258" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3259" class="line" lang="java"></span>
<span id="LC3260" class="line" lang="java">        <span class="c1">// Scan a string of decimal digits whose value fits in a byte</span></span>
<span id="LC3261" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3262" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">scanByte</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3263" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3264" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3265" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3266" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_DIGIT</span><span class="o">,</span> <span class="no">H_DIGIT</span><span class="o">);</span></span>
<span id="LC3267" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="k">return</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3268" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="nc">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">(</span><span class="n">substring</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">q</span><span class="o">))</span> <span class="o">&gt;</span> <span class="mi">255</span><span class="o">)</span> <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3269" class="line" lang="java">            <span class="k">return</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3270" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3271" class="line" lang="java"></span>
<span id="LC3272" class="line" lang="java">        <span class="c1">// Scan an IPv4 address.</span></span>
<span id="LC3273" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3274" class="line" lang="java">        <span class="c1">// If the strict argument is true then we require that the given</span></span>
<span id="LC3275" class="line" lang="java">        <span class="c1">// interval contain nothing besides an IPv4 address; if it is false</span></span>
<span id="LC3276" class="line" lang="java">        <span class="c1">// then we only require that it start with an IPv4 address.</span></span>
<span id="LC3277" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3278" class="line" lang="java">        <span class="c1">// If the interval does not contain or start with (depending upon the</span></span>
<span id="LC3279" class="line" lang="java">        <span class="c1">// strict argument) a legal IPv4 address characters then we return -1</span></span>
<span id="LC3280" class="line" lang="java">        <span class="c1">// immediately; otherwise we insist that these characters parse as a</span></span>
<span id="LC3281" class="line" lang="java">        <span class="c1">// legal IPv4 address and throw an exception on failure.</span></span>
<span id="LC3282" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3283" class="line" lang="java">        <span class="c1">// We assume that any string of decimal digits and dots must be an IPv4</span></span>
<span id="LC3284" class="line" lang="java">        <span class="c1">// address.  It won't parse as a hostname anyway, so making that</span></span>
<span id="LC3285" class="line" lang="java">        <span class="c1">// assumption here allows more meaningful exceptions to be thrown.</span></span>
<span id="LC3286" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3287" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">scanIPv4Address</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">strict</span><span class="o">)</span></span>
<span id="LC3288" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3289" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3290" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3291" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3292" class="line" lang="java">            <span class="kt">int</span> <span class="n">m</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_DIGIT</span> <span class="o">|</span> <span class="no">L_DOT</span><span class="o">,</span> <span class="no">H_DIGIT</span> <span class="o">|</span> <span class="no">H_DOT</span><span class="o">);</span></span>
<span id="LC3293" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">m</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="o">||</span> <span class="o">(</span><span class="n">strict</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">m</span> <span class="o">!=</span> <span class="n">n</span><span class="o">)))</span></span>
<span id="LC3294" class="line" lang="java">                <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC3295" class="line" lang="java">            <span class="k">for</span> <span class="o">(;;)</span> <span class="o">{</span></span>
<span id="LC3296" class="line" lang="java">                <span class="c1">// Per RFC2732: At most three digits per byte</span></span>
<span id="LC3297" class="line" lang="java">                <span class="c1">// Further constraint: Each element fits in a byte</span></span>
<span id="LC3298" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">=</span> <span class="n">scanByte</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">m</span><span class="o">))</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span>   <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3299" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">m</span><span class="o">,</span> <span class="sc">'.'</span><span class="o">))</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span>  <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3300" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">=</span> <span class="n">scanByte</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">m</span><span class="o">))</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span>   <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3301" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">m</span><span class="o">,</span> <span class="sc">'.'</span><span class="o">))</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span>  <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3302" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">=</span> <span class="n">scanByte</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">m</span><span class="o">))</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span>   <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3303" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">m</span><span class="o">,</span> <span class="sc">'.'</span><span class="o">))</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span>  <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3304" class="line" lang="java">                <span class="k">if</span> <span class="o">((</span><span class="n">q</span> <span class="o">=</span> <span class="n">scanByte</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">m</span><span class="o">))</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span>   <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3305" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;</span> <span class="n">m</span><span class="o">)</span> <span class="k">break</span><span class="o">;</span></span>
<span id="LC3306" class="line" lang="java">                <span class="k">return</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3307" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3308" class="line" lang="java">            <span class="n">fail</span><span class="o">(</span><span class="s">"Malformed IPv4 address"</span><span class="o">,</span> <span class="n">q</span><span class="o">);</span></span>
<span id="LC3309" class="line" lang="java">            <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC3310" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3311" class="line" lang="java"></span>
<span id="LC3312" class="line" lang="java">        <span class="c1">// Take an IPv4 address: Throw an exception if the given interval</span></span>
<span id="LC3313" class="line" lang="java">        <span class="c1">// contains anything except an IPv4 address</span></span>
<span id="LC3314" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3315" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">takeIPv4Address</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">,</span> <span class="nc">String</span> <span class="n">expected</span><span class="o">)</span></span>
<span id="LC3316" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3317" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3318" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">scanIPv4Address</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="kc">true</span><span class="o">);</span></span>
<span id="LC3319" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;=</span> <span class="n">start</span><span class="o">)</span></span>
<span id="LC3320" class="line" lang="java">                <span class="n">failExpecting</span><span class="o">(</span><span class="n">expected</span><span class="o">,</span> <span class="n">start</span><span class="o">);</span></span>
<span id="LC3321" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3322" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3323" class="line" lang="java"></span>
<span id="LC3324" class="line" lang="java">        <span class="c1">// Attempt to parse an IPv4 address, returning -1 on failure but</span></span>
<span id="LC3325" class="line" lang="java">        <span class="c1">// allowing the given interval to contain [:&lt;characters&gt;] after</span></span>
<span id="LC3326" class="line" lang="java">        <span class="c1">// the IPv4 address.</span></span>
<span id="LC3327" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3328" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">parseIPv4Address</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3329" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3330" class="line" lang="java"></span>
<span id="LC3331" class="line" lang="java">            <span class="k">try</span> <span class="o">{</span></span>
<span id="LC3332" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">scanIPv4Address</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="kc">false</span><span class="o">);</span></span>
<span id="LC3333" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">URISyntaxException</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3334" class="line" lang="java">                <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC3335" class="line" lang="java">            <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">NumberFormatException</span> <span class="n">nfe</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3336" class="line" lang="java">                <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC3337" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3338" class="line" lang="java"></span>
<span id="LC3339" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&gt;</span> <span class="n">start</span> <span class="o">&amp;&amp;</span> <span class="n">p</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3340" class="line" lang="java">                <span class="c1">// IPv4 address is followed by something - check that</span></span>
<span id="LC3341" class="line" lang="java">                <span class="c1">// it's a ":" as this is the only valid character to</span></span>
<span id="LC3342" class="line" lang="java">                <span class="c1">// follow an address.</span></span>
<span id="LC3343" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">charAt</span><span class="o">(</span><span class="n">p</span><span class="o">)</span> <span class="o">!=</span> <span class="sc">':'</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3344" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC3345" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3346" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3347" class="line" lang="java"></span>
<span id="LC3348" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&gt;</span> <span class="n">start</span><span class="o">)</span></span>
<span id="LC3349" class="line" lang="java">                <span class="n">host</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3350" class="line" lang="java"></span>
<span id="LC3351" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3352" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3353" class="line" lang="java"></span>
<span id="LC3354" class="line" lang="java">        <span class="c1">// hostname      = domainlabel [ "." ] | 1*( domainlabel "." ) toplabel [ "." ]</span></span>
<span id="LC3355" class="line" lang="java">        <span class="c1">// domainlabel   = alphanum | alphanum *( alphanum | "-" ) alphanum</span></span>
<span id="LC3356" class="line" lang="java">        <span class="c1">// toplabel      = alpha | alpha *( alphanum | "-" ) alphanum</span></span>
<span id="LC3357" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3358" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">parseHostname</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3359" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3360" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3361" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3362" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3363" class="line" lang="java">            <span class="kt">int</span> <span class="n">l</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span>                 <span class="c1">// Start of last parsed label</span></span>
<span id="LC3364" class="line" lang="java"></span>
<span id="LC3365" class="line" lang="java">            <span class="k">do</span> <span class="o">{</span></span>
<span id="LC3366" class="line" lang="java">                <span class="c1">// domainlabel = alphanum [ *( alphanum | "-" ) alphanum ]</span></span>
<span id="LC3367" class="line" lang="java">                <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_ALPHANUM</span><span class="o">,</span> <span class="no">H_ALPHANUM</span><span class="o">);</span></span>
<span id="LC3368" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC3369" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC3370" class="line" lang="java">                <span class="n">l</span> <span class="o">=</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3371" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3372" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3373" class="line" lang="java">                    <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_ALPHANUM</span> <span class="o">|</span> <span class="no">L_DASH</span><span class="o">,</span> <span class="no">H_ALPHANUM</span> <span class="o">|</span> <span class="no">H_DASH</span><span class="o">);</span></span>
<span id="LC3374" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3375" class="line" lang="java">                        <span class="k">if</span> <span class="o">(</span><span class="n">charAt</span><span class="o">(</span><span class="n">q</span> <span class="o">-</span> <span class="mi">1</span><span class="o">)</span> <span class="o">==</span> <span class="sc">'-'</span><span class="o">)</span></span>
<span id="LC3376" class="line" lang="java">                            <span class="n">fail</span><span class="o">(</span><span class="s">"Illegal character in hostname"</span><span class="o">,</span> <span class="n">q</span> <span class="o">-</span> <span class="mi">1</span><span class="o">);</span></span>
<span id="LC3377" class="line" lang="java">                        <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3378" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC3379" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3380" class="line" lang="java">                <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'.'</span><span class="o">);</span></span>
<span id="LC3381" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC3382" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC3383" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3384" class="line" lang="java">            <span class="o">}</span> <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3385" class="line" lang="java"></span>
<span id="LC3386" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">':'</span><span class="o">))</span></span>
<span id="LC3387" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"Illegal character in hostname"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3388" class="line" lang="java"></span>
<span id="LC3389" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">l</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC3390" class="line" lang="java">                <span class="n">failExpecting</span><span class="o">(</span><span class="s">"hostname"</span><span class="o">,</span> <span class="n">start</span><span class="o">);</span></span>
<span id="LC3391" class="line" lang="java"></span>
<span id="LC3392" class="line" lang="java">            <span class="c1">// for a fully qualified hostname check that the rightmost</span></span>
<span id="LC3393" class="line" lang="java">            <span class="c1">// label starts with an alpha character.</span></span>
<span id="LC3394" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">l</span> <span class="o">&gt;</span> <span class="n">start</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">match</span><span class="o">(</span><span class="n">charAt</span><span class="o">(</span><span class="n">l</span><span class="o">),</span> <span class="no">L_ALPHA</span><span class="o">,</span> <span class="no">H_ALPHA</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3395" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"Illegal character in hostname"</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span></span>
<span id="LC3396" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3397" class="line" lang="java"></span>
<span id="LC3398" class="line" lang="java">            <span class="n">host</span> <span class="o">=</span> <span class="n">substring</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3399" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3400" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3401" class="line" lang="java"></span>
<span id="LC3402" class="line" lang="java"></span>
<span id="LC3403" class="line" lang="java">        <span class="c1">// IPv6 address parsing, from RFC2373: IPv6 Addressing Architecture</span></span>
<span id="LC3404" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3405" class="line" lang="java">        <span class="c1">// Bug: The grammar in RFC2373 Appendix B does not allow addresses of</span></span>
<span id="LC3406" class="line" lang="java">        <span class="c1">// the form ::12.34.56.78, which are clearly shown in the examples</span></span>
<span id="LC3407" class="line" lang="java">        <span class="c1">// earlier in the document.  Here is the original grammar:</span></span>
<span id="LC3408" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3409" class="line" lang="java">        <span class="c1">//   IPv6address = hexpart [ ":" IPv4address ]</span></span>
<span id="LC3410" class="line" lang="java">        <span class="c1">//   hexpart     = hexseq | hexseq "::" [ hexseq ] | "::" [ hexseq ]</span></span>
<span id="LC3411" class="line" lang="java">        <span class="c1">//   hexseq      = hex4 *( ":" hex4)</span></span>
<span id="LC3412" class="line" lang="java">        <span class="c1">//   hex4        = 1*4HEXDIG</span></span>
<span id="LC3413" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3414" class="line" lang="java">        <span class="c1">// We therefore use the following revised grammar:</span></span>
<span id="LC3415" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3416" class="line" lang="java">        <span class="c1">//   IPv6address = hexseq [ ":" IPv4address ]</span></span>
<span id="LC3417" class="line" lang="java">        <span class="c1">//                 | hexseq [ "::" [ hexpost ] ]</span></span>
<span id="LC3418" class="line" lang="java">        <span class="c1">//                 | "::" [ hexpost ]</span></span>
<span id="LC3419" class="line" lang="java">        <span class="c1">//   hexpost     = hexseq | hexseq ":" IPv4address | IPv4address</span></span>
<span id="LC3420" class="line" lang="java">        <span class="c1">//   hexseq      = hex4 *( ":" hex4)</span></span>
<span id="LC3421" class="line" lang="java">        <span class="c1">//   hex4        = 1*4HEXDIG</span></span>
<span id="LC3422" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3423" class="line" lang="java">        <span class="c1">// This covers all and only the following cases:</span></span>
<span id="LC3424" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3425" class="line" lang="java">        <span class="c1">//   hexseq</span></span>
<span id="LC3426" class="line" lang="java">        <span class="c1">//   hexseq : IPv4address</span></span>
<span id="LC3427" class="line" lang="java">        <span class="c1">//   hexseq ::</span></span>
<span id="LC3428" class="line" lang="java">        <span class="c1">//   hexseq :: hexseq</span></span>
<span id="LC3429" class="line" lang="java">        <span class="c1">//   hexseq :: hexseq : IPv4address</span></span>
<span id="LC3430" class="line" lang="java">        <span class="c1">//   hexseq :: IPv4address</span></span>
<span id="LC3431" class="line" lang="java">        <span class="c1">//   :: hexseq</span></span>
<span id="LC3432" class="line" lang="java">        <span class="c1">//   :: hexseq : IPv4address</span></span>
<span id="LC3433" class="line" lang="java">        <span class="c1">//   :: IPv4address</span></span>
<span id="LC3434" class="line" lang="java">        <span class="c1">//   ::</span></span>
<span id="LC3435" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3436" class="line" lang="java">        <span class="c1">// Additionally we constrain the IPv6 address as follows :-</span></span>
<span id="LC3437" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3438" class="line" lang="java">        <span class="c1">//  i.  IPv6 addresses without compressed zeros should contain</span></span>
<span id="LC3439" class="line" lang="java">        <span class="c1">//      exactly 16 bytes.</span></span>
<span id="LC3440" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3441" class="line" lang="java">        <span class="c1">//  ii. IPv6 addresses with compressed zeros should contain</span></span>
<span id="LC3442" class="line" lang="java">        <span class="c1">//      less than 16 bytes.</span></span>
<span id="LC3443" class="line" lang="java"></span>
<span id="LC3444" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="n">ipv6byteCount</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC3445" class="line" lang="java"></span>
<span id="LC3446" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">parseIPv6Reference</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3447" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3448" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3449" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3450" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3451" class="line" lang="java">            <span class="kt">boolean</span> <span class="n">compressedZeros</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC3452" class="line" lang="java"></span>
<span id="LC3453" class="line" lang="java">            <span class="n">q</span> <span class="o">=</span> <span class="n">scanHexSeq</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3454" class="line" lang="java"></span>
<span id="LC3455" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3456" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3457" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">"::"</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3458" class="line" lang="java">                    <span class="n">compressedZeros</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC3459" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">scanHexPost</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">2</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3460" class="line" lang="java">                <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">':'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3461" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">takeIPv4Address</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">,</span>  <span class="n">n</span><span class="o">,</span> <span class="s">"IPv4 address"</span><span class="o">);</span></span>
<span id="LC3462" class="line" lang="java">                    <span class="n">ipv6byteCount</span> <span class="o">+=</span> <span class="mi">4</span><span class="o">;</span></span>
<span id="LC3463" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3464" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">"::"</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3465" class="line" lang="java">                <span class="n">compressedZeros</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC3466" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">scanHexPost</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">2</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3467" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3468" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3469" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"Malformed IPv6 address"</span><span class="o">,</span> <span class="n">start</span><span class="o">);</span></span>
<span id="LC3470" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">ipv6byteCount</span> <span class="o">&gt;</span> <span class="mi">16</span><span class="o">)</span></span>
<span id="LC3471" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"IPv6 address too long"</span><span class="o">,</span> <span class="n">start</span><span class="o">);</span></span>
<span id="LC3472" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">compressedZeros</span> <span class="o">&amp;&amp;</span> <span class="n">ipv6byteCount</span> <span class="o">&lt;</span> <span class="mi">16</span><span class="o">)</span></span>
<span id="LC3473" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"IPv6 address too short"</span><span class="o">,</span> <span class="n">start</span><span class="o">);</span></span>
<span id="LC3474" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">compressedZeros</span> <span class="o">&amp;&amp;</span> <span class="n">ipv6byteCount</span> <span class="o">==</span> <span class="mi">16</span><span class="o">)</span></span>
<span id="LC3475" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"Malformed IPv6 address"</span><span class="o">,</span> <span class="n">start</span><span class="o">);</span></span>
<span id="LC3476" class="line" lang="java"></span>
<span id="LC3477" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3478" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3479" class="line" lang="java"></span>
<span id="LC3480" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">scanHexPost</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3481" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3482" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3483" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3484" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3485" class="line" lang="java"></span>
<span id="LC3486" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">p</span> <span class="o">==</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3487" class="line" lang="java">                <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3488" class="line" lang="java"></span>
<span id="LC3489" class="line" lang="java">            <span class="n">q</span> <span class="o">=</span> <span class="n">scanHexSeq</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC3490" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3491" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3492" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">':'</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC3493" class="line" lang="java">                    <span class="n">p</span><span class="o">++;</span></span>
<span id="LC3494" class="line" lang="java">                    <span class="n">p</span> <span class="o">=</span> <span class="n">takeIPv4Address</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">"hex digits or IPv4 address"</span><span class="o">);</span></span>
<span id="LC3495" class="line" lang="java">                    <span class="n">ipv6byteCount</span> <span class="o">+=</span> <span class="mi">4</span><span class="o">;</span></span>
<span id="LC3496" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3497" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC3498" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">takeIPv4Address</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="s">"hex digits or IPv4 address"</span><span class="o">);</span></span>
<span id="LC3499" class="line" lang="java">                <span class="n">ipv6byteCount</span> <span class="o">+=</span> <span class="mi">4</span><span class="o">;</span></span>
<span id="LC3500" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3501" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3502" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3503" class="line" lang="java"></span>
<span id="LC3504" class="line" lang="java">        <span class="c1">// Scan a hex sequence; return -1 if one could not be scanned</span></span>
<span id="LC3505" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC3506" class="line" lang="java">        <span class="kd">private</span> <span class="kt">int</span> <span class="nf">scanHexSeq</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">)</span></span>
<span id="LC3507" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">URISyntaxException</span></span>
<span id="LC3508" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC3509" class="line" lang="java">            <span class="kt">int</span> <span class="n">p</span> <span class="o">=</span> <span class="n">start</span><span class="o">;</span></span>
<span id="LC3510" class="line" lang="java">            <span class="kt">int</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3511" class="line" lang="java"></span>
<span id="LC3512" class="line" lang="java">            <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_HEX</span><span class="o">,</span> <span class="no">H_HEX</span><span class="o">);</span></span>
<span id="LC3513" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC3514" class="line" lang="java">                <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC3515" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">q</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'.'</span><span class="o">))</span>          <span class="c1">// Beginning of IPv4 address</span></span>
<span id="LC3516" class="line" lang="java">                <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC3517" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span> <span class="o">+</span> <span class="mi">4</span><span class="o">)</span></span>
<span id="LC3518" class="line" lang="java">                <span class="n">fail</span><span class="o">(</span><span class="s">"IPv6 hexadecimal digit sequence too long"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3519" class="line" lang="java">            <span class="n">ipv6byteCount</span> <span class="o">+=</span> <span class="mi">2</span><span class="o">;</span></span>
<span id="LC3520" class="line" lang="java">            <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3521" class="line" lang="java">            <span class="k">while</span> <span class="o">(</span><span class="n">p</span> <span class="o">&lt;</span> <span class="n">n</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3522" class="line" lang="java">                <span class="k">if</span> <span class="o">(!</span><span class="n">at</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">':'</span><span class="o">))</span></span>
<span id="LC3523" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC3524" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">p</span> <span class="o">+</span> <span class="mi">1</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">':'</span><span class="o">))</span></span>
<span id="LC3525" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span>              <span class="c1">// "::"</span></span>
<span id="LC3526" class="line" lang="java">                <span class="n">p</span><span class="o">++;</span></span>
<span id="LC3527" class="line" lang="java">                <span class="n">q</span> <span class="o">=</span> <span class="n">scan</span><span class="o">(</span><span class="n">p</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="no">L_HEX</span><span class="o">,</span> <span class="no">H_HEX</span><span class="o">);</span></span>
<span id="LC3528" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&lt;=</span> <span class="n">p</span><span class="o">)</span></span>
<span id="LC3529" class="line" lang="java">                    <span class="n">failExpecting</span><span class="o">(</span><span class="s">"digits for an IPv6 address"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3530" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">at</span><span class="o">(</span><span class="n">q</span><span class="o">,</span> <span class="n">n</span><span class="o">,</span> <span class="sc">'.'</span><span class="o">))</span> <span class="o">{</span>    <span class="c1">// Beginning of IPv4 address</span></span>
<span id="LC3531" class="line" lang="java">                    <span class="n">p</span><span class="o">--;</span></span>
<span id="LC3532" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC3533" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3534" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">q</span> <span class="o">&gt;</span> <span class="n">p</span> <span class="o">+</span> <span class="mi">4</span><span class="o">)</span></span>
<span id="LC3535" class="line" lang="java">                    <span class="n">fail</span><span class="o">(</span><span class="s">"IPv6 hexadecimal digit sequence too long"</span><span class="o">,</span> <span class="n">p</span><span class="o">);</span></span>
<span id="LC3536" class="line" lang="java">                <span class="n">ipv6byteCount</span> <span class="o">+=</span> <span class="mi">2</span><span class="o">;</span></span>
<span id="LC3537" class="line" lang="java">                <span class="n">p</span> <span class="o">=</span> <span class="n">q</span><span class="o">;</span></span>
<span id="LC3538" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3539" class="line" lang="java"></span>
<span id="LC3540" class="line" lang="java">            <span class="k">return</span> <span class="n">p</span><span class="o">;</span></span>
<span id="LC3541" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3542" class="line" lang="java"></span>
<span id="LC3543" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC3544" class="line" lang="java"></span>
<span id="LC3545" class="line" lang="java"><span class="o">}</span></span>
