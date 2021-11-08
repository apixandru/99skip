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
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 1997, 2015, Oracle and/or its affiliates. All rights reserved.</span></span>
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
<span id="LC25" class="line" lang="java"><span class="kn">package</span> <span class="nn">javax.swing</span><span class="o">;</span></span>
<span id="LC26" class="line" lang="java"></span>
<span id="LC27" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.awt.*</span><span class="o">;</span></span>
<span id="LC28" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.awt.event.*</span><span class="o">;</span></span>
<span id="LC29" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.awt.image.*</span><span class="o">;</span></span>
<span id="LC30" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.text.*</span><span class="o">;</span></span>
<span id="LC31" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.awt.geom.*</span><span class="o">;</span></span>
<span id="LC32" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.beans.PropertyChangeEvent</span><span class="o">;</span></span>
<span id="LC33" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.beans.PropertyChangeListener</span><span class="o">;</span></span>
<span id="LC34" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.beans.Transient</span><span class="o">;</span></span>
<span id="LC35" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.Enumeration</span><span class="o">;</span></span>
<span id="LC36" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.Vector</span><span class="o">;</span></span>
<span id="LC37" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.io.Serializable</span><span class="o">;</span></span>
<span id="LC38" class="line" lang="java"><span class="kn">import</span> <span class="nn">javax.swing.event.*</span><span class="o">;</span></span>
<span id="LC39" class="line" lang="java"><span class="kn">import</span> <span class="nn">javax.swing.border.*</span><span class="o">;</span></span>
<span id="LC40" class="line" lang="java"><span class="kn">import</span> <span class="nn">javax.swing.plaf.*</span><span class="o">;</span></span>
<span id="LC41" class="line" lang="java"><span class="kn">import</span> <span class="nn">javax.accessibility.*</span><span class="o">;</span></span>
<span id="LC42" class="line" lang="java"><span class="kn">import</span> <span class="nn">javax.swing.text.*</span><span class="o">;</span></span>
<span id="LC43" class="line" lang="java"><span class="kn">import</span> <span class="nn">javax.swing.text.html.*</span><span class="o">;</span></span>
<span id="LC44" class="line" lang="java"><span class="kn">import</span> <span class="nn">javax.swing.plaf.basic.*</span><span class="o">;</span></span>
<span id="LC45" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.*</span><span class="o">;</span></span>
<span id="LC46" class="line" lang="java"></span>
<span id="LC47" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> * Defines common behaviors for buttons and menu items.</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> * Buttons can be configured, and to some degree controlled, by</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> * &lt;code&gt;&lt;a href="Action.html"&gt;Action&lt;/a&gt;&lt;/code&gt;s.  Using an</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> * &lt;code&gt;Action&lt;/code&gt; with a button has many benefits beyond directly</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> * configuring a button.  Refer to &lt;a href="Action.html#buttonActions"&gt;</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> * Swing Components Supporting &lt;code&gt;Action&lt;/code&gt;&lt;/a&gt; for more</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> * details, and you can find more information in &lt;a</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> * href="https://docs.oracle.com/javase/tutorial/uiswing/misc/action.html"&gt;How</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> * to Use Actions&lt;/a&gt;, a section in &lt;em&gt;The Java Tutorial&lt;/em&gt;.</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> * For further information see</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> * &lt;a</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> href="https://docs.oracle.com/javase/tutorial/uiswing/components/button.html"&gt;How to Use Buttons, Check Boxes, and Radio Buttons&lt;/a&gt;,</span></span>
<span id="LC62" class="line" lang="java"><span class="cm"> * a section in &lt;em&gt;The Java Tutorial&lt;/em&gt;.</span></span>
<span id="LC63" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC64" class="line" lang="java"><span class="cm"> * &lt;strong&gt;Warning:&lt;/strong&gt;</span></span>
<span id="LC65" class="line" lang="java"><span class="cm"> * Serialized objects of this class will not be compatible with</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> * future Swing releases. The current serialization support is</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> * appropriate for short term storage or RMI between applications running</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> * the same version of Swing.  As of 1.4, support for long term storage</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> * of all JavaBeans&amp;trade;</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> * has been added to the &lt;code&gt;java.beans&lt;/code&gt; package.</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> * Please see {@link java.beans.XMLEncoder}.</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> * @author Jeff Dinkins</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC75" class="line" lang="java"><span class="kd">public</span> <span class="kd">abstract</span> <span class="kd">class</span> <span class="nc">AbstractButton</span> <span class="kd">extends</span> <span class="nc">JComponent</span> <span class="kd">implements</span> <span class="nc">ItemSelectable</span><span class="o">,</span> <span class="nc">SwingConstants</span> <span class="o">{</span></span>
<span id="LC76" class="line" lang="java"></span>
<span id="LC77" class="line" lang="java">    <span class="c1">// *********************************</span></span>
<span id="LC78" class="line" lang="java">    <span class="c1">// ******* Button properties *******</span></span>
<span id="LC79" class="line" lang="java">    <span class="c1">// *********************************</span></span>
<span id="LC80" class="line" lang="java"></span>
<span id="LC81" class="line" lang="java">    <span class="cm">/** Identifies a change in the button model. */</span></span>
<span id="LC82" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">MODEL_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"model"</span><span class="o">;</span></span>
<span id="LC83" class="line" lang="java">    <span class="cm">/** Identifies a change in the button's text. */</span></span>
<span id="LC84" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">TEXT_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"text"</span><span class="o">;</span></span>
<span id="LC85" class="line" lang="java">    <span class="cm">/** Identifies a change to the button's mnemonic. */</span></span>
<span id="LC86" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">MNEMONIC_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"mnemonic"</span><span class="o">;</span></span>
<span id="LC87" class="line" lang="java"></span>
<span id="LC88" class="line" lang="java">    <span class="c1">// Text positioning and alignment</span></span>
<span id="LC89" class="line" lang="java">    <span class="cm">/** Identifies a change in the button's margins. */</span></span>
<span id="LC90" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">MARGIN_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"margin"</span><span class="o">;</span></span>
<span id="LC91" class="line" lang="java">    <span class="cm">/** Identifies a change in the button's vertical alignment. */</span></span>
<span id="LC92" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">VERTICAL_ALIGNMENT_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"verticalAlignment"</span><span class="o">;</span></span>
<span id="LC93" class="line" lang="java">    <span class="cm">/** Identifies a change in the button's horizontal alignment. */</span></span>
<span id="LC94" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">HORIZONTAL_ALIGNMENT_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"horizontalAlignment"</span><span class="o">;</span></span>
<span id="LC95" class="line" lang="java"></span>
<span id="LC96" class="line" lang="java">    <span class="cm">/** Identifies a change in the button's vertical text position. */</span></span>
<span id="LC97" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">VERTICAL_TEXT_POSITION_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"verticalTextPosition"</span><span class="o">;</span></span>
<span id="LC98" class="line" lang="java">    <span class="cm">/** Identifies a change in the button's horizontal text position. */</span></span>
<span id="LC99" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">HORIZONTAL_TEXT_POSITION_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"horizontalTextPosition"</span><span class="o">;</span></span>
<span id="LC100" class="line" lang="java"></span>
<span id="LC101" class="line" lang="java">    <span class="c1">// Paint options</span></span>
<span id="LC102" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC103" class="line" lang="java"><span class="cm">     * Identifies a change to having the border drawn,</span></span>
<span id="LC104" class="line" lang="java"><span class="cm">     * or having it not drawn.</span></span>
<span id="LC105" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC106" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">BORDER_PAINTED_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"borderPainted"</span><span class="o">;</span></span>
<span id="LC107" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC108" class="line" lang="java"><span class="cm">     * Identifies a change to having the border highlighted when focused,</span></span>
<span id="LC109" class="line" lang="java"><span class="cm">     * or not.</span></span>
<span id="LC110" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC111" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">FOCUS_PAINTED_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"focusPainted"</span><span class="o">;</span></span>
<span id="LC112" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC113" class="line" lang="java"><span class="cm">     * Identifies a change from rollover enabled to disabled or back</span></span>
<span id="LC114" class="line" lang="java"><span class="cm">     * to enabled.</span></span>
<span id="LC115" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC116" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ROLLOVER_ENABLED_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"rolloverEnabled"</span><span class="o">;</span></span>
<span id="LC117" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC118" class="line" lang="java"><span class="cm">     * Identifies a change to having the button paint the content area.</span></span>
<span id="LC119" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC120" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">CONTENT_AREA_FILLED_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"contentAreaFilled"</span><span class="o">;</span></span>
<span id="LC121" class="line" lang="java"></span>
<span id="LC122" class="line" lang="java">    <span class="c1">// Icons</span></span>
<span id="LC123" class="line" lang="java">    <span class="cm">/** Identifies a change to the icon that represents the button. */</span></span>
<span id="LC124" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ICON_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"icon"</span><span class="o">;</span></span>
<span id="LC125" class="line" lang="java"></span>
<span id="LC126" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC127" class="line" lang="java"><span class="cm">     * Identifies a change to the icon used when the button has been</span></span>
<span id="LC128" class="line" lang="java"><span class="cm">     * pressed.</span></span>
<span id="LC129" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC130" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">PRESSED_ICON_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"pressedIcon"</span><span class="o">;</span></span>
<span id="LC131" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC132" class="line" lang="java"><span class="cm">     * Identifies a change to the icon used when the button has</span></span>
<span id="LC133" class="line" lang="java"><span class="cm">     * been selected.</span></span>
<span id="LC134" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC135" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">SELECTED_ICON_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"selectedIcon"</span><span class="o">;</span></span>
<span id="LC136" class="line" lang="java"></span>
<span id="LC137" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC138" class="line" lang="java"><span class="cm">     * Identifies a change to the icon used when the cursor is over</span></span>
<span id="LC139" class="line" lang="java"><span class="cm">     * the button.</span></span>
<span id="LC140" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC141" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ROLLOVER_ICON_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"rolloverIcon"</span><span class="o">;</span></span>
<span id="LC142" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC143" class="line" lang="java"><span class="cm">     * Identifies a change to the icon used when the cursor is</span></span>
<span id="LC144" class="line" lang="java"><span class="cm">     * over the button and it has been selected.</span></span>
<span id="LC145" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC146" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ROLLOVER_SELECTED_ICON_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"rolloverSelectedIcon"</span><span class="o">;</span></span>
<span id="LC147" class="line" lang="java"></span>
<span id="LC148" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC149" class="line" lang="java"><span class="cm">     * Identifies a change to the icon used when the button has</span></span>
<span id="LC150" class="line" lang="java"><span class="cm">     * been disabled.</span></span>
<span id="LC151" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC152" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">DISABLED_ICON_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"disabledIcon"</span><span class="o">;</span></span>
<span id="LC153" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC154" class="line" lang="java"><span class="cm">     * Identifies a change to the icon used when the button has been</span></span>
<span id="LC155" class="line" lang="java"><span class="cm">     * disabled and selected.</span></span>
<span id="LC156" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC157" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">DISABLED_SELECTED_ICON_CHANGED_PROPERTY</span> <span class="o">=</span> <span class="s">"disabledSelectedIcon"</span><span class="o">;</span></span>
<span id="LC158" class="line" lang="java"></span>
<span id="LC159" class="line" lang="java"></span>
<span id="LC160" class="line" lang="java">    <span class="cm">/** The data model that determines the button's state. */</span></span>
<span id="LC161" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">ButtonModel</span> <span class="n">model</span>                <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC162" class="line" lang="java"></span>
<span id="LC163" class="line" lang="java">    <span class="kd">private</span> <span class="nc">String</span>     <span class="n">text</span>                    <span class="o">=</span> <span class="s">""</span><span class="o">;</span> <span class="c1">// for BeanBox</span></span>
<span id="LC164" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Insets</span>     <span class="n">margin</span>                  <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC165" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Insets</span>     <span class="n">defaultMargin</span>           <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC166" class="line" lang="java"></span>
<span id="LC167" class="line" lang="java">    <span class="c1">// Button icons</span></span>
<span id="LC168" class="line" lang="java">    <span class="c1">// PENDING(jeff) - hold icons in an array</span></span>
<span id="LC169" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Icon</span>       <span class="n">defaultIcon</span>             <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC170" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Icon</span>       <span class="n">pressedIcon</span>             <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC171" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Icon</span>       <span class="n">disabledIcon</span>            <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC172" class="line" lang="java"></span>
<span id="LC173" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Icon</span>       <span class="n">selectedIcon</span>            <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC174" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Icon</span>       <span class="n">disabledSelectedIcon</span>    <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC175" class="line" lang="java"></span>
<span id="LC176" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Icon</span>       <span class="n">rolloverIcon</span>            <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC177" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Icon</span>       <span class="n">rolloverSelectedIcon</span>    <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC178" class="line" lang="java"></span>
<span id="LC179" class="line" lang="java">    <span class="c1">// Display properties</span></span>
<span id="LC180" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span>    <span class="n">paintBorder</span>             <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC181" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span>    <span class="n">paintFocus</span>              <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC182" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span>    <span class="n">rolloverEnabled</span>         <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC183" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span>    <span class="n">contentAreaFilled</span>         <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC184" class="line" lang="java"></span>
<span id="LC185" class="line" lang="java">    <span class="c1">// Icon/Label Alignment</span></span>
<span id="LC186" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span>        <span class="n">verticalAlignment</span>       <span class="o">=</span> <span class="no">CENTER</span><span class="o">;</span></span>
<span id="LC187" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span>        <span class="n">horizontalAlignment</span>     <span class="o">=</span> <span class="no">CENTER</span><span class="o">;</span></span>
<span id="LC188" class="line" lang="java"></span>
<span id="LC189" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span>        <span class="n">verticalTextPosition</span>    <span class="o">=</span> <span class="no">CENTER</span><span class="o">;</span></span>
<span id="LC190" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span>        <span class="n">horizontalTextPosition</span>  <span class="o">=</span> <span class="no">TRAILING</span><span class="o">;</span></span>
<span id="LC191" class="line" lang="java"></span>
<span id="LC192" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span>        <span class="n">iconTextGap</span>             <span class="o">=</span> <span class="mi">4</span><span class="o">;</span></span>
<span id="LC193" class="line" lang="java"></span>
<span id="LC194" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span>        <span class="n">mnemonic</span><span class="o">;</span></span>
<span id="LC195" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span>        <span class="n">mnemonicIndex</span>           <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC196" class="line" lang="java"></span>
<span id="LC197" class="line" lang="java">    <span class="kd">private</span> <span class="kt">long</span>       <span class="n">multiClickThreshhold</span>    <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC198" class="line" lang="java"></span>
<span id="LC199" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span>    <span class="n">borderPaintedSet</span>        <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC200" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span>    <span class="n">rolloverEnabledSet</span>      <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC201" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span>    <span class="n">iconTextGapSet</span>          <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC202" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span>    <span class="n">contentAreaFilledSet</span>    <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC203" class="line" lang="java"></span>
<span id="LC204" class="line" lang="java">    <span class="c1">// Whether or not we've set the LayoutManager.</span></span>
<span id="LC205" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span> <span class="n">setLayout</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC206" class="line" lang="java"></span>
<span id="LC207" class="line" lang="java">    <span class="c1">// This is only used by JButton, promoted to avoid an extra</span></span>
<span id="LC208" class="line" lang="java">    <span class="c1">// boolean field in JButton</span></span>
<span id="LC209" class="line" lang="java">    <span class="kt">boolean</span> <span class="n">defaultCapable</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC210" class="line" lang="java"></span>
<span id="LC211" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC212" class="line" lang="java"><span class="cm">     * Combined listeners: ActionListener, ChangeListener, ItemListener.</span></span>
<span id="LC213" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC214" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Handler</span> <span class="n">handler</span><span class="o">;</span></span>
<span id="LC215" class="line" lang="java"></span>
<span id="LC216" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC217" class="line" lang="java"><span class="cm">     * The button model's &lt;code&gt;changeListener&lt;/code&gt;.</span></span>
<span id="LC218" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC219" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">ChangeListener</span> <span class="n">changeListener</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC220" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC221" class="line" lang="java"><span class="cm">     * The button model's &lt;code&gt;ActionListener&lt;/code&gt;.</span></span>
<span id="LC222" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC223" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">ActionListener</span> <span class="n">actionListener</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC224" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC225" class="line" lang="java"><span class="cm">     * The button model's &lt;code&gt;ItemListener&lt;/code&gt;.</span></span>
<span id="LC226" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC227" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">ItemListener</span> <span class="n">itemListener</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC228" class="line" lang="java"></span>
<span id="LC229" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC230" class="line" lang="java"><span class="cm">     * Only one &lt;code&gt;ChangeEvent&lt;/code&gt; is needed per button</span></span>
<span id="LC231" class="line" lang="java"><span class="cm">     * instance since the</span></span>
<span id="LC232" class="line" lang="java"><span class="cm">     * event's only state is the source property.  The source of events</span></span>
<span id="LC233" class="line" lang="java"><span class="cm">     * generated is always "this".</span></span>
<span id="LC234" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC235" class="line" lang="java">    <span class="kd">protected</span> <span class="kd">transient</span> <span class="nc">ChangeEvent</span> <span class="n">changeEvent</span><span class="o">;</span></span>
<span id="LC236" class="line" lang="java"></span>
<span id="LC237" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span> <span class="n">hideActionText</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC238" class="line" lang="java"></span>
<span id="LC239" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC240" class="line" lang="java"><span class="cm">     * Sets the &lt;code&gt;hideActionText&lt;/code&gt; property, which determines</span></span>
<span id="LC241" class="line" lang="java"><span class="cm">     * whether the button displays text from the &lt;code&gt;Action&lt;/code&gt;.</span></span>
<span id="LC242" class="line" lang="java"><span class="cm">     * This is useful only if an &lt;code&gt;Action&lt;/code&gt; has been</span></span>
<span id="LC243" class="line" lang="java"><span class="cm">     * installed on the button.</span></span>
<span id="LC244" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC245" class="line" lang="java"><span class="cm">     * @param hideActionText &lt;code&gt;true&lt;/code&gt; if the button's</span></span>
<span id="LC246" class="line" lang="java"><span class="cm">     *                       &lt;code&gt;text&lt;/code&gt; property should not reflect</span></span>
<span id="LC247" class="line" lang="java"><span class="cm">     *                       that of the &lt;code&gt;Action&lt;/code&gt;; the default is</span></span>
<span id="LC248" class="line" lang="java"><span class="cm">     *                       &lt;code&gt;false&lt;/code&gt;</span></span>
<span id="LC249" class="line" lang="java"><span class="cm">     * @see &lt;a href="Action.html#buttonActions"&gt;Swing Components Supporting</span></span>
<span id="LC250" class="line" lang="java"><span class="cm">     *      &lt;code&gt;Action&lt;/code&gt;&lt;/a&gt;</span></span>
<span id="LC251" class="line" lang="java"><span class="cm">     * @since 1.6</span></span>
<span id="LC252" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC253" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC254" class="line" lang="java"><span class="cm">     *    expert: true</span></span>
<span id="LC255" class="line" lang="java"><span class="cm">     *  description: Whether the text of the button should come from</span></span>
<span id="LC256" class="line" lang="java"><span class="cm">     *               the &lt;code&gt;Action&lt;/code&gt;.</span></span>
<span id="LC257" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC258" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setHideActionText</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">hideActionText</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC259" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">hideActionText</span> <span class="o">!=</span> <span class="k">this</span><span class="o">.</span><span class="na">hideActionText</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC260" class="line" lang="java">            <span class="k">this</span><span class="o">.</span><span class="na">hideActionText</span> <span class="o">=</span> <span class="n">hideActionText</span><span class="o">;</span></span>
<span id="LC261" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">getAction</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC262" class="line" lang="java">                <span class="n">setTextFromAction</span><span class="o">(</span><span class="n">getAction</span><span class="o">(),</span> <span class="kc">false</span><span class="o">);</span></span>
<span id="LC263" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC264" class="line" lang="java">            <span class="n">firePropertyChange</span><span class="o">(</span><span class="s">"hideActionText"</span><span class="o">,</span> <span class="o">!</span><span class="n">hideActionText</span><span class="o">,</span></span>
<span id="LC265" class="line" lang="java">                               <span class="n">hideActionText</span><span class="o">);</span></span>
<span id="LC266" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC267" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC268" class="line" lang="java"></span>
<span id="LC269" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC270" class="line" lang="java"><span class="cm">     * Returns the value of the &lt;code&gt;hideActionText&lt;/code&gt; property, which</span></span>
<span id="LC271" class="line" lang="java"><span class="cm">     * determines whether the button displays text from the</span></span>
<span id="LC272" class="line" lang="java"><span class="cm">     * &lt;code&gt;Action&lt;/code&gt;.  This is useful only if an &lt;code&gt;Action&lt;/code&gt;</span></span>
<span id="LC273" class="line" lang="java"><span class="cm">     * has been installed on the button.</span></span>
<span id="LC274" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC275" class="line" lang="java"><span class="cm">     * @return &lt;code&gt;true&lt;/code&gt; if the button's &lt;code&gt;text&lt;/code&gt;</span></span>
<span id="LC276" class="line" lang="java"><span class="cm">     *         property should not reflect that of the</span></span>
<span id="LC277" class="line" lang="java"><span class="cm">     *         &lt;code&gt;Action&lt;/code&gt;; the default is &lt;code&gt;false&lt;/code&gt;</span></span>
<span id="LC278" class="line" lang="java"><span class="cm">     * @since 1.6</span></span>
<span id="LC279" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC280" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">getHideActionText</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC281" class="line" lang="java">        <span class="k">return</span> <span class="n">hideActionText</span><span class="o">;</span></span>
<span id="LC282" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC283" class="line" lang="java"></span>
<span id="LC284" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC285" class="line" lang="java"><span class="cm">     * Returns the button's text.</span></span>
<span id="LC286" class="line" lang="java"><span class="cm">     * @return the buttons text</span></span>
<span id="LC287" class="line" lang="java"><span class="cm">     * @see #setText</span></span>
<span id="LC288" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC289" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getText</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC290" class="line" lang="java">        <span class="k">return</span> <span class="n">text</span><span class="o">;</span></span>
<span id="LC291" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC292" class="line" lang="java"></span>
<span id="LC293" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC294" class="line" lang="java"><span class="cm">     * Sets the button's text.</span></span>
<span id="LC295" class="line" lang="java"><span class="cm">     * @param text the string used to set the text</span></span>
<span id="LC296" class="line" lang="java"><span class="cm">     * @see #getText</span></span>
<span id="LC297" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC298" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC299" class="line" lang="java"><span class="cm">     *    preferred: true</span></span>
<span id="LC300" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC301" class="line" lang="java"><span class="cm">     *  description: The button's text.</span></span>
<span id="LC302" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC303" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setText</span><span class="o">(</span><span class="nc">String</span> <span class="n">text</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC304" class="line" lang="java">        <span class="nc">String</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">text</span><span class="o">;</span></span>
<span id="LC305" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">text</span> <span class="o">=</span> <span class="n">text</span><span class="o">;</span></span>
<span id="LC306" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">TEXT_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">text</span><span class="o">);</span></span>
<span id="LC307" class="line" lang="java">        <span class="n">updateDisplayedMnemonicIndex</span><span class="o">(</span><span class="n">text</span><span class="o">,</span> <span class="n">getMnemonic</span><span class="o">());</span></span>
<span id="LC308" class="line" lang="java"></span>
<span id="LC309" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC310" class="line" lang="java">            <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC311" class="line" lang="java">                <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VISIBLE_DATA_PROPERTY</span><span class="o">,</span></span>
<span id="LC312" class="line" lang="java">                <span class="n">oldValue</span><span class="o">,</span> <span class="n">text</span><span class="o">);</span></span>
<span id="LC313" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC314" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">text</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">oldValue</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="o">!</span><span class="n">text</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">oldValue</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC315" class="line" lang="java">            <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC316" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC317" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC318" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC319" class="line" lang="java"></span>
<span id="LC320" class="line" lang="java"></span>
<span id="LC321" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC322" class="line" lang="java"><span class="cm">     * Returns the state of the button. True if the</span></span>
<span id="LC323" class="line" lang="java"><span class="cm">     * toggle button is selected, false if it's not.</span></span>
<span id="LC324" class="line" lang="java"><span class="cm">     * @return true if the toggle button is selected, otherwise false</span></span>
<span id="LC325" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC326" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isSelected</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC327" class="line" lang="java">        <span class="k">return</span> <span class="n">model</span><span class="o">.</span><span class="na">isSelected</span><span class="o">();</span></span>
<span id="LC328" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC329" class="line" lang="java"></span>
<span id="LC330" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC331" class="line" lang="java"><span class="cm">     * Sets the state of the button. Note that this method does not</span></span>
<span id="LC332" class="line" lang="java"><span class="cm">     * trigger an &lt;code&gt;actionEvent&lt;/code&gt;.</span></span>
<span id="LC333" class="line" lang="java"><span class="cm">     * Call &lt;code&gt;doClick&lt;/code&gt; to perform a programmatic action change.</span></span>
<span id="LC334" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC335" class="line" lang="java"><span class="cm">     * @param b  true if the button is selected, otherwise false</span></span>
<span id="LC336" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC337" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setSelected</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">b</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC338" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">isSelected</span><span class="o">();</span></span>
<span id="LC339" class="line" lang="java"></span>
<span id="LC340" class="line" lang="java">        <span class="c1">// TIGER - 4840653</span></span>
<span id="LC341" class="line" lang="java">        <span class="c1">// Removed code which fired an AccessibleState.SELECTED</span></span>
<span id="LC342" class="line" lang="java">        <span class="c1">// PropertyChangeEvent since this resulted in two</span></span>
<span id="LC343" class="line" lang="java">        <span class="c1">// identical events being fired since</span></span>
<span id="LC344" class="line" lang="java">        <span class="c1">// AbstractButton.fireItemStateChanged also fires the</span></span>
<span id="LC345" class="line" lang="java">        <span class="c1">// same event. This caused screen readers to speak the</span></span>
<span id="LC346" class="line" lang="java">        <span class="c1">// name of the item twice.</span></span>
<span id="LC347" class="line" lang="java"></span>
<span id="LC348" class="line" lang="java">        <span class="n">model</span><span class="o">.</span><span class="na">setSelected</span><span class="o">(</span><span class="n">b</span><span class="o">);</span></span>
<span id="LC349" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC350" class="line" lang="java"></span>
<span id="LC351" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC352" class="line" lang="java"><span class="cm">     * Programmatically perform a "click". This does the same</span></span>
<span id="LC353" class="line" lang="java"><span class="cm">     * thing as if the user had pressed and released the button.</span></span>
<span id="LC354" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC355" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">doClick</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC356" class="line" lang="java">        <span class="n">doClick</span><span class="o">(</span><span class="mi">68</span><span class="o">);</span></span>
<span id="LC357" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC358" class="line" lang="java"></span>
<span id="LC359" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC360" class="line" lang="java"><span class="cm">     * Programmatically perform a "click". This does the same</span></span>
<span id="LC361" class="line" lang="java"><span class="cm">     * thing as if the user had pressed and released the button.</span></span>
<span id="LC362" class="line" lang="java"><span class="cm">     * The button stays visually "pressed" for &lt;code&gt;pressTime&lt;/code&gt;</span></span>
<span id="LC363" class="line" lang="java"><span class="cm">     *  milliseconds.</span></span>
<span id="LC364" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC365" class="line" lang="java"><span class="cm">     * @param pressTime the time to "hold down" the button, in milliseconds</span></span>
<span id="LC366" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC367" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">doClick</span><span class="o">(</span><span class="kt">int</span> <span class="n">pressTime</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC368" class="line" lang="java">        <span class="nc">Dimension</span> <span class="n">size</span> <span class="o">=</span> <span class="n">getSize</span><span class="o">();</span></span>
<span id="LC369" class="line" lang="java">        <span class="n">model</span><span class="o">.</span><span class="na">setArmed</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></span>
<span id="LC370" class="line" lang="java">        <span class="n">model</span><span class="o">.</span><span class="na">setPressed</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></span>
<span id="LC371" class="line" lang="java">        <span class="n">paintImmediately</span><span class="o">(</span><span class="k">new</span> <span class="nc">Rectangle</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span><span class="mi">0</span><span class="o">,</span> <span class="n">size</span><span class="o">.</span><span class="na">width</span><span class="o">,</span> <span class="n">size</span><span class="o">.</span><span class="na">height</span><span class="o">));</span></span>
<span id="LC372" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC373" class="line" lang="java">            <span class="nc">Thread</span><span class="o">.</span><span class="na">currentThread</span><span class="o">().</span><span class="na">sleep</span><span class="o">(</span><span class="n">pressTime</span><span class="o">);</span></span>
<span id="LC374" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span><span class="o">(</span><span class="nc">InterruptedException</span> <span class="n">ie</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC375" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC376" class="line" lang="java">        <span class="n">model</span><span class="o">.</span><span class="na">setPressed</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC377" class="line" lang="java">        <span class="n">model</span><span class="o">.</span><span class="na">setArmed</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC378" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC379" class="line" lang="java"></span>
<span id="LC380" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC381" class="line" lang="java"><span class="cm">     * Sets space for margin between the button's border and</span></span>
<span id="LC382" class="line" lang="java"><span class="cm">     * the label. Setting to &lt;code&gt;null&lt;/code&gt; will cause the button to</span></span>
<span id="LC383" class="line" lang="java"><span class="cm">     * use the default margin.  The button's default &lt;code&gt;Border&lt;/code&gt;</span></span>
<span id="LC384" class="line" lang="java"><span class="cm">     * object will use this value to create the proper margin.</span></span>
<span id="LC385" class="line" lang="java"><span class="cm">     * However, if a non-default border is set on the button,</span></span>
<span id="LC386" class="line" lang="java"><span class="cm">     * it is that &lt;code&gt;Border&lt;/code&gt; object's responsibility to create the</span></span>
<span id="LC387" class="line" lang="java"><span class="cm">     * appropriate margin space (else this property will</span></span>
<span id="LC388" class="line" lang="java"><span class="cm">     * effectively be ignored).</span></span>
<span id="LC389" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC390" class="line" lang="java"><span class="cm">     * @param m the space between the border and the label</span></span>
<span id="LC391" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC392" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC393" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC394" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC395" class="line" lang="java"><span class="cm">     *  description: The space between the button's border and the label.</span></span>
<span id="LC396" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC397" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setMargin</span><span class="o">(</span><span class="nc">Insets</span> <span class="n">m</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC398" class="line" lang="java">        <span class="c1">// Cache the old margin if it comes from the UI</span></span>
<span id="LC399" class="line" lang="java">        <span class="k">if</span><span class="o">(</span><span class="n">m</span> <span class="k">instanceof</span> <span class="nc">UIResource</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC400" class="line" lang="java">            <span class="n">defaultMargin</span> <span class="o">=</span> <span class="n">m</span><span class="o">;</span></span>
<span id="LC401" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span><span class="o">(</span><span class="n">margin</span> <span class="k">instanceof</span> <span class="nc">UIResource</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC402" class="line" lang="java">            <span class="n">defaultMargin</span> <span class="o">=</span> <span class="n">margin</span><span class="o">;</span></span>
<span id="LC403" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC404" class="line" lang="java"></span>
<span id="LC405" class="line" lang="java">        <span class="c1">// If the client passes in a null insets, restore the margin</span></span>
<span id="LC406" class="line" lang="java">        <span class="c1">// from the UI if possible</span></span>
<span id="LC407" class="line" lang="java">        <span class="k">if</span><span class="o">(</span><span class="n">m</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">defaultMargin</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC408" class="line" lang="java">            <span class="n">m</span> <span class="o">=</span> <span class="n">defaultMargin</span><span class="o">;</span></span>
<span id="LC409" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC410" class="line" lang="java"></span>
<span id="LC411" class="line" lang="java">        <span class="nc">Insets</span> <span class="n">old</span> <span class="o">=</span> <span class="n">margin</span><span class="o">;</span></span>
<span id="LC412" class="line" lang="java">        <span class="n">margin</span> <span class="o">=</span> <span class="n">m</span><span class="o">;</span></span>
<span id="LC413" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">MARGIN_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">old</span><span class="o">,</span> <span class="n">m</span><span class="o">);</span></span>
<span id="LC414" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">old</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="o">!</span><span class="n">old</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">m</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC415" class="line" lang="java">            <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC416" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC417" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC418" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC419" class="line" lang="java"></span>
<span id="LC420" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC421" class="line" lang="java"><span class="cm">     * Returns the margin between the button's border and</span></span>
<span id="LC422" class="line" lang="java"><span class="cm">     * the label.</span></span>
<span id="LC423" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC424" class="line" lang="java"><span class="cm">     * @return an &lt;code&gt;Insets&lt;/code&gt; object specifying the margin</span></span>
<span id="LC425" class="line" lang="java"><span class="cm">     *          between the botton's border and the label</span></span>
<span id="LC426" class="line" lang="java"><span class="cm">     * @see #setMargin</span></span>
<span id="LC427" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC428" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Insets</span> <span class="nf">getMargin</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC429" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="n">margin</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span> <span class="kc">null</span> <span class="o">:</span> <span class="o">(</span><span class="nc">Insets</span><span class="o">)</span> <span class="n">margin</span><span class="o">.</span><span class="na">clone</span><span class="o">();</span></span>
<span id="LC430" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC431" class="line" lang="java"></span>
<span id="LC432" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC433" class="line" lang="java"><span class="cm">     * Returns the default icon.</span></span>
<span id="LC434" class="line" lang="java"><span class="cm">     * @return the default &lt;code&gt;Icon&lt;/code&gt;</span></span>
<span id="LC435" class="line" lang="java"><span class="cm">     * @see #setIcon</span></span>
<span id="LC436" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC437" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Icon</span> <span class="nf">getIcon</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC438" class="line" lang="java">        <span class="k">return</span> <span class="n">defaultIcon</span><span class="o">;</span></span>
<span id="LC439" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC440" class="line" lang="java"></span>
<span id="LC441" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC442" class="line" lang="java"><span class="cm">     * Sets the button's default icon. This icon is</span></span>
<span id="LC443" class="line" lang="java"><span class="cm">     * also used as the "pressed" and "disabled" icon if</span></span>
<span id="LC444" class="line" lang="java"><span class="cm">     * there is no explicitly set pressed icon.</span></span>
<span id="LC445" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC446" class="line" lang="java"><span class="cm">     * @param defaultIcon the icon used as the default image</span></span>
<span id="LC447" class="line" lang="java"><span class="cm">     * @see #getIcon</span></span>
<span id="LC448" class="line" lang="java"><span class="cm">     * @see #setPressedIcon</span></span>
<span id="LC449" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC450" class="line" lang="java"><span class="cm">     *           bound: true</span></span>
<span id="LC451" class="line" lang="java"><span class="cm">     *       attribute: visualUpdate true</span></span>
<span id="LC452" class="line" lang="java"><span class="cm">     *     description: The button's default icon</span></span>
<span id="LC453" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC454" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setIcon</span><span class="o">(</span><span class="nc">Icon</span> <span class="n">defaultIcon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC455" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">defaultIcon</span><span class="o">;</span></span>
<span id="LC456" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">defaultIcon</span> <span class="o">=</span> <span class="n">defaultIcon</span><span class="o">;</span></span>
<span id="LC457" class="line" lang="java"></span>
<span id="LC458" class="line" lang="java">        <span class="cm">/* If the default icon has really changed and we had</span></span>
<span id="LC459" class="line" lang="java"><span class="cm">         * generated the disabled icon for this component,</span></span>
<span id="LC460" class="line" lang="java"><span class="cm">         * (i.e. setDisabledIcon() was never called) then</span></span>
<span id="LC461" class="line" lang="java"><span class="cm">         * clear the disabledIcon field.</span></span>
<span id="LC462" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC463" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">defaultIcon</span> <span class="o">!=</span> <span class="n">oldValue</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">disabledIcon</span> <span class="k">instanceof</span> <span class="nc">UIResource</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC464" class="line" lang="java">            <span class="n">disabledIcon</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC465" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC466" class="line" lang="java"></span>
<span id="LC467" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">ICON_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">defaultIcon</span><span class="o">);</span></span>
<span id="LC468" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC469" class="line" lang="java">            <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC470" class="line" lang="java">                <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VISIBLE_DATA_PROPERTY</span><span class="o">,</span></span>
<span id="LC471" class="line" lang="java">                <span class="n">oldValue</span><span class="o">,</span> <span class="n">defaultIcon</span><span class="o">);</span></span>
<span id="LC472" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC473" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">defaultIcon</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC474" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">defaultIcon</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">oldValue</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span></span>
<span id="LC475" class="line" lang="java">                <span class="n">defaultIcon</span><span class="o">.</span><span class="na">getIconWidth</span><span class="o">()</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">.</span><span class="na">getIconWidth</span><span class="o">()</span> <span class="o">||</span></span>
<span id="LC476" class="line" lang="java">                <span class="n">defaultIcon</span><span class="o">.</span><span class="na">getIconHeight</span><span class="o">()</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">.</span><span class="na">getIconHeight</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC477" class="line" lang="java">                <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC478" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC479" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC480" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC481" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC482" class="line" lang="java"></span>
<span id="LC483" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC484" class="line" lang="java"><span class="cm">     * Returns the pressed icon for the button.</span></span>
<span id="LC485" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;pressedIcon&lt;/code&gt; property</span></span>
<span id="LC486" class="line" lang="java"><span class="cm">     * @see #setPressedIcon</span></span>
<span id="LC487" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC488" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Icon</span> <span class="nf">getPressedIcon</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC489" class="line" lang="java">        <span class="k">return</span> <span class="n">pressedIcon</span><span class="o">;</span></span>
<span id="LC490" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC491" class="line" lang="java"></span>
<span id="LC492" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC493" class="line" lang="java"><span class="cm">     * Sets the pressed icon for the button.</span></span>
<span id="LC494" class="line" lang="java"><span class="cm">     * @param pressedIcon the icon used as the "pressed" image</span></span>
<span id="LC495" class="line" lang="java"><span class="cm">     * @see #getPressedIcon</span></span>
<span id="LC496" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC497" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC498" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC499" class="line" lang="java"><span class="cm">     *  description: The pressed icon for the button.</span></span>
<span id="LC500" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC501" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setPressedIcon</span><span class="o">(</span><span class="nc">Icon</span> <span class="n">pressedIcon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC502" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">pressedIcon</span><span class="o">;</span></span>
<span id="LC503" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">pressedIcon</span> <span class="o">=</span> <span class="n">pressedIcon</span><span class="o">;</span></span>
<span id="LC504" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">PRESSED_ICON_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">pressedIcon</span><span class="o">);</span></span>
<span id="LC505" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC506" class="line" lang="java">            <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC507" class="line" lang="java">                <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VISIBLE_DATA_PROPERTY</span><span class="o">,</span></span>
<span id="LC508" class="line" lang="java">                <span class="n">oldValue</span><span class="o">,</span> <span class="n">pressedIcon</span><span class="o">);</span></span>
<span id="LC509" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC510" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">pressedIcon</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC511" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">getModel</span><span class="o">().</span><span class="na">isPressed</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC512" class="line" lang="java">                <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC513" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC514" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC515" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC516" class="line" lang="java"></span>
<span id="LC517" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC518" class="line" lang="java"><span class="cm">     * Returns the selected icon for the button.</span></span>
<span id="LC519" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;selectedIcon&lt;/code&gt; property</span></span>
<span id="LC520" class="line" lang="java"><span class="cm">     * @see #setSelectedIcon</span></span>
<span id="LC521" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC522" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Icon</span> <span class="nf">getSelectedIcon</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC523" class="line" lang="java">        <span class="k">return</span> <span class="n">selectedIcon</span><span class="o">;</span></span>
<span id="LC524" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC525" class="line" lang="java"></span>
<span id="LC526" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC527" class="line" lang="java"><span class="cm">     * Sets the selected icon for the button.</span></span>
<span id="LC528" class="line" lang="java"><span class="cm">     * @param selectedIcon the icon used as the "selected" image</span></span>
<span id="LC529" class="line" lang="java"><span class="cm">     * @see #getSelectedIcon</span></span>
<span id="LC530" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC531" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC532" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC533" class="line" lang="java"><span class="cm">     *  description: The selected icon for the button.</span></span>
<span id="LC534" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC535" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setSelectedIcon</span><span class="o">(</span><span class="nc">Icon</span> <span class="n">selectedIcon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC536" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">selectedIcon</span><span class="o">;</span></span>
<span id="LC537" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">selectedIcon</span> <span class="o">=</span> <span class="n">selectedIcon</span><span class="o">;</span></span>
<span id="LC538" class="line" lang="java"></span>
<span id="LC539" class="line" lang="java">        <span class="cm">/* If the default selected icon has really changed and we had</span></span>
<span id="LC540" class="line" lang="java"><span class="cm">         * generated the disabled selected icon for this component,</span></span>
<span id="LC541" class="line" lang="java"><span class="cm">         * (i.e. setDisabledSelectedIcon() was never called) then</span></span>
<span id="LC542" class="line" lang="java"><span class="cm">         * clear the disabledSelectedIcon field.</span></span>
<span id="LC543" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC544" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">selectedIcon</span> <span class="o">!=</span> <span class="n">oldValue</span> <span class="o">&amp;&amp;</span></span>
<span id="LC545" class="line" lang="java">            <span class="n">disabledSelectedIcon</span> <span class="k">instanceof</span> <span class="nc">UIResource</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC546" class="line" lang="java"></span>
<span id="LC547" class="line" lang="java">            <span class="n">disabledSelectedIcon</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC548" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC549" class="line" lang="java"></span>
<span id="LC550" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">SELECTED_ICON_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">selectedIcon</span><span class="o">);</span></span>
<span id="LC551" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC552" class="line" lang="java">            <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC553" class="line" lang="java">                <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VISIBLE_DATA_PROPERTY</span><span class="o">,</span></span>
<span id="LC554" class="line" lang="java">                <span class="n">oldValue</span><span class="o">,</span> <span class="n">selectedIcon</span><span class="o">);</span></span>
<span id="LC555" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC556" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">selectedIcon</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC557" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC558" class="line" lang="java">                <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC559" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC560" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC561" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC562" class="line" lang="java"></span>
<span id="LC563" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC564" class="line" lang="java"><span class="cm">     * Returns the rollover icon for the button.</span></span>
<span id="LC565" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;rolloverIcon&lt;/code&gt; property</span></span>
<span id="LC566" class="line" lang="java"><span class="cm">     * @see #setRolloverIcon</span></span>
<span id="LC567" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC568" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Icon</span> <span class="nf">getRolloverIcon</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC569" class="line" lang="java">        <span class="k">return</span> <span class="n">rolloverIcon</span><span class="o">;</span></span>
<span id="LC570" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC571" class="line" lang="java"></span>
<span id="LC572" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC573" class="line" lang="java"><span class="cm">     * Sets the rollover icon for the button.</span></span>
<span id="LC574" class="line" lang="java"><span class="cm">     * @param rolloverIcon the icon used as the "rollover" image</span></span>
<span id="LC575" class="line" lang="java"><span class="cm">     * @see #getRolloverIcon</span></span>
<span id="LC576" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC577" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC578" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC579" class="line" lang="java"><span class="cm">     *  description: The rollover icon for the button.</span></span>
<span id="LC580" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC581" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setRolloverIcon</span><span class="o">(</span><span class="nc">Icon</span> <span class="n">rolloverIcon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC582" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">rolloverIcon</span><span class="o">;</span></span>
<span id="LC583" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">rolloverIcon</span> <span class="o">=</span> <span class="n">rolloverIcon</span><span class="o">;</span></span>
<span id="LC584" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">ROLLOVER_ICON_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">rolloverIcon</span><span class="o">);</span></span>
<span id="LC585" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC586" class="line" lang="java">            <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC587" class="line" lang="java">                <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VISIBLE_DATA_PROPERTY</span><span class="o">,</span></span>
<span id="LC588" class="line" lang="java">                <span class="n">oldValue</span><span class="o">,</span> <span class="n">rolloverIcon</span><span class="o">);</span></span>
<span id="LC589" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC590" class="line" lang="java">        <span class="n">setRolloverEnabled</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></span>
<span id="LC591" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">rolloverIcon</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC592" class="line" lang="java">            <span class="c1">// No way to determine whether we are currently in</span></span>
<span id="LC593" class="line" lang="java">            <span class="c1">// a rollover state, so repaint regardless</span></span>
<span id="LC594" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC595" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC596" class="line" lang="java"></span>
<span id="LC597" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC598" class="line" lang="java"></span>
<span id="LC599" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC600" class="line" lang="java"><span class="cm">     * Returns the rollover selection icon for the button.</span></span>
<span id="LC601" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;rolloverSelectedIcon&lt;/code&gt; property</span></span>
<span id="LC602" class="line" lang="java"><span class="cm">     * @see #setRolloverSelectedIcon</span></span>
<span id="LC603" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC604" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Icon</span> <span class="nf">getRolloverSelectedIcon</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC605" class="line" lang="java">        <span class="k">return</span> <span class="n">rolloverSelectedIcon</span><span class="o">;</span></span>
<span id="LC606" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC607" class="line" lang="java"></span>
<span id="LC608" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC609" class="line" lang="java"><span class="cm">     * Sets the rollover selected icon for the button.</span></span>
<span id="LC610" class="line" lang="java"><span class="cm">     * @param rolloverSelectedIcon the icon used as the</span></span>
<span id="LC611" class="line" lang="java"><span class="cm">     *          "selected rollover" image</span></span>
<span id="LC612" class="line" lang="java"><span class="cm">     * @see #getRolloverSelectedIcon</span></span>
<span id="LC613" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC614" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC615" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC616" class="line" lang="java"><span class="cm">     *  description: The rollover selected icon for the button.</span></span>
<span id="LC617" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC618" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setRolloverSelectedIcon</span><span class="o">(</span><span class="nc">Icon</span> <span class="n">rolloverSelectedIcon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC619" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">rolloverSelectedIcon</span><span class="o">;</span></span>
<span id="LC620" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">rolloverSelectedIcon</span> <span class="o">=</span> <span class="n">rolloverSelectedIcon</span><span class="o">;</span></span>
<span id="LC621" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">ROLLOVER_SELECTED_ICON_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">rolloverSelectedIcon</span><span class="o">);</span></span>
<span id="LC622" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC623" class="line" lang="java">            <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC624" class="line" lang="java">                <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VISIBLE_DATA_PROPERTY</span><span class="o">,</span></span>
<span id="LC625" class="line" lang="java">                <span class="n">oldValue</span><span class="o">,</span> <span class="n">rolloverSelectedIcon</span><span class="o">);</span></span>
<span id="LC626" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC627" class="line" lang="java">        <span class="n">setRolloverEnabled</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></span>
<span id="LC628" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">rolloverSelectedIcon</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC629" class="line" lang="java">            <span class="c1">// No way to determine whether we are currently in</span></span>
<span id="LC630" class="line" lang="java">            <span class="c1">// a rollover state, so repaint regardless</span></span>
<span id="LC631" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC632" class="line" lang="java">                <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC633" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC634" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC635" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC636" class="line" lang="java"></span>
<span id="LC637" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC638" class="line" lang="java"><span class="cm">     * Returns the icon used by the button when it's disabled.</span></span>
<span id="LC639" class="line" lang="java"><span class="cm">     * If no disabled icon has been set this will forward the call to</span></span>
<span id="LC640" class="line" lang="java"><span class="cm">     * the look and feel to construct an appropriate disabled Icon.</span></span>
<span id="LC641" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC642" class="line" lang="java"><span class="cm">     * Some look and feels might not render the disabled Icon, in which</span></span>
<span id="LC643" class="line" lang="java"><span class="cm">     * case they will ignore this.</span></span>
<span id="LC644" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC645" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;disabledIcon&lt;/code&gt; property</span></span>
<span id="LC646" class="line" lang="java"><span class="cm">     * @see #getPressedIcon</span></span>
<span id="LC647" class="line" lang="java"><span class="cm">     * @see #setDisabledIcon</span></span>
<span id="LC648" class="line" lang="java"><span class="cm">     * @see javax.swing.LookAndFeel#getDisabledIcon</span></span>
<span id="LC649" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC650" class="line" lang="java">    <span class="nd">@Transient</span></span>
<span id="LC651" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Icon</span> <span class="nf">getDisabledIcon</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC652" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">disabledIcon</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC653" class="line" lang="java">            <span class="n">disabledIcon</span> <span class="o">=</span> <span class="nc">UIManager</span><span class="o">.</span><span class="na">getLookAndFeel</span><span class="o">().</span><span class="na">getDisabledIcon</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">getIcon</span><span class="o">());</span></span>
<span id="LC654" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">disabledIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC655" class="line" lang="java">                <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">DISABLED_ICON_CHANGED_PROPERTY</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="n">disabledIcon</span><span class="o">);</span></span>
<span id="LC656" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC657" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC658" class="line" lang="java">        <span class="k">return</span> <span class="n">disabledIcon</span><span class="o">;</span></span>
<span id="LC659" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC660" class="line" lang="java"></span>
<span id="LC661" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC662" class="line" lang="java"><span class="cm">     * Sets the disabled icon for the button.</span></span>
<span id="LC663" class="line" lang="java"><span class="cm">     * @param disabledIcon the icon used as the disabled image</span></span>
<span id="LC664" class="line" lang="java"><span class="cm">     * @see #getDisabledIcon</span></span>
<span id="LC665" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC666" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC667" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC668" class="line" lang="java"><span class="cm">     *  description: The disabled icon for the button.</span></span>
<span id="LC669" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC670" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setDisabledIcon</span><span class="o">(</span><span class="nc">Icon</span> <span class="n">disabledIcon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC671" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">disabledIcon</span><span class="o">;</span></span>
<span id="LC672" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">disabledIcon</span> <span class="o">=</span> <span class="n">disabledIcon</span><span class="o">;</span></span>
<span id="LC673" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">DISABLED_ICON_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">disabledIcon</span><span class="o">);</span></span>
<span id="LC674" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC675" class="line" lang="java">            <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC676" class="line" lang="java">                <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VISIBLE_DATA_PROPERTY</span><span class="o">,</span></span>
<span id="LC677" class="line" lang="java">                <span class="n">oldValue</span><span class="o">,</span> <span class="n">disabledIcon</span><span class="o">);</span></span>
<span id="LC678" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC679" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">disabledIcon</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC680" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">isEnabled</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC681" class="line" lang="java">                <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC682" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC683" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC684" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC685" class="line" lang="java"></span>
<span id="LC686" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC687" class="line" lang="java"><span class="cm">     * Returns the icon used by the button when it's disabled and selected.</span></span>
<span id="LC688" class="line" lang="java"><span class="cm">     * If no disabled selection icon has been set, this will forward</span></span>
<span id="LC689" class="line" lang="java"><span class="cm">     * the call to the LookAndFeel to construct an appropriate disabled</span></span>
<span id="LC690" class="line" lang="java"><span class="cm">     * Icon from the selection icon if it has been set and to</span></span>
<span id="LC691" class="line" lang="java"><span class="cm">     * &lt;code&gt;getDisabledIcon()&lt;/code&gt; otherwise.</span></span>
<span id="LC692" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC693" class="line" lang="java"><span class="cm">     * Some look and feels might not render the disabled selected Icon, in</span></span>
<span id="LC694" class="line" lang="java"><span class="cm">     * which case they will ignore this.</span></span>
<span id="LC695" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC696" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;disabledSelectedIcon&lt;/code&gt; property</span></span>
<span id="LC697" class="line" lang="java"><span class="cm">     * @see #getDisabledIcon</span></span>
<span id="LC698" class="line" lang="java"><span class="cm">     * @see #setDisabledSelectedIcon</span></span>
<span id="LC699" class="line" lang="java"><span class="cm">     * @see javax.swing.LookAndFeel#getDisabledSelectedIcon</span></span>
<span id="LC700" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC701" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Icon</span> <span class="nf">getDisabledSelectedIcon</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC702" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">disabledSelectedIcon</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC703" class="line" lang="java">             <span class="k">if</span> <span class="o">(</span><span class="n">selectedIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC704" class="line" lang="java">                 <span class="n">disabledSelectedIcon</span> <span class="o">=</span> <span class="nc">UIManager</span><span class="o">.</span><span class="na">getLookAndFeel</span><span class="o">().</span></span>
<span id="LC705" class="line" lang="java">                         <span class="n">getDisabledSelectedIcon</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">getSelectedIcon</span><span class="o">());</span></span>
<span id="LC706" class="line" lang="java">             <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC707" class="line" lang="java">                 <span class="k">return</span> <span class="nf">getDisabledIcon</span><span class="o">();</span></span>
<span id="LC708" class="line" lang="java">             <span class="o">}</span></span>
<span id="LC709" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC710" class="line" lang="java">        <span class="k">return</span> <span class="n">disabledSelectedIcon</span><span class="o">;</span></span>
<span id="LC711" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC712" class="line" lang="java"></span>
<span id="LC713" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC714" class="line" lang="java"><span class="cm">     * Sets the disabled selection icon for the button.</span></span>
<span id="LC715" class="line" lang="java"><span class="cm">     * @param disabledSelectedIcon the icon used as the disabled</span></span>
<span id="LC716" class="line" lang="java"><span class="cm">     *          selection image</span></span>
<span id="LC717" class="line" lang="java"><span class="cm">     * @see #getDisabledSelectedIcon</span></span>
<span id="LC718" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC719" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC720" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC721" class="line" lang="java"><span class="cm">     *  description: The disabled selection icon for the button.</span></span>
<span id="LC722" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC723" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setDisabledSelectedIcon</span><span class="o">(</span><span class="nc">Icon</span> <span class="n">disabledSelectedIcon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC724" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">disabledSelectedIcon</span><span class="o">;</span></span>
<span id="LC725" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">disabledSelectedIcon</span> <span class="o">=</span> <span class="n">disabledSelectedIcon</span><span class="o">;</span></span>
<span id="LC726" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">DISABLED_SELECTED_ICON_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">disabledSelectedIcon</span><span class="o">);</span></span>
<span id="LC727" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC728" class="line" lang="java">            <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC729" class="line" lang="java">                <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VISIBLE_DATA_PROPERTY</span><span class="o">,</span></span>
<span id="LC730" class="line" lang="java">                <span class="n">oldValue</span><span class="o">,</span> <span class="n">disabledSelectedIcon</span><span class="o">);</span></span>
<span id="LC731" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC732" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">disabledSelectedIcon</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC733" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">disabledSelectedIcon</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">oldValue</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span></span>
<span id="LC734" class="line" lang="java">                <span class="n">disabledSelectedIcon</span><span class="o">.</span><span class="na">getIconWidth</span><span class="o">()</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">.</span><span class="na">getIconWidth</span><span class="o">()</span> <span class="o">||</span></span>
<span id="LC735" class="line" lang="java">                <span class="n">disabledSelectedIcon</span><span class="o">.</span><span class="na">getIconHeight</span><span class="o">()</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">.</span><span class="na">getIconHeight</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC736" class="line" lang="java">                <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC737" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC738" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">isEnabled</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="n">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC739" class="line" lang="java">                <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC740" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC741" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC742" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC743" class="line" lang="java"></span>
<span id="LC744" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC745" class="line" lang="java"><span class="cm">     * Returns the vertical alignment of the text and icon.</span></span>
<span id="LC746" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC747" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;verticalAlignment&lt;/code&gt; property, one of the</span></span>
<span id="LC748" class="line" lang="java"><span class="cm">     *          following values:</span></span>
<span id="LC749" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC750" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.CENTER} (the default)</span></span>
<span id="LC751" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.TOP}</span></span>
<span id="LC752" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.BOTTOM}</span></span>
<span id="LC753" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC754" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC755" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getVerticalAlignment</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC756" class="line" lang="java">        <span class="k">return</span> <span class="n">verticalAlignment</span><span class="o">;</span></span>
<span id="LC757" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC758" class="line" lang="java"></span>
<span id="LC759" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC760" class="line" lang="java"><span class="cm">     * Sets the vertical alignment of the icon and text.</span></span>
<span id="LC761" class="line" lang="java"><span class="cm">     * @param alignment one of the following values:</span></span>
<span id="LC762" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC763" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.CENTER} (the default)</span></span>
<span id="LC764" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.TOP}</span></span>
<span id="LC765" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.BOTTOM}</span></span>
<span id="LC766" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC767" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if the alignment is not one of the legal</span></span>
<span id="LC768" class="line" lang="java"><span class="cm">     *         values listed above</span></span>
<span id="LC769" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC770" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC771" class="line" lang="java"><span class="cm">     *         enum: TOP    SwingConstants.TOP</span></span>
<span id="LC772" class="line" lang="java"><span class="cm">     *               CENTER SwingConstants.CENTER</span></span>
<span id="LC773" class="line" lang="java"><span class="cm">     *               BOTTOM  SwingConstants.BOTTOM</span></span>
<span id="LC774" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC775" class="line" lang="java"><span class="cm">     *  description: The vertical alignment of the icon and text.</span></span>
<span id="LC776" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC777" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setVerticalAlignment</span><span class="o">(</span><span class="kt">int</span> <span class="n">alignment</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC778" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">alignment</span> <span class="o">==</span> <span class="n">verticalAlignment</span><span class="o">)</span> <span class="k">return</span><span class="o">;</span></span>
<span id="LC779" class="line" lang="java">        <span class="kt">int</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">verticalAlignment</span><span class="o">;</span></span>
<span id="LC780" class="line" lang="java">        <span class="n">verticalAlignment</span> <span class="o">=</span> <span class="n">checkVerticalKey</span><span class="o">(</span><span class="n">alignment</span><span class="o">,</span> <span class="s">"verticalAlignment"</span><span class="o">);</span></span>
<span id="LC781" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">VERTICAL_ALIGNMENT_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">verticalAlignment</span><span class="o">);</span>         <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC782" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC783" class="line" lang="java"></span>
<span id="LC784" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC785" class="line" lang="java"><span class="cm">     * Returns the horizontal alignment of the icon and text.</span></span>
<span id="LC786" class="line" lang="java"><span class="cm">     * {@code AbstractButton}'s default is {@code SwingConstants.CENTER},</span></span>
<span id="LC787" class="line" lang="java"><span class="cm">     * but subclasses such as {@code JCheckBox} may use a different default.</span></span>
<span id="LC788" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC789" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;horizontalAlignment&lt;/code&gt; property,</span></span>
<span id="LC790" class="line" lang="java"><span class="cm">     *             one of the following values:</span></span>
<span id="LC791" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC792" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.RIGHT}</span></span>
<span id="LC793" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.LEFT}</span></span>
<span id="LC794" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.CENTER}</span></span>
<span id="LC795" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.LEADING}</span></span>
<span id="LC796" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.TRAILING}</span></span>
<span id="LC797" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC798" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC799" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getHorizontalAlignment</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC800" class="line" lang="java">        <span class="k">return</span> <span class="n">horizontalAlignment</span><span class="o">;</span></span>
<span id="LC801" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC802" class="line" lang="java"></span>
<span id="LC803" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC804" class="line" lang="java"><span class="cm">     * Sets the horizontal alignment of the icon and text.</span></span>
<span id="LC805" class="line" lang="java"><span class="cm">     * {@code AbstractButton}'s default is {@code SwingConstants.CENTER},</span></span>
<span id="LC806" class="line" lang="java"><span class="cm">     * but subclasses such as {@code JCheckBox} may use a different default.</span></span>
<span id="LC807" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC808" class="line" lang="java"><span class="cm">     * @param alignment the alignment value, one of the following values:</span></span>
<span id="LC809" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC810" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.RIGHT}</span></span>
<span id="LC811" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.LEFT}</span></span>
<span id="LC812" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.CENTER}</span></span>
<span id="LC813" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.LEADING}</span></span>
<span id="LC814" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.TRAILING}</span></span>
<span id="LC815" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC816" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if the alignment is not one of the</span></span>
<span id="LC817" class="line" lang="java"><span class="cm">     *         valid values</span></span>
<span id="LC818" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC819" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC820" class="line" lang="java"><span class="cm">     *         enum: LEFT     SwingConstants.LEFT</span></span>
<span id="LC821" class="line" lang="java"><span class="cm">     *               CENTER   SwingConstants.CENTER</span></span>
<span id="LC822" class="line" lang="java"><span class="cm">     *               RIGHT    SwingConstants.RIGHT</span></span>
<span id="LC823" class="line" lang="java"><span class="cm">     *               LEADING  SwingConstants.LEADING</span></span>
<span id="LC824" class="line" lang="java"><span class="cm">     *               TRAILING SwingConstants.TRAILING</span></span>
<span id="LC825" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC826" class="line" lang="java"><span class="cm">     *  description: The horizontal alignment of the icon and text.</span></span>
<span id="LC827" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC828" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setHorizontalAlignment</span><span class="o">(</span><span class="kt">int</span> <span class="n">alignment</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC829" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">alignment</span> <span class="o">==</span> <span class="n">horizontalAlignment</span><span class="o">)</span> <span class="k">return</span><span class="o">;</span></span>
<span id="LC830" class="line" lang="java">        <span class="kt">int</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">horizontalAlignment</span><span class="o">;</span></span>
<span id="LC831" class="line" lang="java">        <span class="n">horizontalAlignment</span> <span class="o">=</span> <span class="n">checkHorizontalKey</span><span class="o">(</span><span class="n">alignment</span><span class="o">,</span></span>
<span id="LC832" class="line" lang="java">                                                 <span class="s">"horizontalAlignment"</span><span class="o">);</span></span>
<span id="LC833" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">HORIZONTAL_ALIGNMENT_CHANGED_PROPERTY</span><span class="o">,</span></span>
<span id="LC834" class="line" lang="java">                           <span class="n">oldValue</span><span class="o">,</span> <span class="n">horizontalAlignment</span><span class="o">);</span></span>
<span id="LC835" class="line" lang="java">        <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC836" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC837" class="line" lang="java"></span>
<span id="LC838" class="line" lang="java"></span>
<span id="LC839" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC840" class="line" lang="java"><span class="cm">     * Returns the vertical position of the text relative to the icon.</span></span>
<span id="LC841" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;verticalTextPosition&lt;/code&gt; property,</span></span>
<span id="LC842" class="line" lang="java"><span class="cm">     *          one of the following values:</span></span>
<span id="LC843" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC844" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.CENTER} (the default)</span></span>
<span id="LC845" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.TOP}</span></span>
<span id="LC846" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.BOTTOM}</span></span>
<span id="LC847" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC848" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC849" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getVerticalTextPosition</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC850" class="line" lang="java">        <span class="k">return</span> <span class="n">verticalTextPosition</span><span class="o">;</span></span>
<span id="LC851" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC852" class="line" lang="java"></span>
<span id="LC853" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC854" class="line" lang="java"><span class="cm">     * Sets the vertical position of the text relative to the icon.</span></span>
<span id="LC855" class="line" lang="java"><span class="cm">     * @param textPosition  one of the following values:</span></span>
<span id="LC856" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC857" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.CENTER} (the default)</span></span>
<span id="LC858" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.TOP}</span></span>
<span id="LC859" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.BOTTOM}</span></span>
<span id="LC860" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC861" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC862" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC863" class="line" lang="java"><span class="cm">     *         enum: TOP    SwingConstants.TOP</span></span>
<span id="LC864" class="line" lang="java"><span class="cm">     *               CENTER SwingConstants.CENTER</span></span>
<span id="LC865" class="line" lang="java"><span class="cm">     *               BOTTOM SwingConstants.BOTTOM</span></span>
<span id="LC866" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC867" class="line" lang="java"><span class="cm">     *  description: The vertical position of the text relative to the icon.</span></span>
<span id="LC868" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC869" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setVerticalTextPosition</span><span class="o">(</span><span class="kt">int</span> <span class="n">textPosition</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC870" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">textPosition</span> <span class="o">==</span> <span class="n">verticalTextPosition</span><span class="o">)</span> <span class="k">return</span><span class="o">;</span></span>
<span id="LC871" class="line" lang="java">        <span class="kt">int</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">verticalTextPosition</span><span class="o">;</span></span>
<span id="LC872" class="line" lang="java">        <span class="n">verticalTextPosition</span> <span class="o">=</span> <span class="n">checkVerticalKey</span><span class="o">(</span><span class="n">textPosition</span><span class="o">,</span> <span class="s">"verticalTextPosition"</span><span class="o">);</span></span>
<span id="LC873" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">VERTICAL_TEXT_POSITION_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">verticalTextPosition</span><span class="o">);</span></span>
<span id="LC874" class="line" lang="java">        <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC875" class="line" lang="java">        <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC876" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC877" class="line" lang="java"></span>
<span id="LC878" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC879" class="line" lang="java"><span class="cm">     * Returns the horizontal position of the text relative to the icon.</span></span>
<span id="LC880" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;horizontalTextPosition&lt;/code&gt; property,</span></span>
<span id="LC881" class="line" lang="java"><span class="cm">     *          one of the following values:</span></span>
<span id="LC882" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC883" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.RIGHT}</span></span>
<span id="LC884" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.LEFT}</span></span>
<span id="LC885" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.CENTER}</span></span>
<span id="LC886" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.LEADING}</span></span>
<span id="LC887" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.TRAILING} (the default)</span></span>
<span id="LC888" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC889" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC890" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getHorizontalTextPosition</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC891" class="line" lang="java">        <span class="k">return</span> <span class="n">horizontalTextPosition</span><span class="o">;</span></span>
<span id="LC892" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC893" class="line" lang="java"></span>
<span id="LC894" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC895" class="line" lang="java"><span class="cm">     * Sets the horizontal position of the text relative to the icon.</span></span>
<span id="LC896" class="line" lang="java"><span class="cm">     * @param textPosition one of the following values:</span></span>
<span id="LC897" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC898" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.RIGHT}</span></span>
<span id="LC899" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.LEFT}</span></span>
<span id="LC900" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.CENTER}</span></span>
<span id="LC901" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.LEADING}</span></span>
<span id="LC902" class="line" lang="java"><span class="cm">     * &lt;li&gt;{@code SwingConstants.TRAILING} (the default)</span></span>
<span id="LC903" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC904" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException if &lt;code&gt;textPosition&lt;/code&gt;</span></span>
<span id="LC905" class="line" lang="java"><span class="cm">     *          is not one of the legal values listed above</span></span>
<span id="LC906" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC907" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC908" class="line" lang="java"><span class="cm">     *         enum: LEFT     SwingConstants.LEFT</span></span>
<span id="LC909" class="line" lang="java"><span class="cm">     *               CENTER   SwingConstants.CENTER</span></span>
<span id="LC910" class="line" lang="java"><span class="cm">     *               RIGHT    SwingConstants.RIGHT</span></span>
<span id="LC911" class="line" lang="java"><span class="cm">     *               LEADING  SwingConstants.LEADING</span></span>
<span id="LC912" class="line" lang="java"><span class="cm">     *               TRAILING SwingConstants.TRAILING</span></span>
<span id="LC913" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC914" class="line" lang="java"><span class="cm">     *  description: The horizontal position of the text relative to the icon.</span></span>
<span id="LC915" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC916" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setHorizontalTextPosition</span><span class="o">(</span><span class="kt">int</span> <span class="n">textPosition</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC917" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">textPosition</span> <span class="o">==</span> <span class="n">horizontalTextPosition</span><span class="o">)</span> <span class="k">return</span><span class="o">;</span></span>
<span id="LC918" class="line" lang="java">        <span class="kt">int</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">horizontalTextPosition</span><span class="o">;</span></span>
<span id="LC919" class="line" lang="java">        <span class="n">horizontalTextPosition</span> <span class="o">=</span> <span class="n">checkHorizontalKey</span><span class="o">(</span><span class="n">textPosition</span><span class="o">,</span></span>
<span id="LC920" class="line" lang="java">                                                    <span class="s">"horizontalTextPosition"</span><span class="o">);</span></span>
<span id="LC921" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">HORIZONTAL_TEXT_POSITION_CHANGED_PROPERTY</span><span class="o">,</span></span>
<span id="LC922" class="line" lang="java">                           <span class="n">oldValue</span><span class="o">,</span></span>
<span id="LC923" class="line" lang="java">                           <span class="n">horizontalTextPosition</span><span class="o">);</span></span>
<span id="LC924" class="line" lang="java">        <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC925" class="line" lang="java">        <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC926" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC927" class="line" lang="java"></span>
<span id="LC928" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC929" class="line" lang="java"><span class="cm">     * Returns the amount of space between the text and the icon</span></span>
<span id="LC930" class="line" lang="java"><span class="cm">     * displayed in this button.</span></span>
<span id="LC931" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC932" class="line" lang="java"><span class="cm">     * @return an int equal to the number of pixels between the text</span></span>
<span id="LC933" class="line" lang="java"><span class="cm">     *         and the icon.</span></span>
<span id="LC934" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC935" class="line" lang="java"><span class="cm">     * @see #setIconTextGap</span></span>
<span id="LC936" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC937" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getIconTextGap</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC938" class="line" lang="java">        <span class="k">return</span> <span class="n">iconTextGap</span><span class="o">;</span></span>
<span id="LC939" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC940" class="line" lang="java"></span>
<span id="LC941" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC942" class="line" lang="java"><span class="cm">     * If both the icon and text properties are set, this property</span></span>
<span id="LC943" class="line" lang="java"><span class="cm">     * defines the space between them.</span></span>
<span id="LC944" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC945" class="line" lang="java"><span class="cm">     * The default value of this property is 4 pixels.</span></span>
<span id="LC946" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC947" class="line" lang="java"><span class="cm">     * This is a JavaBeans bound property.</span></span>
<span id="LC948" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC949" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC950" class="line" lang="java"><span class="cm">     * @see #getIconTextGap</span></span>
<span id="LC951" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC952" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC953" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC954" class="line" lang="java"><span class="cm">     *  description: If both the icon and text properties are set, this</span></span>
<span id="LC955" class="line" lang="java"><span class="cm">     *               property defines the space between them.</span></span>
<span id="LC956" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC957" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setIconTextGap</span><span class="o">(</span><span class="kt">int</span> <span class="n">iconTextGap</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC958" class="line" lang="java">        <span class="kt">int</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">iconTextGap</span><span class="o">;</span></span>
<span id="LC959" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">iconTextGap</span> <span class="o">=</span> <span class="n">iconTextGap</span><span class="o">;</span></span>
<span id="LC960" class="line" lang="java">        <span class="n">iconTextGapSet</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC961" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="s">"iconTextGap"</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">iconTextGap</span><span class="o">);</span></span>
<span id="LC962" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">iconTextGap</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC963" class="line" lang="java">            <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC964" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC965" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC966" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC967" class="line" lang="java"></span>
<span id="LC968" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC969" class="line" lang="java"><span class="cm">     * Verify that the {@code key} argument is a legal value for the</span></span>
<span id="LC970" class="line" lang="java"><span class="cm">     * {@code horizontalAlignment} and {@code horizontalTextPosition}</span></span>
<span id="LC971" class="line" lang="java"><span class="cm">     * properties. Valid values are:</span></span>
<span id="LC972" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC973" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.RIGHT}</span></span>
<span id="LC974" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.LEFT}</span></span>
<span id="LC975" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.CENTER}</span></span>
<span id="LC976" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.LEADING}</span></span>
<span id="LC977" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.TRAILING}</span></span>
<span id="LC978" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC979" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC980" class="line" lang="java"><span class="cm">     * @param key the property value to check</span></span>
<span id="LC981" class="line" lang="java"><span class="cm">     * @param exception the message to use in the</span></span>
<span id="LC982" class="line" lang="java"><span class="cm">     *        {@code IllegalArgumentException} that is thrown for an invalid</span></span>
<span id="LC983" class="line" lang="java"><span class="cm">     *        value</span></span>
<span id="LC984" class="line" lang="java"><span class="cm">     * @return the {@code key} argument</span></span>
<span id="LC985" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException if key is not one of the legal</span></span>
<span id="LC986" class="line" lang="java"><span class="cm">     *            values listed above</span></span>
<span id="LC987" class="line" lang="java"><span class="cm">     * @see #setHorizontalTextPosition</span></span>
<span id="LC988" class="line" lang="java"><span class="cm">     * @see #setHorizontalAlignment</span></span>
<span id="LC989" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC990" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">int</span> <span class="nf">checkHorizontalKey</span><span class="o">(</span><span class="kt">int</span> <span class="n">key</span><span class="o">,</span> <span class="nc">String</span> <span class="n">exception</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC991" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">key</span> <span class="o">==</span> <span class="no">LEFT</span><span class="o">)</span> <span class="o">||</span></span>
<span id="LC992" class="line" lang="java">            <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="no">CENTER</span><span class="o">)</span> <span class="o">||</span></span>
<span id="LC993" class="line" lang="java">            <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="no">RIGHT</span><span class="o">)</span> <span class="o">||</span></span>
<span id="LC994" class="line" lang="java">            <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="no">LEADING</span><span class="o">)</span> <span class="o">||</span></span>
<span id="LC995" class="line" lang="java">            <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="no">TRAILING</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC996" class="line" lang="java">            <span class="k">return</span> <span class="n">key</span><span class="o">;</span></span>
<span id="LC997" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC998" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="n">exception</span><span class="o">);</span></span>
<span id="LC999" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1000" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1001" class="line" lang="java"></span>
<span id="LC1002" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1003" class="line" lang="java"><span class="cm">     * Verify that the {@code key} argument is a legal value for the</span></span>
<span id="LC1004" class="line" lang="java"><span class="cm">     * vertical properties. Valid values are:</span></span>
<span id="LC1005" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC1006" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.CENTER}</span></span>
<span id="LC1007" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.TOP}</span></span>
<span id="LC1008" class="line" lang="java"><span class="cm">     *   &lt;li&gt;{@code SwingConstants.BOTTOM}</span></span>
<span id="LC1009" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC1010" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1011" class="line" lang="java"><span class="cm">     * @param key the property value to check</span></span>
<span id="LC1012" class="line" lang="java"><span class="cm">     * @param exception the message to use in the</span></span>
<span id="LC1013" class="line" lang="java"><span class="cm">     *        {@code IllegalArgumentException} that is thrown for an invalid</span></span>
<span id="LC1014" class="line" lang="java"><span class="cm">     *        value</span></span>
<span id="LC1015" class="line" lang="java"><span class="cm">     * @return the {@code key} argument</span></span>
<span id="LC1016" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException if key is not one of the legal</span></span>
<span id="LC1017" class="line" lang="java"><span class="cm">     *            values listed above</span></span>
<span id="LC1018" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1019" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">int</span> <span class="nf">checkVerticalKey</span><span class="o">(</span><span class="kt">int</span> <span class="n">key</span><span class="o">,</span> <span class="nc">String</span> <span class="n">exception</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1020" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">key</span> <span class="o">==</span> <span class="no">TOP</span><span class="o">)</span> <span class="o">||</span> <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="no">CENTER</span><span class="o">)</span> <span class="o">||</span> <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="no">BOTTOM</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1021" class="line" lang="java">            <span class="k">return</span> <span class="n">key</span><span class="o">;</span></span>
<span id="LC1022" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1023" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="n">exception</span><span class="o">);</span></span>
<span id="LC1024" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1025" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1026" class="line" lang="java"></span>
<span id="LC1027" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1028" class="line" lang="java"><span class="cm">     *{@inheritDoc}</span></span>
<span id="LC1029" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1030" class="line" lang="java"><span class="cm">     * @since 1.6</span></span>
<span id="LC1031" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1032" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">removeNotify</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1033" class="line" lang="java">        <span class="kd">super</span><span class="o">.</span><span class="na">removeNotify</span><span class="o">();</span></span>
<span id="LC1034" class="line" lang="java">        <span class="k">if</span><span class="o">(</span><span class="n">isRolloverEnabled</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1035" class="line" lang="java">            <span class="n">getModel</span><span class="o">().</span><span class="na">setRollover</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC1036" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1037" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1038" class="line" lang="java"></span>
<span id="LC1039" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1040" class="line" lang="java"><span class="cm">     * Sets the action command for this button.</span></span>
<span id="LC1041" class="line" lang="java"><span class="cm">     * @param actionCommand the action command for this button</span></span>
<span id="LC1042" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1043" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setActionCommand</span><span class="o">(</span><span class="nc">String</span> <span class="n">actionCommand</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1044" class="line" lang="java">        <span class="n">getModel</span><span class="o">().</span><span class="na">setActionCommand</span><span class="o">(</span><span class="n">actionCommand</span><span class="o">);</span></span>
<span id="LC1045" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1046" class="line" lang="java"></span>
<span id="LC1047" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1048" class="line" lang="java"><span class="cm">     * Returns the action command for this button.</span></span>
<span id="LC1049" class="line" lang="java"><span class="cm">     * @return the action command for this button</span></span>
<span id="LC1050" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1051" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getActionCommand</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1052" class="line" lang="java">        <span class="nc">String</span> <span class="n">ac</span> <span class="o">=</span> <span class="n">getModel</span><span class="o">().</span><span class="na">getActionCommand</span><span class="o">();</span></span>
<span id="LC1053" class="line" lang="java">        <span class="k">if</span><span class="o">(</span><span class="n">ac</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1054" class="line" lang="java">            <span class="n">ac</span> <span class="o">=</span> <span class="n">getText</span><span class="o">();</span></span>
<span id="LC1055" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1056" class="line" lang="java">        <span class="k">return</span> <span class="n">ac</span><span class="o">;</span></span>
<span id="LC1057" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1058" class="line" lang="java"></span>
<span id="LC1059" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Action</span> <span class="n">action</span><span class="o">;</span></span>
<span id="LC1060" class="line" lang="java">    <span class="kd">private</span> <span class="nc">PropertyChangeListener</span> <span class="n">actionPropertyChangeListener</span><span class="o">;</span></span>
<span id="LC1061" class="line" lang="java"></span>
<span id="LC1062" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1063" class="line" lang="java"><span class="cm">     * Sets the &lt;code&gt;Action&lt;/code&gt;.</span></span>
<span id="LC1064" class="line" lang="java"><span class="cm">     * The new &lt;code&gt;Action&lt;/code&gt; replaces any previously set</span></span>
<span id="LC1065" class="line" lang="java"><span class="cm">     * &lt;code&gt;Action&lt;/code&gt; but does not affect &lt;code&gt;ActionListeners&lt;/code&gt;</span></span>
<span id="LC1066" class="line" lang="java"><span class="cm">     * independently added with &lt;code&gt;addActionListener&lt;/code&gt;.</span></span>
<span id="LC1067" class="line" lang="java"><span class="cm">     * If the &lt;code&gt;Action&lt;/code&gt; is already a registered</span></span>
<span id="LC1068" class="line" lang="java"><span class="cm">     * &lt;code&gt;ActionListener&lt;/code&gt; for the button, it is not re-registered.</span></span>
<span id="LC1069" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1070" class="line" lang="java"><span class="cm">     * Setting the &lt;code&gt;Action&lt;/code&gt; results in immediately changing</span></span>
<span id="LC1071" class="line" lang="java"><span class="cm">     * all the properties described in &lt;a href="Action.html#buttonActions"&gt;</span></span>
<span id="LC1072" class="line" lang="java"><span class="cm">     * Swing Components Supporting &lt;code&gt;Action&lt;/code&gt;&lt;/a&gt;.</span></span>
<span id="LC1073" class="line" lang="java"><span class="cm">     * Subsequently, the button's properties are automatically updated</span></span>
<span id="LC1074" class="line" lang="java"><span class="cm">     * as the &lt;code&gt;Action&lt;/code&gt;'s properties change.</span></span>
<span id="LC1075" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1076" class="line" lang="java"><span class="cm">     * This method uses three other methods to set</span></span>
<span id="LC1077" class="line" lang="java"><span class="cm">     * and help track the &lt;code&gt;Action&lt;/code&gt;'s property values.</span></span>
<span id="LC1078" class="line" lang="java"><span class="cm">     * It uses the &lt;code&gt;configurePropertiesFromAction&lt;/code&gt; method</span></span>
<span id="LC1079" class="line" lang="java"><span class="cm">     * to immediately change the button's properties.</span></span>
<span id="LC1080" class="line" lang="java"><span class="cm">     * To track changes in the &lt;code&gt;Action&lt;/code&gt;'s property values,</span></span>
<span id="LC1081" class="line" lang="java"><span class="cm">     * this method registers the &lt;code&gt;PropertyChangeListener&lt;/code&gt;</span></span>
<span id="LC1082" class="line" lang="java"><span class="cm">     * returned by &lt;code&gt;createActionPropertyChangeListener&lt;/code&gt;. The</span></span>
<span id="LC1083" class="line" lang="java"><span class="cm">     * default {@code PropertyChangeListener} invokes the</span></span>
<span id="LC1084" class="line" lang="java"><span class="cm">     * {@code actionPropertyChanged} method when a property in the</span></span>
<span id="LC1085" class="line" lang="java"><span class="cm">     * {@code Action} changes.</span></span>
<span id="LC1086" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1087" class="line" lang="java"><span class="cm">     * @param a the &lt;code&gt;Action&lt;/code&gt; for the &lt;code&gt;AbstractButton&lt;/code&gt;,</span></span>
<span id="LC1088" class="line" lang="java"><span class="cm">     *          or &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC1089" class="line" lang="java"><span class="cm">     * @since 1.3</span></span>
<span id="LC1090" class="line" lang="java"><span class="cm">     * @see Action</span></span>
<span id="LC1091" class="line" lang="java"><span class="cm">     * @see #getAction</span></span>
<span id="LC1092" class="line" lang="java"><span class="cm">     * @see #configurePropertiesFromAction</span></span>
<span id="LC1093" class="line" lang="java"><span class="cm">     * @see #createActionPropertyChangeListener</span></span>
<span id="LC1094" class="line" lang="java"><span class="cm">     * @see #actionPropertyChanged</span></span>
<span id="LC1095" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1096" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1097" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1098" class="line" lang="java"><span class="cm">     *  description: the Action instance connected with this ActionEvent source</span></span>
<span id="LC1099" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1100" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setAction</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1101" class="line" lang="java">        <span class="nc">Action</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">getAction</span><span class="o">();</span></span>
<span id="LC1102" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">action</span><span class="o">==</span><span class="kc">null</span> <span class="o">||</span> <span class="o">!</span><span class="n">action</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">a</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1103" class="line" lang="java">            <span class="n">action</span> <span class="o">=</span> <span class="n">a</span><span class="o">;</span></span>
<span id="LC1104" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">oldValue</span><span class="o">!=</span><span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1105" class="line" lang="java">                <span class="n">removeActionListener</span><span class="o">(</span><span class="n">oldValue</span><span class="o">);</span></span>
<span id="LC1106" class="line" lang="java">                <span class="n">oldValue</span><span class="o">.</span><span class="na">removePropertyChangeListener</span><span class="o">(</span><span class="n">actionPropertyChangeListener</span><span class="o">);</span></span>
<span id="LC1107" class="line" lang="java">                <span class="n">actionPropertyChangeListener</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1108" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1109" class="line" lang="java">            <span class="n">configurePropertiesFromAction</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1110" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">action</span><span class="o">!=</span><span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1111" class="line" lang="java">                <span class="c1">// Don't add if it is already a listener</span></span>
<span id="LC1112" class="line" lang="java">                <span class="k">if</span> <span class="o">(!</span><span class="n">isListener</span><span class="o">(</span><span class="nc">ActionListener</span><span class="o">.</span><span class="na">class</span><span class="o">,</span> <span class="n">action</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1113" class="line" lang="java">                    <span class="n">addActionListener</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1114" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1115" class="line" lang="java">                <span class="c1">// Reverse linkage:</span></span>
<span id="LC1116" class="line" lang="java">                <span class="n">actionPropertyChangeListener</span> <span class="o">=</span> <span class="n">createActionPropertyChangeListener</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1117" class="line" lang="java">                <span class="n">action</span><span class="o">.</span><span class="na">addPropertyChangeListener</span><span class="o">(</span><span class="n">actionPropertyChangeListener</span><span class="o">);</span></span>
<span id="LC1118" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1119" class="line" lang="java">            <span class="n">firePropertyChange</span><span class="o">(</span><span class="s">"action"</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">action</span><span class="o">);</span></span>
<span id="LC1120" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1121" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1122" class="line" lang="java"></span>
<span id="LC1123" class="line" lang="java">    <span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">isListener</span><span class="o">(</span><span class="nc">Class</span> <span class="n">c</span><span class="o">,</span> <span class="nc">ActionListener</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1124" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">isListener</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1125" class="line" lang="java">        <span class="nc">Object</span><span class="o">[]</span> <span class="n">listeners</span> <span class="o">=</span> <span class="n">listenerList</span><span class="o">.</span><span class="na">getListenerList</span><span class="o">();</span></span>
<span id="LC1126" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">listeners</span><span class="o">.</span><span class="na">length</span><span class="o">-</span><span class="mi">2</span><span class="o">;</span> <span class="n">i</span><span class="o">&gt;=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span><span class="o">-=</span><span class="mi">2</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1127" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">listeners</span><span class="o">[</span><span class="n">i</span><span class="o">]==</span><span class="n">c</span> <span class="o">&amp;&amp;</span> <span class="n">listeners</span><span class="o">[</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">]==</span><span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1128" class="line" lang="java">                    <span class="n">isListener</span><span class="o">=</span><span class="kc">true</span><span class="o">;</span></span>
<span id="LC1129" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1130" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1131" class="line" lang="java">        <span class="k">return</span> <span class="n">isListener</span><span class="o">;</span></span>
<span id="LC1132" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1133" class="line" lang="java"></span>
<span id="LC1134" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1135" class="line" lang="java"><span class="cm">     * Returns the currently set &lt;code&gt;Action&lt;/code&gt; for this</span></span>
<span id="LC1136" class="line" lang="java"><span class="cm">     * &lt;code&gt;ActionEvent&lt;/code&gt; source, or &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC1137" class="line" lang="java"><span class="cm">     * if no &lt;code&gt;Action&lt;/code&gt; is set.</span></span>
<span id="LC1138" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1139" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;Action&lt;/code&gt; for this &lt;code&gt;ActionEvent&lt;/code&gt;</span></span>
<span id="LC1140" class="line" lang="java"><span class="cm">     *          source, or &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC1141" class="line" lang="java"><span class="cm">     * @since 1.3</span></span>
<span id="LC1142" class="line" lang="java"><span class="cm">     * @see Action</span></span>
<span id="LC1143" class="line" lang="java"><span class="cm">     * @see #setAction</span></span>
<span id="LC1144" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1145" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Action</span> <span class="nf">getAction</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1146" class="line" lang="java">        <span class="k">return</span> <span class="n">action</span><span class="o">;</span></span>
<span id="LC1147" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1148" class="line" lang="java"></span>
<span id="LC1149" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1150" class="line" lang="java"><span class="cm">     * Sets the properties on this button to match those in the specified</span></span>
<span id="LC1151" class="line" lang="java"><span class="cm">     * &lt;code&gt;Action&lt;/code&gt;.  Refer to &lt;a href="Action.html#buttonActions"&gt;</span></span>
<span id="LC1152" class="line" lang="java"><span class="cm">     * Swing Components Supporting &lt;code&gt;Action&lt;/code&gt;&lt;/a&gt; for more</span></span>
<span id="LC1153" class="line" lang="java"><span class="cm">     * details as to which properties this sets.</span></span>
<span id="LC1154" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1155" class="line" lang="java"><span class="cm">     * @param a the &lt;code&gt;Action&lt;/code&gt; from which to get the properties,</span></span>
<span id="LC1156" class="line" lang="java"><span class="cm">     *          or &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC1157" class="line" lang="java"><span class="cm">     * @since 1.3</span></span>
<span id="LC1158" class="line" lang="java"><span class="cm">     * @see Action</span></span>
<span id="LC1159" class="line" lang="java"><span class="cm">     * @see #setAction</span></span>
<span id="LC1160" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1161" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">configurePropertiesFromAction</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1162" class="line" lang="java">        <span class="n">setMnemonicFromAction</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></span>
<span id="LC1163" class="line" lang="java">        <span class="n">setTextFromAction</span><span class="o">(</span><span class="n">a</span><span class="o">,</span> <span class="kc">false</span><span class="o">);</span></span>
<span id="LC1164" class="line" lang="java">        <span class="nc">AbstractAction</span><span class="o">.</span><span class="na">setToolTipTextFromAction</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">a</span><span class="o">);</span></span>
<span id="LC1165" class="line" lang="java">        <span class="n">setIconFromAction</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></span>
<span id="LC1166" class="line" lang="java">        <span class="n">setActionCommandFromAction</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></span>
<span id="LC1167" class="line" lang="java">        <span class="nc">AbstractAction</span><span class="o">.</span><span class="na">setEnabledFromAction</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">a</span><span class="o">);</span></span>
<span id="LC1168" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="nc">AbstractAction</span><span class="o">.</span><span class="na">hasSelectedKey</span><span class="o">(</span><span class="n">a</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC1169" class="line" lang="java">                <span class="n">shouldUpdateSelectedStateFromAction</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1170" class="line" lang="java">            <span class="n">setSelectedFromAction</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></span>
<span id="LC1171" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1172" class="line" lang="java">        <span class="n">setDisplayedMnemonicIndexFromAction</span><span class="o">(</span><span class="n">a</span><span class="o">,</span> <span class="kc">false</span><span class="o">);</span></span>
<span id="LC1173" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1174" class="line" lang="java"></span>
<span id="LC1175" class="line" lang="java">    <span class="kt">void</span> <span class="nf">clientPropertyChanged</span><span class="o">(</span><span class="nc">Object</span> <span class="n">key</span><span class="o">,</span> <span class="nc">Object</span> <span class="n">oldValue</span><span class="o">,</span></span>
<span id="LC1176" class="line" lang="java">                               <span class="nc">Object</span> <span class="n">newValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1177" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="s">"hideActionText"</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1178" class="line" lang="java">            <span class="kt">boolean</span> <span class="n">current</span> <span class="o">=</span> <span class="o">(</span><span class="n">newValue</span> <span class="k">instanceof</span> <span class="nc">Boolean</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC1179" class="line" lang="java">                                <span class="o">(</span><span class="nc">Boolean</span><span class="o">)</span><span class="n">newValue</span> <span class="o">:</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1180" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">getHideActionText</span><span class="o">()</span> <span class="o">!=</span> <span class="n">current</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1181" class="line" lang="java">                <span class="n">setHideActionText</span><span class="o">(</span><span class="n">current</span><span class="o">);</span></span>
<span id="LC1182" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1183" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1184" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1185" class="line" lang="java"></span>
<span id="LC1186" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1187" class="line" lang="java"><span class="cm">     * Button subclasses that support mirroring the selected state from</span></span>
<span id="LC1188" class="line" lang="java"><span class="cm">     * the action should override this to return true.  AbstractButton's</span></span>
<span id="LC1189" class="line" lang="java"><span class="cm">     * implementation returns false.</span></span>
<span id="LC1190" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1191" class="line" lang="java">    <span class="kt">boolean</span> <span class="nf">shouldUpdateSelectedStateFromAction</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1192" class="line" lang="java">        <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1193" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1194" class="line" lang="java"></span>
<span id="LC1195" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1196" class="line" lang="java"><span class="cm">     * Updates the button's state in response to property changes in the</span></span>
<span id="LC1197" class="line" lang="java"><span class="cm">     * associated action. This method is invoked from the</span></span>
<span id="LC1198" class="line" lang="java"><span class="cm">     * {@code PropertyChangeListener} returned from</span></span>
<span id="LC1199" class="line" lang="java"><span class="cm">     * {@code createActionPropertyChangeListener}. Subclasses do not normally</span></span>
<span id="LC1200" class="line" lang="java"><span class="cm">     * need to invoke this. Subclasses that support additional {@code Action}</span></span>
<span id="LC1201" class="line" lang="java"><span class="cm">     * properties should override this and</span></span>
<span id="LC1202" class="line" lang="java"><span class="cm">     * {@code configurePropertiesFromAction}.</span></span>
<span id="LC1203" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1204" class="line" lang="java"><span class="cm">     * Refer to the table at &lt;a href="Action.html#buttonActions"&gt;</span></span>
<span id="LC1205" class="line" lang="java"><span class="cm">     * Swing Components Supporting &lt;code&gt;Action&lt;/code&gt;&lt;/a&gt; for a list of</span></span>
<span id="LC1206" class="line" lang="java"><span class="cm">     * the properties this method sets.</span></span>
<span id="LC1207" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1208" class="line" lang="java"><span class="cm">     * @param action the &lt;code&gt;Action&lt;/code&gt; associated with this button</span></span>
<span id="LC1209" class="line" lang="java"><span class="cm">     * @param propertyName the name of the property that changed</span></span>
<span id="LC1210" class="line" lang="java"><span class="cm">     * @since 1.6</span></span>
<span id="LC1211" class="line" lang="java"><span class="cm">     * @see Action</span></span>
<span id="LC1212" class="line" lang="java"><span class="cm">     * @see #configurePropertiesFromAction</span></span>
<span id="LC1213" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1214" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">actionPropertyChanged</span><span class="o">(</span><span class="nc">Action</span> <span class="n">action</span><span class="o">,</span> <span class="nc">String</span> <span class="n">propertyName</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1215" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="nc">Action</span><span class="o">.</span><span class="na">NAME</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1216" class="line" lang="java">            <span class="n">setTextFromAction</span><span class="o">(</span><span class="n">action</span><span class="o">,</span> <span class="kc">true</span><span class="o">);</span></span>
<span id="LC1217" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="s">"enabled"</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1218" class="line" lang="java">            <span class="nc">AbstractAction</span><span class="o">.</span><span class="na">setEnabledFromAction</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">action</span><span class="o">);</span></span>
<span id="LC1219" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="nc">Action</span><span class="o">.</span><span class="na">SHORT_DESCRIPTION</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1220" class="line" lang="java">            <span class="nc">AbstractAction</span><span class="o">.</span><span class="na">setToolTipTextFromAction</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">action</span><span class="o">);</span></span>
<span id="LC1221" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="nc">Action</span><span class="o">.</span><span class="na">SMALL_ICON</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1222" class="line" lang="java">            <span class="n">smallIconChanged</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1223" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="nc">Action</span><span class="o">.</span><span class="na">MNEMONIC_KEY</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1224" class="line" lang="java">            <span class="n">setMnemonicFromAction</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1225" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="nc">Action</span><span class="o">.</span><span class="na">ACTION_COMMAND_KEY</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1226" class="line" lang="java">            <span class="n">setActionCommandFromAction</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1227" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="nc">Action</span><span class="o">.</span><span class="na">SELECTED_KEY</span> <span class="o">&amp;&amp;</span></span>
<span id="LC1228" class="line" lang="java">                   <span class="nc">AbstractAction</span><span class="o">.</span><span class="na">hasSelectedKey</span><span class="o">(</span><span class="n">action</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC1229" class="line" lang="java">                   <span class="n">shouldUpdateSelectedStateFromAction</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1230" class="line" lang="java">            <span class="n">setSelectedFromAction</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1231" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="nc">Action</span><span class="o">.</span><span class="na">DISPLAYED_MNEMONIC_INDEX_KEY</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1232" class="line" lang="java">            <span class="n">setDisplayedMnemonicIndexFromAction</span><span class="o">(</span><span class="n">action</span><span class="o">,</span> <span class="kc">true</span><span class="o">);</span></span>
<span id="LC1233" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="nc">Action</span><span class="o">.</span><span class="na">LARGE_ICON_KEY</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1234" class="line" lang="java">            <span class="n">largeIconChanged</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1235" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1236" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1237" class="line" lang="java"></span>
<span id="LC1238" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">setDisplayedMnemonicIndexFromAction</span><span class="o">(</span></span>
<span id="LC1239" class="line" lang="java">            <span class="nc">Action</span> <span class="n">a</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">fromPropertyChange</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1240" class="line" lang="java">        <span class="nc">Integer</span> <span class="n">iValue</span> <span class="o">=</span> <span class="o">(</span><span class="n">a</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span> <span class="kc">null</span> <span class="o">:</span></span>
<span id="LC1241" class="line" lang="java">                <span class="o">(</span><span class="nc">Integer</span><span class="o">)</span><span class="n">a</span><span class="o">.</span><span class="na">getValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">DISPLAYED_MNEMONIC_INDEX_KEY</span><span class="o">);</span></span>
<span id="LC1242" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">fromPropertyChange</span> <span class="o">||</span> <span class="n">iValue</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1243" class="line" lang="java">            <span class="kt">int</span> <span class="n">value</span><span class="o">;</span></span>
<span id="LC1244" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">iValue</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1245" class="line" lang="java">                <span class="n">value</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC1246" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1247" class="line" lang="java">                <span class="n">value</span> <span class="o">=</span> <span class="n">iValue</span><span class="o">;</span></span>
<span id="LC1248" class="line" lang="java">                <span class="nc">String</span> <span class="n">text</span> <span class="o">=</span> <span class="n">getText</span><span class="o">();</span></span>
<span id="LC1249" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">text</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">value</span> <span class="o">&gt;=</span> <span class="n">text</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1250" class="line" lang="java">                    <span class="n">value</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC1251" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1252" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1253" class="line" lang="java">            <span class="n">setDisplayedMnemonicIndex</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></span>
<span id="LC1254" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1255" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1256" class="line" lang="java"></span>
<span id="LC1257" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">setMnemonicFromAction</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1258" class="line" lang="java">        <span class="nc">Integer</span> <span class="n">n</span> <span class="o">=</span> <span class="o">(</span><span class="n">a</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span> <span class="kc">null</span> <span class="o">:</span></span>
<span id="LC1259" class="line" lang="java">                                  <span class="o">(</span><span class="nc">Integer</span><span class="o">)</span><span class="n">a</span><span class="o">.</span><span class="na">getValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">MNEMONIC_KEY</span><span class="o">);</span></span>
<span id="LC1260" class="line" lang="java">        <span class="n">setMnemonic</span><span class="o">((</span><span class="n">n</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span> <span class="sc">'\0'</span> <span class="o">:</span> <span class="n">n</span><span class="o">);</span></span>
<span id="LC1261" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1262" class="line" lang="java"></span>
<span id="LC1263" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">setTextFromAction</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">propertyChange</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1264" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">hideText</span> <span class="o">=</span> <span class="n">getHideActionText</span><span class="o">();</span></span>
<span id="LC1265" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">propertyChange</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1266" class="line" lang="java">            <span class="n">setText</span><span class="o">((</span><span class="n">a</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">hideText</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC1267" class="line" lang="java">                        <span class="o">(</span><span class="nc">String</span><span class="o">)</span><span class="n">a</span><span class="o">.</span><span class="na">getValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">NAME</span><span class="o">)</span> <span class="o">:</span> <span class="kc">null</span><span class="o">);</span></span>
<span id="LC1268" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1269" class="line" lang="java">        <span class="k">else</span> <span class="nf">if</span> <span class="o">(!</span><span class="n">hideText</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1270" class="line" lang="java">            <span class="n">setText</span><span class="o">((</span><span class="nc">String</span><span class="o">)</span><span class="n">a</span><span class="o">.</span><span class="na">getValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">NAME</span><span class="o">));</span></span>
<span id="LC1271" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1272" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1273" class="line" lang="java"></span>
<span id="LC1274" class="line" lang="java">    <span class="kt">void</span> <span class="nf">setIconFromAction</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1275" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">icon</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1276" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">a</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1277" class="line" lang="java">            <span class="n">icon</span> <span class="o">=</span> <span class="o">(</span><span class="nc">Icon</span><span class="o">)</span><span class="n">a</span><span class="o">.</span><span class="na">getValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">LARGE_ICON_KEY</span><span class="o">);</span></span>
<span id="LC1278" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">icon</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1279" class="line" lang="java">                <span class="n">icon</span> <span class="o">=</span> <span class="o">(</span><span class="nc">Icon</span><span class="o">)</span><span class="n">a</span><span class="o">.</span><span class="na">getValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">SMALL_ICON</span><span class="o">);</span></span>
<span id="LC1280" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1281" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1282" class="line" lang="java">        <span class="n">setIcon</span><span class="o">(</span><span class="n">icon</span><span class="o">);</span></span>
<span id="LC1283" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1284" class="line" lang="java"></span>
<span id="LC1285" class="line" lang="java">    <span class="kt">void</span> <span class="nf">smallIconChanged</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1286" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">a</span><span class="o">.</span><span class="na">getValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">LARGE_ICON_KEY</span><span class="o">)</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1287" class="line" lang="java">            <span class="n">setIconFromAction</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></span>
<span id="LC1288" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1289" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1290" class="line" lang="java"></span>
<span id="LC1291" class="line" lang="java">    <span class="kt">void</span> <span class="nf">largeIconChanged</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1292" class="line" lang="java">        <span class="n">setIconFromAction</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></span>
<span id="LC1293" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1294" class="line" lang="java"></span>
<span id="LC1295" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">setActionCommandFromAction</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1296" class="line" lang="java">        <span class="n">setActionCommand</span><span class="o">((</span><span class="n">a</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC1297" class="line" lang="java">                             <span class="o">(</span><span class="nc">String</span><span class="o">)</span><span class="n">a</span><span class="o">.</span><span class="na">getValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">ACTION_COMMAND_KEY</span><span class="o">)</span> <span class="o">:</span></span>
<span id="LC1298" class="line" lang="java">                             <span class="kc">null</span><span class="o">);</span></span>
<span id="LC1299" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1300" class="line" lang="java"></span>
<span id="LC1301" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1302" class="line" lang="java"><span class="cm">     * Sets the seleted state of the button from the action.  This is defined</span></span>
<span id="LC1303" class="line" lang="java"><span class="cm">     * here, but not wired up.  Subclasses like JToggleButton and</span></span>
<span id="LC1304" class="line" lang="java"><span class="cm">     * JCheckBoxMenuItem make use of it.</span></span>
<span id="LC1305" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1306" class="line" lang="java"><span class="cm">     * @param a the Action</span></span>
<span id="LC1307" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1308" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">setSelectedFromAction</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1309" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">selected</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1310" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">a</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1311" class="line" lang="java">            <span class="n">selected</span> <span class="o">=</span> <span class="nc">AbstractAction</span><span class="o">.</span><span class="na">isSelected</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></span>
<span id="LC1312" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1313" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">selected</span> <span class="o">!=</span> <span class="n">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1314" class="line" lang="java">            <span class="c1">// This won't notify ActionListeners, but that should be</span></span>
<span id="LC1315" class="line" lang="java">            <span class="c1">// ok as the change is coming from the Action.</span></span>
<span id="LC1316" class="line" lang="java">            <span class="n">setSelected</span><span class="o">(</span><span class="n">selected</span><span class="o">);</span></span>
<span id="LC1317" class="line" lang="java">            <span class="c1">// Make sure the change actually took effect</span></span>
<span id="LC1318" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">selected</span> <span class="o">&amp;&amp;</span> <span class="n">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1319" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">getModel</span><span class="o">()</span> <span class="k">instanceof</span> <span class="nc">DefaultButtonModel</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1320" class="line" lang="java">                    <span class="nc">ButtonGroup</span> <span class="n">group</span> <span class="o">=</span> <span class="o">((</span><span class="nc">DefaultButtonModel</span><span class="o">)</span><span class="n">getModel</span><span class="o">()).</span><span class="na">getGroup</span><span class="o">();</span></span>
<span id="LC1321" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">group</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1322" class="line" lang="java">                        <span class="n">group</span><span class="o">.</span><span class="na">clearSelection</span><span class="o">();</span></span>
<span id="LC1323" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC1324" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC1325" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1326" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1327" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1328" class="line" lang="java"></span>
<span id="LC1329" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1330" class="line" lang="java"><span class="cm">     * Creates and returns a &lt;code&gt;PropertyChangeListener&lt;/code&gt; that is</span></span>
<span id="LC1331" class="line" lang="java"><span class="cm">     * responsible for listening for changes from the specified</span></span>
<span id="LC1332" class="line" lang="java"><span class="cm">     * &lt;code&gt;Action&lt;/code&gt; and updating the appropriate properties.</span></span>
<span id="LC1333" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1334" class="line" lang="java"><span class="cm">     * &lt;b&gt;Warning:&lt;/b&gt; If you subclass this do not create an anonymous</span></span>
<span id="LC1335" class="line" lang="java"><span class="cm">     * inner class.  If you do the lifetime of the button will be tied to</span></span>
<span id="LC1336" class="line" lang="java"><span class="cm">     * that of the &lt;code&gt;Action&lt;/code&gt;.</span></span>
<span id="LC1337" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1338" class="line" lang="java"><span class="cm">     * @param a the button's action</span></span>
<span id="LC1339" class="line" lang="java"><span class="cm">     * @since 1.3</span></span>
<span id="LC1340" class="line" lang="java"><span class="cm">     * @see Action</span></span>
<span id="LC1341" class="line" lang="java"><span class="cm">     * @see #setAction</span></span>
<span id="LC1342" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1343" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">PropertyChangeListener</span> <span class="nf">createActionPropertyChangeListener</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1344" class="line" lang="java">        <span class="k">return</span> <span class="nf">createActionPropertyChangeListener0</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></span>
<span id="LC1345" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1346" class="line" lang="java"></span>
<span id="LC1347" class="line" lang="java"></span>
<span id="LC1348" class="line" lang="java">    <span class="nc">PropertyChangeListener</span> <span class="nf">createActionPropertyChangeListener0</span><span class="o">(</span><span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1349" class="line" lang="java">        <span class="k">return</span> <span class="k">new</span> <span class="nf">ButtonActionPropertyChangeListener</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">a</span><span class="o">);</span></span>
<span id="LC1350" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1351" class="line" lang="java"></span>
<span id="LC1352" class="line" lang="java">    <span class="nd">@SuppressWarnings</span><span class="o">(</span><span class="s">"serial"</span><span class="o">)</span></span>
<span id="LC1353" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">class</span> <span class="nc">ButtonActionPropertyChangeListener</span></span>
<span id="LC1354" class="line" lang="java">                 <span class="kd">extends</span> <span class="nc">ActionPropertyChangeListener</span><span class="o">&lt;</span><span class="nc">AbstractButton</span><span class="o">&gt;</span> <span class="o">{</span></span>
<span id="LC1355" class="line" lang="java">        <span class="nc">ButtonActionPropertyChangeListener</span><span class="o">(</span><span class="nc">AbstractButton</span> <span class="n">b</span><span class="o">,</span> <span class="nc">Action</span> <span class="n">a</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1356" class="line" lang="java">            <span class="kd">super</span><span class="o">(</span><span class="n">b</span><span class="o">,</span> <span class="n">a</span><span class="o">);</span></span>
<span id="LC1357" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1358" class="line" lang="java">        <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">actionPropertyChanged</span><span class="o">(</span><span class="nc">AbstractButton</span> <span class="n">button</span><span class="o">,</span></span>
<span id="LC1359" class="line" lang="java">                                             <span class="nc">Action</span> <span class="n">action</span><span class="o">,</span></span>
<span id="LC1360" class="line" lang="java">                                             <span class="nc">PropertyChangeEvent</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1361" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="nc">AbstractAction</span><span class="o">.</span><span class="na">shouldReconfigure</span><span class="o">(</span><span class="n">e</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1362" class="line" lang="java">                <span class="n">button</span><span class="o">.</span><span class="na">configurePropertiesFromAction</span><span class="o">(</span><span class="n">action</span><span class="o">);</span></span>
<span id="LC1363" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1364" class="line" lang="java">                <span class="n">button</span><span class="o">.</span><span class="na">actionPropertyChanged</span><span class="o">(</span><span class="n">action</span><span class="o">,</span> <span class="n">e</span><span class="o">.</span><span class="na">getPropertyName</span><span class="o">());</span></span>
<span id="LC1365" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1366" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1367" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1368" class="line" lang="java"></span>
<span id="LC1369" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1370" class="line" lang="java"><span class="cm">     * Gets the &lt;code&gt;borderPainted&lt;/code&gt; property.</span></span>
<span id="LC1371" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1372" class="line" lang="java"><span class="cm">     * @return the value of the &lt;code&gt;borderPainted&lt;/code&gt; property</span></span>
<span id="LC1373" class="line" lang="java"><span class="cm">     * @see #setBorderPainted</span></span>
<span id="LC1374" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1375" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isBorderPainted</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1376" class="line" lang="java">        <span class="k">return</span> <span class="n">paintBorder</span><span class="o">;</span></span>
<span id="LC1377" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1378" class="line" lang="java"></span>
<span id="LC1379" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1380" class="line" lang="java"><span class="cm">     * Sets the &lt;code&gt;borderPainted&lt;/code&gt; property.</span></span>
<span id="LC1381" class="line" lang="java"><span class="cm">     * If &lt;code&gt;true&lt;/code&gt; and the button has a border,</span></span>
<span id="LC1382" class="line" lang="java"><span class="cm">     * the border is painted. The default value for the</span></span>
<span id="LC1383" class="line" lang="java"><span class="cm">     * &lt;code&gt;borderPainted&lt;/code&gt; property is &lt;code&gt;true&lt;/code&gt;.</span></span>
<span id="LC1384" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1385" class="line" lang="java"><span class="cm">     * Some look and feels might not support</span></span>
<span id="LC1386" class="line" lang="java"><span class="cm">     * the &lt;code&gt;borderPainted&lt;/code&gt; property,</span></span>
<span id="LC1387" class="line" lang="java"><span class="cm">     * in which case they ignore this.</span></span>
<span id="LC1388" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1389" class="line" lang="java"><span class="cm">     * @param b if true and border property is not &lt;code&gt;null&lt;/code&gt;,</span></span>
<span id="LC1390" class="line" lang="java"><span class="cm">     *          the border is painted</span></span>
<span id="LC1391" class="line" lang="java"><span class="cm">     * @see #isBorderPainted</span></span>
<span id="LC1392" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1393" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1394" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1395" class="line" lang="java"><span class="cm">     *  description: Whether the border should be painted.</span></span>
<span id="LC1396" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1397" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setBorderPainted</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">b</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1398" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">paintBorder</span><span class="o">;</span></span>
<span id="LC1399" class="line" lang="java">        <span class="n">paintBorder</span> <span class="o">=</span> <span class="n">b</span><span class="o">;</span></span>
<span id="LC1400" class="line" lang="java">        <span class="n">borderPaintedSet</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1401" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">BORDER_PAINTED_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">paintBorder</span><span class="o">);</span></span>
<span id="LC1402" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">b</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1403" class="line" lang="java">            <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC1404" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC1405" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1406" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1407" class="line" lang="java"></span>
<span id="LC1408" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1409" class="line" lang="java"><span class="cm">     * Paint the button's border if &lt;code&gt;BorderPainted&lt;/code&gt;</span></span>
<span id="LC1410" class="line" lang="java"><span class="cm">     * property is true and the button has a border.</span></span>
<span id="LC1411" class="line" lang="java"><span class="cm">     * @param g the &lt;code&gt;Graphics&lt;/code&gt; context in which to paint</span></span>
<span id="LC1412" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1413" class="line" lang="java"><span class="cm">     * @see #paint</span></span>
<span id="LC1414" class="line" lang="java"><span class="cm">     * @see #setBorder</span></span>
<span id="LC1415" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1416" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">paintBorder</span><span class="o">(</span><span class="nc">Graphics</span> <span class="n">g</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1417" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">isBorderPainted</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1418" class="line" lang="java">            <span class="kd">super</span><span class="o">.</span><span class="na">paintBorder</span><span class="o">(</span><span class="n">g</span><span class="o">);</span></span>
<span id="LC1419" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1420" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1421" class="line" lang="java"></span>
<span id="LC1422" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1423" class="line" lang="java"><span class="cm">     * Gets the &lt;code&gt;paintFocus&lt;/code&gt; property.</span></span>
<span id="LC1424" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1425" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;paintFocus&lt;/code&gt; property</span></span>
<span id="LC1426" class="line" lang="java"><span class="cm">     * @see #setFocusPainted</span></span>
<span id="LC1427" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1428" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isFocusPainted</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1429" class="line" lang="java">        <span class="k">return</span> <span class="n">paintFocus</span><span class="o">;</span></span>
<span id="LC1430" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1431" class="line" lang="java"></span>
<span id="LC1432" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1433" class="line" lang="java"><span class="cm">     * Sets the &lt;code&gt;paintFocus&lt;/code&gt; property, which must</span></span>
<span id="LC1434" class="line" lang="java"><span class="cm">     * be &lt;code&gt;true&lt;/code&gt; for the focus state to be painted.</span></span>
<span id="LC1435" class="line" lang="java"><span class="cm">     * The default value for the &lt;code&gt;paintFocus&lt;/code&gt; property</span></span>
<span id="LC1436" class="line" lang="java"><span class="cm">     * is &lt;code&gt;true&lt;/code&gt;.</span></span>
<span id="LC1437" class="line" lang="java"><span class="cm">     * Some look and feels might not paint focus state;</span></span>
<span id="LC1438" class="line" lang="java"><span class="cm">     * they will ignore this property.</span></span>
<span id="LC1439" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1440" class="line" lang="java"><span class="cm">     * @param b if &lt;code&gt;true&lt;/code&gt;, the focus state should be painted</span></span>
<span id="LC1441" class="line" lang="java"><span class="cm">     * @see #isFocusPainted</span></span>
<span id="LC1442" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1443" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1444" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1445" class="line" lang="java"><span class="cm">     *  description: Whether focus should be painted</span></span>
<span id="LC1446" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1447" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setFocusPainted</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">b</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1448" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">paintFocus</span><span class="o">;</span></span>
<span id="LC1449" class="line" lang="java">        <span class="n">paintFocus</span> <span class="o">=</span> <span class="n">b</span><span class="o">;</span></span>
<span id="LC1450" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">FOCUS_PAINTED_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">paintFocus</span><span class="o">);</span></span>
<span id="LC1451" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">b</span> <span class="o">!=</span> <span class="n">oldValue</span> <span class="o">&amp;&amp;</span> <span class="n">isFocusOwner</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1452" class="line" lang="java">            <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC1453" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC1454" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1455" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1456" class="line" lang="java"></span>
<span id="LC1457" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1458" class="line" lang="java"><span class="cm">     * Gets the &lt;code&gt;contentAreaFilled&lt;/code&gt; property.</span></span>
<span id="LC1459" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1460" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;contentAreaFilled&lt;/code&gt; property</span></span>
<span id="LC1461" class="line" lang="java"><span class="cm">     * @see #setContentAreaFilled</span></span>
<span id="LC1462" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1463" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isContentAreaFilled</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1464" class="line" lang="java">        <span class="k">return</span> <span class="n">contentAreaFilled</span><span class="o">;</span></span>
<span id="LC1465" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1466" class="line" lang="java"></span>
<span id="LC1467" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1468" class="line" lang="java"><span class="cm">     * Sets the &lt;code&gt;contentAreaFilled&lt;/code&gt; property.</span></span>
<span id="LC1469" class="line" lang="java"><span class="cm">     * If &lt;code&gt;true&lt;/code&gt; the button will paint the content</span></span>
<span id="LC1470" class="line" lang="java"><span class="cm">     * area.  If you wish to have a transparent button, such as</span></span>
<span id="LC1471" class="line" lang="java"><span class="cm">     * an icon only button, for example, then you should set</span></span>
<span id="LC1472" class="line" lang="java"><span class="cm">     * this to &lt;code&gt;false&lt;/code&gt;. Do not call &lt;code&gt;setOpaque(false)&lt;/code&gt;.</span></span>
<span id="LC1473" class="line" lang="java"><span class="cm">     * The default value for the the &lt;code&gt;contentAreaFilled&lt;/code&gt;</span></span>
<span id="LC1474" class="line" lang="java"><span class="cm">     * property is &lt;code&gt;true&lt;/code&gt;.</span></span>
<span id="LC1475" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1476" class="line" lang="java"><span class="cm">     * This function may cause the component's opaque property to change.</span></span>
<span id="LC1477" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1478" class="line" lang="java"><span class="cm">     * The exact behavior of calling this function varies on a</span></span>
<span id="LC1479" class="line" lang="java"><span class="cm">     * component-by-component and L&amp;amp;F-by-L&amp;amp;F basis.</span></span>
<span id="LC1480" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1481" class="line" lang="java"><span class="cm">     * @param b if true, the content should be filled; if false</span></span>
<span id="LC1482" class="line" lang="java"><span class="cm">     *          the content area is not filled</span></span>
<span id="LC1483" class="line" lang="java"><span class="cm">     * @see #isContentAreaFilled</span></span>
<span id="LC1484" class="line" lang="java"><span class="cm">     * @see #setOpaque</span></span>
<span id="LC1485" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1486" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1487" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1488" class="line" lang="java"><span class="cm">     *  description: Whether the button should paint the content area</span></span>
<span id="LC1489" class="line" lang="java"><span class="cm">     *               or leave it transparent.</span></span>
<span id="LC1490" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1491" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setContentAreaFilled</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">b</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1492" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">contentAreaFilled</span><span class="o">;</span></span>
<span id="LC1493" class="line" lang="java">        <span class="n">contentAreaFilled</span> <span class="o">=</span> <span class="n">b</span><span class="o">;</span></span>
<span id="LC1494" class="line" lang="java">        <span class="n">contentAreaFilledSet</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1495" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">CONTENT_AREA_FILLED_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">contentAreaFilled</span><span class="o">);</span></span>
<span id="LC1496" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">b</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1497" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC1498" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1499" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1500" class="line" lang="java"></span>
<span id="LC1501" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1502" class="line" lang="java"><span class="cm">     * Gets the &lt;code&gt;rolloverEnabled&lt;/code&gt; property.</span></span>
<span id="LC1503" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1504" class="line" lang="java"><span class="cm">     * @return the value of the &lt;code&gt;rolloverEnabled&lt;/code&gt; property</span></span>
<span id="LC1505" class="line" lang="java"><span class="cm">     * @see #setRolloverEnabled</span></span>
<span id="LC1506" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1507" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isRolloverEnabled</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1508" class="line" lang="java">        <span class="k">return</span> <span class="n">rolloverEnabled</span><span class="o">;</span></span>
<span id="LC1509" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1510" class="line" lang="java"></span>
<span id="LC1511" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1512" class="line" lang="java"><span class="cm">     * Sets the &lt;code&gt;rolloverEnabled&lt;/code&gt; property, which</span></span>
<span id="LC1513" class="line" lang="java"><span class="cm">     * must be &lt;code&gt;true&lt;/code&gt; for rollover effects to occur.</span></span>
<span id="LC1514" class="line" lang="java"><span class="cm">     * The default value for the &lt;code&gt;rolloverEnabled&lt;/code&gt;</span></span>
<span id="LC1515" class="line" lang="java"><span class="cm">     * property is &lt;code&gt;false&lt;/code&gt;.</span></span>
<span id="LC1516" class="line" lang="java"><span class="cm">     * Some look and feels might not implement rollover effects;</span></span>
<span id="LC1517" class="line" lang="java"><span class="cm">     * they will ignore this property.</span></span>
<span id="LC1518" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1519" class="line" lang="java"><span class="cm">     * @param b if &lt;code&gt;true&lt;/code&gt;, rollover effects should be painted</span></span>
<span id="LC1520" class="line" lang="java"><span class="cm">     * @see #isRolloverEnabled</span></span>
<span id="LC1521" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1522" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1523" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1524" class="line" lang="java"><span class="cm">     *  description: Whether rollover effects should be enabled.</span></span>
<span id="LC1525" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1526" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setRolloverEnabled</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">b</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1527" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">rolloverEnabled</span><span class="o">;</span></span>
<span id="LC1528" class="line" lang="java">        <span class="n">rolloverEnabled</span> <span class="o">=</span> <span class="n">b</span><span class="o">;</span></span>
<span id="LC1529" class="line" lang="java">        <span class="n">rolloverEnabledSet</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1530" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">ROLLOVER_ENABLED_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">rolloverEnabled</span><span class="o">);</span></span>
<span id="LC1531" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">b</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1532" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC1533" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1534" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1535" class="line" lang="java"></span>
<span id="LC1536" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1537" class="line" lang="java"><span class="cm">     * Returns the keyboard mnemonic from the the current model.</span></span>
<span id="LC1538" class="line" lang="java"><span class="cm">     * @return the keyboard mnemonic from the model</span></span>
<span id="LC1539" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1540" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getMnemonic</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1541" class="line" lang="java">        <span class="k">return</span> <span class="n">mnemonic</span><span class="o">;</span></span>
<span id="LC1542" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1543" class="line" lang="java"></span>
<span id="LC1544" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1545" class="line" lang="java"><span class="cm">     * Sets the keyboard mnemonic on the current model.</span></span>
<span id="LC1546" class="line" lang="java"><span class="cm">     * The mnemonic is the key which when combined with the look and feel's</span></span>
<span id="LC1547" class="line" lang="java"><span class="cm">     * mouseless modifier (usually Alt) will activate this button</span></span>
<span id="LC1548" class="line" lang="java"><span class="cm">     * if focus is contained somewhere within this button's ancestor</span></span>
<span id="LC1549" class="line" lang="java"><span class="cm">     * window.</span></span>
<span id="LC1550" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1551" class="line" lang="java"><span class="cm">     * A mnemonic must correspond to a single key on the keyboard</span></span>
<span id="LC1552" class="line" lang="java"><span class="cm">     * and should be specified using one of the &lt;code&gt;VK_XXX&lt;/code&gt;</span></span>
<span id="LC1553" class="line" lang="java"><span class="cm">     * keycodes defined in &lt;code&gt;java.awt.event.KeyEvent&lt;/code&gt;.</span></span>
<span id="LC1554" class="line" lang="java"><span class="cm">     * These codes and the wider array of codes for international</span></span>
<span id="LC1555" class="line" lang="java"><span class="cm">     * keyboards may be obtained through</span></span>
<span id="LC1556" class="line" lang="java"><span class="cm">     * &lt;code&gt;java.awt.event.KeyEvent.getExtendedKeyCodeForChar&lt;/code&gt;.</span></span>
<span id="LC1557" class="line" lang="java"><span class="cm">     * Mnemonics are case-insensitive, therefore a key event</span></span>
<span id="LC1558" class="line" lang="java"><span class="cm">     * with the corresponding keycode would cause the button to be</span></span>
<span id="LC1559" class="line" lang="java"><span class="cm">     * activated whether or not the Shift modifier was pressed.</span></span>
<span id="LC1560" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1561" class="line" lang="java"><span class="cm">     * If the character defined by the mnemonic is found within</span></span>
<span id="LC1562" class="line" lang="java"><span class="cm">     * the button's label string, the first occurrence of it</span></span>
<span id="LC1563" class="line" lang="java"><span class="cm">     * will be underlined to indicate the mnemonic to the user.</span></span>
<span id="LC1564" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1565" class="line" lang="java"><span class="cm">     * @param mnemonic the key code which represents the mnemonic</span></span>
<span id="LC1566" class="line" lang="java"><span class="cm">     * @see     java.awt.event.KeyEvent</span></span>
<span id="LC1567" class="line" lang="java"><span class="cm">     * @see     #setDisplayedMnemonicIndex</span></span>
<span id="LC1568" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1569" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1570" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1571" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1572" class="line" lang="java"><span class="cm">     *  description: the keyboard character mnemonic</span></span>
<span id="LC1573" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1574" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setMnemonic</span><span class="o">(</span><span class="kt">int</span> <span class="n">mnemonic</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1575" class="line" lang="java">        <span class="kt">int</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">getMnemonic</span><span class="o">();</span></span>
<span id="LC1576" class="line" lang="java">        <span class="n">model</span><span class="o">.</span><span class="na">setMnemonic</span><span class="o">(</span><span class="n">mnemonic</span><span class="o">);</span></span>
<span id="LC1577" class="line" lang="java">        <span class="n">updateMnemonicProperties</span><span class="o">();</span></span>
<span id="LC1578" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1579" class="line" lang="java"></span>
<span id="LC1580" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1581" class="line" lang="java"><span class="cm">     * This method is now obsolete, please use &lt;code&gt;setMnemonic(int)&lt;/code&gt;</span></span>
<span id="LC1582" class="line" lang="java"><span class="cm">     * to set the mnemonic for a button.  This method is only designed</span></span>
<span id="LC1583" class="line" lang="java"><span class="cm">     * to handle character values which fall between 'a' and 'z' or</span></span>
<span id="LC1584" class="line" lang="java"><span class="cm">     * 'A' and 'Z'.</span></span>
<span id="LC1585" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1586" class="line" lang="java"><span class="cm">     * @param mnemonic  a char specifying the mnemonic value</span></span>
<span id="LC1587" class="line" lang="java"><span class="cm">     * @see #setMnemonic(int)</span></span>
<span id="LC1588" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1589" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1590" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1591" class="line" lang="java"><span class="cm">     *  description: the keyboard character mnemonic</span></span>
<span id="LC1592" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1593" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setMnemonic</span><span class="o">(</span><span class="kt">char</span> <span class="n">mnemonic</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1594" class="line" lang="java">        <span class="kt">int</span> <span class="n">vk</span> <span class="o">=</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span> <span class="n">mnemonic</span><span class="o">;</span></span>
<span id="LC1595" class="line" lang="java">        <span class="k">if</span><span class="o">(</span><span class="n">vk</span> <span class="o">&gt;=</span> <span class="sc">'a'</span> <span class="o">&amp;&amp;</span> <span class="n">vk</span> <span class="o">&lt;=</span><span class="sc">'z'</span><span class="o">)</span></span>
<span id="LC1596" class="line" lang="java">            <span class="n">vk</span> <span class="o">-=</span> <span class="o">(</span><span class="sc">'a'</span> <span class="o">-</span> <span class="sc">'A'</span><span class="o">);</span></span>
<span id="LC1597" class="line" lang="java">        <span class="n">setMnemonic</span><span class="o">(</span><span class="n">vk</span><span class="o">);</span></span>
<span id="LC1598" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1599" class="line" lang="java"></span>
<span id="LC1600" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1601" class="line" lang="java"><span class="cm">     * Provides a hint to the look and feel as to which character in the</span></span>
<span id="LC1602" class="line" lang="java"><span class="cm">     * text should be decorated to represent the mnemonic. Not all look and</span></span>
<span id="LC1603" class="line" lang="java"><span class="cm">     * feels may support this. A value of -1 indicates either there is no</span></span>
<span id="LC1604" class="line" lang="java"><span class="cm">     * mnemonic, the mnemonic character is not contained in the string, or</span></span>
<span id="LC1605" class="line" lang="java"><span class="cm">     * the developer does not wish the mnemonic to be displayed.</span></span>
<span id="LC1606" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1607" class="line" lang="java"><span class="cm">     * The value of this is updated as the properties relating to the</span></span>
<span id="LC1608" class="line" lang="java"><span class="cm">     * mnemonic change (such as the mnemonic itself, the text...).</span></span>
<span id="LC1609" class="line" lang="java"><span class="cm">     * You should only ever have to call this if</span></span>
<span id="LC1610" class="line" lang="java"><span class="cm">     * you do not wish the default character to be underlined. For example, if</span></span>
<span id="LC1611" class="line" lang="java"><span class="cm">     * the text was 'Save As', with a mnemonic of 'a', and you wanted the 'A'</span></span>
<span id="LC1612" class="line" lang="java"><span class="cm">     * to be decorated, as 'Save &lt;u&gt;A&lt;/u&gt;s', you would have to invoke</span></span>
<span id="LC1613" class="line" lang="java"><span class="cm">     * &lt;code&gt;setDisplayedMnemonicIndex(5)&lt;/code&gt; after invoking</span></span>
<span id="LC1614" class="line" lang="java"><span class="cm">     * &lt;code&gt;setMnemonic(KeyEvent.VK_A)&lt;/code&gt;.</span></span>
<span id="LC1615" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1616" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC1617" class="line" lang="java"><span class="cm">     * @param index Index into the String to underline</span></span>
<span id="LC1618" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException will be thrown if &lt;code&gt;index&lt;/code&gt;</span></span>
<span id="LC1619" class="line" lang="java"><span class="cm">     *            is &amp;gt;= length of the text, or &amp;lt; -1</span></span>
<span id="LC1620" class="line" lang="java"><span class="cm">     * @see #getDisplayedMnemonicIndex</span></span>
<span id="LC1621" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1622" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1623" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1624" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1625" class="line" lang="java"><span class="cm">     *  description: the index into the String to draw the keyboard character</span></span>
<span id="LC1626" class="line" lang="java"><span class="cm">     *               mnemonic at</span></span>
<span id="LC1627" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1628" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setDisplayedMnemonicIndex</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span></span>
<span id="LC1629" class="line" lang="java">                                          <span class="kd">throws</span> <span class="nc">IllegalArgumentException</span> <span class="o">{</span></span>
<span id="LC1630" class="line" lang="java">        <span class="kt">int</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">mnemonicIndex</span><span class="o">;</span></span>
<span id="LC1631" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">==</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1632" class="line" lang="java">            <span class="n">mnemonicIndex</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC1633" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1634" class="line" lang="java">            <span class="nc">String</span> <span class="n">text</span> <span class="o">=</span> <span class="n">getText</span><span class="o">();</span></span>
<span id="LC1635" class="line" lang="java">            <span class="kt">int</span> <span class="n">textLength</span> <span class="o">=</span> <span class="o">(</span><span class="n">text</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span> <span class="mi">0</span> <span class="o">:</span> <span class="n">text</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC1636" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">&lt;</span> <span class="o">-</span><span class="mi">1</span> <span class="o">||</span> <span class="n">index</span> <span class="o">&gt;=</span> <span class="n">textLength</span><span class="o">)</span> <span class="o">{</span>  <span class="c1">// index out of range</span></span>
<span id="LC1637" class="line" lang="java">                <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="s">"index == "</span> <span class="o">+</span> <span class="n">index</span><span class="o">);</span></span>
<span id="LC1638" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1639" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1640" class="line" lang="java">        <span class="n">mnemonicIndex</span> <span class="o">=</span> <span class="n">index</span><span class="o">;</span></span>
<span id="LC1641" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="s">"displayedMnemonicIndex"</span><span class="o">,</span> <span class="n">oldValue</span><span class="o">,</span> <span class="n">index</span><span class="o">);</span></span>
<span id="LC1642" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">!=</span> <span class="n">oldValue</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1643" class="line" lang="java">            <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC1644" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC1645" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1646" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1647" class="line" lang="java"></span>
<span id="LC1648" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1649" class="line" lang="java"><span class="cm">     * Returns the character, as an index, that the look and feel should</span></span>
<span id="LC1650" class="line" lang="java"><span class="cm">     * provide decoration for as representing the mnemonic character.</span></span>
<span id="LC1651" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1652" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC1653" class="line" lang="java"><span class="cm">     * @return index representing mnemonic character</span></span>
<span id="LC1654" class="line" lang="java"><span class="cm">     * @see #setDisplayedMnemonicIndex</span></span>
<span id="LC1655" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1656" class="line" lang="java">    <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getDisplayedMnemonicIndex</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1657" class="line" lang="java">        <span class="k">return</span> <span class="n">mnemonicIndex</span><span class="o">;</span></span>
<span id="LC1658" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1659" class="line" lang="java"></span>
<span id="LC1660" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1661" class="line" lang="java"><span class="cm">     * Update the displayedMnemonicIndex property. This method</span></span>
<span id="LC1662" class="line" lang="java"><span class="cm">     * is called when either text or mnemonic changes. The new</span></span>
<span id="LC1663" class="line" lang="java"><span class="cm">     * value of the displayedMnemonicIndex property is the index</span></span>
<span id="LC1664" class="line" lang="java"><span class="cm">     * of the first occurrence of mnemonic in text.</span></span>
<span id="LC1665" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1666" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">updateDisplayedMnemonicIndex</span><span class="o">(</span><span class="nc">String</span> <span class="n">text</span><span class="o">,</span> <span class="kt">int</span> <span class="n">mnemonic</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1667" class="line" lang="java">        <span class="n">setDisplayedMnemonicIndex</span><span class="o">(</span></span>
<span id="LC1668" class="line" lang="java">            <span class="nc">SwingUtilities</span><span class="o">.</span><span class="na">findDisplayedMnemonicIndex</span><span class="o">(</span><span class="n">text</span><span class="o">,</span> <span class="n">mnemonic</span><span class="o">));</span></span>
<span id="LC1669" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1670" class="line" lang="java"></span>
<span id="LC1671" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1672" class="line" lang="java"><span class="cm">     * Brings the mnemonic property in accordance with model's mnemonic.</span></span>
<span id="LC1673" class="line" lang="java"><span class="cm">     * This is called when model's mnemonic changes. Also updates the</span></span>
<span id="LC1674" class="line" lang="java"><span class="cm">     * displayedMnemonicIndex property.</span></span>
<span id="LC1675" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1676" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">updateMnemonicProperties</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1677" class="line" lang="java">        <span class="kt">int</span> <span class="n">newMnemonic</span> <span class="o">=</span> <span class="n">model</span><span class="o">.</span><span class="na">getMnemonic</span><span class="o">();</span></span>
<span id="LC1678" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">mnemonic</span> <span class="o">!=</span> <span class="n">newMnemonic</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1679" class="line" lang="java">            <span class="kt">int</span> <span class="n">oldValue</span> <span class="o">=</span> <span class="n">mnemonic</span><span class="o">;</span></span>
<span id="LC1680" class="line" lang="java">            <span class="n">mnemonic</span> <span class="o">=</span> <span class="n">newMnemonic</span><span class="o">;</span></span>
<span id="LC1681" class="line" lang="java">            <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">MNEMONIC_CHANGED_PROPERTY</span><span class="o">,</span></span>
<span id="LC1682" class="line" lang="java">                               <span class="n">oldValue</span><span class="o">,</span> <span class="n">mnemonic</span><span class="o">);</span></span>
<span id="LC1683" class="line" lang="java">            <span class="n">updateDisplayedMnemonicIndex</span><span class="o">(</span><span class="n">getText</span><span class="o">(),</span> <span class="n">mnemonic</span><span class="o">);</span></span>
<span id="LC1684" class="line" lang="java">            <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC1685" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC1686" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1687" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1688" class="line" lang="java"></span>
<span id="LC1689" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1690" class="line" lang="java"><span class="cm">     * Sets the amount of time (in milliseconds) required between</span></span>
<span id="LC1691" class="line" lang="java"><span class="cm">     * mouse press events for the button to generate the corresponding</span></span>
<span id="LC1692" class="line" lang="java"><span class="cm">     * action events.  After the initial mouse press occurs (and action</span></span>
<span id="LC1693" class="line" lang="java"><span class="cm">     * event generated) any subsequent mouse press events which occur</span></span>
<span id="LC1694" class="line" lang="java"><span class="cm">     * on intervals less than the threshhold will be ignored and no</span></span>
<span id="LC1695" class="line" lang="java"><span class="cm">     * corresponding action event generated.  By default the threshhold is 0,</span></span>
<span id="LC1696" class="line" lang="java"><span class="cm">     * which means that for each mouse press, an action event will be</span></span>
<span id="LC1697" class="line" lang="java"><span class="cm">     * fired, no matter how quickly the mouse clicks occur.  In buttons</span></span>
<span id="LC1698" class="line" lang="java"><span class="cm">     * where this behavior is not desirable (for example, the "OK" button</span></span>
<span id="LC1699" class="line" lang="java"><span class="cm">     * in a dialog), this threshhold should be set to an appropriate</span></span>
<span id="LC1700" class="line" lang="java"><span class="cm">     * positive value.</span></span>
<span id="LC1701" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1702" class="line" lang="java"><span class="cm">     * @see #getMultiClickThreshhold</span></span>
<span id="LC1703" class="line" lang="java"><span class="cm">     * @param threshhold the amount of time required between mouse</span></span>
<span id="LC1704" class="line" lang="java"><span class="cm">     *        press events to generate corresponding action events</span></span>
<span id="LC1705" class="line" lang="java"><span class="cm">     * @exception   IllegalArgumentException if threshhold &amp;lt; 0</span></span>
<span id="LC1706" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC1707" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1708" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setMultiClickThreshhold</span><span class="o">(</span><span class="kt">long</span> <span class="n">threshhold</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1709" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">threshhold</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1710" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="s">"threshhold must be &gt;= 0"</span><span class="o">);</span></span>
<span id="LC1711" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1712" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">multiClickThreshhold</span> <span class="o">=</span> <span class="n">threshhold</span><span class="o">;</span></span>
<span id="LC1713" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1714" class="line" lang="java"></span>
<span id="LC1715" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1716" class="line" lang="java"><span class="cm">     * Gets the amount of time (in milliseconds) required between</span></span>
<span id="LC1717" class="line" lang="java"><span class="cm">     * mouse press events for the button to generate the corresponding</span></span>
<span id="LC1718" class="line" lang="java"><span class="cm">     * action events.</span></span>
<span id="LC1719" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1720" class="line" lang="java"><span class="cm">     * @see #setMultiClickThreshhold</span></span>
<span id="LC1721" class="line" lang="java"><span class="cm">     * @return the amount of time required between mouse press events</span></span>
<span id="LC1722" class="line" lang="java"><span class="cm">     *         to generate corresponding action events</span></span>
<span id="LC1723" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC1724" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1725" class="line" lang="java">    <span class="kd">public</span> <span class="kt">long</span> <span class="nf">getMultiClickThreshhold</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1726" class="line" lang="java">        <span class="k">return</span> <span class="n">multiClickThreshhold</span><span class="o">;</span></span>
<span id="LC1727" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1728" class="line" lang="java"></span>
<span id="LC1729" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1730" class="line" lang="java"><span class="cm">     * Returns the model that this button represents.</span></span>
<span id="LC1731" class="line" lang="java"><span class="cm">     * @return the &lt;code&gt;model&lt;/code&gt; property</span></span>
<span id="LC1732" class="line" lang="java"><span class="cm">     * @see #setModel</span></span>
<span id="LC1733" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1734" class="line" lang="java">    <span class="kd">public</span> <span class="nc">ButtonModel</span> <span class="nf">getModel</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1735" class="line" lang="java">        <span class="k">return</span> <span class="n">model</span><span class="o">;</span></span>
<span id="LC1736" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1737" class="line" lang="java"></span>
<span id="LC1738" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1739" class="line" lang="java"><span class="cm">     * Sets the model that this button represents.</span></span>
<span id="LC1740" class="line" lang="java"><span class="cm">     * @param newModel the new &lt;code&gt;ButtonModel&lt;/code&gt;</span></span>
<span id="LC1741" class="line" lang="java"><span class="cm">     * @see #getModel</span></span>
<span id="LC1742" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1743" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1744" class="line" lang="java"><span class="cm">     *  description: Model that the Button uses.</span></span>
<span id="LC1745" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1746" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setModel</span><span class="o">(</span><span class="nc">ButtonModel</span> <span class="n">newModel</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1747" class="line" lang="java"></span>
<span id="LC1748" class="line" lang="java">        <span class="nc">ButtonModel</span> <span class="n">oldModel</span> <span class="o">=</span> <span class="n">getModel</span><span class="o">();</span></span>
<span id="LC1749" class="line" lang="java"></span>
<span id="LC1750" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">oldModel</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1751" class="line" lang="java">            <span class="n">oldModel</span><span class="o">.</span><span class="na">removeChangeListener</span><span class="o">(</span><span class="n">changeListener</span><span class="o">);</span></span>
<span id="LC1752" class="line" lang="java">            <span class="n">oldModel</span><span class="o">.</span><span class="na">removeActionListener</span><span class="o">(</span><span class="n">actionListener</span><span class="o">);</span></span>
<span id="LC1753" class="line" lang="java">            <span class="n">oldModel</span><span class="o">.</span><span class="na">removeItemListener</span><span class="o">(</span><span class="n">itemListener</span><span class="o">);</span></span>
<span id="LC1754" class="line" lang="java">            <span class="n">changeListener</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1755" class="line" lang="java">            <span class="n">actionListener</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1756" class="line" lang="java">            <span class="n">itemListener</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1757" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1758" class="line" lang="java"></span>
<span id="LC1759" class="line" lang="java">        <span class="n">model</span> <span class="o">=</span> <span class="n">newModel</span><span class="o">;</span></span>
<span id="LC1760" class="line" lang="java"></span>
<span id="LC1761" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">newModel</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1762" class="line" lang="java">            <span class="n">changeListener</span> <span class="o">=</span> <span class="n">createChangeListener</span><span class="o">();</span></span>
<span id="LC1763" class="line" lang="java">            <span class="n">actionListener</span> <span class="o">=</span> <span class="n">createActionListener</span><span class="o">();</span></span>
<span id="LC1764" class="line" lang="java">            <span class="n">itemListener</span> <span class="o">=</span> <span class="n">createItemListener</span><span class="o">();</span></span>
<span id="LC1765" class="line" lang="java">            <span class="n">newModel</span><span class="o">.</span><span class="na">addChangeListener</span><span class="o">(</span><span class="n">changeListener</span><span class="o">);</span></span>
<span id="LC1766" class="line" lang="java">            <span class="n">newModel</span><span class="o">.</span><span class="na">addActionListener</span><span class="o">(</span><span class="n">actionListener</span><span class="o">);</span></span>
<span id="LC1767" class="line" lang="java">            <span class="n">newModel</span><span class="o">.</span><span class="na">addItemListener</span><span class="o">(</span><span class="n">itemListener</span><span class="o">);</span></span>
<span id="LC1768" class="line" lang="java"></span>
<span id="LC1769" class="line" lang="java">            <span class="n">updateMnemonicProperties</span><span class="o">();</span></span>
<span id="LC1770" class="line" lang="java">            <span class="c1">//We invoke setEnabled() from JComponent</span></span>
<span id="LC1771" class="line" lang="java">            <span class="c1">//because setModel() can be called from a constructor</span></span>
<span id="LC1772" class="line" lang="java">            <span class="c1">//when the button is not fully initialized</span></span>
<span id="LC1773" class="line" lang="java">            <span class="kd">super</span><span class="o">.</span><span class="na">setEnabled</span><span class="o">(</span><span class="n">newModel</span><span class="o">.</span><span class="na">isEnabled</span><span class="o">());</span></span>
<span id="LC1774" class="line" lang="java"></span>
<span id="LC1775" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1776" class="line" lang="java">            <span class="n">mnemonic</span> <span class="o">=</span> <span class="sc">'\0'</span><span class="o">;</span></span>
<span id="LC1777" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1778" class="line" lang="java"></span>
<span id="LC1779" class="line" lang="java">        <span class="n">updateDisplayedMnemonicIndex</span><span class="o">(</span><span class="n">getText</span><span class="o">(),</span> <span class="n">mnemonic</span><span class="o">);</span></span>
<span id="LC1780" class="line" lang="java"></span>
<span id="LC1781" class="line" lang="java">        <span class="n">firePropertyChange</span><span class="o">(</span><span class="no">MODEL_CHANGED_PROPERTY</span><span class="o">,</span> <span class="n">oldModel</span><span class="o">,</span> <span class="n">newModel</span><span class="o">);</span></span>
<span id="LC1782" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">newModel</span> <span class="o">!=</span> <span class="n">oldModel</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1783" class="line" lang="java">            <span class="n">revalidate</span><span class="o">();</span></span>
<span id="LC1784" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC1785" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1786" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1787" class="line" lang="java"></span>
<span id="LC1788" class="line" lang="java"></span>
<span id="LC1789" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1790" class="line" lang="java"><span class="cm">     * Returns the L&amp;amp;F object that renders this component.</span></span>
<span id="LC1791" class="line" lang="java"><span class="cm">     * @return the ButtonUI object</span></span>
<span id="LC1792" class="line" lang="java"><span class="cm">     * @see #setUI</span></span>
<span id="LC1793" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1794" class="line" lang="java">    <span class="kd">public</span> <span class="nc">ButtonUI</span> <span class="nf">getUI</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1795" class="line" lang="java">        <span class="k">return</span> <span class="o">(</span><span class="nc">ButtonUI</span><span class="o">)</span> <span class="n">ui</span><span class="o">;</span></span>
<span id="LC1796" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1797" class="line" lang="java"></span>
<span id="LC1798" class="line" lang="java"></span>
<span id="LC1799" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1800" class="line" lang="java"><span class="cm">     * Sets the L&amp;amp;F object that renders this component.</span></span>
<span id="LC1801" class="line" lang="java"><span class="cm">     * @param ui the &lt;code&gt;ButtonUI&lt;/code&gt; L&amp;amp;F object</span></span>
<span id="LC1802" class="line" lang="java"><span class="cm">     * @see #getUI</span></span>
<span id="LC1803" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC1804" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC1805" class="line" lang="java"><span class="cm">     *       hidden: true</span></span>
<span id="LC1806" class="line" lang="java"><span class="cm">     *    attribute: visualUpdate true</span></span>
<span id="LC1807" class="line" lang="java"><span class="cm">     *  description: The UI object that implements the LookAndFeel.</span></span>
<span id="LC1808" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1809" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setUI</span><span class="o">(</span><span class="nc">ButtonUI</span> <span class="n">ui</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1810" class="line" lang="java">        <span class="kd">super</span><span class="o">.</span><span class="na">setUI</span><span class="o">(</span><span class="n">ui</span><span class="o">);</span></span>
<span id="LC1811" class="line" lang="java">        <span class="c1">// disabled icons are generated by the LF so they should be unset here</span></span>
<span id="LC1812" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">disabledIcon</span> <span class="k">instanceof</span> <span class="nc">UIResource</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1813" class="line" lang="java">            <span class="n">setDisabledIcon</span><span class="o">(</span><span class="kc">null</span><span class="o">);</span></span>
<span id="LC1814" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1815" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">disabledSelectedIcon</span> <span class="k">instanceof</span> <span class="nc">UIResource</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1816" class="line" lang="java">            <span class="n">setDisabledSelectedIcon</span><span class="o">(</span><span class="kc">null</span><span class="o">);</span></span>
<span id="LC1817" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1818" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1819" class="line" lang="java"></span>
<span id="LC1820" class="line" lang="java"></span>
<span id="LC1821" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1822" class="line" lang="java"><span class="cm">     * Resets the UI property to a value from the current look</span></span>
<span id="LC1823" class="line" lang="java"><span class="cm">     * and feel.  Subtypes of &lt;code&gt;AbstractButton&lt;/code&gt;</span></span>
<span id="LC1824" class="line" lang="java"><span class="cm">     * should override this to update the UI. For</span></span>
<span id="LC1825" class="line" lang="java"><span class="cm">     * example, &lt;code&gt;JButton&lt;/code&gt; might do the following:</span></span>
<span id="LC1826" class="line" lang="java"><span class="cm">     * &lt;pre&gt;</span></span>
<span id="LC1827" class="line" lang="java"><span class="cm">     *      setUI((ButtonUI)UIManager.getUI(</span></span>
<span id="LC1828" class="line" lang="java"><span class="cm">     *          "ButtonUI", "javax.swing.plaf.basic.BasicButtonUI", this));</span></span>
<span id="LC1829" class="line" lang="java"><span class="cm">     * &lt;/pre&gt;</span></span>
<span id="LC1830" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1831" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">updateUI</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1832" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1833" class="line" lang="java"></span>
<span id="LC1834" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1835" class="line" lang="java"><span class="cm">     * Adds the specified component to this container at the specified</span></span>
<span id="LC1836" class="line" lang="java"><span class="cm">     * index, refer to</span></span>
<span id="LC1837" class="line" lang="java"><span class="cm">     * {@link java.awt.Container#addImpl(Component, Object, int)}</span></span>
<span id="LC1838" class="line" lang="java"><span class="cm">     * for a complete description of this method.</span></span>
<span id="LC1839" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1840" class="line" lang="java"><span class="cm">     * @param     comp the component to be added</span></span>
<span id="LC1841" class="line" lang="java"><span class="cm">     * @param     constraints an object expressing layout constraints</span></span>
<span id="LC1842" class="line" lang="java"><span class="cm">     *                 for this component</span></span>
<span id="LC1843" class="line" lang="java"><span class="cm">     * @param     index the position in the container's list at which to</span></span>
<span id="LC1844" class="line" lang="java"><span class="cm">     *                 insert the component, where &lt;code&gt;-1&lt;/code&gt;</span></span>
<span id="LC1845" class="line" lang="java"><span class="cm">     *                 means append to the end</span></span>
<span id="LC1846" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException if &lt;code&gt;index&lt;/code&gt; is invalid</span></span>
<span id="LC1847" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException if adding the container's parent</span></span>
<span id="LC1848" class="line" lang="java"><span class="cm">     *                  to itself</span></span>
<span id="LC1849" class="line" lang="java"><span class="cm">     * @exception IllegalArgumentException if adding a window to a container</span></span>
<span id="LC1850" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC1851" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1852" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">addImpl</span><span class="o">(</span><span class="nc">Component</span> <span class="n">comp</span><span class="o">,</span> <span class="nc">Object</span> <span class="n">constraints</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1853" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">setLayout</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1854" class="line" lang="java">            <span class="n">setLayout</span><span class="o">(</span><span class="k">new</span> <span class="nc">OverlayLayout</span><span class="o">(</span><span class="k">this</span><span class="o">));</span></span>
<span id="LC1855" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1856" class="line" lang="java">        <span class="kd">super</span><span class="o">.</span><span class="na">addImpl</span><span class="o">(</span><span class="n">comp</span><span class="o">,</span> <span class="n">constraints</span><span class="o">,</span> <span class="n">index</span><span class="o">);</span></span>
<span id="LC1857" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1858" class="line" lang="java"></span>
<span id="LC1859" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1860" class="line" lang="java"><span class="cm">     * Sets the layout manager for this container, refer to</span></span>
<span id="LC1861" class="line" lang="java"><span class="cm">     * {@link java.awt.Container#setLayout(LayoutManager)}</span></span>
<span id="LC1862" class="line" lang="java"><span class="cm">     * for a complete description of this method.</span></span>
<span id="LC1863" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1864" class="line" lang="java"><span class="cm">     * @param mgr the specified layout manager</span></span>
<span id="LC1865" class="line" lang="java"><span class="cm">     * @since 1.5</span></span>
<span id="LC1866" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1867" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setLayout</span><span class="o">(</span><span class="nc">LayoutManager</span> <span class="n">mgr</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1868" class="line" lang="java">        <span class="n">setLayout</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1869" class="line" lang="java">        <span class="kd">super</span><span class="o">.</span><span class="na">setLayout</span><span class="o">(</span><span class="n">mgr</span><span class="o">);</span></span>
<span id="LC1870" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1871" class="line" lang="java"></span>
<span id="LC1872" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1873" class="line" lang="java"><span class="cm">     * Adds a &lt;code&gt;ChangeListener&lt;/code&gt; to the button.</span></span>
<span id="LC1874" class="line" lang="java"><span class="cm">     * @param l the listener to be added</span></span>
<span id="LC1875" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1876" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">addChangeListener</span><span class="o">(</span><span class="nc">ChangeListener</span> <span class="n">l</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1877" class="line" lang="java">        <span class="n">listenerList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="nc">ChangeListener</span><span class="o">.</span><span class="na">class</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span></span>
<span id="LC1878" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1879" class="line" lang="java"></span>
<span id="LC1880" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1881" class="line" lang="java"><span class="cm">     * Removes a ChangeListener from the button.</span></span>
<span id="LC1882" class="line" lang="java"><span class="cm">     * @param l the listener to be removed</span></span>
<span id="LC1883" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1884" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">removeChangeListener</span><span class="o">(</span><span class="nc">ChangeListener</span> <span class="n">l</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1885" class="line" lang="java">        <span class="n">listenerList</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="nc">ChangeListener</span><span class="o">.</span><span class="na">class</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span></span>
<span id="LC1886" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1887" class="line" lang="java"></span>
<span id="LC1888" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1889" class="line" lang="java"><span class="cm">     * Returns an array of all the &lt;code&gt;ChangeListener&lt;/code&gt;s added</span></span>
<span id="LC1890" class="line" lang="java"><span class="cm">     * to this AbstractButton with addChangeListener().</span></span>
<span id="LC1891" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1892" class="line" lang="java"><span class="cm">     * @return all of the &lt;code&gt;ChangeListener&lt;/code&gt;s added or an empty</span></span>
<span id="LC1893" class="line" lang="java"><span class="cm">     *         array if no listeners have been added</span></span>
<span id="LC1894" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC1895" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1896" class="line" lang="java">    <span class="kd">public</span> <span class="nc">ChangeListener</span><span class="o">[]</span> <span class="nf">getChangeListeners</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1897" class="line" lang="java">        <span class="k">return</span> <span class="n">listenerList</span><span class="o">.</span><span class="na">getListeners</span><span class="o">(</span><span class="nc">ChangeListener</span><span class="o">.</span><span class="na">class</span><span class="o">);</span></span>
<span id="LC1898" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1899" class="line" lang="java"></span>
<span id="LC1900" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1901" class="line" lang="java"><span class="cm">     * Notifies all listeners that have registered interest for</span></span>
<span id="LC1902" class="line" lang="java"><span class="cm">     * notification on this event type.  The event instance</span></span>
<span id="LC1903" class="line" lang="java"><span class="cm">     * is lazily created.</span></span>
<span id="LC1904" class="line" lang="java"><span class="cm">     * @see EventListenerList</span></span>
<span id="LC1905" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1906" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">fireStateChanged</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1907" class="line" lang="java">        <span class="c1">// Guaranteed to return a non-null array</span></span>
<span id="LC1908" class="line" lang="java">        <span class="nc">Object</span><span class="o">[]</span> <span class="n">listeners</span> <span class="o">=</span> <span class="n">listenerList</span><span class="o">.</span><span class="na">getListenerList</span><span class="o">();</span></span>
<span id="LC1909" class="line" lang="java">        <span class="c1">// Process the listeners last to first, notifying</span></span>
<span id="LC1910" class="line" lang="java">        <span class="c1">// those that are interested in this event</span></span>
<span id="LC1911" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">listeners</span><span class="o">.</span><span class="na">length</span><span class="o">-</span><span class="mi">2</span><span class="o">;</span> <span class="n">i</span><span class="o">&gt;=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span><span class="o">-=</span><span class="mi">2</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1912" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">listeners</span><span class="o">[</span><span class="n">i</span><span class="o">]==</span><span class="nc">ChangeListener</span><span class="o">.</span><span class="na">class</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1913" class="line" lang="java">                <span class="c1">// Lazily create the event:</span></span>
<span id="LC1914" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">changeEvent</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC1915" class="line" lang="java">                    <span class="n">changeEvent</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">ChangeEvent</span><span class="o">(</span><span class="k">this</span><span class="o">);</span></span>
<span id="LC1916" class="line" lang="java">                <span class="o">((</span><span class="nc">ChangeListener</span><span class="o">)</span><span class="n">listeners</span><span class="o">[</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">]).</span><span class="na">stateChanged</span><span class="o">(</span><span class="n">changeEvent</span><span class="o">);</span></span>
<span id="LC1917" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC1918" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1919" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1920" class="line" lang="java"></span>
<span id="LC1921" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1922" class="line" lang="java"><span class="cm">     * Adds an &lt;code&gt;ActionListener&lt;/code&gt; to the button.</span></span>
<span id="LC1923" class="line" lang="java"><span class="cm">     * @param l the &lt;code&gt;ActionListener&lt;/code&gt; to be added</span></span>
<span id="LC1924" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1925" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">addActionListener</span><span class="o">(</span><span class="nc">ActionListener</span> <span class="n">l</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1926" class="line" lang="java">        <span class="n">listenerList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="nc">ActionListener</span><span class="o">.</span><span class="na">class</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span></span>
<span id="LC1927" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1928" class="line" lang="java"></span>
<span id="LC1929" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1930" class="line" lang="java"><span class="cm">     * Removes an &lt;code&gt;ActionListener&lt;/code&gt; from the button.</span></span>
<span id="LC1931" class="line" lang="java"><span class="cm">     * If the listener is the currently set &lt;code&gt;Action&lt;/code&gt;</span></span>
<span id="LC1932" class="line" lang="java"><span class="cm">     * for the button, then the &lt;code&gt;Action&lt;/code&gt;</span></span>
<span id="LC1933" class="line" lang="java"><span class="cm">     * is set to &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC1934" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1935" class="line" lang="java"><span class="cm">     * @param l the listener to be removed</span></span>
<span id="LC1936" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1937" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">removeActionListener</span><span class="o">(</span><span class="nc">ActionListener</span> <span class="n">l</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1938" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">l</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">getAction</span><span class="o">()</span> <span class="o">==</span> <span class="n">l</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC1939" class="line" lang="java">            <span class="n">setAction</span><span class="o">(</span><span class="kc">null</span><span class="o">);</span></span>
<span id="LC1940" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1941" class="line" lang="java">            <span class="n">listenerList</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="nc">ActionListener</span><span class="o">.</span><span class="na">class</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span></span>
<span id="LC1942" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1943" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1944" class="line" lang="java"></span>
<span id="LC1945" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1946" class="line" lang="java"><span class="cm">     * Returns an array of all the &lt;code&gt;ActionListener&lt;/code&gt;s added</span></span>
<span id="LC1947" class="line" lang="java"><span class="cm">     * to this AbstractButton with addActionListener().</span></span>
<span id="LC1948" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1949" class="line" lang="java"><span class="cm">     * @return all of the &lt;code&gt;ActionListener&lt;/code&gt;s added or an empty</span></span>
<span id="LC1950" class="line" lang="java"><span class="cm">     *         array if no listeners have been added</span></span>
<span id="LC1951" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC1952" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1953" class="line" lang="java">    <span class="kd">public</span> <span class="nc">ActionListener</span><span class="o">[]</span> <span class="nf">getActionListeners</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1954" class="line" lang="java">        <span class="k">return</span> <span class="n">listenerList</span><span class="o">.</span><span class="na">getListeners</span><span class="o">(</span><span class="nc">ActionListener</span><span class="o">.</span><span class="na">class</span><span class="o">);</span></span>
<span id="LC1955" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1956" class="line" lang="java"></span>
<span id="LC1957" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1958" class="line" lang="java"><span class="cm">     * Subclasses that want to handle &lt;code&gt;ChangeEvents&lt;/code&gt; differently</span></span>
<span id="LC1959" class="line" lang="java"><span class="cm">     * can override this to return another &lt;code&gt;ChangeListener&lt;/code&gt;</span></span>
<span id="LC1960" class="line" lang="java"><span class="cm">     * implementation.</span></span>
<span id="LC1961" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1962" class="line" lang="java"><span class="cm">     * @return the new &lt;code&gt;ChangeListener&lt;/code&gt;</span></span>
<span id="LC1963" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1964" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">ChangeListener</span> <span class="nf">createChangeListener</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1965" class="line" lang="java">        <span class="k">return</span> <span class="nf">getHandler</span><span class="o">();</span></span>
<span id="LC1966" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1967" class="line" lang="java"></span>
<span id="LC1968" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1969" class="line" lang="java"><span class="cm">     * Extends &lt;code&gt;ChangeListener&lt;/code&gt; to be serializable.</span></span>
<span id="LC1970" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1971" class="line" lang="java"><span class="cm">     * &lt;strong&gt;Warning:&lt;/strong&gt;</span></span>
<span id="LC1972" class="line" lang="java"><span class="cm">     * Serialized objects of this class will not be compatible with</span></span>
<span id="LC1973" class="line" lang="java"><span class="cm">     * future Swing releases. The current serialization support is</span></span>
<span id="LC1974" class="line" lang="java"><span class="cm">     * appropriate for short term storage or RMI between applications running</span></span>
<span id="LC1975" class="line" lang="java"><span class="cm">     * the same version of Swing.  As of 1.4, support for long term storage</span></span>
<span id="LC1976" class="line" lang="java"><span class="cm">     * of all JavaBeans&amp;trade;</span></span>
<span id="LC1977" class="line" lang="java"><span class="cm">     * has been added to the &lt;code&gt;java.beans&lt;/code&gt; package.</span></span>
<span id="LC1978" class="line" lang="java"><span class="cm">     * Please see {@link java.beans.XMLEncoder}.</span></span>
<span id="LC1979" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1980" class="line" lang="java">    <span class="nd">@SuppressWarnings</span><span class="o">(</span><span class="s">"serial"</span><span class="o">)</span></span>
<span id="LC1981" class="line" lang="java">    <span class="kd">protected</span> <span class="kd">class</span> <span class="nc">ButtonChangeListener</span> <span class="kd">implements</span> <span class="nc">ChangeListener</span><span class="o">,</span> <span class="nc">Serializable</span> <span class="o">{</span></span>
<span id="LC1982" class="line" lang="java">        <span class="c1">// NOTE: This class is NOT used, instead the functionality has</span></span>
<span id="LC1983" class="line" lang="java">        <span class="c1">// been moved to Handler.</span></span>
<span id="LC1984" class="line" lang="java">        <span class="nc">ButtonChangeListener</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1985" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1986" class="line" lang="java"></span>
<span id="LC1987" class="line" lang="java">        <span class="kd">public</span> <span class="kt">void</span> <span class="nf">stateChanged</span><span class="o">(</span><span class="nc">ChangeEvent</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1988" class="line" lang="java">            <span class="n">getHandler</span><span class="o">().</span><span class="na">stateChanged</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></span>
<span id="LC1989" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1990" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1991" class="line" lang="java"></span>
<span id="LC1992" class="line" lang="java"></span>
<span id="LC1993" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1994" class="line" lang="java"><span class="cm">     * Notifies all listeners that have registered interest for</span></span>
<span id="LC1995" class="line" lang="java"><span class="cm">     * notification on this event type.  The event instance</span></span>
<span id="LC1996" class="line" lang="java"><span class="cm">     * is lazily created using the &lt;code&gt;event&lt;/code&gt;</span></span>
<span id="LC1997" class="line" lang="java"><span class="cm">     * parameter.</span></span>
<span id="LC1998" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1999" class="line" lang="java"><span class="cm">     * @param event  the &lt;code&gt;ActionEvent&lt;/code&gt; object</span></span>
<span id="LC2000" class="line" lang="java"><span class="cm">     * @see EventListenerList</span></span>
<span id="LC2001" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2002" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">fireActionPerformed</span><span class="o">(</span><span class="nc">ActionEvent</span> <span class="n">event</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2003" class="line" lang="java">        <span class="c1">// Guaranteed to return a non-null array</span></span>
<span id="LC2004" class="line" lang="java">        <span class="nc">Object</span><span class="o">[]</span> <span class="n">listeners</span> <span class="o">=</span> <span class="n">listenerList</span><span class="o">.</span><span class="na">getListenerList</span><span class="o">();</span></span>
<span id="LC2005" class="line" lang="java">        <span class="nc">ActionEvent</span> <span class="n">e</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2006" class="line" lang="java">        <span class="c1">// Process the listeners last to first, notifying</span></span>
<span id="LC2007" class="line" lang="java">        <span class="c1">// those that are interested in this event</span></span>
<span id="LC2008" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">listeners</span><span class="o">.</span><span class="na">length</span><span class="o">-</span><span class="mi">2</span><span class="o">;</span> <span class="n">i</span><span class="o">&gt;=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span><span class="o">-=</span><span class="mi">2</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2009" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">listeners</span><span class="o">[</span><span class="n">i</span><span class="o">]==</span><span class="nc">ActionListener</span><span class="o">.</span><span class="na">class</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2010" class="line" lang="java">                <span class="c1">// Lazily create the event:</span></span>
<span id="LC2011" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">e</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2012" class="line" lang="java">                      <span class="nc">String</span> <span class="n">actionCommand</span> <span class="o">=</span> <span class="n">event</span><span class="o">.</span><span class="na">getActionCommand</span><span class="o">();</span></span>
<span id="LC2013" class="line" lang="java">                      <span class="k">if</span><span class="o">(</span><span class="n">actionCommand</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2014" class="line" lang="java">                         <span class="n">actionCommand</span> <span class="o">=</span> <span class="n">getActionCommand</span><span class="o">();</span></span>
<span id="LC2015" class="line" lang="java">                      <span class="o">}</span></span>
<span id="LC2016" class="line" lang="java">                      <span class="n">e</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">ActionEvent</span><span class="o">(</span><span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">,</span></span>
<span id="LC2017" class="line" lang="java">                                          <span class="nc">ActionEvent</span><span class="o">.</span><span class="na">ACTION_PERFORMED</span><span class="o">,</span></span>
<span id="LC2018" class="line" lang="java">                                          <span class="n">actionCommand</span><span class="o">,</span></span>
<span id="LC2019" class="line" lang="java">                                          <span class="n">event</span><span class="o">.</span><span class="na">getWhen</span><span class="o">(),</span></span>
<span id="LC2020" class="line" lang="java">                                          <span class="n">event</span><span class="o">.</span><span class="na">getModifiers</span><span class="o">());</span></span>
<span id="LC2021" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2022" class="line" lang="java">                <span class="o">((</span><span class="nc">ActionListener</span><span class="o">)</span><span class="n">listeners</span><span class="o">[</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">]).</span><span class="na">actionPerformed</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></span>
<span id="LC2023" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2024" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2025" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2026" class="line" lang="java"></span>
<span id="LC2027" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2028" class="line" lang="java"><span class="cm">     * Notifies all listeners that have registered interest for</span></span>
<span id="LC2029" class="line" lang="java"><span class="cm">     * notification on this event type.  The event instance</span></span>
<span id="LC2030" class="line" lang="java"><span class="cm">     * is lazily created using the &lt;code&gt;event&lt;/code&gt; parameter.</span></span>
<span id="LC2031" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC2032" class="line" lang="java"><span class="cm">     * @param event  the &lt;code&gt;ItemEvent&lt;/code&gt; object</span></span>
<span id="LC2033" class="line" lang="java"><span class="cm">     * @see EventListenerList</span></span>
<span id="LC2034" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2035" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">fireItemStateChanged</span><span class="o">(</span><span class="nc">ItemEvent</span> <span class="n">event</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2036" class="line" lang="java">        <span class="c1">// Guaranteed to return a non-null array</span></span>
<span id="LC2037" class="line" lang="java">        <span class="nc">Object</span><span class="o">[]</span> <span class="n">listeners</span> <span class="o">=</span> <span class="n">listenerList</span><span class="o">.</span><span class="na">getListenerList</span><span class="o">();</span></span>
<span id="LC2038" class="line" lang="java">        <span class="nc">ItemEvent</span> <span class="n">e</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2039" class="line" lang="java">        <span class="c1">// Process the listeners last to first, notifying</span></span>
<span id="LC2040" class="line" lang="java">        <span class="c1">// those that are interested in this event</span></span>
<span id="LC2041" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">listeners</span><span class="o">.</span><span class="na">length</span><span class="o">-</span><span class="mi">2</span><span class="o">;</span> <span class="n">i</span><span class="o">&gt;=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span><span class="o">-=</span><span class="mi">2</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2042" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">listeners</span><span class="o">[</span><span class="n">i</span><span class="o">]==</span><span class="nc">ItemListener</span><span class="o">.</span><span class="na">class</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2043" class="line" lang="java">                <span class="c1">// Lazily create the event:</span></span>
<span id="LC2044" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">e</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2045" class="line" lang="java">                    <span class="n">e</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">ItemEvent</span><span class="o">(</span><span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">,</span></span>
<span id="LC2046" class="line" lang="java">                                      <span class="nc">ItemEvent</span><span class="o">.</span><span class="na">ITEM_STATE_CHANGED</span><span class="o">,</span></span>
<span id="LC2047" class="line" lang="java">                                      <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">,</span></span>
<span id="LC2048" class="line" lang="java">                                      <span class="n">event</span><span class="o">.</span><span class="na">getStateChange</span><span class="o">());</span></span>
<span id="LC2049" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2050" class="line" lang="java">                <span class="o">((</span><span class="nc">ItemListener</span><span class="o">)</span><span class="n">listeners</span><span class="o">[</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">]).</span><span class="na">itemStateChanged</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></span>
<span id="LC2051" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2052" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2053" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">accessibleContext</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2054" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">event</span><span class="o">.</span><span class="na">getStateChange</span><span class="o">()</span> <span class="o">==</span> <span class="nc">ItemEvent</span><span class="o">.</span><span class="na">SELECTED</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2055" class="line" lang="java">                <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC2056" class="line" lang="java">                    <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_STATE_PROPERTY</span><span class="o">,</span></span>
<span id="LC2057" class="line" lang="java">                    <span class="kc">null</span><span class="o">,</span> <span class="nc">AccessibleState</span><span class="o">.</span><span class="na">SELECTED</span><span class="o">);</span></span>
<span id="LC2058" class="line" lang="java">                <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC2059" class="line" lang="java">                    <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VALUE_PROPERTY</span><span class="o">,</span></span>
<span id="LC2060" class="line" lang="java">                    <span class="nc">Integer</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="mi">0</span><span class="o">),</span> <span class="nc">Integer</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="mi">1</span><span class="o">));</span></span>
<span id="LC2061" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2062" class="line" lang="java">                <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC2063" class="line" lang="java">                    <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_STATE_PROPERTY</span><span class="o">,</span></span>
<span id="LC2064" class="line" lang="java">                    <span class="nc">AccessibleState</span><span class="o">.</span><span class="na">SELECTED</span><span class="o">,</span> <span class="kc">null</span><span class="o">);</span></span>
<span id="LC2065" class="line" lang="java">                <span class="n">accessibleContext</span><span class="o">.</span><span class="na">firePropertyChange</span><span class="o">(</span></span>
<span id="LC2066" class="line" lang="java">                    <span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_VALUE_PROPERTY</span><span class="o">,</span></span>
<span id="LC2067" class="line" lang="java">                    <span class="nc">Integer</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="mi">1</span><span class="o">),</span> <span class="nc">Integer</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="mi">0</span><span class="o">));</span></span>
<span id="LC2068" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2069" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2070" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2071" class="line" lang="java"></span>
<span id="LC2072" class="line" lang="java"></span>
<span id="LC2073" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">ActionListener</span> <span class="nf">createActionListener</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2074" class="line" lang="java">        <span class="k">return</span> <span class="nf">getHandler</span><span class="o">();</span></span>
<span id="LC2075" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2076" class="line" lang="java"></span>
<span id="LC2077" class="line" lang="java"></span>
<span id="LC2078" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">ItemListener</span> <span class="nf">createItemListener</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2079" class="line" lang="java">        <span class="k">return</span> <span class="nf">getHandler</span><span class="o">();</span></span>
<span id="LC2080" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2081" class="line" lang="java"></span>
<span id="LC2082" class="line" lang="java"></span>
<span id="LC2083" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2084" class="line" lang="java"><span class="cm">     * Enables (or disables) the button.</span></span>
<span id="LC2085" class="line" lang="java"><span class="cm">     * @param b  true to enable the button, otherwise false</span></span>
<span id="LC2086" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2087" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setEnabled</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">b</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2088" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">b</span> <span class="o">&amp;&amp;</span> <span class="n">model</span><span class="o">.</span><span class="na">isRollover</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2089" class="line" lang="java">            <span class="n">model</span><span class="o">.</span><span class="na">setRollover</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC2090" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2091" class="line" lang="java">        <span class="kd">super</span><span class="o">.</span><span class="na">setEnabled</span><span class="o">(</span><span class="n">b</span><span class="o">);</span></span>
<span id="LC2092" class="line" lang="java">        <span class="n">model</span><span class="o">.</span><span class="na">setEnabled</span><span class="o">(</span><span class="n">b</span><span class="o">);</span></span>
<span id="LC2093" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2094" class="line" lang="java"></span>
<span id="LC2095" class="line" lang="java">    <span class="c1">// *** Deprecated java.awt.Button APIs below *** //</span></span>
<span id="LC2096" class="line" lang="java"></span>
<span id="LC2097" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2098" class="line" lang="java"><span class="cm">     * Returns the label text.</span></span>
<span id="LC2099" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC2100" class="line" lang="java"><span class="cm">     * @return a &lt;code&gt;String&lt;/code&gt; containing the label</span></span>
<span id="LC2101" class="line" lang="java"><span class="cm">     * @deprecated - Replaced by &lt;code&gt;getText&lt;/code&gt;</span></span>
<span id="LC2102" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2103" class="line" lang="java">    <span class="nd">@Deprecated</span></span>
<span id="LC2104" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getLabel</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2105" class="line" lang="java">        <span class="k">return</span> <span class="nf">getText</span><span class="o">();</span></span>
<span id="LC2106" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2107" class="line" lang="java"></span>
<span id="LC2108" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2109" class="line" lang="java"><span class="cm">     * Sets the label text.</span></span>
<span id="LC2110" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC2111" class="line" lang="java"><span class="cm">     * @param label  a &lt;code&gt;String&lt;/code&gt; containing the text</span></span>
<span id="LC2112" class="line" lang="java"><span class="cm">     * @deprecated - Replaced by &lt;code&gt;setText(text)&lt;/code&gt;</span></span>
<span id="LC2113" class="line" lang="java"><span class="cm">     * @beaninfo</span></span>
<span id="LC2114" class="line" lang="java"><span class="cm">     *        bound: true</span></span>
<span id="LC2115" class="line" lang="java"><span class="cm">     *  description: Replace by setText(text)</span></span>
<span id="LC2116" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2117" class="line" lang="java">    <span class="nd">@Deprecated</span></span>
<span id="LC2118" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setLabel</span><span class="o">(</span><span class="nc">String</span> <span class="n">label</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2119" class="line" lang="java">        <span class="n">setText</span><span class="o">(</span><span class="n">label</span><span class="o">);</span></span>
<span id="LC2120" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2121" class="line" lang="java"></span>
<span id="LC2122" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2123" class="line" lang="java"><span class="cm">     * Adds an &lt;code&gt;ItemListener&lt;/code&gt; to the &lt;code&gt;checkbox&lt;/code&gt;.</span></span>
<span id="LC2124" class="line" lang="java"><span class="cm">     * @param l  the &lt;code&gt;ItemListener&lt;/code&gt; to be added</span></span>
<span id="LC2125" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2126" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">addItemListener</span><span class="o">(</span><span class="nc">ItemListener</span> <span class="n">l</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2127" class="line" lang="java">        <span class="n">listenerList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="nc">ItemListener</span><span class="o">.</span><span class="na">class</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span></span>
<span id="LC2128" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2129" class="line" lang="java"></span>
<span id="LC2130" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2131" class="line" lang="java"><span class="cm">     * Removes an &lt;code&gt;ItemListener&lt;/code&gt; from the button.</span></span>
<span id="LC2132" class="line" lang="java"><span class="cm">     * @param l the &lt;code&gt;ItemListener&lt;/code&gt; to be removed</span></span>
<span id="LC2133" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2134" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">removeItemListener</span><span class="o">(</span><span class="nc">ItemListener</span> <span class="n">l</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2135" class="line" lang="java">        <span class="n">listenerList</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="nc">ItemListener</span><span class="o">.</span><span class="na">class</span><span class="o">,</span> <span class="n">l</span><span class="o">);</span></span>
<span id="LC2136" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2137" class="line" lang="java"></span>
<span id="LC2138" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2139" class="line" lang="java"><span class="cm">     * Returns an array of all the &lt;code&gt;ItemListener&lt;/code&gt;s added</span></span>
<span id="LC2140" class="line" lang="java"><span class="cm">     * to this AbstractButton with addItemListener().</span></span>
<span id="LC2141" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC2142" class="line" lang="java"><span class="cm">     * @return all of the &lt;code&gt;ItemListener&lt;/code&gt;s added or an empty</span></span>
<span id="LC2143" class="line" lang="java"><span class="cm">     *         array if no listeners have been added</span></span>
<span id="LC2144" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC2145" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2146" class="line" lang="java">    <span class="kd">public</span> <span class="nc">ItemListener</span><span class="o">[]</span> <span class="nf">getItemListeners</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2147" class="line" lang="java">        <span class="k">return</span> <span class="n">listenerList</span><span class="o">.</span><span class="na">getListeners</span><span class="o">(</span><span class="nc">ItemListener</span><span class="o">.</span><span class="na">class</span><span class="o">);</span></span>
<span id="LC2148" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2149" class="line" lang="java"></span>
<span id="LC2150" class="line" lang="java">   <span class="cm">/**</span></span>
<span id="LC2151" class="line" lang="java"><span class="cm">     * Returns an array (length 1) containing the label or</span></span>
<span id="LC2152" class="line" lang="java"><span class="cm">     * &lt;code&gt;null&lt;/code&gt; if the button is not selected.</span></span>
<span id="LC2153" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC2154" class="line" lang="java"><span class="cm">     * @return an array containing 1 Object: the text of the button,</span></span>
<span id="LC2155" class="line" lang="java"><span class="cm">     *         if the item is selected; otherwise &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC2156" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2157" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Object</span><span class="o">[]</span> <span class="nf">getSelectedObjects</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2158" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">isSelected</span><span class="o">()</span> <span class="o">==</span> <span class="kc">false</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2159" class="line" lang="java">            <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2160" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2161" class="line" lang="java">        <span class="nc">Object</span><span class="o">[]</span> <span class="n">selectedObjects</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Object</span><span class="o">[</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC2162" class="line" lang="java">        <span class="n">selectedObjects</span><span class="o">[</span><span class="mi">0</span><span class="o">]</span> <span class="o">=</span> <span class="n">getText</span><span class="o">();</span></span>
<span id="LC2163" class="line" lang="java">        <span class="k">return</span> <span class="n">selectedObjects</span><span class="o">;</span></span>
<span id="LC2164" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2165" class="line" lang="java"></span>
<span id="LC2166" class="line" lang="java">    <span class="kd">protected</span> <span class="kt">void</span> <span class="nf">init</span><span class="o">(</span><span class="nc">String</span> <span class="n">text</span><span class="o">,</span> <span class="nc">Icon</span> <span class="n">icon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2167" class="line" lang="java">        <span class="k">if</span><span class="o">(</span><span class="n">text</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2168" class="line" lang="java">            <span class="n">setText</span><span class="o">(</span><span class="n">text</span><span class="o">);</span></span>
<span id="LC2169" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2170" class="line" lang="java"></span>
<span id="LC2171" class="line" lang="java">        <span class="k">if</span><span class="o">(</span><span class="n">icon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2172" class="line" lang="java">            <span class="n">setIcon</span><span class="o">(</span><span class="n">icon</span><span class="o">);</span></span>
<span id="LC2173" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2174" class="line" lang="java"></span>
<span id="LC2175" class="line" lang="java">        <span class="c1">// Set the UI</span></span>
<span id="LC2176" class="line" lang="java">        <span class="n">updateUI</span><span class="o">();</span></span>
<span id="LC2177" class="line" lang="java"></span>
<span id="LC2178" class="line" lang="java">        <span class="n">setAlignmentX</span><span class="o">(</span><span class="no">LEFT_ALIGNMENT</span><span class="o">);</span></span>
<span id="LC2179" class="line" lang="java">        <span class="n">setAlignmentY</span><span class="o">(</span><span class="no">CENTER_ALIGNMENT</span><span class="o">);</span></span>
<span id="LC2180" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2181" class="line" lang="java"></span>
<span id="LC2182" class="line" lang="java"></span>
<span id="LC2183" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2184" class="line" lang="java"><span class="cm">     * This is overridden to return false if the current &lt;code&gt;Icon&lt;/code&gt;'s</span></span>
<span id="LC2185" class="line" lang="java"><span class="cm">     * &lt;code&gt;Image&lt;/code&gt; is not equal to the</span></span>
<span id="LC2186" class="line" lang="java"><span class="cm">     * passed in &lt;code&gt;Image&lt;/code&gt; &lt;code&gt;img&lt;/code&gt;.</span></span>
<span id="LC2187" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC2188" class="line" lang="java"><span class="cm">     * @param img  the &lt;code&gt;Image&lt;/code&gt; to be compared</span></span>
<span id="LC2189" class="line" lang="java"><span class="cm">     * @param infoflags flags used to repaint the button when the image</span></span>
<span id="LC2190" class="line" lang="java"><span class="cm">     *          is updated and which determine how much is to be painted</span></span>
<span id="LC2191" class="line" lang="java"><span class="cm">     * @param x  the x coordinate</span></span>
<span id="LC2192" class="line" lang="java"><span class="cm">     * @param y  the y coordinate</span></span>
<span id="LC2193" class="line" lang="java"><span class="cm">     * @param w  the width</span></span>
<span id="LC2194" class="line" lang="java"><span class="cm">     * @param h  the height</span></span>
<span id="LC2195" class="line" lang="java"><span class="cm">     * @see     java.awt.image.ImageObserver</span></span>
<span id="LC2196" class="line" lang="java"><span class="cm">     * @see     java.awt.Component#imageUpdate(java.awt.Image, int, int, int, int, int)</span></span>
<span id="LC2197" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2198" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">imageUpdate</span><span class="o">(</span><span class="nc">Image</span> <span class="n">img</span><span class="o">,</span> <span class="kt">int</span> <span class="n">infoflags</span><span class="o">,</span></span>
<span id="LC2199" class="line" lang="java">                               <span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">,</span> <span class="kt">int</span> <span class="n">w</span><span class="o">,</span> <span class="kt">int</span> <span class="n">h</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2200" class="line" lang="java">        <span class="nc">Icon</span> <span class="n">iconDisplayed</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2201" class="line" lang="java"></span>
<span id="LC2202" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">model</span><span class="o">.</span><span class="na">isEnabled</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2203" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">model</span><span class="o">.</span><span class="na">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2204" class="line" lang="java">                <span class="n">iconDisplayed</span> <span class="o">=</span> <span class="n">getDisabledSelectedIcon</span><span class="o">();</span></span>
<span id="LC2205" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2206" class="line" lang="java">                <span class="n">iconDisplayed</span> <span class="o">=</span> <span class="n">getDisabledIcon</span><span class="o">();</span></span>
<span id="LC2207" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2208" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">model</span><span class="o">.</span><span class="na">isPressed</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="n">model</span><span class="o">.</span><span class="na">isArmed</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2209" class="line" lang="java">            <span class="n">iconDisplayed</span> <span class="o">=</span> <span class="n">getPressedIcon</span><span class="o">();</span></span>
<span id="LC2210" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">isRolloverEnabled</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="n">model</span><span class="o">.</span><span class="na">isRollover</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2211" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">model</span><span class="o">.</span><span class="na">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2212" class="line" lang="java">                <span class="n">iconDisplayed</span> <span class="o">=</span> <span class="n">getRolloverSelectedIcon</span><span class="o">();</span></span>
<span id="LC2213" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2214" class="line" lang="java">                <span class="n">iconDisplayed</span> <span class="o">=</span> <span class="n">getRolloverIcon</span><span class="o">();</span></span>
<span id="LC2215" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2216" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">model</span><span class="o">.</span><span class="na">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2217" class="line" lang="java">            <span class="n">iconDisplayed</span> <span class="o">=</span> <span class="n">getSelectedIcon</span><span class="o">();</span></span>
<span id="LC2218" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2219" class="line" lang="java"></span>
<span id="LC2220" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">iconDisplayed</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2221" class="line" lang="java">            <span class="n">iconDisplayed</span> <span class="o">=</span> <span class="n">getIcon</span><span class="o">();</span></span>
<span id="LC2222" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2223" class="line" lang="java"></span>
<span id="LC2224" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">iconDisplayed</span> <span class="o">==</span> <span class="kc">null</span></span>
<span id="LC2225" class="line" lang="java">            <span class="o">||</span> <span class="o">!</span><span class="nc">SwingUtilities</span><span class="o">.</span><span class="na">doesIconReferenceImage</span><span class="o">(</span><span class="n">iconDisplayed</span><span class="o">,</span> <span class="n">img</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2226" class="line" lang="java">            <span class="c1">// We don't know about this image, disable the notification so</span></span>
<span id="LC2227" class="line" lang="java">            <span class="c1">// we don't keep repainting.</span></span>
<span id="LC2228" class="line" lang="java">            <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2229" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2230" class="line" lang="java">        <span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">imageUpdate</span><span class="o">(</span><span class="n">img</span><span class="o">,</span> <span class="n">infoflags</span><span class="o">,</span> <span class="n">x</span><span class="o">,</span> <span class="n">y</span><span class="o">,</span> <span class="n">w</span><span class="o">,</span> <span class="n">h</span><span class="o">);</span></span>
<span id="LC2231" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2232" class="line" lang="java"></span>
<span id="LC2233" class="line" lang="java">    <span class="kt">void</span> <span class="nf">setUIProperty</span><span class="o">(</span><span class="nc">String</span> <span class="n">propertyName</span><span class="o">,</span> <span class="nc">Object</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2234" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="s">"borderPainted"</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2235" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">borderPaintedSet</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2236" class="line" lang="java">                <span class="n">setBorderPainted</span><span class="o">(((</span><span class="nc">Boolean</span><span class="o">)</span><span class="n">value</span><span class="o">).</span><span class="na">booleanValue</span><span class="o">());</span></span>
<span id="LC2237" class="line" lang="java">                <span class="n">borderPaintedSet</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2238" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2239" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="s">"rolloverEnabled"</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2240" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">rolloverEnabledSet</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2241" class="line" lang="java">                <span class="n">setRolloverEnabled</span><span class="o">(((</span><span class="nc">Boolean</span><span class="o">)</span><span class="n">value</span><span class="o">).</span><span class="na">booleanValue</span><span class="o">());</span></span>
<span id="LC2242" class="line" lang="java">                <span class="n">rolloverEnabledSet</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2243" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2244" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="s">"iconTextGap"</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2245" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">iconTextGapSet</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2246" class="line" lang="java">                <span class="n">setIconTextGap</span><span class="o">(((</span><span class="nc">Number</span><span class="o">)</span><span class="n">value</span><span class="o">).</span><span class="na">intValue</span><span class="o">());</span></span>
<span id="LC2247" class="line" lang="java">                <span class="n">iconTextGapSet</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2248" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2249" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">propertyName</span> <span class="o">==</span> <span class="s">"contentAreaFilled"</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2250" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">contentAreaFilledSet</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2251" class="line" lang="java">                <span class="n">setContentAreaFilled</span><span class="o">(((</span><span class="nc">Boolean</span><span class="o">)</span><span class="n">value</span><span class="o">).</span><span class="na">booleanValue</span><span class="o">());</span></span>
<span id="LC2252" class="line" lang="java">                <span class="n">contentAreaFilledSet</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2253" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2254" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2255" class="line" lang="java">            <span class="kd">super</span><span class="o">.</span><span class="na">setUIProperty</span><span class="o">(</span><span class="n">propertyName</span><span class="o">,</span> <span class="n">value</span><span class="o">);</span></span>
<span id="LC2256" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2257" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2258" class="line" lang="java"></span>
<span id="LC2259" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2260" class="line" lang="java"><span class="cm">     * Returns a string representation of this &lt;code&gt;AbstractButton&lt;/code&gt;.</span></span>
<span id="LC2261" class="line" lang="java"><span class="cm">     * This method</span></span>
<span id="LC2262" class="line" lang="java"><span class="cm">     * is intended to be used only for debugging purposes, and the</span></span>
<span id="LC2263" class="line" lang="java"><span class="cm">     * content and format of the returned string may vary between</span></span>
<span id="LC2264" class="line" lang="java"><span class="cm">     * implementations. The returned string may be empty but may not</span></span>
<span id="LC2265" class="line" lang="java"><span class="cm">     * be &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC2266" class="line" lang="java"><span class="cm">     * &lt;P&gt;</span></span>
<span id="LC2267" class="line" lang="java"><span class="cm">     * Overriding &lt;code&gt;paramString&lt;/code&gt; to provide information about the</span></span>
<span id="LC2268" class="line" lang="java"><span class="cm">     * specific new aspects of the JFC components.</span></span>
<span id="LC2269" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC2270" class="line" lang="java"><span class="cm">     * @return  a string representation of this &lt;code&gt;AbstractButton&lt;/code&gt;</span></span>
<span id="LC2271" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2272" class="line" lang="java">    <span class="kd">protected</span> <span class="nc">String</span> <span class="nf">paramString</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2273" class="line" lang="java">        <span class="nc">String</span> <span class="n">defaultIconString</span> <span class="o">=</span> <span class="o">((</span><span class="n">defaultIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2274" class="line" lang="java">                                    <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">defaultIcon</span> <span class="o">!=</span> <span class="k">this</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC2275" class="line" lang="java">                                    <span class="n">defaultIcon</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span> <span class="o">:</span> <span class="s">""</span><span class="o">);</span></span>
<span id="LC2276" class="line" lang="java">        <span class="nc">String</span> <span class="n">pressedIconString</span> <span class="o">=</span> <span class="o">((</span><span class="n">pressedIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2277" class="line" lang="java">                                    <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">pressedIcon</span> <span class="o">!=</span> <span class="k">this</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC2278" class="line" lang="java">                                    <span class="n">pressedIcon</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span> <span class="o">:</span> <span class="s">""</span><span class="o">);</span></span>
<span id="LC2279" class="line" lang="java">        <span class="nc">String</span> <span class="n">disabledIconString</span> <span class="o">=</span> <span class="o">((</span><span class="n">disabledIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2280" class="line" lang="java">                                     <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">disabledIcon</span> <span class="o">!=</span> <span class="k">this</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC2281" class="line" lang="java">                                     <span class="n">disabledIcon</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span> <span class="o">:</span> <span class="s">""</span><span class="o">);</span></span>
<span id="LC2282" class="line" lang="java">        <span class="nc">String</span> <span class="n">selectedIconString</span> <span class="o">=</span> <span class="o">((</span><span class="n">selectedIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2283" class="line" lang="java">                                     <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">selectedIcon</span> <span class="o">!=</span> <span class="k">this</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC2284" class="line" lang="java">                                     <span class="n">selectedIcon</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span> <span class="o">:</span> <span class="s">""</span><span class="o">);</span></span>
<span id="LC2285" class="line" lang="java">        <span class="nc">String</span> <span class="n">disabledSelectedIconString</span> <span class="o">=</span> <span class="o">((</span><span class="n">disabledSelectedIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC2286" class="line" lang="java">                                             <span class="o">(</span><span class="n">disabledSelectedIcon</span> <span class="o">!=</span> <span class="k">this</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC2287" class="line" lang="java">                                             <span class="n">disabledSelectedIcon</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span></span>
<span id="LC2288" class="line" lang="java">                                             <span class="o">:</span> <span class="s">""</span><span class="o">);</span></span>
<span id="LC2289" class="line" lang="java">        <span class="nc">String</span> <span class="n">rolloverIconString</span> <span class="o">=</span> <span class="o">((</span><span class="n">rolloverIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC2290" class="line" lang="java">                                     <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">rolloverIcon</span> <span class="o">!=</span> <span class="k">this</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC2291" class="line" lang="java">                                     <span class="n">rolloverIcon</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span> <span class="o">:</span> <span class="s">""</span><span class="o">);</span></span>
<span id="LC2292" class="line" lang="java">        <span class="nc">String</span> <span class="n">rolloverSelectedIconString</span> <span class="o">=</span> <span class="o">((</span><span class="n">rolloverSelectedIcon</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></span>
<span id="LC2293" class="line" lang="java">                                             <span class="o">(</span><span class="n">rolloverSelectedIcon</span> <span class="o">!=</span> <span class="k">this</span><span class="o">)</span> <span class="o">?</span></span>
<span id="LC2294" class="line" lang="java">                                             <span class="n">rolloverSelectedIcon</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span></span>
<span id="LC2295" class="line" lang="java">                                             <span class="o">:</span> <span class="s">""</span><span class="o">);</span></span>
<span id="LC2296" class="line" lang="java">        <span class="nc">String</span> <span class="n">paintBorderString</span> <span class="o">=</span> <span class="o">(</span><span class="n">paintBorder</span> <span class="o">?</span> <span class="s">"true"</span> <span class="o">:</span> <span class="s">"false"</span><span class="o">);</span></span>
<span id="LC2297" class="line" lang="java">        <span class="nc">String</span> <span class="n">paintFocusString</span> <span class="o">=</span> <span class="o">(</span><span class="n">paintFocus</span> <span class="o">?</span> <span class="s">"true"</span> <span class="o">:</span> <span class="s">"false"</span><span class="o">);</span></span>
<span id="LC2298" class="line" lang="java">        <span class="nc">String</span> <span class="n">rolloverEnabledString</span> <span class="o">=</span> <span class="o">(</span><span class="n">rolloverEnabled</span> <span class="o">?</span> <span class="s">"true"</span> <span class="o">:</span> <span class="s">"false"</span><span class="o">);</span></span>
<span id="LC2299" class="line" lang="java"></span>
<span id="LC2300" class="line" lang="java">        <span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">paramString</span><span class="o">()</span> <span class="o">+</span></span>
<span id="LC2301" class="line" lang="java">        <span class="s">",defaultIcon="</span> <span class="o">+</span> <span class="n">defaultIconString</span> <span class="o">+</span></span>
<span id="LC2302" class="line" lang="java">        <span class="s">",disabledIcon="</span> <span class="o">+</span> <span class="n">disabledIconString</span> <span class="o">+</span></span>
<span id="LC2303" class="line" lang="java">        <span class="s">",disabledSelectedIcon="</span> <span class="o">+</span> <span class="n">disabledSelectedIconString</span> <span class="o">+</span></span>
<span id="LC2304" class="line" lang="java">        <span class="s">",margin="</span> <span class="o">+</span> <span class="n">margin</span> <span class="o">+</span></span>
<span id="LC2305" class="line" lang="java">        <span class="s">",paintBorder="</span> <span class="o">+</span> <span class="n">paintBorderString</span> <span class="o">+</span></span>
<span id="LC2306" class="line" lang="java">        <span class="s">",paintFocus="</span> <span class="o">+</span> <span class="n">paintFocusString</span> <span class="o">+</span></span>
<span id="LC2307" class="line" lang="java">        <span class="s">",pressedIcon="</span> <span class="o">+</span> <span class="n">pressedIconString</span> <span class="o">+</span></span>
<span id="LC2308" class="line" lang="java">        <span class="s">",rolloverEnabled="</span> <span class="o">+</span> <span class="n">rolloverEnabledString</span> <span class="o">+</span></span>
<span id="LC2309" class="line" lang="java">        <span class="s">",rolloverIcon="</span> <span class="o">+</span> <span class="n">rolloverIconString</span> <span class="o">+</span></span>
<span id="LC2310" class="line" lang="java">        <span class="s">",rolloverSelectedIcon="</span> <span class="o">+</span> <span class="n">rolloverSelectedIconString</span> <span class="o">+</span></span>
<span id="LC2311" class="line" lang="java">        <span class="s">",selectedIcon="</span> <span class="o">+</span> <span class="n">selectedIconString</span> <span class="o">+</span></span>
<span id="LC2312" class="line" lang="java">        <span class="s">",text="</span> <span class="o">+</span> <span class="n">text</span><span class="o">;</span></span>
<span id="LC2313" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2314" class="line" lang="java"></span>
<span id="LC2315" class="line" lang="java"></span>
<span id="LC2316" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Handler</span> <span class="nf">getHandler</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2317" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">handler</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2318" class="line" lang="java">            <span class="n">handler</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Handler</span><span class="o">();</span></span>
<span id="LC2319" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2320" class="line" lang="java">        <span class="k">return</span> <span class="n">handler</span><span class="o">;</span></span>
<span id="LC2321" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2322" class="line" lang="java"></span>
<span id="LC2323" class="line" lang="java"></span>
<span id="LC2324" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2325" class="line" lang="java">    <span class="c1">// Listeners that are added to model</span></span>
<span id="LC2326" class="line" lang="java">    <span class="c1">//</span></span>
<span id="LC2327" class="line" lang="java">    <span class="nd">@SuppressWarnings</span><span class="o">(</span><span class="s">"serial"</span><span class="o">)</span></span>
<span id="LC2328" class="line" lang="java">    <span class="kd">class</span> <span class="nc">Handler</span> <span class="kd">implements</span> <span class="nc">ActionListener</span><span class="o">,</span> <span class="nc">ChangeListener</span><span class="o">,</span> <span class="nc">ItemListener</span><span class="o">,</span></span>
<span id="LC2329" class="line" lang="java">                             <span class="nc">Serializable</span> <span class="o">{</span></span>
<span id="LC2330" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2331" class="line" lang="java">        <span class="c1">// ChangeListener</span></span>
<span id="LC2332" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2333" class="line" lang="java">        <span class="kd">public</span> <span class="kt">void</span> <span class="nf">stateChanged</span><span class="o">(</span><span class="nc">ChangeEvent</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2334" class="line" lang="java">            <span class="nc">Object</span> <span class="n">source</span> <span class="o">=</span> <span class="n">e</span><span class="o">.</span><span class="na">getSource</span><span class="o">();</span></span>
<span id="LC2335" class="line" lang="java"></span>
<span id="LC2336" class="line" lang="java">            <span class="n">updateMnemonicProperties</span><span class="o">();</span></span>
<span id="LC2337" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">isEnabled</span><span class="o">()</span> <span class="o">!=</span> <span class="n">model</span><span class="o">.</span><span class="na">isEnabled</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2338" class="line" lang="java">                <span class="n">setEnabled</span><span class="o">(</span><span class="n">model</span><span class="o">.</span><span class="na">isEnabled</span><span class="o">());</span></span>
<span id="LC2339" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2340" class="line" lang="java">            <span class="n">fireStateChanged</span><span class="o">();</span></span>
<span id="LC2341" class="line" lang="java">            <span class="n">repaint</span><span class="o">();</span></span>
<span id="LC2342" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2343" class="line" lang="java"></span>
<span id="LC2344" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2345" class="line" lang="java">        <span class="c1">// ActionListener</span></span>
<span id="LC2346" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2347" class="line" lang="java">        <span class="kd">public</span> <span class="kt">void</span> <span class="nf">actionPerformed</span><span class="o">(</span><span class="nc">ActionEvent</span> <span class="n">event</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2348" class="line" lang="java">            <span class="n">fireActionPerformed</span><span class="o">(</span><span class="n">event</span><span class="o">);</span></span>
<span id="LC2349" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2350" class="line" lang="java"></span>
<span id="LC2351" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2352" class="line" lang="java">        <span class="c1">// ItemListener</span></span>
<span id="LC2353" class="line" lang="java">        <span class="c1">//</span></span>
<span id="LC2354" class="line" lang="java">        <span class="kd">public</span> <span class="kt">void</span> <span class="nf">itemStateChanged</span><span class="o">(</span><span class="nc">ItemEvent</span> <span class="n">event</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2355" class="line" lang="java">            <span class="n">fireItemStateChanged</span><span class="o">(</span><span class="n">event</span><span class="o">);</span></span>
<span id="LC2356" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">shouldUpdateSelectedStateFromAction</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2357" class="line" lang="java">                <span class="nc">Action</span> <span class="n">action</span> <span class="o">=</span> <span class="n">getAction</span><span class="o">();</span></span>
<span id="LC2358" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">action</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="nc">AbstractAction</span><span class="o">.</span><span class="na">hasSelectedKey</span><span class="o">(</span><span class="n">action</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2359" class="line" lang="java">                    <span class="kt">boolean</span> <span class="n">selected</span> <span class="o">=</span> <span class="n">isSelected</span><span class="o">();</span></span>
<span id="LC2360" class="line" lang="java">                    <span class="kt">boolean</span> <span class="n">isActionSelected</span> <span class="o">=</span> <span class="nc">AbstractAction</span><span class="o">.</span><span class="na">isSelected</span><span class="o">(</span></span>
<span id="LC2361" class="line" lang="java">                              <span class="n">action</span><span class="o">);</span></span>
<span id="LC2362" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">isActionSelected</span> <span class="o">!=</span> <span class="n">selected</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2363" class="line" lang="java">                        <span class="n">action</span><span class="o">.</span><span class="na">putValue</span><span class="o">(</span><span class="nc">Action</span><span class="o">.</span><span class="na">SELECTED_KEY</span><span class="o">,</span> <span class="n">selected</span><span class="o">);</span></span>
<span id="LC2364" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2365" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2366" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2367" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2368" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC2369" class="line" lang="java"></span>
<span id="LC2370" class="line" lang="java"><span class="c1">///////////////////</span></span>
<span id="LC2371" class="line" lang="java"><span class="c1">// Accessibility support</span></span>
<span id="LC2372" class="line" lang="java"><span class="c1">///////////////////</span></span>
<span id="LC2373" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC2374" class="line" lang="java"><span class="cm">     * This class implements accessibility support for the</span></span>
<span id="LC2375" class="line" lang="java"><span class="cm">     * &lt;code&gt;AbstractButton&lt;/code&gt; class.  It provides an implementation of the</span></span>
<span id="LC2376" class="line" lang="java"><span class="cm">     * Java Accessibility API appropriate to button and menu item</span></span>
<span id="LC2377" class="line" lang="java"><span class="cm">     * user-interface elements.</span></span>
<span id="LC2378" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC2379" class="line" lang="java"><span class="cm">     * &lt;strong&gt;Warning:&lt;/strong&gt;</span></span>
<span id="LC2380" class="line" lang="java"><span class="cm">     * Serialized objects of this class will not be compatible with</span></span>
<span id="LC2381" class="line" lang="java"><span class="cm">     * future Swing releases. The current serialization support is</span></span>
<span id="LC2382" class="line" lang="java"><span class="cm">     * appropriate for short term storage or RMI between applications running</span></span>
<span id="LC2383" class="line" lang="java"><span class="cm">     * the same version of Swing.  As of 1.4, support for long term storage</span></span>
<span id="LC2384" class="line" lang="java"><span class="cm">     * of all JavaBeans&amp;trade;</span></span>
<span id="LC2385" class="line" lang="java"><span class="cm">     * has been added to the &lt;code&gt;java.beans&lt;/code&gt; package.</span></span>
<span id="LC2386" class="line" lang="java"><span class="cm">     * Please see {@link java.beans.XMLEncoder}.</span></span>
<span id="LC2387" class="line" lang="java"><span class="cm">     * @since 1.4</span></span>
<span id="LC2388" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC2389" class="line" lang="java">    <span class="kd">protected</span> <span class="kd">abstract</span> <span class="kd">class</span> <span class="nc">AccessibleAbstractButton</span></span>
<span id="LC2390" class="line" lang="java">        <span class="kd">extends</span> <span class="nc">AccessibleJComponent</span> <span class="kd">implements</span> <span class="nc">AccessibleAction</span><span class="o">,</span></span>
<span id="LC2391" class="line" lang="java">        <span class="nc">AccessibleValue</span><span class="o">,</span> <span class="nc">AccessibleText</span><span class="o">,</span> <span class="nc">AccessibleExtendedComponent</span> <span class="o">{</span></span>
<span id="LC2392" class="line" lang="java"></span>
<span id="LC2393" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2394" class="line" lang="java"><span class="cm">         * Returns the accessible name of this object.</span></span>
<span id="LC2395" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2396" class="line" lang="java"><span class="cm">         * @return the localized name of the object -- can be</span></span>
<span id="LC2397" class="line" lang="java"><span class="cm">         *              &lt;code&gt;null&lt;/code&gt; if this</span></span>
<span id="LC2398" class="line" lang="java"><span class="cm">         *              object does not have a name</span></span>
<span id="LC2399" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2400" class="line" lang="java">        <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getAccessibleName</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2401" class="line" lang="java">            <span class="nc">String</span> <span class="n">name</span> <span class="o">=</span> <span class="n">accessibleName</span><span class="o">;</span></span>
<span id="LC2402" class="line" lang="java"></span>
<span id="LC2403" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">name</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2404" class="line" lang="java">                <span class="n">name</span> <span class="o">=</span> <span class="o">(</span><span class="nc">String</span><span class="o">)</span><span class="n">getClientProperty</span><span class="o">(</span><span class="nc">AccessibleContext</span><span class="o">.</span><span class="na">ACCESSIBLE_NAME_PROPERTY</span><span class="o">);</span></span>
<span id="LC2405" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2406" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">name</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2407" class="line" lang="java">                <span class="n">name</span> <span class="o">=</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getText</span><span class="o">();</span></span>
<span id="LC2408" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2409" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">name</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2410" class="line" lang="java">                <span class="n">name</span> <span class="o">=</span> <span class="kd">super</span><span class="o">.</span><span class="na">getAccessibleName</span><span class="o">();</span></span>
<span id="LC2411" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2412" class="line" lang="java">            <span class="k">return</span> <span class="n">name</span><span class="o">;</span></span>
<span id="LC2413" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2414" class="line" lang="java"></span>
<span id="LC2415" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2416" class="line" lang="java"><span class="cm">         * Get the AccessibleIcons associated with this object if one</span></span>
<span id="LC2417" class="line" lang="java"><span class="cm">         * or more exist.  Otherwise return null.</span></span>
<span id="LC2418" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2419" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2420" class="line" lang="java">        <span class="kd">public</span> <span class="nc">AccessibleIcon</span> <span class="o">[]</span> <span class="n">getAccessibleIcon</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2421" class="line" lang="java">            <span class="nc">Icon</span> <span class="n">defaultIcon</span> <span class="o">=</span> <span class="n">getIcon</span><span class="o">();</span></span>
<span id="LC2422" class="line" lang="java"></span>
<span id="LC2423" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">defaultIcon</span> <span class="k">instanceof</span> <span class="nc">Accessible</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2424" class="line" lang="java">                <span class="nc">AccessibleContext</span> <span class="n">ac</span> <span class="o">=</span></span>
<span id="LC2425" class="line" lang="java">                    <span class="o">((</span><span class="nc">Accessible</span><span class="o">)</span><span class="n">defaultIcon</span><span class="o">).</span><span class="na">getAccessibleContext</span><span class="o">();</span></span>
<span id="LC2426" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">ac</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">ac</span> <span class="k">instanceof</span> <span class="nc">AccessibleIcon</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2427" class="line" lang="java">                    <span class="k">return</span> <span class="k">new</span> <span class="nc">AccessibleIcon</span><span class="o">[]</span> <span class="o">{</span> <span class="o">(</span><span class="nc">AccessibleIcon</span><span class="o">)</span><span class="n">ac</span> <span class="o">};</span></span>
<span id="LC2428" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2429" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2430" class="line" lang="java">            <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2431" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2432" class="line" lang="java"></span>
<span id="LC2433" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2434" class="line" lang="java"><span class="cm">         * Get the state set of this object.</span></span>
<span id="LC2435" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2436" class="line" lang="java"><span class="cm">         * @return an instance of AccessibleState containing the current state</span></span>
<span id="LC2437" class="line" lang="java"><span class="cm">         * of the object</span></span>
<span id="LC2438" class="line" lang="java"><span class="cm">         * @see AccessibleState</span></span>
<span id="LC2439" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2440" class="line" lang="java">        <span class="kd">public</span> <span class="nc">AccessibleStateSet</span> <span class="nf">getAccessibleStateSet</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2441" class="line" lang="java">        <span class="nc">AccessibleStateSet</span> <span class="n">states</span> <span class="o">=</span> <span class="kd">super</span><span class="o">.</span><span class="na">getAccessibleStateSet</span><span class="o">();</span></span>
<span id="LC2442" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">getModel</span><span class="o">().</span><span class="na">isArmed</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2443" class="line" lang="java">                <span class="n">states</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="nc">AccessibleState</span><span class="o">.</span><span class="na">ARMED</span><span class="o">);</span></span>
<span id="LC2444" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2445" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">isFocusOwner</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2446" class="line" lang="java">                <span class="n">states</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="nc">AccessibleState</span><span class="o">.</span><span class="na">FOCUSED</span><span class="o">);</span></span>
<span id="LC2447" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2448" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">getModel</span><span class="o">().</span><span class="na">isPressed</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2449" class="line" lang="java">                <span class="n">states</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="nc">AccessibleState</span><span class="o">.</span><span class="na">PRESSED</span><span class="o">);</span></span>
<span id="LC2450" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2451" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2452" class="line" lang="java">                <span class="n">states</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="nc">AccessibleState</span><span class="o">.</span><span class="na">CHECKED</span><span class="o">);</span></span>
<span id="LC2453" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2454" class="line" lang="java">            <span class="k">return</span> <span class="n">states</span><span class="o">;</span></span>
<span id="LC2455" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2456" class="line" lang="java"></span>
<span id="LC2457" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2458" class="line" lang="java"><span class="cm">         * Get the AccessibleRelationSet associated with this object if one</span></span>
<span id="LC2459" class="line" lang="java"><span class="cm">         * exists.  Otherwise return null.</span></span>
<span id="LC2460" class="line" lang="java"><span class="cm">         * @see AccessibleRelation</span></span>
<span id="LC2461" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2462" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2463" class="line" lang="java">        <span class="kd">public</span> <span class="nc">AccessibleRelationSet</span> <span class="nf">getAccessibleRelationSet</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2464" class="line" lang="java"></span>
<span id="LC2465" class="line" lang="java">            <span class="c1">// Check where the AccessibleContext's relation</span></span>
<span id="LC2466" class="line" lang="java">            <span class="c1">// set already contains a MEMBER_OF relation.</span></span>
<span id="LC2467" class="line" lang="java">            <span class="nc">AccessibleRelationSet</span> <span class="n">relationSet</span></span>
<span id="LC2468" class="line" lang="java">                <span class="o">=</span> <span class="kd">super</span><span class="o">.</span><span class="na">getAccessibleRelationSet</span><span class="o">();</span></span>
<span id="LC2469" class="line" lang="java"></span>
<span id="LC2470" class="line" lang="java">            <span class="k">if</span> <span class="o">(!</span><span class="n">relationSet</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="nc">AccessibleRelation</span><span class="o">.</span><span class="na">MEMBER_OF</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2471" class="line" lang="java">                <span class="c1">// get the members of the button group if one exists</span></span>
<span id="LC2472" class="line" lang="java">                <span class="nc">ButtonModel</span> <span class="n">model</span> <span class="o">=</span> <span class="n">getModel</span><span class="o">();</span></span>
<span id="LC2473" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">model</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">model</span> <span class="k">instanceof</span> <span class="nc">DefaultButtonModel</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2474" class="line" lang="java">                    <span class="nc">ButtonGroup</span> <span class="n">group</span> <span class="o">=</span> <span class="o">((</span><span class="nc">DefaultButtonModel</span><span class="o">)</span><span class="n">model</span><span class="o">).</span><span class="na">getGroup</span><span class="o">();</span></span>
<span id="LC2475" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">group</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2476" class="line" lang="java">                        <span class="c1">// set the target of the MEMBER_OF relation to be</span></span>
<span id="LC2477" class="line" lang="java">                        <span class="c1">// the members of the button group.</span></span>
<span id="LC2478" class="line" lang="java">                        <span class="kt">int</span> <span class="n">len</span> <span class="o">=</span> <span class="n">group</span><span class="o">.</span><span class="na">getButtonCount</span><span class="o">();</span></span>
<span id="LC2479" class="line" lang="java">                        <span class="nc">Object</span> <span class="o">[]</span> <span class="n">target</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Object</span><span class="o">[</span><span class="n">len</span><span class="o">];</span></span>
<span id="LC2480" class="line" lang="java">                        <span class="nc">Enumeration</span><span class="o">&lt;</span><span class="nc">AbstractButton</span><span class="o">&gt;</span> <span class="n">elem</span> <span class="o">=</span> <span class="n">group</span><span class="o">.</span><span class="na">getElements</span><span class="o">();</span></span>
<span id="LC2481" class="line" lang="java">                        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">len</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC2482" class="line" lang="java">                            <span class="k">if</span> <span class="o">(</span><span class="n">elem</span><span class="o">.</span><span class="na">hasMoreElements</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2483" class="line" lang="java">                                <span class="n">target</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="n">elem</span><span class="o">.</span><span class="na">nextElement</span><span class="o">();</span></span>
<span id="LC2484" class="line" lang="java">                            <span class="o">}</span></span>
<span id="LC2485" class="line" lang="java">                        <span class="o">}</span></span>
<span id="LC2486" class="line" lang="java">                        <span class="nc">AccessibleRelation</span> <span class="n">relation</span> <span class="o">=</span></span>
<span id="LC2487" class="line" lang="java">                            <span class="k">new</span> <span class="nf">AccessibleRelation</span><span class="o">(</span><span class="nc">AccessibleRelation</span><span class="o">.</span><span class="na">MEMBER_OF</span><span class="o">);</span></span>
<span id="LC2488" class="line" lang="java">                        <span class="n">relation</span><span class="o">.</span><span class="na">setTarget</span><span class="o">(</span><span class="n">target</span><span class="o">);</span></span>
<span id="LC2489" class="line" lang="java">                        <span class="n">relationSet</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">relation</span><span class="o">);</span></span>
<span id="LC2490" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2491" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2492" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2493" class="line" lang="java">            <span class="k">return</span> <span class="n">relationSet</span><span class="o">;</span></span>
<span id="LC2494" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2495" class="line" lang="java"></span>
<span id="LC2496" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2497" class="line" lang="java"><span class="cm">         * Get the AccessibleAction associated with this object.  In the</span></span>
<span id="LC2498" class="line" lang="java"><span class="cm">         * implementation of the Java Accessibility API for this class,</span></span>
<span id="LC2499" class="line" lang="java"><span class="cm">         * return this object, which is responsible for implementing the</span></span>
<span id="LC2500" class="line" lang="java"><span class="cm">         * AccessibleAction interface on behalf of itself.</span></span>
<span id="LC2501" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2502" class="line" lang="java"><span class="cm">         * @return this object</span></span>
<span id="LC2503" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2504" class="line" lang="java">        <span class="kd">public</span> <span class="nc">AccessibleAction</span> <span class="nf">getAccessibleAction</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2505" class="line" lang="java">            <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC2506" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2507" class="line" lang="java"></span>
<span id="LC2508" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2509" class="line" lang="java"><span class="cm">         * Get the AccessibleValue associated with this object.  In the</span></span>
<span id="LC2510" class="line" lang="java"><span class="cm">         * implementation of the Java Accessibility API for this class,</span></span>
<span id="LC2511" class="line" lang="java"><span class="cm">         * return this object, which is responsible for implementing the</span></span>
<span id="LC2512" class="line" lang="java"><span class="cm">         * AccessibleValue interface on behalf of itself.</span></span>
<span id="LC2513" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2514" class="line" lang="java"><span class="cm">         * @return this object</span></span>
<span id="LC2515" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2516" class="line" lang="java">        <span class="kd">public</span> <span class="nc">AccessibleValue</span> <span class="nf">getAccessibleValue</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2517" class="line" lang="java">            <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC2518" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2519" class="line" lang="java"></span>
<span id="LC2520" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2521" class="line" lang="java"><span class="cm">         * Returns the number of Actions available in this object.  The</span></span>
<span id="LC2522" class="line" lang="java"><span class="cm">         * default behavior of a button is to have one action - toggle</span></span>
<span id="LC2523" class="line" lang="java"><span class="cm">         * the button.</span></span>
<span id="LC2524" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2525" class="line" lang="java"><span class="cm">         * @return 1, the number of Actions in this object</span></span>
<span id="LC2526" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2527" class="line" lang="java">        <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getAccessibleActionCount</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2528" class="line" lang="java">            <span class="k">return</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC2529" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2530" class="line" lang="java"></span>
<span id="LC2531" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2532" class="line" lang="java"><span class="cm">         * Return a description of the specified action of the object.</span></span>
<span id="LC2533" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2534" class="line" lang="java"><span class="cm">         * @param i zero-based index of the actions</span></span>
<span id="LC2535" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2536" class="line" lang="java">        <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getAccessibleActionDescription</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2537" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">i</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2538" class="line" lang="java">                <span class="k">return</span> <span class="nc">UIManager</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">"AbstractButton.clickText"</span><span class="o">);</span></span>
<span id="LC2539" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2540" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2541" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2542" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2543" class="line" lang="java"></span>
<span id="LC2544" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2545" class="line" lang="java"><span class="cm">         * Perform the specified Action on the object</span></span>
<span id="LC2546" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2547" class="line" lang="java"><span class="cm">         * @param i zero-based index of actions</span></span>
<span id="LC2548" class="line" lang="java"><span class="cm">         * @return true if the the action was performed; else false.</span></span>
<span id="LC2549" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2550" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">doAccessibleAction</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2551" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">i</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2552" class="line" lang="java">                <span class="n">doClick</span><span class="o">();</span></span>
<span id="LC2553" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC2554" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2555" class="line" lang="java">                <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2556" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2557" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2558" class="line" lang="java"></span>
<span id="LC2559" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2560" class="line" lang="java"><span class="cm">         * Get the value of this object as a Number.</span></span>
<span id="LC2561" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2562" class="line" lang="java"><span class="cm">         * @return An Integer of 0 if this isn't selected or an Integer of 1 if</span></span>
<span id="LC2563" class="line" lang="java"><span class="cm">         * this is selected.</span></span>
<span id="LC2564" class="line" lang="java"><span class="cm">         * @see AbstractButton#isSelected</span></span>
<span id="LC2565" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2566" class="line" lang="java">        <span class="kd">public</span> <span class="nc">Number</span> <span class="nf">getCurrentAccessibleValue</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2567" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">isSelected</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2568" class="line" lang="java">                <span class="k">return</span> <span class="nc">Integer</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="mi">1</span><span class="o">);</span></span>
<span id="LC2569" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2570" class="line" lang="java">                <span class="k">return</span> <span class="nc">Integer</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></span>
<span id="LC2571" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2572" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2573" class="line" lang="java"></span>
<span id="LC2574" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2575" class="line" lang="java"><span class="cm">         * Set the value of this object as a Number.</span></span>
<span id="LC2576" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2577" class="line" lang="java"><span class="cm">         * @return True if the value was set.</span></span>
<span id="LC2578" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2579" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">setCurrentAccessibleValue</span><span class="o">(</span><span class="nc">Number</span> <span class="n">n</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2580" class="line" lang="java">            <span class="c1">// TIGER - 4422535</span></span>
<span id="LC2581" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">n</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2582" class="line" lang="java">                <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC2583" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2584" class="line" lang="java">            <span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">n</span><span class="o">.</span><span class="na">intValue</span><span class="o">();</span></span>
<span id="LC2585" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">i</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2586" class="line" lang="java">                <span class="n">setSelected</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></span>
<span id="LC2587" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2588" class="line" lang="java">                <span class="n">setSelected</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></span>
<span id="LC2589" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2590" class="line" lang="java">            <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC2591" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2592" class="line" lang="java"></span>
<span id="LC2593" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2594" class="line" lang="java"><span class="cm">         * Get the minimum value of this object as a Number.</span></span>
<span id="LC2595" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2596" class="line" lang="java"><span class="cm">         * @return an Integer of 0.</span></span>
<span id="LC2597" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2598" class="line" lang="java">        <span class="kd">public</span> <span class="nc">Number</span> <span class="nf">getMinimumAccessibleValue</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2599" class="line" lang="java">            <span class="k">return</span> <span class="nc">Integer</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></span>
<span id="LC2600" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2601" class="line" lang="java"></span>
<span id="LC2602" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2603" class="line" lang="java"><span class="cm">         * Get the maximum value of this object as a Number.</span></span>
<span id="LC2604" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2605" class="line" lang="java"><span class="cm">         * @return An Integer of 1.</span></span>
<span id="LC2606" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2607" class="line" lang="java">        <span class="kd">public</span> <span class="nc">Number</span> <span class="nf">getMaximumAccessibleValue</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2608" class="line" lang="java">            <span class="k">return</span> <span class="nc">Integer</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="mi">1</span><span class="o">);</span></span>
<span id="LC2609" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2610" class="line" lang="java"></span>
<span id="LC2611" class="line" lang="java"></span>
<span id="LC2612" class="line" lang="java">        <span class="cm">/* AccessibleText ---------- */</span></span>
<span id="LC2613" class="line" lang="java"></span>
<span id="LC2614" class="line" lang="java">        <span class="kd">public</span> <span class="nc">AccessibleText</span> <span class="nf">getAccessibleText</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2615" class="line" lang="java">            <span class="nc">View</span> <span class="n">view</span> <span class="o">=</span> <span class="o">(</span><span class="nc">View</span><span class="o">)</span><span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getClientProperty</span><span class="o">(</span><span class="s">"html"</span><span class="o">);</span></span>
<span id="LC2616" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">view</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2617" class="line" lang="java">                <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC2618" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2619" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2620" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2621" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2622" class="line" lang="java"></span>
<span id="LC2623" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2624" class="line" lang="java"><span class="cm">         * Given a point in local coordinates, return the zero-based index</span></span>
<span id="LC2625" class="line" lang="java"><span class="cm">         * of the character under that Point.  If the point is invalid,</span></span>
<span id="LC2626" class="line" lang="java"><span class="cm">         * this method returns -1.</span></span>
<span id="LC2627" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2628" class="line" lang="java"><span class="cm">         * Note: the AbstractButton must have a valid size (e.g. have</span></span>
<span id="LC2629" class="line" lang="java"><span class="cm">         * been added to a parent container whose ancestor container</span></span>
<span id="LC2630" class="line" lang="java"><span class="cm">         * is a valid top-level window) for this method to be able</span></span>
<span id="LC2631" class="line" lang="java"><span class="cm">         * to return a meaningful value.</span></span>
<span id="LC2632" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2633" class="line" lang="java"><span class="cm">         * @param p the Point in local coordinates</span></span>
<span id="LC2634" class="line" lang="java"><span class="cm">         * @return the zero-based index of the character under Point p; if</span></span>
<span id="LC2635" class="line" lang="java"><span class="cm">         * Point is invalid returns -1.</span></span>
<span id="LC2636" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2637" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2638" class="line" lang="java">        <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getIndexAtPoint</span><span class="o">(</span><span class="nc">Point</span> <span class="n">p</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2639" class="line" lang="java">            <span class="nc">View</span> <span class="n">view</span> <span class="o">=</span> <span class="o">(</span><span class="nc">View</span><span class="o">)</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getClientProperty</span><span class="o">(</span><span class="s">"html"</span><span class="o">);</span></span>
<span id="LC2640" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">view</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2641" class="line" lang="java">                <span class="nc">Rectangle</span> <span class="n">r</span> <span class="o">=</span> <span class="n">getTextRectangle</span><span class="o">();</span></span>
<span id="LC2642" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">r</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2643" class="line" lang="java">                    <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2644" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2645" class="line" lang="java">                <span class="nc">Rectangle2D</span><span class="o">.</span><span class="na">Float</span> <span class="n">shape</span> <span class="o">=</span></span>
<span id="LC2646" class="line" lang="java">                    <span class="k">new</span> <span class="nc">Rectangle2D</span><span class="o">.</span><span class="na">Float</span><span class="o">(</span><span class="n">r</span><span class="o">.</span><span class="na">x</span><span class="o">,</span> <span class="n">r</span><span class="o">.</span><span class="na">y</span><span class="o">,</span> <span class="n">r</span><span class="o">.</span><span class="na">width</span><span class="o">,</span> <span class="n">r</span><span class="o">.</span><span class="na">height</span><span class="o">);</span></span>
<span id="LC2647" class="line" lang="java">                <span class="nc">Position</span><span class="o">.</span><span class="na">Bias</span> <span class="n">bias</span><span class="o">[]</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Position</span><span class="o">.</span><span class="na">Bias</span><span class="o">[</span><span class="mi">1</span><span class="o">];</span></span>
<span id="LC2648" class="line" lang="java">                <span class="k">return</span> <span class="n">view</span><span class="o">.</span><span class="na">viewToModel</span><span class="o">(</span><span class="n">p</span><span class="o">.</span><span class="na">x</span><span class="o">,</span> <span class="n">p</span><span class="o">.</span><span class="na">y</span><span class="o">,</span> <span class="n">shape</span><span class="o">,</span> <span class="n">bias</span><span class="o">);</span></span>
<span id="LC2649" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2650" class="line" lang="java">                <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2651" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2652" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2653" class="line" lang="java"></span>
<span id="LC2654" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2655" class="line" lang="java"><span class="cm">         * Determine the bounding box of the character at the given</span></span>
<span id="LC2656" class="line" lang="java"><span class="cm">         * index into the string.  The bounds are returned in local</span></span>
<span id="LC2657" class="line" lang="java"><span class="cm">         * coordinates.  If the index is invalid an empty rectangle is</span></span>
<span id="LC2658" class="line" lang="java"><span class="cm">         * returned.</span></span>
<span id="LC2659" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2660" class="line" lang="java"><span class="cm">         * Note: the AbstractButton must have a valid size (e.g. have</span></span>
<span id="LC2661" class="line" lang="java"><span class="cm">         * been added to a parent container whose ancestor container</span></span>
<span id="LC2662" class="line" lang="java"><span class="cm">         * is a valid top-level window) for this method to be able</span></span>
<span id="LC2663" class="line" lang="java"><span class="cm">         * to return a meaningful value.</span></span>
<span id="LC2664" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2665" class="line" lang="java"><span class="cm">         * @param i the index into the String</span></span>
<span id="LC2666" class="line" lang="java"><span class="cm">         * @return the screen coordinates of the character's the bounding box,</span></span>
<span id="LC2667" class="line" lang="java"><span class="cm">         * if index is invalid returns an empty rectangle.</span></span>
<span id="LC2668" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2669" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2670" class="line" lang="java">        <span class="kd">public</span> <span class="nc">Rectangle</span> <span class="nf">getCharacterBounds</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2671" class="line" lang="java">            <span class="nc">View</span> <span class="n">view</span> <span class="o">=</span> <span class="o">(</span><span class="nc">View</span><span class="o">)</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getClientProperty</span><span class="o">(</span><span class="s">"html"</span><span class="o">);</span></span>
<span id="LC2672" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">view</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2673" class="line" lang="java">                <span class="nc">Rectangle</span> <span class="n">r</span> <span class="o">=</span> <span class="n">getTextRectangle</span><span class="o">();</span></span>
<span id="LC2674" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">r</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2675" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2676" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2677" class="line" lang="java">                <span class="nc">Rectangle2D</span><span class="o">.</span><span class="na">Float</span> <span class="n">shape</span> <span class="o">=</span></span>
<span id="LC2678" class="line" lang="java">                    <span class="k">new</span> <span class="nc">Rectangle2D</span><span class="o">.</span><span class="na">Float</span><span class="o">(</span><span class="n">r</span><span class="o">.</span><span class="na">x</span><span class="o">,</span> <span class="n">r</span><span class="o">.</span><span class="na">y</span><span class="o">,</span> <span class="n">r</span><span class="o">.</span><span class="na">width</span><span class="o">,</span> <span class="n">r</span><span class="o">.</span><span class="na">height</span><span class="o">);</span></span>
<span id="LC2679" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2680" class="line" lang="java">                    <span class="nc">Shape</span> <span class="n">charShape</span> <span class="o">=</span></span>
<span id="LC2681" class="line" lang="java">                        <span class="n">view</span><span class="o">.</span><span class="na">modelToView</span><span class="o">(</span><span class="n">i</span><span class="o">,</span> <span class="n">shape</span><span class="o">,</span> <span class="nc">Position</span><span class="o">.</span><span class="na">Bias</span><span class="o">.</span><span class="na">Forward</span><span class="o">);</span></span>
<span id="LC2682" class="line" lang="java">                    <span class="k">return</span> <span class="n">charShape</span><span class="o">.</span><span class="na">getBounds</span><span class="o">();</span></span>
<span id="LC2683" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2684" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2685" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2686" class="line" lang="java">            <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC2687" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2688" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2689" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2690" class="line" lang="java"></span>
<span id="LC2691" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2692" class="line" lang="java"><span class="cm">         * Return the number of characters (valid indicies)</span></span>
<span id="LC2693" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2694" class="line" lang="java"><span class="cm">         * @return the number of characters</span></span>
<span id="LC2695" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2696" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2697" class="line" lang="java">        <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getCharCount</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2698" class="line" lang="java">            <span class="nc">View</span> <span class="n">view</span> <span class="o">=</span> <span class="o">(</span><span class="nc">View</span><span class="o">)</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getClientProperty</span><span class="o">(</span><span class="s">"html"</span><span class="o">);</span></span>
<span id="LC2699" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">view</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2700" class="line" lang="java">                <span class="nc">Document</span> <span class="n">d</span> <span class="o">=</span> <span class="n">view</span><span class="o">.</span><span class="na">getDocument</span><span class="o">();</span></span>
<span id="LC2701" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">d</span> <span class="k">instanceof</span> <span class="nc">StyledDocument</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2702" class="line" lang="java">                    <span class="nc">StyledDocument</span> <span class="n">doc</span> <span class="o">=</span> <span class="o">(</span><span class="nc">StyledDocument</span><span class="o">)</span><span class="n">d</span><span class="o">;</span></span>
<span id="LC2703" class="line" lang="java">                    <span class="k">return</span> <span class="n">doc</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span></span>
<span id="LC2704" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2705" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2706" class="line" lang="java">            <span class="k">return</span> <span class="n">accessibleContext</span><span class="o">.</span><span class="na">getAccessibleName</span><span class="o">().</span><span class="na">length</span><span class="o">();</span></span>
<span id="LC2707" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2708" class="line" lang="java"></span>
<span id="LC2709" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2710" class="line" lang="java"><span class="cm">         * Return the zero-based offset of the caret.</span></span>
<span id="LC2711" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2712" class="line" lang="java"><span class="cm">         * Note: That to the right of the caret will have the same index</span></span>
<span id="LC2713" class="line" lang="java"><span class="cm">         * value as the offset (the caret is between two characters).</span></span>
<span id="LC2714" class="line" lang="java"><span class="cm">         * @return the zero-based offset of the caret.</span></span>
<span id="LC2715" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2716" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2717" class="line" lang="java">        <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getCaretPosition</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2718" class="line" lang="java">            <span class="c1">// There is no caret.</span></span>
<span id="LC2719" class="line" lang="java">            <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2720" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2721" class="line" lang="java"></span>
<span id="LC2722" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2723" class="line" lang="java"><span class="cm">         * Returns the String at a given index.</span></span>
<span id="LC2724" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2725" class="line" lang="java"><span class="cm">         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,</span></span>
<span id="LC2726" class="line" lang="java"><span class="cm">         * or AccessibleText.SENTENCE to retrieve</span></span>
<span id="LC2727" class="line" lang="java"><span class="cm">         * @param index an index within the text &amp;gt;= 0</span></span>
<span id="LC2728" class="line" lang="java"><span class="cm">         * @return the letter, word, or sentence,</span></span>
<span id="LC2729" class="line" lang="java"><span class="cm">         *   null for an invalid index or part</span></span>
<span id="LC2730" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2731" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2732" class="line" lang="java">        <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getAtIndex</span><span class="o">(</span><span class="kt">int</span> <span class="n">part</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2733" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">&lt;</span> <span class="mi">0</span> <span class="o">||</span> <span class="n">index</span> <span class="o">&gt;=</span> <span class="n">getCharCount</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2734" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2735" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2736" class="line" lang="java">            <span class="k">switch</span> <span class="o">(</span><span class="n">part</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2737" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">CHARACTER</span><span class="o">:</span></span>
<span id="LC2738" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2739" class="line" lang="java">                    <span class="k">return</span> <span class="nf">getText</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="mi">1</span><span class="o">);</span></span>
<span id="LC2740" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2741" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2742" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2743" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">WORD</span><span class="o">:</span></span>
<span id="LC2744" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2745" class="line" lang="java">                    <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">getText</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">getCharCount</span><span class="o">());</span></span>
<span id="LC2746" class="line" lang="java">                    <span class="nc">BreakIterator</span> <span class="n">words</span> <span class="o">=</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">getWordInstance</span><span class="o">(</span><span class="n">getLocale</span><span class="o">());</span></span>
<span id="LC2747" class="line" lang="java">                    <span class="n">words</span><span class="o">.</span><span class="na">setText</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></span>
<span id="LC2748" class="line" lang="java">                    <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">words</span><span class="o">.</span><span class="na">following</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></span>
<span id="LC2749" class="line" lang="java">                    <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">words</span><span class="o">.</span><span class="na">previous</span><span class="o">(),</span> <span class="n">end</span><span class="o">);</span></span>
<span id="LC2750" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2751" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2752" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2753" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">SENTENCE</span><span class="o">:</span></span>
<span id="LC2754" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2755" class="line" lang="java">                    <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">getText</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">getCharCount</span><span class="o">());</span></span>
<span id="LC2756" class="line" lang="java">                    <span class="nc">BreakIterator</span> <span class="n">sentence</span> <span class="o">=</span></span>
<span id="LC2757" class="line" lang="java">                        <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">getSentenceInstance</span><span class="o">(</span><span class="n">getLocale</span><span class="o">());</span></span>
<span id="LC2758" class="line" lang="java">                    <span class="n">sentence</span><span class="o">.</span><span class="na">setText</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></span>
<span id="LC2759" class="line" lang="java">                    <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">sentence</span><span class="o">.</span><span class="na">following</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></span>
<span id="LC2760" class="line" lang="java">                    <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">sentence</span><span class="o">.</span><span class="na">previous</span><span class="o">(),</span> <span class="n">end</span><span class="o">);</span></span>
<span id="LC2761" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2762" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2763" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2764" class="line" lang="java">            <span class="k">default</span><span class="o">:</span></span>
<span id="LC2765" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2766" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2767" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2768" class="line" lang="java"></span>
<span id="LC2769" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2770" class="line" lang="java"><span class="cm">         * Returns the String after a given index.</span></span>
<span id="LC2771" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2772" class="line" lang="java"><span class="cm">         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,</span></span>
<span id="LC2773" class="line" lang="java"><span class="cm">         * or AccessibleText.SENTENCE to retrieve</span></span>
<span id="LC2774" class="line" lang="java"><span class="cm">         * @param index an index within the text &amp;gt;= 0</span></span>
<span id="LC2775" class="line" lang="java"><span class="cm">         * @return the letter, word, or sentence, null for an invalid</span></span>
<span id="LC2776" class="line" lang="java"><span class="cm">         *  index or part</span></span>
<span id="LC2777" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2778" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2779" class="line" lang="java">        <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getAfterIndex</span><span class="o">(</span><span class="kt">int</span> <span class="n">part</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2780" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">&lt;</span> <span class="mi">0</span> <span class="o">||</span> <span class="n">index</span> <span class="o">&gt;=</span> <span class="n">getCharCount</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2781" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2782" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2783" class="line" lang="java">            <span class="k">switch</span> <span class="o">(</span><span class="n">part</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2784" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">CHARACTER</span><span class="o">:</span></span>
<span id="LC2785" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">index</span><span class="o">+</span><span class="mi">1</span> <span class="o">&gt;=</span> <span class="n">getCharCount</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2786" class="line" lang="java">                   <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2787" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2788" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2789" class="line" lang="java">                    <span class="k">return</span> <span class="nf">getText</span><span class="o">(</span><span class="n">index</span><span class="o">+</span><span class="mi">1</span><span class="o">,</span> <span class="mi">1</span><span class="o">);</span></span>
<span id="LC2790" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2791" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2792" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2793" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">WORD</span><span class="o">:</span></span>
<span id="LC2794" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2795" class="line" lang="java">                    <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">getText</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">getCharCount</span><span class="o">());</span></span>
<span id="LC2796" class="line" lang="java">                    <span class="nc">BreakIterator</span> <span class="n">words</span> <span class="o">=</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">getWordInstance</span><span class="o">(</span><span class="n">getLocale</span><span class="o">());</span></span>
<span id="LC2797" class="line" lang="java">                    <span class="n">words</span><span class="o">.</span><span class="na">setText</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></span>
<span id="LC2798" class="line" lang="java">                    <span class="kt">int</span> <span class="n">start</span> <span class="o">=</span> <span class="n">words</span><span class="o">.</span><span class="na">following</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></span>
<span id="LC2799" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">start</span> <span class="o">==</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">DONE</span> <span class="o">||</span> <span class="n">start</span> <span class="o">&gt;=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2800" class="line" lang="java">                        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2801" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2802" class="line" lang="java">                    <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">words</span><span class="o">.</span><span class="na">following</span><span class="o">(</span><span class="n">start</span><span class="o">);</span></span>
<span id="LC2803" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">end</span> <span class="o">==</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">DONE</span> <span class="o">||</span> <span class="n">end</span> <span class="o">&gt;=</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2804" class="line" lang="java">                        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2805" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2806" class="line" lang="java">                    <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">end</span><span class="o">);</span></span>
<span id="LC2807" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2808" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2809" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2810" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">SENTENCE</span><span class="o">:</span></span>
<span id="LC2811" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2812" class="line" lang="java">                    <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">getText</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">getCharCount</span><span class="o">());</span></span>
<span id="LC2813" class="line" lang="java">                    <span class="nc">BreakIterator</span> <span class="n">sentence</span> <span class="o">=</span></span>
<span id="LC2814" class="line" lang="java">                        <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">getSentenceInstance</span><span class="o">(</span><span class="n">getLocale</span><span class="o">());</span></span>
<span id="LC2815" class="line" lang="java">                    <span class="n">sentence</span><span class="o">.</span><span class="na">setText</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></span>
<span id="LC2816" class="line" lang="java">                    <span class="kt">int</span> <span class="n">start</span> <span class="o">=</span> <span class="n">sentence</span><span class="o">.</span><span class="na">following</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></span>
<span id="LC2817" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">start</span> <span class="o">==</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">DONE</span> <span class="o">||</span> <span class="n">start</span> <span class="o">&gt;</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2818" class="line" lang="java">                        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2819" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2820" class="line" lang="java">                    <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">sentence</span><span class="o">.</span><span class="na">following</span><span class="o">(</span><span class="n">start</span><span class="o">);</span></span>
<span id="LC2821" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">end</span> <span class="o">==</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">DONE</span> <span class="o">||</span> <span class="n">end</span> <span class="o">&gt;</span> <span class="n">s</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC2822" class="line" lang="java">                        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2823" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2824" class="line" lang="java">                    <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">end</span><span class="o">);</span></span>
<span id="LC2825" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2826" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2827" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2828" class="line" lang="java">            <span class="k">default</span><span class="o">:</span></span>
<span id="LC2829" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2830" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2831" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2832" class="line" lang="java"></span>
<span id="LC2833" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2834" class="line" lang="java"><span class="cm">         * Returns the String before a given index.</span></span>
<span id="LC2835" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2836" class="line" lang="java"><span class="cm">         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,</span></span>
<span id="LC2837" class="line" lang="java"><span class="cm">         *   or AccessibleText.SENTENCE to retrieve</span></span>
<span id="LC2838" class="line" lang="java"><span class="cm">         * @param index an index within the text &amp;gt;= 0</span></span>
<span id="LC2839" class="line" lang="java"><span class="cm">         * @return the letter, word, or sentence, null for an invalid index</span></span>
<span id="LC2840" class="line" lang="java"><span class="cm">         *  or part</span></span>
<span id="LC2841" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2842" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2843" class="line" lang="java">        <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getBeforeIndex</span><span class="o">(</span><span class="kt">int</span> <span class="n">part</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2844" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">&lt;</span> <span class="mi">0</span> <span class="o">||</span> <span class="n">index</span> <span class="o">&gt;</span> <span class="n">getCharCount</span><span class="o">()-</span><span class="mi">1</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2845" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2846" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2847" class="line" lang="java">            <span class="k">switch</span> <span class="o">(</span><span class="n">part</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2848" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">CHARACTER</span><span class="o">:</span></span>
<span id="LC2849" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2850" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2851" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2852" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2853" class="line" lang="java">                    <span class="k">return</span> <span class="nf">getText</span><span class="o">(</span><span class="n">index</span><span class="o">-</span><span class="mi">1</span><span class="o">,</span> <span class="mi">1</span><span class="o">);</span></span>
<span id="LC2854" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2855" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2856" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2857" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">WORD</span><span class="o">:</span></span>
<span id="LC2858" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2859" class="line" lang="java">                    <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">getText</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">getCharCount</span><span class="o">());</span></span>
<span id="LC2860" class="line" lang="java">                    <span class="nc">BreakIterator</span> <span class="n">words</span> <span class="o">=</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">getWordInstance</span><span class="o">(</span><span class="n">getLocale</span><span class="o">());</span></span>
<span id="LC2861" class="line" lang="java">                    <span class="n">words</span><span class="o">.</span><span class="na">setText</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></span>
<span id="LC2862" class="line" lang="java">                    <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">words</span><span class="o">.</span><span class="na">following</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></span>
<span id="LC2863" class="line" lang="java">                    <span class="n">end</span> <span class="o">=</span> <span class="n">words</span><span class="o">.</span><span class="na">previous</span><span class="o">();</span></span>
<span id="LC2864" class="line" lang="java">                    <span class="kt">int</span> <span class="n">start</span> <span class="o">=</span> <span class="n">words</span><span class="o">.</span><span class="na">previous</span><span class="o">();</span></span>
<span id="LC2865" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">start</span> <span class="o">==</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">DONE</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2866" class="line" lang="java">                        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2867" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2868" class="line" lang="java">                    <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">end</span><span class="o">);</span></span>
<span id="LC2869" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2870" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2871" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2872" class="line" lang="java">            <span class="k">case</span> <span class="nc">AccessibleText</span><span class="o">.</span><span class="na">SENTENCE</span><span class="o">:</span></span>
<span id="LC2873" class="line" lang="java">                <span class="k">try</span> <span class="o">{</span></span>
<span id="LC2874" class="line" lang="java">                    <span class="nc">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">getText</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">getCharCount</span><span class="o">());</span></span>
<span id="LC2875" class="line" lang="java">                    <span class="nc">BreakIterator</span> <span class="n">sentence</span> <span class="o">=</span></span>
<span id="LC2876" class="line" lang="java">                        <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">getSentenceInstance</span><span class="o">(</span><span class="n">getLocale</span><span class="o">());</span></span>
<span id="LC2877" class="line" lang="java">                    <span class="n">sentence</span><span class="o">.</span><span class="na">setText</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></span>
<span id="LC2878" class="line" lang="java">                    <span class="kt">int</span> <span class="n">end</span> <span class="o">=</span> <span class="n">sentence</span><span class="o">.</span><span class="na">following</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></span>
<span id="LC2879" class="line" lang="java">                    <span class="n">end</span> <span class="o">=</span> <span class="n">sentence</span><span class="o">.</span><span class="na">previous</span><span class="o">();</span></span>
<span id="LC2880" class="line" lang="java">                    <span class="kt">int</span> <span class="n">start</span> <span class="o">=</span> <span class="n">sentence</span><span class="o">.</span><span class="na">previous</span><span class="o">();</span></span>
<span id="LC2881" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">start</span> <span class="o">==</span> <span class="nc">BreakIterator</span><span class="o">.</span><span class="na">DONE</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2882" class="line" lang="java">                        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2883" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2884" class="line" lang="java">                    <span class="k">return</span> <span class="n">s</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">start</span><span class="o">,</span> <span class="n">end</span><span class="o">);</span></span>
<span id="LC2885" class="line" lang="java">                <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">BadLocationException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2886" class="line" lang="java">                    <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2887" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2888" class="line" lang="java">            <span class="k">default</span><span class="o">:</span></span>
<span id="LC2889" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2890" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2891" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2892" class="line" lang="java"></span>
<span id="LC2893" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2894" class="line" lang="java"><span class="cm">         * Return the AttributeSet for a given character at a given index</span></span>
<span id="LC2895" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2896" class="line" lang="java"><span class="cm">         * @param i the zero-based index into the text</span></span>
<span id="LC2897" class="line" lang="java"><span class="cm">         * @return the AttributeSet of the character</span></span>
<span id="LC2898" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2899" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2900" class="line" lang="java">        <span class="kd">public</span> <span class="nc">AttributeSet</span> <span class="nf">getCharacterAttribute</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2901" class="line" lang="java">            <span class="nc">View</span> <span class="n">view</span> <span class="o">=</span> <span class="o">(</span><span class="nc">View</span><span class="o">)</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getClientProperty</span><span class="o">(</span><span class="s">"html"</span><span class="o">);</span></span>
<span id="LC2902" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">view</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2903" class="line" lang="java">                <span class="nc">Document</span> <span class="n">d</span> <span class="o">=</span> <span class="n">view</span><span class="o">.</span><span class="na">getDocument</span><span class="o">();</span></span>
<span id="LC2904" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">d</span> <span class="k">instanceof</span> <span class="nc">StyledDocument</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2905" class="line" lang="java">                    <span class="nc">StyledDocument</span> <span class="n">doc</span> <span class="o">=</span> <span class="o">(</span><span class="nc">StyledDocument</span><span class="o">)</span><span class="n">d</span><span class="o">;</span></span>
<span id="LC2906" class="line" lang="java">                    <span class="nc">Element</span> <span class="n">elem</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getCharacterElement</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC2907" class="line" lang="java">                    <span class="k">if</span> <span class="o">(</span><span class="n">elem</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2908" class="line" lang="java">                        <span class="k">return</span> <span class="n">elem</span><span class="o">.</span><span class="na">getAttributes</span><span class="o">();</span></span>
<span id="LC2909" class="line" lang="java">                    <span class="o">}</span></span>
<span id="LC2910" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2911" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2912" class="line" lang="java">            <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2913" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2914" class="line" lang="java"></span>
<span id="LC2915" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2916" class="line" lang="java"><span class="cm">         * Returns the start offset within the selected text.</span></span>
<span id="LC2917" class="line" lang="java"><span class="cm">         * If there is no selection, but there is</span></span>
<span id="LC2918" class="line" lang="java"><span class="cm">         * a caret, the start and end offsets will be the same.</span></span>
<span id="LC2919" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2920" class="line" lang="java"><span class="cm">         * @return the index into the text of the start of the selection</span></span>
<span id="LC2921" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2922" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2923" class="line" lang="java">        <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getSelectionStart</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2924" class="line" lang="java">            <span class="c1">// Text cannot be selected.</span></span>
<span id="LC2925" class="line" lang="java">            <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2926" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2927" class="line" lang="java"></span>
<span id="LC2928" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2929" class="line" lang="java"><span class="cm">         * Returns the end offset within the selected text.</span></span>
<span id="LC2930" class="line" lang="java"><span class="cm">         * If there is no selection, but there is</span></span>
<span id="LC2931" class="line" lang="java"><span class="cm">         * a caret, the start and end offsets will be the same.</span></span>
<span id="LC2932" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2933" class="line" lang="java"><span class="cm">         * @return the index into the text of the end of the selection</span></span>
<span id="LC2934" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2935" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2936" class="line" lang="java">        <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getSelectionEnd</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2937" class="line" lang="java">            <span class="c1">// Text cannot be selected.</span></span>
<span id="LC2938" class="line" lang="java">            <span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></span>
<span id="LC2939" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2940" class="line" lang="java"></span>
<span id="LC2941" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC2942" class="line" lang="java"><span class="cm">         * Returns the portion of the text that is selected.</span></span>
<span id="LC2943" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC2944" class="line" lang="java"><span class="cm">         * @return the String portion of the text that is selected</span></span>
<span id="LC2945" class="line" lang="java"><span class="cm">         * @since 1.3</span></span>
<span id="LC2946" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2947" class="line" lang="java">        <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getSelectedText</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2948" class="line" lang="java">            <span class="c1">// Text cannot be selected.</span></span>
<span id="LC2949" class="line" lang="java">            <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2950" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2951" class="line" lang="java"></span>
<span id="LC2952" class="line" lang="java">        <span class="cm">/*</span></span>
<span id="LC2953" class="line" lang="java"><span class="cm">         * Returns the text substring starting at the specified</span></span>
<span id="LC2954" class="line" lang="java"><span class="cm">         * offset with the specified length.</span></span>
<span id="LC2955" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2956" class="line" lang="java">        <span class="kd">private</span> <span class="nc">String</span> <span class="nf">getText</span><span class="o">(</span><span class="kt">int</span> <span class="n">offset</span><span class="o">,</span> <span class="kt">int</span> <span class="n">length</span><span class="o">)</span></span>
<span id="LC2957" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">BadLocationException</span> <span class="o">{</span></span>
<span id="LC2958" class="line" lang="java"></span>
<span id="LC2959" class="line" lang="java">            <span class="nc">View</span> <span class="n">view</span> <span class="o">=</span> <span class="o">(</span><span class="nc">View</span><span class="o">)</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getClientProperty</span><span class="o">(</span><span class="s">"html"</span><span class="o">);</span></span>
<span id="LC2960" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">view</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2961" class="line" lang="java">                <span class="nc">Document</span> <span class="n">d</span> <span class="o">=</span> <span class="n">view</span><span class="o">.</span><span class="na">getDocument</span><span class="o">();</span></span>
<span id="LC2962" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">d</span> <span class="k">instanceof</span> <span class="nc">StyledDocument</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC2963" class="line" lang="java">                    <span class="nc">StyledDocument</span> <span class="n">doc</span> <span class="o">=</span> <span class="o">(</span><span class="nc">StyledDocument</span><span class="o">)</span><span class="n">d</span><span class="o">;</span></span>
<span id="LC2964" class="line" lang="java">                    <span class="k">return</span> <span class="n">doc</span><span class="o">.</span><span class="na">getText</span><span class="o">(</span><span class="n">offset</span><span class="o">,</span> <span class="n">length</span><span class="o">);</span></span>
<span id="LC2965" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC2966" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2967" class="line" lang="java">            <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2968" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC2969" class="line" lang="java"></span>
<span id="LC2970" class="line" lang="java">        <span class="cm">/*</span></span>
<span id="LC2971" class="line" lang="java"><span class="cm">         * Returns the bounding rectangle for the component text.</span></span>
<span id="LC2972" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC2973" class="line" lang="java">        <span class="kd">private</span> <span class="nc">Rectangle</span> <span class="nf">getTextRectangle</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC2974" class="line" lang="java"></span>
<span id="LC2975" class="line" lang="java">            <span class="nc">String</span> <span class="n">text</span> <span class="o">=</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getText</span><span class="o">();</span></span>
<span id="LC2976" class="line" lang="java">            <span class="nc">Icon</span> <span class="n">icon</span> <span class="o">=</span> <span class="o">(</span><span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">isEnabled</span><span class="o">())</span> <span class="o">?</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getIcon</span><span class="o">()</span> <span class="o">:</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getDisabledIcon</span><span class="o">();</span></span>
<span id="LC2977" class="line" lang="java"></span>
<span id="LC2978" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">icon</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">text</span> <span class="o">==</span> <span class="kc">null</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC2979" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC2980" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC2981" class="line" lang="java"></span>
<span id="LC2982" class="line" lang="java">            <span class="nc">Rectangle</span> <span class="n">paintIconR</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Rectangle</span><span class="o">();</span></span>
<span id="LC2983" class="line" lang="java">            <span class="nc">Rectangle</span> <span class="n">paintTextR</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Rectangle</span><span class="o">();</span></span>
<span id="LC2984" class="line" lang="java">            <span class="nc">Rectangle</span> <span class="n">paintViewR</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Rectangle</span><span class="o">();</span></span>
<span id="LC2985" class="line" lang="java">            <span class="nc">Insets</span> <span class="n">paintViewInsets</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Insets</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></span>
<span id="LC2986" class="line" lang="java"></span>
<span id="LC2987" class="line" lang="java">            <span class="n">paintViewInsets</span> <span class="o">=</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getInsets</span><span class="o">(</span><span class="n">paintViewInsets</span><span class="o">);</span></span>
<span id="LC2988" class="line" lang="java">            <span class="n">paintViewR</span><span class="o">.</span><span class="na">x</span> <span class="o">=</span> <span class="n">paintViewInsets</span><span class="o">.</span><span class="na">left</span><span class="o">;</span></span>
<span id="LC2989" class="line" lang="java">            <span class="n">paintViewR</span><span class="o">.</span><span class="na">y</span> <span class="o">=</span> <span class="n">paintViewInsets</span><span class="o">.</span><span class="na">top</span><span class="o">;</span></span>
<span id="LC2990" class="line" lang="java">            <span class="n">paintViewR</span><span class="o">.</span><span class="na">width</span> <span class="o">=</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getWidth</span><span class="o">()</span> <span class="o">-</span> <span class="o">(</span><span class="n">paintViewInsets</span><span class="o">.</span><span class="na">left</span> <span class="o">+</span> <span class="n">paintViewInsets</span><span class="o">.</span><span class="na">right</span><span class="o">);</span></span>
<span id="LC2991" class="line" lang="java">            <span class="n">paintViewR</span><span class="o">.</span><span class="na">height</span> <span class="o">=</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getHeight</span><span class="o">()</span> <span class="o">-</span> <span class="o">(</span><span class="n">paintViewInsets</span><span class="o">.</span><span class="na">top</span> <span class="o">+</span> <span class="n">paintViewInsets</span><span class="o">.</span><span class="na">bottom</span><span class="o">);</span></span>
<span id="LC2992" class="line" lang="java"></span>
<span id="LC2993" class="line" lang="java">            <span class="nc">String</span> <span class="n">clippedText</span> <span class="o">=</span> <span class="nc">SwingUtilities</span><span class="o">.</span><span class="na">layoutCompoundLabel</span><span class="o">(</span></span>
<span id="LC2994" class="line" lang="java">                <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">,</span></span>
<span id="LC2995" class="line" lang="java">                <span class="n">getFontMetrics</span><span class="o">(</span><span class="n">getFont</span><span class="o">()),</span></span>
<span id="LC2996" class="line" lang="java">                <span class="n">text</span><span class="o">,</span></span>
<span id="LC2997" class="line" lang="java">                <span class="n">icon</span><span class="o">,</span></span>
<span id="LC2998" class="line" lang="java">                <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getVerticalAlignment</span><span class="o">(),</span></span>
<span id="LC2999" class="line" lang="java">                <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getHorizontalAlignment</span><span class="o">(),</span></span>
<span id="LC3000" class="line" lang="java">                <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getVerticalTextPosition</span><span class="o">(),</span></span>
<span id="LC3001" class="line" lang="java">                <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getHorizontalTextPosition</span><span class="o">(),</span></span>
<span id="LC3002" class="line" lang="java">                <span class="n">paintViewR</span><span class="o">,</span></span>
<span id="LC3003" class="line" lang="java">                <span class="n">paintIconR</span><span class="o">,</span></span>
<span id="LC3004" class="line" lang="java">                <span class="n">paintTextR</span><span class="o">,</span></span>
<span id="LC3005" class="line" lang="java">                <span class="mi">0</span><span class="o">);</span></span>
<span id="LC3006" class="line" lang="java"></span>
<span id="LC3007" class="line" lang="java">            <span class="k">return</span> <span class="n">paintTextR</span><span class="o">;</span></span>
<span id="LC3008" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3009" class="line" lang="java"></span>
<span id="LC3010" class="line" lang="java">        <span class="c1">// ----- AccessibleExtendedComponent</span></span>
<span id="LC3011" class="line" lang="java"></span>
<span id="LC3012" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC3013" class="line" lang="java"><span class="cm">         * Returns the AccessibleExtendedComponent</span></span>
<span id="LC3014" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC3015" class="line" lang="java"><span class="cm">         * @return the AccessibleExtendedComponent</span></span>
<span id="LC3016" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC3017" class="line" lang="java">        <span class="nc">AccessibleExtendedComponent</span> <span class="nf">getAccessibleExtendedComponent</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC3018" class="line" lang="java">            <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC3019" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3020" class="line" lang="java"></span>
<span id="LC3021" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC3022" class="line" lang="java"><span class="cm">         * Returns the tool tip text</span></span>
<span id="LC3023" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC3024" class="line" lang="java"><span class="cm">         * @return the tool tip text, if supported, of the object;</span></span>
<span id="LC3025" class="line" lang="java"><span class="cm">         * otherwise, null</span></span>
<span id="LC3026" class="line" lang="java"><span class="cm">         * @since 1.4</span></span>
<span id="LC3027" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC3028" class="line" lang="java">        <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getToolTipText</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC3029" class="line" lang="java">            <span class="k">return</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getToolTipText</span><span class="o">();</span></span>
<span id="LC3030" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3031" class="line" lang="java"></span>
<span id="LC3032" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC3033" class="line" lang="java"><span class="cm">         * Returns the titled border text</span></span>
<span id="LC3034" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC3035" class="line" lang="java"><span class="cm">         * @return the titled border text, if supported, of the object;</span></span>
<span id="LC3036" class="line" lang="java"><span class="cm">         * otherwise, null</span></span>
<span id="LC3037" class="line" lang="java"><span class="cm">         * @since 1.4</span></span>
<span id="LC3038" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC3039" class="line" lang="java">        <span class="kd">public</span> <span class="nc">String</span> <span class="nf">getTitledBorderText</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC3040" class="line" lang="java">            <span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">getTitledBorderText</span><span class="o">();</span></span>
<span id="LC3041" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3042" class="line" lang="java"></span>
<span id="LC3043" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC3044" class="line" lang="java"><span class="cm">         * Returns key bindings associated with this object</span></span>
<span id="LC3045" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC3046" class="line" lang="java"><span class="cm">         * @return the key bindings, if supported, of the object;</span></span>
<span id="LC3047" class="line" lang="java"><span class="cm">         * otherwise, null</span></span>
<span id="LC3048" class="line" lang="java"><span class="cm">         * @see AccessibleKeyBinding</span></span>
<span id="LC3049" class="line" lang="java"><span class="cm">         * @since 1.4</span></span>
<span id="LC3050" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC3051" class="line" lang="java">        <span class="kd">public</span> <span class="nc">AccessibleKeyBinding</span> <span class="nf">getAccessibleKeyBinding</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC3052" class="line" lang="java">            <span class="kt">int</span> <span class="n">mnemonic</span> <span class="o">=</span> <span class="nc">AbstractButton</span><span class="o">.</span><span class="na">this</span><span class="o">.</span><span class="na">getMnemonic</span><span class="o">();</span></span>
<span id="LC3053" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">mnemonic</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3054" class="line" lang="java">                <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC3055" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3056" class="line" lang="java">            <span class="k">return</span> <span class="k">new</span> <span class="nf">ButtonKeyBinding</span><span class="o">(</span><span class="n">mnemonic</span><span class="o">);</span></span>
<span id="LC3057" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3058" class="line" lang="java"></span>
<span id="LC3059" class="line" lang="java">        <span class="kd">class</span> <span class="nc">ButtonKeyBinding</span> <span class="kd">implements</span> <span class="nc">AccessibleKeyBinding</span> <span class="o">{</span></span>
<span id="LC3060" class="line" lang="java">            <span class="kt">int</span> <span class="n">mnemonic</span><span class="o">;</span></span>
<span id="LC3061" class="line" lang="java"></span>
<span id="LC3062" class="line" lang="java">            <span class="nc">ButtonKeyBinding</span><span class="o">(</span><span class="kt">int</span> <span class="n">mnemonic</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3063" class="line" lang="java">                <span class="k">this</span><span class="o">.</span><span class="na">mnemonic</span> <span class="o">=</span> <span class="n">mnemonic</span><span class="o">;</span></span>
<span id="LC3064" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3065" class="line" lang="java"></span>
<span id="LC3066" class="line" lang="java">            <span class="cm">/**</span></span>
<span id="LC3067" class="line" lang="java"><span class="cm">             * Returns the number of key bindings for this object</span></span>
<span id="LC3068" class="line" lang="java"><span class="cm">             *</span></span>
<span id="LC3069" class="line" lang="java"><span class="cm">             * @return the zero-based number of key bindings for this object</span></span>
<span id="LC3070" class="line" lang="java"><span class="cm">             */</span></span>
<span id="LC3071" class="line" lang="java">            <span class="kd">public</span> <span class="kt">int</span> <span class="nf">getAccessibleKeyBindingCount</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC3072" class="line" lang="java">                <span class="k">return</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC3073" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3074" class="line" lang="java"></span>
<span id="LC3075" class="line" lang="java">            <span class="cm">/**</span></span>
<span id="LC3076" class="line" lang="java"><span class="cm">             * Returns a key binding for this object.  The value returned is an</span></span>
<span id="LC3077" class="line" lang="java"><span class="cm">             * java.lang.Object which must be cast to appropriate type depending</span></span>
<span id="LC3078" class="line" lang="java"><span class="cm">             * on the underlying implementation of the key.  For example, if the</span></span>
<span id="LC3079" class="line" lang="java"><span class="cm">             * Object returned is a javax.swing.KeyStroke, the user of this</span></span>
<span id="LC3080" class="line" lang="java"><span class="cm">             * method should do the following:</span></span>
<span id="LC3081" class="line" lang="java"><span class="cm">             * &lt;nf&gt;&lt;code&gt;</span></span>
<span id="LC3082" class="line" lang="java"><span class="cm">             * Component c = &lt;get the component that has the key bindings&gt;</span></span>
<span id="LC3083" class="line" lang="java"><span class="cm">             * AccessibleContext ac = c.getAccessibleContext();</span></span>
<span id="LC3084" class="line" lang="java"><span class="cm">             * AccessibleKeyBinding akb = ac.getAccessibleKeyBinding();</span></span>
<span id="LC3085" class="line" lang="java"><span class="cm">             * for (int i = 0; i &lt; akb.getAccessibleKeyBindingCount(); i++) {</span></span>
<span id="LC3086" class="line" lang="java"><span class="cm">             *     Object o = akb.getAccessibleKeyBinding(i);</span></span>
<span id="LC3087" class="line" lang="java"><span class="cm">             *     if (o instanceof javax.swing.KeyStroke) {</span></span>
<span id="LC3088" class="line" lang="java"><span class="cm">             *         javax.swing.KeyStroke keyStroke = (javax.swing.KeyStroke)o;</span></span>
<span id="LC3089" class="line" lang="java"><span class="cm">             *         &lt;do something with the key binding&gt;</span></span>
<span id="LC3090" class="line" lang="java"><span class="cm">             *     }</span></span>
<span id="LC3091" class="line" lang="java"><span class="cm">             * }</span></span>
<span id="LC3092" class="line" lang="java"><span class="cm">             * &lt;/code&gt;&lt;/nf&gt;</span></span>
<span id="LC3093" class="line" lang="java"><span class="cm">             *</span></span>
<span id="LC3094" class="line" lang="java"><span class="cm">             * @param i zero-based index of the key bindings</span></span>
<span id="LC3095" class="line" lang="java"><span class="cm">             * @return a javax.lang.Object which specifies the key binding</span></span>
<span id="LC3096" class="line" lang="java"><span class="cm">             * @exception IllegalArgumentException if the index is</span></span>
<span id="LC3097" class="line" lang="java"><span class="cm">             * out of bounds</span></span>
<span id="LC3098" class="line" lang="java"><span class="cm">             * @see #getAccessibleKeyBindingCount</span></span>
<span id="LC3099" class="line" lang="java"><span class="cm">             */</span></span>
<span id="LC3100" class="line" lang="java">            <span class="kd">public</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Object</span> <span class="nf">getAccessibleKeyBinding</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3101" class="line" lang="java">                <span class="k">if</span> <span class="o">(</span><span class="n">i</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC3102" class="line" lang="java">                    <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">();</span></span>
<span id="LC3103" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC3104" class="line" lang="java">                <span class="k">return</span> <span class="nc">KeyStroke</span><span class="o">.</span><span class="na">getKeyStroke</span><span class="o">(</span><span class="n">mnemonic</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></span>
<span id="LC3105" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC3106" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC3107" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC3108" class="line" lang="java"><span class="o">}</span></span>
